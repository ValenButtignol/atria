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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlTree0.root = avlNode2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        avlNode7.element = 100;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode14.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode14.left;
        avlNode7.left = avlNode14;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = null;
        avlNode7.right = avlNode9;
        int int11 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        avlNode19.right = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode24.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(10, avlNode19, avlNode24);
        avlNode16.left = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode35.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(10, avlNode30, avlNode35);
        avlNode16.left = avlNode38;
        avlNode38.element = (-1);
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode38.right;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode7, avlNode42);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(10);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        avlNode7.element = 100;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode7.left = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode16.left;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode19.left;
        avlNode16.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(1, avlNode14, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode5, avlNode22);
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        avlNode6.right = avlNode8;
        avlNode6.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode6.right;
        avlNode12.element = '#';
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove(100);
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        boolean boolean11 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(10);
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode13.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode16.left;
        avlNode13.right = avlNode18;
        int int20 = avlNode13.height;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        boolean boolean11 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode13.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode16.left;
        avlNode13.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        avlNode20.element = 100;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode28, avlNode30);
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode31.right;
        avlNode20.left = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode20.right;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode41.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(10, avlNode36, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode34, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode13, avlNode34);
        int int47 = avlNode13.height;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode8.right;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        avlNode15.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode15.right;
        avlNode14.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode25.height = (byte) 1;
        int int28 = avlNode25.height;
        int int29 = avlNode25.element;
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode25.left;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode35 = null;
        avlNode31.right = avlNode35;
        avlNode25.right = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode25.right;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode41, avlNode43);
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.right;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode25, avlNode44);
        avlNode15.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode();
        int int50 = avlNode49.height;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode();
        avlNode49.right = avlNode51;
        avlNode49.element = 100;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode57, avlNode59);
        system.testclass.AvlTree.AvlNode avlNode61 = avlNode60.right;
        avlNode49.left = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode63 = avlNode49.right;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        int int66 = avlNode65.height;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode();
        avlNode65.right = avlNode67;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode70.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode(10, avlNode65, avlNode70);
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode63, avlNode73);
        system.testclass.AvlTree.AvlNode avlNode75 = avlNode63.right;
        avlNode15.left = avlNode75;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        avlTree0.remove((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
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
        system.testclass.AvlTree.AvlNode avlNode31 = avlNode14.right;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode35, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        int int40 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        avlNode39.right = avlNode41;
        avlNode39.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode39.right;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        int int47 = avlNode46.height;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        avlNode46.right = avlNode48;
        avlNode46.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode52 = avlNode46.right;
        avlNode45.right = avlNode46;
        avlNode38.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode();
        int int56 = avlNode55.height;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode();
        avlNode55.right = avlNode57;
        avlNode55.element = 100;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode63, avlNode65);
        system.testclass.AvlTree.AvlNode avlNode67 = avlNode66.right;
        avlNode55.left = avlNode66;
        system.testclass.AvlTree.AvlNode avlNode69 = avlNode55.right;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode(100, avlNode38, avlNode55);
        avlNode55.element = 10;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode(1, avlNode14, avlNode55);
        avlTree0.root = avlNode55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode10 = null;
        avlNode6.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        int int18 = avlNode15.height;
        int int19 = avlNode15.element;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode15.left;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode25 = null;
        avlNode21.right = avlNode25;
        avlNode15.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode15.right;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode31, avlNode33);
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode15, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode40, avlNode42);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        avlNode44.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode44.right;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode();
        int int52 = avlNode51.height;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        avlNode51.right = avlNode53;
        avlNode51.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode51.right;
        avlNode50.right = avlNode51;
        avlNode43.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode62, avlNode64);
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode();
        int int68 = avlNode67.height;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode();
        avlNode67.right = avlNode69;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode72.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode(10, avlNode67, avlNode72);
        avlNode64.left = avlNode67;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode();
        int int79 = avlNode78.height;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode();
        avlNode78.right = avlNode80;
        system.testclass.AvlTree.AvlNode avlNode83 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode83.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode86 = new system.testclass.AvlTree.AvlNode(10, avlNode78, avlNode83);
        avlNode64.left = avlNode86;
        system.testclass.AvlTree.AvlNode avlNode88 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode43, avlNode64);
        system.testclass.AvlTree.AvlNode avlNode90 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode64.right = avlNode90;
        system.testclass.AvlTree.AvlNode avlNode92 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode90);
        system.testclass.AvlTree.AvlNode avlNode93 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode10, avlNode15);
        avlTree0.root = avlNode93;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode8.right;
        int int15 = avlNode14.height;
        int int16 = avlNode14.element;
        avlNode6.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        int int22 = avlNode19.height;
        avlNode6.left = avlNode19;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 0);
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode18.right;
        int int20 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode18.left;
        avlTree0.root = avlNode18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove(0);
        boolean boolean8 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        avlTree0.remove((int) (short) -1);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
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
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode34.right;
        avlNode34.height = 0;
        int int41 = avlNode34.height;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlNode8.height = (-1);
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
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode28.height = (byte) 1;
        int int31 = avlNode28.height;
        int int32 = avlNode28.element;
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode28.left;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode();
        int int35 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        avlNode34.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode38 = null;
        avlNode34.right = avlNode38;
        avlNode28.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = avlNode28.right;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode44, avlNode46);
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode47.right;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode28, avlNode47);
        avlNode18.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode51 = avlNode49.right;
        avlNode8.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode53 = avlNode49.right;
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode14.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(10, avlNode9, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode24.left;
        avlNode14.left = avlNode25;
        int int27 = avlNode14.element;
        int int28 = avlNode14.height;
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) ' ');
        boolean boolean7 = avlTree0.isEmpty();
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
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        avlNode27.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode32.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(10, avlNode27, avlNode32);
        avlNode13.left = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode38.left;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode41.left;
        avlNode38.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        int int46 = avlNode45.height;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        avlNode45.right = avlNode47;
        avlNode45.element = 100;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode53, avlNode55);
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode56.right;
        avlNode45.left = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode45.right;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode();
        int int62 = avlNode61.height;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode66.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode(10, avlNode61, avlNode66);
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode59, avlNode69);
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode38, avlNode59);
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode13, avlNode71);
        avlNode71.element = (byte) 0;
        avlNode71.element = (-1);
        avlTree0.root = avlNode71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((-1));
        avlTree0.remove(52);
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
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlNode8.height = (-1);
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode13 = null;
        avlNode11.right = avlNode13;
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((int) (short) -1);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.remove(100);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode9.height = (byte) 1;
        int int12 = avlNode9.height;
        int int13 = avlNode9.element;
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode9.left;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = null;
        avlNode15.right = avlNode19;
        avlNode9.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode9.right;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode25, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode9, avlNode28);
        avlNode28.height = (byte) 100;
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
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
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode41.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(10, avlNode36, avlNode41);
        avlNode22.left = avlNode44;
        avlNode15.left = avlNode22;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        boolean boolean14 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode27.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(10, avlNode22, avlNode27);
        avlNode19.left = avlNode22;
        avlNode22.element = (short) 0;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode36, avlNode38);
        avlNode22.left = avlNode36;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode4.right;
        int int11 = avlNode10.height;
        int int12 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode10.left;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        int int10 = avlNode8.element;
        int int11 = avlNode8.element;
        int int12 = avlNode8.height;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlNode8.right;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
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
        avlNode37.height = (short) 0;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        int int42 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        avlNode41.right = avlNode43;
        avlNode41.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode47 = avlNode41.right;
        avlNode37.right = avlNode41;
        avlTree0.root = avlNode41;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) ' ');
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove(97);
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        avlNode6.right = avlNode8;
        avlNode6.element = 100;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode13.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode13.left;
        avlNode6.left = avlNode13;
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
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode41.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(10, avlNode36, avlNode41);
        avlNode22.left = avlNode44;
        avlNode44.element = (-1);
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode44.right;
        avlNode6.right = avlNode48;
        avlNode6.height = 52;
        avlNode6.height = (short) 1;
        avlNode6.height = (short) -1;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        system.testclass.AvlTree.AvlNode avlNode9 = null;
        avlNode5.right = avlNode9;
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
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        avlNode43.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode43.right;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        int int51 = avlNode50.height;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode();
        avlNode50.right = avlNode52;
        avlNode50.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode56 = avlNode50.right;
        avlNode49.right = avlNode50;
        avlNode42.right = avlNode50;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode61, avlNode63);
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode();
        int int67 = avlNode66.height;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode();
        avlNode66.right = avlNode68;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode71.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode(10, avlNode66, avlNode71);
        avlNode63.left = avlNode66;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode();
        int int78 = avlNode77.height;
        system.testclass.AvlTree.AvlNode avlNode79 = new system.testclass.AvlTree.AvlNode();
        avlNode77.right = avlNode79;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode82.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode85 = new system.testclass.AvlTree.AvlNode(10, avlNode77, avlNode82);
        avlNode63.left = avlNode85;
        system.testclass.AvlTree.AvlNode avlNode87 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode42, avlNode63);
        system.testclass.AvlTree.AvlNode avlNode89 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode63.right = avlNode89;
        system.testclass.AvlTree.AvlNode avlNode91 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode89);
        system.testclass.AvlTree.AvlNode avlNode92 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode9, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode93 = avlNode92.right;
        avlTree0.root = avlNode93;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove(100);
        boolean boolean14 = avlTree0.isEmpty();
        avlTree0.remove(0);
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode8, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        avlNode12.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode12.right;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        avlNode19.right = avlNode21;
        avlNode19.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode19.right;
        avlNode18.right = avlNode19;
        avlNode11.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode11.right;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode32, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        avlNode36.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode36.right;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        avlNode43.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode43.right;
        avlNode42.right = avlNode43;
        avlNode35.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode();
        int int53 = avlNode52.height;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        avlNode52.right = avlNode54;
        avlNode52.element = 100;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode60, avlNode62);
        system.testclass.AvlTree.AvlNode avlNode64 = avlNode63.right;
        avlNode52.left = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode52.right;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode(100, avlNode35, avlNode52);
        avlNode52.element = 10;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode(1, avlNode11, avlNode52);
        avlTree0.root = avlNode70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode8 = null;
        avlTree0.root = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode13, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode17.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode17.right;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        int int25 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        avlNode24.right = avlNode26;
        avlNode24.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode24.right;
        avlNode23.right = avlNode24;
        avlNode16.right = avlNode24;
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
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode();
        int int52 = avlNode51.height;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        avlNode51.right = avlNode53;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode56.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode(10, avlNode51, avlNode56);
        avlNode37.left = avlNode59;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode16, avlNode37);
        int int62 = avlNode37.element;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((-1));
        avlTree0.remove(52);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode18 = null;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(1, avlNode17, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode21.left;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode28, avlNode30);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        int int33 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode();
        avlNode32.right = avlNode34;
        avlNode32.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode32.right;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        int int40 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        avlNode39.right = avlNode41;
        avlNode39.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode39.right;
        avlNode38.right = avlNode39;
        avlNode31.right = avlNode39;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode50, avlNode52);
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode();
        int int56 = avlNode55.height;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode();
        avlNode55.right = avlNode57;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode60.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(10, avlNode55, avlNode60);
        avlNode52.left = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode();
        int int67 = avlNode66.height;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode();
        avlNode66.right = avlNode68;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode71.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode(10, avlNode66, avlNode71);
        avlNode52.left = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode31, avlNode52);
        avlNode21.left = avlNode52;
        avlNode19.left = avlNode21;
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
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
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode7, avlNode9);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode17.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(10, avlNode12, avlNode17);
        avlNode9.left = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        int int24 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        avlNode23.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode28.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(10, avlNode23, avlNode28);
        avlNode9.left = avlNode31;
        avlNode31.element = (-1);
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode31.left;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove(100);
        boolean boolean14 = avlTree0.isEmpty();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        int int19 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        avlNode18.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode23.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(10, avlNode18, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode31);
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode32.right;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode33.left;
        avlNode23.left = avlNode34;
        int int36 = avlNode23.element;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode40, avlNode42);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        avlNode44.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode44.right;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode();
        int int52 = avlNode51.height;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        avlNode51.right = avlNode53;
        avlNode51.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode51.right;
        avlNode50.right = avlNode51;
        avlNode43.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode62, avlNode64);
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode();
        int int68 = avlNode67.height;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode();
        avlNode67.right = avlNode69;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode72.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode(10, avlNode67, avlNode72);
        avlNode64.left = avlNode67;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode();
        int int79 = avlNode78.height;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode();
        avlNode78.right = avlNode80;
        system.testclass.AvlTree.AvlNode avlNode83 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode83.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode86 = new system.testclass.AvlTree.AvlNode(10, avlNode78, avlNode83);
        avlNode64.left = avlNode86;
        system.testclass.AvlTree.AvlNode avlNode88 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode43, avlNode64);
        system.testclass.AvlTree.AvlNode avlNode90 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlNode64.right = avlNode90;
        avlNode23.left = avlNode64;
        avlNode23.height = (byte) 1;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode3 = avlNode2.left;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove(97);
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode26.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(10, avlNode21, avlNode26);
        avlNode18.left = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode33, avlNode35);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        int int39 = avlNode38.height;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        avlNode38.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode43.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode(10, avlNode38, avlNode43);
        avlNode35.left = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode18, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode48.left;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode52, avlNode54);
        system.testclass.AvlTree.AvlNode avlNode56 = avlNode55.right;
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode56.left;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(100, avlNode49, avlNode57);
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode();
        int int62 = avlNode61.height;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode66.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode(10, avlNode61, avlNode66);
        avlNode66.element = (short) -1;
        avlNode59.right = avlNode66;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode((int) ' ', avlNode58, avlNode66);
        avlTree0.root = avlNode73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlNode6.height = (-1);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        avlNode16.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        avlNode15.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode26.height = (byte) 1;
        int int29 = avlNode26.height;
        int int30 = avlNode26.element;
        system.testclass.AvlTree.AvlNode avlNode31 = avlNode26.left;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        int int33 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode();
        avlNode32.right = avlNode34;
        system.testclass.AvlTree.AvlNode avlNode36 = null;
        avlNode32.right = avlNode36;
        avlNode26.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode26.right;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode42, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode26, avlNode45);
        avlNode16.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode47.right;
        avlNode6.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode51 = avlNode47.right;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode54, avlNode56);
        avlNode47.right = avlNode57;
        int int59 = avlNode57.element;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) (byte) 100);
        int int62 = avlNode61.height;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode57, avlNode61);
        avlTree0.root = avlNode63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove(1);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode12.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(10, avlNode7, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode21.right;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode22.left;
        avlNode12.left = avlNode23;
        int int25 = avlNode12.element;
        int int26 = avlNode12.height;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode(100);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 10);
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        avlNode10.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(10, avlNode10, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode8, avlNode18);
        int int20 = avlNode18.height;
        avlTree0.root = avlNode18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode7.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode7.left;
        avlTree0.root = avlNode10;
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
        avlTree0.root = avlNode27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (short) -1);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode14 = avlTree0.root;
        boolean boolean15 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode19, avlNode21);
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode22.right;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.remove((int) (short) 100);
        avlTree0.remove(100);
        boolean boolean14 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode15 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode18.height = (byte) 1;
        int int21 = avlNode18.height;
        int int22 = avlNode18.element;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode18.left;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        int int25 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode28 = null;
        avlNode24.right = avlNode28;
        avlNode18.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = avlNode18.right;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode34, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode37.right;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode18, avlNode37);
        avlNode37.height = (byte) 100;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for avlTree0", avlTree0.property_1());
    }
}

