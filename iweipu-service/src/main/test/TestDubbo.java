import com.pipework.api.account.IAccountService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pipework.framework.core.SpringContextHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LiXiang
 * Date: 14-6-12
 * Time: 下午9:50
 * To change this template use File | Settings | File Templates.
 */
public class TestDubbo {
    public static void main(String[] args)throws Exception {

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo.xml"});

        context.start();

        IAccountService demoService = (IAccountService)context.getBean("accountService");// 获取远程服务代理

        String hello = demoService.sayHello("world");// 执行远程方法

        System.out.println( hello );// 显示调用结果

    }
}
