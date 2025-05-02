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
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        boolean boolean12 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.add((java.lang.Object) (short) 1);
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) boolean15);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList17 = new system.testclass.NodeCachingLinkedList();
        boolean boolean19 = nodeCachingLinkedList17.remove((java.lang.Object) (byte) 0);
        boolean boolean20 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 0);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }
}

