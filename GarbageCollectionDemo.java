public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Create a large number of objects
        for (int i = 0; i < 100000; i++) {
            new Object();
        }

        // Set all references to those objects to null
        // This should make those objects eligible for garbage collection
        Object[] objects = new Object[100000];
        for (int i = 0; i < 100000; i++) {
            objects[i] = null;
        }

        // Request the JVM to perform garbage collection
        System.gc();

        // Wait for a bit to allow garbage collection to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the current memory usage
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Total memory: " + totalMemory);
        System.out.println("Free memory: " + freeMemory);
        System.out.println("Used memory: " + (totalMemory - freeMemory));
    }
}