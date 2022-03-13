public class Teste {
    public static void main(String[] str){
        MyThread Ta, Tb;
        Ta = new MyThread();
        Tb = new MyThread();
        Ta.start();
        Tb.start();

        MyThread2 T = new MyThread2();

        Thread Tc, Td;
        Tc = new Thread(T);
        Td = new Thread(T);
        Ta.start();
        Tb.start();
    }
}
