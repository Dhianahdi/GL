package GL.src.models;
public class ReverseAuction extends Auction {
    // Attributs spécifiques aux enchères inversées

    public ReverseAuction(int id, Date date, double price, Date created_at, Date updated_at, int usern_id, String name,
            String status, String etat) {
        super(id, date, price, created_at, updated_at, usern_id, name, status, etat);
    }
}

class ReverseAuctionController {
    public void createReverseAuction(ReverseAuction reverseAuction) {
        // Logique de création d'une nouvelle enchère inversée
    }

    public void updateReverseAuction(ReverseAuction reverseAuction) {
        // Logique de mise à jour d'une enchère inversée existante
    }

    public void deleteReverseAuction(int reverseAuctionId) {
        // Logique de suppression d'une enchère inversée
    }

    public ReverseAuction getReverseAuctionDetails(int reverseAuctionId) {
        // Logique pour récupérer les détails d'une enchère inversée
        return null; // Remplacer null par les détails de l'enchère inversée
    }
}
