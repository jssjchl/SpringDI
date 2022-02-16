import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("animal.xml");

        PetOwner person = (PetOwner) context.getBean("id_petOwner");
        person.play();
        context.close();
    }
}
