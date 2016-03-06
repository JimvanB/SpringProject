# inner-beans
in this project inner-beans are used. In comparision with the beans project where each point bean is defined seperatly, here we use inner-beans for
the beans that have no need to be refereced from anywhere else. An inner bean does not need a 'ref' value because it does not reference to an other bean
it is defined directly below. e.g.
```
<bean id="triangle" class="Triangle">
<property name="pointB">
            <bean class="Point">
                <property name="x" value="-20"/>
                <property name="y" value="0"/>
            </bean>
</property>
</bean>
```

instead of:

```
<bean id="triangle" class="Triangle">
  <property name="pointA" ref="pointZero"/>
</bean>

  
<bean id="pointZero" class="Point">
    <property name="x" value="0"/>
    <property name="y" value="0"/>
</bean>
```

this makes use of a reference bean. Therefore the bean also needs an id value in order to be referenced. Inner-beans do not need that.

//ALIAS
```
<alias name="triangle" alias ="triangle-alias />
```
refers to the triangle bean. It can be used to refer to the bean and in the getBean method. Good practice is however to use id's. If you want to use another
name...use alias. You can also define an alias in the bean itself

```
<bean id="triangle" class="Triangle" alias="triangle-alias">
```
//IDREF
```
<property>
 <idref="zeroPoint" />
 </property
```

is a method to ensure that there need to be a hard id for a bean named zeroPoint