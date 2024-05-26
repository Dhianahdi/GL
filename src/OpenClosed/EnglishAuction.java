package OpenClosed;

public class EnglishAuction extends Auction {
    public EnglishAuction(int id, double price) {
        super(id, price);
    }

    @Override
    public void submitOffer(double offerPrice) {
        if (offerPrice > this.price) {
            this.price = offerPrice;
        }
    }
}
