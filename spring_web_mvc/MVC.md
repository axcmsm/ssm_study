### Spring MVC

- @Controller：用于标识控制层组件（Controller），自动将其注册到 Spring 容器中。
- @RequestMapping: 用于映射请求 URL 和处理方法，可用在类和方法级别上。
- @RequestParam：用于获取请求参数的值，常用于处理 GET 请求。
- @ResponseBody：将响应数据直接写入 HTTP 响应正文中。
- @PathVariable：用于获取 URI 中的变量值。
- @ModelAttribute：用于将请求参数绑定到 Model 中，常用于表单数据的提交。
- @SessionAttribute：将 Model 中的属性存储到 HttpSession 中，常用于保存用户登录信息等。
- @InitBinder：用于设置 WebDataBinder，从而自定义数据绑定规则。
- @ExceptionHandler：用于捕获异常，并将异常信息写入 HTTP 响应中或跳转到错误页面。
- @DataTimeFormat : 用于接收日期时间指定格式


WebMvcConfigurationSupport 是 Spring MVC 的配置类，用于扩展和自定义 Spring MVC 的配置。它提供了对 Spring MVC 配置中各个组件的定制化支持，包括处理器映射、视图解析器、消息转换器、拦截器等等。

通常情况下，我们会通过继承 WebMvcConfigurationSupport 来自定义 Spring MVC 配置，然后重写相应的方法来完成我们的需求，例如：

configureViewResolvers：配置视图解析器；
addInterceptors：添加拦截器；
addResourceHandlers：添加静态资源处理器；
configureMessageConverters：配置消息转换器等。
需要注意的是，当我们自定义 Spring MVC 配置时，如果使用了 WebMvcConfigurationSupport 这个类，就需要手动配置很多 Spring MVC 的基础组件，否则会出现一些意想不到的问题。因此，一般建议使用 @EnableWebMvc 注解来开启 Spring MVC 配置，这样可以更方便地进行配置和扩展。



**参数传递**：
1. 普通参数名称传递(默认) 还可以使用 @RequestParam 根据别名
2. 实体类传参
3. 数组 => 多个相同的值
4. 集合 => @RequestParam
5. json格式  => @EnableWebMvc ,@RequestBody

   
**全局异常处理**
- @RestControllerAdvice 定义异常拦截
- @ExceptionHandler(Exception.class) 拦截具体异常，然后执行该方法

**异常处理方案**
- 业务异常
  - 发送对应消息给用户，提醒规范操作
- 系统异常
  - 发送固定消息给用户，安抚用户
  - 发送特定消息给运维人员，提醒维护
  - 记录日志
- 其他异常
  - 发送固定消息给用户，安抚用户
  - 发送特定消息给编程人员，提醒维护(纳入预期范围)
  - 记录日志




**拦截器**

过滤器和连接器的区别：
1. 归属不同：Filter属于Servlet技术，Interceptor属于SpringMVC技术
2. 拦截内容不同：Filter对所有的访问进行增强，Interceptor仅对SpringMVC的访问进行增强


WebMvcConfigurer <=> WebMvcConfigurationSupport


工作流程：
=> **preHandle** => return =true=> controller => postHandle => afterCompletion 

**连接器链**：
1. 配置多个拦截器时，会形成连接器链
2. 拦截器链的运行顺序参照拦截器来添加顺序为准
3. 当拦截器中对原始处理器进行拦截，后面的拦截器均终止运行
4. 当拦截器运行中断，仅运行配置在前面的拦截器的afterCompletion操作
5. 