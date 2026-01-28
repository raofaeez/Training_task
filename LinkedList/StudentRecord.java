package LinkedList;

    class node{
            int roll;
            String name;
            int age;
            char grade;
            node next;
            node(int r,String n,int a,char c){
                roll=r;
                age=a;
                name=n;
                grade=c;
                next=null;
            }
    }
    class Linkedlist{
        private node head;
        public void addBegin(int roll,String name,int age,char c){
            node n=new node(roll,name,age,c);
            n.next=head;
            head=n;
        }
        public void addEnd(int roll,String name,int age,char c){
            node n=new node(roll,name,age,c);
            if(head==null){
                head=n;
                return;
            }
            node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next= n;
        }
        public void addPos(int pos,int roll,String name,int age,char c){
            if(pos<=0){
                System.out.println("Invalid Position");
                return;
            }
            if(pos==1){
                addBegin(roll, name, age, c);
                return;
            }
            node n=new node(roll,name,age,c);
            node temp=head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("position out of range");
                return;
            }
            n.next=temp.next;
            temp.next=n;
        }
        public void deleteByRoll(int roll){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(head.roll==roll){
                head=head.next;
                System.out.println("Student record deleted");
                return ;
            }
            node temp=head;
            while(temp.next!=null && temp.next.roll!=roll){
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.println("student not found");
            }else{
                temp.next=temp.next.next;
                System.out.println("student deleted");
            }
        }
        public void searchRoll(int roll){
            node temp=head;
            while(temp!=null){
                if(temp.roll==roll){
                    System.out.println("student founded");
                    display(temp);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("student not found with given roll number");
        }
        public void updateGrade(int roll, char newGrade) {
            node temp = head;
            while (temp != null) {
                if (temp.roll == roll) {
                    temp.grade = newGrade;
                    System.out.println("Grade updated successfully");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Student not found");
        }
        public void displayAll() {
            if (head == null) {
                System.out.println("No student records available");
                return;
            }
            node temp = head;
            while (temp != null) {
                display(temp);
                temp = temp.next;
            }
        }
        private void display(node s) {
            System.out.println(
                    "Roll: " + s.roll +
                            ", Name: " + s.name +
                            ", Age: " + s.age +
                            ", Grade: " + s.grade
            );
        }
    }
public class StudentRecord {
   public static void main(String[] args) {
       Linkedlist list = new Linkedlist(); // FIXED: node → Linkedlist


       list.addBegin(1, "Aman", 20, 'A');
       list.addEnd(2, "Ravi", 21, 'B');
       list.addEnd(3, "Neha", 19, 'A');
       list.addPos(2, 4, "Simran", 22, 'C');
       System.out.println("All Students:");
       list.displayAll();
       System.out.println("\nSearch Roll 2:");
       list.searchRoll(2);
       System.out.println("\nUpdate Grade of Roll 3:");
       list.updateGrade(3, 'A');
       System.out.println("\nDelete Roll 1:");
       list.deleteByRoll(1);
       System.out.println("\nFinal Student List:");
       list.displayAll();
       System.out.println("\nUpdate Grade of Roll 3:");
       list.updateGrade(3, 'A');
       System.out.println("\nDelete Roll 1:");
       list.deleteByRoll(1);
       System.out.println("\nFinal Student List:");
       list.displayAll();
    }
}
