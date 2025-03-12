package casestudies.binomialheap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


/**
 * @SpecField nodes: set BinomialHeapNode from this.Nodes, this.nodes.child, this.nodes.sibling, this.nodes.parent
 * | this.nodes = this.Nodes.*(child @+ sibling) @- null ;
 */

/**
 * @Invariant (all n : BinomialHeapNode | ( n in this.Nodes. * ( sibling @ +
 *child) @- null => ( ( n.parent!=null => n.key >= n.parent.key ) &&
 * ( n.child!=null => n !in n.child.*(sibling @+ child) @- null ) &&
 * ( n.sibling!=null => n !in n.sibling.*(sibling @+ child) @- null )
 * && ( ( n.child !=null && n.sibling!=null ) => ( no m:
 * BinomialHeapNode | ( m in n.child.*(child @+ sibling) @- null && m
 * in n.sibling.*(child @+ sibling) @- null )) ) && ( n.degree >= 0 )
 * && ( n.child=null => n.degree = 0 ) && ( n.child!=null
 * =>n.degree=#(n.child.*sibling @- null) ) && ( #( ( n.child @+
 * n.child.child.*(child @+ sibling) ) @- null ) = #( ( n.child @+
 * n.child.sibling.*(child @+ sibling)) @- null ) ) && (
 * n.child!=null => ( all m: BinomialHeapNode | ( m in
 * n.child.*sibling@-null => m.parent = n ) ) ) && ( (
 * n.sibling!=null && n.parent!=null ) => ( n.degree >
 * n.sibling.degree ) ) ))) &&
 * <p>
 * ( this.size = #(this.Nodes.*(sibling @+ child) @- null) ) && ( all
 * n: BinomialHeapNode | n in this.Nodes.*sibling @- null => ( (
 * n.sibling!=null => n.degree < n.sibling.degree ) && (
 * n.parent=null ) )) ;
 */
public class BinomialHeap {

    public /* @ nullable @ */ BinomialHeapNode Nodes;
    public int size;

    public BinomialHeap() {
        Nodes = null;
        size = 0;
    }


    // 4. Insert a node with a specific value

    /**
     * @Modifies_Everything
     * @Requires some this.nodes ;
     * @Ensures (some x : BinomialHeapNode | x in this.nodes & & x.key = = return) &&
     * ( all y : BinomialHeapNode | ( y in this.nodes && y!=return ) =>
     * return <= y.key ) ;
     */
    public int findMinimum() {
        return Nodes.findMinNode().key;
    }

    // 5. Extract the node with the minimum key

    // 3. Unite two binomial heaps
    // helper procedure
    private void merge(/* @ nullable @ */BinomialHeapNode binHeap) {
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

    // another helper procedure
    private void unionNodes(/* @ nullable @ */BinomialHeapNode binHeap) {
        merge(binHeap);

        BinomialHeapNode prevTemp = null, temp = Nodes, nextTemp = Nodes.sibling;

        while (nextTemp != null) {
            if ((temp.degree != nextTemp.degree)
                    || ((nextTemp.sibling != null) && (nextTemp.sibling.degree == temp.degree))) {
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

    /**
     * @Modifies_Everything
     * @Ensures some n: BinomialHeapNode | ( n !in @old(this.nodes) && this.nodes
     * = @old(this.nodes) @+ n && n.key = value ) ;
     */
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

    /**
     * @Modifies_Everything
     * @Ensures (@ old ( this).@old(Nodes)==null => ( this.Nodes==null && return==null
     * ) ) && ( @old(this).@old(Nodes)!=null => ( (return
     * in @old(this.nodes)) && ( all y : BinomialHeapNode | ( y
     * in @old(this.nodes.key) && y.key >= return.key ) ) &&
     * (this.nodes=@old(this.nodes) @- return ) && (this.nodes.key @+
     * return.key = @old(this.nodes.key) ) ));
     */
    public/* @ nullable @ */BinomialHeapNode extractMinBugged() {
        if (Nodes == null)
            return null;

        BinomialHeapNode temp = Nodes, prevTemp = null;
        BinomialHeapNode minNode = null;

        minNode = Nodes.findMinNode();
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
                size--;
            } else {
                if ((Nodes != null) && (fakeNode == null)) {
                    size--;
                } else {
                    unionNodes(fakeNode.reverse(null));
                    size--;
                }
            }
        }

        return minNode;
    }

    public /* @ nullable @ */BinomialHeapNode extractMinFixed() {
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
                // FIX
                size = Nodes.size();
                // BUG
                // size--;
            } else {
                if ((Nodes != null) && (fakeNode == null)) {
                    // FIX
                    size = Nodes.size();
                    // BUG
                    // size--;
                } else {
                    unionNodes(fakeNode.reverse(null));
                    // FIX
                    size = Nodes.size();
                    // BUG
                    // size--;
                }
            }
        }

        return minNode;
    }

