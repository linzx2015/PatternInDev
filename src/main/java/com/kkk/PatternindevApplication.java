package com.kkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 书：GoF：《设计模式：可复用面向对象软件的基础》
 * 23种设计模式：https://gof.quanke.name/
 * 结合实践：https://segmentfault.com/u/landy8530
 * 多线程设计模式(与本项目关系不大)：https://github.com/Viscent/javamtp
 * */

@SpringBootApplication
public class PatternindevApplication {

	/**
     *
     创建型模式：单例模式、抽象工厂模式、建造者模式、工厂模式、原型模式。
     结构型模式：适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式。
     行为型模式：模版方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、
                解释器模式、状态模式、策略模式、责任链模式、访问者模式。
     面向对象设计七大原则：
     1.单一职责(Single Responsibility Principle, SRP)：一个类只负责一个功能领域中的单种职责,如工具类,DBUtil:只负责db相关操作,HttpUtil只负责http操作
     2.开闭原则(Open-Closed Principle, OCP)：一个软件实体应当对扩展开放，对修改关闭
     3.里氏代换原则(Liskov Substitution Principle, LSP)：所有引用基类（父类）的地方必须能透明地使用其子类的对象，如把一个基类对象替换成它的子类对象，程序将不会产生任何错误和异常，反过来则不成立
     4.依赖倒转原则(Dependency Inversion Principle, DIP)：抽象不应该依赖于细节，细节应当依赖于抽象。即要针对接口编程，而不是针对实现编程。
     5.接口隔离原则(Interface Segregation Principle, ISP)：使用多个专门的接口，而不使用单一的总接口，即大接口类拆分成小接口类,根据需要实现接口
     6.合成复用原则：复用时要尽量使用组合/聚合关系（关联关系），少用继承；两个类之间是“Has-A”的关系应使用组合或聚合，如果是“Is-A”关系可使用继承
     7.迪米特法则(Law of Demeter, LoD)：一个软件实体应当尽可能少地与其他实体发生相互作用,只与朋友对象通讯，朋友对象如下：
     (1) 当前对象本身(this)；
     (2) 以参数形式传入到当前对象方法中的对象；
     (3) 当前对象的成员对象；
     (4) 如果当前对象的成员对象是一个集合，那么集合中的元素也都是朋友；
     (5) 当前对象所创建的对象

     依赖注入(DependencyInjection, DI)当一个对象要与其他对象发生依赖关系时，通过抽象来注入所依赖的对象。
     注入方式：构造注入，设值注入（Setter注入）和接口注入。
     构造注入是指通过构造函数来传入具体类的对象，设值注入是指通过Setter方法来传入具体类的对象，而接口注入是指通过在接口中声明的业务方法来传入具体类的对象。

     * 1.单例模式(SingletonClassic): 保证一个类仅有一个实例,并提供一个访问它的全局控制点.
		 比如在加载配置文件时, 可使用该模式.

	 2.工厂模式(Factory): 定义一个用以创建对象的接口, 让子类决定实例化哪个类.
		 当遇到需要根据某个前提条件创建不同的类实现时, 会实用工厂模式.

	 3.抽象工厂模式(Abstract Factory): 提供一个创建一系列相关或相互依赖对象的接口, 而无需指定它们具体的类.

	 4.装饰者模式(Decorator): 动态的给一个对象添加一些额外的职责.
		 比如java.io包. BufferedInputStream封装了FileInputStream, 它们都实现了InputStream接口, 但前者实现了readLine方法.

	 5.代理模式(Proxy): 为其他对象提供一种代理以控制对这个对象的访问.
		 比如在用户登录时, 真正的登录类和代理登录类都实现了Login接口, 不同的是Proxy类的方法中增加了用户是否合法的判断, 只有合法时才去调用真正登录类的login方法. 用户访问的其实是Proxy的login方法.

	 6.适配器模式(Adapter): 将一个类的接口转换成客户希望的另一个接口.

	 7.建造者模式(Builder): 将一个复杂对象的构建与它的表示分离.

	 8.策略模式(Strategy): 定义了算法家族, 分别封装起来, 让它们之间可以互相替换.
		 比如Collections.sort(List list, Comparator c); 可以通过实现多个Comparator接口来达到多种排序的目的.

	 9.模板模式(Template): 定义一个操作中的算法骨架, 而将一些步骤延迟到子类中.
		 比如HibernateTemplate, 在Template中已经定义了Connection开关的实现, 用户只需要在子类中根据不同的业务写不同的sql.

	 10.外观模式(Facade): 为子系统中的一组接口提供一个一致的界面.
	 	一直在用, 比如DBUtil, 将所有数据库对象封装了, 只留了DBUtil.getDBUtil()这个接口.

	 11.观察者模式(Observer): 定义了一种一对多的依赖关系,让多个观察者对象同时监听某一主题对象,在它的状态发生变化时,会通知所有的观察者.
		 比如ServletContextListener, 在applcation启动时, 会通知所有这个接口的实现类.

	 12.命令模式(Command): 将一个请求封装成为一个对象, 使可以用不同的请求对客户进行参数化.
	 	比如Struts的MVC结构, 其实就是个Command模式.
	 *
	 * */
	public static void main(String[] args) {
		SpringApplication.run(PatternindevApplication.class, args);
	}

}
