package springconfig;

import org.springframework.context.annotation.*;
import vo.Student;

/*
@Configuration:表示当前类是作为配置文件使用得。就是用来配置容器得
            位置：在类的上面
* */
@Configuration
@ImportResource(value = "classpath:ApplicationContext.xml")//用来导入xml配置，等同于xml文件的resource
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "vo")
public class SpringConfig {
        /*
            创建方法，方法的返回值是对象。在方法的上面加入@Bean
             方法的返回值对象就注入到容器中

            @Bean：把对象注入到spring容器中。作用相当于<bean>
                位置：方法的上面
                 说明：@Bean，不指定对象的名称，默认方法名是id
        * */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("刘德华");
        s1.setAge(60);
        s1.setEmail("544922@qq.com");
        return s1;
    }

    @Bean(name = "liudehuaStudent")
    public Student makeStudent(){
        Student s1 = new Student();
        s1.setName("刘德华");
        s1.setAge(601);
        s1.setEmail("544922@qq.com");
        return s1;
    }
}
