public class AppBirdsTest {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Eagle");
        Bird bird2 = new Bird("Parrot");
        Bird bird3 = new Bird("Penguin");

        System.out.println(bird1.toString());
        System.out.println(bird2.toString());
        System.out.println(bird3.toString());

        bird1.eat();
        bird2.fly();
        bird3.swims();

    }
}
