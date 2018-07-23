package org.coffeetrain.daggerkotlintestfail

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MyTestModule::class])
interface MyTestComponent : MyComponent {
  fun inject(myApp: ExampleUnitTest)

}
