public class Main {

    // =========================
    // NODE
    // =========================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head points to the first node
    Node head = null;


    // =========================
    // ADD AT START
    // =========================
    void addAtStart(int data) {

        Node newNode = new Node(data);

        // New node points to current head
        newNode.next = head;

        // Head becomes the new node
        head = newNode;
    }


    // =========================
    // ADD AT END
    // =========================
    void addAtEnd(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the last node
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Last node points to new node
        current.next = newNode;
    }


    // =========================
    // ADD AT MIDDLE / POSITION
    // =========================
    // Position starts from 0
    //
    // Example:
    // addAtPosition(25, 2)
    //
    // 10 -> 20 -> 30
    // becomes
    // 10 -> 20 -> 25 -> 30
    //
    void addAtPosition(int data, int position) {

        // Position 0 means add at beginning
        if (position == 0) {
            addAtStart(data);
            return;
        }

        Node newNode = new Node(data);

        Node current = head;

        // Move to node BEFORE the desired position
        for (int i = 0; i < position - 1; i++) {

            if (current == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        // If position is outside the list
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        // Connect new node
        newNode.next = current.next;

        // Connect previous node to new node
        current.next = newNode;
    }


    // =========================
    // DELETE AT START
    // =========================
    void deleteAtStart() {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Move head to second node
        head = head.next;
    }


    // =========================
    // DELETE AT END
    // =========================
    void deleteAtEnd() {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        // Find second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove last node
        current.next = null;
    }


    // =========================
    // DELETE AT POSITION
    // =========================
    // Position starts from 0
    //
    // Example:
    // 10 -> 20 -> 30 -> 40
    //
    // deleteAtPosition(2)
    //
    // Result:
    // 10 -> 20 -> 40
    //
    void deleteAtPosition(int position) {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 0) {
            deleteAtStart();
            return;
        }

        Node current = head;

        // Move to node BEFORE the node we want to delete
        for (int i = 0; i < position - 1; i++) {

            if (current == null || current.next == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        // If position doesn't exist
        if (current.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Skip the node we want to delete
        current.next = current.next.next;
    }


    // =========================
    // TRAVERSAL
    // =========================
    void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }


    // =========================
    // SEARCH
    // =========================
    boolean search(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {

        Main list = new Main();


        // --------------------------------
        // ADD AT END
        // --------------------------------
        System.out.println("Adding at end:");

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        list.traverse();

        // Output:
        // 10 -> 20 -> 30 -> null


        // --------------------------------
        // ADD AT START
        // --------------------------------
        System.out.println("\nAdding at start:");

        list.addAtStart(5);

        list.traverse();

        // Output:
        // 5 -> 10 -> 20 -> 30 -> null


        // --------------------------------
        // ADD AT POSITION
        // --------------------------------
        System.out.println("\nAdding at position:");

        list.addAtPosition(15, 2);

        list.traverse();

        // Output:
        // 5 -> 10 -> 15 -> 20 -> 30 -> null


        // --------------------------------
        // DELETE AT START
        // --------------------------------
        System.out.println("\nDelete at start:");

        list.deleteAtStart();

        list.traverse();

        // Output:
        // 10 -> 15 -> 20 -> 30 -> null


        // --------------------------------
        // DELETE AT POSITION
        // --------------------------------
        System.out.println("\nDelete at position:");

        list.deleteAtPosition(1);

        list.traverse();

        // Output:
        // 10 -> 20 -> 30 -> null


        // --------------------------------
        // DELETE AT END
        // --------------------------------
        System.out.println("\nDelete at end:");

        list.deleteAtEnd();

        list.traverse();

        // Output:
        // 10 -> 20 -> null


        // --------------------------------
        // SEARCH
        // --------------------------------
        System.out.println("\nSearching:");

        int value = 20;

        if (list.search(value)) {
            System.out.println(value + " found");
        } else {
            System.out.println(value + " not found");
        }


        // Search another value
        value = 100;

        if (list.search(value)) {
            System.out.println(value + " found");
        } else {
            System.out.println(value + " not found");
        }
    }
}
