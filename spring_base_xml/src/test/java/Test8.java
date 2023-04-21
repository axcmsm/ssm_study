import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.dao.ListDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ClassName: PACKAGE_NAME.Task8
 * 微信公众号：代码飞快
 * Description:
 * 容器的总结
 *
 * @author 须贺
 * @version 2023/4/21
 */
public class Test8 {
    public static void main(String[] args) {
        //加载方式:
        //1. 加载类路径下的配置文件 （可以加载多个配置文件）
        //立即加载bean，初始化构造方法，可以在xml中配置 lazy-init="true" 延迟加载bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //2. 从文件系统下加载配置文件
        //ApplicationContext ctx=new FileSystemXmlApplicationContext("绝对路径");

        // 获取bean的方式
        //ListDao listDao = (ListDao) ctx.getBean("listDao");//方式一
        //ListDao listDao = ctx.getBean("listDao", ListDao.class);//方式二
        ListDao listDao = ctx.getBean(ListDao.class);//方式三：自动装配，根据类型获取bean
        listDao.save();

        //最顶层的接口 (了解即可)
        // 延迟加载bean 没有调用构造器
       /*
        Resource resources=new ClassPathResource("ApplicationContext.xml");
        BeanFactory bf=new XmlBeanFactory(resources);
        AxcmsmDao axcmsmDao = bf.getBean("axcmsmDao", AxcmsmDao.class);
        axcmsmDao.save();
        */



    }
}
