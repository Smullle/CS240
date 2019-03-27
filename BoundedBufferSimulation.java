public class BoundedBufferSimulation {
   public static void main (String args[]) {
      Buffer buffer = new Buffer();
      int ID = 0;

      // Create one producer and one consumer process
      Thread producer1 = new Thread(new Producer(buffer,ID++));
      Thread consumer1 = new Thread(new Consumer(buffer,ID++));
      Thread producer2 = new Thread(new Producer(buffer,ID++));
      Thread consumer2 = new Thread(new Consumer(buffer,ID++));


      producer1.start();
      consumer1.start();
      producer2.start();
      consumer2.start();

   }
}

