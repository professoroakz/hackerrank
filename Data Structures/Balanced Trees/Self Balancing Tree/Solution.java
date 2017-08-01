/* Class node is defined as :
class Node
int val;   //Value
int ht;      //Height
Node left;   //Left child
Node right;   //Right child

*/

static int height(Node n) {
    if(n == null) return -1;
    return n.ht;
}

static int balanceFactor(Node n) {
    if(n == null) return -1;
    return height(n.left) - height(n.right);
}

static Node leftRotate(Node x) {
    Node y = x.right;
    Node misplaced = y.left;

    y.left = x;
    x.right = misplaced;

    x.ht = Math.max(height(x.left), height(x.right)) + 1;
    y.ht = Math.max(height(y.left), height(y.right)) + 1;

    return y;
}

static Node rightRotate(Node y) {
    Node x = y.left;
    Node misplaced = x.right;

    x.right = y;
    y.left = misplaced;

    x.ht = Math.max(height(x.left), height(x.right)) + 1;
    y.ht = Math.max(height(y.left), height(y.right)) + 1;

    return x;
}

static Node insert(Node root,int val) {
    if(root == null) {
        Node n = new Node();
        n.val = val;
        return n;
    }

    if(val < root.val) {
        root.left = insert(root.left, val);
    } else if(val > root.val) {
        root.right = insert(root.right, val);
    } else {
        return root;
    }

    root.ht = 1 + Math.max(height(root.left), height(root.right));

    int balanceFactor = balanceFactor(root);

    if(balanceFactor > 1 && val < root.left.val) {
        return rightRotate(root);
    }

    if(balanceFactor > 1 && val > root.left.val) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }

    if(balanceFactor < -1 && val > root.right.val) {
        return leftRotate(root);
    }

    if(balanceFactor < -1 && val < root.right.val) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }

    return root;
}
