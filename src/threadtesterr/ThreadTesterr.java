package threadtesterr;

public class ThreadTesterr {

    public static void main(String[] args) {
        Runnable h1 = new PrintMe();
        Runnable h2 = new PrintMe();
        Runnable h3 = new PrintMe();

        Thread hilo = new Thread(h1);
        hilo.start();
        Thread hilo2 = new Thread(h1);
        hilo2.start();
        Thread hilo3 = new Thread(h2);
        hilo3.start();
        /*try {
            new Thread(h1).start();
            new Thread(h2).start();
            new Thread(h3).start();
        }catch(Exception e){System.out.println(e.getMessage());}*/

    }

}
