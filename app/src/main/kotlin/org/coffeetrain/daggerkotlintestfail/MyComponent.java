package org.coffeetrain.daggerkotlintestfail;

import dagger.Component;
import javax.inject.Singleton;
import org.coffeetrain.daggerkotlintestfail.MainActivity.Taco;

@Singleton
@Component(modules = { MyModule.class })
public interface MyComponent {
  void inject(MyApp myApp);

  void inject(MyApp.Bar bar);

  void inject(Taco taco);
}
