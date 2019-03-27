public class ReadersWritersSimulation2 {

    public static void main (String args[]) {
        DataAccessPolicyManager2 lockManager2 = new DataAccessPolicyManager2();

        Writer2 writer1 = new Writer2(lockManager2);
        Writer2 writer2 = new Writer2(lockManager2);
        Writer2 writer3 = new Writer2(lockManager2);
        Reader2 reader = new Reader2(lockManager2);

        writer1.start();
        writer2.start();
        writer3.start();
        reader.start();
    }
}
