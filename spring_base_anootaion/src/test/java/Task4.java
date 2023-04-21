import com.axcmsm.config.SpringConfig;
import com.axcmsm.dao.AxcmsmDao;
import com.axcmsm.mapper.OrderCartMapper;
import com.axcmsm.pojo.OrderCart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * ClassName: PACKAGE_NAME.Task4
 * 微信公众号：代码飞快
 * Description:
 * 快速整合Mybatis
 * @author 须贺
 * @version 2023/4/21
 */
public class Task4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderCartMapper cartMapper = context.getBean(OrderCartMapper.class);
        List<OrderCart> all = cartMapper.findAll();
        all.forEach(System.out::println);

        /**
         * MybatisConfig 配置俩个bean，一个是扫描类型的bean，一个扫描映射的bean
         */
    }
}
