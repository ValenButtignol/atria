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
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        boolean boolean5 = linkedList0.add((java.lang.Object) false);
        boolean boolean7 = linkedList0.add((java.lang.Object) '4');
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
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean9 = linkedList6.remove((java.lang.Object) (short) -1);
        int int10 = linkedList6.size();
        linkedList6.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean17 = linkedList6.remove((java.lang.Object) linkedList12);
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
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
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList0.remove((java.lang.Object) 100.0f);
        boolean boolean9 = linkedList0.add((java.lang.Object) 10);
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
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean9 = linkedList4.remove((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList4.remove(obj10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean16 = linkedList12.add((java.lang.Object) true);
        boolean boolean17 = linkedList4.add((java.lang.Object) true);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList4);
        int int19 = linkedList4.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        boolean boolean24 = linkedList4.add((java.lang.Object) boolean23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList4", linkedList4.property_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedList16.add((java.lang.Object) false);
        boolean boolean22 = linkedList11.remove((java.lang.Object) false);
        boolean boolean23 = linkedList5.remove((java.lang.Object) boolean22);
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        boolean boolean28 = linkedList25.remove((java.lang.Object) (short) -1);
        int int29 = linkedList25.size();
        linkedList25.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean36 = linkedList25.remove((java.lang.Object) linkedList31);
        int int37 = linkedList25.size();
        boolean boolean38 = linkedList5.add((java.lang.Object) linkedList25);
        boolean boolean40 = linkedList5.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList5", linkedList5.property_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        boolean boolean14 = linkedList11.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean19 = linkedList11.remove((java.lang.Object) linkedList15);
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList15);
        boolean boolean22 = linkedList0.add((java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedList16.add((java.lang.Object) false);
        boolean boolean22 = linkedList11.remove((java.lang.Object) false);
        boolean boolean23 = linkedList5.remove((java.lang.Object) boolean22);
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList5);
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList0.add(obj25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        boolean boolean9 = linkedList5.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        boolean boolean15 = linkedList10.add((java.lang.Object) false);
        boolean boolean16 = linkedList5.remove((java.lang.Object) false);
        boolean boolean17 = linkedList0.remove((java.lang.Object) boolean16);
        linkedList0.clear();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        linkedList19.clear();
        boolean boolean24 = linkedList19.remove((java.lang.Object) 1.0f);
        int int25 = linkedList19.size();
        int int26 = linkedList19.size();
        boolean boolean27 = linkedList0.add((java.lang.Object) int26);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        linkedList28.clear();
        linkedList28.clear();
        linkedList28.clear();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        boolean boolean38 = linkedList34.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass41 = linkedList40.getClass();
        boolean boolean42 = linkedList39.remove((java.lang.Object) wildcardClass41);
        boolean boolean44 = linkedList39.add((java.lang.Object) false);
        boolean boolean45 = linkedList34.remove((java.lang.Object) false);
        boolean boolean46 = linkedList28.remove((java.lang.Object) boolean45);
        linkedList28.clear();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        int int49 = linkedList48.size();
        boolean boolean51 = linkedList48.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        linkedList52.clear();
        boolean boolean56 = linkedList48.remove((java.lang.Object) linkedList52);
        linkedList48.clear();
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass60 = linkedList59.getClass();
        boolean boolean61 = linkedList58.remove((java.lang.Object) wildcardClass60);
        java.lang.Class<?> wildcardClass62 = linkedList58.getClass();
        boolean boolean63 = linkedList48.add((java.lang.Object) linkedList58);
        java.lang.Class<?> wildcardClass64 = linkedList48.getClass();
        boolean boolean65 = linkedList28.add((java.lang.Object) linkedList48);
        boolean boolean66 = linkedList0.add((java.lang.Object) boolean65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (short) -1);
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        int int9 = linkedList5.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        linkedList10.clear();
        linkedList10.clear();
        linkedList10.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean20 = linkedList16.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        boolean boolean26 = linkedList21.add((java.lang.Object) false);
        boolean boolean27 = linkedList16.remove((java.lang.Object) false);
        boolean boolean28 = linkedList10.remove((java.lang.Object) boolean27);
        boolean boolean29 = linkedList5.add((java.lang.Object) linkedList10);
        boolean boolean30 = linkedList0.remove((java.lang.Object) boolean29);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        linkedList31.clear();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        boolean boolean40 = linkedList36.remove((java.lang.Object) true);
        boolean boolean41 = linkedList31.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        boolean boolean45 = linkedList42.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        linkedList46.clear();
        boolean boolean50 = linkedList42.remove((java.lang.Object) linkedList46);
        boolean boolean51 = linkedList31.add((java.lang.Object) linkedList46);
        boolean boolean52 = linkedList0.add((java.lang.Object) boolean51);
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        int int54 = linkedList53.size();
        linkedList53.clear();
        linkedList53.clear();
        boolean boolean58 = linkedList53.add((java.lang.Object) 10.0d);
        linkedList53.clear();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        boolean boolean64 = linkedList60.remove((java.lang.Object) true);
        int int65 = linkedList60.size();
        linkedList60.clear();
        boolean boolean67 = linkedList53.add((java.lang.Object) linkedList60);
        boolean boolean68 = linkedList0.add((java.lang.Object) linkedList53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList0.add((java.lang.Object) (byte) -1);
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
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList20.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList20.add((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        java.lang.Object obj38 = null;
        boolean boolean39 = linkedList37.add(obj38);
        linkedList37.clear();
        int int41 = linkedList37.size();
        int int42 = linkedList37.size();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        linkedList43.clear();
        boolean boolean47 = linkedList37.remove((java.lang.Object) linkedList43);
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        int int49 = linkedList48.size();
        linkedList48.clear();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        linkedList51.clear();
        boolean boolean56 = linkedList51.add((java.lang.Object) 10.0d);
        int int57 = linkedList51.size();
        boolean boolean58 = linkedList48.add((java.lang.Object) linkedList51);
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        int int60 = linkedList59.size();
        linkedList59.clear();
        system.testclass.LinkedList linkedList62 = new system.testclass.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        linkedList62.clear();
        boolean boolean67 = linkedList62.add((java.lang.Object) 10.0d);
        int int68 = linkedList62.size();
        boolean boolean69 = linkedList59.add((java.lang.Object) linkedList62);
        linkedList62.clear();
        boolean boolean71 = linkedList51.remove((java.lang.Object) linkedList62);
        boolean boolean72 = linkedList37.remove((java.lang.Object) linkedList62);
        java.lang.Class<?> wildcardClass73 = linkedList62.getClass();
        boolean boolean74 = linkedList20.add((java.lang.Object) wildcardClass73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList20", linkedList20.property_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        boolean boolean11 = linkedList7.remove((java.lang.Object) true);
        int int12 = linkedList7.size();
        linkedList7.clear();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList7);
        boolean boolean16 = linkedList7.add((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        boolean boolean20 = linkedList17.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        boolean boolean24 = linkedList21.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean29 = linkedList21.remove((java.lang.Object) linkedList25);
        boolean boolean30 = linkedList17.remove((java.lang.Object) linkedList25);
        boolean boolean31 = linkedList7.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList7", linkedList7.property_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        boolean boolean21 = linkedList16.add((java.lang.Object) false);
        boolean boolean22 = linkedList11.remove((java.lang.Object) false);
        java.lang.Class<?> wildcardClass23 = linkedList11.getClass();
        boolean boolean24 = linkedList0.add((java.lang.Object) wildcardClass23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        boolean boolean11 = linkedList7.add((java.lang.Object) true);
        linkedList7.clear();
        int int13 = linkedList7.size();
        boolean boolean15 = linkedList7.remove((java.lang.Object) (short) 100);
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
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        boolean boolean32 = linkedList29.remove((java.lang.Object) 'a');
        boolean boolean33 = linkedList28.remove((java.lang.Object) 'a');
        boolean boolean34 = linkedList19.remove((java.lang.Object) boolean33);
        boolean boolean35 = linkedList7.remove((java.lang.Object) boolean34);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        linkedList37.clear();
        boolean boolean42 = linkedList37.add((java.lang.Object) 10.0d);
        int int43 = linkedList37.size();
        linkedList37.clear();
        java.lang.Class<?> wildcardClass45 = linkedList37.getClass();
        boolean boolean46 = linkedList0.add((java.lang.Object) linkedList37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList20.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList20.add((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        boolean boolean41 = linkedList37.add((java.lang.Object) true);
        linkedList37.clear();
        int int43 = linkedList37.size();
        linkedList37.clear();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        java.lang.Object obj46 = null;
        boolean boolean47 = linkedList45.add(obj46);
        linkedList45.clear();
        boolean boolean49 = linkedList37.add((java.lang.Object) linkedList45);
        boolean boolean50 = linkedList0.add((java.lang.Object) linkedList45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        linkedList14.clear();
        boolean boolean23 = linkedList3.remove((java.lang.Object) linkedList14);
        boolean boolean25 = linkedList3.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList3", linkedList3.property_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean10 = linkedList5.add((java.lang.Object) 10.0d);
        int int11 = linkedList5.size();
        boolean boolean12 = linkedList2.add((java.lang.Object) linkedList5);
        java.lang.Class<?> wildcardClass13 = linkedList2.getClass();
        boolean boolean14 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean20 = linkedList15.add((java.lang.Object) 10.0d);
        linkedList15.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean26 = linkedList22.remove((java.lang.Object) true);
        int int27 = linkedList22.size();
        linkedList22.clear();
        boolean boolean29 = linkedList15.add((java.lang.Object) linkedList22);
        boolean boolean31 = linkedList22.add((java.lang.Object) 0L);
        boolean boolean32 = linkedList2.add((java.lang.Object) boolean31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList2", linkedList2.property_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean30 = linkedList25.add((java.lang.Object) 10.0d);
        int int31 = linkedList25.size();
        boolean boolean32 = linkedList22.add((java.lang.Object) linkedList25);
        linkedList25.clear();
        boolean boolean34 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList36.add(obj37);
        linkedList36.clear();
        int int40 = linkedList36.size();
        int int41 = linkedList36.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        linkedList42.clear();
        boolean boolean46 = linkedList36.remove((java.lang.Object) linkedList42);
        boolean boolean47 = linkedList0.add((java.lang.Object) boolean46);
        int int48 = linkedList0.size();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        linkedList49.clear();
        linkedList49.clear();
        linkedList49.clear();
        system.testclass.LinkedList linkedList55 = new system.testclass.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        boolean boolean59 = linkedList55.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass62 = linkedList61.getClass();
        boolean boolean63 = linkedList60.remove((java.lang.Object) wildcardClass62);
        boolean boolean65 = linkedList60.add((java.lang.Object) false);
        boolean boolean66 = linkedList55.remove((java.lang.Object) false);
        boolean boolean67 = linkedList49.remove((java.lang.Object) boolean66);
        int int68 = linkedList49.size();
        java.lang.Class<?> wildcardClass69 = linkedList49.getClass();
        boolean boolean70 = linkedList0.add((java.lang.Object) linkedList49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (short) -1);
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.add((java.lang.Object) true);
        linkedList6.clear();
        boolean boolean13 = linkedList6.add((java.lang.Object) (short) 100);
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        java.lang.Object obj16 = null;
        boolean boolean17 = linkedList15.add(obj16);
        linkedList15.clear();
        linkedList15.clear();
        int int20 = linkedList15.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean26 = linkedList21.add((java.lang.Object) 1.0d);
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass29 = linkedList21.getClass();
        boolean boolean30 = linkedList15.add((java.lang.Object) wildcardClass29);
        boolean boolean31 = linkedList0.add((java.lang.Object) boolean30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean30 = linkedList25.add((java.lang.Object) 10.0d);
        int int31 = linkedList25.size();
        boolean boolean32 = linkedList22.add((java.lang.Object) linkedList25);
        linkedList25.clear();
        boolean boolean34 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        linkedList39.clear();
        boolean boolean44 = linkedList39.add((java.lang.Object) 10.0d);
        int int45 = linkedList39.size();
        boolean boolean46 = linkedList36.add((java.lang.Object) linkedList39);
        java.lang.Class<?> wildcardClass47 = linkedList36.getClass();
        boolean boolean48 = linkedList0.add((java.lang.Object) linkedList36);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        boolean boolean52 = linkedList49.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        int int54 = linkedList53.size();
        boolean boolean56 = linkedList53.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        linkedList57.clear();
        boolean boolean61 = linkedList53.remove((java.lang.Object) linkedList57);
        boolean boolean62 = linkedList49.remove((java.lang.Object) linkedList57);
        java.lang.Class<?> wildcardClass63 = linkedList49.getClass();
        boolean boolean64 = linkedList0.add((java.lang.Object) linkedList49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.remove(obj6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (short) -1);
        int int12 = linkedList8.size();
        linkedList8.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        linkedList20.clear();
        linkedList20.clear();
        boolean boolean25 = linkedList8.add((java.lang.Object) linkedList20);
        java.lang.Class<?> wildcardClass26 = linkedList20.getClass();
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        linkedList28.clear();
        linkedList28.clear();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        boolean boolean37 = linkedList33.remove((java.lang.Object) true);
        boolean boolean38 = linkedList28.remove((java.lang.Object) true);
        java.lang.Class<?> wildcardClass39 = linkedList28.getClass();
        boolean boolean40 = linkedList0.add((java.lang.Object) linkedList28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.add((java.lang.Object) true);
        java.lang.Class<?> wildcardClass16 = linkedList11.getClass();
        boolean boolean17 = linkedList3.remove((java.lang.Object) wildcardClass16);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean22 = linkedList18.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass25 = linkedList24.getClass();
        boolean boolean26 = linkedList23.remove((java.lang.Object) wildcardClass25);
        boolean boolean28 = linkedList23.add((java.lang.Object) false);
        boolean boolean29 = linkedList18.remove((java.lang.Object) false);
        int int30 = linkedList18.size();
        boolean boolean31 = linkedList3.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList3", linkedList3.property_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList20.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList20.add((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList20);
        int int37 = linkedList20.size();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        java.lang.Object obj39 = null;
        boolean boolean40 = linkedList38.add(obj39);
        linkedList38.clear();
        int int42 = linkedList38.size();
        int int43 = linkedList38.size();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        linkedList44.clear();
        boolean boolean48 = linkedList38.remove((java.lang.Object) linkedList44);
        linkedList38.clear();
        java.lang.Class<?> wildcardClass50 = linkedList38.getClass();
        boolean boolean51 = linkedList20.add((java.lang.Object) wildcardClass50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList20", linkedList20.property_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (short) -1);
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList0.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList0.add(obj13);
        int int15 = linkedList0.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean20 = linkedList16.add((java.lang.Object) true);
        linkedList16.clear();
        int int22 = linkedList16.size();
        boolean boolean24 = linkedList16.remove((java.lang.Object) (short) 100);
        boolean boolean25 = linkedList0.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList0.remove((java.lang.Object) 100.0f);
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        boolean boolean13 = linkedList9.add((java.lang.Object) true);
        linkedList9.clear();
        int int15 = linkedList9.size();
        linkedList9.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList17.add(obj18);
        linkedList17.clear();
        boolean boolean21 = linkedList9.add((java.lang.Object) linkedList17);
        linkedList17.clear();
        boolean boolean24 = linkedList17.remove((java.lang.Object) 10);
        boolean boolean25 = linkedList0.add((java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) (short) -1);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean11 = linkedList4.remove((java.lang.Object) (-1.0f));
        int int12 = linkedList4.size();
        java.lang.Class<?> wildcardClass13 = linkedList4.getClass();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList0.remove((java.lang.Object) 100.0f);
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        boolean boolean12 = linkedList9.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean17 = linkedList9.remove((java.lang.Object) linkedList13);
        linkedList13.clear();
        linkedList13.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        boolean boolean24 = linkedList20.remove((java.lang.Object) (short) 100);
        linkedList20.clear();
        boolean boolean26 = linkedList13.remove((java.lang.Object) linkedList20);
        boolean boolean27 = linkedList0.add((java.lang.Object) boolean26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean12 = linkedList4.remove((java.lang.Object) linkedList8);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList8);
        boolean boolean15 = linkedList8.add((java.lang.Object) 0);
        linkedList8.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        boolean boolean21 = linkedList18.remove((java.lang.Object) 'a');
        boolean boolean22 = linkedList17.remove((java.lang.Object) 'a');
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        boolean boolean27 = linkedList24.remove((java.lang.Object) (short) -1);
        int int28 = linkedList24.size();
        linkedList24.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        linkedList30.clear();
        boolean boolean35 = linkedList24.remove((java.lang.Object) linkedList30);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        linkedList36.clear();
        linkedList36.clear();
        boolean boolean41 = linkedList24.add((java.lang.Object) linkedList36);
        boolean boolean42 = linkedList17.add((java.lang.Object) linkedList24);
        boolean boolean43 = linkedList8.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        boolean boolean48 = linkedList44.add((java.lang.Object) true);
        int int49 = linkedList44.size();
        int int50 = linkedList44.size();
        int int51 = linkedList44.size();
        boolean boolean52 = linkedList17.add((java.lang.Object) int51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList17", linkedList17.property_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (short) -1);
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (-1.0f));
        boolean boolean9 = linkedList0.add((java.lang.Object) (-1.0d));
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        linkedList10.clear();
        boolean boolean15 = linkedList10.add((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList0.add((java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean12 = linkedList4.remove((java.lang.Object) linkedList8);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList8);
        boolean boolean15 = linkedList0.add((java.lang.Object) 10L);
        linkedList0.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean22 = linkedList17.add((java.lang.Object) 10.0d);
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean28 = linkedList24.remove((java.lang.Object) true);
        int int29 = linkedList24.size();
        linkedList24.clear();
        boolean boolean31 = linkedList17.add((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList24);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean38 = linkedList33.add((java.lang.Object) 10.0d);
        boolean boolean39 = linkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        int int41 = linkedList40.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        linkedList45.clear();
        boolean boolean50 = linkedList45.add((java.lang.Object) 10.0d);
        int int51 = linkedList45.size();
        boolean boolean52 = linkedList42.add((java.lang.Object) linkedList45);
        java.lang.Class<?> wildcardClass53 = linkedList42.getClass();
        boolean boolean54 = linkedList40.remove((java.lang.Object) linkedList42);
        linkedList40.clear();
        boolean boolean56 = linkedList0.add((java.lang.Object) linkedList40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean9 = linkedList4.remove((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList4.remove(obj10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean16 = linkedList12.add((java.lang.Object) true);
        boolean boolean17 = linkedList4.add((java.lang.Object) true);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList19.add(obj20);
        linkedList19.clear();
        int int23 = linkedList19.size();
        int int24 = linkedList19.size();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList19);
        boolean boolean27 = linkedList0.add((java.lang.Object) "");
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean38 = linkedList33.add((java.lang.Object) 10.0d);
        int int39 = linkedList33.size();
        boolean boolean40 = linkedList30.add((java.lang.Object) linkedList33);
        java.lang.Class<?> wildcardClass41 = linkedList30.getClass();
        boolean boolean42 = linkedList28.remove((java.lang.Object) linkedList30);
        linkedList28.clear();
        boolean boolean44 = linkedList0.add((java.lang.Object) linkedList28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList20.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList20.add((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass36 = linkedList20.getClass();
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        linkedList38.clear();
        linkedList38.clear();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        boolean boolean47 = linkedList43.remove((java.lang.Object) true);
        boolean boolean48 = linkedList38.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        linkedList49.clear();
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        int int54 = linkedList53.size();
        linkedList53.clear();
        linkedList53.clear();
        boolean boolean58 = linkedList53.remove((java.lang.Object) 1.0f);
        java.lang.Object obj59 = null;
        boolean boolean60 = linkedList53.remove(obj59);
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        boolean boolean65 = linkedList61.add((java.lang.Object) true);
        boolean boolean66 = linkedList53.add((java.lang.Object) true);
        boolean boolean67 = linkedList49.remove((java.lang.Object) linkedList53);
        linkedList53.clear();
        boolean boolean69 = linkedList38.add((java.lang.Object) linkedList53);
        int int70 = linkedList53.size();
        int int71 = linkedList53.size();
        boolean boolean72 = linkedList20.add((java.lang.Object) linkedList53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList20", linkedList20.property_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        linkedList2.clear();
        boolean boolean7 = linkedList2.add((java.lang.Object) 1.0d);
        boolean boolean9 = linkedList2.remove((java.lang.Object) 100.0f);
        boolean boolean10 = linkedList0.add((java.lang.Object) 100.0f);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        linkedList11.clear();
        linkedList11.clear();
        linkedList11.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        boolean boolean21 = linkedList17.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass24 = linkedList23.getClass();
        boolean boolean25 = linkedList22.remove((java.lang.Object) wildcardClass24);
        boolean boolean27 = linkedList22.add((java.lang.Object) false);
        boolean boolean28 = linkedList17.remove((java.lang.Object) false);
        boolean boolean29 = linkedList11.remove((java.lang.Object) boolean28);
        int int30 = linkedList11.size();
        java.lang.Class<?> wildcardClass31 = linkedList11.getClass();
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.remove((java.lang.Object) "");
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Object obj7 = null;
        boolean boolean8 = linkedList6.add(obj7);
        linkedList6.clear();
        int int10 = linkedList6.size();
        int int11 = linkedList6.size();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean16 = linkedList6.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        linkedList20.clear();
        boolean boolean25 = linkedList20.add((java.lang.Object) 10.0d);
        int int26 = linkedList20.size();
        boolean boolean27 = linkedList17.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean36 = linkedList31.add((java.lang.Object) 10.0d);
        int int37 = linkedList31.size();
        boolean boolean38 = linkedList28.add((java.lang.Object) linkedList31);
        linkedList31.clear();
        boolean boolean40 = linkedList20.remove((java.lang.Object) linkedList31);
        boolean boolean41 = linkedList6.remove((java.lang.Object) linkedList31);
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        java.lang.Object obj43 = null;
        boolean boolean44 = linkedList42.add(obj43);
        linkedList42.clear();
        int int46 = linkedList42.size();
        int int47 = linkedList42.size();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        int int49 = linkedList48.size();
        linkedList48.clear();
        linkedList48.clear();
        boolean boolean52 = linkedList42.remove((java.lang.Object) linkedList48);
        boolean boolean53 = linkedList6.add((java.lang.Object) boolean52);
        int int54 = linkedList6.size();
        linkedList6.clear();
        boolean boolean56 = linkedList0.add((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        int int60 = linkedList57.size();
        boolean boolean62 = linkedList57.remove((java.lang.Object) "");
        linkedList57.clear();
        int int64 = linkedList57.size();
        int int65 = linkedList57.size();
        java.lang.Class<?> wildcardClass66 = linkedList57.getClass();
        boolean boolean67 = linkedList0.add((java.lang.Object) linkedList57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean9 = linkedList4.remove((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList4.remove(obj10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean16 = linkedList12.add((java.lang.Object) true);
        boolean boolean17 = linkedList4.add((java.lang.Object) true);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList19.add(obj20);
        linkedList19.clear();
        int int23 = linkedList19.size();
        int int24 = linkedList19.size();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        linkedList26.clear();
        linkedList26.clear();
        linkedList26.clear();
        int int32 = linkedList26.size();
        linkedList26.clear();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        linkedList34.clear();
        linkedList34.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        boolean boolean43 = linkedList39.remove((java.lang.Object) true);
        boolean boolean44 = linkedList34.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        linkedList45.clear();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        linkedList49.clear();
        boolean boolean54 = linkedList49.remove((java.lang.Object) 1.0f);
        java.lang.Object obj55 = null;
        boolean boolean56 = linkedList49.remove(obj55);
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        boolean boolean61 = linkedList57.add((java.lang.Object) true);
        boolean boolean62 = linkedList49.add((java.lang.Object) true);
        boolean boolean63 = linkedList45.remove((java.lang.Object) linkedList49);
        linkedList49.clear();
        boolean boolean65 = linkedList34.add((java.lang.Object) linkedList49);
        boolean boolean66 = linkedList26.add((java.lang.Object) linkedList34);
        boolean boolean67 = linkedList19.add((java.lang.Object) linkedList26);
        system.testclass.LinkedList linkedList68 = new system.testclass.LinkedList();
        int int69 = linkedList68.size();
        linkedList68.clear();
        boolean boolean72 = linkedList68.remove((java.lang.Object) true);
        linkedList68.clear();
        boolean boolean74 = linkedList19.add((java.lang.Object) linkedList68);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList19", linkedList19.property_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        boolean boolean22 = linkedList19.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        linkedList23.clear();
        boolean boolean27 = linkedList19.remove((java.lang.Object) linkedList23);
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        boolean boolean33 = linkedList29.remove((java.lang.Object) (short) 100);
        boolean boolean34 = linkedList0.remove((java.lang.Object) linkedList29);
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        linkedList35.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        linkedList38.clear();
        boolean boolean43 = linkedList38.add((java.lang.Object) 10.0d);
        int int44 = linkedList38.size();
        boolean boolean45 = linkedList35.add((java.lang.Object) linkedList38);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        linkedList49.clear();
        boolean boolean54 = linkedList49.add((java.lang.Object) 10.0d);
        int int55 = linkedList49.size();
        boolean boolean56 = linkedList46.add((java.lang.Object) linkedList49);
        linkedList49.clear();
        boolean boolean58 = linkedList38.remove((java.lang.Object) linkedList49);
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        java.lang.Object obj60 = null;
        boolean boolean61 = linkedList59.add(obj60);
        linkedList59.clear();
        int int63 = linkedList59.size();
        int int64 = linkedList59.size();
        system.testclass.LinkedList linkedList65 = new system.testclass.LinkedList();
        int int66 = linkedList65.size();
        linkedList65.clear();
        linkedList65.clear();
        boolean boolean69 = linkedList59.remove((java.lang.Object) linkedList65);
        int int70 = linkedList65.size();
        system.testclass.LinkedList linkedList71 = new system.testclass.LinkedList();
        java.lang.Object obj72 = null;
        boolean boolean73 = linkedList71.add(obj72);
        linkedList71.clear();
        int int75 = linkedList71.size();
        int int76 = linkedList71.size();
        system.testclass.LinkedList linkedList77 = new system.testclass.LinkedList();
        int int78 = linkedList77.size();
        linkedList77.clear();
        linkedList77.clear();
        linkedList77.clear();
        system.testclass.LinkedList linkedList82 = new system.testclass.LinkedList();
        int int83 = linkedList82.size();
        linkedList82.clear();
        boolean boolean86 = linkedList82.remove((java.lang.Object) true);
        boolean boolean87 = linkedList77.remove((java.lang.Object) true);
        java.lang.Class<?> wildcardClass88 = linkedList77.getClass();
        boolean boolean89 = linkedList71.add((java.lang.Object) wildcardClass88);
        boolean boolean90 = linkedList65.remove((java.lang.Object) boolean89);
        boolean boolean91 = linkedList49.remove((java.lang.Object) boolean89);
        boolean boolean92 = linkedList0.add((java.lang.Object) linkedList49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        boolean boolean11 = linkedList7.add((java.lang.Object) true);
        linkedList7.clear();
        int int13 = linkedList7.size();
        boolean boolean15 = linkedList7.remove((java.lang.Object) (short) 100);
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
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        boolean boolean32 = linkedList29.remove((java.lang.Object) 'a');
        boolean boolean33 = linkedList28.remove((java.lang.Object) 'a');
        boolean boolean34 = linkedList19.remove((java.lang.Object) boolean33);
        boolean boolean35 = linkedList7.remove((java.lang.Object) boolean34);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        boolean boolean40 = linkedList37.remove((java.lang.Object) (short) -1);
        int int41 = linkedList37.size();
        linkedList37.clear();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        linkedList43.clear();
        linkedList43.clear();
        boolean boolean48 = linkedList37.remove((java.lang.Object) linkedList43);
        linkedList43.clear();
        boolean boolean50 = linkedList0.add((java.lang.Object) linkedList43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        boolean boolean11 = linkedList4.add((java.lang.Object) 10.0d);
        boolean boolean13 = linkedList4.add((java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList4", linkedList4.property_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        boolean boolean5 = linkedList0.add((java.lang.Object) false);
        int int6 = linkedList0.size();
        java.lang.Object obj7 = null;
        boolean boolean8 = linkedList0.add(obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        boolean boolean16 = linkedList11.add((java.lang.Object) false);
        boolean boolean17 = linkedList6.remove((java.lang.Object) false);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList20.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList20.add((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass36 = linkedList20.getClass();
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList20);
        boolean boolean39 = linkedList20.add((java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList20", linkedList20.property_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList16.add(obj17);
        linkedList16.clear();
        int int20 = linkedList16.size();
        int int21 = linkedList16.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        linkedList22.clear();
        boolean boolean26 = linkedList16.remove((java.lang.Object) linkedList22);
        linkedList16.clear();
        java.lang.Class<?> wildcardClass28 = linkedList16.getClass();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean12 = linkedList4.remove((java.lang.Object) linkedList8);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList8);
        boolean boolean15 = linkedList0.add((java.lang.Object) 10L);
        linkedList0.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean22 = linkedList17.add((java.lang.Object) 10.0d);
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean28 = linkedList24.remove((java.lang.Object) true);
        int int29 = linkedList24.size();
        linkedList24.clear();
        boolean boolean31 = linkedList17.add((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList24);
        int int33 = linkedList0.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        linkedList37.clear();
        boolean boolean42 = linkedList37.add((java.lang.Object) 10.0d);
        int int43 = linkedList37.size();
        boolean boolean44 = linkedList34.add((java.lang.Object) linkedList37);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        int int49 = linkedList48.size();
        linkedList48.clear();
        linkedList48.clear();
        boolean boolean53 = linkedList48.add((java.lang.Object) 10.0d);
        int int54 = linkedList48.size();
        boolean boolean55 = linkedList45.add((java.lang.Object) linkedList48);
        linkedList48.clear();
        boolean boolean57 = linkedList37.remove((java.lang.Object) linkedList48);
        linkedList37.clear();
        linkedList37.clear();
        int int60 = linkedList37.size();
        boolean boolean61 = linkedList0.add((java.lang.Object) int60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean30 = linkedList25.add((java.lang.Object) 10.0d);
        int int31 = linkedList25.size();
        boolean boolean32 = linkedList22.add((java.lang.Object) linkedList25);
        linkedList25.clear();
        boolean boolean34 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList36.add(obj37);
        linkedList36.clear();
        int int40 = linkedList36.size();
        int int41 = linkedList36.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        linkedList42.clear();
        boolean boolean46 = linkedList36.remove((java.lang.Object) linkedList42);
        boolean boolean47 = linkedList0.add((java.lang.Object) boolean46);
        int int48 = linkedList0.size();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        int int51 = linkedList50.size();
        boolean boolean53 = linkedList50.remove((java.lang.Object) 'a');
        boolean boolean54 = linkedList49.remove((java.lang.Object) 'a');
        linkedList49.clear();
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        boolean boolean59 = linkedList56.remove((java.lang.Object) (short) -1);
        int int60 = linkedList56.size();
        linkedList56.clear();
        system.testclass.LinkedList linkedList62 = new system.testclass.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        linkedList62.clear();
        linkedList62.clear();
        boolean boolean67 = linkedList56.remove((java.lang.Object) linkedList62);
        system.testclass.LinkedList linkedList68 = new system.testclass.LinkedList();
        int int69 = linkedList68.size();
        linkedList68.clear();
        linkedList68.clear();
        linkedList68.clear();
        boolean boolean73 = linkedList56.add((java.lang.Object) linkedList68);
        boolean boolean74 = linkedList49.add((java.lang.Object) linkedList56);
        boolean boolean75 = linkedList0.remove((java.lang.Object) linkedList56);
        java.lang.Object obj76 = null;
        boolean boolean77 = linkedList0.add(obj76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        boolean boolean14 = linkedList11.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean19 = linkedList11.remove((java.lang.Object) linkedList15);
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList15);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        boolean boolean25 = linkedList21.add((java.lang.Object) true);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        boolean boolean35 = linkedList30.remove((java.lang.Object) 1.0f);
        java.lang.Object obj36 = null;
        boolean boolean37 = linkedList30.remove(obj36);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        boolean boolean42 = linkedList38.add((java.lang.Object) true);
        boolean boolean43 = linkedList30.add((java.lang.Object) true);
        boolean boolean44 = linkedList26.remove((java.lang.Object) linkedList30);
        linkedList30.clear();
        boolean boolean46 = linkedList21.remove((java.lang.Object) linkedList30);
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        int int48 = linkedList47.size();
        linkedList47.clear();
        int int50 = linkedList47.size();
        boolean boolean52 = linkedList47.remove((java.lang.Object) "");
        linkedList47.clear();
        java.lang.Class<?> wildcardClass54 = linkedList47.getClass();
        boolean boolean55 = linkedList30.add((java.lang.Object) linkedList47);
        boolean boolean57 = linkedList30.remove((java.lang.Object) 0);
        boolean boolean58 = linkedList0.add((java.lang.Object) boolean57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean14 = linkedList9.remove((java.lang.Object) 1.0f);
        java.lang.Object obj15 = null;
        boolean boolean16 = linkedList9.remove(obj15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        boolean boolean21 = linkedList17.add((java.lang.Object) true);
        boolean boolean22 = linkedList9.add((java.lang.Object) true);
        boolean boolean23 = linkedList5.remove((java.lang.Object) linkedList9);
        linkedList9.clear();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList9);
        boolean boolean27 = linkedList0.add((java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean11 = linkedList6.add((java.lang.Object) 1.0d);
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass14 = linkedList6.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) wildcardClass14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        linkedList16.clear();
        linkedList16.clear();
        linkedList16.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean26 = linkedList22.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass29 = linkedList28.getClass();
        boolean boolean30 = linkedList27.remove((java.lang.Object) wildcardClass29);
        boolean boolean32 = linkedList27.add((java.lang.Object) false);
        boolean boolean33 = linkedList22.remove((java.lang.Object) false);
        boolean boolean34 = linkedList16.remove((java.lang.Object) boolean33);
        boolean boolean35 = linkedList0.add((java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean12 = linkedList7.remove((java.lang.Object) "");
        linkedList7.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList7.add(obj14);
        boolean boolean16 = linkedList0.remove(obj14);
        boolean boolean18 = linkedList0.add((java.lang.Object) 100.0f);
        boolean boolean20 = linkedList0.add((java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList16.add(obj17);
        linkedList16.clear();
        linkedList16.clear();
        int int21 = linkedList16.size();
        boolean boolean22 = linkedList0.add((java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean20 = linkedList16.add((java.lang.Object) true);
        linkedList16.clear();
        int int22 = linkedList16.size();
        linkedList16.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList24.add(obj25);
        linkedList24.clear();
        boolean boolean28 = linkedList16.add((java.lang.Object) linkedList24);
        linkedList24.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        linkedList30.clear();
        linkedList30.clear();
        int int36 = linkedList30.size();
        linkedList30.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        linkedList38.clear();
        linkedList38.clear();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        boolean boolean47 = linkedList43.remove((java.lang.Object) true);
        boolean boolean48 = linkedList38.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        linkedList49.clear();
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        int int54 = linkedList53.size();
        linkedList53.clear();
        linkedList53.clear();
        boolean boolean58 = linkedList53.remove((java.lang.Object) 1.0f);
        java.lang.Object obj59 = null;
        boolean boolean60 = linkedList53.remove(obj59);
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        boolean boolean65 = linkedList61.add((java.lang.Object) true);
        boolean boolean66 = linkedList53.add((java.lang.Object) true);
        boolean boolean67 = linkedList49.remove((java.lang.Object) linkedList53);
        linkedList53.clear();
        boolean boolean69 = linkedList38.add((java.lang.Object) linkedList53);
        boolean boolean70 = linkedList30.add((java.lang.Object) linkedList38);
        boolean boolean71 = linkedList24.add((java.lang.Object) linkedList38);
        boolean boolean72 = linkedList0.add((java.lang.Object) boolean71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        linkedList9.clear();
        linkedList9.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        boolean boolean19 = linkedList15.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        boolean boolean25 = linkedList20.add((java.lang.Object) false);
        boolean boolean26 = linkedList15.remove((java.lang.Object) false);
        boolean boolean27 = linkedList9.remove((java.lang.Object) boolean26);
        linkedList9.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        boolean boolean32 = linkedList29.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean37 = linkedList29.remove((java.lang.Object) linkedList33);
        linkedList29.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass41 = linkedList40.getClass();
        boolean boolean42 = linkedList39.remove((java.lang.Object) wildcardClass41);
        java.lang.Class<?> wildcardClass43 = linkedList39.getClass();
        boolean boolean44 = linkedList29.add((java.lang.Object) linkedList39);
        boolean boolean45 = linkedList9.add((java.lang.Object) linkedList29);
        int int46 = linkedList29.size();
        boolean boolean47 = linkedList4.add((java.lang.Object) int46);
        int int48 = linkedList4.size();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        boolean boolean53 = linkedList49.add((java.lang.Object) true);
        java.lang.Class<?> wildcardClass54 = linkedList49.getClass();
        boolean boolean55 = linkedList4.add((java.lang.Object) wildcardClass54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList4", linkedList4.property_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean30 = linkedList25.add((java.lang.Object) 10.0d);
        int int31 = linkedList25.size();
        boolean boolean32 = linkedList22.add((java.lang.Object) linkedList25);
        linkedList25.clear();
        boolean boolean34 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList36.add(obj37);
        linkedList36.clear();
        int int40 = linkedList36.size();
        int int41 = linkedList36.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        linkedList42.clear();
        boolean boolean46 = linkedList36.remove((java.lang.Object) linkedList42);
        boolean boolean47 = linkedList0.add((java.lang.Object) boolean46);
        int int48 = linkedList0.size();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        boolean boolean52 = linkedList49.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        int int54 = linkedList53.size();
        linkedList53.clear();
        linkedList53.clear();
        boolean boolean57 = linkedList49.remove((java.lang.Object) linkedList53);
        linkedList49.clear();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass61 = linkedList60.getClass();
        boolean boolean62 = linkedList59.remove((java.lang.Object) wildcardClass61);
        java.lang.Class<?> wildcardClass63 = linkedList59.getClass();
        boolean boolean64 = linkedList49.add((java.lang.Object) linkedList59);
        boolean boolean65 = linkedList0.add((java.lang.Object) linkedList49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        linkedList0.clear();
        int int6 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList8.add(obj9);
        linkedList8.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList8);
        linkedList8.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        linkedList14.clear();
        linkedList14.clear();
        int int20 = linkedList14.size();
        linkedList14.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        linkedList22.clear();
        linkedList22.clear();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean31 = linkedList27.remove((java.lang.Object) true);
        boolean boolean32 = linkedList22.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        linkedList37.clear();
        boolean boolean42 = linkedList37.remove((java.lang.Object) 1.0f);
        java.lang.Object obj43 = null;
        boolean boolean44 = linkedList37.remove(obj43);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        boolean boolean49 = linkedList45.add((java.lang.Object) true);
        boolean boolean50 = linkedList37.add((java.lang.Object) true);
        boolean boolean51 = linkedList33.remove((java.lang.Object) linkedList37);
        linkedList37.clear();
        boolean boolean53 = linkedList22.add((java.lang.Object) linkedList37);
        boolean boolean54 = linkedList14.add((java.lang.Object) linkedList22);
        boolean boolean55 = linkedList8.add((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        linkedList56.clear();
        linkedList56.clear();
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        boolean boolean65 = linkedList61.remove((java.lang.Object) true);
        boolean boolean66 = linkedList56.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList67 = new system.testclass.LinkedList();
        int int68 = linkedList67.size();
        boolean boolean70 = linkedList67.remove((java.lang.Object) 'a');
        linkedList67.clear();
        boolean boolean72 = linkedList56.remove((java.lang.Object) linkedList67);
        linkedList56.clear();
        boolean boolean74 = linkedList22.add((java.lang.Object) linkedList56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList22", linkedList22.property_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        int int10 = linkedList4.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        boolean boolean14 = linkedList11.remove((java.lang.Object) (short) -1);
        int int15 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean22 = linkedList11.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        linkedList23.clear();
        linkedList23.clear();
        boolean boolean28 = linkedList11.add((java.lang.Object) linkedList23);
        int int29 = linkedList23.size();
        boolean boolean30 = linkedList4.add((java.lang.Object) linkedList23);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean35 = linkedList32.remove((java.lang.Object) 'a');
        boolean boolean36 = linkedList31.remove((java.lang.Object) 'a');
        linkedList31.clear();
        boolean boolean38 = linkedList4.add((java.lang.Object) linkedList31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList4", linkedList4.property_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean10 = linkedList5.add((java.lang.Object) 10.0d);
        int int11 = linkedList5.size();
        boolean boolean12 = linkedList2.add((java.lang.Object) linkedList5);
        java.lang.Class<?> wildcardClass13 = linkedList2.getClass();
        boolean boolean14 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (short) -1);
        linkedList15.clear();
        java.lang.Class<?> wildcardClass20 = linkedList15.getClass();
        boolean boolean21 = linkedList2.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList2", linkedList2.property_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.remove(obj6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean11 = linkedList8.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean16 = linkedList8.remove((java.lang.Object) linkedList12);
        linkedList12.clear();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList19.add(obj20);
        linkedList19.clear();
        int int23 = linkedList19.size();
        int int24 = linkedList19.size();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean29 = linkedList19.remove((java.lang.Object) linkedList25);
        boolean boolean30 = linkedList12.remove((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        linkedList35.clear();
        linkedList35.clear();
        boolean boolean40 = linkedList35.remove((java.lang.Object) 1.0f);
        java.lang.Object obj41 = null;
        boolean boolean42 = linkedList35.remove(obj41);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        boolean boolean47 = linkedList43.add((java.lang.Object) true);
        boolean boolean48 = linkedList35.add((java.lang.Object) true);
        boolean boolean49 = linkedList31.remove((java.lang.Object) linkedList35);
        int int50 = linkedList35.size();
        java.lang.Class<?> wildcardClass51 = linkedList35.getClass();
        boolean boolean52 = linkedList19.add((java.lang.Object) wildcardClass51);
        boolean boolean54 = linkedList19.add((java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList19", linkedList19.property_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean16 = linkedList12.remove((java.lang.Object) true);
        boolean boolean17 = linkedList7.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        boolean boolean21 = linkedList18.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        linkedList22.clear();
        boolean boolean26 = linkedList18.remove((java.lang.Object) linkedList22);
        boolean boolean27 = linkedList7.add((java.lang.Object) linkedList22);
        int int28 = linkedList7.size();
        java.lang.Object obj29 = null;
        boolean boolean30 = linkedList7.remove(obj29);
        boolean boolean31 = linkedList0.remove((java.lang.Object) boolean30);
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean35 = linkedList32.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        linkedList36.clear();
        boolean boolean40 = linkedList32.remove((java.lang.Object) linkedList36);
        linkedList32.clear();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass44 = linkedList43.getClass();
        boolean boolean45 = linkedList42.remove((java.lang.Object) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = linkedList42.getClass();
        boolean boolean47 = linkedList32.add((java.lang.Object) linkedList42);
        boolean boolean48 = linkedList0.add((java.lang.Object) boolean47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean14 = linkedList9.remove((java.lang.Object) 1.0f);
        java.lang.Object obj15 = null;
        boolean boolean16 = linkedList9.remove(obj15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        boolean boolean21 = linkedList17.add((java.lang.Object) true);
        boolean boolean22 = linkedList9.add((java.lang.Object) true);
        boolean boolean23 = linkedList5.remove((java.lang.Object) linkedList9);
        linkedList9.clear();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList9);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        boolean boolean35 = linkedList30.remove((java.lang.Object) 1.0f);
        java.lang.Object obj36 = null;
        boolean boolean37 = linkedList30.remove(obj36);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        boolean boolean42 = linkedList38.add((java.lang.Object) true);
        boolean boolean43 = linkedList30.add((java.lang.Object) true);
        boolean boolean44 = linkedList26.remove((java.lang.Object) linkedList30);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        java.lang.Object obj46 = null;
        boolean boolean47 = linkedList45.add(obj46);
        linkedList45.clear();
        int int49 = linkedList45.size();
        int int50 = linkedList45.size();
        boolean boolean51 = linkedList26.remove((java.lang.Object) linkedList45);
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        system.testclass.LinkedList linkedList55 = new system.testclass.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        linkedList55.clear();
        boolean boolean60 = linkedList55.add((java.lang.Object) 10.0d);
        int int61 = linkedList55.size();
        boolean boolean62 = linkedList52.add((java.lang.Object) linkedList55);
        system.testclass.LinkedList linkedList63 = new system.testclass.LinkedList();
        int int64 = linkedList63.size();
        linkedList63.clear();
        system.testclass.LinkedList linkedList66 = new system.testclass.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        linkedList66.clear();
        boolean boolean71 = linkedList66.add((java.lang.Object) 10.0d);
        int int72 = linkedList66.size();
        boolean boolean73 = linkedList63.add((java.lang.Object) linkedList66);
        linkedList66.clear();
        boolean boolean75 = linkedList55.remove((java.lang.Object) linkedList66);
        boolean boolean76 = linkedList45.remove((java.lang.Object) linkedList66);
        linkedList66.clear();
        system.testclass.LinkedList linkedList78 = new system.testclass.LinkedList();
        int int79 = linkedList78.size();
        linkedList78.clear();
        int int81 = linkedList78.size();
        boolean boolean83 = linkedList78.remove((java.lang.Object) "");
        int int84 = linkedList78.size();
        linkedList78.clear();
        boolean boolean86 = linkedList66.add((java.lang.Object) linkedList78);
        int int87 = linkedList78.size();
        boolean boolean88 = linkedList0.add((java.lang.Object) int87);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        int int2 = linkedList1.size();
        boolean boolean4 = linkedList1.remove((java.lang.Object) 'a');
        boolean boolean5 = linkedList0.remove((java.lang.Object) 'a');
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (short) -1);
        int int11 = linkedList7.size();
        linkedList7.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean18 = linkedList7.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        linkedList19.clear();
        linkedList19.clear();
        boolean boolean24 = linkedList7.add((java.lang.Object) linkedList19);
        boolean boolean25 = linkedList0.add((java.lang.Object) linkedList7);
        linkedList7.clear();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        linkedList27.clear();
        boolean boolean32 = linkedList27.remove((java.lang.Object) 1.0f);
        int int33 = linkedList27.size();
        int int34 = linkedList27.size();
        boolean boolean35 = linkedList7.add((java.lang.Object) int34);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        boolean boolean40 = linkedList36.add((java.lang.Object) true);
        linkedList36.clear();
        int int42 = linkedList36.size();
        boolean boolean43 = linkedList7.add((java.lang.Object) linkedList36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList7", linkedList7.property_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean9 = linkedList4.remove((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList4.remove(obj10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean16 = linkedList12.add((java.lang.Object) true);
        boolean boolean17 = linkedList4.add((java.lang.Object) true);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        boolean boolean22 = linkedList19.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        boolean boolean26 = linkedList23.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        linkedList27.clear();
        boolean boolean31 = linkedList23.remove((java.lang.Object) linkedList27);
        boolean boolean32 = linkedList19.remove((java.lang.Object) linkedList27);
        java.lang.Class<?> wildcardClass33 = linkedList27.getClass();
        boolean boolean34 = linkedList4.remove((java.lang.Object) wildcardClass33);
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        linkedList35.clear();
        linkedList35.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        linkedList39.clear();
        boolean boolean44 = linkedList39.remove((java.lang.Object) 1.0f);
        java.lang.Object obj45 = null;
        boolean boolean46 = linkedList39.remove(obj45);
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        int int48 = linkedList47.size();
        linkedList47.clear();
        boolean boolean51 = linkedList47.add((java.lang.Object) true);
        boolean boolean52 = linkedList39.add((java.lang.Object) true);
        boolean boolean53 = linkedList35.remove((java.lang.Object) linkedList39);
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        java.lang.Object obj55 = null;
        boolean boolean56 = linkedList54.add(obj55);
        linkedList54.clear();
        int int58 = linkedList54.size();
        int int59 = linkedList54.size();
        boolean boolean60 = linkedList35.remove((java.lang.Object) linkedList54);
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        system.testclass.LinkedList linkedList64 = new system.testclass.LinkedList();
        int int65 = linkedList64.size();
        linkedList64.clear();
        linkedList64.clear();
        boolean boolean69 = linkedList64.add((java.lang.Object) 10.0d);
        int int70 = linkedList64.size();
        boolean boolean71 = linkedList61.add((java.lang.Object) linkedList64);
        system.testclass.LinkedList linkedList72 = new system.testclass.LinkedList();
        int int73 = linkedList72.size();
        linkedList72.clear();
        system.testclass.LinkedList linkedList75 = new system.testclass.LinkedList();
        int int76 = linkedList75.size();
        linkedList75.clear();
        linkedList75.clear();
        boolean boolean80 = linkedList75.add((java.lang.Object) 10.0d);
        int int81 = linkedList75.size();
        boolean boolean82 = linkedList72.add((java.lang.Object) linkedList75);
        linkedList75.clear();
        boolean boolean84 = linkedList64.remove((java.lang.Object) linkedList75);
        boolean boolean85 = linkedList54.remove((java.lang.Object) linkedList75);
        linkedList75.clear();
        system.testclass.LinkedList linkedList87 = new system.testclass.LinkedList();
        int int88 = linkedList87.size();
        linkedList87.clear();
        int int90 = linkedList87.size();
        int int91 = linkedList87.size();
        system.testclass.LinkedList linkedList92 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList93 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass94 = linkedList93.getClass();
        boolean boolean95 = linkedList92.remove((java.lang.Object) wildcardClass94);
        java.lang.Class<?> wildcardClass96 = linkedList92.getClass();
        boolean boolean97 = linkedList87.remove((java.lang.Object) linkedList92);
        boolean boolean98 = linkedList75.add((java.lang.Object) boolean97);
        boolean boolean99 = linkedList4.add((java.lang.Object) boolean98);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList4", linkedList4.property_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        java.lang.Object obj1 = null;
        boolean boolean2 = linkedList0.add(obj1);
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        linkedList25.clear();
        boolean boolean30 = linkedList25.add((java.lang.Object) 10.0d);
        int int31 = linkedList25.size();
        boolean boolean32 = linkedList22.add((java.lang.Object) linkedList25);
        linkedList25.clear();
        boolean boolean34 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList36.add(obj37);
        linkedList36.clear();
        int int40 = linkedList36.size();
        int int41 = linkedList36.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        linkedList42.clear();
        boolean boolean46 = linkedList36.remove((java.lang.Object) linkedList42);
        boolean boolean47 = linkedList0.add((java.lang.Object) boolean46);
        int int48 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        linkedList51.clear();
        linkedList51.clear();
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean60 = linkedList56.remove((java.lang.Object) true);
        boolean boolean61 = linkedList51.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList62 = new system.testclass.LinkedList();
        int int63 = linkedList62.size();
        boolean boolean65 = linkedList62.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList66 = new system.testclass.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        linkedList66.clear();
        boolean boolean70 = linkedList62.remove((java.lang.Object) linkedList66);
        boolean boolean71 = linkedList51.add((java.lang.Object) linkedList66);
        int int72 = linkedList51.size();
        java.lang.Object obj73 = null;
        boolean boolean74 = linkedList51.remove(obj73);
        boolean boolean75 = linkedList0.add((java.lang.Object) linkedList51);
        system.testclass.LinkedList linkedList76 = new system.testclass.LinkedList();
        int int77 = linkedList76.size();
        boolean boolean79 = linkedList76.remove((java.lang.Object) (short) -1);
        int int80 = linkedList76.size();
        linkedList76.clear();
        linkedList76.clear();
        boolean boolean83 = linkedList51.add((java.lang.Object) linkedList76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList51", linkedList51.property_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (short) -1);
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        linkedList6.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        boolean boolean17 = linkedList14.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        boolean boolean21 = linkedList18.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        linkedList22.clear();
        boolean boolean26 = linkedList18.remove((java.lang.Object) linkedList22);
        boolean boolean27 = linkedList14.remove((java.lang.Object) linkedList22);
        boolean boolean28 = linkedList6.add((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean36 = linkedList31.add((java.lang.Object) 1.0d);
        boolean boolean38 = linkedList31.remove((java.lang.Object) 100.0f);
        boolean boolean39 = linkedList29.add((java.lang.Object) 100.0f);
        boolean boolean40 = linkedList6.remove((java.lang.Object) 100.0f);
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        int int42 = linkedList41.size();
        boolean boolean44 = linkedList41.remove((java.lang.Object) (short) -1);
        int int45 = linkedList41.size();
        linkedList41.clear();
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        int int48 = linkedList47.size();
        linkedList47.clear();
        linkedList47.clear();
        linkedList47.clear();
        boolean boolean52 = linkedList41.remove((java.lang.Object) linkedList47);
        int int53 = linkedList41.size();
        java.lang.Object obj54 = null;
        boolean boolean55 = linkedList41.add(obj54);
        int int56 = linkedList41.size();
        boolean boolean57 = linkedList6.remove((java.lang.Object) linkedList41);
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        boolean boolean62 = linkedList58.add((java.lang.Object) true);
        linkedList58.clear();
        int int64 = linkedList58.size();
        boolean boolean66 = linkedList58.remove((java.lang.Object) (short) 100);
        system.testclass.LinkedList linkedList67 = new system.testclass.LinkedList();
        int int68 = linkedList67.size();
        linkedList67.clear();
        system.testclass.LinkedList linkedList70 = new system.testclass.LinkedList();
        int int71 = linkedList70.size();
        linkedList70.clear();
        linkedList70.clear();
        boolean boolean75 = linkedList70.add((java.lang.Object) 10.0d);
        int int76 = linkedList70.size();
        boolean boolean77 = linkedList67.add((java.lang.Object) linkedList70);
        linkedList70.clear();
        system.testclass.LinkedList linkedList79 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList80 = new system.testclass.LinkedList();
        int int81 = linkedList80.size();
        boolean boolean83 = linkedList80.remove((java.lang.Object) 'a');
        boolean boolean84 = linkedList79.remove((java.lang.Object) 'a');
        boolean boolean85 = linkedList70.remove((java.lang.Object) boolean84);
        boolean boolean86 = linkedList58.remove((java.lang.Object) boolean85);
        boolean boolean87 = linkedList41.add((java.lang.Object) linkedList58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList41", linkedList41.property_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        boolean boolean9 = linkedList5.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        boolean boolean15 = linkedList10.add((java.lang.Object) false);
        boolean boolean16 = linkedList5.remove((java.lang.Object) false);
        boolean boolean17 = linkedList0.remove((java.lang.Object) boolean16);
        linkedList0.clear();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        linkedList19.clear();
        boolean boolean24 = linkedList19.remove((java.lang.Object) 1.0f);
        int int25 = linkedList19.size();
        int int26 = linkedList19.size();
        boolean boolean27 = linkedList0.add((java.lang.Object) int26);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        boolean boolean35 = linkedList28.remove((java.lang.Object) int34);
        boolean boolean36 = linkedList0.add((java.lang.Object) boolean35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean12 = linkedList4.remove((java.lang.Object) linkedList8);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList8);
        boolean boolean15 = linkedList0.add((java.lang.Object) 10L);
        linkedList0.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean22 = linkedList17.add((java.lang.Object) 10.0d);
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean28 = linkedList24.remove((java.lang.Object) true);
        int int29 = linkedList24.size();
        linkedList24.clear();
        boolean boolean31 = linkedList17.add((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList24);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean38 = linkedList33.add((java.lang.Object) 10.0d);
        boolean boolean39 = linkedList0.remove((java.lang.Object) 10.0d);
        java.lang.Object obj40 = null;
        boolean boolean41 = linkedList0.add(obj40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean12 = linkedList4.remove((java.lang.Object) linkedList8);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList8);
        boolean boolean15 = linkedList0.add((java.lang.Object) 10L);
        linkedList0.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean22 = linkedList17.add((java.lang.Object) 10.0d);
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean28 = linkedList24.remove((java.lang.Object) true);
        int int29 = linkedList24.size();
        linkedList24.clear();
        boolean boolean31 = linkedList17.add((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList24);
        int int33 = linkedList0.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        boolean boolean38 = linkedList34.add((java.lang.Object) true);
        linkedList34.clear();
        int int40 = linkedList34.size();
        boolean boolean42 = linkedList34.remove((java.lang.Object) (short) 100);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        linkedList46.clear();
        boolean boolean51 = linkedList46.add((java.lang.Object) 10.0d);
        int int52 = linkedList46.size();
        boolean boolean53 = linkedList43.add((java.lang.Object) linkedList46);
        linkedList46.clear();
        system.testclass.LinkedList linkedList55 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        boolean boolean59 = linkedList56.remove((java.lang.Object) 'a');
        boolean boolean60 = linkedList55.remove((java.lang.Object) 'a');
        boolean boolean61 = linkedList46.remove((java.lang.Object) boolean60);
        boolean boolean62 = linkedList34.remove((java.lang.Object) boolean61);
        linkedList34.clear();
        boolean boolean64 = linkedList0.add((java.lang.Object) linkedList34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) true);
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        linkedList9.clear();
        linkedList9.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        boolean boolean19 = linkedList15.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        boolean boolean25 = linkedList20.add((java.lang.Object) false);
        boolean boolean26 = linkedList15.remove((java.lang.Object) false);
        boolean boolean27 = linkedList9.remove((java.lang.Object) boolean26);
        linkedList9.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        boolean boolean32 = linkedList29.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean37 = linkedList29.remove((java.lang.Object) linkedList33);
        linkedList29.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass41 = linkedList40.getClass();
        boolean boolean42 = linkedList39.remove((java.lang.Object) wildcardClass41);
        java.lang.Class<?> wildcardClass43 = linkedList39.getClass();
        boolean boolean44 = linkedList29.add((java.lang.Object) linkedList39);
        boolean boolean45 = linkedList9.add((java.lang.Object) linkedList29);
        boolean boolean46 = linkedList0.add((java.lang.Object) linkedList29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.remove((java.lang.Object) 1.0f);
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (short) -1);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean14 = linkedList7.remove((java.lang.Object) (-1.0f));
        boolean boolean15 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean20 = linkedList16.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        boolean boolean26 = linkedList21.add((java.lang.Object) false);
        boolean boolean27 = linkedList16.remove((java.lang.Object) false);
        int int28 = linkedList16.size();
        int int29 = linkedList16.size();
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean36 = linkedList31.remove((java.lang.Object) 1.0f);
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList31.remove(obj37);
        int int39 = linkedList31.size();
        boolean boolean40 = linkedList0.add((java.lang.Object) int39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean13 = linkedList8.remove((java.lang.Object) 1.0f);
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList8.remove(obj14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean19 = linkedList16.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        linkedList20.clear();
        boolean boolean24 = linkedList16.remove((java.lang.Object) linkedList20);
        linkedList20.clear();
        boolean boolean26 = linkedList8.add((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        java.lang.Object obj28 = null;
        boolean boolean29 = linkedList27.add(obj28);
        linkedList27.clear();
        int int31 = linkedList27.size();
        int int32 = linkedList27.size();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        linkedList33.clear();
        boolean boolean37 = linkedList27.remove((java.lang.Object) linkedList33);
        boolean boolean38 = linkedList20.remove((java.lang.Object) linkedList27);
        java.lang.Object obj39 = null;
        boolean boolean40 = linkedList27.remove(obj39);
        boolean boolean41 = linkedList0.add((java.lang.Object) boolean40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList0", linkedList0.property_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
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
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean19 = linkedList14.add((java.lang.Object) 10.0d);
        int int20 = linkedList14.size();
        boolean boolean21 = linkedList11.add((java.lang.Object) linkedList14);
        linkedList14.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        boolean boolean27 = linkedList24.remove((java.lang.Object) 'a');
        boolean boolean28 = linkedList23.remove((java.lang.Object) 'a');
        boolean boolean29 = linkedList14.remove((java.lang.Object) boolean28);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean34 = linkedList30.add((java.lang.Object) true);
        linkedList30.clear();
        int int36 = linkedList30.size();
        linkedList30.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        java.lang.Object obj39 = null;
        boolean boolean40 = linkedList38.add(obj39);
        linkedList38.clear();
        boolean boolean42 = linkedList30.add((java.lang.Object) linkedList38);
        boolean boolean43 = linkedList14.remove((java.lang.Object) linkedList38);
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        linkedList44.clear();
        linkedList44.clear();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        boolean boolean53 = linkedList49.remove((java.lang.Object) true);
        boolean boolean54 = linkedList44.remove((java.lang.Object) true);
        system.testclass.LinkedList linkedList55 = new system.testclass.LinkedList();
        int int56 = linkedList55.size();
        boolean boolean58 = linkedList55.remove((java.lang.Object) 'a');
        linkedList55.clear();
        boolean boolean60 = linkedList44.remove((java.lang.Object) linkedList55);
        linkedList44.clear();
        boolean boolean62 = linkedList38.add((java.lang.Object) linkedList44);
        boolean boolean63 = linkedList3.add((java.lang.Object) linkedList44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for linkedList3", linkedList3.property_1());
    }
}

