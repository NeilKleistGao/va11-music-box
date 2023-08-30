package org.neilkleist.va11

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
@Preview
fun displayMusicBox() {
  var showStatus = remember { mutableStateOf(MusicBoxStatus.SELECTING) }

  MaterialTheme {
    Column {
      Row {
        when (showStatus.value) {
          MusicBoxStatus.SELECTING -> {
            Text("Selecting music...")
          }
          MusicBoxStatus.PLAYING -> {
            Text("Playing music...")
          }
        }
      }

      displayControlPanel()
    }
  }
}

/**
 * Show the setting box and the text.
 */
@Composable
private fun displayControlPanel() {
  Row {
    Text("Random Text")
    Text("Control Panel")
  }
}
