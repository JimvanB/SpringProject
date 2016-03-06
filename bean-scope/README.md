# beanscope

There are two mean bean-scopes. This refers to what happens when you call the getBean method.

The first = Singleton. Everytime you say getBean("triangle"); it will return the same triangle object.
The second = Prototype, in which a new bean is created with every request or reference

Thus, with prototype, multiple instances of a bean can be created.

If singleton is used. every bean is initialzed when the Application context is loaded. With prototype, however, it waits for the getBean call to initialize

There are other scopes:
-request: new bean per servlet request
-session: new bean per session
-global session: new bean per global HTTP session

Scope definition is done in the bean definition. Singleon is default.
e.g. 
```
<bean id = 'bla'  class='Triangle' scope='prototype' />
```
Singleton --> bit different than the equal singleton pattern. If a different app context is used, it will have its own bean.


