import java.util.*;

public class Main {
    LinkedList<Integer> a = new LinkedList<>();

    public void insertbeg(int x) {
        a.addFirst(x);
    }

    public void insertatposition(int m, int x) {
        if (m < 0 || m > a.size()) {
            System.out.println("Invalid position");
            return;
        }
        a.add(m, x);
    }

    public void delete(int m) {
        if (m < 0 || m >= a.size()) {
            System.out.println("Invalid position");
            return;
        }
        a.remove(m);
    }

    public boolean search(int x) {
        return a.contains(x);
    }

    public void display() {
        if (a.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void mid() {
        if (a.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        int m = a.size() / 2;
        System.out.println("Middle element: " + a.get(m));
    }

    public void reverse() {
        Collections.reverse(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        int choice;

        do {
            System.out.println("\n--- Linked List Operations ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at position");
            System.out.println("3. Delete at position");
            System.out.println("4. Search element");
            System.out.println("5. Display list");
            System.out.println("6. Middle element");
            System.out.println("7. Reverse list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at beginning: ");
                    int val1 = sc.nextInt();
                    ob.insertbeg(val1);
                    break;

                case 2:
                    System.out.print("Enter position to insert: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter element: ");
                    int val2 = sc.nextInt();
                    ob.insertatposition(pos, val2);
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    int del = sc.nextInt();
                    ob.delete(del);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int s = sc.nextInt();
                    if (ob.search(s)) {
                        System.out.println(s + " found in the list");
                    } else {
                        System.out.println(s + " not found");
                    }
                    break;

                case 5:
                    ob.display();
                    break;

                case 6:
                    ob.mid();
                    break;

                case 7:
                    ob.reverse();
                    System.out.println("List reversed.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}
