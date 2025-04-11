import java.util.List;

public class MergeLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        ListNode t3 = null;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 !=null && t2!= null){
            ListNode temp;
            if(t1.val == t2.val ){
                temp = new ListNode(t1.val);
                if(list3 == null){
                    list3 = temp;
                    t3 = temp;
                }else{
                    t3.next = temp;
                    t3 = t3.next;
                }
                temp = new ListNode(t2.val);
                t3.next = temp;
                t3 = t3.next;
                t1 = t1.next;
                t2 = t2.next;
            }else if(t1.val < t2.val){
                temp = new ListNode(t1.val);
                if(list3 == null){
                    list3 = temp;
                    t3 = temp;
                }else{
                    t3.next = temp;
                    t3= t3.next;

                }
                t1 = t1.next;
            }else{
                temp = new ListNode(t2.val);
                if(list3 == null){
                    list3 = temp;
                    t3 = temp;
                }else{
                    t3.next = temp;
                    t3 = t3.next;
                }
                t2 = t2.next;
            }
        }

        if(t1 !=null){
            if(list3 == null){
                return list1;
            }else{
                t3.next = t1;
            }

        } else if (t2 !=null) {
            if(list3 == null){
                return list2;
            }else{
                t3.next = t2;
            }
        }
        return list3;
    }


    public void display(ListNode l) {
        ListNode temp = l;
        if(l == null){
            System.out.println("Empty");
            return;
        }
        while(temp !=null){
            System.out.println(temp.val);
            temp = temp.next;

        }




    }

    public static void main(String[] args) {
        //ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        //ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode list2 = new ListNode(2,new ListNode(3,new ListNode(4)));
        MergeLinkedLists m = new MergeLinkedLists();
        ListNode sorted = m.mergeTwoLists(list1, list2);
        m.display(sorted);



    }
}
