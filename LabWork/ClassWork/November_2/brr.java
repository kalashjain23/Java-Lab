public class brr extends Thread
{
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("Hello", 500);
        t1.starrt();
        t1.sleepy();
    }
}

class MyThread extends Thread{
    String msg;
    int sleeptime;
    MyThread(String msg, int sleeptime){
        this.msg = msg;
        this.sleeptime = sleeptime;
    }

    void starrt(){
        System.out.println(msg);
    }

    void sleepy() throws InterruptedException {
        Thread.sleep(this.sleeptime);
    }
}
