package org.neilkleist.va11

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * Show the setting box and the text.
 */
@Composable
fun displayControlPanel() {
  Row {
    Text("Random Text")
    Text("Control Panel")
  }
}
