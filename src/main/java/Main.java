public class Main {

    public static void main(String[] args) {
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        Duck duck = new Duck();
        Duck duck1 = new Duck();
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();
        ToyDuck toyDuck = new ToyDuck();
        Duck duck2 = new Duck();
        ToyDuck toyDuck2 = new ToyDuck();
        Parrot parrot2 = new Parrot();

        sanctuary.addBird(duck);
        sanctuary.addBird(duck);
        sanctuary.addBird(duck1);
        sanctuary.addBird(null);
        sanctuary.addBird(penguin);
        sanctuary.addBird(toyDuck);
        sanctuary.addBird(duck2);
        sanctuary.addBird(toyDuck2);
        sanctuary.addBird(toyDuck);
        sanctuary.addBird(parrot2);

        sanctuary.remove(duck1);
        sanctuary.remove(duck2);


        sanctuary.printFlyable();
        sanctuary.printSwimmable();
        sanctuary.printEatable();

        System.out.println("Duck count " + duck.getCount() +"\nParrot Count " + parrot.getCount() + "\nPenguin Count " + penguin.getCount() + "\nToy Duck Count " + toyDuck.getCount());
    }
}
