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
        avlTree0.remove(0);
        avlTree0.insert(100);
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
        avlNode24.height = (byte) -1;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        int int32 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        int int36 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        avlNode35.right = avlNode37;
        avlNode34.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = avlNode34.right;
        system.testclass.AvlTree avlTree41 = new system.testclass.AvlTree();
        avlTree41.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode44 = avlTree41.root;
        avlTree41.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode47 = avlTree41.root;
        avlTree41.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(1);
        avlTree41.root = avlNode51;
        avlNode40.right = avlNode51;
        avlNode30.left = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode56.left;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode(0);
        avlNode59.element = 0;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode63 = avlNode62.left;
        int int64 = avlNode62.element;
        avlNode59.right = avlNode62;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode57, avlNode62);
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode51, avlNode66);
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode67);
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode();
        int int71 = avlNode70.height;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode();
        avlNode70.right = avlNode72;
        avlNode70.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode76 = avlNode70.left;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int79 = avlNode78.height;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode70, avlNode78);
        int int81 = avlNode70.element;
        avlNode67.left = avlNode70;
        avlTree0.root = avlNode67;
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
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlTree0.root = avlNode11;
        avlTree0.insert(10);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode16.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        avlTree0.root = avlNode16;
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
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlTree0.root = avlNode11;
        avlTree0.insert(10);
        system.testclass.AvlTree avlTree15 = new system.testclass.AvlTree();
        avlTree15.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode18 = avlTree15.root;
        avlNode18.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode18.left = avlNode23;
        avlNode23.element = '4';
        avlTree0.root = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        avlNode30.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode36 = avlNode30.right;
        avlTree0.root = avlNode30;
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
        int int4 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.element;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode13 = null;
        avlNode11.right = avlNode13;
        int int15 = avlNode11.element;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode16);
        avlNode8.left = avlNode20;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode5 = avlNode4.left;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode(0);
        avlNode7.element = 0;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode10.left;
        int int12 = avlNode10.element;
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode5, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        int int17 = avlNode16.height;
        int int18 = avlNode16.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode20.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode20.right;
        system.testclass.AvlTree avlTree27 = new system.testclass.AvlTree();
        avlTree27.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode30 = avlTree27.root;
        avlTree27.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = avlTree27.root;
        avlTree27.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(1);
        avlTree27.root = avlNode37;
        avlNode26.right = avlNode37;
        avlNode16.left = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode42.left;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode(0);
        avlNode45.element = 0;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode48.left;
        int int50 = avlNode48.element;
        avlNode45.right = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode43, avlNode48);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode37, avlNode52);
        avlNode14.right = avlNode53;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode();
        int int59 = avlNode58.height;
        system.testclass.AvlTree.AvlNode avlNode60 = null;
        avlNode58.right = avlNode60;
        int int62 = avlNode58.element;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode64.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode67 = avlNode64.left;
        avlNode58.right = avlNode64;
        avlNode57.left = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode70 = avlNode58.left;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode();
        int int74 = avlNode73.height;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode();
        avlNode73.right = avlNode75;
        avlNode72.right = avlNode75;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) (byte) 1, avlNode70, avlNode72);
        avlNode53.right = avlNode72;
        avlTree0.root = avlNode72;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode10.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        avlNode13.element = 0;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode16.left;
        int int18 = avlNode16.element;
        avlNode13.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode11, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        int int24 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        avlNode27.right = avlNode29;
        avlNode26.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode26.right;
        system.testclass.AvlTree avlTree33 = new system.testclass.AvlTree();
        avlTree33.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode36 = avlTree33.root;
        avlTree33.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode39 = avlTree33.root;
        avlTree33.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(1);
        avlTree33.root = avlNode43;
        avlNode32.right = avlNode43;
        avlNode22.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode48.left;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(0);
        avlNode51.element = 0;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode55 = avlNode54.left;
        int int56 = avlNode54.element;
        avlNode51.right = avlNode54;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode49, avlNode54);
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode43, avlNode58);
        avlNode20.right = avlNode59;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(100);
        avlTree0.insert((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        int int10 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        avlNode13.right = avlNode15;
        avlNode12.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode12.right;
        system.testclass.AvlTree avlTree19 = new system.testclass.AvlTree();
        avlTree19.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode22 = avlTree19.root;
        avlTree19.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode25 = avlTree19.root;
        avlTree19.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(1);
        avlTree19.root = avlNode29;
        avlNode18.right = avlNode29;
        avlNode8.left = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode34.left;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        avlNode37.element = 0;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode41 = avlNode40.left;
        int int42 = avlNode40.element;
        avlNode37.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode35, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode29, avlNode44);
        avlTree0.root = avlNode44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.element;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = null;
        avlNode14.right = avlNode16;
        int int18 = avlNode14.element;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        avlNode19.right = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode14, avlNode19);
        avlNode11.left = avlNode23;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(100);
        avlTree0.insert((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        avlTree0.root = avlNode7;
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
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlTree0.root = avlNode11;
        system.testclass.AvlTree avlTree15 = new system.testclass.AvlTree();
        avlTree15.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode18 = avlTree15.root;
        avlTree15.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree15.root;
        avlTree15.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(1);
        avlTree15.root = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode25.left;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0, avlNode25, avlNode28);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode31.left;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0);
        avlNode34.element = 0;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode37.left;
        int int39 = avlNode37.element;
        avlNode34.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode32, avlNode37);
        system.testclass.AvlTree avlTree42 = new system.testclass.AvlTree();
        avlTree42.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode45 = avlTree42.root;
        avlTree42.remove((int) '4');
        boolean boolean48 = avlTree42.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode50.height = (byte) 1;
        avlTree42.root = avlNode50;
        avlNode41.left = avlNode50;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode28, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode56 = avlNode55.left;
        avlTree0.root = avlNode55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(10);
        int int5 = avlNode4.height;
        avlTree0.root = avlNode4;
        avlTree0.insert(1);
        int int9 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        avlNode14.element = 0;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        int int19 = avlNode17.element;
        avlNode14.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode12, avlNode17);
        system.testclass.AvlTree avlTree22 = new system.testclass.AvlTree();
        avlTree22.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode25 = avlTree22.root;
        avlTree22.remove((int) '4');
        boolean boolean28 = avlTree22.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode30.height = (byte) 1;
        avlTree22.root = avlNode30;
        avlNode21.left = avlNode30;
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        int int4 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        system.testclass.AvlTree avlTree10 = new system.testclass.AvlTree();
        avlTree10.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode13 = avlTree10.root;
        avlTree10.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree10.root;
        avlTree10.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(1);
        avlTree10.root = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(0, avlNode20, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode26.left;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0);
        avlNode29.element = 0;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode32.left;
        int int34 = avlNode32.element;
        avlNode29.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode27, avlNode32);
        system.testclass.AvlTree avlTree37 = new system.testclass.AvlTree();
        avlTree37.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode40 = avlTree37.root;
        avlTree37.remove((int) '4');
        boolean boolean43 = avlTree37.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode45.height = (byte) 1;
        avlTree37.root = avlNode45;
        avlNode36.left = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode23, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode51 = avlNode50.left;
        avlTree0.root = avlNode50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(35);
        system.testclass.AvlTree avlTree6 = new system.testclass.AvlTree();
        avlTree6.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree6.root;
        avlTree6.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = avlTree6.root;
        avlTree6.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(1);
        avlTree6.root = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode16.left;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0, avlNode16, avlNode19);
        int int21 = avlNode19.element;
        avlTree0.root = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        int int26 = avlNode25.height;
        system.testclass.AvlTree.AvlNode avlNode27 = null;
        avlNode25.right = avlNode27;
        int int29 = avlNode25.element;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode25, avlNode30);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode37.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode40 = avlNode37.right;
        system.testclass.AvlTree avlTree41 = new system.testclass.AvlTree();
        avlTree41.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode44 = avlTree41.root;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode44.left = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode37, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode25, avlNode44);
        avlTree0.root = avlNode49;
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
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlTree0.root = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = null;
        avlNode13.right = avlNode15;
        int int17 = avlNode13.element;
        system.testclass.AvlTree avlTree18 = new system.testclass.AvlTree();
        avlTree18.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree18.root;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode21.left = avlNode23;
        avlNode13.right = avlNode23;
        avlNode23.height = (byte) -1;
        avlTree0.root = avlNode23;
        system.testclass.AvlTree avlTree29 = new system.testclass.AvlTree();
        avlTree29.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode32 = avlTree29.root;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode32.left = avlNode34;
        avlNode34.element = (short) -1;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        int int43 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        avlNode42.right = avlNode44;
        avlNode41.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode47 = avlNode41.right;
        system.testclass.AvlTree avlTree48 = new system.testclass.AvlTree();
        avlTree48.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode51 = avlTree48.root;
        avlTree48.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode54 = avlTree48.root;
        avlTree48.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(1);
        avlTree48.root = avlNode58;
        avlNode47.right = avlNode58;
        avlNode39.right = avlNode47;
        avlNode34.right = avlNode39;
        system.testclass.AvlTree avlTree63 = new system.testclass.AvlTree();
        avlTree63.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode66 = avlTree63.root;
        avlNode66.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode();
        int int70 = avlNode69.height;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode();
        avlNode69.right = avlNode71;
        avlNode66.left = avlNode71;
        system.testclass.AvlTree.AvlNode avlNode74 = avlNode66.left;
        int int75 = avlNode74.element;
        avlNode34.left = avlNode74;
        avlTree0.root = avlNode34;
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
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode12.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode12.right;
        avlNode12.element = 'a';
        avlTree0.root = avlNode12;
        avlTree0.insert((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        avlNode22.element = 0;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode25.left;
        int int27 = avlNode25.element;
        avlNode22.right = avlNode25;
        avlNode22.height = 0;
        system.testclass.AvlTree avlTree31 = new system.testclass.AvlTree();
        avlTree31.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode34 = avlTree31.root;
        avlTree31.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode37 = avlTree31.root;
        avlTree31.remove((int) ' ');
        boolean boolean40 = avlTree31.isEmpty();
        boolean boolean41 = avlTree31.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode42 = avlTree31.root;
        avlNode22.right = avlNode42;
        avlTree0.root = avlNode22;
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
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        int int7 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree avlTree9 = new system.testclass.AvlTree();
        avlTree9.insert((int) (byte) -1);
        avlTree9.remove((-1));
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
        avlNode32.height = (byte) -1;
        avlTree9.root = avlNode32;
        int int38 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        int int41 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode42 = null;
        avlNode40.right = avlNode42;
        int int44 = avlNode40.element;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode46.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode46.left;
        avlNode40.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        int int55 = avlNode54.height;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        avlNode54.right = avlNode56;
        avlNode53.right = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode53.right;
        system.testclass.AvlTree avlTree60 = new system.testclass.AvlTree();
        avlTree60.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode63 = avlTree60.root;
        avlTree60.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode66 = avlTree60.root;
        avlTree60.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode(1);
        avlTree60.root = avlNode70;
        avlNode59.right = avlNode70;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode();
        int int74 = avlNode73.height;
        system.testclass.AvlTree.AvlNode avlNode75 = null;
        avlNode73.right = avlNode75;
        int int77 = avlNode73.element;
        system.testclass.AvlTree avlTree78 = new system.testclass.AvlTree();
        avlTree78.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode81 = avlTree78.root;
        system.testclass.AvlTree.AvlNode avlNode83 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode81.left = avlNode83;
        avlNode73.right = avlNode83;
        system.testclass.AvlTree.AvlNode avlNode86 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode59, avlNode73);
        avlNode73.element = (-1);
        system.testclass.AvlTree.AvlNode avlNode89 = new system.testclass.AvlTree.AvlNode(1, avlNode40, avlNode73);
        avlNode32.left = avlNode89;
        avlTree0.root = avlNode89;
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
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree avlTree10 = new system.testclass.AvlTree();
        avlTree10.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode13 = avlTree10.root;
        avlTree10.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree10.root;
        avlTree10.remove((int) ' ');
        boolean boolean19 = avlTree10.isEmpty();
        boolean boolean20 = avlTree10.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode21 = null;
        avlTree10.root = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        int int24 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode25 = null;
        avlNode23.right = avlNode25;
        int int27 = avlNode23.element;
        system.testclass.AvlTree avlTree28 = new system.testclass.AvlTree();
        avlTree28.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode31 = avlTree28.root;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.left = avlNode33;
        avlNode23.right = avlNode33;
        avlNode33.height = (byte) -1;
        avlTree10.root = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        int int42 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        avlNode41.right = avlNode43;
        avlNode40.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode46 = avlNode40.right;
        system.testclass.AvlTree avlTree47 = new system.testclass.AvlTree();
        avlTree47.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode50 = avlTree47.root;
        avlTree47.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode53 = avlTree47.root;
        avlTree47.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode(1);
        avlTree47.root = avlNode57;
        avlNode46.right = avlNode57;
        avlNode46.element = '#';
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode33, avlNode46);
        system.testclass.AvlTree.AvlNode avlNode63 = avlNode62.left;
        int int64 = avlNode62.element;
        avlTree0.root = avlNode62;
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
        int int4 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = null;
        avlNode12.right = avlNode14;
        int int16 = avlNode12.element;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode18.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode18.left;
        avlNode12.right = avlNode18;
        avlNode11.left = avlNode12;
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode11 = avlTree0.root;
        avlTree0.insert(0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        int int19 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        avlNode18.right = avlNode20;
        avlNode17.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode17.right;
        system.testclass.AvlTree avlTree24 = new system.testclass.AvlTree();
        avlTree24.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode27 = avlTree24.root;
        avlTree24.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = avlTree24.root;
        avlTree24.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(1);
        avlTree24.root = avlNode34;
        avlNode23.right = avlNode34;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = null;
        avlNode37.right = avlNode39;
        int int41 = avlNode37.element;
        system.testclass.AvlTree avlTree42 = new system.testclass.AvlTree();
        avlTree42.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode45 = avlTree42.root;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode45.left = avlNode47;
        avlNode37.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode23, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode();
        int int53 = avlNode52.height;
        system.testclass.AvlTree.AvlNode avlNode54 = null;
        avlNode52.right = avlNode54;
        int int56 = avlNode52.element;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode();
        int int58 = avlNode57.height;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode();
        avlNode57.right = avlNode59;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode52, avlNode57);
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode();
        int int65 = avlNode64.height;
        system.testclass.AvlTree.AvlNode avlNode66 = null;
        avlNode64.right = avlNode66;
        int int68 = avlNode64.element;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode70.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode73 = avlNode70.left;
        avlNode64.right = avlNode70;
        avlNode63.left = avlNode64;
        avlNode52.right = avlNode64;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode(0, avlNode37, avlNode64);
        avlTree0.root = avlNode64;
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
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlTree0.root = avlNode11;
        avlTree0.insert(10);
        boolean boolean15 = avlTree0.isEmpty();
        avlTree0.insert(1);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode19.left;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        avlNode22.element = 0;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode25.left;
        int int27 = avlNode25.element;
        avlNode22.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode20, avlNode25);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        int int33 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode();
        int int37 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        avlNode36.right = avlNode38;
        avlNode35.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode41 = avlNode35.right;
        system.testclass.AvlTree avlTree42 = new system.testclass.AvlTree();
        avlTree42.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode45 = avlTree42.root;
        avlTree42.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode48 = avlTree42.root;
        avlTree42.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(1);
        avlTree42.root = avlNode52;
        avlNode41.right = avlNode52;
        avlNode31.left = avlNode52;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode58 = avlNode57.left;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(0);
        avlNode60.element = 0;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode64 = avlNode63.left;
        int int65 = avlNode63.element;
        avlNode60.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode58, avlNode63);
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode52, avlNode67);
        avlNode29.right = avlNode68;
        int int70 = avlNode68.height;
        avlTree0.root = avlNode68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        int int3 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = null;
        avlNode4.right = avlNode6;
        int int8 = avlNode4.element;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode10.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode10.left;
        avlNode4.right = avlNode10;
        avlNode4.height = '#';
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(10);
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode19, avlNode22);
        avlNode4.left = avlNode22;
        avlTree0.root = avlNode4;
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
        int int5 = avlTree0.findMin();
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
        avlNode24.height = (byte) -1;
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode24.right;
        avlTree0.root = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        int int34 = avlNode33.height;
        int int35 = avlNode33.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        int int39 = avlNode38.height;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        avlNode38.right = avlNode40;
        avlNode37.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode37.right;
        system.testclass.AvlTree avlTree44 = new system.testclass.AvlTree();
        avlTree44.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode47 = avlTree44.root;
        avlTree44.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode50 = avlTree44.root;
        avlTree44.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(1);
        avlTree44.root = avlNode54;
        avlNode43.right = avlNode54;
        avlNode33.left = avlNode54;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode60 = avlNode59.left;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(0);
        avlNode62.element = 0;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode65.left;
        int int67 = avlNode65.element;
        avlNode62.right = avlNode65;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode60, avlNode65);
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode54, avlNode69);
        system.testclass.AvlTree.AvlNode avlNode71 = avlNode70.right;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode74 = null;
        avlNode73.left = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode76 = avlNode73.left;
        int int77 = avlNode73.height;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode(35, avlNode70, avlNode73);
        avlTree0.root = avlNode70;
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
        int int4 = avlTree0.findMin();
        avlTree0.remove((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlNode9.right = avlNode11;
        int int13 = avlNode9.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode15.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode15.left;
        avlNode9.right = avlNode15;
        avlNode8.left = avlNode9;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }
}

