public static Node removeDuplicates(Node head) {
    Node newHead = head, prev = null;

    Set<Integer> set = new HashSet<Integer>();

    while(head != null) {
        if(set.contains(head.data)) {
            prev.next = head.next;
        } else {
            set.add(head.data);
            prev = head;
        }
        head = head.next;
    }
    return newHead;
}
