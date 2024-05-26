import java.time.LocalDateTime;
class Auction {
   private int id;
   private LocalDateTime date;
   private double price;
   private int userId;
   private String name;
   private String status;
   public Auction(int id, LocalDateTime date, double price, int userId, String name, String status) {
       this.id = id;
       this.date = date;
       this.price = price;
       this.userId = userId;
       this.name = name;
       this.status = status;
   }
   public int getId() {
       return id;
   }
   public LocalDateTime getDate() {
       return date;
   }
   public double getPrice() {
       return price;
   }
   public int getUserId() {
       return userId;
   }
   public String getName() {
       return name;
   }
   public String getStatus() {
       return status;
  }
}
class FixedPriceAuction extends Auction {
   public FixedPriceAuction(int id, LocalDateTime date, double price, int userId, String name, String status) {
       super(id, date, price, userId, name, status);
   }
}
