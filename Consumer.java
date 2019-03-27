import java.util.Date;
public class Consumer implements Runnable {
   private Buffer buffer;
   private int ID = 0;

   public Consumer(Buffer buffer,int ID) {
      this.buffer = buffer;
      this.ID = ID;      
   }

   public void run() {
      Date message;

      while (true) {
         try {
            Thread.sleep(1000); // sleep for 1000 ms
         } catch (InterruptedException e) {}
         message = (Date) buffer.remove(); 
         // consume the item
         System.out.println("Removed "+ message + " " + ID);
      }
   }
}

