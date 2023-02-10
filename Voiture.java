public class Voiture extends Vehicule{

    private Integer typePorte;

    public Voiture() {
    }

    public Voiture(Integer typePorte) {
        this.typePorte = typePorte;
    }

    public Integer getTypePorte() {
        return this.typePorte;
    }

    public void setTypePorte(Integer typePorte) {
        this.typePorte = typePorte;
    }


    @Override
    public String toString() {
        return "Voiture [typePorte=" + typePorte + "]";
    }

    public void activerAirBag(){
        System.out.println("L'air bag est activé");
    }
    
}
