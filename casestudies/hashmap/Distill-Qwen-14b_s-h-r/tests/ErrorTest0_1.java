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
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap2.table;
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
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap10);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 100);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = 100;
        system.testclass.HashMap.Entry[] entryArray7 = null;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        boolean boolean10 = hashMap4.isEmpty();
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) boolean10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        hashMap12.table = entryArray28;
        hashMap2.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = 0;
        hashMap0.clear();
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 1);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap13.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) entryArray25);
        hashMap13.table = entryArray25;
        hashMap9.table = entryArray25;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(100, 100.0f);
        java.lang.Object obj32 = hashMap6.put((java.lang.Object) entryArray25, (java.lang.Object) 100.0f);
        hashMap0.table = entryArray25;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int12 = hashMap11.size();
        boolean boolean13 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        java.lang.Object obj16 = hashMap7.put((java.lang.Object) boolean13, (java.lang.Object) hashMap15);
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap15.table = entryArray18;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap7.table = entryArray16;
        hashMap3.table = entryArray16;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap22.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.modCount = ' ';
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) hashMap31);
        int int36 = hashMap30.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        boolean boolean43 = hashMap37.isEmpty();
        java.lang.Object obj45 = hashMap30.put((java.lang.Object) boolean43, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        hashMap48.modCount = ' ';
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        hashMap57.clear();
        hashMap57.clear();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap57.table;
        hashMap53.table = entryArray62;
        hashMap47.table = entryArray62;
        hashMap30.table = entryArray62;
        hashMap22.table = entryArray62;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        hashMap69.modCount = ' ';
        java.lang.Object obj73 = hashMap68.get((java.lang.Object) hashMap69);
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        int int75 = hashMap74.modCount;
        int int76 = hashMap74.modCount;
        system.testclass.HashMap.Entry[] entryArray77 = hashMap74.table;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        int int79 = hashMap78.modCount;
        int int80 = hashMap78.modCount;
        hashMap78.clear();
        hashMap78.clear();
        system.testclass.HashMap.Entry[] entryArray83 = hashMap78.table;
        hashMap74.table = entryArray83;
        hashMap68.table = entryArray83;
        java.lang.Object obj86 = hashMap22.get((java.lang.Object) hashMap68);
        java.lang.Object obj87 = hashMap3.put((java.lang.Object) 10L, obj86);
        system.testclass.HashMap.Entry[] entryArray88 = hashMap3.table;
        hashMap2.table = entryArray88;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        hashMap1.modCount = (short) 0;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap9.clear();
        hashMap9.modCount = 0;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap9.table = entryArray23;
        hashMap7.table = entryArray23;
        hashMap1.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap9.table = entryArray18;
        hashMap5.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        java.lang.Object obj24 = hashMap5.remove((java.lang.Object) hashMap21);
        boolean boolean25 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        hashMap28.modCount = ' ';
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) hashMap28);
        int int33 = hashMap27.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        hashMap34.clear();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap34.table;
        boolean boolean40 = hashMap34.isEmpty();
        java.lang.Object obj42 = hashMap27.put((java.lang.Object) boolean40, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        hashMap45.modCount = ' ';
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        hashMap54.clear();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap54.table;
        hashMap50.table = entryArray59;
        hashMap44.table = entryArray59;
        hashMap27.table = entryArray59;
        hashMap5.table = entryArray59;
        hashMap2.table = entryArray59;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = ' ';
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap7.table = entryArray16;
        hashMap1.table = entryArray16;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.clear();
        java.lang.Object obj24 = hashMap1.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap27.get((java.lang.Object) int30);
        java.lang.Object obj32 = hashMap19.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        java.lang.Object obj37 = hashMap33.get((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap39.table;
        int int41 = hashMap39.size();
        java.lang.Object obj42 = hashMap33.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        hashMap45.modCount = ' ';
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        hashMap54.clear();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap54.table;
        hashMap50.table = entryArray59;
        hashMap44.table = entryArray59;
        java.lang.Object obj62 = hashMap33.remove((java.lang.Object) entryArray59);
        java.lang.Object obj63 = hashMap27.remove(obj62);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean67 = hashMap66.isEmpty();
        system.testclass.HashMap.Entry[] entryArray68 = hashMap66.table;
        hashMap27.table = entryArray68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap27", hashMap27.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap10);
        hashMap2.modCount = (short) 100;
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) int5);
        hashMap2.modCount = (short) 100;
        boolean boolean9 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        boolean boolean16 = hashMap10.isEmpty();
        boolean boolean17 = hashMap10.isEmpty();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap10.table;
        hashMap2.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        boolean boolean18 = hashMap12.isEmpty();
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) boolean18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        boolean boolean21 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        hashMap22.clear();
        hashMap22.modCount = 0;
        int int31 = hashMap22.size();
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) hashMap22);
        system.testclass.HashMap.Entry[] entryArray33 = null;
        hashMap0.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap5.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        hashMap14.modCount = ' ';
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) hashMap14);
        int int19 = hashMap13.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.clear();
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap20.table;
        boolean boolean26 = hashMap20.isEmpty();
        java.lang.Object obj28 = hashMap13.put((java.lang.Object) boolean26, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.modCount = ' ';
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        hashMap40.clear();
        system.testclass.HashMap.Entry[] entryArray45 = hashMap40.table;
        hashMap36.table = entryArray45;
        hashMap30.table = entryArray45;
        hashMap13.table = entryArray45;
        hashMap5.table = entryArray45;
        java.lang.Object obj50 = hashMap2.get((java.lang.Object) hashMap5);
        hashMap2.modCount = (byte) 1;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        hashMap53.clear();
        hashMap53.clear();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap53.table;
        hashMap53.clear();
        hashMap53.modCount = 0;
        java.lang.Object obj63 = hashMap53.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap64.table;
        hashMap53.table = entryArray67;
        int int69 = hashMap53.modCount;
        int int70 = hashMap53.size();
        boolean boolean71 = hashMap53.isEmpty();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap53.table;
        hashMap2.table = entryArray72;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) int5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        int int9 = hashMap8.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap10.clear();
        hashMap10.modCount = 0;
        java.lang.Object obj20 = hashMap10.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap10.table = entryArray24;
        hashMap8.table = entryArray24;
        hashMap2.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = ' ';
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        hashMap10.modCount = ' ';
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap15.table = entryArray24;
        hashMap9.table = entryArray24;
        hashMap2.table = entryArray24;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(100);
        java.lang.Object obj30 = hashMap2.get((java.lang.Object) hashMap29);
        hashMap29.modCount = (byte) 1;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap33.table;
        hashMap33.clear();
        hashMap33.modCount = 0;
        java.lang.Object obj43 = hashMap33.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        hashMap33.table = entryArray47;
        int int49 = hashMap33.modCount;
        int int50 = hashMap33.size();
        boolean boolean51 = hashMap33.isEmpty();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap33.table;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        int int57 = hashMap53.size();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = hashMap60.get(obj61);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        hashMap60.table = entryArray66;
        hashMap53.table = entryArray66;
        java.lang.Object obj69 = hashMap33.remove((java.lang.Object) entryArray66);
        hashMap29.table = entryArray66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap29", hashMap29.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap4.clear();
        hashMap4.modCount = 0;
        java.lang.Object obj14 = hashMap4.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap4.table = entryArray18;
        int int20 = hashMap4.modCount;
        int int21 = hashMap4.size();
        boolean boolean22 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap4.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        int int28 = hashMap24.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap31.get(obj32);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap31.table = entryArray37;
        hashMap24.table = entryArray37;
        java.lang.Object obj40 = hashMap4.remove((java.lang.Object) entryArray37);
        hashMap2.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) hashMap6);
        int int9 = hashMap2.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        int int23 = hashMap20.size();
        hashMap20.clear();
        hashMap20.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        int int32 = hashMap29.size();
        hashMap29.clear();
        hashMap29.clear();
        hashMap29.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap26.put((java.lang.Object) hashMap29, obj36);
        java.lang.Object obj38 = hashMap2.put((java.lang.Object) hashMap20, obj36);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) 100.0f);
        hashMap39.clear();
        hashMap39.modCount = 100;
        java.lang.Object obj47 = hashMap20.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray48 = null;
        hashMap20.table = entryArray48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        hashMap1.modCount = 97;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap5.clear();
        hashMap5.modCount = 0;
        java.lang.Object obj15 = hashMap5.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap5.table = entryArray19;
        int int21 = hashMap5.modCount;
        int int22 = hashMap5.size();
        boolean boolean23 = hashMap5.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap5.table;
        hashMap1.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        int int6 = hashMap3.size();
        hashMap3.clear();
        hashMap3.clear();
        hashMap3.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) hashMap3, obj10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = hashMap12.put((java.lang.Object) '#', (java.lang.Object) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        java.lang.Object obj24 = hashMap12.put((java.lang.Object) true, (java.lang.Object) hashMap22);
        hashMap22.modCount = (byte) 1;
        java.lang.Object obj28 = hashMap22.remove((java.lang.Object) true);
        int int29 = hashMap22.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0, (float) 10L);
        hashMap32.clear();
        hashMap32.clear();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) (byte) 0);
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        hashMap0.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int12 = hashMap11.size();
        hashMap11.modCount = 2;
        int int15 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = ' ';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(1);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        hashMap9.clear();
        boolean boolean11 = hashMap9.isEmpty();
        boolean boolean12 = hashMap9.isEmpty();
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap.Entry[] entryArray14 = null;
        hashMap9.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        hashMap9.modCount = ' ';
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) hashMap9);
        int int14 = hashMap8.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        boolean boolean21 = hashMap15.isEmpty();
        java.lang.Object obj23 = hashMap8.put((java.lang.Object) boolean21, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        hashMap26.modCount = ' ';
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        hashMap35.clear();
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap35.table;
        hashMap31.table = entryArray40;
        hashMap25.table = entryArray40;
        hashMap8.table = entryArray40;
        hashMap0.table = entryArray40;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        hashMap47.clear();
        java.lang.Class<?> wildcardClass52 = hashMap47.getClass();
        java.lang.Object obj53 = hashMap46.remove((java.lang.Object) wildcardClass52);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        java.lang.Object obj57 = hashMap46.get((java.lang.Object) entryArray56);
        hashMap0.table = entryArray56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap12.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap20.remove((java.lang.Object) entryArray24);
        hashMap12.table = entryArray24;
        hashMap8.table = entryArray24;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(100, 100.0f);
        java.lang.Object obj31 = hashMap5.put((java.lang.Object) entryArray24, (java.lang.Object) 100.0f);
        hashMap2.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray5 = null;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap3.table = entryArray12;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10, (float) 'a');
        hashMap6.modCount = '#';
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) '#');
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        hashMap12.modCount = ' ';
        java.lang.Object obj16 = hashMap11.get((java.lang.Object) hashMap12);
        hashMap12.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        hashMap20.modCount = ' ';
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap29.table;
        hashMap25.table = entryArray34;
        hashMap19.table = entryArray34;
        hashMap12.table = entryArray34;
        boolean boolean38 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        hashMap44.clear();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        hashMap48.clear();
        hashMap48.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap48.table;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap48.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        java.lang.Object obj61 = hashMap56.remove((java.lang.Object) entryArray60);
        hashMap48.table = entryArray60;
        hashMap44.table = entryArray60;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap(100, 100.0f);
        java.lang.Object obj67 = hashMap41.put((java.lang.Object) entryArray60, (java.lang.Object) 100.0f);
        java.lang.Object obj68 = hashMap12.remove((java.lang.Object) entryArray60);
        hashMap3.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0, (float) (byte) 1);
        java.lang.Class<?> wildcardClass6 = hashMap5.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.clear();
        java.lang.Class<?> wildcardClass18 = hashMap13.getClass();
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) wildcardClass18);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) entryArray22);
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int5 = hashMap4.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        hashMap6.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj13 = hashMap4.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap12);
        int int14 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        boolean boolean22 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        hashMap23.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap23.table;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap23.table;
        hashMap19.table = entryArray29;
        java.lang.Object obj31 = hashMap12.put((java.lang.Object) hashMap17, (java.lang.Object) entryArray29);
        hashMap1.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap8.table;
        hashMap4.table = entryArray13;
        hashMap0.table = entryArray13;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap16);
        boolean boolean20 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap0.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        hashMap24.modCount = ' ';
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap33.table;
        hashMap29.table = entryArray38;
        hashMap23.table = entryArray38;
        java.lang.Object obj41 = hashMap0.get((java.lang.Object) hashMap23);
        int int42 = hashMap23.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0, (float) 10L);
        hashMap45.clear();
        boolean boolean47 = hashMap45.isEmpty();
        java.lang.Object obj48 = hashMap23.remove((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        hashMap49.clear();
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap49.table;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap49.table;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        hashMap58.modCount = ' ';
        java.lang.Object obj62 = hashMap57.get((java.lang.Object) hashMap58);
        int int63 = hashMap57.modCount;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        hashMap64.clear();
        hashMap64.clear();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap64.table;
        boolean boolean70 = hashMap64.isEmpty();
        java.lang.Object obj72 = hashMap57.put((java.lang.Object) boolean70, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        boolean boolean76 = hashMap75.isEmpty();
        hashMap75.modCount = ' ';
        java.lang.Object obj79 = hashMap74.get((java.lang.Object) hashMap75);
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        int int81 = hashMap80.modCount;
        int int82 = hashMap80.modCount;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap80.table;
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap();
        int int85 = hashMap84.modCount;
        int int86 = hashMap84.modCount;
        hashMap84.clear();
        hashMap84.clear();
        system.testclass.HashMap.Entry[] entryArray89 = hashMap84.table;
        hashMap80.table = entryArray89;
        hashMap74.table = entryArray89;
        hashMap57.table = entryArray89;
        hashMap49.table = entryArray89;
        hashMap45.table = entryArray89;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap45", hashMap45.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        boolean boolean10 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) hashMap6);
        int int9 = hashMap2.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        boolean boolean23 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap24.table = entryArray33;
        hashMap20.table = entryArray33;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        hashMap36.clear();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap36.table;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap36.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        java.lang.Object obj49 = hashMap44.remove((java.lang.Object) entryArray48);
        hashMap36.table = entryArray48;
        java.lang.Object obj51 = hashMap20.remove((java.lang.Object) hashMap36);
        boolean boolean52 = hashMap20.isEmpty();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap20.table;
        hashMap12.table = entryArray53;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap10);
        int int12 = hashMap2.size();
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap16.get(obj17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap16.table = entryArray22;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = ' ';
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap2);
        int int7 = hashMap1.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap8.table;
        boolean boolean14 = hashMap8.isEmpty();
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) boolean14, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        hashMap19.modCount = ' ';
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap24.table = entryArray33;
        hashMap18.table = entryArray33;
        hashMap1.table = entryArray33;
        boolean boolean37 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        java.lang.Object obj41 = hashMap1.get((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0);
        int int44 = hashMap43.modCount;
        java.lang.Object obj46 = hashMap43.remove((java.lang.Object) (byte) 100);
        int int47 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap43.table;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) entryArray50);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap43.table;
        hashMap1.table = entryArray52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) hashMap6);
        int int9 = hashMap2.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        int int23 = hashMap20.size();
        hashMap20.clear();
        hashMap20.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        int int32 = hashMap29.size();
        hashMap29.clear();
        hashMap29.clear();
        hashMap29.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap26.put((java.lang.Object) hashMap29, obj36);
        java.lang.Object obj38 = hashMap2.put((java.lang.Object) hashMap20, obj36);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) 100.0f);
        hashMap39.clear();
        hashMap39.modCount = 100;
        java.lang.Object obj47 = hashMap20.get((java.lang.Object) 100);
        boolean boolean48 = hashMap20.isEmpty();
        hashMap20.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.isEmpty();
        int int8 = hashMap0.size();
        int int9 = hashMap0.modCount;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        boolean boolean10 = hashMap4.isEmpty();
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) boolean10);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

