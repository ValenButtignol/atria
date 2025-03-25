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
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        avlNode14.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        int int24 = avlNode23.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode23);
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree12 = new system.classfixer.classes.AvlTree();
        avlTree12.insert(1);
        int int15 = avlTree12.findMin();
        boolean boolean16 = avlTree12.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlTree12.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode17, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode17.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode26, avlNode28);
        int int30 = avlNode29.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode29.right = avlNode32;
        avlNode32.element = '4';
        avlNode10.left = avlNode32;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
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
        avlNode24.element = '#';
        avlNode24.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode40, avlNode42);
        int int44 = avlNode43.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode43.right = avlNode46;
        avlNode46.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        int int56 = avlNode55.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode55.right = avlNode58;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode55.right = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode46, avlNode55);
        avlNode55.element = '#';
        avlNode55.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode24, avlNode55);
        avlTree0.root = avlNode55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode13;
        avlNode13.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode19, avlNode21);
        int int23 = avlNode22.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode13, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int33 = avlNode32.element;
        avlNode22.left = avlNode32;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        avlNode14.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        int int24 = avlNode23.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int34 = avlNode33.element;
        avlNode23.left = avlNode33;
        avlNode23.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlNode23.left;
        int int39 = avlNode38.height;
        system.classfixer.classes.AvlTree avlTree42 = new system.classfixer.classes.AvlTree();
        avlTree42.insert(1);
        int int45 = avlTree42.findMin();
        boolean boolean46 = avlTree42.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlTree42.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode47, avlNode50);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = avlNode54.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode54, avlNode56);
        int int58 = avlNode57.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode57.right = avlNode60;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode57.right = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode67.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode67, avlNode69);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode67.right;
        avlNode57.right = avlNode67;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode51, avlNode67);
        avlNode38.left = avlNode51;
        avlTree0.root = avlNode51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree avlTree10 = new system.classfixer.classes.AvlTree();
        avlTree10.insert(1);
        int int13 = avlTree10.findMin();
        boolean boolean14 = avlTree10.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlTree10.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode18);
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        avlTree0.insert((int) (short) 1);
        int int6 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree10 = new system.classfixer.classes.AvlTree();
        avlTree10.insert(1);
        int int13 = avlTree10.findMin();
        boolean boolean14 = avlTree10.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlTree10.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode15.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode8, avlNode15);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode24, avlNode26);
        int int28 = avlNode27.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode30;
        avlNode30.element = '4';
        avlNode8.left = avlNode30;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode17, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode20, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree31 = new system.classfixer.classes.AvlTree();
        avlTree31.insert(1);
        int int34 = avlTree31.findMin();
        boolean boolean35 = avlTree31.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlTree31.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode30, avlNode36);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree41 = new system.classfixer.classes.AvlTree();
        avlTree41.insert(1);
        int int44 = avlTree41.findMin();
        boolean boolean45 = avlTree41.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlTree41.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode48.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode46, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode46.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode39, avlNode46);
        avlNode39.element = (short) 1;
        avlNode30.right = avlNode39;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode20, avlNode30);
        avlNode11.left = avlNode30;
        int int58 = avlNode30.height;
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = null;
        avlTree0.root = avlNode2;
        boolean boolean4 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree avlTree6 = new system.classfixer.classes.AvlTree();
        avlTree6.insert(1);
        int int9 = avlTree6.findMin();
        boolean boolean10 = avlTree6.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlTree6.root;
        system.classfixer.classes.AvlTree avlTree12 = new system.classfixer.classes.AvlTree();
        avlTree12.insert(1);
        int int15 = avlTree12.findMin();
        boolean boolean16 = avlTree12.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlTree12.root;
        avlNode17.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode11, avlNode17);
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree11 = new system.classfixer.classes.AvlTree();
        avlTree11.insert(1);
        int int14 = avlTree11.findMin();
        boolean boolean15 = avlTree11.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlTree11.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode16, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode16.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode9, avlNode16);
        avlNode9.element = (short) 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree28 = new system.classfixer.classes.AvlTree();
        avlTree28.insert(1);
        int int31 = avlTree28.findMin();
        boolean boolean32 = avlTree28.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlTree28.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode27, avlNode33);
        int int35 = avlNode27.height;
        avlNode9.right = avlNode27;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        int int10 = avlNode9.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode9.right = avlNode12;
        avlNode12.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode18, avlNode20);
        int int22 = avlNode21.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode21.right = avlNode24;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode21.right = avlNode27;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int32 = avlNode31.element;
        avlNode21.left = avlNode31;
        avlNode21.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode21.left;
        int int37 = avlNode36.height;
        system.classfixer.classes.AvlTree avlTree40 = new system.classfixer.classes.AvlTree();
        avlTree40.insert(1);
        int int43 = avlTree40.findMin();
        boolean boolean44 = avlTree40.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = avlTree40.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode45, avlNode48);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode52, avlNode54);
        int int56 = avlNode55.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode55.right = avlNode58;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode55.right = avlNode61;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlNode65.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode65, avlNode67);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = avlNode65.right;
        avlNode55.right = avlNode65;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode49, avlNode65);
        avlNode36.left = avlNode49;
        avlTree0.root = avlNode36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        int int5 = avlTree0.findMin();
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode17;
        avlNode17.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode32;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode26);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int37 = avlNode36.element;
        avlNode26.left = avlNode36;
        avlNode26.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode26.left;
        int int42 = avlNode41.height;
        system.classfixer.classes.AvlTree avlTree45 = new system.classfixer.classes.AvlTree();
        avlTree45.insert(1);
        int int48 = avlTree45.findMin();
        boolean boolean49 = avlTree45.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = avlTree45.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode52.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode50, avlNode53);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode57, avlNode59);
        int int61 = avlNode60.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode60.right = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode60.right = avlNode66;
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = avlNode70.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode70, avlNode72);
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = avlNode70.right;
        avlNode60.right = avlNode70;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode54, avlNode70);
        avlNode41.left = avlNode54;
        int int78 = avlNode54.height;
        avlTree0.root = avlNode54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
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
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int35 = avlNode34.element;
        avlNode24.left = avlNode34;
        avlNode24.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode24.left;
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = null;
        avlTree0.root = avlNode2;
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode17;
        avlNode17.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode32;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode26);
        avlNode26.element = '#';
        avlNode26.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode42.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode42, avlNode44);
        int int46 = avlNode45.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode45.right = avlNode48;
        avlNode48.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = avlNode54.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode54, avlNode56);
        int int58 = avlNode57.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode57.right = avlNode60;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode57.right = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode48, avlNode57);
        avlNode57.element = '#';
        avlNode57.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode26, avlNode57);
        system.classfixer.classes.AvlTree avlTree71 = new system.classfixer.classes.AvlTree();
        avlTree71.insert(1);
        int int74 = avlTree71.findMin();
        boolean boolean75 = avlTree71.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = avlTree71.root;
        boolean boolean77 = avlTree71.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = avlTree71.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = avlTree71.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode70, avlNode79);
        avlTree0.root = avlNode70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.remove((int) (byte) 0);
        avlTree0.remove((int) ' ');
        system.classfixer.classes.AvlTree avlTree14 = new system.classfixer.classes.AvlTree();
        avlTree14.insert(1);
        int int17 = avlTree14.findMin();
        avlTree14.insert((int) '4');
        avlTree14.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlTree14.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree26 = new system.classfixer.classes.AvlTree();
        avlTree26.insert(1);
        int int29 = avlTree26.findMin();
        boolean boolean30 = avlTree26.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlTree26.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode31, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode31.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode22, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode38.right;
        avlTree0.root = avlNode38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        int int9 = avlTree0.findMin();
        avlTree0.remove((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree15 = new system.classfixer.classes.AvlTree();
        avlTree15.insert(1);
        int int18 = avlTree15.findMin();
        boolean boolean19 = avlTree15.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlTree15.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode20, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode20.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode13, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = avlNode29.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode29, avlNode31);
        int int33 = avlNode32.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode32.right = avlNode35;
        avlNode35.element = '4';
        avlNode13.left = avlNode35;
        int int40 = avlNode13.height;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        int int7 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode17;
        avlNode17.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode32;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode26);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int37 = avlNode36.element;
        avlNode26.left = avlNode36;
        avlNode26.element = (byte) -1;
        avlTree0.root = avlNode26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.repOK();
        avlTree0.insert((int) '#');
        boolean boolean8 = avlTree0.repOK();
        int int9 = avlTree0.findMin();
        system.classfixer.classes.AvlTree avlTree10 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlTree10.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        avlTree10.root = avlNode12;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlTree10.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode17, avlNode19);
        int int21 = avlNode20.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode20.right = avlNode23;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode20.right = avlNode26;
        avlTree10.root = avlNode26;
        system.classfixer.classes.AvlTree avlTree29 = new system.classfixer.classes.AvlTree();
        avlTree29.insert(1);
        int int32 = avlTree29.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = avlTree29.root;
        avlNode26.right = avlNode33;
        avlTree0.root = avlNode26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode26, avlNode28);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode23, avlNode26);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree34 = new system.classfixer.classes.AvlTree();
        avlTree34.insert(1);
        int int37 = avlTree34.findMin();
        boolean boolean38 = avlTree34.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlTree34.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode33, avlNode39);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree44 = new system.classfixer.classes.AvlTree();
        avlTree44.insert(1);
        int int47 = avlTree44.findMin();
        boolean boolean48 = avlTree44.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlTree44.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = avlNode51.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode49, avlNode52);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = avlNode49.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode42, avlNode49);
        avlNode42.element = (short) 1;
        avlNode33.right = avlNode42;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode23, avlNode33);
        avlNode14.left = avlNode33;
        int int61 = avlNode33.height;
        avlNode11.left = avlNode33;
        avlTree0.root = avlNode11;
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
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.repOK();
        avlTree0.insert((int) '#');
        boolean boolean8 = avlTree0.repOK();
        avlTree0.insert(52);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100);
        avlTree0.root = avlNode12;
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
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int43 = avlNode42.element;
        avlNode32.left = avlNode42;
        avlNode32.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode32.left;
        int int48 = avlNode47.height;
        system.classfixer.classes.AvlTree avlTree51 = new system.classfixer.classes.AvlTree();
        avlTree51.insert(1);
        int int54 = avlTree51.findMin();
        boolean boolean55 = avlTree51.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = avlTree51.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlNode58.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode56, avlNode59);
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = avlNode63.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode63, avlNode65);
        int int67 = avlNode66.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode66.right = avlNode69;
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode66.right = avlNode72;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = avlNode76.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode76, avlNode78);
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = avlNode76.right;
        avlNode66.right = avlNode76;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode60, avlNode76);
        avlNode47.left = avlNode60;
        avlTree0.root = avlNode60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        int int6 = avlTree0.findMin();
        int int7 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        int int16 = avlNode15.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode15.right = avlNode18;
        avlNode18.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode24, avlNode26);
        int int28 = avlNode27.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode30;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode33;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode27);
        avlNode27.height = (byte) 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode27, avlNode39);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode27.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlNode45.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode45, avlNode47);
        int int49 = avlNode48.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode48.right = avlNode51;
        avlNode51.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode57.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode57, avlNode59);
        int int61 = avlNode60.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode60.right = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode60.right = avlNode66;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode51, avlNode60);
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int71 = avlNode70.element;
        avlNode60.left = avlNode70;
        avlNode60.element = 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = avlNode60.left;
        avlNode41.left = avlNode60;
        avlTree0.root = avlNode41;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode13;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode16.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode16.right;
        avlTree0.root = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.left;
        avlTree0.root = avlNode26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        boolean boolean3 = avlTree0.repOK();
        system.classfixer.classes.AvlTree avlTree5 = new system.classfixer.classes.AvlTree();
        avlTree5.insert(1);
        int int8 = avlTree5.findMin();
        avlTree5.insert((int) '4');
        avlTree5.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree5.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree17 = new system.classfixer.classes.AvlTree();
        avlTree17.insert(1);
        int int20 = avlTree17.findMin();
        boolean boolean21 = avlTree17.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlTree17.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode22, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode22.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode15, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode13, avlNode28);
        avlNode28.element = '#';
        system.classfixer.classes.AvlTree avlTree33 = new system.classfixer.classes.AvlTree();
        avlTree33.insert(1);
        int int36 = avlTree33.findMin();
        boolean boolean37 = avlTree33.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlTree33.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode40.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode38, avlNode41);
        avlNode28.right = avlNode38;
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((int) (byte) 10);
        system.classfixer.classes.AvlTree avlTree7 = new system.classfixer.classes.AvlTree();
        avlTree7.insert(1);
        int int10 = avlTree7.findMin();
        boolean boolean11 = avlTree7.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree7.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlNode14.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode15);
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlTree0.root = avlNode4;
        avlTree0.insert((int) (short) 1);
        system.classfixer.classes.AvlTree avlTree9 = new system.classfixer.classes.AvlTree();
        avlTree9.insert(1);
        int int12 = avlTree9.findMin();
        boolean boolean13 = avlTree9.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlTree9.root;
        system.classfixer.classes.AvlTree avlTree15 = new system.classfixer.classes.AvlTree();
        avlTree15.insert(1);
        int int18 = avlTree15.findMin();
        boolean boolean19 = avlTree15.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlTree15.root;
        avlNode20.element = (byte) 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode14, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.left;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = null;
        avlTree0.root = avlNode2;
        avlTree0.insert((int) (byte) 100);
        system.classfixer.classes.AvlTree avlTree7 = new system.classfixer.classes.AvlTree();
        avlTree7.insert(1);
        int int10 = avlTree7.findMin();
        avlTree7.insert((int) '4');
        avlTree7.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlTree7.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree19 = new system.classfixer.classes.AvlTree();
        avlTree19.insert(1);
        int int22 = avlTree19.findMin();
        boolean boolean23 = avlTree19.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlTree19.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode24, avlNode27);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlNode24.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode17, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode15, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode15.right;
        avlNode15.element = 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlNode15.right;
        avlTree0.root = avlNode15;
        boolean boolean37 = avlTree0.repOK();
        system.classfixer.classes.AvlTree avlTree38 = new system.classfixer.classes.AvlTree();
        avlTree38.insert(1);
        int int41 = avlTree38.findMin();
        avlTree38.insert((int) '4');
        avlTree38.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlTree38.root;
        avlNode46.height = 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = avlNode53.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode53, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = avlNode59.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode59, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode56, avlNode59);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree67 = new system.classfixer.classes.AvlTree();
        avlTree67.insert(1);
        int int70 = avlTree67.findMin();
        boolean boolean71 = avlTree67.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode72 = avlTree67.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode66, avlNode72);
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree77 = new system.classfixer.classes.AvlTree();
        avlTree77.insert(1);
        int int80 = avlTree77.findMin();
        boolean boolean81 = avlTree77.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = avlTree77.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = avlNode84.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode82, avlNode85);
        system.classfixer.classes.AvlTree.AvlNode avlNode87 = avlNode82.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode75, avlNode82);
        avlNode75.element = (short) 1;
        avlNode66.right = avlNode75;
        system.classfixer.classes.AvlTree.AvlNode avlNode92 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode56, avlNode66);
        int int93 = avlNode92.element;
        avlNode46.right = avlNode92;
        avlTree0.root = avlNode46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        int int6 = avlTree0.findMin();
        boolean boolean7 = avlTree0.repOK();
        system.classfixer.classes.AvlTree avlTree8 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree8.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        avlTree8.root = avlNode10;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree8.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        int int19 = avlNode18.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode18.right = avlNode21;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode18.right = avlNode24;
        avlTree8.root = avlNode24;
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
        avlNode46.element = '#';
        avlNode46.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = avlNode62.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode64 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode62, avlNode64);
        int int66 = avlNode65.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode65.right = avlNode68;
        avlNode68.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = avlNode74.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode74, avlNode76);
        int int78 = avlNode77.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode77.right = avlNode80;
        system.classfixer.classes.AvlTree.AvlNode avlNode83 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode77.right = avlNode83;
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode68, avlNode77);
        avlNode77.element = '#';
        avlNode77.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode90 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode46, avlNode77);
        system.classfixer.classes.AvlTree.AvlNode avlNode91 = avlNode46.right;
        avlNode24.right = avlNode46;
        avlNode46.element = (byte) 1;
        avlTree0.root = avlNode46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 10);
        boolean boolean8 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree12 = new system.classfixer.classes.AvlTree();
        avlTree12.insert(1);
        int int15 = avlTree12.findMin();
        boolean boolean16 = avlTree12.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlTree12.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode17, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode17.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode17.left;
        avlNode17.height = (byte) -1;
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.insert((int) (short) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode21, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode18, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree29 = new system.classfixer.classes.AvlTree();
        avlTree29.insert(1);
        int int32 = avlTree29.findMin();
        boolean boolean33 = avlTree29.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlTree29.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode28, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree39 = new system.classfixer.classes.AvlTree();
        avlTree39.insert(1);
        int int42 = avlTree39.findMin();
        boolean boolean43 = avlTree39.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = avlTree39.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = avlNode46.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode44, avlNode47);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode44.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode37, avlNode44);
        avlNode37.element = (short) 1;
        avlNode28.right = avlNode37;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode18, avlNode28);
        int int55 = avlNode54.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = avlNode54.left;
        avlTree0.root = avlNode54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        int int5 = avlTree0.findMin();
        avlTree0.remove((int) (short) 1);
        system.classfixer.classes.AvlTree avlTree9 = new system.classfixer.classes.AvlTree();
        avlTree9.insert(1);
        int int12 = avlTree9.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree9.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode16, avlNode18);
        int int20 = avlNode19.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode19.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode19.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode25.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode25.right;
        avlTree9.root = avlNode25;
        system.classfixer.classes.AvlTree avlTree30 = new system.classfixer.classes.AvlTree();
        avlTree30.insert(1);
        int int33 = avlTree30.findMin();
        boolean boolean34 = avlTree30.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlTree30.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1, avlNode25, avlNode35);
        avlTree0.root = avlNode36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlTree0.root = avlNode4;
        avlTree0.insert((int) '4');
        avlTree0.insert((int) (short) 1);
        int int10 = avlTree0.findMin();
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
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int41 = avlNode40.element;
        avlNode30.left = avlNode40;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode47, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = avlNode53.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode53, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode50, avlNode53);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree61 = new system.classfixer.classes.AvlTree();
        avlTree61.insert(1);
        int int64 = avlTree61.findMin();
        boolean boolean65 = avlTree61.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlTree61.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode60, avlNode66);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree71 = new system.classfixer.classes.AvlTree();
        avlTree71.insert(1);
        int int74 = avlTree71.findMin();
        boolean boolean75 = avlTree71.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = avlTree71.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = avlNode78.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode76, avlNode79);
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = avlNode76.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode69, avlNode76);
        avlNode69.element = (short) 1;
        avlNode60.right = avlNode69;
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode50, avlNode60);
        system.classfixer.classes.AvlTree.AvlNode avlNode87 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode30, avlNode50);
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = avlNode50.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode89 = avlNode50.right;
        avlTree0.root = avlNode50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 10);
        boolean boolean8 = avlTree0.isEmpty();
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.classfixer.classes.AvlTree avlTree14 = new system.classfixer.classes.AvlTree();
        avlTree14.insert(1);
        int int17 = avlTree14.findMin();
        avlTree14.insert((int) '4');
        avlTree14.remove((int) '#');
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlTree14.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree26 = new system.classfixer.classes.AvlTree();
        avlTree26.insert(1);
        int int29 = avlTree26.findMin();
        boolean boolean30 = avlTree26.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlTree26.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode33.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode31, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlNode31.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode31);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode22, avlNode37);
        avlNode37.element = '4';
        avlNode37.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode37.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = avlNode37.right;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((-1));
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove(0);
        avlTree0.remove((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        int int16 = avlNode15.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode15.right = avlNode18;
        avlNode18.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode24, avlNode26);
        int int28 = avlNode27.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode30;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode33;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode18, avlNode27);
        avlNode27.element = '#';
        avlNode27.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = null;
        system.classfixer.classes.AvlTree avlTree43 = new system.classfixer.classes.AvlTree();
        avlTree43.insert(1);
        int int46 = avlTree43.findMin();
        boolean boolean47 = avlTree43.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlTree43.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode50.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode48, avlNode51);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = avlNode48.left;
        system.classfixer.classes.AvlTree avlTree54 = new system.classfixer.classes.AvlTree();
        avlTree54.insert(1);
        int int57 = avlTree54.findMin();
        boolean boolean58 = avlTree54.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = avlTree54.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = avlNode59.right;
        avlNode48.left = avlNode59;
        int int62 = avlNode48.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode41, avlNode48);
        avlNode48.height = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode27, avlNode48);
        avlTree0.root = avlNode48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode13;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode20.right;
        avlNode10.right = avlNode20;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlNode10.left;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 10);
        avlTree0.insert((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode13, avlNode15);
        avlNode16.element = (short) 100;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode17;
        avlNode17.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        int int27 = avlNode26.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode26.right = avlNode32;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode26);
        int int35 = avlNode17.element;
        avlTree0.root = avlNode17;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode39, avlNode41);
        int int43 = avlNode42.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode42.right = avlNode45;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode42.right = avlNode48;
        int int50 = avlNode42.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode42.left;
        avlTree0.root = avlNode42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        avlTree0.remove((int) ' ');
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.classfixer.classes.AvlTree avlTree13 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlTree13.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        avlTree13.root = avlNode15;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlTree13.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        int int24 = avlNode23.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode29;
        avlTree13.root = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode36.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode36, avlNode38);
        int int40 = avlNode39.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode39.right = avlNode42;
        avlNode42.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode48.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode48, avlNode50);
        int int52 = avlNode51.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode51.right = avlNode54;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode51.right = avlNode57;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode42, avlNode51);
        avlNode51.element = '#';
        avlNode51.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode67.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode70 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode67, avlNode69);
        int int71 = avlNode70.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode70.right = avlNode73;
        avlNode73.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = avlNode79.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode79, avlNode81);
        int int83 = avlNode82.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode85 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode82.right = avlNode85;
        system.classfixer.classes.AvlTree.AvlNode avlNode88 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode82.right = avlNode88;
        system.classfixer.classes.AvlTree.AvlNode avlNode90 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode73, avlNode82);
        avlNode82.element = '#';
        avlNode82.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode95 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode51, avlNode82);
        system.classfixer.classes.AvlTree.AvlNode avlNode96 = avlNode51.right;
        avlNode29.right = avlNode51;
        avlTree0.root = avlNode51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        avlTree0.remove((int) (short) 100);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode17;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode21, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode21.right;
        avlNode11.right = avlNode21;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree30 = new system.classfixer.classes.AvlTree();
        avlTree30.insert(1);
        int int33 = avlTree30.findMin();
        boolean boolean34 = avlTree30.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlTree30.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlNode37.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode35, avlNode38);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode35.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode28, avlNode35);
        avlNode28.element = (short) 1;
        system.classfixer.classes.AvlTree avlTree44 = new system.classfixer.classes.AvlTree();
        avlTree44.insert(1);
        int int47 = avlTree44.findMin();
        boolean boolean48 = avlTree44.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlTree44.root;
        boolean boolean50 = avlTree44.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlTree44.root;
        avlTree44.insert((int) (byte) 0);
        avlTree44.remove((int) ' ');
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = avlTree44.root;
        int int57 = avlNode56.height;
        avlNode28.left = avlNode56;
        system.classfixer.classes.AvlTree avlTree59 = new system.classfixer.classes.AvlTree();
        avlTree59.insert(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlTree59.root = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = avlNode63.right;
        avlNode28.left = avlNode63;
        avlNode11.right = avlNode28;
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }
}

