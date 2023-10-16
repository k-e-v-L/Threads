public class Main {
    public static void main(String[] args) throws InterruptedException {

        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("MAIN");
        //System.out.println(Thread.currentThread().getName());

        // Set the priority of the current thread to 10
        Thread.currentThread().setPriority(10);

        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Done!");
        */

        MyThread thread2 = new MyThread();

        // Set the thread2 as a daemon thread
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());

        // Start the thread2
        thread2.start();

        //System.out.println(thread2.isAlive());

        //thread2.setName("Second thread");
        //System.out.println(thread2.getName());

        //thread2.setPriority(1);
        //System.out.println(thread2.getPriority());

        // Print the number of active threads
        System.out.println(Thread.activeCount());
    }
}
