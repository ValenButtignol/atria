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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        java.lang.Object obj6 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap7.remove(obj9);
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) hashMap12);
        int int18 = hashMap7.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap7.get((java.lang.Object) entryArray21);
        hashMap2.table = entryArray21;
        int int24 = hashMap2.size();
        java.lang.Class<?> wildcardClass25 = hashMap2.getClass();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap26);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
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
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) hashMap15);
        hashMap15.clear();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap15);
        boolean boolean20 = hashMap2.isEmpty();
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap8.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap33);
        hashMap33.clear();
        java.lang.Object obj37 = hashMap20.get((java.lang.Object) hashMap33);
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap33);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) entryArray9);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap4.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(2);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        hashMap6.modCount = 0;
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap6);
        java.lang.Object obj10 = hashMap1.remove(obj9);
        system.testclass.HashMap.Entry[] entryArray11 = null;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) '#');
        hashMap1.modCount = 2;
        hashMap1.clear();
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap5);
        int int11 = hashMap0.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) entryArray14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) hashMap22);
        hashMap21.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap16.table = entryArray29;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.clear();
        java.lang.Object obj40 = hashMap33.remove((java.lang.Object) hashMap38);
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap38);
        int int42 = hashMap16.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        hashMap45.modCount = 0;
        java.lang.Object obj48 = hashMap44.remove((java.lang.Object) hashMap45);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap44.table;
        hashMap16.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        hashMap3.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        hashMap10.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) entryArray18);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj28 = hashMap22.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        java.lang.Object obj37 = hashMap30.remove((java.lang.Object) hashMap35);
        hashMap35.clear();
        java.lang.Object obj39 = hashMap22.get((java.lang.Object) hashMap35);
        java.lang.Object obj40 = hashMap3.put((java.lang.Object) entryArray18, (java.lang.Object) hashMap35);
        hashMap1.table = entryArray18;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap1.table;
        java.lang.Object obj44 = hashMap1.get((java.lang.Object) (byte) -1);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) hashMap15);
        hashMap15.clear();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap15);
        hashMap15.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap15", hashMap15.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap4.table = entryArray15;
        java.lang.Class<?> wildcardClass17 = entryArray15.getClass();
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) wildcardClass17);
        int int19 = hashMap1.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap1.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap8.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap33);
        hashMap33.clear();
        java.lang.Object obj37 = hashMap20.get((java.lang.Object) hashMap33);
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap33);
        hashMap1.clear();
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (-1L));
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) (-1L));
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap9.table = entryArray15;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap9.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (-1L));
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) (-1L));
        hashMap1.modCount = (short) 100;
        system.testclass.HashMap.Entry[] entryArray10 = null;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj11 = hashMap7.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap12.remove(obj14);
        int int16 = hashMap12.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        boolean boolean21 = hashMap17.isEmpty();
        java.lang.Object obj22 = hashMap12.remove((java.lang.Object) hashMap17);
        int int23 = hashMap12.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap12.get((java.lang.Object) entryArray26);
        hashMap7.table = entryArray26;
        int int29 = hashMap7.size();
        java.lang.Class<?> wildcardClass30 = hashMap7.getClass();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        java.lang.Object obj33 = hashMap5.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap31);
        java.lang.Object obj34 = hashMap0.get(obj33);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0);
        int int37 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        system.testclass.HashMap.Entry entry39 = null;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] { entry39 };
        hashMap36.table = entryArray40;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        hashMap11.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj29 = hashMap23.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) hashMap36);
        hashMap36.clear();
        java.lang.Object obj40 = hashMap23.get((java.lang.Object) hashMap36);
        java.lang.Object obj41 = hashMap4.put((java.lang.Object) entryArray19, (java.lang.Object) hashMap36);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.clear();
        java.lang.Object obj46 = hashMap42.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        hashMap47.clear();
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) 10.0d);
        java.lang.Object obj53 = hashMap36.put((java.lang.Object) "", (java.lang.Object) 10.0d);
        int int54 = hashMap36.size();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray57 = hashMap56.table;
        java.lang.Object obj58 = hashMap36.remove((java.lang.Object) entryArray57);
        hashMap1.table = entryArray57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(3, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '#');
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        java.lang.Object obj23 = hashMap16.remove((java.lang.Object) hashMap21);
        hashMap21.clear();
        java.lang.Object obj25 = hashMap10.put((java.lang.Object) int14, (java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap10.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap6.remove((java.lang.Object) entryArray28);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.modCount = 'a';
        java.lang.Class<?> wildcardClass35 = hashMap31.getClass();
        java.lang.Object obj36 = hashMap6.remove((java.lang.Object) wildcardClass35);
        boolean boolean37 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray38 = null;
        hashMap6.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(35, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(35, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        int int8 = hashMap0.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        java.lang.Object obj26 = hashMap19.remove((java.lang.Object) hashMap24);
        hashMap24.clear();
        java.lang.Object obj28 = hashMap11.get((java.lang.Object) hashMap24);
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) 100);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) (-1L));
        hashMap32.clear();
        int int36 = hashMap32.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        int int39 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        java.lang.Object obj41 = hashMap24.put((java.lang.Object) int36, (java.lang.Object) entryArray40);
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        java.lang.Object obj21 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap22.remove(obj24);
        int int26 = hashMap22.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.clear();
        boolean boolean31 = hashMap27.isEmpty();
        java.lang.Object obj32 = hashMap22.remove((java.lang.Object) hashMap27);
        int int33 = hashMap22.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap22.get((java.lang.Object) entryArray36);
        hashMap17.table = entryArray36;
        int int39 = hashMap17.size();
        java.lang.Class<?> wildcardClass40 = hashMap17.getClass();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        java.lang.Object obj43 = hashMap15.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap41);
        java.lang.Object obj44 = hashMap10.get(obj43);
        java.lang.Object obj45 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj46 = hashMap0.get((java.lang.Object) hashMap10);
        int int47 = hashMap10.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.clear();
        java.lang.Object obj52 = hashMap48.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.clear();
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = hashMap53.remove(obj55);
        int int57 = hashMap53.modCount;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        int int60 = hashMap58.size();
        hashMap58.clear();
        boolean boolean62 = hashMap58.isEmpty();
        java.lang.Object obj63 = hashMap53.remove((java.lang.Object) hashMap58);
        int int64 = hashMap53.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.clear();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap65.table;
        java.lang.Object obj68 = hashMap53.get((java.lang.Object) entryArray67);
        hashMap48.table = entryArray67;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap48.table;
        hashMap10.table = entryArray70;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap((int) (byte) 0);
        int int74 = hashMap73.size();
        system.testclass.HashMap.Entry[] entryArray75 = hashMap73.table;
        system.testclass.HashMap.Entry entry76 = null;
        system.testclass.HashMap.Entry[] entryArray77 = new system.testclass.HashMap.Entry[] { entry76 };
        hashMap73.table = entryArray77;
        hashMap10.table = entryArray77;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap3);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int11 = hashMap0.modCount;
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        hashMap11.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap11.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) (-1L));
        hashMap17.clear();
        java.lang.Object obj21 = hashMap5.put((java.lang.Object) entryArray15, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        java.lang.Object obj26 = hashMap22.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap27.remove(obj29);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        hashMap32.clear();
        boolean boolean36 = hashMap32.isEmpty();
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) hashMap32);
        int int38 = hashMap27.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.clear();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        java.lang.Object obj42 = hashMap27.get((java.lang.Object) entryArray41);
        hashMap22.table = entryArray41;
        int int44 = hashMap22.size();
        int int45 = hashMap22.size();
        hashMap22.modCount = (byte) 10;
        int int48 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        java.lang.Object obj55 = hashMap51.remove((java.lang.Object) hashMap52);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj58 = hashMap52.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        hashMap61.modCount = 0;
        java.lang.Object obj64 = hashMap60.remove((java.lang.Object) hashMap61);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.clear();
        java.lang.Object obj67 = hashMap60.remove((java.lang.Object) hashMap65);
        hashMap65.clear();
        java.lang.Object obj69 = hashMap52.get((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.clear();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap70.table;
        int int73 = hashMap70.modCount;
        int int74 = hashMap70.size();
        system.testclass.HashMap.Entry[] entryArray75 = hashMap70.table;
        hashMap52.table = entryArray75;
        java.lang.Object obj77 = hashMap17.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap52);
        int int78 = hashMap22.modCount;
        hashMap22.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap22", hashMap22.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap14);
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) 10.0d);
        java.lang.Object obj21 = hashMap6.remove(obj20);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Class<?> wildcardClass26 = hashMap23.getClass();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        int int29 = hashMap28.size();
        hashMap28.clear();
        java.lang.Object obj31 = hashMap6.put((java.lang.Object) hashMap23, (java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap6.table;
        hashMap6.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        hashMap3.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) entryArray11);
        hashMap1.table = entryArray11;
        hashMap1.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        java.lang.Object obj18 = hashMap1.remove((java.lang.Object) hashMap15);
        hashMap15.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap15.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        hashMap28.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap28.get((java.lang.Object) entryArray36);
        hashMap26.table = entryArray36;
        hashMap26.clear();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        java.lang.Object obj43 = hashMap26.remove((java.lang.Object) hashMap40);
        hashMap40.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        java.lang.Object obj48 = hashMap40.get((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.clear();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = hashMap49.remove(obj51);
        int int53 = hashMap49.modCount;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.clear();
        boolean boolean58 = hashMap54.isEmpty();
        java.lang.Object obj59 = hashMap49.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        hashMap60.clear();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap60.table;
        hashMap49.table = entryArray62;
        hashMap40.table = entryArray62;
        java.lang.Object obj65 = hashMap20.put((java.lang.Object) '#', (java.lang.Object) entryArray62);
        hashMap20.modCount = '#';
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap((int) (byte) 0);
        int int70 = hashMap69.size();
        hashMap69.clear();
        int int72 = hashMap69.modCount;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap69.table;
        hashMap20.table = entryArray73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }
}

