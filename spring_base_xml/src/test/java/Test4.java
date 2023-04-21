import com.axcmsm.dao.AxcmsmDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Task4
 * 微信公众号：代码飞快
 * Description:
 * 依赖注入
 * @author 须贺
 * @version 2023/4/20
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * 依赖注入的方式：
         * - 普通方法 set
         * - 构造方法
         *
         * 注入的方式：
         * - setter注入：
         *    - 简单类型
         *    - 引用类型
         *
         * - 构造器注入
         *    - 简单类型
         *    - 引用类型
         *
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AxcmsmDao bean = (AxcmsmDao) context.getBean("axcmsmDao");
        System.out.println(bean);
        bean.save();
        /**
         * 依赖注入方式选择：
         * 1. 强制依赖使用构造器进行，使用setter注入有概率不进行注入导致null对象出现
         * 2. 可选依赖使用setter注入进行，灵活性强
         * 3. spring框架倡导使用构造器，第三方框架内部大多数采用构造器注入的形式进行数据初始化，相对严谨
         * 4. 如果有必要可以俩者同时使用，使用构造器注入完成强制依赖注入，使用setter完成可选依赖注入
         * 5. 实际开发中，根据实际情况分析，如果受控对象没有提供setter方法就必须使用构造器注入
         * 6. 自己开发的模块推荐使用setter注入
         */
    }
}
