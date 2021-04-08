public class Penguin extends Bird implements Eatable, Swimmable{
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
    public void eat(){
        System.out.println("Penguin is eating");
    }

    @Override
    public void swim(){
        System.out.println("Penguin is swimming");
    }
}
