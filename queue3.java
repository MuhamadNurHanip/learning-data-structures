import java.util.PriorityQueue;
import java.util.Queue;

class PraktikumQueue3 {
    public static void main(String[] args) {
        Queue<String> wq = new PriorityQueue<>();

        wq.add("Poliwangi");
        wq.add("TRPL");
        wq.add("JINGGO");

        System.out.println("Initial Queue :" + wq);
        System.out.println("Before Remove :" +wq);
        System.out.println("Poll Method :" + wq.poll());
        System.out.println("Final Queue : " + wq);
        
    }
}
