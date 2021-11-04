package threadtesterr;

public class PrintMe implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                System.out.println("Numero: " + (i + 1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
