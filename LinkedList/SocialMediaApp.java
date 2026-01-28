package LinkedList;

// Friend list node
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        friendId = id;
        next = null;
    }
}

// User node (main linked list)
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;   // Head of friend list
    UserNode next;

    UserNode(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

// Social media linked list
class SocialMedia {
    private UserNode head;

    // Add new user
    public void addUser(int id, String name, int age) {
        UserNode u = new UserNode(id, name, age);
        u.next = head;
        head = u;
    }

    // Find user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(u1, id2);
        addFriendToList(u2, id1);
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode f = new FriendNode(friendId);
        f.next = user.friends;
        user.friends = f;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        removeFriendFromList(u1, id2);
        removeFriendFromList(u2, id1);
    }

    private void removeFriendFromList(UserNode user, int fid) {
        FriendNode temp = user.friends;

        if (temp == null) return;

        if (temp.friendId == fid) {
            user.friends = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendId != fid)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode f = user.friends;
        if (f == null) {
            System.out.println("No friends");
            return;
        }

        while (f != null) {
            System.out.print(f.friendId + " ");
            f = f.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Search user by ID
    public void searchById(int id) {
        UserNode u = findUserById(id);
        if (u != null)
            displayUser(u);
        else
            System.out.println("User not found");
    }

    // Search user by name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Count friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void displayUser(UserNode u) {
        System.out.println(
                "ID: " + u.userId +
                        ", Name: " + u.name +
                        ", Age: " + u.age
        );
    }
}

// Main class
public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Aman", 20);
        sm.addUser(2, "Ravi", 21);
        sm.addUser(3, "Neha", 19);
        sm.addUser(4, "Simran", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.displayFriends(3);

        sm.mutualFriends(1, 2);

        sm.searchByName("Neha");
        sm.searchById(4);

        sm.countFriends();

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}
