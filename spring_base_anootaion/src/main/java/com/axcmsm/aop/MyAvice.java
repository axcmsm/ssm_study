package com.axcmsm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * ClassName: com.axcmsm.aop.MyAvice
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Component
@Aspect
public class MyAvice {
    //定义切入点：@Pointcut

    /**
     * 切入点表达式：动作关键字（访问修饰符 返回值 包名.类/接口.方法(参数) 异常名）
     * 1. 动作关键字：描述切入点的动作，例如：execution
     * 2. 访问修饰符：public,private,可省略
     * 3. 返回值：例如：void
     * 4. 包名，类名/接口，方法名，参数，异常名(可省略)
     * <p>
     * 通配符描述：
     * 1. *：单个独立任意符号
     * 例如：execution(public * com.axcmsm.*.AxcmsmDao.list*(*))
     * 2. ..:多个连续任意符号，可以简化包名和参数的蜀书写
     * 例如：execution(public Axcmsm com..AxcmsmDao.list(..))
     * 3. +：专用于匹配子类类型
     * 例如：execution(* *..*Dao+.*(..))
     * <p>
     * 书写技巧：
     * 1. 描述切入点通常表述接口，而不描述是实现类
     * 2. 访问控制修饰符针对接口开发，均采用public描述（可省略访问控制修饰符描述）
     * 3. 返回值类型对增删改类使用精确类型加数匹配，对于查询类型使用*通配快速扫描
     * 4. 包名书写尽量不使用..匹配，效率过低，常用*做单个包匹配，或精准匹配
     * 5. 接口/类名与模块相关采用*匹配，例如：*Service
     * 6. 方法以动词进行精确匹配，名词采用*匹配。例如：getBy*,SelectAll => SelectAll
     * 7. 通常不使用异常匹配
     */
    @Pointcut("execution(void com.axcmsm.dao.AxcmsmDao.list())") //当不好识别的时候可以从右边开始识别  list() 中list一定是方法=>依此类推，后面的都是包名了
    private void pt() {
    }


    /**
     * 通知类型：共分为5种。
     * 1. 前置通知 @Before("pt()")
     * 2. 后置通知 @After()
     * 3. 环绕通知 @Around() 要提供返回值和接收ProceedingJoinPoint 参数 （常用）
     * 4. 返回后通知 @AfterReturning
     * 5. 抛出异常后通知 @AfterThrowing
     */
    @Before("pt()")//MyAvice.pt() 也可以
    public void Before() {
        //获取参数 JoinPoint joinPoint
        //joinPoint.get

        System.out.println("切面编程......前置通知");
    }

    @After("pt()")
    public void After() {
        //获取参数 JoinPoint joinPoint
        //joinPoint.get
        System.out.println("切面编程......后置通知");
    }

    @Around("pt()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(signature.getName());
//        System.out.println(proceedingJoinPoint.getArgs());//获取参数
        //表示环绕的通知
        System.out.println("切面编程......环绕通知");
        Object proceed = proceedingJoinPoint.proceed();//拦截，可以传入proceed(参数)
        System.out.println("切面编程......环绕通知");
        return proceed;
    }

    @AfterReturning(value = "pt()",returning ="ret" )
    public void afterReturning(JoinPoint point,Object ret) {
        //,returning ="ret"  ==>  Object ret
        //JoinPoint point 需要在前面
        System.out.println("切面编程......返回后通知");
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("切面编程......返回后异常");
    }


}
