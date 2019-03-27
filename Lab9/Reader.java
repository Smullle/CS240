public class Reader extends Thread {
    DataAccessPolicyManager lockManager;

    public Reader (DataAccessPolicyManager lockManager) {
        this.lockManager = lockManager;        
    }
    
    public void run() {
        while(true){        
            lockManager.acquireReadLock();
    
            System.out.println("Reading...............");
            
            try{
                sleep(5000);
            }
            catch(InterruptedException e) {}
            lockManager.releaseReadLock();
        }
    }
}
