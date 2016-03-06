# Autowire

if the bean id's match the variables defined in the class. You can use autowire. for example

in Triangle class :
Point pointA;

in the spring.xml
 <bean id="pointA" class="Point">
        <property name="x" value="0" />
        <property name="y" value="0" />
 </bean>
 
then it can be used for autowiring.

There are different autowiring methods: byName, byType, constructor ect.
If no autowire arg is provided it is off.
byType only can handle 1 of each type, else it will not know which one to select.

Tracability can be hard with autowiring. Therefore if you have alot of beans, use ID

