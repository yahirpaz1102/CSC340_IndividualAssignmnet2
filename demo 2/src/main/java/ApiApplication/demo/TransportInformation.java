package ApiApplication.demo;

public class TransportInformation {
    private int id;
    private String type;
    private String destination;
    private double price;


    public TransportInformation() {}

    public TransportInformation(int id, String type, String destination, double price) {
        this.id = id;
        this.type = type;
        this.destination = destination;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
