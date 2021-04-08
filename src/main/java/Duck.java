public class Duck extends Bird implements Flyable, Eatable, Swimmable{
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
        System.out.println("Duck is flying");
    }

    @Override
    public void eat(){
        System.out.println("Duck is eating");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}
