import com.axcmsm.config.SpringConfig;
import com.axcmsm.dao.AxcmsmDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Test1
 * 微信公众号：代码飞快
 * Description:
 * 注解开发
 *
 * @author 须贺
 * @version 2023/4/21
 */
public class Task1 {
    public static void main(String[] args) {

      /*
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
       AxcmsmDao bean = ctx.getBean("axcmsmDao",AxcmsmDao.class);
       bean.save();
        */

        /**
         * applicationContext 中定义扫描的包
         * @Component 注解进行bean的定义=> 代替了bean标签
         *   衍生注解:
         *    - @Controller 用于表现层的Bean
         *    - @Service 用于业务层的Bean
         *    - @Repository 用于数据层的Bean
         *
         * @Configuration 设定当前类为配置类
         * @ComponentScan({"com.axcmsm.service","com.axcmsm.dao"}) 设定扫描路径，此配置只加载一次，多个数据可用数组表示
         * @Scope 表示作用范围：非单例prototype，singleton 单例  默认是单例的
         * @PostConstruct 生命周期，初始化调用
         * @PreDestroy  生命周期，销毁之前调用
         */

        //纯注解开发
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AxcmsmDao bean = context.getBean("axcmsmDao", AxcmsmDao.class);
        System.out.println(bean);
        System.out.println(context.getBean("axcmsmDao", AxcmsmDao.class));//不是单例
//        context.close();
        context.registerShutdownHook();//销毁容器


    }
}
