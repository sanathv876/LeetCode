import java.util.List;

public class Traversal {
    public ListNode head;
    public int size;

    public ListNode create(int num) {
        return new ListNode(num);
    }

    public void add(ListNode l) {
        if(head == null){
            head = l;
            size++;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = l;
        size++;
    }

    public void addFirst(ListNode listNode){
        listNode.next = head;
        head = listNode;
        size++;


    }

    public void display() {
        ListNode temp = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(temp !=null){
            System.out.println(temp.val);
            temp = temp.next;

        }
        System.out.println("Size: " + size );



    }

    public void remove(int value) {
        ListNode curr = head;
        ListNode prev = head;
        if(find(value) == null){
            return;
        }
        while(curr.val != value){
            prev = curr;
            curr = curr.next;
        }
        if (head == curr) {
            head = curr.next;
        }
        prev.next = curr.next;
        curr = null;
        size--;
    }


    public ListNode find(int val){
        ListNode temp = head;
        if(head == null){
            return null;
        }
        while(temp.val != val){
            temp = temp.next;
            if(temp == null){
                return null;
            }
        }

        return temp;
    }


    public void update(int findValue, int newValue) {
        ListNode found = find(findValue);
        found.val = newValue;

    }
    public void add(ListNode listNode, int position){
        if(position <= 0){
            addFirst(listNode);
            return;
        }
        ListNode curr = head;
        ListNode prev = head;
        int tempPos = 1;
        if(position>size){
            System.out.println("Position should be less than size");
            return;
        }
        while(tempPos < position){
            prev = curr;
            curr = curr.next;
            tempPos++;
        }
        listNode.next = curr;
        prev.next = listNode;
        size++;
    }

    public void removeAt(int position){

        ListNode curr = head;
        ListNode prev = head;
        int tempPos = 1;
        if(position > size){
            System.out.println("Position should be less than size");
            return;
        }else if(position <=0){
            head = curr.next;
            curr = null;
            size--;
            return;
        }
        while(tempPos < position){
            prev = curr;
            curr = curr.next;
            tempPos++;
        }
        prev.next = curr.next;
        curr = null;
        size --;
    }

    public void empty(){
        ListNode curr = head;
        while(head !=null){
            head = head.next;
            curr = null;
            curr= head;
        }

    }


    public static void main(String[] args) {
        Traversal t = new Traversal();
        t.add(new ListNode(5));
        //t.display();
        ListNode body = t.create(10);
        t.add(body);
        body = t.create(20);
        t.add(body);
        t.update(10,15);
        t.remove(50);
        //t.display();
        t.addFirst(new ListNode(50));
        body = new ListNode(51);
        t.add(body);
        t.addFirst(new ListNode(49));
        t.remove(49);
        t.add(new ListNode(60),2);
        t.empty();
        t.display();
    }
}
