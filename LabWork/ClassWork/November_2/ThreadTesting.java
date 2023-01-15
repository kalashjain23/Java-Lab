public class ThreadTesting {
    public static void main(String[] args) {
        for(int i = 0; i<3000; i++){
            System.out.println("hello i am child thread "+Thread.currentThread().getName()+":"+i);
        }
        Runnable r1 = new Runnable() {
            public void run() {
                for(int i=0; i<5000; i++){
                    System.out.println("welcome from child thread "+Thread.currentThread().getName()+": "+i);
                }
            }
        };
        try{

        }catch(Exception e){
            System.out.println("thread sleep interrupted!!");
        }

//        Thread t1 = new Thread(r1);
//        t1.setDaemon(true);
//        t1.start();
    }
}