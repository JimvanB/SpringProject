# autowired
Instead of required, you can also use @Autowired. This will inject a dependancy by Type. You can do this as follows


``` 
 @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }
```  
This tells spring to autowire this bean property
Like the required annotation one additional criteria needs to be met. You need to use a postprocessor to checkk this. The processor checks the @autowired annotations.
You will need to add the following to your spring.xml

``` 
<bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor" />
```  
 
This one checks the required annotations BY TYPE.

If you have multiple beans of the same type then it will not compile.

HOWEVER.

If one of the beans matches BY NAME it also works, why?
Autowired checks first for:
-type THEN
-name 

If you cant use/change te name of bean...you can use the @Qualifier("bean__id")
 
 make you include:
```  
 <beans xmlns="http://www.springframework.org/schema/beans"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xmlns:context="http://www.springframework.org/schema/context"
     xsi:schemaLocation="http://www.springframework.org/schema/beans
     http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
     http://www.springframework.org/schema/context
     http://www.springframework.org/schema/context/spring-context-3.0.xsd">
 
    <context:annotation-config/>
``` 

in your spring.xml file.

instead of using the bean_id in the Qualifier parameter, you can also specify a qualifier in a bean:
``` 
 <bean id="pointA" class="Point">
        <qualifier value="jemoeder" />
        <property name="x" value="1"/>
        <property name="y" value="0"/>
    </bean>
``` 
and then refer to the set value of the qualifier.

Lastly,

instead of providing a different post-processor for the required and autowired annotations you can use:

``` 
  <context:annotation-config/>
``` 

which handles it for you.