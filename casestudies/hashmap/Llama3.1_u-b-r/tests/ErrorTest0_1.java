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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) entryArray10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) entryArray10, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) '#');
        hashMap4.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) entryArray12);
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 10;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) entryArray18);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) entryArray18);
        hashMap4.table = entryArray18;
        hashMap0.table = entryArray18;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.modCount = '4';
        java.lang.Object obj32 = hashMap23.remove((java.lang.Object) hashMap27);
        hashMap27.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        hashMap34.modCount = 100;
        java.lang.Object obj39 = hashMap27.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0, (float) 10L);
        int int43 = hashMap42.size();
        int int44 = hashMap42.modCount;
        int int45 = hashMap42.modCount;
        java.lang.Class<?> wildcardClass46 = hashMap42.getClass();
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap34, (java.lang.Object) wildcardClass46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        boolean boolean12 = hashMap4.isEmpty();
        hashMap4.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        hashMap4.modCount = (byte) 10;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (byte) 10, (java.lang.Object) 0.0f);
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
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj9 = hashMap0.put(obj7, (java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap10);
        hashMap10.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        hashMap17.modCount = 100;
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap17);
        int int23 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        hashMap0.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.modCount;
        java.lang.Object obj31 = hashMap0.get((java.lang.Object) int30);
        system.testclass.HashMap.Entry[] entryArray32 = null;
        hashMap0.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap14);
        java.lang.Class<?> wildcardClass17 = hashMap9.getClass();
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) entryArray18);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) entryArray18);
        hashMap4.table = entryArray18;
        hashMap0.table = entryArray18;
        boolean boolean23 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = hashMap24.remove(obj28);
        hashMap24.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray32 = hashMap24.table;
        hashMap24.modCount = 52;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        boolean boolean39 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) entryArray49);
        java.lang.Object obj51 = hashMap40.get((java.lang.Object) entryArray49);
        hashMap35.table = entryArray49;
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) 52, (java.lang.Object) entryArray49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) entryArray21);
        hashMap7.table = entryArray21;
        hashMap3.table = entryArray21;
        boolean boolean26 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap3.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) entryArray45);
        int int48 = hashMap36.modCount;
        java.lang.Object obj49 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) int48);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        int int53 = hashMap50.size();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        boolean boolean58 = hashMap54.isEmpty();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        int int61 = hashMap59.size();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap65.table;
        java.lang.Object obj69 = hashMap64.get((java.lang.Object) entryArray68);
        java.lang.Object obj70 = hashMap59.get((java.lang.Object) entryArray68);
        hashMap54.table = entryArray68;
        hashMap50.table = entryArray68;
        boolean boolean73 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        java.lang.Object obj81 = hashMap76.get((java.lang.Object) entryArray80);
        java.lang.Object obj82 = hashMap50.remove((java.lang.Object) hashMap76);
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap();
        int int84 = hashMap83.modCount;
        int int85 = hashMap83.modCount;
        hashMap83.clear();
        java.lang.Object obj87 = null;
        java.lang.Object obj88 = hashMap83.remove(obj87);
        hashMap83.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray91 = hashMap83.table;
        hashMap76.table = entryArray91;
        hashMap2.table = entryArray91;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) entryArray11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) entryArray19);
        int int21 = hashMap15.size();
        int int22 = hashMap15.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        boolean boolean25 = hashMap23.isEmpty();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        int int27 = hashMap23.size();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) entryArray18);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) entryArray18);
        hashMap4.table = entryArray18;
        hashMap0.table = entryArray18;
        boolean boolean23 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap26.get((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap0.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.modCount = '4';
        java.lang.Object obj42 = hashMap33.remove((java.lang.Object) hashMap37);
        java.lang.Object obj44 = hashMap37.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        hashMap49.modCount = '4';
        java.lang.Object obj54 = hashMap45.remove((java.lang.Object) hashMap49);
        hashMap49.clear();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        hashMap56.modCount = 0;
        hashMap56.modCount = 100;
        java.lang.Object obj61 = hashMap49.remove((java.lang.Object) hashMap56);
        int int62 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap49.table;
        hashMap37.table = entryArray63;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        hashMap65.clear();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        int int71 = hashMap69.size();
        hashMap69.modCount = '4';
        java.lang.Object obj74 = hashMap65.remove((java.lang.Object) hashMap69);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj78 = hashMap69.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        boolean boolean80 = hashMap79.isEmpty();
        int int81 = hashMap79.size();
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        int int86 = hashMap85.modCount;
        int int87 = hashMap85.modCount;
        system.testclass.HashMap.Entry[] entryArray88 = hashMap85.table;
        java.lang.Object obj89 = hashMap84.get((java.lang.Object) entryArray88);
        java.lang.Object obj90 = hashMap79.get((java.lang.Object) entryArray88);
        java.lang.Object obj91 = hashMap69.remove((java.lang.Object) hashMap79);
        java.lang.Object obj92 = hashMap26.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap79);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap26", hashMap26.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) entryArray11);
        int int13 = hashMap7.size();
        int int14 = hashMap7.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.modCount = '4';
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) hashMap19);
        hashMap19.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        hashMap26.modCount = 100;
        java.lang.Object obj31 = hashMap19.remove((java.lang.Object) hashMap26);
        int int32 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap19.table;
        hashMap7.table = entryArray33;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(0, (float) 10L);
        int int38 = hashMap37.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        boolean boolean44 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        java.lang.Object obj55 = hashMap50.get((java.lang.Object) entryArray54);
        java.lang.Object obj56 = hashMap45.get((java.lang.Object) entryArray54);
        hashMap42.table = entryArray54;
        hashMap40.table = entryArray54;
        hashMap37.table = entryArray54;
        java.lang.Object obj60 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) entryArray21);
        hashMap7.table = entryArray21;
        hashMap3.table = entryArray21;
        boolean boolean26 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap3.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) entryArray45);
        int int48 = hashMap36.modCount;
        java.lang.Object obj49 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) int48);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(10);
        boolean boolean54 = hashMap53.isEmpty();
        system.testclass.HashMap.Entry[] entryArray55 = new system.testclass.HashMap.Entry[] {};
        hashMap53.table = entryArray55;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.isEmpty();
        int int59 = hashMap57.size();
        java.lang.Object obj60 = hashMap51.put((java.lang.Object) entryArray55, (java.lang.Object) hashMap57);
        java.lang.Object obj61 = hashMap2.remove(obj60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) entryArray25);
        java.lang.Object obj27 = hashMap16.get((java.lang.Object) entryArray25);
        hashMap13.table = entryArray25;
        hashMap11.table = entryArray25;
        hashMap0.table = entryArray25;
        boolean boolean31 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        hashMap13.modCount = 100;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap18.clear();
        hashMap18.modCount = 'a';
        java.lang.Object obj25 = hashMap13.get((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        boolean boolean30 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) entryArray40);
        java.lang.Object obj42 = hashMap31.get((java.lang.Object) entryArray40);
        hashMap26.table = entryArray40;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap(0, (float) 10L);
        int int47 = hashMap46.size();
        java.lang.Object obj48 = hashMap26.remove((java.lang.Object) hashMap46);
        java.lang.Object obj49 = hashMap18.remove((java.lang.Object) hashMap46);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap0.put(obj49, obj50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) (-1.0d));
        boolean boolean17 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry entry23 = null;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] { entry23 };
        hashMap20.table = entryArray24;
        hashMap9.table = entryArray24;
        hashMap0.table = entryArray24;
        hashMap0.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0, (float) 10L);
        int int32 = hashMap31.size();
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.modCount = '4';
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap42.table;
        hashMap35.table = entryArray46;
        java.lang.Object obj48 = hashMap0.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.modCount = '#';
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap20.table = entryArray27;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(1);
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(10);
        boolean boolean9 = hashMap8.isEmpty();
        hashMap8.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.modCount = '4';
        java.lang.Object obj20 = hashMap11.remove((java.lang.Object) hashMap15);
        hashMap15.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        hashMap22.modCount = 100;
        java.lang.Object obj27 = hashMap15.remove((java.lang.Object) hashMap22);
        hashMap22.modCount = (short) 0;
        hashMap22.modCount = '4';
        java.lang.Object obj32 = hashMap2.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) (-1.0d));
        boolean boolean18 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        int int22 = hashMap21.size();
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry entry24 = null;
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] { entry24 };
        hashMap21.table = entryArray25;
        hashMap10.table = entryArray25;
        java.lang.Object obj28 = hashMap0.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) entryArray41);
        java.lang.Object obj43 = hashMap32.get((java.lang.Object) entryArray41);
        hashMap29.table = entryArray41;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        hashMap49.modCount = '4';
        java.lang.Object obj54 = hashMap45.remove((java.lang.Object) hashMap49);
        hashMap49.clear();
        java.lang.Object obj56 = hashMap29.remove((java.lang.Object) hashMap49);
        java.lang.Object obj57 = hashMap0.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        hashMap58.clear();
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = hashMap58.remove(obj62);
        hashMap58.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray66 = hashMap58.table;
        int int67 = hashMap58.size();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray70 = hashMap69.table;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        boolean boolean73 = hashMap71.isEmpty();
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        boolean boolean75 = hashMap74.isEmpty();
        int int76 = hashMap74.size();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        int int81 = hashMap80.modCount;
        int int82 = hashMap80.modCount;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap80.table;
        java.lang.Object obj84 = hashMap79.get((java.lang.Object) entryArray83);
        java.lang.Object obj85 = hashMap74.get((java.lang.Object) entryArray83);
        hashMap71.table = entryArray83;
        hashMap69.table = entryArray83;
        hashMap58.table = entryArray83;
        java.lang.Object obj89 = null;
        java.lang.Object obj90 = hashMap0.put((java.lang.Object) hashMap58, obj89);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) 10L);
        int int5 = hashMap4.size();
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap1.table = entryArray7;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) entryArray27);
        hashMap9.table = entryArray27;
        hashMap0.table = entryArray27;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        boolean boolean33 = hashMap31.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) entryArray43);
        java.lang.Object obj45 = hashMap34.get((java.lang.Object) entryArray43);
        hashMap31.table = entryArray43;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap(0, (float) (byte) 100);
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) hashMap31, (java.lang.Object) 0);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0, (float) 10L);
        int int56 = hashMap55.size();
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        hashMap52.table = entryArray58;
        hashMap0.table = entryArray58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.modCount = '4';
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap8);
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) (-1.0d));
        int int16 = hashMap8.size();
        boolean boolean17 = hashMap8.isEmpty();
        hashMap8.clear();
        int int19 = hashMap8.size();
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) 100, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap4.get((java.lang.Object) boolean17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.remove(obj23);
        hashMap19.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray27 = hashMap19.table;
        java.lang.Object obj28 = hashMap4.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        hashMap29.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        boolean boolean38 = hashMap34.isEmpty();
        boolean boolean39 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.modCount = '4';
        java.lang.Object obj49 = hashMap40.remove((java.lang.Object) hashMap44);
        hashMap44.clear();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.modCount = 0;
        hashMap51.modCount = 100;
        java.lang.Object obj56 = hashMap44.remove((java.lang.Object) hashMap51);
        int int57 = hashMap44.size();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap44.table;
        hashMap34.table = entryArray58;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean63 = hashMap62.isEmpty();
        int int64 = hashMap62.modCount;
        java.lang.Object obj65 = hashMap34.get((java.lang.Object) int64);
        java.lang.Object obj66 = hashMap19.put((java.lang.Object) hashMap29, (java.lang.Object) int64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap19", hashMap19.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(10);
        boolean boolean4 = hashMap3.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) entryArray5, (java.lang.Object) hashMap7);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (short) 10, obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 100);
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) (byte) 100, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) (-1.0d));
        boolean boolean17 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry entry23 = null;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] { entry23 };
        hashMap20.table = entryArray24;
        hashMap9.table = entryArray24;
        hashMap0.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap35.table;
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap35.table;
        hashMap31.table = entryArray42;
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap28, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        int int16 = hashMap13.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) entryArray29);
        java.lang.Object obj31 = hashMap20.get((java.lang.Object) entryArray29);
        hashMap17.table = entryArray29;
        java.lang.Object obj33 = hashMap13.remove((java.lang.Object) entryArray29);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        boolean boolean36 = hashMap34.isEmpty();
        java.lang.Object obj38 = hashMap34.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        hashMap39.clear();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        hashMap43.modCount = '4';
        java.lang.Object obj48 = hashMap39.remove((java.lang.Object) hashMap43);
        java.lang.Object obj50 = hashMap43.remove((java.lang.Object) (-1.0d));
        boolean boolean51 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(0, (float) 10L);
        int int55 = hashMap54.size();
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry entry57 = null;
        system.testclass.HashMap.Entry[] entryArray58 = new system.testclass.HashMap.Entry[] { entry57 };
        hashMap54.table = entryArray58;
        hashMap43.table = entryArray58;
        hashMap34.table = entryArray58;
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap34.table;
        java.lang.Object obj64 = hashMap0.put((java.lang.Object) entryArray29, (java.lang.Object) entryArray63);
        hashMap0.modCount = 52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.modCount = ' ';
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap9.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.modCount = '4';
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) hashMap19);
        java.lang.Object obj26 = hashMap19.remove((java.lang.Object) (-1.0d));
        boolean boolean27 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        int int31 = hashMap30.size();
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap30.table = entryArray34;
        hashMap19.table = entryArray34;
        java.lang.Object obj37 = hashMap9.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        boolean boolean40 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) entryArray50);
        java.lang.Object obj52 = hashMap41.get((java.lang.Object) entryArray50);
        hashMap38.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        int int60 = hashMap58.size();
        hashMap58.modCount = '4';
        java.lang.Object obj63 = hashMap54.remove((java.lang.Object) hashMap58);
        hashMap58.clear();
        java.lang.Object obj65 = hashMap38.remove((java.lang.Object) hashMap58);
        java.lang.Object obj66 = hashMap9.get((java.lang.Object) hashMap38);
        int int67 = hashMap9.modCount;
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap(0, (float) 10L);
        int int73 = hashMap72.size();
        int int74 = hashMap72.modCount;
        system.testclass.HashMap.Entry[] entryArray75 = hashMap72.table;
        hashMap69.table = entryArray75;
        hashMap69.modCount = (short) 100;
        hashMap69.modCount = 1;
        java.lang.Object obj81 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.modCount = '4';
        java.lang.Object obj12 = hashMap3.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) 0);
        java.lang.Object obj18 = hashMap7.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) boolean20);
        java.lang.Object obj22 = hashMap2.remove((java.lang.Object) boolean20);
        int int23 = hashMap2.size();
        int int24 = hashMap2.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.modCount = '4';
        java.lang.Object obj34 = hashMap25.remove((java.lang.Object) hashMap29);
        java.lang.Object obj35 = hashMap2.remove((java.lang.Object) hashMap29);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        hashMap4.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.modCount = '4';
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap22);
        java.lang.Object obj29 = hashMap22.remove((java.lang.Object) (-1.0d));
        boolean boolean30 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0, (float) 10L);
        int int34 = hashMap33.size();
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap33.table = entryArray37;
        hashMap22.table = entryArray37;
        hashMap13.table = entryArray37;
        hashMap13.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        int int45 = hashMap44.size();
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry entry47 = null;
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] { entry47 };
        hashMap44.table = entryArray48;
        java.lang.Object obj50 = hashMap13.remove((java.lang.Object) entryArray48);
        hashMap4.table = entryArray48;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        hashMap52.modCount = 100;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        hashMap57.clear();
        hashMap57.modCount = 'a';
        java.lang.Object obj64 = hashMap52.get((java.lang.Object) hashMap57);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        hashMap65.clear();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        int int71 = hashMap69.size();
        hashMap69.modCount = '4';
        java.lang.Object obj74 = hashMap65.remove((java.lang.Object) hashMap69);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj78 = hashMap69.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        int int81 = hashMap79.modCount;
        hashMap79.clear();
        hashMap79.modCount = '#';
        hashMap79.modCount = 100;
        int int87 = hashMap79.modCount;
        hashMap79.clear();
        java.lang.Object obj89 = hashMap69.remove((java.lang.Object) hashMap79);
        java.lang.Object obj90 = hashMap4.put((java.lang.Object) hashMap57, obj89);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) entryArray16);
        java.lang.Object obj18 = hashMap7.get((java.lang.Object) entryArray16);
        hashMap4.table = entryArray16;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap0.table;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(10);
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap2.table;
        int int11 = hashMap2.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.remove(obj16);
        hashMap12.clear();
        hashMap12.clear();
        java.lang.Object obj20 = hashMap2.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        hashMap11.modCount = 100;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap11);
        hashMap11.modCount = (short) 0;
        hashMap11.modCount = '4';
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) entryArray35);
        java.lang.Object obj37 = hashMap26.get((java.lang.Object) entryArray35);
        hashMap21.table = entryArray35;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0, (float) 10L);
        int int42 = hashMap41.size();
        java.lang.Object obj43 = hashMap21.remove((java.lang.Object) hashMap41);
        hashMap41.modCount = 10;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        int int52 = hashMap50.size();
        hashMap50.modCount = '4';
        java.lang.Object obj55 = hashMap46.remove((java.lang.Object) hashMap50);
        java.lang.Object obj57 = hashMap50.remove((java.lang.Object) (-1.0d));
        int int58 = hashMap50.size();
        boolean boolean59 = hashMap50.isEmpty();
        hashMap50.clear();
        java.lang.Object obj61 = hashMap11.put((java.lang.Object) hashMap41, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap9.remove((java.lang.Object) hashMap19);
        java.lang.Object obj32 = hashMap0.get((java.lang.Object) hashMap19);
        java.lang.Object obj33 = null;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        hashMap34.clear();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(10);
        boolean boolean40 = hashMap39.isEmpty();
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap34.table;
        int int43 = hashMap34.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        hashMap44.clear();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap44.remove(obj48);
        hashMap44.clear();
        hashMap44.clear();
        java.lang.Object obj52 = hashMap34.remove((java.lang.Object) hashMap44);
        java.lang.Object obj53 = hashMap0.put(obj33, obj52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray14);
        hashMap0.table = entryArray14;
        int int18 = hashMap0.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        int int22 = hashMap21.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        boolean boolean28 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) entryArray38);
        java.lang.Object obj40 = hashMap29.get((java.lang.Object) entryArray38);
        hashMap26.table = entryArray38;
        hashMap24.table = entryArray38;
        hashMap21.table = entryArray38;
        java.lang.Object obj44 = hashMap0.remove((java.lang.Object) hashMap21);
        int int45 = hashMap21.modCount;
        int int46 = hashMap21.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        hashMap47.clear();
        hashMap47.modCount = '#';
        hashMap47.modCount = 100;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(10, (float) 52);
        java.lang.Object obj58 = hashMap21.put((java.lang.Object) 100, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap21", hashMap21.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) entryArray12);
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.modCount = '4';
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) hashMap20);
        hashMap20.clear();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(10);
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap33);
        java.lang.Class<?> wildcardClass36 = hashMap28.getClass();
        java.lang.Object obj37 = hashMap0.remove((java.lang.Object) wildcardClass36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        int int45 = hashMap42.size();
        int int46 = hashMap42.modCount;
        java.lang.Object obj47 = hashMap38.get((java.lang.Object) int46);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        int int54 = hashMap51.size();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap51.table;
        hashMap48.table = entryArray55;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        int int60 = hashMap57.size();
        system.testclass.HashMap.Entry[] entryArray61 = new system.testclass.HashMap.Entry[] {};
        hashMap57.table = entryArray61;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        int int68 = hashMap65.size();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap65.table;
        hashMap65.clear();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap65.table;
        hashMap64.table = entryArray71;
        java.lang.Object obj73 = hashMap48.put((java.lang.Object) hashMap57, (java.lang.Object) hashMap64);
        java.lang.Object obj74 = hashMap0.put((java.lang.Object) int46, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) entryArray19);
        java.lang.Object obj21 = hashMap10.get((java.lang.Object) entryArray19);
        hashMap7.table = entryArray19;
        java.lang.Object obj23 = hashMap3.remove((java.lang.Object) entryArray19);
        int int24 = hashMap3.modCount;
        int int25 = hashMap3.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 0, (float) 'a');
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        java.lang.Object obj30 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap35.table;
        hashMap32.table = entryArray39;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        int int44 = hashMap41.size();
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] {};
        hashMap41.table = entryArray45;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        int int52 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap49.table;
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap49.table;
        hashMap48.table = entryArray55;
        java.lang.Object obj57 = hashMap32.put((java.lang.Object) hashMap41, (java.lang.Object) hashMap48);
        int int58 = hashMap48.size();
        java.lang.Object obj59 = hashMap3.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray14);
        hashMap0.table = entryArray14;
        hashMap0.modCount = 0;
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap22.remove(obj26);
        hashMap22.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray30 = hashMap22.table;
        boolean boolean31 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        hashMap36.modCount = '4';
        java.lang.Object obj41 = hashMap32.remove((java.lang.Object) hashMap36);
        hashMap36.clear();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        hashMap43.modCount = 100;
        java.lang.Object obj48 = hashMap36.remove((java.lang.Object) hashMap43);
        hashMap43.modCount = (short) 0;
        hashMap43.modCount = '4';
        hashMap43.clear();
        java.lang.Object obj54 = hashMap0.put((java.lang.Object) boolean31, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) entryArray16);
        java.lang.Object obj18 = hashMap7.get((java.lang.Object) entryArray16);
        hashMap4.table = entryArray16;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray16);
        int int21 = hashMap0.modCount;
        java.lang.Object obj23 = hashMap0.remove((java.lang.Object) (-1));
        system.testclass.HashMap.Entry[] entryArray24 = hashMap0.table;
        int int25 = hashMap0.size();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        int int32 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap29.table;
        hashMap26.table = entryArray33;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray39;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        int int46 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap43.clear();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap43.table;
        hashMap42.table = entryArray49;
        java.lang.Object obj51 = hashMap26.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap42);
        int int52 = hashMap42.size();
        int int53 = hashMap42.modCount;
        hashMap42.modCount = 0;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        int int62 = hashMap59.size();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap59.table;
        hashMap56.table = entryArray63;
        hashMap56.clear();
        java.lang.Object obj66 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) hashMap56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int16 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap18.table;
        java.lang.Object obj26 = hashMap15.remove((java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap4.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray2 = null;
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        boolean boolean13 = hashMap4.isEmpty();
        hashMap4.clear();
        boolean boolean15 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) entryArray22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.modCount = '4';
        java.lang.Object obj33 = hashMap24.remove((java.lang.Object) hashMap28);
        hashMap28.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        hashMap35.modCount = 100;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        java.lang.Object obj42 = hashMap4.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        java.lang.Object obj9 = hashMap5.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap14);
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) (-1.0d));
        boolean boolean22 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        int int26 = hashMap25.size();
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry entry28 = null;
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] { entry28 };
        hashMap25.table = entryArray29;
        hashMap14.table = entryArray29;
        hashMap5.table = entryArray29;
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap5.table;
        java.lang.Class<?> wildcardClass35 = entryArray34.getClass();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) entryArray34, obj36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10);
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        boolean boolean9 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10);
        hashMap12.modCount = '4';
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.modCount = '4';
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj31 = hashMap22.remove((java.lang.Object) 0);
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        java.lang.Object obj36 = hashMap22.get((java.lang.Object) boolean35);
        java.lang.Object obj37 = hashMap17.remove((java.lang.Object) boolean35);
        int int38 = hashMap17.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        boolean boolean43 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        java.lang.Object obj54 = hashMap49.get((java.lang.Object) entryArray53);
        java.lang.Object obj55 = hashMap44.get((java.lang.Object) entryArray53);
        hashMap39.table = entryArray53;
        hashMap17.table = entryArray53;
        java.lang.Object obj58 = hashMap0.put((java.lang.Object) '4', (java.lang.Object) entryArray53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray14);
        hashMap0.table = entryArray14;
        int int18 = hashMap0.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        int int22 = hashMap21.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        boolean boolean28 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) entryArray38);
        java.lang.Object obj40 = hashMap29.get((java.lang.Object) entryArray38);
        hashMap26.table = entryArray38;
        hashMap24.table = entryArray38;
        hashMap21.table = entryArray38;
        java.lang.Object obj44 = hashMap0.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.modCount = '4';
        java.lang.Object obj51 = hashMap45.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap52.table;
        hashMap45.table = entryArray56;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap58.table;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap58.table;
        java.lang.Object obj64 = hashMap58.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray65 = hashMap58.table;
        java.lang.Object obj67 = hashMap58.get((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        boolean boolean70 = hashMap68.isEmpty();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap68.table;
        hashMap58.table = entryArray71;
        java.lang.Object obj73 = hashMap0.put((java.lang.Object) entryArray56, (java.lang.Object) hashMap58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 1);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) entryArray13);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) entryArray13);
        int int16 = hashMap4.modCount;
        boolean boolean17 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (short) 1, (float) (byte) 10);
        hashMap20.modCount = (short) 1;
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) entryArray27);
        hashMap9.table = entryArray27;
        hashMap0.table = entryArray27;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        java.lang.Object obj38 = hashMap33.get((java.lang.Object) entryArray37);
        int int39 = hashMap33.size();
        int int40 = hashMap33.modCount;
        java.lang.Object obj41 = hashMap0.get((java.lang.Object) int40);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (short) 1, (float) (byte) 10);
        hashMap44.modCount = (short) 1;
        int int47 = hashMap44.size();
        boolean boolean48 = hashMap44.isEmpty();
        hashMap44.modCount = (short) 10;
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) hashMap44, obj51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap6.clear();
        hashMap6.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.modCount = '4';
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) hashMap17);
        hashMap17.clear();
        java.lang.Object obj24 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        boolean boolean27 = hashMap25.isEmpty();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        int int29 = hashMap25.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        int int33 = hashMap30.modCount;
        hashMap30.modCount = (short) 1;
        boolean boolean36 = hashMap30.isEmpty();
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        boolean boolean40 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) entryArray50);
        java.lang.Object obj52 = hashMap41.get((java.lang.Object) entryArray50);
        hashMap38.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        int int60 = hashMap58.size();
        hashMap58.modCount = '4';
        java.lang.Object obj63 = hashMap54.remove((java.lang.Object) hashMap58);
        hashMap58.clear();
        java.lang.Object obj65 = hashMap38.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap(0, (float) 10L);
        int int69 = hashMap68.size();
        int int70 = hashMap68.modCount;
        system.testclass.HashMap.Entry[] entryArray71 = hashMap68.table;
        java.lang.Object obj72 = hashMap38.remove((java.lang.Object) hashMap68);
        java.lang.Object obj73 = hashMap2.put((java.lang.Object) hashMap25, obj72);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.modCount = '4';
        java.lang.Object obj12 = hashMap3.remove((java.lang.Object) hashMap7);
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.modCount = '4';
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) hashMap19);
        hashMap19.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        hashMap26.modCount = 100;
        java.lang.Object obj31 = hashMap19.remove((java.lang.Object) hashMap26);
        int int32 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap19.table;
        hashMap7.table = entryArray33;
        java.lang.Object obj35 = hashMap1.remove((java.lang.Object) entryArray33);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(10);
        boolean boolean42 = hashMap41.isEmpty();
        java.lang.Object obj43 = hashMap36.remove((java.lang.Object) hashMap41);
        int int44 = hashMap41.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap(0, (float) 10);
        hashMap47.modCount = '4';
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        int int53 = hashMap52.size();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.isEmpty();
        boolean boolean59 = hashMap57.isEmpty();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        int int62 = hashMap60.size();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap66.table;
        java.lang.Object obj70 = hashMap65.get((java.lang.Object) entryArray69);
        java.lang.Object obj71 = hashMap60.get((java.lang.Object) entryArray69);
        hashMap57.table = entryArray69;
        hashMap55.table = entryArray69;
        hashMap52.table = entryArray69;
        hashMap47.table = entryArray69;
        hashMap41.table = entryArray69;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        int int79 = hashMap77.size();
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        int int81 = hashMap80.modCount;
        int int82 = hashMap80.modCount;
        int int83 = hashMap80.size();
        system.testclass.HashMap.Entry[] entryArray84 = hashMap80.table;
        hashMap77.table = entryArray84;
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        int int87 = hashMap86.modCount;
        int int88 = hashMap86.modCount;
        java.lang.Object obj89 = hashMap77.remove((java.lang.Object) hashMap86);
        java.lang.Object obj90 = hashMap1.put((java.lang.Object) entryArray69, (java.lang.Object) hashMap86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) entryArray21);
        hashMap7.table = entryArray21;
        hashMap3.table = entryArray21;
        boolean boolean26 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap3.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) entryArray45);
        int int48 = hashMap36.modCount;
        java.lang.Object obj49 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) int48);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        int int53 = hashMap52.size();
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        java.lang.Object obj56 = hashMap2.remove((java.lang.Object) hashMap52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) entryArray16);
        int int18 = hashMap12.size();
        int int19 = hashMap12.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) entryArray26);
        int int28 = hashMap22.size();
        int int29 = hashMap22.size();
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) int29);
        java.lang.Object obj31 = hashMap0.remove((java.lang.Object) hashMap12);
        hashMap0.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(0, (float) 10L);
        int int38 = hashMap37.size();
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        hashMap34.table = entryArray40;
        hashMap34.modCount = (short) 100;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap34.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap(0, (float) 10L);
        int int48 = hashMap47.size();
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.modCount;
        hashMap47.clear();
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) hashMap34, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.modCount = '#';
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        boolean boolean25 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        hashMap26.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.modCount = '4';
        java.lang.Object obj35 = hashMap26.remove((java.lang.Object) hashMap30);
        hashMap30.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        hashMap37.modCount = 100;
        java.lang.Object obj42 = hashMap30.remove((java.lang.Object) hashMap37);
        int int43 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap30.table;
        hashMap20.table = entryArray44;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        int int52 = hashMap50.size();
        hashMap50.modCount = '4';
        java.lang.Object obj55 = hashMap46.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj59 = hashMap50.remove((java.lang.Object) 0);
        java.lang.Object obj61 = hashMap50.get((java.lang.Object) '#');
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap50);
        int int63 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        hashMap2.modCount = 100;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int11 = hashMap10.modCount;
        hashMap10.clear();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        int int17 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap14.clear();
        hashMap14.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.modCount = '4';
        java.lang.Object obj30 = hashMap21.remove((java.lang.Object) hashMap25);
        hashMap25.clear();
        java.lang.Object obj32 = hashMap10.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap25);
        hashMap25.modCount = 10;
        int int35 = hashMap25.modCount;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) int35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) 10L);
        int int5 = hashMap4.size();
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap1.table = entryArray7;
        hashMap1.modCount = (short) 100;
        hashMap1.modCount = 1;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        int int16 = hashMap13.size();
        int int17 = hashMap13.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) ' ');
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) int17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) (-1.0d));
        boolean boolean17 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry entry23 = null;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] { entry23 };
        hashMap20.table = entryArray24;
        hashMap9.table = entryArray24;
        hashMap0.table = entryArray24;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10);
        hashMap30.modCount = '4';
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        int int36 = hashMap35.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        boolean boolean42 = hashMap40.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        java.lang.Object obj53 = hashMap48.get((java.lang.Object) entryArray52);
        java.lang.Object obj54 = hashMap43.get((java.lang.Object) entryArray52);
        hashMap40.table = entryArray52;
        hashMap38.table = entryArray52;
        hashMap35.table = entryArray52;
        hashMap30.table = entryArray52;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        hashMap59.clear();
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = hashMap59.remove(obj63);
        hashMap59.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray67 = hashMap59.table;
        int int68 = hashMap59.size();
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray71 = hashMap70.table;
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        boolean boolean73 = hashMap72.isEmpty();
        boolean boolean74 = hashMap72.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        boolean boolean76 = hashMap75.isEmpty();
        int int77 = hashMap75.size();
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        int int82 = hashMap81.modCount;
        int int83 = hashMap81.modCount;
        system.testclass.HashMap.Entry[] entryArray84 = hashMap81.table;
        java.lang.Object obj85 = hashMap80.get((java.lang.Object) entryArray84);
        java.lang.Object obj86 = hashMap75.get((java.lang.Object) entryArray84);
        hashMap72.table = entryArray84;
        hashMap70.table = entryArray84;
        hashMap59.table = entryArray84;
        java.lang.Object obj90 = hashMap0.put((java.lang.Object) hashMap30, (java.lang.Object) hashMap59);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(101, 100.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap4, obj10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

