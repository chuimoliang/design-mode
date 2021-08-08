### 设计模式

#### 原则

##### 总原则 : 开闭原则, 对扩展开放, 对修改关闭, 扩展性好, 易于维护和升级

##### 1. 单一职责原则

每个类实现单一的职责, 不要有多个导致类变更的原因

##### 2. 里氏替换原则

子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。任何基类可以出现的地方，子类一定可以出现。 是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。

##### 3. 依赖倒转原则

这个是开闭原则的基础，具体内容：面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互。

##### 4. 接口隔离原则

每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。使用多个隔离的接口，比使用单个接口（多个接口方法集合到一个的接口）要好。

##### 5. 最少知道原则

一个类对自己依赖的类知道的越少越好。也就是说无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。

最少知道原则的另一个表达方式是：只与直接的朋友通信。类之间只要有耦合关系，就叫朋友关系。耦合分为依赖、关联、聚合、组合等。我们称出现为成员变量、方法参数、方法返回值中的类为直接朋友。局部变量、临时变量则不是直接的朋友。我们要求陌生的类不要作为局部变量出现在类中。

##### 6. 合成复用原则

原则是尽量首先使用合成/聚合的方式，而不是使用继承。

#### 具体模式

##### 1. 创建型模式

1. [工厂方法模式](01.02.工厂/抽象工厂 模式.md)

2. 抽象工厂模式

3. [单例模式](03.单例模式.md)

4. [建造者模式](04.建造者模式)

5. 原型模式

   对Java来说原型模式没啥可说的, 继承cloneable就完事了, 值得注意的是有些字段需要再次执行clone, 常与工厂模式搭配使用

   目的主要是减少创建对象对时间的消耗

##### 2. 结构型模式

6. [适配器模式](05.适配器模式.md)
7. 装饰器模式
8. 代理模式
9. 外观模式
10. 桥接模式
11. 组合模式
12. 享元模式

##### 3. 行为型模式

13. 策略模式
14. 模板方法模式
15. 观察者模式
16. 迭代子模式
17. 责任链模式
18. 命令模式
19. 备忘录模式
20. 状态模式
21. 访问者模式
22. 中介者模式
23. 解释器模式