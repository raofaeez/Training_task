package LinkedList;
class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode n = new ItemNode(id, name, qty, price);
        n.next = head;
        head = n;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode n = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = n;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
    }
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        ItemNode n = new ItemNode(id, name, qty, price);
        n.next = temp.next;
        temp.next = n;
    }

    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Calculate total inventory value
    public double totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    // Merge Sort entry
    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {
        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(h, asc, byName);
        ItemNode right = mergeSort(next, asc, byName);

        return merge(left, right, asc, byName);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName)
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode h) {
        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode i) {
        System.out.println(
                "ID: " + i.itemId +
                        ", Name: " + i.itemName +
                        ", Qty: " + i.quantity +
                        ", Price: " + i.price
        );
    }
}

 class InventorySystem {
    public static void main(String[] args) {

        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd(101, "Pen", 50, 10);
        inv.addAtEnd(102, "Notebook", 30, 50);
        inv.addAtBeginning(103, "Pencil", 100, 5);
        inv.addAtPosition(2, 104, "Eraser", 40, 8);

        System.out.println("Inventory:");
        inv.displayAll();

        System.out.println("\nTotal Inventory Value: " + inv.totalInventoryValue());

        System.out.println("\nSorted by Name (Ascending):");
        inv.sortByName(true);
        inv.displayAll();

        System.out.println("\nSorted by Price (Descending):");
        inv.sortByPrice(false);
        inv.displayAll();
    }
}