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
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode1.setNextNode(linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode6.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList10 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode6, (java.lang.Object) nodeCachingLinkedList10);
        boolean boolean13 = nodeCachingLinkedList10.add((java.lang.Object) 1);
        boolean boolean14 = nodeCachingLinkedList10.property_2();
        boolean boolean15 = nodeCachingLinkedList10.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode17.setNextNode(linkedListNode19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode22.setNextNode(linkedListNode24);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode22, (java.lang.Object) nodeCachingLinkedList26);
        boolean boolean28 = nodeCachingLinkedList26.property_2();
        boolean boolean29 = nodeCachingLinkedList26.property_3();
        boolean boolean30 = nodeCachingLinkedList10.add((java.lang.Object) boolean29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode32.setNextNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) false);
        linkedListNode37.setNextNode(linkedListNode39);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList41 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode37, (java.lang.Object) nodeCachingLinkedList41);
        boolean boolean44 = nodeCachingLinkedList41.add((java.lang.Object) 1);
        boolean boolean45 = nodeCachingLinkedList41.property_2();
        boolean boolean46 = nodeCachingLinkedList41.property_2();
        boolean boolean47 = nodeCachingLinkedList10.remove((java.lang.Object) boolean46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList10", nodeCachingLinkedList10.property_4());
    }
}

