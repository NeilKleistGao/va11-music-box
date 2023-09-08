package org.neilkleist.va11

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun displayPlayingPanel(): MusicBoxStatus {
  Text("Playing music...")
  return MusicBoxStatus.PLAYING
}
