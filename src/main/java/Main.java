public class Main {
    public static void main(String[] args) {

        Cat [ ] cats = new Cat[4];
        cats [0] = new Cat("Barsik");
        cats [1] = new Cat("Boris");
        cats [2] = new Cat("Murka");
        cats [3] = new Cat("Persik");



        Plate plate = new Plate(10);
        for (Cat c: cats) {
            plate.info();
            c.eat(plate);

        }



    }

}
