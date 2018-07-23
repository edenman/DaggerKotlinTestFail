package org.coffeetrain.daggerkotlintestfail

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyTestModule {
  @Provides
  @Singleton
  fun provideTestFoo(): Foo {
    return object : Foo() {
      override fun identifyYourself(): String {
        return "I'M A TEST"
      }
    }
  }
}
