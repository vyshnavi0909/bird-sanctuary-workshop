public class Main {

    public static void main(String[] args) {
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        Duck duck = new Duck();
        Duck duck1 = new Duck();
        Parrot parrot = new Parrot();
        Parrot parrot1 = new Parrot();
        Penguin penguin = new Penguin();
        ToyDuck toyDuck = new ToyDuck();
        Duck duck2 = new Duck();


        sanctuary.add(duck);
        sanctuary.add(duck1);
        sanctuary.add(parrot1);
        sanctuary.add(parrot);
        sanctuary.add(penguin);
        sanctuary.add(toyDuck);
        sanctuary.add(duck2);
        sanctuary.add(toyDuck);

        sanctuary.remove(duck1);
        sanctuary.remove(duck2);


        sanctuary.printFlyable();
        sanctuary.printSwimmable();
        sanctuary.printEatable();

        System.out.println(duck.getCount() +" " + Parrot.count + " " + Penguin.count + " " + ToyDuck.count);
    }
}
