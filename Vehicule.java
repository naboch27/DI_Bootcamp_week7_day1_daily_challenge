/**
 * Vehicule
 */
public class Vehicule {

    private int id;

    private String name;

    private String make;

    public Vehicule() {
    }

    public Vehicule(int id, String name, String make) {
        this.id = id;
        this.name = name;
        this.make = make;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void demarrer  (){

        System.out.println("Le vehicule a demarré");
    }

}