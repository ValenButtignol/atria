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
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlNode3.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode3, avlNode5);
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlNode5.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode5, avlNode7);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode5.left;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0);
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlNode5.right;
        int int7 = avlNode5.height;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int12 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode15.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.left;
        avlNode11.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlNode29.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode29, avlNode35);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        avlNode40.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode40, avlNode46);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode36, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode58, avlNode60);
        int int62 = avlNode61.element;
        avlNode55.left = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode49, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode49);
        avlTree0.root = avlNode65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int6 = avlNode5.element;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.repOK();
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlNode9.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode9, avlNode11);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        int int19 = avlNode18.element;
        avlNode12.left = avlNode18;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int12 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode15.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.left;
        avlNode11.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlNode29.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode29, avlNode35);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        avlNode40.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode40, avlNode46);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode36, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode58, avlNode60);
        int int62 = avlNode61.element;
        avlNode55.left = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode49, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode49);
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.repOK();
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        int int14 = avlNode13.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode13.right = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode16.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        avlNode24.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode22, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode32.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode32, avlNode34);
        int int36 = avlNode35.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode35.right = avlNode38;
        avlNode38.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlNode44.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode44, avlNode46);
        int int48 = avlNode47.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode47.right = avlNode50;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode47.right = avlNode53;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode47);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        avlNode58.element = '#';
        avlNode58.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode58, avlNode65);
        avlNode38.right = avlNode66;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode28, avlNode66);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode18, avlNode66);
        avlTree0.root = avlNode66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        boolean boolean4 = avlTree0.repOK();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        avlNode6.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode6, avlNode12);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        avlNode13.element = '#';
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode12);
        avlNode7.right = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode7.right;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        avlNode10.element = '#';
        avlNode10.element = (byte) 0;
        avlNode10.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int20 = avlNode19.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        avlNode19.right = avlNode30;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.right;
        avlNode36.element = '#';
        avlNode36.element = (byte) 0;
        avlNode36.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int46 = avlNode45.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = avlNode49.right;
        avlNode49.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = avlNode54.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode49, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = avlNode56.left;
        avlNode45.right = avlNode56;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode36, avlNode56);
        avlNode33.right = avlNode36;
        avlNode33.element = (byte) 100;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int12 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode15.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.left;
        avlNode11.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlNode29.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode29, avlNode35);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        avlNode40.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode40, avlNode46);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode36, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode58, avlNode60);
        int int62 = avlNode61.element;
        avlNode55.left = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode49, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = avlNode69.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode69, avlNode71);
        int int73 = avlNode72.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode72.right = avlNode75;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = avlNode75.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = avlNode80.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode80, avlNode82);
        int int84 = avlNode83.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode77, avlNode83);
        avlNode49.right = avlNode83;
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode89 = avlNode88.right;
        int int90 = avlNode88.height;
        avlNode49.right = avlNode88;
        avlTree0.root = avlNode88;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        boolean boolean57 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        avlTree0.remove(0);
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove(10);
        boolean boolean9 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode13, avlNode15);
        int int17 = avlNode16.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode16.right = avlNode19;
        avlNode16.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode25, avlNode27);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((-1), avlNode16, avlNode27);
        avlTree0.root = avlNode29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 0);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        avlNode18.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode16, avlNode18);
        avlNode13.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode13.right;
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlNode9.right;
        avlNode9.element = '#';
        avlNode9.element = (byte) 0;
        avlNode9.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int19 = avlNode18.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        avlNode22.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode22, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.left;
        avlNode18.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode29);
        avlNode32.element = 'a';
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode32.right;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean4 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        avlNode10.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode8, avlNode10);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        int int19 = avlNode18.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode18.right = avlNode21;
        avlNode21.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode27, avlNode29);
        int int31 = avlNode30.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode30.right = avlNode33;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode30.right = avlNode36;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode30);
        avlNode10.left = avlNode21;
        avlNode10.element = '#';
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int11 = avlNode10.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        avlNode14.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode14, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.left;
        avlNode10.right = avlNode21;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        avlNode28.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode28, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        avlNode39.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlNode44.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode39, avlNode45);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode35, avlNode47);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = avlNode51.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode51, avlNode53);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode57, avlNode59);
        int int61 = avlNode60.element;
        avlNode54.left = avlNode60;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode48, avlNode60);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = avlNode66.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = avlNode71.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode71, avlNode73);
        int int75 = avlNode74.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode74.right = avlNode77;
        avlNode77.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = avlNode83.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode83, avlNode85);
        int int87 = avlNode86.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode89 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode86.right = avlNode89;
        system.classfixer.classes.AvlTree.AvlNode avlNode92 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode86.right = avlNode92;
        system.classfixer.classes.AvlTree.AvlNode avlNode94 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode77, avlNode86);
        avlNode66.left = avlNode77;
        avlNode48.right = avlNode66;
        avlTree0.root = avlNode66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlTree0.root = avlNode8;
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int12 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode15.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.left;
        avlNode11.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        avlNode29.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode29, avlNode35);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        avlNode40.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode40, avlNode46);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode36, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode58, avlNode60);
        int int62 = avlNode61.element;
        avlNode55.left = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode49, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode49);
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.repOK();
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 0);
        boolean boolean9 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode17, avlNode19);
        int int21 = avlNode20.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode20.right = avlNode23;
        avlNode23.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode29, avlNode31);
        int int33 = avlNode32.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode32.right = avlNode35;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode32.right = avlNode38;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode23, avlNode32);
        avlNode12.left = avlNode23;
        avlNode12.element = '#';
        avlNode12.element = (short) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode12.left;
        int int47 = avlNode12.element;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 10);
        boolean boolean8 = avlTree0.isEmpty();
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        boolean boolean4 = avlTree0.repOK();
        boolean boolean5 = avlTree0.repOK();
        avlTree0.remove(1);
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlNode9.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode9, avlNode11);
        int int13 = avlNode12.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode12.right = avlNode15;
        avlNode15.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode21, avlNode23);
        int int25 = avlNode24.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode24.right = avlNode27;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode24.right = avlNode30;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode15, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        avlNode35.element = '#';
        avlNode35.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode35, avlNode42);
        avlNode15.right = avlNode43;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        avlNode6.element = '#';
        avlNode6.element = (byte) 0;
        avlNode6.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int16 = avlNode15.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        avlNode19.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode19, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.left;
        avlNode15.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode6, avlNode26);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode32.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode32, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode42.right;
        avlNode42.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode40, avlNode42);
        avlNode37.right = avlNode46;
        avlNode35.left = avlNode46;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode6, avlNode46);
        int int50 = avlNode46.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = avlNode55.right;
        avlNode55.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode53, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = avlNode59.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode46, avlNode60);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = avlNode64.right;
        avlNode64.element = '#';
        avlNode64.element = (byte) 0;
        avlNode64.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int74 = avlNode73.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = avlNode77.right;
        avlNode77.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = avlNode82.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode77, avlNode83);
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = avlNode84.left;
        avlNode73.right = avlNode84;
        system.classfixer.classes.AvlTree.AvlNode avlNode87 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode64, avlNode84);
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode46, avlNode87);
        avlTree0.root = avlNode88;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.repOK();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlTree0.root = avlNode8;
        boolean boolean11 = avlTree0.repOK();
        boolean boolean12 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        avlTree0.remove((int) (short) -1);
        boolean boolean6 = avlTree0.repOK();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        boolean boolean57 = avlTree0.isEmpty();
        boolean boolean58 = avlTree0.repOK();
        avlTree0.remove((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        boolean boolean57 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        avlTree0.remove((int) (short) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlNode9.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode9, avlNode11);
        int int13 = avlNode12.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode12.right = avlNode15;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode15.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode21, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode31, avlNode33);
        int int35 = avlNode34.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode34.right = avlNode37;
        avlNode37.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = avlNode43.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode43, avlNode45);
        int int47 = avlNode46.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode46.right = avlNode49;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode46.right = avlNode52;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode37, avlNode46);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        avlNode57.element = '#';
        avlNode57.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode57, avlNode64);
        avlNode37.right = avlNode65;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode27, avlNode65);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode17, avlNode65);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = avlNode71.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode71, avlNode73);
        int int75 = avlNode74.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode74.right = avlNode77;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode74.right = avlNode80;
        int int82 = avlNode74.height;
        avlNode68.left = avlNode74;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = avlNode74.right;
        avlTree0.root = avlNode84;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.repOK();
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = null;
        avlTree0.root = avlNode6;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        avlNode13.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode13, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        avlNode24.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode24, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode20, avlNode32);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode36, avlNode38);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode42.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode42, avlNode44);
        int int46 = avlNode45.element;
        avlNode39.left = avlNode45;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode33, avlNode45);
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlTree0.root = avlNode8;
        boolean boolean11 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode16, avlNode18);
        int int20 = avlNode19.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode19.right = avlNode22;
        avlNode19.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode28, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((-1), avlNode19, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode19.right;
        int int34 = avlNode19.height;
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        boolean boolean11 = avlTree0.repOK();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        int int57 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = avlNode61.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode61, avlNode63);
        int int65 = avlNode64.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode64.right = avlNode67;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = avlNode67.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = avlNode72.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode72, avlNode74);
        int int76 = avlNode75.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode69, avlNode75);
        avlNode77.element = (byte) 10;
        avlTree0.root = avlNode77;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        int int57 = avlTree0.findMin();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        avlNode10.element = '#';
        avlNode10.element = (byte) 0;
        int int16 = avlNode10.height;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode19, avlNode21);
        int int23 = avlNode22.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode16, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        avlNode28.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode28, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode38.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode38, avlNode40);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlNode44.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode44, avlNode46);
        int int48 = avlNode47.element;
        avlNode41.left = avlNode47;
        avlNode41.height = 'a';
        int int52 = avlNode41.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode28, avlNode41);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode22, avlNode28);
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        avlTree0.remove((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        boolean boolean9 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode14, avlNode16);
        int int18 = avlNode17.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode17.right = avlNode20;
        avlNode17.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode26, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((-1), avlNode17, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode17.right;
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove(10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.repOK();
        boolean boolean11 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int15 = avlNode14.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        avlNode18.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode18, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.left;
        avlNode14.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode32.right;
        avlNode32.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlNode37.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode32, avlNode38);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = avlNode43.right;
        avlNode43.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode48.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode43, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode39, avlNode51);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = avlNode55.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode55, avlNode57);
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = avlNode61.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode61, avlNode63);
        int int65 = avlNode64.element;
        avlNode58.left = avlNode64;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode52, avlNode64);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode14, avlNode52);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = avlNode52.left;
        int int70 = avlNode52.element;
        avlTree0.root = avlNode52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode10.left;
        avlNode10.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode10.left;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = null;
        avlTree0.root = avlNode6;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode14.left;
        avlNode14.height = '#';
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        avlTree0.root = avlNode44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        int int57 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = avlTree0.root;
        avlTree0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.remove(35);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        avlNode11.element = '#';
        avlNode11.element = (byte) 0;
        avlNode11.element = 100;
        int int19 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.right;
        int int23 = avlNode21.element;
        avlNode21.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode21.left;
        avlNode11.left = avlNode21;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1, avlNode9, avlNode11);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        avlNode33.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode31, avlNode33);
        avlNode28.left = avlNode37;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 0);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode16, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode16.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode27, avlNode29);
        int int31 = avlNode30.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode30.right = avlNode33;
        avlNode33.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode39, avlNode41);
        int int43 = avlNode42.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode42.right = avlNode45;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode42.right = avlNode48;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode33, avlNode42);
        avlNode22.left = avlNode33;
        avlNode22.element = '#';
        avlNode22.element = (short) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode16, avlNode22);
        avlNode56.height = (short) 10;
        avlTree0.root = avlNode56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlNode4.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode4, avlNode6);
        int int8 = avlNode7.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode7.right = avlNode10;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode7.right = avlNode13;
        avlNode13.element = 97;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = null;
        avlTree0.root = avlNode4;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        int int16 = avlNode15.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode15.right = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode20, avlNode26);
        avlNode28.element = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode34, avlNode36);
        int int38 = avlNode37.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode37.right = avlNode40;
        avlNode40.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode46, avlNode48);
        int int50 = avlNode49.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode49.right = avlNode52;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode49.right = avlNode55;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode40, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode28, avlNode57);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = avlNode64.right;
        avlNode64.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = avlNode69.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode64, avlNode70);
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = avlNode71.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = avlNode75.right;
        avlNode75.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = avlNode80.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode75, avlNode81);
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = avlNode82.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode71, avlNode83);
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = avlNode84.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode89 = avlNode88.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode90 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode91 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode88, avlNode90);
        int int92 = avlNode91.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode93 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode85, avlNode91);
        int int94 = avlNode91.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode95 = avlNode91.right;
        avlNode28.right = avlNode91;
        avlTree0.root = avlNode91;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlNode3.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode3, avlNode5);
        int int7 = avlNode6.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode6.right = avlNode9;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode6.right;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        boolean boolean57 = avlTree0.isEmpty();
        int int58 = avlTree0.findMin();
        boolean boolean59 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlNode4.right;
        avlNode4.element = '#';
        avlNode4.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode4, avlNode11);
        avlNode12.height = (byte) 10;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        boolean boolean4 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        boolean boolean4 = avlTree0.repOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean7 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode11.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode22, avlNode24);
        int int26 = avlNode25.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode25.right = avlNode28;
        avlNode28.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode34, avlNode36);
        int int38 = avlNode37.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode37.right = avlNode40;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode37.right = avlNode43;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode28, avlNode37);
        avlNode17.left = avlNode28;
        avlNode17.element = '#';
        avlNode17.element = (short) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode11, avlNode17);
        avlTree0.root = avlNode51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) 'a');
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove(1);
        avlTree0.remove((int) (short) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        avlNode11.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode11, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        avlNode22.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode22, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode18, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode34, avlNode36);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode40, avlNode42);
        int int44 = avlNode43.element;
        avlNode37.left = avlNode43;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode31, avlNode43);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode43.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        avlNode52.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode52, avlNode58);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = avlNode59.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = avlNode63.right;
        avlNode63.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = avlNode68.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode63, avlNode69);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode70.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode59, avlNode71);
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = avlNode72.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = avlNode76.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode76, avlNode78);
        int int80 = avlNode79.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode73, avlNode79);
        avlNode73.element = 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = new system.classfixer.classes.AvlTree.AvlNode(35, avlNode47, avlNode73);
        avlTree0.root = avlNode73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        avlTree0.remove((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        int int16 = avlNode15.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode15.right = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode20, avlNode26);
        avlNode28.element = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode34, avlNode36);
        int int38 = avlNode37.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode37.right = avlNode40;
        avlNode40.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode46, avlNode48);
        int int50 = avlNode49.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode49.right = avlNode52;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode49.right = avlNode55;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode40, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode28, avlNode57);
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        avlTree0.remove((int) (short) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode13, avlNode15);
        int int17 = avlNode16.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode16.right = avlNode19;
        avlNode16.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode25, avlNode27);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((-1), avlNode16, avlNode27);
        avlNode29.height = (byte) 0;
        int int32 = avlNode29.height;
        avlTree0.root = avlNode29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode23.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode23, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode19, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode41, avlNode43);
        int int45 = avlNode44.element;
        avlNode38.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode32, avlNode44);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        int int52 = avlNode50.element;
        avlNode50.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 0, avlNode48, avlNode50);
        avlTree0.root = avlNode50;
        avlTree0.remove((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove(10);
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode14, avlNode16);
        int int18 = avlNode17.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode17.right = avlNode20;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode25, avlNode27);
        int int29 = avlNode28.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode22, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode35, avlNode37);
        int int39 = avlNode38.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode38.right = avlNode41;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode46, avlNode48);
        int int50 = avlNode49.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode43, avlNode49);
        avlNode51.element = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode57, avlNode59);
        int int61 = avlNode60.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode60.right = avlNode63;
        avlNode63.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = avlNode69.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode69, avlNode71);
        int int73 = avlNode72.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode72.right = avlNode75;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode72.right = avlNode78;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode63, avlNode72);
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = avlNode80.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode51, avlNode80);
        avlNode28.right = avlNode82;
        avlTree0.root = avlNode82;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        avlTree0.remove((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlTree0.root;
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        boolean boolean3 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        avlNode10.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode8, avlNode10);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode18, avlNode20);
        int int22 = avlNode21.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode21.right = avlNode24;
        avlNode24.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode30, avlNode32);
        int int34 = avlNode33.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode33.right = avlNode36;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode33.right = avlNode39;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode24, avlNode33);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlNode44.right;
        avlNode44.element = '#';
        avlNode44.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode44, avlNode51);
        avlNode24.right = avlNode52;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode52);
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int57 = avlNode56.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = avlNode60.right;
        avlNode60.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlNode65.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode60, avlNode66);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode67.left;
        avlNode56.right = avlNode67;
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode14, avlNode56);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode70.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = avlNode70.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = avlNode70.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = avlNode70.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = avlNode74.left;
        avlTree0.root = avlNode75;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove(0);
        boolean boolean9 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode13, avlNode15);
        int int17 = avlNode16.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode16.right = avlNode19;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode16.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode28.right;
        avlNode28.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode28, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode35.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        avlNode39.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlNode44.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode39, avlNode45);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode35, avlNode47);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode48.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        int int56 = avlNode55.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode49, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode49.left;
        avlNode49.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 100, avlNode16, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlNode65.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode65, avlNode67);
        int int69 = avlNode68.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode68.right = avlNode71;
        avlNode71.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = avlNode77.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode77, avlNode79);
        int int81 = avlNode80.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode80.right = avlNode83;
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode80.right = avlNode86;
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode71, avlNode80);
        avlNode61.left = avlNode88;
        avlTree0.root = avlNode61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) (byte) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        int int16 = avlNode15.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode15.right = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.right;
        avlNode25.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode23, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode33, avlNode35);
        int int37 = avlNode36.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode36.right = avlNode39;
        avlNode39.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode45, avlNode47);
        int int49 = avlNode48.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode48.right = avlNode51;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode48.right = avlNode54;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = avlNode59.right;
        avlNode59.element = '#';
        avlNode59.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode59, avlNode66);
        avlNode39.right = avlNode67;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode67);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode15, avlNode67);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode67.right;
        avlTree0.root = avlNode67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.repOK();
        avlTree0.remove((int) (short) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        boolean boolean10 = avlTree0.repOK();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        avlTree0.remove((int) (byte) 1);
        boolean boolean8 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10);
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        avlNode14.element = '#';
        avlNode14.element = (byte) 0;
        avlNode14.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int24 = avlNode23.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        avlNode27.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode32.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode27, avlNode33);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode34.left;
        avlNode23.right = avlNode34;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode40, avlNode42);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        avlNode50.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode48, avlNode50);
        avlNode45.right = avlNode54;
        avlNode43.left = avlNode54;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode14, avlNode54);
        int int58 = avlNode54.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = avlNode63.right;
        avlNode63.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode61, avlNode63);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode67.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode54, avlNode68);
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = avlNode72.right;
        avlNode72.element = '#';
        avlNode72.element = (byte) 0;
        avlNode72.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int82 = avlNode81.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = avlNode85.right;
        avlNode85.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode90 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode91 = avlNode90.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode92 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode85, avlNode91);
        system.classfixer.classes.AvlTree.AvlNode avlNode93 = avlNode92.left;
        avlNode81.right = avlNode92;
        system.classfixer.classes.AvlTree.AvlNode avlNode95 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode72, avlNode92);
        system.classfixer.classes.AvlTree.AvlNode avlNode96 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode54, avlNode95);
        avlTree0.root = avlNode95;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        boolean boolean6 = avlTree0.repOK();
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.repOK();
        avlTree0.remove((int) (short) -1);
        boolean boolean9 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        avlNode12.element = '#';
        avlNode12.element = (byte) 0;
        avlNode12.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int22 = avlNode21.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.right;
        avlNode25.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode25, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlNode32.left;
        avlNode21.right = avlNode32;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode32);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode38.right;
        avlNode38.element = '#';
        avlNode38.element = (byte) 0;
        avlNode38.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int48 = avlNode47.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = avlNode51.right;
        avlNode51.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = avlNode56.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode51, avlNode57);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.left;
        avlNode47.right = avlNode58;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode58);
        avlNode35.right = avlNode38;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (byte) 100);
        avlTree0.remove((int) (short) 10);
        avlTree0.remove((int) ' ');
        boolean boolean10 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlTree0.root;
        boolean boolean12 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        avlNode17.element = '#';
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode15, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode24, avlNode26);
        avlNode21.left = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode31, avlNode33);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlNode37.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode37, avlNode39);
        int int41 = avlNode40.element;
        avlNode34.left = avlNode40;
        avlNode34.height = 'a';
        int int45 = avlNode34.height;
        avlNode21.left = avlNode34;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlTree0.root = avlNode8;
        boolean boolean11 = avlTree0.repOK();
        boolean boolean12 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree0.root;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        boolean boolean2 = avlTree0.repOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        avlTree0.root = avlNode8;
        boolean boolean11 = avlTree0.repOK();
        boolean boolean12 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        avlNode17.element = '#';
        avlNode17.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode17, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode25.left;
        avlNode25.element = 10;
        avlTree0.root = avlNode25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 0);
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = null;
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        boolean boolean11 = avlTree0.repOK();
        boolean boolean12 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        int int19 = avlNode18.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode18.right = avlNode21;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode18.right = avlNode24;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.right;
        avlNode27.element = '#';
        avlNode18.left = avlNode27;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode27.left;
        avlTree0.root = avlNode27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }
}

