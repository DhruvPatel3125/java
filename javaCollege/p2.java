// Write an application that creates and start three threads, each thread is instantiated from the
// same class. It executes a loop with 5 iterations. First thread display "BEST"', second thread
// display "OF" and last thread display "LUCK". All threads sleep for 1000 ms. The application
// waits for all threads to complete and display a message.


class DisplayThread extends Thread {
    private String message;

    public DisplayThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(message);
                Thread.sleep(1000); // Sleep for 1000 ms
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class p2 {
    public static void main(String[] args) {
        // Create threads
        DisplayThread thread1 = new DisplayThread("BEST");
        DisplayThread thread2 = new DisplayThread("OF");
        DisplayThread thread3 = new DisplayThread("LUCK");

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Final message
        System.out.println("All threads have completed. Good Luck!");
    }
}
