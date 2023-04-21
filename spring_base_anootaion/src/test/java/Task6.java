import com.axcmsm.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

/**
 * ClassName: Task6
 * 微信公众号：代码飞快
 * Description:
 * 事务操作
 * @author 须贺
 * @version 2023/4/21
 */
public class Task6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**
         * 使用步骤：
         * 1. @Transactional 来标注开启事务
         * 2. 配置事务管理器，默认是使用jdbc的事务，可以配置后放入容器中
         * 3. @EnableTransactionManagement 最终在配置上告诉Spring配置了事务
         *
         * 注意事项：
         * Spring的事务通常添加在业务层接口中，而不会添加到业务层的实现类中，降低耦合
         * @Transactional 不仅可以写在方法上，还可以写在类上或者接口上
         */


        /**
         * 事务的角色：
         * @Transactional 开启的事务，称为事务管理员
         * 内部的事务，称为事务的协调员
         * - 事务管理员：发起事务方
         * - 事务协调员：加入事务方
         */

        /**
         * 事务相关配置：
         * - readOnly 设置为只读事务
         * - timeout 超时时间
         * - rollbackFor 设置回归异常
         * - rollbackForClassName 设置回滚异常（字符串）
         * - noRollbackForClassName 设置事务不回滚异常（字符串）
         * - propagation 设置事务传播行为
         *                   管理事务，协调事务
         *      REQUIRED(0), 默认(有，加入，无，开启)         加入事务
         *      REQUIRES_NEW(3),(有，新建，无，新建)            新事务
         *
         *      SUPPORTS(1), （有，加入，无，无）            支持事务，有就有，没有就没有
         *      NOT_SUPPORTED(4),(有，无，无，无）            不支持事务，没有事务
         *
         *      MANDATORY(2), （有，加入，无，ERROR)         一定不能没有事务
         *      NEVER(5),（有,ERROR,无，无）                 一定不能有事务
         *
         *      NESTED(6);设置savePoint，一旦事务回滚，事务将回滚到savePoint处，交给客户端响应/提交
         *
         * 默认的回滚异常：
         * 1. 运行时异常
         * 2. ERROR异常
         *
         * IO异常，等其他异常不进行回滚
         *
         *
         * 设置事务传播行为:
         *    事务协调员对事务管理员所携带事务的处理态度
         */



    }
}
