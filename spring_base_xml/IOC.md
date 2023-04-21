### 容器的总结
- BeanFactory 是IoC容器中的顶层接口，初始化BeanFactory对象时，加载的bean延迟加载
- ApplicationContext 接口是Spring容器的核心接口，初始化时bean立即加载
- ApplicationContext 接口提供基础的bean操作相关方法，通过其他接口扩展其功能
- ApplicationContext 接口常用方法初始化类
  - ClassPathXmlApplicationContext
  - FileSystemXmlApplicationContext

### Bean 相关
- **id**：每个 bean 都需要一个唯一的 id 作为标识符。
- **class**：指定 bean 的实现类。
- scope：指定 bean 的作用域，包括 singleton、prototype、request、session 和 global session 等。
- constructor-arg：用于指定 bean 构造函数的参数值。
- property：用于设置 bean 的属性值。
- init-method：指定 bean 初始化时调用的方法。
- destroy-method：指定 bean 销毁时调用的方法。
- autowire：自动装配模式，包括 byName、byType、constructor 和 autodetect 四种。
- lazy-init：用于指定是否延迟加载 bean，默认为 false。
- depends-on：指定bean实例化之前，需要先实例化哪些 bean。
- factory-method：用于指定使用静态工厂方法创建bean。
- factory-bean：用于指定使用工厂 bean 创建 bean。
- ...

### 依赖注入相关
- constructor-arg 构造器注入
  - name 名称
  - ref 引用类型
  - value 简单类型
- property  setter注入
  - 集合：list
- ....
