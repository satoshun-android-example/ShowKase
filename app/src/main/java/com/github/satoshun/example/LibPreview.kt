package com.github.satoshun.example

import android.view.LayoutInflater
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.airbnb.android.showkase.annotation.ShowkaseRoot
import com.airbnb.android.showkase.annotation.ShowkaseRootModule

@ShowkaseRoot
class MyRootModule: ShowkaseRootModule

@Preview(name = "R.layout.main_frag")
@Composable
fun PreviewSample() {
  AndroidView(
    modifier = Modifier.fillMaxSize(),
    factory = { context ->
      LayoutInflater
        .from(context)
        .inflate(R.layout.main_frag, null, false)
    }
  )
}
