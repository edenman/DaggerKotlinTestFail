package org.coffeetrain.daggerkotlintestfail

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyModule {
  @Provides
  @Singleton
  fun provideFoo(): Foo {
    return Foo()
  }
}