    /**
     * ------------repOK routine and related routines--------------
     */

    // 6. Decrease a key value
    public void decreaseKeyValue(int old_value, int new_value) {
        BinomialHeapNode temp = Nodes.findANodeWithKey(old_value);
        decreaseKeyNode(temp, new_value);
    }

    /**
     * @Modifies_Everything
     * @Requires node in this.nodes && node.key >= new_value ;
     * @Ensures (some other : BinomialHeapNode | other in this.nodes & & other ! = node
     *& & @ old ( other.key)=@old(node.key)) ? this.nodes.key
     * = @old(this.nodes.key) @+ new_value : this.nodes.key
     * = @old(this.nodes.key) @- @old(node.key) @+ new_value ;
     */
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

    // 7. Delete a node with a certain key
    public void delete(int value) {
        if ((Nodes != null) && (Nodes.findANodeWithKey(value) != null)) {
            decreaseKeyValue(value, findMinimum() - 1);
            extractMinFixed();
        }
    }

    /**
     * checks that the current binomial heap satisfies its representation
     * invariants, which means checking that list of trees has no cycles, the total
     * size is consistent, the degrees of all trees are binomial and the keys are
     * heapified.
     *
     * @return true iff this binomialHeap satisfies the corresponding representation
     * invariants
     */

    public boolean preH() {
        if (!isTreeWithParentReferencesStructure())
            return false;
        if (!checkDegrees(size))
            return false;
        return true;
    }

    public boolean preP() {
        if (!checkHeapified())
            return false;
        return true;
    }

    public boolean pre() {
        return preH() && preP();
    }

    public boolean isTreeWithParentReferencesStructure() {
        if (Nodes == null)
            return size == 0;
        if (Nodes.parent != null)
            return false;

        Set<BinomialHeapNode> visited = new HashSet<BinomialHeapNode>();
        LinkedList<BinomialHeapNode> worklist = new LinkedList<>();
        visited.add(Nodes);
        worklist.add(Nodes);

        while (!worklist.isEmpty()) {
            BinomialHeapNode current = worklist.removeFirst();

            BinomialHeapNode sibling = current.sibling;
            if (sibling != null) {
                if (!visited.add(sibling))
                    return false;
                if (sibling.parent != current.parent)
                    return false;
                worklist.add(sibling);
            }

            BinomialHeapNode child = current.child;
            if (child != null) {
                if (!visited.add(child))
                    return false;
                if (child.parent != current)
                    return false;
                worklist.add(child);
            }
        }
        return visited.size() == size;
    }

    boolean checkDegrees(int size) {
        if (Nodes == null)
            return true;
        int degree_ = size;
        int rightDegree = 0;
        for (BinomialHeapNode current = Nodes; current != null; current = current.sibling) {
            if (degree_ == 0)
                return false;
            while ((degree_ & 1) == 0) {
                rightDegree++;
                degree_ /= 2;
            }
            if (!current.checkDegree(rightDegree))
                return false;
            rightDegree++;
            degree_ /= 2;
        }
        return (degree_ == 0);
    }

