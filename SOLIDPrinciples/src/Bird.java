public class Bird {
    private String nombre;

    public Bird() {
    }

    public Bird(String nombre) {
        this.nombre = nombre;
    }

    public void birdFly(){
        System.out.println("The " + this.nombre + " fly");

    }
    public void birdEat(){
        System.out.println("The " + this.nombre + " eats");
    }

    @Override
    public String toString() {
        return "nombre del ave='" + nombre + '\'';
    }
}
