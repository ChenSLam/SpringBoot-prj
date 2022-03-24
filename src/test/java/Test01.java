import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springconfig.SpringConfig;
import vo.Cat;
import vo.Student;
import vo.Tiger;

public class Test01 {
    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println(student);
    }
    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("liudehuaStudent");
        System.out.println(student);
    }
    @Test
    public void catTest1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ctx.getBean("myCat");
        System.out.println(cat);
    }
    @Test
    public void tigerTest1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println(tiger);
    }
}
