package OpenClosed;

import OpenClosed.Auction;
import OpenClosed.EnglishAuction;
import OpenClosed.DutchAuction;

public class Main {
    public static void main(String[] args) {

        Auction englishAuction = new EnglishAuction(1, 100.0);
        System.out.println("English Auction initial price: " + englishAuction.getPrice());
        englishAuction.submitOffer(120.0);
        System.out.println("English Auction new price: " + englishAuction.getPrice());
        englishAuction.closeAuction();
        System.out.println("English Auction status: " + englishAuction.getStatus());

        Auction dutchAuction = new DutchAuction(2, 100.0);
        System.out.println("Dutch Auction initial price: " + dutchAuction.getPrice());
        dutchAuction.submitOffer(80.0);
        System.out.println("Dutch Auction new price: " + dutchAuction.getPrice());
        System.out.println("Dutch Auction status: " + dutchAuction.getStatus());
    }
}
