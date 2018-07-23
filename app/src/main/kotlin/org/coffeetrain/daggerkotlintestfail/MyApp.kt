package org.coffeetrain.daggerkotlintestfail

import android.app.Application
import javax.inject.Inject

open class MyApp : Application() {
  companion object {
    lateinit var component: MyComponent
  }

  @Inject lateinit var foo: Foo

  override fun onCreate() {
    super.onCreate()

    component = createComponent()
    component.inject(this)
    println(foo.identifyYourself())
    val bar = Bar()
    println(bar.foo.identifyYourself())
  }

  open fun createComponent(): MyComponent {
    return DaggerMyComponent.builder()
        .myModule(MyModule())
        .build()
  }

  inner class Bar {
    @Inject lateinit var foo: Foo

    init {
      MyApp.component.inject(this)
    }
  }
}
