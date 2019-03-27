public class DataAccessPolicyManager2
{
    private int WriteCount;
    private Semaphore mutex;
    private Semaphore wrt;
    public DataAccessPolicyManager2 () {
        WriteCount = 0;
        mutex = new Semaphore(1);
        wrt = new Semaphore(1);
    }

    public void acquireWriteLock() {
        mutex.acquire();
        ++WriteCount;
        if (WriteCount == 1) // This is the first reader
        wrt.acquire();
        mutex.release();
    }
    
    public void releaseWriteLock() {
        mutex.acquire();
        --WriteCount;
        if (WriteCount == 0) // Last reader
            wrt.release();
        mutex.release();
    }

    public void acquireReadLock() {
        wrt.acquire();
    }

    public void releaseReadLock() {
        wrt.release();
    }
}
