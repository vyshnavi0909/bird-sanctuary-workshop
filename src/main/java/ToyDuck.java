public class ToyDuck extends Bird implements Flyable, Swimmable {
    static int count;

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    public void decrementCount(){
        count--;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    public void fly() {
        System.out.println("Toy Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Toy Duck is swimming");
    }
}
