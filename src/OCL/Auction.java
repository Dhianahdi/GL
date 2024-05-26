package OCL;

public class Auction {
    private int id;
    private double price;
    private String status;

    public Auction(int id, double price, String status) {
        this.id = id;
        this.price = price;
        this.setStatus(status);
    }

    public void setStatus(String status) {
        if (status.equals("Open") || status.equals("Closed")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Le statut de l'enchère doit être 'Open' ou 'Closed'.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }
}
