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
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        linkedList0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = linkedList0.add(obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.add(obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass7 = linkedList6.getClass();
        boolean boolean8 = linkedList5.remove((java.lang.Object) wildcardClass7);
        boolean boolean10 = linkedList5.add((java.lang.Object) false);
        boolean boolean11 = linkedList0.remove((java.lang.Object) false);
        int int12 = linkedList0.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        boolean boolean20 = linkedList0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        boolean boolean22 = linkedList0.add(obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        boolean boolean9 = linkedList5.remove((java.lang.Object) true);
        boolean boolean10 = linkedList0.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        boolean boolean14 = linkedList11.remove((java.lang.Object) (short) -1);
        int int15 = linkedList11.size();
        linkedList11.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList11);
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList0.add(obj18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        int int10 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass14 = linkedList13.getClass();
        boolean boolean15 = linkedList12.remove((java.lang.Object) wildcardClass14);
        boolean boolean17 = linkedList12.add((java.lang.Object) false);
        boolean boolean19 = linkedList12.add((java.lang.Object) '4');
        boolean boolean20 = linkedList0.remove((java.lang.Object) '4');
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean26 = linkedList21.add((java.lang.Object) 10.0d);
        int int27 = linkedList21.size();
        linkedList21.clear();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList21);
        java.lang.Object obj30 = null;
        boolean boolean31 = linkedList0.add(obj30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        linkedList3.clear();
        boolean boolean8 = linkedList3.add((java.lang.Object) 10.0d);
        int int9 = linkedList3.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList3);
        linkedList3.clear();
        boolean boolean13 = linkedList3.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        boolean boolean17 = linkedList14.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        linkedList18.clear();
        boolean boolean22 = linkedList14.remove((java.lang.Object) linkedList18);
        linkedList14.clear();
        boolean boolean24 = linkedList3.add((java.lang.Object) linkedList14);
        boolean boolean26 = linkedList3.add((java.lang.Object) 100.0f);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        boolean boolean35 = linkedList30.add((java.lang.Object) 10.0d);
        int int36 = linkedList30.size();
        boolean boolean37 = linkedList27.add((java.lang.Object) linkedList30);
        linkedList30.clear();
        boolean boolean39 = linkedList3.remove((java.lang.Object) linkedList30);
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        linkedList40.clear();
        boolean boolean45 = linkedList40.add((java.lang.Object) 10.0d);
        int int46 = linkedList40.size();
        boolean boolean48 = linkedList40.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        linkedList52.clear();
        boolean boolean57 = linkedList52.add((java.lang.Object) 10.0d);
        int int58 = linkedList52.size();
        boolean boolean59 = linkedList49.add((java.lang.Object) linkedList52);
        linkedList49.clear();
        boolean boolean61 = linkedList40.add((java.lang.Object) linkedList49);
        boolean boolean62 = linkedList30.remove((java.lang.Object) linkedList40);
        linkedList40.clear();
        java.lang.Object obj64 = null;
        boolean boolean65 = linkedList40.add(obj64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList40", linkedList40.property_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        boolean boolean9 = linkedList5.remove((java.lang.Object) true);
        boolean boolean10 = linkedList0.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        linkedList11.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        linkedList18.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList18.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        boolean boolean28 = linkedList22.remove((java.lang.Object) int27);
        boolean boolean29 = linkedList11.add((java.lang.Object) int27);
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList11);
        java.lang.Object obj31 = null;
        boolean boolean32 = linkedList11.add(obj31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList11", linkedList11.property_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        boolean boolean11 = linkedList0.remove((java.lang.Object) false);
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList0.add(obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass7 = linkedList6.getClass();
        boolean boolean8 = linkedList5.remove((java.lang.Object) wildcardClass7);
        boolean boolean10 = linkedList5.add((java.lang.Object) false);
        boolean boolean11 = linkedList0.remove((java.lang.Object) false);
        int int12 = linkedList0.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        boolean boolean20 = linkedList0.remove((java.lang.Object) (byte) 0);
        linkedList0.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        boolean boolean25 = linkedList22.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean30 = linkedList22.remove((java.lang.Object) linkedList26);
        boolean boolean31 = linkedList0.add((java.lang.Object) linkedList22);
        java.lang.Object obj32 = null;
        boolean boolean33 = linkedList22.add(obj32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList22", linkedList22.property_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass7 = linkedList6.getClass();
        boolean boolean8 = linkedList5.remove((java.lang.Object) wildcardClass7);
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList5);
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList0.add(obj10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        boolean boolean9 = linkedList5.remove((java.lang.Object) true);
        boolean boolean10 = linkedList0.remove((java.lang.Object) true);
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList0.add(obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean6 = linkedList0.add((java.lang.Object) 1.0d);
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass10 = linkedList9.getClass();
        boolean boolean11 = linkedList8.remove((java.lang.Object) wildcardClass10);
        boolean boolean13 = linkedList8.add((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass14 = linkedList8.getClass();
        boolean boolean15 = linkedList0.remove((java.lang.Object) wildcardClass14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        linkedList19.clear();
        boolean boolean24 = linkedList19.add((java.lang.Object) 10.0d);
        int int25 = linkedList19.size();
        boolean boolean26 = linkedList16.add((java.lang.Object) linkedList19);
        linkedList19.clear();
        boolean boolean29 = linkedList19.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList19.add((java.lang.Object) (byte) 100);
        int int37 = linkedList19.size();
        boolean boolean38 = linkedList0.add((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        linkedList39.clear();
        boolean boolean44 = linkedList39.add((java.lang.Object) 10.0d);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        linkedList45.clear();
        linkedList45.clear();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        int int51 = linkedList50.size();
        linkedList50.clear();
        boolean boolean54 = linkedList50.remove((java.lang.Object) true);
        boolean boolean55 = linkedList45.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass58 = linkedList57.getClass();
        boolean boolean59 = linkedList56.remove((java.lang.Object) wildcardClass58);
        boolean boolean61 = linkedList56.add((java.lang.Object) false);
        linkedList56.clear();
        system.testclass.LinkedList linkedList63 = new system.testclass.LinkedList();
        int int64 = linkedList63.size();
        linkedList63.clear();
        linkedList63.clear();
        system.testclass.LinkedList linkedList67 = new system.testclass.LinkedList();
        boolean boolean68 = linkedList63.remove((java.lang.Object) linkedList67);
        system.testclass.LinkedList linkedList69 = new system.testclass.LinkedList();
        int int70 = linkedList69.size();
        linkedList69.clear();
        int int72 = linkedList69.size();
        boolean boolean73 = linkedList67.remove((java.lang.Object) int72);
        boolean boolean74 = linkedList56.add((java.lang.Object) int72);
        boolean boolean75 = linkedList45.remove((java.lang.Object) linkedList56);
        boolean boolean76 = linkedList39.remove((java.lang.Object) linkedList56);
        boolean boolean77 = linkedList0.add((java.lang.Object) boolean76);
        java.lang.Object obj78 = null;
        boolean boolean79 = linkedList0.add(obj78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        linkedList6.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.remove((java.lang.Object) true);
        boolean boolean16 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass19 = linkedList18.getClass();
        boolean boolean20 = linkedList17.remove((java.lang.Object) wildcardClass19);
        boolean boolean22 = linkedList17.add((java.lang.Object) false);
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList24.remove((java.lang.Object) linkedList28);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        int int33 = linkedList30.size();
        boolean boolean34 = linkedList28.remove((java.lang.Object) int33);
        boolean boolean35 = linkedList17.add((java.lang.Object) int33);
        boolean boolean36 = linkedList6.remove((java.lang.Object) linkedList17);
        boolean boolean37 = linkedList0.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        linkedList38.clear();
        boolean boolean43 = linkedList38.add((java.lang.Object) 10.0d);
        int int44 = linkedList38.size();
        boolean boolean46 = linkedList38.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        int int48 = linkedList47.size();
        linkedList47.clear();
        boolean boolean51 = linkedList47.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass54 = linkedList53.getClass();
        boolean boolean55 = linkedList52.remove((java.lang.Object) wildcardClass54);
        boolean boolean57 = linkedList52.add((java.lang.Object) false);
        boolean boolean58 = linkedList47.remove((java.lang.Object) false);
        int int59 = linkedList47.size();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        linkedList60.clear();
        linkedList60.clear();
        boolean boolean65 = linkedList47.remove((java.lang.Object) linkedList60);
        java.lang.Class<?> wildcardClass66 = linkedList60.getClass();
        boolean boolean67 = linkedList38.add((java.lang.Object) wildcardClass66);
        boolean boolean68 = linkedList17.remove((java.lang.Object) wildcardClass66);
        java.lang.Object obj69 = null;
        boolean boolean70 = linkedList17.add(obj69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList17", linkedList17.property_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean9 = linkedList6.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        linkedList10.clear();
        boolean boolean14 = linkedList6.remove((java.lang.Object) linkedList10);
        linkedList6.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = linkedList16.getClass();
        boolean boolean21 = linkedList6.add((java.lang.Object) linkedList16);
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList6);
        boolean boolean24 = linkedList0.remove((java.lang.Object) (short) -1);
        int int25 = linkedList0.size();
        java.lang.Object obj26 = null;
        boolean boolean27 = linkedList0.add(obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }
}

