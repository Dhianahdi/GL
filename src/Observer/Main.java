package Observer;
import java.util.ArrayList;
import java.util.List;

class Auction {
    private List<AuctionObserver> observers = new ArrayList<>();
    private int id;
    private double price;
    private String status;

    public void addObserver(AuctionObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AuctionObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (AuctionObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setId(int id) {
        this.id = id;
        notifyObservers();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
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

interface AuctionObserver {
    void update(Auction auction);
}

class User implements AuctionObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Auction auction) {
        System.out.println("Notification pour l'utilisateur " + name + ": l'enchère #" + auction.getId() + " a changé de prix : " + auction.getPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();
        User user1 = new User("Louai");
        User user2 = new User("Mouhib");

        auction.addObserver(user1);
        auction.addObserver(user2);

        auction.setId(1);
        auction.setPrice(100.0);
    }
}
