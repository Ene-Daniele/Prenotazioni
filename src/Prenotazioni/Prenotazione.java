package Prenotazioni;

public class Prenotazione {

    private String name;
    private int order;

    Prenotazione(String name){

        this.name = name;
        this.order = order;
    }

    public String getName() {

        return name;
    }
    public int getOrder() {

        return order;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
