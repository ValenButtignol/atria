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
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        linkedList6.clear();
        boolean boolean9 = linkedList6.add((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList6.remove((java.lang.Object) "");
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList6.remove(obj12);
        linkedList6.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList6);
        int int16 = linkedList6.size();
        linkedList6.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList6.add(obj18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList6", linkedList6.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.property_2();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 100L);
        boolean boolean4 = linkedList0.property_2();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
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
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        linkedList5.clear();
        boolean boolean8 = linkedList5.add((java.lang.Object) 1.0d);
        int int9 = linkedList5.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList5);
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList5.add(obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList5", linkedList5.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_2();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        linkedList4.clear();
        boolean boolean6 = linkedList4.property_2();
        boolean boolean7 = linkedList0.add((java.lang.Object) linkedList4);
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean10 = linkedList0.repOK();
        boolean boolean11 = linkedList0.property();
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList0.add(obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.add((java.lang.Object) 1.0d);
        boolean boolean8 = linkedList3.remove((java.lang.Object) "");
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList3.remove(obj9);
        linkedList3.clear();
        int int12 = linkedList3.size();
        int int13 = linkedList3.size();
        boolean boolean14 = linkedList3.property();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList3);
        java.lang.Object obj16 = null;
        boolean boolean17 = linkedList0.add(obj16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property();
        boolean boolean5 = linkedList0.property();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_2();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        linkedList4.clear();
        boolean boolean6 = linkedList4.property_2();
        boolean boolean7 = linkedList0.add((java.lang.Object) linkedList4);
        linkedList0.clear();
        boolean boolean9 = linkedList0.property();
        linkedList0.clear();
        int int11 = linkedList0.size();
        boolean boolean13 = linkedList0.remove((java.lang.Object) '#');
        boolean boolean14 = linkedList0.property_2();
        java.lang.Object obj15 = null;
        boolean boolean16 = linkedList0.add(obj15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        boolean boolean4 = linkedList3.property_2();
        boolean boolean6 = linkedList3.remove((java.lang.Object) 100L);
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        int int8 = linkedList0.size();
        int int9 = linkedList0.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean12 = linkedList0.property_2();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        boolean boolean17 = linkedList16.property_2();
        boolean boolean19 = linkedList16.remove((java.lang.Object) 100L);
        boolean boolean20 = linkedList13.remove((java.lang.Object) boolean19);
        int int21 = linkedList13.size();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList13);
        java.lang.Object obj23 = null;
        boolean boolean24 = linkedList13.remove(obj23);
        int int25 = linkedList13.size();
        java.lang.Object obj26 = null;
        boolean boolean27 = linkedList13.add(obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList13", linkedList13.property_3());
    }
}

