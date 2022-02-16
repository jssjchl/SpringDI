import lombok.Setter;

@Setter
public class Cat implements AnimalType{
     private String myName;

    @Override
    public void sound() {
        System.out.println("DOg name: " + myName + "sound: " + "Bow wow");
    }
}
