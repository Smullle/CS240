public class ReadersWritersSimulation {

    public static void main (String args[]) {
        DataAccessPolicyManager lockManager = new DataAccessPolicyManager();

        Reader reader1 = new Reader(lockManager);
        Reader reader2 = new Reader(lockManager);
        Reader reader3 = new Reader(lockManager);
        Writer writer = new Writer(lockManager);

        reader1.start();
        reader2.start();
        reader3.start();
        writer.start();
    }
}
