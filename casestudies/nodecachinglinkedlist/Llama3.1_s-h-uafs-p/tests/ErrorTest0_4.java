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
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList2 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList2.property_1();
        boolean boolean4 = nodeCachingLinkedList2.property_2();
        boolean boolean5 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getNextNode();
        linkedListNode3.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = null;
        linkedListNode3.setNextNode(linkedListNode7);
        boolean boolean9 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList5 = new system.testclass.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList5.property_1();
        boolean boolean7 = nodeCachingLinkedList5.property_2();
        boolean boolean8 = nodeCachingLinkedList5.property_2();
        boolean boolean9 = nodeCachingLinkedList5.property_3();
        boolean boolean10 = nodeCachingLinkedList5.property_2();
        boolean boolean11 = nodeCachingLinkedList0.add((java.lang.Object) boolean10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        linkedListNode7.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode7.getPreviousNode();
        java.lang.Class<?> wildcardClass12 = linkedListNode11.getClass();
        boolean boolean13 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean4 = nodeCachingLinkedList3.property_1();
        boolean boolean5 = nodeCachingLinkedList3.composedRepOK();
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList3.getClass();
        boolean boolean7 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        boolean boolean7 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getNextNode();
        boolean boolean5 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        linkedListNode13.setPreviousNode(linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode14, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode17, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode19.setPreviousNode(linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode20.getPreviousNode();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        linkedListNode11.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode15, (java.lang.Object) linkedListNode17);
        boolean boolean20 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = null;
        linkedListNode10.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode11, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode14, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode17.setPreviousNode(linkedListNode20);
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode20, (java.lang.Object) linkedListNode23);
        boolean boolean25 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = null;
        linkedListNode10.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode11, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode14, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getNextNode();
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        linkedListNode20.setValue((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        boolean boolean25 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList8.getClass();
        boolean boolean10 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList8);
        boolean boolean11 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList12 = new system.testclass.NodeCachingLinkedList();
        boolean boolean13 = nodeCachingLinkedList12.property_1();
        boolean boolean14 = nodeCachingLinkedList12.property_1();
        boolean boolean15 = nodeCachingLinkedList12.property_3();
        boolean boolean16 = nodeCachingLinkedList12.property_3();
        boolean boolean17 = nodeCachingLinkedList12.composedRepOK();
        boolean boolean18 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_2();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        boolean boolean6 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList7.property_1();
        boolean boolean9 = nodeCachingLinkedList7.property_3();
        boolean boolean10 = nodeCachingLinkedList7.property_2();
        boolean boolean11 = nodeCachingLinkedList0.add((java.lang.Object) boolean10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getNextNode();
        linkedListNode2.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode2.getPreviousNode();
        boolean boolean7 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        linkedListNode12.setPreviousNode(linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode13, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode16, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode19);
        boolean boolean21 = nodeCachingLinkedList0.property_1();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_2();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = null;
        linkedListNode11.setPreviousNode(linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode12, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode15, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getNextNode();
        linkedListNode18.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = null;
        linkedListNode29.setPreviousNode(linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode30, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode33, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode35.setPreviousNode(linkedListNode36);
        linkedListNode23.setPreviousNode(linkedListNode36);
        linkedListNode15.setValue((java.lang.Object) linkedListNode36);
        boolean boolean40 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        linkedListNode9.setPreviousNode(linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode10, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode13, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getNextNode();
        linkedListNode16.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        linkedListNode27.setPreviousNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode28, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode31, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode33.setPreviousNode(linkedListNode34);
        linkedListNode21.setPreviousNode(linkedListNode34);
        linkedListNode13.setValue((java.lang.Object) linkedListNode34);
        boolean boolean38 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getNextNode();
        linkedListNode10.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode14.getNextNode();
        linkedListNode8.setPreviousNode(linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        linkedListNode19.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode25.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode29, (java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        linkedListNode14.setValue((java.lang.Object) linkedListNode34);
        java.lang.Object obj37 = linkedListNode14.getValue();
        boolean boolean38 = nodeCachingLinkedList0.remove(obj37);
        boolean boolean39 = nodeCachingLinkedList0.property_2();
        boolean boolean40 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        linkedListNode41.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        linkedListNode47.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode51, (java.lang.Object) linkedListNode53);
        boolean boolean56 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        linkedListNode9.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        linkedListNode15.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        linkedListNode15.setValue((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        linkedListNode22.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = null;
        linkedListNode22.setNextNode(linkedListNode26);
        linkedListNode20.setNextNode(linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        linkedListNode29.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getNextNode();
        linkedListNode35.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode39, (java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode39, (java.lang.Object) (byte) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode20.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = null;
        linkedListNode52.setPreviousNode(linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode53, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode56, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode59.setPreviousNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = null;
        linkedListNode71.setPreviousNode(linkedListNode72);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode69, linkedListNode72, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode75, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode62, (java.lang.Object) linkedListNode67);
        linkedListNode13.setNextNode(linkedListNode20);
        boolean boolean81 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        linkedListNode9.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode14);
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean8 = nodeCachingLinkedList0.remove((java.lang.Object) 100.0d);
        boolean boolean9 = nodeCachingLinkedList0.property_2();
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        linkedListNode12.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getNextNode();
        linkedListNode12.setValue((java.lang.Object) linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        linkedListNode19.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        linkedListNode19.setNextNode(linkedListNode23);
        linkedListNode17.setNextNode(linkedListNode19);
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean8 = nodeCachingLinkedList0.remove((java.lang.Object) 100.0d);
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList10 = new system.testclass.NodeCachingLinkedList();
        boolean boolean11 = nodeCachingLinkedList10.property_1();
        boolean boolean12 = nodeCachingLinkedList10.property_2();
        boolean boolean13 = nodeCachingLinkedList10.composedRepOK();
        boolean boolean14 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList5 = new system.testclass.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList5.property_1();
        boolean boolean7 = nodeCachingLinkedList5.property_1();
        boolean boolean8 = nodeCachingLinkedList5.property_3();
        boolean boolean9 = nodeCachingLinkedList5.property_3();
        boolean boolean10 = nodeCachingLinkedList5.property_3();
        boolean boolean11 = nodeCachingLinkedList5.property_2();
        boolean boolean12 = nodeCachingLinkedList5.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        java.lang.Class<?> wildcardClass14 = nodeCachingLinkedList13.getClass();
        boolean boolean15 = nodeCachingLinkedList5.remove((java.lang.Object) nodeCachingLinkedList13);
        boolean boolean16 = nodeCachingLinkedList5.property_1();
        boolean boolean17 = nodeCachingLinkedList5.property_3();
        boolean boolean18 = nodeCachingLinkedList5.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        linkedListNode22.setPreviousNode(linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode23, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        linkedListNode28.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getNextNode();
        linkedListNode34.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode38, (java.lang.Object) linkedListNode40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getNextNode();
        linkedListNode43.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        linkedListNode43.setValue((java.lang.Object) linkedListNode48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode50.getNextNode();
        linkedListNode50.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = null;
        linkedListNode50.setNextNode(linkedListNode54);
        linkedListNode48.setNextNode(linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getNextNode();
        linkedListNode57.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getNextNode();
        linkedListNode63.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode63.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode67, (java.lang.Object) linkedListNode69);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode67, (java.lang.Object) (byte) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode48.getNextNode();
        linkedListNode33.setPreviousNode(linkedListNode74);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode76.getNextNode();
        linkedListNode76.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode76.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode80.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode33, (java.lang.Object) linkedListNode81);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = linkedListNode83.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode83.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode83.getPreviousNode();
        java.lang.Class<?> wildcardClass87 = linkedListNode83.getClass();
        linkedListNode82.setValue((java.lang.Object) wildcardClass87);
        boolean boolean89 = nodeCachingLinkedList5.remove((java.lang.Object) linkedListNode82);
        boolean boolean90 = nodeCachingLinkedList0.add((java.lang.Object) boolean89);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList6 = new system.testclass.NodeCachingLinkedList();
        boolean boolean7 = nodeCachingLinkedList6.property_1();
        boolean boolean8 = nodeCachingLinkedList6.property_3();
        boolean boolean9 = nodeCachingLinkedList6.property_2();
        boolean boolean10 = nodeCachingLinkedList6.composedRepOK();
        boolean boolean11 = nodeCachingLinkedList6.property_1();
        boolean boolean12 = nodeCachingLinkedList6.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode15.getPreviousNode();
        linkedListNode13.setPreviousNode(linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode15);
        boolean boolean20 = nodeCachingLinkedList6.remove((java.lang.Object) linkedListNode19);
        boolean boolean21 = nodeCachingLinkedList0.remove((java.lang.Object) boolean20);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList22 = new system.testclass.NodeCachingLinkedList();
        boolean boolean23 = nodeCachingLinkedList22.property_1();
        boolean boolean24 = nodeCachingLinkedList22.property_1();
        boolean boolean25 = nodeCachingLinkedList22.property_3();
        boolean boolean26 = nodeCachingLinkedList22.property_3();
        boolean boolean27 = nodeCachingLinkedList22.property_3();
        boolean boolean28 = nodeCachingLinkedList22.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode34.setPreviousNode(linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode35, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode38, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        boolean boolean42 = nodeCachingLinkedList22.remove((java.lang.Object) linkedListNode41);
        boolean boolean43 = nodeCachingLinkedList0.add((java.lang.Object) boolean42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList10 = new system.testclass.NodeCachingLinkedList();
        boolean boolean11 = nodeCachingLinkedList10.property_1();
        boolean boolean12 = nodeCachingLinkedList10.property_1();
        boolean boolean13 = nodeCachingLinkedList10.property_3();
        boolean boolean14 = nodeCachingLinkedList10.property_3();
        boolean boolean15 = nodeCachingLinkedList10.composedRepOK();
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        boolean boolean10 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        linkedListNode16.setPreviousNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode17, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode20, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList23.property_1();
        boolean boolean25 = nodeCachingLinkedList23.property_3();
        boolean boolean26 = nodeCachingLinkedList23.property_2();
        boolean boolean27 = nodeCachingLinkedList23.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = null;
        linkedListNode33.setPreviousNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode37, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getNextNode();
        boolean boolean42 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        linkedListNode22.setPreviousNode(linkedListNode41);
        boolean boolean45 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode41);
        boolean boolean46 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getNextNode();
        linkedListNode49.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode53.getNextNode();
        linkedListNode47.setPreviousNode(linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = null;
        linkedListNode62.setPreviousNode(linkedListNode63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode63, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode66, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        linkedListNode47.setValue((java.lang.Object) linkedListNode69);
        boolean boolean72 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_2();
        boolean boolean6 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        linkedListNode12.setPreviousNode(linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode13, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode16, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode8.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        boolean boolean21 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        boolean boolean10 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        linkedListNode13.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode17.getNextNode();
        linkedListNode11.setPreviousNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode17.getPreviousNode();
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode0 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = linkedListNode0.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = null;
        linkedListNode5.setPreviousNode(linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode6, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode9, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode1.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode12.setPreviousNode(linkedListNode15);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList17 = new system.testclass.NodeCachingLinkedList();
        boolean boolean18 = nodeCachingLinkedList17.property_1();
        boolean boolean19 = nodeCachingLinkedList17.property_1();
        boolean boolean20 = nodeCachingLinkedList17.property_2();
        linkedListNode15.setValue((java.lang.Object) nodeCachingLinkedList17);
        boolean boolean22 = nodeCachingLinkedList17.property_1();
        boolean boolean23 = nodeCachingLinkedList17.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        linkedListNode26.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode30.getNextNode();
        linkedListNode24.setPreviousNode(linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getNextNode();
        linkedListNode35.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        linkedListNode41.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode45, (java.lang.Object) linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode50.getPreviousNode();
        linkedListNode30.setValue((java.lang.Object) linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode55.getPreviousNode();
        linkedListNode53.setPreviousNode(linkedListNode55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode55);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList60 = new system.testclass.NodeCachingLinkedList();
        boolean boolean61 = nodeCachingLinkedList60.property_1();
        boolean boolean62 = nodeCachingLinkedList60.property_3();
        boolean boolean63 = nodeCachingLinkedList60.property_2();
        boolean boolean64 = nodeCachingLinkedList60.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode65.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = null;
        linkedListNode70.setPreviousNode(linkedListNode71);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode68, linkedListNode71, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode74, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode77.getNextNode();
        boolean boolean79 = nodeCachingLinkedList60.remove((java.lang.Object) linkedListNode78);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode78.getNextNode();
        linkedListNode59.setPreviousNode(linkedListNode78);
        java.lang.Object obj82 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode78, obj82);
        boolean boolean84 = nodeCachingLinkedList17.add((java.lang.Object) linkedListNode83);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList17", nodeCachingLinkedList17.property_4());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList2 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList2.composedRepOK();
        boolean boolean5 = nodeCachingLinkedList2.remove((java.lang.Object) (byte) 100);
        boolean boolean6 = nodeCachingLinkedList2.property_2();
        boolean boolean7 = nodeCachingLinkedList2.property_1();
        boolean boolean8 = nodeCachingLinkedList2.property_1();
        boolean boolean9 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getNextNode();
        linkedListNode10.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode14.getNextNode();
        linkedListNode8.setPreviousNode(linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        linkedListNode19.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode25.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode29, (java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        linkedListNode14.setValue((java.lang.Object) linkedListNode34);
        java.lang.Object obj37 = linkedListNode14.getValue();
        boolean boolean38 = nodeCachingLinkedList0.remove(obj37);
        boolean boolean39 = nodeCachingLinkedList0.property_2();
        boolean boolean40 = nodeCachingLinkedList0.property_1();
        boolean boolean41 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getNextNode();
        linkedListNode42.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getNextNode();
        linkedListNode42.setValue((java.lang.Object) linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getNextNode();
        linkedListNode49.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = null;
        linkedListNode49.setNextNode(linkedListNode53);
        linkedListNode47.setNextNode(linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getNextNode();
        linkedListNode56.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode62.getNextNode();
        linkedListNode62.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode62.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode66, (java.lang.Object) linkedListNode68);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode66, (java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass73 = linkedListNode47.getClass();
        boolean boolean74 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        boolean boolean10 = nodeCachingLinkedList0.property_2();
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean8 = nodeCachingLinkedList0.remove((java.lang.Object) 100.0d);
        boolean boolean9 = nodeCachingLinkedList0.property_2();
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList12 = new system.testclass.NodeCachingLinkedList();
        boolean boolean13 = nodeCachingLinkedList12.property_1();
        boolean boolean14 = nodeCachingLinkedList12.property_1();
        boolean boolean15 = nodeCachingLinkedList12.property_3();
        boolean boolean16 = nodeCachingLinkedList12.property_3();
        boolean boolean17 = nodeCachingLinkedList12.property_3();
        boolean boolean18 = nodeCachingLinkedList12.property_2();
        boolean boolean20 = nodeCachingLinkedList12.remove((java.lang.Object) 100.0d);
        boolean boolean21 = nodeCachingLinkedList12.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList12);
        boolean boolean23 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList12);
        boolean boolean24 = nodeCachingLinkedList0.property_1();
        boolean boolean25 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = null;
        linkedListNode31.setPreviousNode(linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode32, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode35, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode38.setPreviousNode(linkedListNode41);
        linkedListNode41.setValue((java.lang.Object) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        linkedListNode45.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        linkedListNode41.setPreviousNode(linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode49.getNextNode();
        boolean boolean53 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.property_3();
        boolean boolean9 = nodeCachingLinkedList0.property_2();
        boolean boolean10 = nodeCachingLinkedList0.property_1();
        boolean boolean11 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getNextNode();
        linkedListNode14.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getNextNode();
        linkedListNode14.setValue((java.lang.Object) linkedListNode19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode19, (java.lang.Object) (-1L));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode12.getNextNode();
        java.lang.Class<?> wildcardClass24 = linkedListNode23.getClass();
        boolean boolean25 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList5 = new system.testclass.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList5.property_1();
        boolean boolean7 = nodeCachingLinkedList5.property_1();
        boolean boolean8 = nodeCachingLinkedList5.property_3();
        boolean boolean9 = nodeCachingLinkedList5.property_3();
        boolean boolean10 = nodeCachingLinkedList5.property_3();
        boolean boolean11 = nodeCachingLinkedList5.property_2();
        boolean boolean12 = nodeCachingLinkedList5.composedRepOK();
        boolean boolean13 = nodeCachingLinkedList5.property_2();
        boolean boolean14 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        linkedListNode12.setPreviousNode(linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode13, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode16, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode19);
        boolean boolean21 = nodeCachingLinkedList0.property_3();
        boolean boolean22 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getNextNode();
        linkedListNode23.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        linkedListNode30.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getNextNode();
        linkedListNode30.setValue((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getNextNode();
        linkedListNode37.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        linkedListNode37.setNextNode(linkedListNode41);
        linkedListNode35.setNextNode(linkedListNode37);
        linkedListNode29.setValue((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        linkedListNode45.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode49);
        java.lang.Object obj52 = linkedListNode51.getValue();
        linkedListNode35.setNextNode(linkedListNode51);
        java.lang.Class<?> wildcardClass54 = linkedListNode35.getClass();
        boolean boolean55 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_2();
        boolean boolean5 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean6 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        linkedListNode7.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        java.lang.Object obj14 = linkedListNode13.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        linkedListNode15.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        linkedListNode13.setNextNode(linkedListNode19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        linkedListNode13.setValue((java.lang.Object) linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = null;
        linkedListNode32.setPreviousNode(linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode33, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode36, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode39.setPreviousNode(linkedListNode42);
        java.lang.Object obj44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode42, (java.lang.Object) linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode45.getNextNode();
        linkedListNode23.setNextNode(linkedListNode47);
        boolean boolean49 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getNextNode();
        linkedListNode6.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList0.property_3();
        boolean boolean15 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean16 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        linkedListNode22.setPreviousNode(linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode23, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode26, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode29.setPreviousNode(linkedListNode32);
        linkedListNode32.setValue((java.lang.Object) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getNextNode();
        linkedListNode36.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        linkedListNode32.setPreviousNode(linkedListNode40);
        boolean boolean43 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList5 = new system.testclass.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList5.property_1();
        boolean boolean7 = nodeCachingLinkedList5.property_1();
        boolean boolean8 = nodeCachingLinkedList5.property_3();
        boolean boolean9 = nodeCachingLinkedList5.property_3();
        boolean boolean10 = nodeCachingLinkedList5.property_3();
        boolean boolean11 = nodeCachingLinkedList5.property_1();
        boolean boolean12 = nodeCachingLinkedList5.composedRepOK();
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = null;
        linkedListNode15.setPreviousNode(linkedListNode16);
        java.lang.Object obj18 = linkedListNode15.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        linkedListNode21.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode21.setValue((java.lang.Object) linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = null;
        linkedListNode33.setPreviousNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode37, (java.lang.Object) (byte) 1);
        linkedListNode26.setPreviousNode(linkedListNode39);
        linkedListNode19.setPreviousNode(linkedListNode39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        linkedListNode44.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getNextNode();
        linkedListNode44.setValue((java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode49, (java.lang.Object) (-1L));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getNextNode();
        linkedListNode53.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode57, (java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode57.getPreviousNode();
        linkedListNode19.setNextNode(linkedListNode60);
        linkedListNode15.setNextNode(linkedListNode19);
        boolean boolean63 = nodeCachingLinkedList5.add((java.lang.Object) linkedListNode19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList5", nodeCachingLinkedList5.property_4());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        boolean boolean10 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        linkedListNode16.setPreviousNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode17, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode20, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList23.property_1();
        boolean boolean25 = nodeCachingLinkedList23.property_3();
        boolean boolean26 = nodeCachingLinkedList23.property_2();
        boolean boolean27 = nodeCachingLinkedList23.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = null;
        linkedListNode33.setPreviousNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode37, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getNextNode();
        boolean boolean42 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        linkedListNode22.setPreviousNode(linkedListNode41);
        boolean boolean45 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList46 = new system.testclass.NodeCachingLinkedList();
        boolean boolean47 = nodeCachingLinkedList46.composedRepOK();
        boolean boolean49 = nodeCachingLinkedList46.remove((java.lang.Object) (byte) 100);
        boolean boolean50 = nodeCachingLinkedList46.property_2();
        boolean boolean51 = nodeCachingLinkedList46.property_3();
        boolean boolean52 = nodeCachingLinkedList46.property_3();
        boolean boolean53 = nodeCachingLinkedList46.property_2();
        boolean boolean54 = nodeCachingLinkedList0.add((java.lang.Object) boolean53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_2();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_3();
        boolean boolean7 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        linkedListNode8.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode12);
        boolean boolean15 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.property_3();
        boolean boolean9 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList10 = new system.testclass.NodeCachingLinkedList();
        boolean boolean11 = nodeCachingLinkedList10.property_1();
        boolean boolean12 = nodeCachingLinkedList10.property_1();
        boolean boolean13 = nodeCachingLinkedList10.property_3();
        boolean boolean14 = nodeCachingLinkedList10.property_3();
        boolean boolean15 = nodeCachingLinkedList10.property_3();
        boolean boolean16 = nodeCachingLinkedList10.property_1();
        boolean boolean17 = nodeCachingLinkedList10.property_3();
        boolean boolean18 = nodeCachingLinkedList10.composedRepOK();
        boolean boolean19 = nodeCachingLinkedList10.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = null;
        linkedListNode25.setPreviousNode(linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode26, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode29, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode32.setPreviousNode(linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode37.getPreviousNode();
        linkedListNode32.setPreviousNode(linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getNextNode();
        linkedListNode42.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getNextNode();
        linkedListNode42.setValue((java.lang.Object) linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getNextNode();
        linkedListNode49.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = null;
        linkedListNode49.setNextNode(linkedListNode53);
        linkedListNode47.setNextNode(linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode49, (java.lang.Object) (byte) -1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode58);
        linkedListNode37.setPreviousNode(linkedListNode59);
        boolean boolean61 = nodeCachingLinkedList10.remove((java.lang.Object) linkedListNode59);
        boolean boolean62 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        boolean boolean6 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        linkedListNode13.setPreviousNode(linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode14, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode17, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode19.setPreviousNode(linkedListNode20);
        java.lang.Class<?> wildcardClass22 = linkedListNode19.getClass();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList8.property_1();
        boolean boolean10 = nodeCachingLinkedList8.property_2();
        boolean boolean11 = nodeCachingLinkedList8.property_2();
        boolean boolean12 = nodeCachingLinkedList8.property_3();
        boolean boolean13 = nodeCachingLinkedList8.property_2();
        boolean boolean14 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList8);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList15 = new system.testclass.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.property_1();
        boolean boolean17 = nodeCachingLinkedList15.property_1();
        boolean boolean18 = nodeCachingLinkedList15.property_3();
        boolean boolean19 = nodeCachingLinkedList15.property_3();
        boolean boolean20 = nodeCachingLinkedList15.property_3();
        boolean boolean21 = nodeCachingLinkedList15.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        linkedListNode27.setPreviousNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode28, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode31, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        boolean boolean35 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode34);
        boolean boolean36 = nodeCachingLinkedList8.add((java.lang.Object) boolean35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList8", nodeCachingLinkedList8.property_4());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getNextNode();
        linkedListNode6.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList0.property_3();
        boolean boolean15 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getNextNode();
        linkedListNode16.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getNextNode();
        linkedListNode23.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        linkedListNode23.setValue((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        linkedListNode30.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = null;
        linkedListNode30.setNextNode(linkedListNode34);
        linkedListNode28.setNextNode(linkedListNode30);
        linkedListNode22.setValue((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode28.getPreviousNode();
        boolean boolean40 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        linkedListNode41.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        linkedListNode41.setValue((java.lang.Object) linkedListNode46);
        java.lang.Object obj48 = linkedListNode46.getValue();
        java.lang.Object obj49 = linkedListNode46.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode46.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        linkedListNode51.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode51.getPreviousNode();
        java.lang.Object obj56 = linkedListNode55.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode55.getNextNode();
        java.lang.Object obj58 = linkedListNode55.getValue();
        linkedListNode46.setValue(obj58);
        boolean boolean60 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode0 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = linkedListNode0.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = null;
        linkedListNode3.setPreviousNode(linkedListNode4);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode4, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList8.property_1();
        boolean boolean10 = nodeCachingLinkedList8.property_3();
        boolean boolean11 = nodeCachingLinkedList8.property_2();
        boolean boolean12 = nodeCachingLinkedList8.composedRepOK();
        boolean boolean13 = nodeCachingLinkedList8.property_1();
        linkedListNode1.setValue((java.lang.Object) nodeCachingLinkedList8);
        boolean boolean15 = nodeCachingLinkedList8.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList16.property_1();
        boolean boolean18 = nodeCachingLinkedList16.property_3();
        boolean boolean19 = nodeCachingLinkedList16.property_2();
        boolean boolean20 = nodeCachingLinkedList16.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = null;
        linkedListNode26.setPreviousNode(linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode27, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode30, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getNextNode();
        boolean boolean35 = nodeCachingLinkedList16.remove((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getNextNode();
        boolean boolean38 = nodeCachingLinkedList8.add((java.lang.Object) linkedListNode36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList8", nodeCachingLinkedList8.property_4());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_2();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode8.getPreviousNode();
        linkedListNode6.setPreviousNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean14 = nodeCachingLinkedList13.property_1();
        boolean boolean15 = nodeCachingLinkedList13.property_3();
        boolean boolean16 = nodeCachingLinkedList13.property_2();
        boolean boolean17 = nodeCachingLinkedList13.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        linkedListNode23.setPreviousNode(linkedListNode24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode24, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode27, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        boolean boolean32 = nodeCachingLinkedList13.remove((java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode31);
        linkedListNode8.setNextNode(linkedListNode33);
        boolean boolean35 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        linkedListNode12.setPreviousNode(linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode13, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode16, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode19);
        boolean boolean21 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        linkedListNode27.setPreviousNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode28, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode31, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode34.setValue((java.lang.Object) linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = null;
        linkedListNode46.setPreviousNode(linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode47, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode50, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode40, (java.lang.Object) linkedListNode42);
        boolean boolean55 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean5 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList6 = new system.testclass.NodeCachingLinkedList();
        boolean boolean7 = nodeCachingLinkedList6.property_1();
        boolean boolean8 = nodeCachingLinkedList6.property_3();
        boolean boolean9 = nodeCachingLinkedList6.property_2();
        boolean boolean10 = nodeCachingLinkedList6.composedRepOK();
        boolean boolean11 = nodeCachingLinkedList6.property_1();
        boolean boolean12 = nodeCachingLinkedList6.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode15.getPreviousNode();
        linkedListNode13.setPreviousNode(linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode15);
        boolean boolean20 = nodeCachingLinkedList6.remove((java.lang.Object) linkedListNode19);
        boolean boolean21 = nodeCachingLinkedList0.remove((java.lang.Object) boolean20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        linkedListNode27.setPreviousNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode28, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode31, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList34 = new system.testclass.NodeCachingLinkedList();
        boolean boolean35 = nodeCachingLinkedList34.property_1();
        boolean boolean36 = nodeCachingLinkedList34.property_3();
        boolean boolean37 = nodeCachingLinkedList34.property_2();
        boolean boolean38 = nodeCachingLinkedList34.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = null;
        linkedListNode44.setPreviousNode(linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode45, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode48, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        boolean boolean53 = nodeCachingLinkedList34.remove((java.lang.Object) linkedListNode52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode52);
        linkedListNode33.setPreviousNode(linkedListNode52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode52.getPreviousNode();
        boolean boolean57 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode56);
        boolean boolean58 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = null;
        linkedListNode64.setPreviousNode(linkedListNode65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode65, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode68, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode60);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        java.lang.Object obj73 = linkedListNode71.getValue();
        boolean boolean74 = nodeCachingLinkedList0.add(obj73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        boolean boolean8 = nodeCachingLinkedList0.composedRepOK();
        boolean boolean9 = nodeCachingLinkedList0.property_1();
        boolean boolean10 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        linkedListNode16.setPreviousNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode17, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode20, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList23.property_1();
        boolean boolean25 = nodeCachingLinkedList23.property_3();
        boolean boolean26 = nodeCachingLinkedList23.property_2();
        boolean boolean27 = nodeCachingLinkedList23.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = null;
        linkedListNode33.setPreviousNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode37, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getNextNode();
        boolean boolean42 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        linkedListNode22.setPreviousNode(linkedListNode41);
        boolean boolean45 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode41);
        boolean boolean46 = nodeCachingLinkedList0.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        boolean boolean50 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode4);
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode4);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList7.property_1();
        boolean boolean9 = nodeCachingLinkedList7.property_3();
        boolean boolean10 = nodeCachingLinkedList7.property_2();
        boolean boolean11 = nodeCachingLinkedList7.composedRepOK();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = null;
        linkedListNode17.setPreviousNode(linkedListNode18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode18, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode21, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        boolean boolean26 = nodeCachingLinkedList7.remove((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode25.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        boolean boolean29 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean7 = nodeCachingLinkedList0.property_3();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList8.property_1();
        boolean boolean10 = nodeCachingLinkedList8.property_1();
        boolean boolean11 = nodeCachingLinkedList8.property_3();
        boolean boolean12 = nodeCachingLinkedList8.property_3();
        boolean boolean13 = nodeCachingLinkedList8.property_3();
        boolean boolean14 = nodeCachingLinkedList8.property_2();
        boolean boolean16 = nodeCachingLinkedList8.remove((java.lang.Object) 100.0d);
        boolean boolean17 = nodeCachingLinkedList8.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        linkedListNode20.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        linkedListNode20.setValue((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        linkedListNode27.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = null;
        linkedListNode27.setNextNode(linkedListNode31);
        linkedListNode25.setNextNode(linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getNextNode();
        linkedListNode34.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getNextNode();
        linkedListNode40.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode44, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode44, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = linkedListNode25.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode25, (java.lang.Object) linkedListNode52);
        boolean boolean54 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode0 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = linkedListNode0.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = null;
        linkedListNode5.setPreviousNode(linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode6, (java.lang.Object) '#');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode9, (java.lang.Object) (byte) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode1.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (-1.0d));
        linkedListNode12.setPreviousNode(linkedListNode15);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList17 = new system.testclass.NodeCachingLinkedList();
        boolean boolean18 = nodeCachingLinkedList17.property_1();
        boolean boolean19 = nodeCachingLinkedList17.property_1();
        boolean boolean20 = nodeCachingLinkedList17.property_2();
        linkedListNode15.setValue((java.lang.Object) nodeCachingLinkedList17);
        boolean boolean22 = nodeCachingLinkedList17.composedRepOK();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList23.property_1();
        boolean boolean25 = nodeCachingLinkedList23.property_3();
        boolean boolean26 = nodeCachingLinkedList23.property_3();
        boolean boolean27 = nodeCachingLinkedList23.property_1();
        boolean boolean28 = nodeCachingLinkedList17.add((java.lang.Object) nodeCachingLinkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList17", nodeCachingLinkedList17.property_4());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_3();
        boolean boolean3 = nodeCachingLinkedList0.property_2();
        boolean boolean4 = nodeCachingLinkedList0.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        linkedListNode7.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode11.getNextNode();
        linkedListNode5.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        java.lang.Object obj17 = linkedListNode16.getValue();
        boolean boolean18 = nodeCachingLinkedList0.add(obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_2();
        boolean boolean8 = nodeCachingLinkedList0.remove((java.lang.Object) 100.0d);
        boolean boolean9 = nodeCachingLinkedList0.property_2();
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList12 = new system.testclass.NodeCachingLinkedList();
        boolean boolean13 = nodeCachingLinkedList12.property_1();
        boolean boolean14 = nodeCachingLinkedList12.property_1();
        boolean boolean15 = nodeCachingLinkedList12.property_3();
        boolean boolean16 = nodeCachingLinkedList12.property_3();
        boolean boolean17 = nodeCachingLinkedList12.property_3();
        boolean boolean18 = nodeCachingLinkedList12.property_2();
        boolean boolean20 = nodeCachingLinkedList12.remove((java.lang.Object) 100.0d);
        boolean boolean21 = nodeCachingLinkedList12.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList12);
        boolean boolean23 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList12);
        boolean boolean24 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode25.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        linkedListNode25.setValue((java.lang.Object) linkedListNode30);
        java.lang.Object obj32 = linkedListNode30.getValue();
        java.lang.Object obj33 = linkedListNode30.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode30.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getNextNode();
        linkedListNode35.setValue((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass39 = linkedListNode35.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        linkedListNode44.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        linkedListNode51.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getNextNode();
        linkedListNode51.setValue((java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getNextNode();
        linkedListNode58.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = null;
        linkedListNode58.setNextNode(linkedListNode62);
        linkedListNode56.setNextNode(linkedListNode58);
        linkedListNode50.setValue((java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getNextNode();
        linkedListNode66.setValue((java.lang.Object) (short) 100);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode70);
        java.lang.Object obj73 = linkedListNode72.getValue();
        linkedListNode56.setNextNode(linkedListNode72);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode72.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode43, (java.lang.Object) linkedListNode75);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode43.getNextNode();
        linkedListNode34.setPreviousNode(linkedListNode43);
        boolean boolean79 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.property_1();
        boolean boolean2 = nodeCachingLinkedList0.property_1();
        boolean boolean3 = nodeCachingLinkedList0.property_3();
        boolean boolean4 = nodeCachingLinkedList0.property_3();
        boolean boolean5 = nodeCachingLinkedList0.property_3();
        boolean boolean6 = nodeCachingLinkedList0.property_1();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList7.property_1();
        boolean boolean9 = nodeCachingLinkedList7.property_1();
        boolean boolean10 = nodeCachingLinkedList7.property_3();
        boolean boolean11 = nodeCachingLinkedList7.property_3();
        boolean boolean12 = nodeCachingLinkedList7.property_3();
        boolean boolean13 = nodeCachingLinkedList7.property_2();
        boolean boolean15 = nodeCachingLinkedList7.remove((java.lang.Object) 100.0d);
        boolean boolean16 = nodeCachingLinkedList7.property_2();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList7);
        boolean boolean18 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_4());
    }
}

