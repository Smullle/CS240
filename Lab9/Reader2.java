public class Reader2 extends Thread {
    DataAccessPolicyManager2 lockManager;

    public Reader2 (DataAccessPolicyManager2 lockManager) {
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
