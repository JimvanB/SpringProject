# bean post processor
-the post processor runs after initilization of every created bean.
-the post processor is a seperate class

The difference with the init and destroy methods is that the methods need to be in the class of the beans. The post-processor
is a way to run for every class.

The way to do is create a separate class that implements BeanPostProcessor. Then implement before and after init method.

in your spring.xml:
```
<bean class="PostProcessor" />
```

not that no id or things like that are provided. You just want the bean to be there. Let spring know that there is a postproccesor.

The PostProcessor runs BEFORE all the other inits and before methods.

There is no equivalent for the destroying of objects.