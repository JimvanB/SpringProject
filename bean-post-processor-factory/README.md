# bean post processor factory

-The way to create your own factory:
For the factory you need a class that implements the BeanFactoryPostProcessor and you need to link it in your spring.xml
```
<bean class="FactoryPP" />
```

After a factory is created the method in the class which implements the BeanFactoryPostProccesor is run ONCE before the init of the beans in the spring.xml 


-The way to use a standard FactoryPostProcessor for example PropertyPlaceHolderValuePostProcessor:

define in your spring.xml:

```
 <bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
        <property name="locations" value="pointconfig.properties" />
    </bean>
```
You can use the FPP for the initialization of for example values in a property file. What you do then is replace the value argument of a bean with:

```
 <property name="x" value="${pointA.pointX}" />
```

in which ${} is the default statement for placeholder values.

In your .properties file you then define for example:
```
pointA.pointX=0
```

note no ;  in property file