package org.neilkleist.va11

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import org.neilkleist.va11.*;

@Composable
@Preview
fun displayMusicBox() {
  val showStatus = remember { mutableStateOf(MusicBoxStatus.SELECTING) }

  MaterialTheme {
    Column {
      Row {
        when (showStatus.value) {
          MusicBoxStatus.SELECTING -> {
            showStatus.value = displaySelectingPanel()
          }
          MusicBoxStatus.PLAYING -> {
            showStatus.value = displaPlayingPanel()
          }
        }
      }

      displayControlPanel()
    }
  }
}