    boolean checkHeapified() {
        if (Nodes == null)
            return true;
        for (BinomialHeapNode current = Nodes; current != null; current = current.sibling) {
            if (!current.isHeapified())
                return false;
        }
        return true;
    }

    public int countNodes() {
        if (Nodes == null)
            return 0;

        int numberOfNodes = 0;
        LinkedList<BinomialHeapNode> worklist = new LinkedList<>();
        worklist.add(Nodes);

        while (!worklist.isEmpty()) {
            BinomialHeapNode current = worklist.removeFirst();
            numberOfNodes++;

            BinomialHeapNode sibling = current.sibling;
            if (sibling != null)
                worklist.add(sibling);

            BinomialHeapNode child = current.child;
            if (child != null)
                worklist.add(child);
        }
        return numberOfNodes;
    }

    public int size() {
        return size;
    }

    public static class BinomialHeapNode {

        public int key; // element in current node

        public int degree; // depth of the binomial tree having the current node as its root

        public BinomialHeapNode parent; // pointer to the parent of the current node

        public BinomialHeapNode sibling; // pointer to the next binomial tree in the list

        public BinomialHeapNode child; // pointer to the first child of the current node

        public BinomialHeapNode() {

        }

        public BinomialHeapNode(int k) {
            // public BinomialHeapNode(Integer k) {
            key = k;
            degree = 0;
            parent = null;
            sibling = null;
            child = null;
        }

        public int getKey() { // returns the element in the current node
            return key;
        }

        public int getDegree() { // returns the degree of the current node
            return degree;
        }

        public BinomialHeapNode getParent() { // returns the father of the current node
            return parent;
        }

        public BinomialHeapNode getSibling() { // returns the next binomial tree in the list
            return sibling;
        }

        public BinomialHeapNode getChild() { // returns the first child of the current node
            return child;
        }

        public int size() {
            return (1 + ((child == null) ? 0 : child.size()) + ((sibling == null) ? 0 : sibling.size()));
        }

        /* Function reverse */
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

        // Find a node with the given key
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

        public boolean checkDegree(int degree) {
            if (this.degree != degree)
                return false;
            for (BinomialHeapNode current = this.child; current != null; current = current.sibling) {
                degree--;
                if (current.degree != degree)
                    return false;
                if (!current.checkDegree(degree))
                    return false;
            }
            return (degree == 0);
        }

        public boolean checkDegreeShape(int degree) {
            if (degree < 0)
                return false;
            if (degree == 0) {
                return child == null;
            }

            for (BinomialHeapNode current = this.child; current != null; current = current.sibling) {
                degree--;
                if (degree < 0)
                    return false;
                if (!current.checkDegreeShape(degree))
                    return false;
            }
            return (degree == 0);
        }

        public boolean isHeapified() {
            for (BinomialHeapNode current = this.child; current != null; current = current.sibling) {
                if (!(key <= current.key))
                    return false;
                if (!current.isHeapified())
                    return false;
            }
            return true;
        }

        public boolean isTree(Set<BinomialHeapNode> visited, BinomialHeapNode parent) {
            if (this.parent != parent)
                return false;
            for (BinomialHeapNode current = this.child; current != null; current = current.sibling) {
                if (!visited.add(current))
                    return false;
                if (!current.isTree(visited, this))
                    return false;
            }
            return true;
        }

        public String btToString(String indent) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%skey == %d \n", indent, key));
            sb.append(String.format("%sdegree == %d \n", indent, degree));
            if (parent == null)
                sb.append(indent + "parent == null \n");
            else
                sb.append(indent + "parent != null \n");
            int childNum = 0;
            for (BinomialHeapNode current = this.child; current != null; current = current.sibling) {
                sb.append(String.format("%s ----- ChildNode%d  -----\n", indent, childNum));
                sb.append(current.btToString(indent + "  "));
            }
            return sb.toString();
        }

    }



}

