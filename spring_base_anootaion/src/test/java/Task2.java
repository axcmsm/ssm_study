import com.axcmsm.config.SpringConfig;
import com.axcmsm.service.AxcmsmService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Task2
 * 微信公众号：代码飞快
 * Description:
 * DI 依赖注入
 * @author 须贺
 * @version 2023/4/21
 */
public class Task2 {
    public static void main(String[] args) {
        //自动装配
        ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class);
        AxcmsmService bean = context.getBean(AxcmsmService.class);
        bean.save();
        /**
         * DI 依赖注入
         * @Autowired 根据类型自动装配
         * @Qualifier("axcmsmDao")  根据指定bean的名称进行装配，需要配合Autowired
         * ----
         * 自动装配基于反射设计创建对象并暴力反射对应的属性为私有属性初始化属性，因此无需提供setter方法
         * 自动装配建议使用无参构造方法创建对象(默认)，如果不提供对应构造方法，请提供唯一构造方法

         * @PropertySource("jdbc.properties") 将配置文件加载到bean中，可以用{} 加载多个配置文件，不能使用通配符，标准的写法：{classpath:jdbc.properties}
         * @Value 可以进行简单类型的注入 然后就可以根据${jdbc.username} 来获取属性的值了
         */
    }
}
