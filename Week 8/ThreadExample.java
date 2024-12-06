class DisplayBMS implements Runnable {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public DisplayBMS() {
        Thread thread = new Thread(this);
        thread.start();
    }
}

class DisplayCSE implements Runnable {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public DisplayCSE() {
        Thread thread = new Thread(this);
        thread.start();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        new DisplayBMS();
        new DisplayCSE();
    }
}
