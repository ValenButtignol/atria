import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        avlTree0.insert((int) (byte) -1);
        avlTree0.remove((int) (short) 1);
        boolean boolean14 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int18 = avlNode17.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) '4', avlNode17, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode23.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int29 = avlNode28.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode23, avlNode28);
        avlNode20.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode34.right = avlNode36;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int40 = avlNode39.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode34, avlNode39);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode46.right = avlNode48;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode44, avlNode46);
        avlNode41.left = avlNode46;
        avlNode20.right = avlNode41;
        int int53 = avlNode20.height;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode6, avlNode11);
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        boolean boolean10 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 0);
        avlTree0.insert((int) (byte) 0);
        int int15 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode18, avlNode20);
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        avlTree0.remove((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode13.right = avlNode15;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode15.left = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode15.right;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        boolean boolean6 = avlTree0.isEmpty();
        boolean boolean7 = avlTree0.repOK();
        boolean boolean8 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int17 = avlNode16.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode11, avlNode16);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode23.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode21, avlNode23);
        avlNode18.left = avlNode23;
        int int29 = avlNode23.element;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }
}

