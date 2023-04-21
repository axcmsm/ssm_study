import com.axcmsm.dao.ListDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Test6
 * 微信公众号：代码飞快
 * Description:
 * 集合注入：List，Set，Map，Properties
 * @author 须贺
 * @version 2023/4/21
 */
public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ListDao listDao = (ListDao) applicationContext.getBean("listDao");
        listDao.save();
    }
}
