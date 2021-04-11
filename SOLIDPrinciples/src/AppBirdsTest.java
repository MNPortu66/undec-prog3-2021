public class AppBirdsTest {
    public static void main(String[] args) {
        Parrot bird1 =  new Parrot ();
        Penguin bird3 = new Penguin();
        CreateBirdOracleDB createBirdOracleDB = new CreateBirdOracleDB();
        CreateBIrdMySQLDB createBIrdMySQLDB = new CreateBIrdMySQLDB();

        createBIrdMySQLDB.createBird(bird1);
        createBirdOracleDB.createBird(bird3);

        System.out.println(bird1.toString());
        System.out.println(bird3.toString());


        bird1.eat();
        bird3.swims();

    }
}
