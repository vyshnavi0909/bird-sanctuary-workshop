import java.util.HashSet;
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

    public void addBird(Bird bird){
        try{
            if (bird == null) {
                throw new BirdSanctuaryAddException("Bird added is null");
            }
            if(birdsList.add(bird)) {
                bird.incrementCount();
            }
        } catch (BirdSanctuaryAddException e) {
            e.printStackTrace();
        }
    }

    public void remove(Bird bird){
        birdsList.remove(bird);
        bird.decrementCount();
    }

    public void printFlyable(){
//        for (Bird b : birdsList ){
//          if(b instanceof Flyable) {
//              ((Flyable)b).fly();
//          }
//        }
        birdsList.stream()
                .filter(b -> b instanceof Flyable)
                .forEach(bird -> ((Flyable) bird).fly());
    }
    public void printSwimmable(){
//        for(Bird b : birdsList){
//            if(b instanceof Swimmable){
//                ((Swimmable)b).swim();
//            }
//        }
        birdsList.stream().filter(b -> b instanceof Swimmable).forEach(bird -> ((Swimmable) bird).swim());
    }
    public void printEatable(){
//        for (Bird b : birdsList){
//            if(b instanceof Eatable){
//                ((Eatable)b).eat();
//            }
//        }
        birdsList.stream()
                .filter(b -> b instanceof Eatable)
                .forEach(bird -> ((Eatable) bird).eat());
    }
}
