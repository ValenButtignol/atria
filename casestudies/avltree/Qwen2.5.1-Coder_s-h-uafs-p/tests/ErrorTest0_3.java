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
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        int int4 = avlNode3.height;
        avlTree0.root = avlNode3;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        avlNode6.right = avlNode8;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        int int3 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode5.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        avlNode5.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode8.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int14 = avlNode13.height;
        avlNode8.right = avlNode13;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert(1);
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode8.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        avlNode15.right = avlNode18;
        avlNode8.left = avlNode15;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        int int3 = avlTree0.findMin();
        avlTree0.remove((int) ' ');
        int int6 = avlTree0.findMin();
        int int7 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree avlTree10 = new system.testclass.AvlTree();
        avlTree10.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode13 = avlTree10.root;
        int int14 = avlNode13.height;
        int int15 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode13, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode20.right;
        avlNode17.right = avlNode20;
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert(1);
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) 0);
        avlTree0.insert((int) (short) 1);
        avlTree0.insert(0);
        system.testclass.AvlTree avlTree7 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlTree7.root = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        int int13 = avlNode12.element;
        avlNode12.height = 100;
        avlTree7.root = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode17 = avlTree7.root;
        system.testclass.AvlTree avlTree21 = new system.testclass.AvlTree();
        avlTree21.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode24 = avlTree21.root;
        int int25 = avlNode24.height;
        int int26 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode24, avlNode28);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode24, avlNode31);
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode33.left;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        int int36 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode40.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode40.left;
        system.testclass.AvlTree.AvlNode avlNode44 = avlNode40.left;
        avlNode37.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode34, avlNode37);
        avlNode17.left = avlNode46;
        avlTree0.root = avlNode46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode8 = avlNode7.left;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode9.left;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode8, avlNode9);
        system.testclass.AvlTree avlTree13 = new system.testclass.AvlTree();
        avlTree13.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree13.root;
        int int17 = avlNode16.height;
        int int18 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode16, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode23.right;
        avlNode20.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        avlNode20.right = avlNode28;
        avlNode9.left = avlNode20;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlTree0.root = avlNode2;
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree avlTree6 = new system.testclass.AvlTree();
        avlTree6.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree6.root;
        int int10 = avlNode9.height;
        system.testclass.AvlTree avlTree11 = new system.testclass.AvlTree();
        avlTree11.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode14 = avlTree11.root;
        system.testclass.AvlTree.AvlNode avlNode15 = avlTree11.root;
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree11.root;
        avlNode9.right = avlNode16;
        int int18 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        system.testclass.AvlTree avlTree25 = new system.testclass.AvlTree();
        avlTree25.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode28 = avlTree25.root;
        int int29 = avlNode28.height;
        int int30 = avlNode28.height;
        avlNode28.height = 0;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode34.height = (byte) 1;
        avlNode28.left = avlNode34;
        system.testclass.AvlTree avlTree38 = new system.testclass.AvlTree();
        avlTree38.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode41 = avlTree38.root;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode41.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode34, avlNode41);
        avlNode22.left = avlNode34;
        system.testclass.AvlTree avlTree47 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        int int49 = avlNode48.height;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        avlNode48.right = avlNode50;
        avlNode48.element = 'a';
        avlTree47.root = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) (byte) 1, avlNode22, avlNode48);
        system.testclass.AvlTree.AvlNode avlNode56 = avlNode55.right;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) (byte) 0, avlNode9, avlNode56);
        avlTree0.root = avlNode57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert(1);
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode10.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        avlNode10.right = avlNode13;
        avlNode13.height = (byte) 1;
        system.testclass.AvlTree avlTree18 = new system.testclass.AvlTree();
        avlTree18.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree18.root;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.left = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode13, avlNode23);
        system.testclass.AvlTree avlTree26 = new system.testclass.AvlTree();
        avlTree26.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        int int30 = avlNode29.height;
        avlTree26.root = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode29.right;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode34.right;
        avlNode29.left = avlNode34;
        avlNode23.right = avlNode29;
        avlTree0.root = avlNode29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert((-1));
        avlTree0.remove(100);
        system.testclass.AvlTree avlTree8 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        avlTree8.root = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        avlNode9.left = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode20.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode20.right;
        int int24 = avlNode20.height;
        avlNode20.height = (short) -1;
        avlNode20.element = (short) 100;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode30.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode30.left;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode30.left;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode36.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        int int40 = avlNode39.height;
        avlNode36.right = avlNode39;
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode39.left;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int45 = avlNode44.height;
        avlNode39.right = avlNode44;
        avlNode30.right = avlNode39;
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode30.right;
        avlNode20.left = avlNode48;
        avlNode16.right = avlNode48;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        int int3 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        int int6 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode10.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        avlNode10.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode10.left;
        avlTree0.root = avlNode16;
        system.testclass.AvlTree avlTree18 = new system.testclass.AvlTree();
        avlTree18.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree18.root;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.left = avlNode23;
        system.testclass.AvlTree avlTree29 = new system.testclass.AvlTree();
        avlTree29.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode32 = avlTree29.root;
        int int33 = avlNode32.height;
        int int34 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode32, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int40 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode32, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode41.left;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = avlNode48.left;
        system.testclass.AvlTree.AvlNode avlNode52 = avlNode48.left;
        avlNode45.right = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode42, avlNode45);
        system.testclass.AvlTree avlTree55 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlTree55.root = avlNode57;
        avlNode42.left = avlNode57;
        system.testclass.AvlTree avlTree60 = new system.testclass.AvlTree();
        avlTree60.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode63 = avlTree60.root;
        int int64 = avlNode63.height;
        int int65 = avlNode63.height;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) ' ', avlNode42, avlNode63);
        avlNode21.left = avlNode63;
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = new system.testclass.AvlTree.AvlNode();
        int int2 = avlNode1.height;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        avlNode1.right = avlNode3;
        avlNode1.element = 'a';
        avlTree0.root = avlNode1;
        avlTree0.insert((int) '#');
        system.testclass.AvlTree avlTree10 = new system.testclass.AvlTree();
        avlTree10.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode13 = avlTree10.root;
        int int14 = avlNode13.height;
        system.testclass.AvlTree avlTree15 = new system.testclass.AvlTree();
        avlTree15.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode18 = avlTree15.root;
        system.testclass.AvlTree.AvlNode avlNode19 = avlTree15.root;
        system.testclass.AvlTree.AvlNode avlNode20 = avlTree15.root;
        avlNode13.right = avlNode20;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = new system.testclass.AvlTree.AvlNode();
        int int2 = avlNode1.height;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        avlNode1.right = avlNode3;
        avlNode1.element = 'a';
        avlTree0.root = avlNode1;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        avlTree0.insert((int) '4');
        system.testclass.AvlTree avlTree12 = new system.testclass.AvlTree();
        avlTree12.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        avlTree12.root = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.right;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode20.right;
        avlNode15.left = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode15.left;
        system.testclass.AvlTree avlTree27 = new system.testclass.AvlTree();
        avlTree27.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode30 = avlTree27.root;
        int int31 = avlNode30.height;
        int int32 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode30, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode30, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode40 = avlNode39.left;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        int int42 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        avlNode41.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode46.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode46.left;
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode46.left;
        avlNode43.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode40, avlNode43);
        avlNode15.left = avlNode43;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for avlTree0", avlTree0.property_3());
    }
}

