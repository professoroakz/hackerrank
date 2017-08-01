public static Node insert(Node head,int data) {
    Node toInsert = new Node(data);
    Node start = head;

    if(head == null) return toInsert;

    if(head.next == null) {
        head.next = toInsert;
        return head;
    }

    while(start.next != null) {
        start = start.next;
    }

    start.next = toInsert;
    return head;
}
