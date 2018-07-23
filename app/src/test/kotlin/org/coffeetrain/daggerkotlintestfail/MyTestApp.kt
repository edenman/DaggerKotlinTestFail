package org.coffeetrain.daggerkotlintestfail

class MyTestApp : MyApp() {
  companion object {
    lateinit var component: MyTestComponent
  }

  override fun createComponent(): MyComponent {
    component = DaggerMyTestComponent.builder()
        .myTestModule(MyTestModule())
        .build()
    return component
  }
}
