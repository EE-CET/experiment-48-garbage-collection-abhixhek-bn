public class GarbageCollection {

    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollection h = new GarbageCollection();

        h = null;

        System.gc();
    }
}
