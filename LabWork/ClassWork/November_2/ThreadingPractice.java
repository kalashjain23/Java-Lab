public class ThreadingPractice {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from Main Thread B" + Thread.currentThread().getName() + ":- i");
        }

        Runnable r1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Hello from child Thread " + Thread.currentThread().getName() + ":-" + i);
                }
            }
        };

        Thread t1 = new Thread(r1);

        t1.start();

    }
}