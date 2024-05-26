package OpenClosed;

public abstract class Auction {
    protected int id;
    protected double price;
    protected String status;

    public Auction(int id, double price) {
        this.id = id;
        this.price = price;
        this.status = "Open";
    }

    public abstract void submitOffer(double offerPrice);

    public void closeAuction() {
        this.status = "Closed";
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
