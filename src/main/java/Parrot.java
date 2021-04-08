public class Parrot extends Bird implements Flyable, Eatable{
    static int count;

    @Override
    public void incrementCount(){
        count++;
    }

    @Override
    public void decrementCount(){
        count--;
    }

    @Override
    public int getCount(){
        return count;
    }


    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }

    @Override
    public void eat(){
        System.out.println("Parrot is eating");
    }

}
