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
