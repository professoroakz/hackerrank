static void levelOrder(Node root) {
    if(root == null) return;
    LinkedList<Node> q = new LinkedList<Node>();
    q.add(root);

    while(!q.isEmpty()) {
        Node c = q.removeFirst();
        System.out.print(c.data + " ");
        if(c.left != null) q.add(c.left);
        if(c.right != null) q.add(c.right);
    }
}
