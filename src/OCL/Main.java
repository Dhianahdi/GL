package OCL;

import OCL.Auction;

public class Main {
    public static void main(String[] args) {

        Auction auction = new Auction(1, 100.0, "Open");
        System.out.println("Auction ID: " + auction.getId());
        System.out.println("Initial price: " + auction.getPrice());
        System.out.println("Status: " + auction.getStatus());

        auction.setPrice(150.0);
        System.out.println("Updated price: " + auction.getPrice());


        auction.setStatus("Closed");
        System.out.println("Updated status: " + auction.getStatus());


        try {
            auction.setStatus("InvalidStatus");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
