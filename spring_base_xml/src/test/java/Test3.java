import com.axcmsm.dao.AxcmsmDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: PACKAGE_NAME.Test3
 * 微信公众号：代码飞快
 * Description:
 * 生命周期
 * @author 须贺
 * @version 2023/4/20
 */
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AxcmsmDao axcmsmDao = (AxcmsmDao) applicationContext.getBean("axcmsmDao");
        System.out.println(axcmsmDao);

        //在虚拟机退出之前，关闭容器,可以调用bean销毁的方法
        //applicationContext.close();//比较暴力
        //注册关闭钩子，如果需要关闭虚拟机，先要把容器关掉，都不常用
        applicationContext.registerShutdownHook();

        //bean生命周期
        /**
         * 初始化bean
         * 1. 创建对象（内存分配）
         * 2. 执行构造方法
         * 3. 执行属性注入（set操作）
         * 4. 执行bean初始化方法
         *
         * 使用bean
         * 1. 执行业务操作
         *
         * 关闭/销毁容器
         * 1. 执行bean销毁方法
         *   - 容器关闭前触发bean的销毁方法
         *      - 手动关闭容器  close
         *      - 注册关闭构造 在退出虚拟机前关闭容器再退出
         *       registerShutdownHook
         */


    }
}
