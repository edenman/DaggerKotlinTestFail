package org.coffeetrain.daggerkotlintestfail

import android.app.Activity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  inner class Taco {
    @Inject lateinit var foo: Foo

    init {
      MyApp.component.inject(this)
    }
  }
}
