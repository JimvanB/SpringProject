# lifecycle

for not webapps, so desktop apps the context needs to know when to shut down. This can be done with making the application context abstract and registering a shutdown hook. 

```
  AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  context.registerShutdownHook();
```

then the app knows when the main ends it needs to shut down.

if a method of a bean needs to be run..or vars set on initialization of the bean..you can let your class implement InitializingBean which is called when the Bean props have been set.

Likewise methods that need to be called on the destruction of the bean --> implement DisposableBean
 
If you do not want Spring implements in your object you can also configure the inits and destroy in the spring.xml:


```
<bean id="triangle" class="Triangle" autowire="byName" init-method="myInit" destroy-method="myDestroy" />
```

if all your classes have the same destroy and inits...you can also specify this at a global level:
```
<beans default-init-method="myInit" default-destroy-method="myDestroy">
```

for both counts that if they do not have the methods, they are not called.
Additionally, you can also configure the autowire/merge on beans level.