public class Bird {
    private String nombre;

    public Bird(String nombre) {
        this.nombre = nombre;
    }
    public void createBirdOracleDB(Bird bird){
        System.out.println("Se guarda el ave en base de dato oracle");

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
