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
        system.testclass.AvlTree.AvlNode avlNode1 = new system.testclass.AvlTree.AvlNode();
        int int2 = avlNode1.height;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        avlNode1.right = avlNode3;
        avlNode1.element = 'a';
        avlTree0.root = avlNode1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode8.height = (byte) 1;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        int int4 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        int int7 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        avlNode10.right = avlNode12;
        avlNode9.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        system.testclass.AvlTree avlTree16 = new system.testclass.AvlTree();
        avlTree16.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode19 = avlTree16.root;
        avlTree16.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = avlTree16.root;
        avlTree16.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(1);
        avlTree16.root = avlNode26;
        avlNode15.right = avlNode26;
        avlNode5.left = avlNode26;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        boolean boolean11 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        int int16 = avlNode12.element;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode4.left;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode4.right;
        avlTree0.root = avlNode4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(10);
        int int5 = avlNode4.height;
        avlTree0.root = avlNode4;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode9 = avlNode8.left;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        avlNode11.element = 0;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode14.left;
        int int16 = avlNode14.element;
        avlNode11.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode9, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        avlNode20.element = 0;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode23.left;
        int int25 = avlNode23.element;
        avlNode20.right = avlNode23;
        avlNode14.left = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode31.right;
        system.testclass.AvlTree avlTree35 = new system.testclass.AvlTree();
        avlTree35.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode38 = avlTree35.root;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode38.left = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode31, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = null;
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        int int49 = avlNode48.height;
        int int50 = avlNode48.height;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        int int54 = avlNode53.height;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode();
        avlNode53.right = avlNode55;
        avlNode52.right = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode58 = avlNode52.right;
        system.testclass.AvlTree avlTree59 = new system.testclass.AvlTree();
        avlTree59.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode62 = avlTree59.root;
        avlTree59.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode65 = avlTree59.root;
        avlTree59.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode(1);
        avlTree59.root = avlNode69;
        avlNode58.right = avlNode69;
        avlNode48.left = avlNode69;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode75 = avlNode74.left;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode(0);
        avlNode77.element = 0;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode81 = avlNode80.left;
        int int82 = avlNode80.element;
        avlNode77.right = avlNode80;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode75, avlNode80);
        system.testclass.AvlTree.AvlNode avlNode85 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode69, avlNode84);
        avlNode43.right = avlNode85;
        system.testclass.AvlTree.AvlNode avlNode87 = avlNode43.right;
        system.testclass.AvlTree.AvlNode avlNode88 = new system.testclass.AvlTree.AvlNode(0, avlNode31, avlNode43);
        avlNode20.right = avlNode43;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(10);
        system.testclass.AvlTree.AvlNode avlNode5 = null;
        avlTree0.root = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode10.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode10.right;
        system.testclass.AvlTree avlTree14 = new system.testclass.AvlTree();
        avlTree14.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode17 = avlTree14.root;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode17.left = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode10, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = null;
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        int int29 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        int int33 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode();
        avlNode32.right = avlNode34;
        avlNode31.right = avlNode34;
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode31.right;
        system.testclass.AvlTree avlTree38 = new system.testclass.AvlTree();
        avlTree38.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode41 = avlTree38.root;
        avlTree38.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode44 = avlTree38.root;
        avlTree38.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode(1);
        avlTree38.root = avlNode48;
        avlNode37.right = avlNode48;
        avlNode27.left = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode53.left;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode(0);
        avlNode56.element = 0;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode60 = avlNode59.left;
        int int61 = avlNode59.element;
        avlNode56.right = avlNode59;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode54, avlNode59);
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode48, avlNode63);
        avlNode22.right = avlNode64;
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode22.right;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode22);
        int int68 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode69 = avlNode10.right;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(10);
        int int5 = avlNode4.height;
        avlTree0.root = avlNode4;
        avlTree0.insert((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode16.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        system.testclass.AvlTree avlTree23 = new system.testclass.AvlTree();
        avlTree23.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode26 = avlTree23.root;
        avlTree23.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = avlTree23.root;
        avlTree23.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(1);
        avlTree23.root = avlNode33;
        avlNode22.right = avlNode33;
        avlNode12.left = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode38.left;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        avlNode41.element = 0;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.left;
        int int46 = avlNode44.element;
        avlNode41.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode39, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode33, avlNode48);
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode10, avlNode49);
        avlTree0.root = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        int int55 = avlNode54.height;
        system.testclass.AvlTree.AvlNode avlNode56 = null;
        avlNode54.right = avlNode56;
        int int58 = avlNode54.element;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode();
        int int60 = avlNode59.height;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode();
        avlNode59.right = avlNode61;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode54, avlNode59);
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode();
        int int67 = avlNode66.height;
        system.testclass.AvlTree.AvlNode avlNode68 = null;
        avlNode66.right = avlNode68;
        int int70 = avlNode66.element;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode72.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode75 = avlNode72.left;
        avlNode66.right = avlNode72;
        avlNode65.left = avlNode66;
        avlNode54.right = avlNode66;
        avlTree0.root = avlNode54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode9.left;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        avlNode12.element = 0;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.left;
        int int17 = avlNode15.element;
        avlNode12.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        int int23 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        avlNode25.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = avlNode25.right;
        system.testclass.AvlTree avlTree32 = new system.testclass.AvlTree();
        avlTree32.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode35 = avlTree32.root;
        avlTree32.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode38 = avlTree32.root;
        avlTree32.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(1);
        avlTree32.root = avlNode42;
        avlNode31.right = avlNode42;
        avlNode21.left = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode47.left;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(0);
        avlNode50.element = 0;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode53.left;
        int int55 = avlNode53.element;
        avlNode50.right = avlNode53;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode48, avlNode53);
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode42, avlNode57);
        avlNode19.right = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode61.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode64 = avlNode61.right;
        avlNode58.left = avlNode61;
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode58.left;
        avlTree0.root = avlNode66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.insert(97);
        boolean boolean15 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = null;
        system.testclass.AvlTree.AvlNode avlNode19 = null;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0, avlNode19, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode17, avlNode22);
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        int int9 = avlTree0.findMin();
        int int10 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode16.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        system.testclass.AvlTree avlTree23 = new system.testclass.AvlTree();
        avlTree23.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode26 = avlTree23.root;
        avlTree23.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = avlTree23.root;
        avlTree23.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(1);
        avlTree23.root = avlNode33;
        avlNode22.right = avlNode33;
        avlNode12.left = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode38.left;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        avlNode41.element = 0;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.left;
        int int46 = avlNode44.element;
        avlNode41.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode39, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode33, avlNode48);
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.testclass.AvlTree.AvlNode avlNode51 = avlNode50.left;
        avlTree0.root = avlNode50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode7.right;
        system.testclass.AvlTree avlTree14 = new system.testclass.AvlTree();
        avlTree14.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode17 = avlTree14.root;
        avlTree14.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = avlTree14.root;
        avlTree14.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(1);
        avlTree14.root = avlNode24;
        avlNode13.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = null;
        avlNode27.right = avlNode29;
        int int31 = avlNode27.element;
        system.testclass.AvlTree avlTree32 = new system.testclass.AvlTree();
        avlTree32.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode35 = avlTree32.root;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode35.left = avlNode37;
        avlNode27.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode13, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode41 = avlNode13.left;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        avlTree0.insert(10);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode8 = null;
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        int int13 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        avlNode15.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode15.right;
        system.testclass.AvlTree avlTree22 = new system.testclass.AvlTree();
        avlTree22.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode25 = avlTree22.root;
        avlTree22.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode28 = avlTree22.root;
        avlTree22.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(1);
        avlTree22.root = avlNode32;
        avlNode21.right = avlNode32;
        avlNode11.left = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode37.left;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        avlNode40.element = 0;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode44 = avlNode43.left;
        int int45 = avlNode43.element;
        avlNode40.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode38, avlNode43);
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode32, avlNode47);
        avlNode6.right = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        int int51 = avlNode50.height;
        system.testclass.AvlTree.AvlNode avlNode52 = null;
        avlNode50.right = avlNode52;
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode50.right;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) ' ', avlNode6, avlNode50);
        system.testclass.AvlTree avlTree56 = new system.testclass.AvlTree();
        avlTree56.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode59 = avlTree56.root;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode59.left = avlNode61;
        avlNode61.element = (short) -1;
        int int65 = avlNode61.height;
        avlNode55.right = avlNode61;
        avlTree0.root = avlNode55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode14 = null;
        system.testclass.AvlTree.AvlNode avlNode16 = null;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode16, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode14, avlNode19);
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        avlTree0.remove(1);
        avlTree0.insert(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode13.left;
        int int15 = avlNode13.element;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        avlNode13.left = avlNode16;
        avlNode16.height = 'a';
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        int int4 = avlTree0.findMin();
        avlTree0.insert((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlNode9.right = avlNode11;
        int int13 = avlNode9.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = null;
        avlNode15.right = avlNode17;
        int int19 = avlNode15.element;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode15, avlNode20);
        avlNode9.right = avlNode24;
        int int26 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode24.right;
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode24.left;
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove(100);
        int int6 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = null;
        avlNode10.right = avlNode12;
        int int14 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode15);
        avlNode7.left = avlNode19;
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        int int4 = avlTree0.findMin();
        avlTree0.remove(100);
        system.testclass.AvlTree avlTree7 = new system.testclass.AvlTree();
        avlTree7.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode10 = avlTree7.root;
        avlNode10.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode10.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode10.left;
        int int19 = avlNode10.height;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        int int6 = avlTree0.findMin();
        avlTree0.insert(100);
        avlTree0.insert((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = null;
        system.testclass.AvlTree.AvlNode avlNode14 = null;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.left;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode12, avlNode17);
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(10);
        int int5 = avlNode4.height;
        avlTree0.root = avlNode4;
        avlTree0.insert((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode16.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        system.testclass.AvlTree avlTree23 = new system.testclass.AvlTree();
        avlTree23.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode26 = avlTree23.root;
        avlTree23.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = avlTree23.root;
        avlTree23.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(1);
        avlTree23.root = avlNode33;
        avlNode22.right = avlNode33;
        avlNode12.left = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode39 = avlNode38.left;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        avlNode41.element = 0;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.left;
        int int46 = avlNode44.element;
        avlNode41.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode39, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode33, avlNode48);
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode49.right;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode10, avlNode49);
        avlTree0.root = avlNode10;
        int int53 = avlTree0.findMin();
        avlTree0.insert((-1));
        boolean boolean56 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        int int59 = avlNode58.element;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode();
        int int62 = avlNode61.height;
        system.testclass.AvlTree.AvlNode avlNode63 = null;
        avlNode61.right = avlNode63;
        int int65 = avlNode61.element;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode();
        int int67 = avlNode66.height;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode();
        avlNode66.right = avlNode68;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode61, avlNode66);
        avlNode58.left = avlNode70;
        system.testclass.AvlTree.AvlNode avlNode72 = avlNode70.left;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode75 = avlNode74.left;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode(0);
        avlNode77.element = 0;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode81 = avlNode80.left;
        int int82 = avlNode80.element;
        avlNode77.right = avlNode80;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode75, avlNode80);
        system.testclass.AvlTree.AvlNode avlNode86 = new system.testclass.AvlTree.AvlNode(0);
        avlNode86.element = 0;
        system.testclass.AvlTree.AvlNode avlNode89 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode90 = avlNode89.left;
        int int91 = avlNode89.element;
        avlNode86.right = avlNode89;
        avlNode80.left = avlNode86;
        system.testclass.AvlTree.AvlNode avlNode94 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode70, avlNode80);
        avlTree0.root = avlNode70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlNode9.right = avlNode11;
        int int13 = avlNode9.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.left;
        avlNode9.right = avlNode15;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode8.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode8.right;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode6, avlNode14);
        avlNode3.right = avlNode6;
        avlTree0.root = avlNode3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(100);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        int int6 = avlTree0.findMin();
        avlTree0.remove(0);
        boolean boolean9 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        avlNode10.right = avlNode12;
        avlNode10.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode10.left;
        int int17 = avlNode10.height;
        avlNode10.height = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode10.left;
        int int21 = avlNode10.element;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (byte) 10);
        boolean boolean8 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree0.root;
        system.testclass.AvlTree avlTree11 = new system.testclass.AvlTree();
        avlTree11.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode14 = avlTree11.root;
        avlNode14.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode14.left = avlNode19;
        avlNode19.element = '4';
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0);
        avlNode29.element = 0;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode26, avlNode29);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode19, avlNode29);
        int int34 = avlNode29.height;
        avlTree0.root = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode36 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = null;
        avlNode37.right = avlNode39;
        int int41 = avlNode37.element;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = null;
        avlNode43.right = avlNode45;
        int int47 = avlNode43.element;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        int int49 = avlNode48.height;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode();
        avlNode48.right = avlNode50;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode43, avlNode48);
        avlNode37.right = avlNode52;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode(0);
        int int56 = avlNode55.element;
        avlNode55.height = 100;
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode55.right;
        int int60 = avlNode55.element;
        avlNode37.left = avlNode55;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.right;
        avlNode15.element = 'a';
        avlNode13.left = avlNode15;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        int int6 = avlTree0.findMin();
        boolean boolean7 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove(97);
        system.testclass.AvlTree.AvlNode avlNode13 = null;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode13, avlNode14);
        int int17 = avlNode16.height;
        avlNode16.element = '#';
        int int20 = avlNode16.height;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }
}

