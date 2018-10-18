package org.coffeetrain.daggerkotlintestfail

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
@Config(application = MyTestApp::class)
class ExampleUnitTest {
  @Inject lateinit var foo: Foo

  @Before
  fun setUp() {
    MyTestApp.component.inject(this)
  }

  @Test
  fun addition_isCorrect() {
    assertThat(foo.identifyYourself()).isEqualTo("I'M A TEST")
  }
}
