import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: PACKAGE_NAME.Task7
 * 微信公众号：代码飞快
 * Description:
 * 管理外部数据源,以及加载外部properties文件
 * @author 须贺
 * @version 2023/4/21
 */
public class Test7 {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource) context.getBean("dataSource");
        System.out.println("dataSource = " + dataSource);
        System.out.println("dataSource.getConnectCount() = " + dataSource.getConnectCount());
        DruidPooledConnection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from order_cart");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int cart_id = resultSet.getInt("cart_id");
            double price = resultSet.getDouble("price");
            System.out.println("cart_id = " + cart_id+",price = " + price);
        }
    }
}
