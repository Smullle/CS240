public class Writer extends Thread {

    DataAccessPolicyManager lockManager;
    
    public Writer (DataAccessPolicyManager lockManager) {
        this.lockManager = lockManager;
    }

    public void run() {
            while(true){
            lockManager.acquireWriteLock();
            System.out.println("Writing...........");            
            try{
                sleep(5000);
            }        
            catch(InterruptedException e){}
            lockManager.releaseWriteLock();
        }
    }
}
