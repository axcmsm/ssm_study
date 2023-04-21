import com.axcmsm.config.SpringConfig;
import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.service.AxcmsmService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Task5
 * 微信公众号：代码飞快
 * Description:
 * aop切面编程
 * @author 须贺
 * @version 2023/4/21
 */
public class Task5 {
    public static void main(String[] args) {
        //1. 给AxcmsmDao 中的list方法加上执行时间
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AxcmsmDao bean = context.getBean(AxcmsmDao.class);
        bean.list();
        /**
         * 1. 导入spring-aop的依赖和aspectjweaver依赖
         * 2. 创建通知类，让如容器中并且，使用@Aspect进行标注
         * 3. 编写写入点方法 @Pointcut("execution(void com.axcmsm.dao.AxcmsmDao.list())")
         * 4. 使用@Before("pt()")  标注增强的功能
         * 5. 在spring的配置类中，高数spring使用了aop开发@EnableAspectJAutoProxy
         */

        AxcmsmService axcmsmService = context.getBean(AxcmsmService.class);
        System.out.println(axcmsmService.openURL("www.axcmms.com"," axcmsm "));
    }
}
