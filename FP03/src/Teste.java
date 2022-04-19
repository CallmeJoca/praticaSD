public class Teste {
    public static void main(String[] str){
        try {
            MyThread Ta, Tb, Tc;

            ThreadGroup this_group = Thread.currentThread().getThreadGroup();

            System.out.println("O nome do grupo é: " + this_group.getName());
            System.out.println("O nº de Threads activas no grupo é " + this_group.activeCount());
            
            Ta = new MyThread("Thread A");
            Tb = new MyThread("Thread B");
            Tc = new MyThread("Thread C");
            
            Ta.setPriority(Thread.MAX_PRIORITY);
            Tb.setPriority(6);
            Tc.setPriority(Thread.MIN_PRIORITY);

            Ta.start();
            Tb.start();
            Tc.start();
            /*
            MyThread2 T = new MyThread2();

            Thread Td, Te;
            Td = new Thread(T);
            Te = new Thread(T);
            Td.start();
            Te.start();
            */

            System.out.println("O nome do grupo é: " + this_group.getName());
            System.out.println("O nº de Threads activas no grupo é " + this_group.activeCount());

            this_group.interrupt();

            System.out.println("Ta tem prioridade "+Ta.getPriority());
            System.out.println("Tb tem prioridade "+Tb.getPriority());
            System.out.println("Tc tem prioridade "+Tc.getPriority());
            

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }
}