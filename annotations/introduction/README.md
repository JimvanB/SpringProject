# intro annotations
-A way to check if all the required variables of a bean have been initialized is by using the @Required annotation. You need to set this above the setVar() method.
e.g.

``` 
 @Required
    public void setCenter(Point center) {
        this.center = center;
    }
```  
This tells spring to check if a bean property is provided for that variable. 
One additional criteria needs to be met. You need to use a postprocessor to checkk this. The processor checks the @required annotations.
You will need to add the following to your spring.xml

``` 
<bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor" />
```  
 
This one checks the required annotations.

