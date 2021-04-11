public class Penguin extends Bird implements IBird, IBirdSwim{
    private String name = "Penguin";
    public Penguin() {
        this.setName(name);
    }

    @Override
    public void eat() {
        System.out.println("The " + this.getName() + " eats");

    }

    @Override
    public void swims() {
        System.out.println("The " + this.getName() + " swims");

    }
}
