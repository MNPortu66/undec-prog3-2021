public class AppBirdsTest {
    public static void main(String[] args) {
        Parrot bird1 =  new Parrot ();
        Penguin bird3 = new Penguin();

        System.out.println(bird1.toString());
        System.out.println(bird3.toString());

        bird1.eat();
        bird3.swims();

    }
}
