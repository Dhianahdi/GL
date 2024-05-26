import java.time.LocalDateTime;
import java.util.Date;
public class User {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String roles;
   private String password;
   private boolean isVerified;
   private Date birthDate;
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;
   private int auctionRoomId;
   private long number;
   private String country;
   private String region;
   private String image;
   private Date bsub;
   private Date esub;
   private int subscriptionId;


   public User(int id, String firstName, String lastName, String email, String roles, String password, boolean isVerified, Date birthDate, LocalDateTime createdAt, LocalDateTime updatedAt, int auctionRoomId, long number, String country, String region, String image, Date bsub, Date esub, int subscriptionId) {
       if (firstName.length() < 2) {
           throw new IllegalArgumentException("Le prénom de l'utilisateur doit contenir au moins deux caractères.");
       }


       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.roles = roles;
       this.password = password;
       this.isVerified = isVerified;
       this.birthDate = birthDate;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.auctionRoomId = auctionRoomId;
       this.number = number;
       this.country = country;
       this.region = region;
       this.image = image;
       this.bsub = bsub;
       this.esub = esub;
       this.subscriptionId = subscriptionId;
   }
   // Getters and setters...
}
