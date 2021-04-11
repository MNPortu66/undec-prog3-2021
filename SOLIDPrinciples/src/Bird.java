public class Bird implements IBird, IBirdFly,IBirdSwim{
    private String nombre;

    public Bird() {
    }

    public Bird(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre del ave='" + nombre + '\'';
    }

    @Override
    public void eat() {
        System.out.println("The " + this.nombre + " eats");
    }

    @Override
    public void fly() {
        System.out.println("The " + this.nombre + " fly");

    }

    @Override
    public void swims() {
        System.out.println("The " + this.nombre + " swims");

    }
}
