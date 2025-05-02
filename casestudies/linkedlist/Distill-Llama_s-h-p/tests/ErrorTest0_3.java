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
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.add((java.lang.Object) 0);
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.property_1();
        boolean boolean6 = linkedList0.property_1();
        boolean boolean7 = linkedList0.composedRepOK();
        int int8 = linkedList0.size();
        int int9 = linkedList0.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) 10.0f);
        linkedList0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList0.add(obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.add((java.lang.Object) 0);
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.property_1();
        boolean boolean6 = linkedList0.property_1();
        boolean boolean7 = linkedList0.composedRepOK();
        int int8 = linkedList0.size();
        int int9 = linkedList0.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) 10.0f);
        boolean boolean13 = linkedList0.remove((java.lang.Object) (-1.0d));
        int int14 = linkedList0.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.property_1();
        boolean boolean18 = linkedList15.add((java.lang.Object) 0);
        int int19 = linkedList15.size();
        boolean boolean20 = linkedList15.property_1();
        linkedList15.clear();
        linkedList15.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        int int25 = linkedList23.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean27 = linkedList26.composedRepOK();
        int int28 = linkedList26.size();
        boolean boolean29 = linkedList23.remove((java.lang.Object) linkedList26);
        boolean boolean30 = linkedList15.remove((java.lang.Object) boolean29);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean32 = linkedList31.composedRepOK();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.property_1();
        boolean boolean36 = linkedList33.add((java.lang.Object) 0);
        boolean boolean37 = linkedList33.composedRepOK();
        boolean boolean39 = linkedList33.remove((java.lang.Object) (short) 0);
        boolean boolean40 = linkedList31.remove((java.lang.Object) linkedList33);
        boolean boolean41 = linkedList15.remove((java.lang.Object) boolean40);
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        boolean boolean43 = linkedList42.composedRepOK();
        int int44 = linkedList42.size();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        boolean boolean46 = linkedList45.composedRepOK();
        int int47 = linkedList45.size();
        boolean boolean48 = linkedList42.remove((java.lang.Object) linkedList45);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        boolean boolean50 = linkedList49.property_1();
        boolean boolean52 = linkedList49.add((java.lang.Object) 0);
        int int53 = linkedList49.size();
        boolean boolean54 = linkedList49.composedRepOK();
        boolean boolean55 = linkedList49.property_1();
        boolean boolean56 = linkedList42.add((java.lang.Object) boolean55);
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        boolean boolean58 = linkedList57.composedRepOK();
        int int59 = linkedList57.size();
        java.lang.Class<?> wildcardClass60 = linkedList57.getClass();
        boolean boolean61 = linkedList42.remove((java.lang.Object) linkedList57);
        int int62 = linkedList42.size();
        boolean boolean63 = linkedList15.add((java.lang.Object) int62);
        boolean boolean64 = linkedList0.add((java.lang.Object) int62);
        java.lang.Object obj65 = null;
        boolean boolean66 = linkedList0.add(obj65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList2.property_1();
        boolean boolean5 = linkedList2.add((java.lang.Object) 0);
        boolean boolean6 = linkedList2.composedRepOK();
        boolean boolean8 = linkedList2.remove((java.lang.Object) (short) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        boolean boolean13 = linkedList10.add((java.lang.Object) 0);
        linkedList10.clear();
        int int15 = linkedList10.size();
        boolean boolean16 = linkedList0.remove((java.lang.Object) int15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList17.property_1();
        boolean boolean20 = linkedList17.add((java.lang.Object) 0);
        int int21 = linkedList17.size();
        boolean boolean22 = linkedList17.property_1();
        boolean boolean23 = linkedList17.property_1();
        boolean boolean24 = linkedList17.composedRepOK();
        int int25 = linkedList17.size();
        int int26 = linkedList17.size();
        boolean boolean28 = linkedList17.add((java.lang.Object) (byte) 0);
        int int29 = linkedList17.size();
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList17);
        java.lang.Object obj31 = null;
        boolean boolean32 = linkedList0.add(obj31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        boolean boolean7 = linkedList4.add((java.lang.Object) 0);
        int int8 = linkedList4.size();
        boolean boolean9 = linkedList4.property_1();
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        int int14 = linkedList12.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.composedRepOK();
        int int17 = linkedList15.size();
        boolean boolean18 = linkedList12.remove((java.lang.Object) linkedList15);
        boolean boolean19 = linkedList4.remove((java.lang.Object) boolean18);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.composedRepOK();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_1();
        boolean boolean25 = linkedList22.add((java.lang.Object) 0);
        boolean boolean26 = linkedList22.composedRepOK();
        boolean boolean28 = linkedList22.remove((java.lang.Object) (short) 0);
        boolean boolean29 = linkedList20.remove((java.lang.Object) linkedList22);
        boolean boolean30 = linkedList4.remove((java.lang.Object) boolean29);
        boolean boolean31 = linkedList0.remove((java.lang.Object) linkedList4);
        int int32 = linkedList0.size();
        java.lang.Object obj33 = null;
        boolean boolean34 = linkedList0.add(obj33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList2.composedRepOK();
        int int4 = linkedList2.size();
        boolean boolean5 = linkedList0.remove((java.lang.Object) int4);
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.property_1();
        boolean boolean11 = linkedList8.add((java.lang.Object) 0);
        int int12 = linkedList8.size();
        boolean boolean13 = linkedList8.composedRepOK();
        linkedList8.clear();
        boolean boolean15 = linkedList8.property_1();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList8);
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList8.add(obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList8", linkedList8.property_3());
    }
}

