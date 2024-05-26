package OpenClosed;


public class DutchAuction extends Auction {
    public DutchAuction(int id, double price) {
        super(id, price);
    }

    @Override
    public void submitOffer(double offerPrice) {
        if (offerPrice < this.price) {
            this.price = offerPrice;
        }
    }
}

