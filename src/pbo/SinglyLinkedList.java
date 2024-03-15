package pbo;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(double value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean delete(double value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Node search(double value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        // Insert some values
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);

        // Print the list
        System.out.print("List: ");
        myList.print();

        // Search for a value
        Node result = myList.search(20);
        System.out.println("Search result for 20: " + (result != null ? "Found" : "Not found"));

        // Delete a value
        boolean deleted = myList.delete(20);
        System.out.println("Deleted 20: " + (deleted ? "Success" : "Not found"));

        // Print the updated list
        System.out.print("Updated list: ");
        myList.print();
    }
}
