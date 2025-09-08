public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // Count lengths
        int l1Count = 0, l2Count = 0;
        ListNode ptr1 = headA, ptr2 = headB;

        while (ptr1 != null) {
            l1Count++;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            l2Count++;
            ptr2 = ptr2.next;
        }

        // Move longer list's head forward by difference
        int len = Math.abs(l1Count - l2Count);
        if (l1Count > l2Count) {
            while (len-- > 0) headA = headA.next;
        } else {
            while (len-- > 0) headB = headB.next;
        }

        // Traverse both lists together until they meet
        while (headA != null && headB != null) {
            if (headA == headB) return headA; // same node
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
