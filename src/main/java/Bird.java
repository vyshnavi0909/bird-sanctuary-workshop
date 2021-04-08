import java.util.Objects;

public abstract class Bird {
    abstract void incrementCount();
    abstract void decrementCount();
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    abstract int getCount();
}
