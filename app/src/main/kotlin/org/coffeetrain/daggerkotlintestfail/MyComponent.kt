package org.coffeetrain.daggerkotlintestfail

import dagger.Component
import org.coffeetrain.daggerkotlintestfail.MainActivity.Taco
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyComponent {
  fun inject(myApp: MyApp)
  fun inject(myAppBar: MyApp.Bar)
  fun inject(taco: Taco)
}
