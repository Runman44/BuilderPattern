<<<<<<< HEAD
# FactoryPattern
Example project for the Factory Design Pattern

Factory pattern is one of most used design pattern in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Implementation
--------------
Our client class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

![](http://i60.tinypic.com/14udk5v.jpg)

Copyright Dennis Anderson 2015


=======
# TemplatePattern
Example of the Template Pattern

In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. 
Its subclasses can override the method implementation as per need but the invocation is to be in the same way as 
defined by an abstract class. This pattern comes under behavior pattern category.

Implementation
---------------
We are going to create a Tree abstract class defining operations with a template method set to be 
final so that it cannot be overridden. ChristmasTree and OutsideTree are concrete classes that extend Tree and override its methods.

Our Client class, will use Tree to demonstrate use of template pattern.

![](http://i61.tinypic.com/5jtevq.jpg)
>>>>>>> 9294008bbc20a39fb18220146900a46548d3f9bd
