package casestudies.avltree;

public class AvlTree {
    static final int ALLOWED_IMBALANCE = 1;
    public AvlNode root;

    public AvlTree() {
        root = null;
    }

    public void insert(int x) {
        root = insert(x, root);
    }

    public void remove(int x) {
        root = remove(x, root);
    }

    private AvlNode remove(int x, AvlNode t) {
        if (t == null)
            return t;

        if (x < t.element)
            t.left = remove(x, t.left);
        else if (x > t.element)
            t.right = remove(x, t.right);
        else if (t.left != null && t.right != null)
        {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else
            t = (t.left != null) ? t.left : t.right;
        return balance(t);
    }

    public int findMin() {
        if (isEmpty())
            throw new RuntimeException();
        return findMin(root).element;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private AvlNode balance(AvlNode t) {
        if (t == null)
            return t;

        if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE)
            if (height(t.left.left) >= height(t.left.right))
                t = rotateWithLeftChild(t);
            else
                t = doubleWithLeftChild(t);
        else if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE)
            if (height(t.right.right) >= height(t.right.left))
                t = rotateWithRightChild(t);
            else
                t = doubleWithRightChild(t);

        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }

    private AvlNode insert(int x, AvlNode t) {
        if (t == null)
            return new AvlNode(x, null, null);

        if (x < t.element)
            t.left = insert(x, t.left);
        else if (x > t.element)
            t.right = insert(x, t.right);
        else
            ;
        return balance(t);
    }

    private AvlNode findMin(AvlNode t) {
        if (t == null)
            return t;

        while (t.left != null)
            t = t.left;
        return t;
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    private AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }

    private AvlNode rotateWithRightChild(AvlNode k1) {
        AvlNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(height(k2.right), k1.height) + 1;
        return k2;
    }

    private AvlNode doubleWithLeftChild(AvlNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    private AvlNode doubleWithRightChild(AvlNode k1) {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }

    public static class AvlNode {
        public int element;
        public AvlNode left;
        public AvlNode right;
        public int height;

        public AvlNode() {
        }

        public AvlNode(int theElement) {
            this(theElement, null, null);
        }

        public AvlNode(int theElement, AvlNode lt, AvlNode rt) {
            element = theElement;
            left = lt;
            right = rt;
            height = 0;
        }
    }

    public boolean property() {
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBst(AvlNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.element <= min || node.element >= max) {
            return false;
        }
        return isBst(node.left, min, node.element) && isBst(node.right, node.element, max);
    }
}