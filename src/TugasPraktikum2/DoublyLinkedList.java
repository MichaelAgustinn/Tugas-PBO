package TugasPraktikum2;

public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method untuk menambahkan node baru di akhir linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method untuk mencetak isi linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        // Menambahkan beberapa elemen ke linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // Mencetak isi linked list
        System.out.println("Linked List:");
        list.printList();
    }
}
