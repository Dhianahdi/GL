interface AuctionData {
   int getId();
   String getName();
   double getPrice();}
interface ExternalAuctionData {
   int getAuctionId();
   String getAuctionName();
   double getAuctionPrice();
}
class AuctionSystem {
   public AuctionData getAuctionData() {
       return new AuctionData() {
           @Override
           public int getId() {
               return 123;}
           @Override
           public String getName() {
               return "Example Auction";
           }
           @Override
           public double getPrice() {
               return 100.0;
           }
       };
   }
}


class ExternalAuctionService {
   public void sendData(ExternalAuctionData data) {
       System.out.println("Sending auction data to external service...");
       System.out.println("Auction ID: " + data.getAuctionId());
       System.out.println("Auction Name: " + data.getAuctionName());
       System.out.println("Auction Price: " + data.getAuctionPrice());
   }
}
class AuctionAdapter implements ExternalAuctionData {
   private AuctionData auctionData;
   public AuctionAdapter(AuctionData auctionData) {
       this.auctionData = auctionData;
   }
   @Override
   public int getAuctionId() {
       return auctionData.getId();
   }
   @Override
   public String getAuctionName() {
       return auctionData.getName();
   }
   @Override
   public double getAuctionPrice() {
       return auctionData.getPrice();
   }
}


public class Main {
   public static void main(String[] args) {
       // Récupération des données d'enchère depuis notre système
       AuctionSystem auctionSystem = new AuctionSystem();
       AuctionData auctionData = auctionSystem.getAuctionData();


       // Création de l'adaptateur et conversion des données
       AuctionAdapter adapter = new AuctionAdapter(auctionData);


       // Envoi des données adaptées au service externe d'enchères
       ExternalAuctionService externalService = new ExternalAuctionService();
       externalService.sendData(adapter);
   }
}
