import com.axcmsm.config.SpringConfig;
import com.axcmsm.dao.AxcmsmDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Task3
 * 微信公众号：代码飞快
 * Description:
 * 管理第三方Bean
 * @author 须贺
 * @version 2023/4/21
 */
public class Task3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AxcmsmDao bean = context.getBean(AxcmsmDao.class);
        bean.list();
        /**
         * 创建了一个jdbc的配置类，里面使用bean 进行容器的创建和构造数据源，其中可以创建别名，到时根据别名获取不同的数据源
         * 配置类导入的方式：
         * - 方式一：使用@Configuration+@ComponentScan 进行导入
         * - 方式二：直接使用@Import({JdbcConfig.class}) 进行精准导入
         * @Bean 将返回值放入容器中
         *    // 简单类型：使用属性传入
         *   // 引用类型：使用行参传入，需要的bean可以使用形参传入进来
         */
    }
}
