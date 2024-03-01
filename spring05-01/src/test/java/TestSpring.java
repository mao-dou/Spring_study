import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author 毛豆
 * @date 2024/2/26
 **/

public class TestSpring {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        person person = (person) context.getBean("person");
        System.out.println(person);
    }

    /**
     * 测试spring: spring工厂提供的其他方法
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring工厂提供的其他方法
        //person person = context.getBean("person", person.class);
        /*person person = context.getBean(person.class);
        System.out.println(person);*/
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("beanDefinitionNames = " + Arrays.toString(beanDefinitionNames));
    }
}
