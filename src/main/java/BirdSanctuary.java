
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuary {
    private static BirdSanctuary instance;
    private Set<Bird> birdsList = new HashSet<>();

    private BirdSanctuary(){

    }

    public synchronized static BirdSanctuary getInstance(){
        if(instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }

    public void add(Bird bird){
        boolean birdTest = birdsList.stream().anyMatch(i -> i.equals(bird));
        if (!birdTest) {
            birdsList.add(bird);
            bird.incrementCount();
        }
    }

    public void remove(Bird bird){
        birdsList.remove(bird);
        bird.decrementCount();
    }

    public void printFlyable(){
        for (Bird b : birdsList ){
          if(b instanceof Flyable) {
              ((Flyable)b).fly();
          }
        }
    }
    public void printSwimmable(){
        for(Bird b : birdsList){
            if(b instanceof Swimmable){
                ((Swimmable)b).swim();
            }
        }
    }
    public void printEatable(){
        for (Bird b : birdsList){
            if(b instanceof Eatable){
                ((Eatable)b).eat();
            }
        }
    }
}
