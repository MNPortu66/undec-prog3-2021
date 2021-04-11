public class Parrot extends Bird implements IBird, IBirdFly{

    private String name = "Parrot";

    public Parrot() {
        this.setName(name);
    }

    @Override
    public void eat() {
        System.out.println("The " + this.getName() + " eats");

    }

    @Override
    public void fly() {
        System.out.println("The " + name + " flys");
    }
}
