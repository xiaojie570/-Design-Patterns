# 7天学一个设计模式呗  


## 设计模式的应用场景

:sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny::sunny:  


### 模板方法模式

概念：定义了一个模板结构，将具体内容延迟到子类去实现  

该设计模式解决的问题：

- 将相同部分的代码放在抽象的父类中，将不同的代码放入不同的子类中
- 通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为   


该模式的实际应用：

AQS：AQS的设计是基于模板方法模式的，即，使用者需要继承AQS并重写指定的方法，随后将同步器组合在自定义同步组件的实现中，并调用AQS提供的模板方法，
而这些模板方法将会调用使用者重写的方法。   








