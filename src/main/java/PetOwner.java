import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PetOwner {

    private AnimalType Animal;

    public void play() {
        Animal.sound();
    }
}
