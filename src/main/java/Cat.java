import java.util.Random;

public class Cat {
    private Random random =new Random();
    private String name;
    int appetite= random.nextInt(10); //допустим что аппетит каждого кота не может привышать 10 едениц.
    private boolean satiety = false;
    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name ) {
        this.name = name;

    }

    public Cat (Random random, String name, int appetite, boolean satiety) {
        this.random = random;
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        if (appetite <= p.getFood()) {
            satiety = true;
            System.out.println(" Кот " + name + " наелся " + satiety);

        }

    }
}
