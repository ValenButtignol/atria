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
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) 1L, obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap2.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap2.table = entryArray5;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) hashMap10);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap7.put((java.lang.Object) 1L, obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap7.table;
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap3.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        hashMap3.table = entryArray10;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap15.table = entryArray18;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        boolean boolean26 = hashMap22.isEmpty();
        hashMap22.clear();
        java.lang.Object obj28 = hashMap15.remove((java.lang.Object) hashMap22);
        int int29 = hashMap15.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        hashMap15.table = entryArray32;
        java.lang.Object obj35 = hashMap2.put((java.lang.Object) entryArray10, (java.lang.Object) entryArray32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray40;
        hashMap38.clear();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap36.table = entryArray43;
        hashMap2.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 1L, obj7);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap12.table = entryArray20;
        hashMap11.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        hashMap25.modCount = 0;
        int int28 = hashMap25.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap29.table;
        hashMap25.table = entryArray34;
        hashMap11.table = entryArray34;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap39.clear();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap43.table = entryArray46;
        java.lang.Class<?> wildcardClass48 = hashMap43.getClass();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        boolean boolean51 = hashMap49.isEmpty();
        java.lang.Object obj52 = hashMap39.put((java.lang.Object) hashMap43, (java.lang.Object) hashMap49);
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap57.clear();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        java.lang.Object obj62 = hashMap57.remove((java.lang.Object) entryArray61);
        hashMap54.table = entryArray61;
        hashMap0.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 1L, obj7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        hashMap14.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        hashMap14.table = entryArray21;
        hashMap14.clear();
        java.lang.Object obj25 = hashMap10.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap14.table;
        hashMap0.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) 1L, obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap0.table = entryArray8;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) entryArray6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        hashMap11.modCount = 0;
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap11.table = entryArray20;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 100);
        int int25 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        hashMap5.modCount = 0;
        int int8 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap5.table = entryArray14;
        java.lang.Object obj16 = hashMap1.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap19.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap22.table;
        java.lang.Object obj24 = hashMap19.remove((java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        hashMap28.modCount = 0;
        int int31 = hashMap28.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        hashMap32.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap32.table;
        hashMap28.table = entryArray37;
        java.lang.Object obj39 = hashMap19.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray37);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj42 = hashMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap1.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        hashMap7.table = entryArray14;
        hashMap7.clear();
        java.lang.Object obj18 = hashMap3.remove((java.lang.Object) hashMap7);
        hashMap3.clear();
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap3);
        int int21 = hashMap1.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        hashMap24.table = entryArray27;
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap31.table;
        hashMap24.table = entryArray35;
        hashMap1.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap6.table = entryArray9;
        java.lang.Class<?> wildcardClass11 = hashMap6.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap12);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        hashMap9.modCount = 0;
        int int12 = hashMap9.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap9.table = entryArray18;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) hashMap24);
        hashMap21.modCount = 'a';
        system.testclass.HashMap.Entry[] entryArray29 = hashMap21.table;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) (short) 0, (java.lang.Object) "hi!");
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean9 = hashMap8.isEmpty();
        hashMap8.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        int int23 = hashMap19.modCount;
        java.lang.Object obj24 = hashMap13.put((java.lang.Object) 10L, (java.lang.Object) int23);
        hashMap13.clear();
        java.lang.Class<?> wildcardClass26 = hashMap13.getClass();
        java.lang.Object obj27 = hashMap8.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 100);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap8.get((java.lang.Object) entryArray32);
        hashMap1.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) entryArray6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        hashMap11.modCount = 0;
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap11.table = entryArray20;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray20);
        hashMap2.modCount = (short) 10;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        hashMap25.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        hashMap25.table = entryArray32;
        hashMap2.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = (byte) 10;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        int int16 = hashMap13.size();
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap7.put((java.lang.Object) 10L, (java.lang.Object) int17);
        hashMap7.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.clear();
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        boolean boolean29 = hashMap25.isEmpty();
        int int30 = hashMap25.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap.Entry entry34 = null;
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] { entry34 };
        hashMap33.table = entryArray35;
        java.lang.Object obj37 = hashMap25.get((java.lang.Object) entryArray35);
        hashMap20.table = entryArray35;
        hashMap20.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = 100;
        int int7 = hashMap0.size();
        boolean boolean8 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 100;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap11.table;
        int int16 = hashMap11.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0);
        java.lang.Object obj20 = hashMap18.get((java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        hashMap31.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap31.table;
        hashMap28.table = entryArray36;
        hashMap27.table = entryArray36;
        hashMap21.table = entryArray36;
        hashMap18.table = entryArray36;
        java.lang.Object obj41 = hashMap11.remove((java.lang.Object) hashMap18);
        java.lang.Object obj42 = hashMap0.remove(obj41);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        hashMap5.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        java.lang.Object obj18 = hashMap5.put((java.lang.Object) entryArray12, (java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap5);
        boolean boolean20 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj24 = hashMap22.get((java.lang.Object) 100.0d);
        int int25 = hashMap22.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj28 = hashMap22.remove((java.lang.Object) hashMap27);
        int int29 = hashMap27.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) hashMap37);
        hashMap34.modCount = 'a';
        java.lang.Object obj42 = hashMap30.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap46.table;
        hashMap43.table = entryArray49;
        hashMap30.table = entryArray49;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) (short) 100);
        java.lang.Object obj56 = hashMap53.remove((java.lang.Object) hashMap55);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj61 = hashMap58.put((java.lang.Object) '4', (java.lang.Object) 10);
        hashMap58.clear();
        hashMap58.modCount = 100;
        hashMap58.clear();
        hashMap58.clear();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap58.table;
        hashMap53.table = entryArray67;
        java.lang.Object obj69 = hashMap27.put((java.lang.Object) entryArray49, (java.lang.Object) hashMap53);
        hashMap5.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }
}

