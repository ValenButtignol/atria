import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlTree0.root = avlNode2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode7, avlNode9);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.left;
        avlNode15.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode8, avlNode15);
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode12.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(10, avlNode7, avlNode12);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode11);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode13.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode13.right;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        avlNode20.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode20.right;
        avlNode19.right = avlNode20;
        avlNode12.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode31, avlNode33);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode41.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(10, avlNode36, avlNode41);
        avlNode33.left = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        int int48 = avlNode47.height;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode();
        avlNode47.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode52.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode(10, avlNode47, avlNode52);
        avlNode33.left = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode12, avlNode33);
        avlTree0.root = avlNode57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlNode5.left;
        avlNode5.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        avlNode5.right = avlNode9;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        int int4 = avlNode3.height;
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        avlNode3.right = avlNode5;
        avlNode3.element = 100;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode13);
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode14.right;
        avlNode3.left = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        int int26 = avlNode25.height;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        avlNode25.right = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode30.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(10, avlNode25, avlNode30);
        avlNode22.left = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode37, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        int int43 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        avlNode42.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode47.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(10, avlNode42, avlNode47);
        avlNode39.left = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode22, avlNode42);
        avlNode14.right = avlNode52;
        avlTree0.root = avlNode52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        int int19 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        avlNode18.right = avlNode20;
        avlNode18.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode18.right;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        int int26 = avlNode25.height;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        avlNode25.right = avlNode27;
        avlNode25.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode31 = avlNode25.right;
        avlNode24.right = avlNode25;
        avlNode17.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode36, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        int int42 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        avlNode41.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode46.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode(10, avlNode41, avlNode46);
        avlNode38.left = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode();
        int int53 = avlNode52.height;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        avlNode52.right = avlNode54;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode57.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(10, avlNode52, avlNode57);
        avlNode38.left = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode17, avlNode38);
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove(10);
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        avlNode14.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode14.right;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode21.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode21.right;
        avlNode20.right = avlNode21;
        avlNode13.right = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode32, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        avlNode37.right = avlNode39;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode42.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode(10, avlNode37, avlNode42);
        avlNode34.left = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        int int49 = avlNode48.height;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        avlNode48.right = avlNode50;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode53.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode(10, avlNode48, avlNode53);
        avlNode34.left = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode13, avlNode34);
        int int59 = avlNode34.element;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove(100);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove(10);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode8, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode18.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(10, avlNode13, avlNode18);
        avlNode10.left = avlNode13;
        avlNode13.element = (short) 0;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode7 = avlNode6.left;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode9.left;
        avlNode6.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode13.element = 100;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode24.right;
        avlNode13.left = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode13.right;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        int int30 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        avlNode29.right = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode34.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(10, avlNode29, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode27, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode6, avlNode27);
        int int40 = avlNode27.height;
        avlTree0.root = avlNode27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode13);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(10, avlNode16, avlNode21);
        avlNode13.left = avlNode16;
        avlNode16.element = (short) 0;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode30, avlNode32);
        avlNode16.left = avlNode30;
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode12.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode12.left;
        avlNode5.left = avlNode12;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode4.right;
        int int11 = avlNode10.height;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode5.height = (byte) 1;
        int int8 = avlNode5.height;
        int int9 = avlNode5.element;
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode5.left;
        avlTree0.root = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode13.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode13.right;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        avlNode20.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode20.right;
        avlNode19.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode30, avlNode32);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        int int36 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode40.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(10, avlNode35, avlNode40);
        avlNode32.left = avlNode35;
        avlNode35.element = (short) 0;
        int int47 = avlNode35.element;
        avlNode20.left = avlNode35;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((-1));
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode11 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode15, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        avlNode19.right = avlNode21;
        avlNode19.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode19.right;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        avlNode26.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode26.right;
        avlNode25.right = avlNode26;
        avlNode18.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode37, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        int int43 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        avlNode42.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode47.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(10, avlNode42, avlNode47);
        avlNode39.left = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        int int54 = avlNode53.height;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode();
        avlNode53.right = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode58.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode(10, avlNode53, avlNode58);
        avlNode39.left = avlNode61;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode18, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode39.right = avlNode65;
        int int67 = avlNode65.height;
        avlTree0.root = avlNode65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        avlNode15.element = 100;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode23, avlNode25);
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.right;
        avlNode15.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode15.right;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode36.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(10, avlNode31, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode29, avlNode39);
        avlTree0.root = avlNode29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 100);
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode8.height = (byte) 1;
        int int11 = avlNode8.height;
        int int12 = avlNode8.element;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode8.left;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode18 = null;
        avlNode14.right = avlNode18;
        avlNode8.right = avlNode18;
        avlTree0.root = avlNode8;
        avlTree0.remove(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        avlTree0.remove((int) 'a');
        avlTree0.remove((int) (short) 10);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (short) -1);
        avlTree0.remove(100);
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode5.height = (byte) 1;
        int int8 = avlNode5.height;
        int int9 = avlNode5.element;
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode5.left;
        avlTree0.root = avlNode10;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode5.left = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        avlNode14.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) -1);
        int int24 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode21, avlNode23);
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = null;
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode7.right;
        avlTree0.root = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        avlNode16.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode14, avlNode22);
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove((int) '4');
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode10.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(10, avlNode5, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode20.left;
        avlNode10.left = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode25, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        int int30 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        avlNode29.right = avlNode31;
        avlNode29.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode29.right;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        avlNode36.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode36.right;
        avlNode35.right = avlNode36;
        avlNode28.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) ' ', avlNode10, avlNode36);
        avlTree0.root = avlNode45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) '#');
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode20.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(10, avlNode15, avlNode20);
        avlNode12.left = avlNode15;
        avlNode15.element = (short) 0;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode31);
        avlNode15.left = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode15.left;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode7.height = (byte) 1;
        int int10 = avlNode7.height;
        int int11 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode7.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode17 = null;
        avlNode13.right = avlNode17;
        avlNode7.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode23, avlNode25);
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode7, avlNode26);
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        avlTree0.remove((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode13.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        avlNode13.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode19.right;
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode7.height = (byte) 1;
        int int10 = avlNode7.height;
        int int11 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode7.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode17 = null;
        avlNode13.right = avlNode17;
        avlNode7.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode23, avlNode25);
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode7, avlNode26);
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode28.left;
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlTree0.root = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode32 = avlTree0.root;
        avlTree0.remove(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        boolean boolean9 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode11.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        avlNode22.right = avlNode24;
        avlNode22.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode22.right;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        int int30 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        avlNode29.right = avlNode31;
        avlNode29.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode29.right;
        avlNode28.right = avlNode29;
        avlNode21.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode40, avlNode42);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        int int46 = avlNode45.height;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        avlNode45.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode50.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(10, avlNode45, avlNode50);
        avlNode42.left = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        int int57 = avlNode56.height;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        avlNode56.right = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode61.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(10, avlNode56, avlNode61);
        avlNode42.left = avlNode64;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode21, avlNode42);
        avlNode11.left = avlNode42;
        avlTree0.root = avlNode42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode3.height = (byte) 1;
        int int6 = avlNode3.height;
        int int7 = avlNode3.element;
        system.testclass.AvlTree.AvlNode avlNode8 = avlNode3.left;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode13 = null;
        avlNode9.right = avlNode13;
        avlNode3.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode3.right;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode19, avlNode21);
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode3, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode24.left;
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode9.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode9.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        avlNode20.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode20.right;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        avlNode27.right = avlNode29;
        avlNode27.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode27.right;
        avlNode26.right = avlNode27;
        avlNode19.right = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        int int55 = avlNode54.height;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        avlNode54.right = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode59.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(10, avlNode54, avlNode59);
        avlNode40.left = avlNode62;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode19, avlNode40);
        avlNode9.left = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode68 = avlNode67.right;
        int int69 = avlNode67.height;
        system.testclass.AvlTree.AvlNode avlNode70 = null;
        avlNode67.right = avlNode70;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode40, avlNode67);
        avlTree0.root = avlNode40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode7.height = (byte) 1;
        int int10 = avlNode7.height;
        int int11 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode7.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode17 = null;
        avlNode13.right = avlNode17;
        avlNode7.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode23, avlNode25);
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode7, avlNode26);
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode28.left;
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlTree0.root = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode34, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        int int40 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        avlNode39.right = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode44.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode(10, avlNode39, avlNode44);
        avlNode36.left = avlNode39;
        avlNode39.element = (short) 0;
        int int51 = avlNode39.element;
        system.testclass.AvlTree.AvlNode avlNode52 = avlNode39.right;
        avlNode52.element = 0;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode57 = null;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(1, avlNode56, avlNode57);
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode58.right;
        avlNode52.right = avlNode58;
        avlTree0.root = avlNode58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove(0);
        boolean boolean8 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode13);
        int int15 = avlNode14.element;
        avlNode14.height = '4';
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        boolean boolean7 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode20.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(10, avlNode15, avlNode20);
        avlNode12.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode12.left = avlNode34;
        avlNode34.element = (-1);
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode34.left;
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode34.left;
        avlNode34.element = 'a';
        avlNode34.height = 52;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode13);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(10, avlNode16, avlNode21);
        avlNode13.left = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode28, avlNode30);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        int int34 = avlNode33.height;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        avlNode33.right = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode38.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(10, avlNode33, avlNode38);
        avlNode30.left = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode13, avlNode33);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode46 = avlNode45.left;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode43, avlNode46);
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode43.right;
        avlTree0.root = avlNode43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        avlTree0.remove((int) 'a');
        avlTree0.remove(52);
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        avlTree0.remove((int) 'a');
        boolean boolean13 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        int int24 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        avlNode23.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode28.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(10, avlNode23, avlNode28);
        avlNode20.left = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode35, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        int int41 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        avlNode40.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode45.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode(10, avlNode40, avlNode45);
        avlNode37.left = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode20, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode53 = avlNode52.left;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode50, avlNode53);
        system.testclass.AvlTree.AvlNode avlNode55 = avlNode50.right;
        int int56 = avlNode55.height;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        int int59 = avlNode58.height;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode();
        avlNode58.right = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode63.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode(10, avlNode58, avlNode63);
        avlNode63.element = (short) -1;
        avlNode55.left = avlNode63;
        avlTree0.root = avlNode55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode5.height = (byte) 1;
        int int8 = avlNode5.height;
        int int9 = avlNode5.element;
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode5.left;
        avlTree0.root = avlNode10;
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        avlNode12.element = 100;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode19.left;
        avlNode12.left = avlNode19;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        boolean boolean11 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        avlNode10.right = avlNode12;
        avlNode10.element = 100;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode21.right;
        avlNode10.left = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode10.right;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode24, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode36 = null;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode35, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode35.right;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode13.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode13.left;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        int int25 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        avlNode24.right = avlNode26;
        avlNode24.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode24.right;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        avlNode31.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode31.right;
        avlNode30.right = avlNode31;
        avlNode23.right = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode42, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        int int48 = avlNode47.height;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode();
        avlNode47.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode52.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode(10, avlNode47, avlNode52);
        avlNode44.left = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        int int59 = avlNode58.height;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode();
        avlNode58.right = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode63.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode(10, avlNode58, avlNode63);
        avlNode44.left = avlNode66;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode23, avlNode44);
        avlNode13.left = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode72 = avlNode71.right;
        int int73 = avlNode71.height;
        system.testclass.AvlTree.AvlNode avlNode74 = null;
        avlNode71.right = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode44, avlNode71);
        avlNode44.height = '#';
        avlTree0.root = avlNode44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.left;
        avlNode8.left = avlNode15;
        int int20 = avlNode15.height;
        int int21 = avlNode15.height;
        avlTree0.root = avlNode15;
        boolean boolean23 = avlTree0.isEmpty();
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode14.height = (byte) 1;
        int int17 = avlNode14.height;
        int int18 = avlNode14.element;
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = null;
        avlNode20.right = avlNode24;
        avlNode14.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode14.right;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode30, avlNode32);
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode14, avlNode33);
        avlTree0.root = avlNode14;
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode7, avlNode9);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        avlNode11.right = avlNode13;
        avlNode11.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.right;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        int int19 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        avlNode18.right = avlNode20;
        avlNode18.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode18.right;
        avlNode17.right = avlNode18;
        avlNode10.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        avlNode27.right = avlNode29;
        avlNode27.element = 100;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode35, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode38.right;
        avlNode27.left = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = avlNode27.right;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(100, avlNode10, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.left;
        avlNode44.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        int int49 = avlNode48.height;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        avlNode48.right = avlNode50;
        avlNode48.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode48.right;
        avlNode44.right = avlNode48;
        avlNode10.right = avlNode44;
        avlTree0.root = avlNode44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.left;
        avlNode8.left = avlNode15;
        int int20 = avlNode15.height;
        int int21 = avlNode15.height;
        avlTree0.root = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode23 = avlTree0.root;
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode11);
        int int13 = avlNode9.height;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        avlTree0.remove((int) 'a');
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove(52);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode13);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        avlNode15.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode15.right;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        avlNode22.right = avlNode24;
        avlNode22.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode22.right;
        avlNode21.right = avlNode22;
        avlNode14.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        avlNode31.element = 100;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode42.right;
        avlNode31.left = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode31.right;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode(100, avlNode14, avlNode31);
        system.testclass.AvlTree.AvlNode avlNode47 = avlNode46.right;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode();
        int int52 = avlNode51.height;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        avlNode51.right = avlNode53;
        avlNode51.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode51.right;
        int int58 = avlNode57.height;
        int int59 = avlNode57.element;
        avlNode49.right = avlNode57;
        avlNode46.left = avlNode49;
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (short) -1);
        avlTree0.remove(100);
        boolean boolean16 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove(10);
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode11.height = (byte) 1;
        int int14 = avlNode11.height;
        int int15 = avlNode11.element;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = null;
        avlNode17.right = avlNode21;
        avlNode11.right = avlNode21;
        avlTree0.root = avlNode11;
        boolean boolean25 = avlTree0.isEmpty();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        avlTree0.remove((int) 'a');
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(1);
        boolean boolean12 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode16, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode31);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        int int34 = avlNode33.height;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        avlNode33.right = avlNode35;
        avlNode33.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode33.right;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        int int41 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        avlNode40.right = avlNode42;
        avlNode40.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode46 = avlNode40.right;
        avlNode39.right = avlNode40;
        avlNode32.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode51, avlNode53);
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        int int57 = avlNode56.height;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        avlNode56.right = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode61.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(10, avlNode56, avlNode61);
        avlNode53.left = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode();
        int int68 = avlNode67.height;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode();
        avlNode67.right = avlNode69;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode72.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode(10, avlNode67, avlNode72);
        avlNode53.left = avlNode75;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode32, avlNode53);
        int int78 = avlNode53.element;
        avlNode16.right = avlNode53;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        boolean boolean11 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove(10);
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = null;
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode7.right;
        avlTree0.root = avlNode11;
        boolean boolean13 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode14 = null;
        avlTree0.root = avlNode14;
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) '#');
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) ' ');
        boolean boolean12 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(10, avlNode14, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode25, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode29.left;
        avlNode19.left = avlNode30;
        int int32 = avlNode19.element;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode36, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        int int41 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        avlNode40.right = avlNode42;
        avlNode40.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode46 = avlNode40.right;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        int int48 = avlNode47.height;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode();
        avlNode47.right = avlNode49;
        avlNode47.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode53 = avlNode47.right;
        avlNode46.right = avlNode47;
        avlNode39.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode58, avlNode60);
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        int int64 = avlNode63.height;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        avlNode63.right = avlNode65;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode68.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode(10, avlNode63, avlNode68);
        avlNode60.left = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode();
        int int75 = avlNode74.height;
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode();
        avlNode74.right = avlNode76;
        system.testclass.AvlTree.AvlNode avlNode79 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode79.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode(10, avlNode74, avlNode79);
        avlNode60.left = avlNode82;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode39, avlNode60);
        system.testclass.AvlTree.AvlNode avlNode86 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode60.right = avlNode86;
        avlNode19.left = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode89 = avlNode60.left;
        system.testclass.AvlTree.AvlNode avlNode90 = avlNode60.left;
        int int91 = avlNode90.height;
        avlTree0.root = avlNode90;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '#');
        avlNode11.height = 0;
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }
}

