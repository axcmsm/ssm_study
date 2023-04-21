import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.service.AxcmsmService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Test1
 * 微信公众号：代码飞快
 * Description:
 *  从容器中获取bean对象 => Ioc
 * @author 须贺
 * @version 2023/4/20
 */
public class Test1 {
    public static void main(String[] args) {
        //1. 获取容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //2. 获取bean对象
//        AxcmsmService axcmsmService = (AxcmsmService) ctx.getBean("axcmsmService");//根据id获取
        AxcmsmService axcmsmService = (AxcmsmService) ctx.getBean("axcmsm");//根据别名获取
        System.out.println(axcmsmService);
        axcmsmService.save();

    }
}
