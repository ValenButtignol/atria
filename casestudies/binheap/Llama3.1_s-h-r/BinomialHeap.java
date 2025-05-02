package system.classfixer.classes;

import java.util.*;

public class BinomialHeap {

    private BinomialHeapNode Nodes;

    private int size;

    public BinomialHeap() {
        Nodes = null;
        size = 0;
    }

    public void insert(int value) {
        BinomialHeapNode temp = new BinomialHeapNode(value);
        if (Nodes == null) {
            Nodes = temp;
            size = 1;
        } else {
            unionNodes(temp);
            size++;
        }
    }

    public void delete(int value) {
        if ((Nodes != null) && (Nodes.findANodeWithKey(value) != null)) {
            decreaseKeyValue(value, findMinimum() - 1);
            extractMin();
        }
    }

    public BinomialHeapNode extractMin() {
        if (Nodes == null)
            return null;
        BinomialHeapNode temp = Nodes, prevTemp = null;
        BinomialHeapNode minNode = Nodes.findMinNode();
        while (temp.key != minNode.key) {
            prevTemp = temp;
            temp = temp.sibling;
        }
        if (prevTemp == null) {
            Nodes = temp.sibling;
        } else {
            prevTemp.sibling = temp.sibling;
        }
        temp = temp.child;
        BinomialHeapNode fakeNode = temp;
        while (temp != null) {
            temp.parent = null;
            temp = temp.sibling;
        }
        if ((Nodes == null) && (fakeNode == null)) {
            size = 0;
        } else {
            if ((Nodes == null) && (fakeNode != null)) {
                Nodes = fakeNode.reverse(null);
                size = Nodes.size();
            } else {
                if ((Nodes != null) && (fakeNode == null)) {
                    size = Nodes.size();
                } else {
                    unionNodes(fakeNode.reverse(null));
                    size = Nodes.size();
                }
            }
        }
        return minNode;
    }

    public int findMinimum() {
        if (Nodes == null)
            throw new IllegalStateException();
        return Nodes.findMinNode().key;
    }

    public void decreaseKeyValue(int old_value, int new_value) {
        if (Nodes == null)
            throw new IllegalStateException();
        BinomialHeapNode temp = Nodes.findANodeWithKey(old_value);
        decreaseKeyNode(temp, new_value);
    }

    public void decreaseKeyNode(final BinomialHeapNode node, final int new_value) {
        if (node == null)
            return;
        BinomialHeapNode y = node;
        y.key = new_value;
        BinomialHeapNode z = node.parent;
        while ((z != null) && (node.key < z.key)) {
            int z_key = y.key;
            y.key = z.key;
            z.key = z_key;
            y = z;
            z = z.parent;
        }
    }

    private void merge(BinomialHeapNode binHeap) {
        BinomialHeapNode temp1 = Nodes, temp2 = binHeap;
        while ((temp1 != null) && (temp2 != null)) {
            if (temp1.degree == temp2.degree) {
                BinomialHeapNode tmp = temp2;
                temp2 = temp2.sibling;
                tmp.sibling = temp1.sibling;
                temp1.sibling = tmp;
                temp1 = tmp.sibling;
            } else {
                if (temp1.degree < temp2.degree) {
                    if ((temp1.sibling == null) || (temp1.sibling.degree > temp2.degree)) {
                        BinomialHeapNode tmp = temp2;
                        temp2 = temp2.sibling;
                        tmp.sibling = temp1.sibling;
                        temp1.sibling = tmp;
                        temp1 = tmp.sibling;
                    } else {
                        temp1 = temp1.sibling;
                    }
                } else {
                    BinomialHeapNode tmp = temp1;
                    temp1 = temp2;
                    temp2 = temp2.sibling;
                    temp1.sibling = tmp;
                    if (tmp == Nodes) {
                        Nodes = temp1;
                    }
                }
            }
        }
        if (temp1 == null) {
            temp1 = Nodes;
            while (temp1.sibling != null) {
                temp1 = temp1.sibling;
            }
            temp1.sibling = temp2;
        }
    }

    private void unionNodes(BinomialHeapNode binHeap) {
        merge(binHeap);
        BinomialHeapNode prevTemp = null, temp = Nodes, nextTemp = Nodes.sibling;
        while (nextTemp != null) {
            if ((temp.degree != nextTemp.degree) || ((nextTemp.sibling != null) && (nextTemp.sibling.degree == temp.degree))) {
                prevTemp = temp;
                temp = nextTemp;
            } else {
                if (temp.key <= nextTemp.key) {
                    temp.sibling = nextTemp.sibling;
                    nextTemp.parent = temp;
                    nextTemp.sibling = temp.child;
                    temp.child = nextTemp;
                    temp.degree++;
                } else {
                    if (prevTemp == null) {
                        Nodes = nextTemp;
                    } else {
                        prevTemp.sibling = nextTemp;
                    }
                    temp.parent = nextTemp;
                    temp.sibling = nextTemp.child;
                    nextTemp.child = temp;
                    nextTemp.degree++;
                    temp = nextTemp;
                }
            }
            nextTemp = temp.sibling;
        }
    }

    public static class BinomialHeapNode {

        private int key;

        private int degree;

        private BinomialHeapNode parent;

        private BinomialHeapNode sibling;

        private BinomialHeapNode child;

        public BinomialHeapNode(int k) {
            key = k;
            degree = 0;
            parent = null;
            sibling = null;
            child = null;
        }

        public int getKey() {
            return key;
        }

        public int getDegree() {
            return degree;
        }

        public BinomialHeapNode getParent() {
            return parent;
        }

        public BinomialHeapNode getSibling() {
            return sibling;
        }

        public BinomialHeapNode getChild() {
            return child;
        }

        public int size() {
            return (1 + ((child == null) ? 0 : child.size()) + ((sibling == null) ? 0 : sibling.size()));
        }

        private BinomialHeapNode reverse(BinomialHeapNode sibl) {
            BinomialHeapNode ret;
            if (sibling != null)
                ret = sibling.reverse(this);
            else
                ret = this;
            sibling = sibl;
            return ret;
        }

        BinomialHeapNode findMinNode() {
            BinomialHeapNode x = this, y = this;
            int min = x.key;
            while (x != null) {
                if (x.key < min) {
                    y = x;
                    min = x.key;
                }
                x = x.sibling;
            }
            return y;
        }

        BinomialHeapNode findANodeWithKey(int value) {
            BinomialHeapNode temp = this, node = null;
            while (temp != null) {
                if (temp.key == value) {
                    node = temp;
                    return node;
                }
                if (temp.child == null)
                    temp = temp.sibling;
                else {
                    node = temp.child.findANodeWithKey(value);
                    if (node == null)
                        temp = temp.sibling;
                    else
                        return node;
                }
            }
            return node;
        }
    }

    public boolean repOK_1() {
        if (Nodes == null) {
            return size == 0;
        } else {
            BinomialHeapNode temp = Nodes;
            while (temp != null) {
                if (temp.degree < 0) {
                    return false;
                }
                temp = temp.sibling;
            }
            return true;
        }
    }

    public boolean composedRepOK() {
        if (!repOK_1())
            return false;
        return true;
    }
}
