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
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.composedRepOK();
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList0.add((java.lang.Object) int6);
        boolean boolean8 = linkedList0.property_2();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList0.add(obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean7 = linkedList4.add((java.lang.Object) 1.0d);
        boolean boolean8 = linkedList4.property_2();
        boolean boolean10 = linkedList4.add((java.lang.Object) true);
        boolean boolean11 = linkedList3.add((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList4);
        int int13 = linkedList4.size();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList4.add(obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList4", linkedList4.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList0.add((java.lang.Object) int6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.add((java.lang.Object) 1.0d);
        boolean boolean12 = linkedList8.property_2();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList8);
        boolean boolean16 = linkedList8.property_1();
        boolean boolean18 = linkedList8.add((java.lang.Object) 100L);
        boolean boolean19 = linkedList8.composedRepOK();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList8.add(obj20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList8", linkedList8.property_3());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        java.lang.Class<?> wildcardClass7 = linkedList5.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.add((java.lang.Object) 1.0d);
        boolean boolean14 = linkedList10.property_2();
        boolean boolean16 = linkedList10.add((java.lang.Object) true);
        boolean boolean17 = linkedList9.add((java.lang.Object) linkedList10);
        linkedList10.clear();
        boolean boolean19 = linkedList10.property_2();
        boolean boolean20 = linkedList0.add((java.lang.Object) boolean19);
        java.lang.Object obj21 = null;
        boolean boolean22 = linkedList0.add(obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.property_2();
        boolean boolean5 = linkedList0.property_1();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean9 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean10 = linkedList6.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) boolean10);
        int int12 = linkedList0.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.add((java.lang.Object) 1.0d);
        linkedList13.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        linkedList18.clear();
        boolean boolean21 = linkedList18.add((java.lang.Object) 1.0d);
        boolean boolean22 = linkedList18.property_2();
        boolean boolean24 = linkedList18.add((java.lang.Object) true);
        boolean boolean25 = linkedList18.property_2();
        boolean boolean26 = linkedList13.remove((java.lang.Object) linkedList18);
        boolean boolean27 = linkedList0.remove((java.lang.Object) linkedList13);
        boolean boolean28 = linkedList13.composedRepOK();
        java.lang.Object obj29 = null;
        boolean boolean30 = linkedList13.add(obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList13", linkedList13.property_3());
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean7 = linkedList4.add((java.lang.Object) 1.0d);
        boolean boolean8 = linkedList4.property_2();
        boolean boolean10 = linkedList4.add((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        linkedList11.clear();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.add((java.lang.Object) 1.0d);
        boolean boolean19 = linkedList15.property_2();
        boolean boolean21 = linkedList15.add((java.lang.Object) true);
        boolean boolean22 = linkedList14.add((java.lang.Object) linkedList15);
        boolean boolean23 = linkedList11.remove((java.lang.Object) linkedList15);
        boolean boolean24 = linkedList4.remove((java.lang.Object) linkedList11);
        boolean boolean25 = linkedList0.remove((java.lang.Object) boolean24);
        boolean boolean26 = linkedList0.property_1();
        boolean boolean27 = linkedList0.property_1();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        linkedList28.clear();
        boolean boolean31 = linkedList28.add((java.lang.Object) 1.0d);
        boolean boolean32 = linkedList28.property_2();
        linkedList28.clear();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean35 = linkedList34.property_1();
        int int36 = linkedList34.size();
        boolean boolean37 = linkedList34.property_2();
        boolean boolean38 = linkedList28.add((java.lang.Object) linkedList34);
        boolean boolean39 = linkedList28.property_1();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList40.property_1();
        int int42 = linkedList40.size();
        boolean boolean43 = linkedList28.add((java.lang.Object) int42);
        int int44 = linkedList28.size();
        boolean boolean45 = linkedList0.add((java.lang.Object) int44);
        boolean boolean46 = linkedList0.property_1();
        java.lang.Object obj47 = null;
        boolean boolean48 = linkedList0.add(obj47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList0.add((java.lang.Object) int6);
        boolean boolean8 = linkedList0.property_1();
        boolean boolean9 = linkedList0.property_1();
        boolean boolean10 = linkedList0.property_2();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        linkedList11.clear();
        boolean boolean14 = linkedList11.add((java.lang.Object) 1.0d);
        boolean boolean15 = linkedList11.property_2();
        boolean boolean17 = linkedList11.add((java.lang.Object) true);
        boolean boolean18 = linkedList11.property_2();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList11);
        boolean boolean20 = linkedList11.property_1();
        java.lang.Object obj21 = null;
        boolean boolean22 = linkedList11.add(obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList11", linkedList11.property_3());
    }
}

