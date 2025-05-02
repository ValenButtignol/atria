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
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert(0);
        int int6 = avlTree0.findMin();
        avlTree0.remove(97);
        avlTree0.insert((-1));
        avlTree0.remove(1);
        system.testclass.AvlTree avlTree13 = new system.testclass.AvlTree();
        avlTree13.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode16 = avlTree13.root;
        avlTree13.insert(1);
        system.testclass.AvlTree.AvlNode avlNode19 = avlTree13.root;
        avlTree13.remove(0);
        boolean boolean22 = avlTree13.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode23 = avlTree13.root;
        int int24 = avlNode23.height;
        avlTree0.root = avlNode23;
        boolean boolean26 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode29.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        int int33 = avlNode32.height;
        avlNode29.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode32.left;
        system.testclass.AvlTree avlTree37 = new system.testclass.AvlTree();
        avlTree37.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode40 = avlTree37.root;
        int int41 = avlNode40.height;
        int int42 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode40, avlNode44);
        avlNode32.right = avlNode45;
        avlNode45.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode51.height = (byte) 1;
        system.testclass.AvlTree avlTree54 = new system.testclass.AvlTree();
        avlTree54.insert((int) (short) -1);
        system.testclass.AvlTree.AvlNode avlNode57 = avlTree54.root;
        system.testclass.AvlTree.AvlNode avlNode58 = avlTree54.root;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(0);
        avlNode58.right = avlNode60;
        avlNode51.right = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        int int66 = avlNode65.height;
        system.testclass.AvlTree.AvlNode avlNode67 = null;
        avlNode65.right = avlNode67;
        system.testclass.AvlTree avlTree69 = new system.testclass.AvlTree();
        avlTree69.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode72 = avlTree69.root;
        int int73 = avlNode72.height;
        int int74 = avlNode72.height;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode67, avlNode72);
        system.testclass.AvlTree avlTree76 = new system.testclass.AvlTree();
        avlTree76.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode79 = avlTree76.root;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode75, avlNode79);
        system.testclass.AvlTree.AvlNode avlNode81 = new system.testclass.AvlTree.AvlNode((int) (byte) 0, avlNode51, avlNode80);
        avlNode45.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode83 = null;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode(100, avlNode45, avlNode83);
        int int85 = avlNode84.height;
        avlTree0.root = avlNode84;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }
}

