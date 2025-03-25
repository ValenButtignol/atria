import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        avlTree0.root = avlNode3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.remove(35);
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 10);
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '4');
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '4');
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.remove(35);
        boolean boolean7 = avlTree0.repOK();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        avlNode7.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        avlNode12.right = avlNode14;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode7, avlNode12);
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean8 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100);
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        avlNode7.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        avlNode12.right = avlNode14;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode7, avlNode12);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a');
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode7, avlNode18);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean8 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        avlNode13.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        avlNode18.right = avlNode20;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode13, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a');
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode13, avlNode24);
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 10);
        boolean boolean5 = avlTree0.repOK();
        boolean boolean6 = avlTree0.repOK();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean8 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        avlNode17.right = avlNode19;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode12, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a');
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode12, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        avlTree0.root = avlNode25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlNode5.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode5, avlNode7);
        int int9 = avlNode8.height;
        avlTree0.root = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = null;
        avlTree0.root = avlNode11;
        avlTree0.remove(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode17, avlNode19);
        int int21 = avlNode20.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        avlNode23.height = ' ';
        avlNode20.right = avlNode23;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree avlTree5 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = null;
        avlTree5.root = avlNode6;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        int int14 = avlNode13.height;
        avlTree5.root = avlNode13;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = null;
        avlTree5.root = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode22, avlNode24);
        int int26 = avlNode25.height;
        avlNode19.left = avlNode25;
        avlTree5.root = avlNode25;
        avlNode25.height = (byte) 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode33, avlNode35);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        avlNode39.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode39.right;
        int int44 = avlNode39.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode49, avlNode51);
        int int53 = avlNode52.height;
        avlNode46.left = avlNode52;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode39, avlNode52);
        avlNode33.left = avlNode55;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode25, avlNode55);
        avlNode57.height = 10;
        avlTree0.root = avlNode57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean8 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlNode6.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode14, avlNode16);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode14.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1, avlNode6, avlNode18);
        avlTree0.root = avlNode19;
        boolean boolean21 = avlTree0.repOK();
        boolean boolean22 = avlTree0.isEmpty();
        boolean boolean23 = avlTree0.repOK();
        boolean boolean24 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree avlTree26 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = null;
        avlTree26.root = avlNode27;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode31, avlNode33);
        int int35 = avlNode34.height;
        avlTree26.root = avlNode34;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        avlTree26.root = avlNode37;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = avlNode43.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode43, avlNode45);
        int int47 = avlNode46.height;
        avlNode40.left = avlNode46;
        avlTree26.root = avlNode46;
        avlNode46.height = (byte) 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = avlNode54.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode54, avlNode56);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = avlNode60.right;
        avlNode60.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = avlNode60.right;
        int int65 = avlNode60.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode70.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode70, avlNode72);
        int int74 = avlNode73.height;
        avlNode67.left = avlNode73;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode60, avlNode73);
        avlNode54.left = avlNode76;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode46, avlNode76);
        avlNode78.height = 10;
        int int81 = avlNode78.element;
        avlNode78.height = 52;
        avlTree0.root = avlNode78;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.remove(35);
        boolean boolean7 = avlTree0.repOK();
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }
}

