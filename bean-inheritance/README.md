# inheritance
beans can inherit from a parent-bean which can on itself by initiated or not...use:
```
<bean id="parentPointList" class="Triangle" abstract="true">
```

to initiate it as abstract or not.

an example of a parent bean is as follows:

```
    <bean id="parent_triangle" class="Triangle">
        <property name="pointA" ref="pointA" />
    </bean>
```

in which property point a has been set. In a child bean the rest can be set:
```
 <bean id="triangle" class="Triangle" parent="parent_triangle" >
        <property name="pointB" ref="pointB" />
        <property name="pointC" ref="pointC" />

    </bean>
```

note the parent key.

A parent can also contain a list:
```
 <bean id="parentPointList" class="Triangle" abstract="true">
        <property name="points">
            <list>
                <ref bean="pointA" />
            </list>
        </property>
    </bean>
```
in which if you use 
```
 <bean id="listTriangle" parent="parentPointList">
        <property name="points">
            <list>
                <ref bean="pointB" />
                <ref bean="pointC" />
            </list>
        </property>
    </bean>
```   
all the values of the parent will be overwritten. If you use:
```
 <bean id="listTriangle" parent="parentPointList">
        <property name="points">
            <list merge="true">
                <ref bean="pointB" />
                <ref bean="pointC" />
            </list>
        </property>
    </bean>
```    
however it keeps the values of the previous list.