package GL.src.models;
    
 
    public class Auction {
    protected int id;
    protected Date date;
    protected double price;
    protected Date created_at;
    protected Date updated_at;
    protected int usern_id;
    protected String name;
    protected String status;
    protected String etat;

   
    public Auction(int id, Date date, double price, Date created_at, Date updated_at, int usern_id, String name,
            String status, String etat) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.usern_id = usern_id;
        this.name = name;
        this.status = status;
        this.etat = etat;
    }
    
    public boolean isValid() {
        return price > 0 && !status.equals("Cancelled");
    }
}


// Contrôleur pour gérer les opérations sur les enchères normales
class AuctionController {
    public void createAuction(Auction auction) {
        // Logique de création d'une nouvelle enchère normale
    }

    public void updateAuction(Auction auction) {
        // Logique de mise à jour d'une enchère normale existante
    }

    public void deleteAuction(int auctionId) {
        // Logique de suppression d'une enchère normale
    }

public Auction getAuctionDetails(int auctionId) {
        // Logique pour récupérer les détails d'une enchère normale
        return null; // Remplacer null par les détails de l'enchère










        public void create() {
        // Logique de création d'une enchère
    }

    public void update() {
        // Logique de mise à jour d'une enchère
    }

    public void delete() {
        // Logique de suppression d'une enchère
    }

    public AuctionDetails getDetails() {
        // Logique pour récupérer les détails d'une enchère
        return null; // Remplacer null par les détails de l'enchère
    }
}

class AuctionService {
    public void createAuction(Auction auction) {
        // Logique de création d'une enchère
    }

    public void updateAuction(Auction auction) {
        // Logique de mise à jour d'une enchère
    }

    public void deleteAuction(int auctionId) {
        // Logique de suppression d'une enchère
    }

    public AuctionDetails getAuctionDetails(int auctionId) {
        // Logique pour récupérer les détails d'une enchère
        return null; // Remplacer null par les détails de l'enchère
    }
}

class AuctionDetails {
    private int id;
    private Date date;
    private double price;
    private int userId;
    private String name;
    private String status;
    private String etat;

    // Getters et setters
}