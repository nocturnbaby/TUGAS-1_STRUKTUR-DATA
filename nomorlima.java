import java.util.LinkedList;
public class nomorlima {
    public static void main(String[] args) {
        LinkedList<Integer> listAngka = new LinkedList<>();

        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.println("Isi Linked List 'List Angka' :");
        for (Integer angka : listAngka) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }
}
