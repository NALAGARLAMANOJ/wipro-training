import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springhiborm.entity.Student;
import com.example.springhiborm.service.StudentService;


public class App
{
    //Controller -- which is a entry point
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // bean container is giving you an object of student service class
        StudentService service =  ctx.getBean(StudentService.class);
        service.create(new Student("Niti" , "niti@gmail.com" , "Python"));
        service.create(new Student("Jatin" , "jatin@gmail.com" , "MySql"));
        service.create(new Student("manoj","manoj@gmail.com","java"));
        service.create(new Student("manuteja","manuteja@gmail.com","devops"));

        System.out.println("___________All Student Data ________");
        System.out.println("All Students list :" + service.list());

        System.out.println("___________Student based on ID ________");

        Student s =  service.get(3L);
        System.out.println("Student with id 1 :" + s);

    }
}
