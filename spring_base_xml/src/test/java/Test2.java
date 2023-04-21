import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.service.AxcmsmService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Task2
 * 微信公众号：代码飞快
 * Description:
 *  作用范围：单例(默认)，不是单例
 * 工厂获取对象方式：根据无参构造器，静态工厂，实例工厂
 * @author 须贺
 * @version 2023/4/20
 */
public class Test2 {
    public static void main(String[] args) {
        //1. 获取容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //2. 获取bean对象
        AxcmsmService axcmsmService1 = (AxcmsmService) ctx.getBean("axcmsmService");//根据id获取
        AxcmsmService axcmsmService2 = (AxcmsmService) ctx.getBean("axcmsmService");//根据id获取
        AxcmsmService axcmsmService3 = (AxcmsmService) ctx.getBean("axcmsmServiceEbi");//根据id获取
        System.out.println(axcmsmService1);
        System.out.println(axcmsmService2);
        System.out.println(axcmsmService3);
        //默认是单例的


    }
}
