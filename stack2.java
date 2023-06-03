import java.util.Deque;
import java.util.LinkedList;

 class stack2 {
    public static void main(String[] args) {
        Deque<String> tumpuk1 = new LinkedList<String>();
        Deque<String> tumpuk2 = new LinkedList<String>();

        tumpuk1.push("Muhamad Nur Hanif");
        tumpuk1.push("Kuliah di Poliwangi");
        tumpuk1.push("Prodi TRPL");

        tumpuk2.push("Poliwangi");
        tumpuk2.push("TI AOS!!");
        tumpuk2.push("Jinggo");

        System.out.println(tumpuk1);
        System.out.println(tumpuk2);
    }
}
