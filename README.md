### SSM整合

### Spring 
- Core Container (beans core context SpEL)  核心容器
- Aop(面向切面编程) Aspects(Aop思想实现)
- Data Access/Integration(JDBC ORM JMS OXM Transactions): 数据访问，数据集成
- Web(WebSocket Servlet Web Portlet):Web开发
- Test:单元测试与集成测试
---
**IOC/DI**:

**IOC**：控制反转，使用对象时，由主动new产生的对象转换为由**外部**提供对象，此过程中对象创建控制权由程序转移到**外部**，此思想为控制反转。

Spring技术提供了容器，称为IOC容器，来充当Ioc思想中的**外部**，Ioc容器负责对象的创建，初始化等一系列工作，被创建或被管理的对象在Ioc容器中统称为Bean

**DI**：依赖注入，在容器中建立bean与bean之间的依赖关系的整个过程，称为依赖注入。

总结(充分解耦)：使用Ioc容器来管理Bean,在Ioc容器内将有依赖关系的bean进行关系绑定（DI)

---





**整合**:

- **整合Mybatis**:
- **整合Junit**

---

**AOP**:
- AOP 面向切面编程
  - OOP面向对象编程
- 作用：在不惊动原始设计的基础上为其进行功能增强的。
- 无入侵式编程

**连接点(JoinPoint)**：程序执行过程中的任意位置，粒度为执行方法，抛出异常，设置变量等
- 在SpringAop中，理解为方法的执行

**切入点(Pointcut)**：匹配连接点的式子
- 在SpringAop中，一个切入点可以只描述一个具体方法，也可以匹配多个方法


**通知(Advice)**：在切入点处执行的操作，也就是共性的功能
- 在SpringAop中，功能最终以方法的形式呈现

**通知类**：定义通知类

**切面(Aspect)**：描述通知与切入点的对应关系

**Aop工作流程**：本质是（代理模式）
1. Spring 容器启动
2. 读取所有**切面配置**中的切入点
3. 初始化bean，判定bean对应的类中的方法是否匹配到任意点
   - 匹配失败，创建对象
   - 匹配成功，创建原始对象（**目标对象**）的**代理**对象
4. 获取bean执行方法
   - 获取bean，调用方法并执行，完成操作
   - 获取bean是代理对象时，根据代理对象的允许模式运行原始方法与增强内容，完成操作

---

**事务**:
- 事务的作用：在数据层保障一系列的数据操作同成功或者同失败
- Spring事务：在**数据层**或者**业务层**保障一系列的数据库操作同成功同失败

```java
public interface PlatformTransactionManager extends TransactionManager {
    TransactionStatus getTransaction(@Nullable TransactionDefinition var1) throws TransactionException;

    void commit(TransactionStatus var1) throws TransactionException;

    void rollback(TransactionStatus var1) throws TransactionException;
}
```
```java
DataSourceTransactionManager 实现类
内部默认是jdbc的事务，如果使用jdbc的事务，就可以使用该事务
```


