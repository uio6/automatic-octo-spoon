import com.alibaba.druid.pool.DruidDataSource;
import com.spring_study_1.service.ii.userService;
import com.spring_study_1.service.userServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class user_test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        userServiceImpl userService = applicationContext.getBean("userService", userServiceImpl.class);
        userService.pt();
        DruidDataSource dataSource = applicationContext.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
}
