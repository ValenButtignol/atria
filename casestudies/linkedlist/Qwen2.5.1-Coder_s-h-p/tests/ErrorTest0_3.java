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
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean8 = linkedList0.composedRepOK();
        boolean boolean10 = linkedList0.add((java.lang.Object) 100.0f);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_1();
        boolean boolean14 = linkedList11.add((java.lang.Object) 0);
        int int15 = linkedList11.size();
        boolean boolean16 = linkedList11.composedRepOK();
        boolean boolean17 = linkedList11.property_1();
        boolean boolean18 = linkedList11.property_1();
        int int19 = linkedList11.size();
        java.lang.Class<?> wildcardClass20 = linkedList11.getClass();
        boolean boolean21 = linkedList0.add((java.lang.Object) wildcardClass20);
        boolean boolean23 = linkedList0.add((java.lang.Object) (short) 0);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean27 = linkedList26.property_1();
        boolean boolean29 = linkedList26.add((java.lang.Object) 0);
        boolean boolean30 = linkedList26.composedRepOK();
        boolean boolean32 = linkedList26.remove((java.lang.Object) (short) 0);
        boolean boolean33 = linkedList24.remove((java.lang.Object) linkedList26);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean35 = linkedList34.property_1();
        boolean boolean37 = linkedList34.add((java.lang.Object) 0);
        linkedList34.clear();
        int int39 = linkedList34.size();
        boolean boolean40 = linkedList24.remove((java.lang.Object) int39);
        boolean boolean41 = linkedList0.remove((java.lang.Object) linkedList24);
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        boolean boolean43 = linkedList42.composedRepOK();
        boolean boolean44 = linkedList42.composedRepOK();
        boolean boolean46 = linkedList42.add((java.lang.Object) (short) 10);
        int int47 = linkedList42.size();
        boolean boolean48 = linkedList42.property_1();
        linkedList42.clear();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        boolean boolean51 = linkedList50.property_1();
        boolean boolean53 = linkedList50.add((java.lang.Object) 0);
        int int54 = linkedList50.size();
        boolean boolean55 = linkedList50.property_1();
        linkedList50.clear();
        boolean boolean57 = linkedList50.composedRepOK();
        java.lang.Class<?> wildcardClass58 = linkedList50.getClass();
        boolean boolean59 = linkedList42.remove((java.lang.Object) wildcardClass58);
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        boolean boolean61 = linkedList60.composedRepOK();
        system.testclass.LinkedList linkedList62 = new system.testclass.LinkedList();
        boolean boolean63 = linkedList62.property_1();
        boolean boolean65 = linkedList62.add((java.lang.Object) 0);
        boolean boolean66 = linkedList62.composedRepOK();
        boolean boolean68 = linkedList62.remove((java.lang.Object) (short) 0);
        boolean boolean69 = linkedList60.remove((java.lang.Object) linkedList62);
        boolean boolean70 = linkedList42.remove((java.lang.Object) boolean69);
        int int71 = linkedList42.size();
        java.lang.Class<?> wildcardClass72 = linkedList42.getClass();
        boolean boolean73 = linkedList0.add((java.lang.Object) wildcardClass72);
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
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        java.lang.Class<?> wildcardClass9 = linkedList7.getClass();
        boolean boolean10 = linkedList0.add((java.lang.Object) wildcardClass9);
        boolean boolean11 = linkedList0.composedRepOK();
        int int12 = linkedList0.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_1();
        int int15 = linkedList13.size();
        boolean boolean16 = linkedList0.add((java.lang.Object) int15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for linkedList0", linkedList0.property_3());
    }
}

