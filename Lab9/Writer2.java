public class Writer2 extends Thread {

    DataAccessPolicyManager2 lockManager;
    
    public Writer2 (DataAccessPolicyManager2 lockManager) {
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
