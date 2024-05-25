package GL.src.models;
public abstract class AuctionCreator {
    // Attributs communs à toutes les classes créatrices d'enchères
    protected int id;
    protected Date date;
    protected double price;
    protected Date created_at;
    protected Date updated_at;
    protected int usern_id;
    protected String name;
    protected String status;
    protected String etat;

    public abstract Auction createAuction();
}

public class NormalAuctionCreator extends AuctionCreator {
    // Attributs spécifiques à la création d'enchères normales

    @Override
    public Auction createAuction() {
        // Logique de création d'une enchère normale
        return new Auction(id, date, price, created_at, updated_at, usern_id, name, status, etat);
    }
}

public class ReverseAuctionCreator extends AuctionCreator {
    // Attributs spécifiques à la création d'enchères inversées

    @Override
    public Auction createAuction() {
        // Logique de création d'une enchère inversée
        return new ReverseAuction(id, date, price, created_at, updated_at, usern_id, name, status, etat);
    }
}
