import com.soap.listnode.ListNode;

/**
 * @author yangfuzhao on 2021/11/3.
 */
public class ListNodeTest {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ListNode last = null;

        ListNode reverseList = reverseListN(l,3);
        System.out.println(reverseList);

    }

    public static ListNode reverseListN(ListNode head,int n) {
        if (n == 1){

        }

        if (head == null || head.next == null) return head;
        ListNode last = reverseListN(head.next,n);
        head.next.next = head;
        head.next = null;
        return last;
    }


}
