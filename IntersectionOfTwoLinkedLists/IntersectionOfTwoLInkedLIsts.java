public class Solution {
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;

        Node skipA = headA;
        Node skipB = headB;

        while (skipA != pB) {
            skipA = (skipA == null) ? headB : skipA.next;
            skipB = (skipB == null) ? headA : skipB.next;
        }

        return skipA; 
    }
}