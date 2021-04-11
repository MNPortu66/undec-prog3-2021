public class CreateBIrdMySQLDB implements IConnectionDB{
    Bird birdToSave = new Bird();

    @Override
    public void createBird(Bird birdToSave) {
        System.out.println("Se guarda el ave en base de dato MySQL");
    }
}
