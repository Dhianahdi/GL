import java.util.Date;
import java.time.LocalDateTime;
class Auction {
   private int id;
   private LocalDateTime date;
   private double price;
   private int userId;
   private String name;
   private String status;
   // Constructeur
   public Auction(int id, LocalDateTime date, double price, int userId, String name, String status) {
       this.id = id;
       this.date = date;
       this.price = price;
       this.userId = userId;
       this.name = name;
       this.status = status;
   }
   // Getters
   public int getId() { return id; }
   public LocalDateTime getDate() { return date; }
   public double getPrice() { return price; }
   public int getUserId() { return userId; }
   public String getName() { return name; }
   public String getStatus() { return status; }
}


class User {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private boolean isVerified;


   // Constructeur
   public User(int id, String firstName, String lastName, String email, boolean isVerified) {
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.isVerified = isVerified;
   }


   // Getters
   public int getId() { return id; }
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public String getEmail() { return email; }
   public boolean isVerified() { return isVerified; }
}
