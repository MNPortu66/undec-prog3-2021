public class Bird{
    private String name;

    public Bird() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "nombre del ave='" + name + '\'';
    }

}
