

public class AddTwoNums {
    ListNode l3 = null;
    ListNode curr = null;
    ListNode temp = null;
    int sum = 0;
    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            verifySum();
            if (l3 == null) {
                l3 = temp;
                curr = temp;
            } else {
                curr.next = temp;
                curr = curr.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null) {
            verifyCarry();
        } else {
            while (l1 != null) {
                addUnevenNumbers(l1);
                l1 = l1.next;
            }
            while (l2 != null) {
                addUnevenNumbers(l2);
                l2 = l2.next;
            }
            verifyCarry();
        }
        return l3;
    }


    public void verifySum() {
        if (sum > 9) {
            sum %= 10;
            carry = 1;
            temp = new ListNode(sum);
        } else {
            temp = new ListNode(sum);
            carry = 0;
        }
    }

    public void verifyCarry() {
        if (carry > 0) {
            temp = new ListNode(carry);
            curr.next = temp;
            curr = curr.next;
        }

    }


    public void addUnevenNumbers(ListNode listNode) {
        sum = listNode.val + carry;
        if (sum > 9) {
            sum %= 10;
            carry = 1;
            temp = new ListNode(sum);
        } else {
            temp = new ListNode(sum);
            carry = 0;
        }
        curr.next = temp;
        curr = curr.next;


    }


    public void display(ListNode listNode) {
        ListNode temp = listNode;
        if (listNode == null) {
            System.out.println("Empty");
            return;
        }
        while (listNode != null) {
            System.out.print(listNode.val);

            listNode = listNode.next;

        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNums a = new AddTwoNums();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        a.display(l1);

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        a.display(l2);

        ListNode sum = a.addTwoNumbers(l1, l2);
        a.display(sum);


    }
}
