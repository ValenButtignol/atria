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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap2.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap13.table = entryArray20;
        int int22 = hashMap13.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        java.lang.Object obj30 = hashMap23.put((java.lang.Object) hashMap28, (java.lang.Object) (byte) 1);
        java.lang.Object obj32 = hashMap23.get((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass33 = hashMap23.getClass();
        java.lang.Object obj34 = hashMap13.remove((java.lang.Object) wildcardClass33);
        boolean boolean35 = hashMap13.composedRepOK();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        java.lang.Object obj40 = hashMap36.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj45 = hashMap41.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        java.lang.Object obj48 = hashMap41.put((java.lang.Object) hashMap46, (java.lang.Object) (byte) 1);
        java.lang.Object obj50 = hashMap36.put((java.lang.Object) hashMap41, (java.lang.Object) (short) 100);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap41.table;
        hashMap13.table = entryArray51;
        hashMap2.table = entryArray51;
        hashMap1.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        hashMap1.modCount = (byte) 100;
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 1;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        boolean boolean12 = hashMap3.composedRepOK();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        java.lang.Object obj21 = hashMap14.put((java.lang.Object) hashMap19, (java.lang.Object) (byte) 1);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        java.lang.Object obj29 = hashMap22.put((java.lang.Object) hashMap27, (java.lang.Object) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap22.table;
        hashMap14.table = entryArray30;
        hashMap0.table = entryArray30;
        hashMap0.modCount = (byte) -1;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(2);
        boolean boolean37 = hashMap36.property_1();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap3.table = entryArray6;
        hashMap0.table = entryArray6;
        hashMap0.modCount = '#';
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(11, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap5.table = entryArray8;
        hashMap5.modCount = (byte) -1;
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap5);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap14.table = entryArray17;
        hashMap4.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        hashMap1.modCount = 100;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        boolean boolean7 = hashMap4.composedRepOK();
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        java.lang.Object obj21 = hashMap14.put((java.lang.Object) hashMap19, (java.lang.Object) (byte) 1);
        java.lang.Object obj23 = hashMap9.put((java.lang.Object) hashMap14, (java.lang.Object) (short) 100);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap14.table;
        java.lang.Object obj26 = hashMap4.put((java.lang.Object) hashMap14, (java.lang.Object) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap4.table;
        hashMap1.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (-1);
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        java.lang.Object obj13 = hashMap6.put((java.lang.Object) hashMap11, (java.lang.Object) (byte) 1);
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap11);
        boolean boolean15 = hashMap11.composedRepOK();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        int int18 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap11.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap11", hashMap11.property_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(53, (float) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (-1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        java.lang.Object obj23 = hashMap16.put((java.lang.Object) hashMap21, (java.lang.Object) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap16.table;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) (-1), (java.lang.Object) hashMap16);
        int int26 = hashMap0.modCount;
        boolean boolean27 = hashMap0.isEmpty();
        boolean boolean28 = hashMap0.composedRepOK();
        int int29 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(54, (float) 52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        hashMap1.modCount = 100;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj11 = hashMap4.put((java.lang.Object) hashMap9, (java.lang.Object) (byte) 1);
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) 100);
        hashMap4.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap16.table = entryArray23;
        java.lang.Class<?> wildcardClass25 = entryArray23.getClass();
        java.lang.Object obj26 = hashMap4.put((java.lang.Object) '#', (java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(2);
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        java.lang.Object obj31 = hashMap4.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap4.table;
        hashMap1.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(3, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(53, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }
}

