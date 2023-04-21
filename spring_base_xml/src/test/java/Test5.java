import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.service.AxcmsmService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Test5
 * 微信公众号：代码飞快
 * Description:
 * 自动装配
 * @author 须贺
 * @version 2023/4/20
 */
public class Test5 {
    public static void main(String[] args) {
        /**
         * Ioc容器根据bean所依赖的资源在容器中自动查找并注入到bean中的过程称为自动装配
         * 自动装配的方式：
         * 1. 按类型（常用）
         * 2. 按名称
         * 3. 按构造方法
         * 4. 不启用自动装配
         *  主要是前面俩个常用。
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AxcmsmService bean = (AxcmsmService) context.getBean("axcmsmServiceAuto");
        System.out.println(bean);
        bean.save();
        /**
         * 自动准备用于引用类型的依赖注入，不能对简单类型进行操作
         * 使用类型装配时，必须保障容器中相同类型的bean唯一，推荐使用
         * 使用按名称装配时，必须保障容器中具有指定名称的bean，因变量名与配置耦合，不推荐使用
         * 自动装配优先级低于setter注入与构造器注入，同时出现时自动装配配置失效。
         */

    }
}
