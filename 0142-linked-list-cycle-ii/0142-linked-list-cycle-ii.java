class Solution
 {
    ListNode detectCycle(ListNode head) 
    {
        Set<ListNode> visited = new HashSet<>(); // Store nodes themselves, not just values
        ListNode current = head;

        while (current != null)
         {
            if (visited.contains(current)) 
            {
                return current; // Cycle detected, return the node where the cycle begins
            }
            visited.add(current);
            current = current.next;
        }

        return null; // No cycle found
    }
}