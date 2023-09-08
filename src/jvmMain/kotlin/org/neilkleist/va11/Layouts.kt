package org.neilkleist.va11

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier;

@Composable
fun displayMainPanel(content: @Composable () -> Unit) {
  Layout(
    modifier = Modifier.padding(top = 28.dp, start = 20.dp, end = 20.dp),
    content = content
  ) {measurables, constraints ->
    val placeables = measurables.map { measurable ->
      measurable.measure(constraints)
    }

    layout(constraints.maxWidth, (constraints.maxHeight * 0.8f).toInt()) {
      placeables.fold(0) {yPosition, placeable ->
        placeable.placeRelative(x = 0, y = yPosition)
        yPosition + placeable.height
      }
    }
  }
}
