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
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) entryArray9);
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.size();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) 2, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        hashMap11.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.remove(obj3);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 0.0f);
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        java.lang.Object obj19 = hashMap4.remove((java.lang.Object) hashMap11);
        java.lang.Object obj20 = hashMap0.get(obj19);
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry entry22 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] { entry22 };
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        java.lang.Object obj19 = hashMap4.remove((java.lang.Object) hashMap11);
        java.lang.Object obj20 = hashMap0.get(obj19);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean24 = hashMap23.isEmpty();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap23.remove(obj25);
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        int int30 = hashMap29.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        hashMap29.table = entryArray34;
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap23.table;
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        int int7 = hashMap3.modCount;
        int int8 = hashMap3.modCount;
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean15 = hashMap11.repOK();
        hashMap11.clear();
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0);
        int int20 = hashMap19.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        hashMap19.table = entryArray24;
        hashMap11.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        boolean boolean10 = hashMap1.isEmpty();
        hashMap1.clear();
        boolean boolean12 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        int int17 = hashMap14.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        hashMap10.modCount = (short) 0;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap10);
        boolean boolean21 = hashMap2.isEmpty();
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        java.lang.Object obj19 = hashMap4.remove((java.lang.Object) hashMap11);
        java.lang.Object obj20 = hashMap0.get(obj19);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap23.table;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        hashMap10.modCount = (short) 0;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        java.lang.Object obj29 = hashMap22.get((java.lang.Object) entryArray27);
        int int30 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        int int36 = hashMap32.modCount;
        boolean boolean37 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap32.table;
        hashMap22.table = entryArray38;
        hashMap1.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean10 = hashMap6.repOK();
        hashMap6.clear();
        int int12 = hashMap6.size();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        java.lang.Object obj22 = hashMap15.get((java.lang.Object) entryArray20);
        int int23 = hashMap15.size();
        boolean boolean24 = hashMap15.isEmpty();
        hashMap15.clear();
        boolean boolean26 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap15.table;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) (-1L));
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        int int19 = hashMap17.size();
        java.lang.Object obj20 = hashMap7.put((java.lang.Object) 2, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        int int26 = hashMap22.modCount;
        int int27 = hashMap22.modCount;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) int27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        int int36 = hashMap32.modCount;
        int int37 = hashMap32.modCount;
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap30.table;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj43 = hashMap40.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int44 = hashMap40.size();
        java.lang.Object obj45 = hashMap30.get((java.lang.Object) int44);
        java.lang.Object obj46 = hashMap17.get((java.lang.Object) int44);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        hashMap47.clear();
        int int49 = hashMap47.size();
        boolean boolean50 = hashMap47.repOK();
        boolean boolean51 = hashMap47.isEmpty();
        hashMap47.clear();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj55 = hashMap17.put((java.lang.Object) hashMap47, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean58 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        java.lang.Object obj64 = hashMap57.get((java.lang.Object) entryArray62);
        int int65 = hashMap57.size();
        boolean boolean66 = hashMap57.isEmpty();
        hashMap57.clear();
        boolean boolean68 = hashMap57.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap57.table;
        hashMap47.table = entryArray69;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap47", hashMap47.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 0.0f);
        int int5 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) entryArray18);
        int int21 = hashMap13.size();
        boolean boolean22 = hashMap13.isEmpty();
        hashMap13.clear();
        hashMap13.modCount = 1;
        java.lang.Object obj26 = hashMap10.get((java.lang.Object) hashMap13);
        boolean boolean27 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        java.lang.Object obj36 = hashMap29.get((java.lang.Object) entryArray34);
        int int37 = hashMap29.size();
        boolean boolean38 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj43 = hashMap41.get((java.lang.Object) (-1L));
        int int44 = hashMap41.size();
        java.lang.Object obj45 = null;
        java.lang.Object obj47 = hashMap41.put(obj45, (java.lang.Object) "hi!");
        java.lang.Object obj48 = hashMap10.put((java.lang.Object) hashMap29, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap49.remove((java.lang.Object) 0.0f);
        int int52 = hashMap49.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap49.table;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap59.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap59.table = entryArray61;
        int int63 = hashMap59.modCount;
        int int64 = hashMap59.modCount;
        java.lang.Object obj65 = hashMap57.remove((java.lang.Object) hashMap59);
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap57.table;
        hashMap55.table = entryArray66;
        boolean boolean68 = hashMap55.isEmpty();
        java.lang.Object obj69 = hashMap10.put((java.lang.Object) entryArray53, (java.lang.Object) hashMap55);
        hashMap0.table = entryArray53;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 0.0f, (java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        hashMap7.table = entryArray12;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) hashMap7, obj15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap8.remove(obj10);
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        int int15 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        hashMap14.table = entryArray19;
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) hashMap14);
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) hashMap8);
        int int24 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) 0.0f);
        int int28 = hashMap25.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        int int30 = hashMap25.modCount;
        int int31 = hashMap25.modCount;
        hashMap25.modCount = 'a';
        boolean boolean34 = hashMap25.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap25.table;
        hashMap8.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        int int18 = hashMap10.size();
        boolean boolean19 = hashMap10.isEmpty();
        hashMap10.clear();
        hashMap10.modCount = 1;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray29;
        java.lang.Object obj31 = hashMap24.get((java.lang.Object) entryArray29);
        hashMap10.table = entryArray29;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) entryArray9);
        int int12 = hashMap4.size();
        boolean boolean13 = hashMap4.isEmpty();
        hashMap4.clear();
        hashMap4.modCount = 1;
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) hashMap4);
        boolean boolean18 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        java.lang.Object obj27 = hashMap20.get((java.lang.Object) entryArray25);
        int int28 = hashMap20.size();
        boolean boolean29 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj34 = hashMap32.get((java.lang.Object) (-1L));
        int int35 = hashMap32.size();
        java.lang.Object obj36 = null;
        java.lang.Object obj38 = hashMap32.put(obj36, (java.lang.Object) "hi!");
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) hashMap20, (java.lang.Object) "hi!");
        int int40 = hashMap1.size();
        int int41 = hashMap1.size();
        int int42 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (short) 100);
        boolean boolean45 = hashMap44.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        hashMap1.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.size();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) 2, (java.lang.Object) hashMap11);
        int int15 = hashMap1.size();
        boolean boolean16 = hashMap1.isEmpty();
        int int17 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        boolean boolean21 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        java.lang.Object obj36 = hashMap29.get((java.lang.Object) entryArray34);
        java.lang.Object obj37 = hashMap22.remove((java.lang.Object) hashMap29);
        java.lang.Object obj38 = hashMap18.get(obj37);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap18.table;
        hashMap1.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        int int18 = hashMap10.size();
        boolean boolean19 = hashMap10.isEmpty();
        hashMap10.clear();
        hashMap10.modCount = 1;
        java.lang.Object obj23 = hashMap7.get((java.lang.Object) hashMap10);
        boolean boolean24 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) entryArray31);
        int int34 = hashMap26.size();
        boolean boolean35 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap26.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj40 = hashMap38.get((java.lang.Object) (-1L));
        int int41 = hashMap38.size();
        java.lang.Object obj42 = null;
        java.lang.Object obj44 = hashMap38.put(obj42, (java.lang.Object) "hi!");
        java.lang.Object obj45 = hashMap7.put((java.lang.Object) hashMap26, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap46.remove((java.lang.Object) 0.0f);
        int int49 = hashMap46.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap46.table;
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap56.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray58 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap56.table = entryArray58;
        int int60 = hashMap56.modCount;
        int int61 = hashMap56.modCount;
        java.lang.Object obj62 = hashMap54.remove((java.lang.Object) hashMap56);
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap54.table;
        hashMap52.table = entryArray63;
        boolean boolean65 = hashMap52.isEmpty();
        java.lang.Object obj66 = hashMap7.put((java.lang.Object) entryArray50, (java.lang.Object) hashMap52);
        java.lang.Object obj67 = hashMap0.get((java.lang.Object) hashMap52);
        int int68 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean71 = hashMap70.isEmpty();
        system.classfixer.classes.HashMap hashMap73 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap73.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray75 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap73.table = entryArray75;
        java.lang.Object obj77 = hashMap70.get((java.lang.Object) entryArray75);
        int int78 = hashMap70.size();
        boolean boolean79 = hashMap70.isEmpty();
        hashMap70.clear();
        boolean boolean81 = hashMap70.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap70.table;
        hashMap0.table = entryArray82;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean10 = hashMap6.repOK();
        boolean boolean11 = hashMap6.isEmpty();
        boolean boolean12 = hashMap6.repOK();
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) boolean12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap1.put(obj13, (java.lang.Object) hashMap15);
        int int20 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 0.0f);
        boolean boolean24 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = hashMap25.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray37;
        java.lang.Object obj39 = hashMap32.get((java.lang.Object) entryArray37);
        java.lang.Object obj40 = hashMap25.remove((java.lang.Object) hashMap32);
        java.lang.Object obj41 = hashMap21.get(obj40);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap21.table;
        java.lang.Object obj43 = hashMap1.remove((java.lang.Object) hashMap21);
        boolean boolean44 = hashMap1.isEmpty();
        int int45 = hashMap1.modCount;
        boolean boolean46 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap48.table;
        hashMap1.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        int int10 = hashMap9.size();
        int int11 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap4.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        hashMap10.modCount = (short) 0;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap10);
        hashMap1.modCount = ' ';
        boolean boolean23 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap24.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap24.modCount = (-1);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap24.table;
        hashMap1.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray7;
        int int9 = hashMap5.modCount;
        boolean boolean10 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        boolean boolean11 = hashMap9.repOK();
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap23.table;
        hashMap23.modCount = (short) 0;
        java.lang.Object obj33 = hashMap14.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap23);
        int int34 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        java.lang.Object obj43 = hashMap36.get((java.lang.Object) entryArray41);
        int int44 = hashMap36.size();
        int int45 = hashMap36.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap36.table;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap36.table;
        java.lang.Object obj48 = hashMap9.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap50.table;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap53.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap53.table = entryArray55;
        int int57 = hashMap53.modCount;
        boolean boolean58 = hashMap53.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap64.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray66 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap64.table = entryArray66;
        int int68 = hashMap64.modCount;
        int int69 = hashMap64.modCount;
        java.lang.Object obj70 = hashMap62.remove((java.lang.Object) hashMap64);
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap62.table;
        hashMap60.table = entryArray71;
        hashMap53.table = entryArray71;
        java.lang.Object obj74 = hashMap50.get((java.lang.Object) entryArray71);
        hashMap14.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(10);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        java.lang.Object obj23 = hashMap16.get((java.lang.Object) entryArray21);
        java.lang.Object obj24 = hashMap9.remove((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) entryArray31);
        int int34 = hashMap26.size();
        boolean boolean35 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap26.table;
        hashMap16.table = entryArray36;
        int int38 = hashMap16.size();
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap16.table;
        java.lang.Object obj41 = hashMap8.get((java.lang.Object) entryArray40);
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean10 = hashMap6.repOK();
        boolean boolean11 = hashMap6.isEmpty();
        boolean boolean12 = hashMap6.repOK();
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) boolean12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap1.put(obj13, (java.lang.Object) hashMap15);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap23.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap31.table;
        hashMap31.modCount = (short) 0;
        java.lang.Object obj41 = hashMap22.put((java.lang.Object) hashMap23, (java.lang.Object) hashMap31);
        boolean boolean42 = hashMap23.isEmpty();
        int int43 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap23.table;
        hashMap15.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap15", hashMap15.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        hashMap1.table = entryArray6;
        hashMap1.clear();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) entryArray18);
        int int21 = hashMap13.size();
        boolean boolean22 = hashMap13.isEmpty();
        hashMap13.clear();
        hashMap13.modCount = 1;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        java.lang.Object obj34 = hashMap27.get((java.lang.Object) entryArray32);
        int int35 = hashMap27.size();
        boolean boolean36 = hashMap27.isEmpty();
        hashMap27.clear();
        hashMap27.modCount = 1;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean42 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap44.table = entryArray46;
        java.lang.Object obj48 = hashMap41.get((java.lang.Object) entryArray46);
        hashMap27.table = entryArray46;
        java.lang.Object obj50 = hashMap13.get((java.lang.Object) entryArray46);
        hashMap1.table = entryArray46;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap53.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap53.table;
        hashMap1.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        java.lang.Object obj22 = hashMap7.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray29;
        java.lang.Object obj31 = hashMap24.get((java.lang.Object) entryArray29);
        int int32 = hashMap24.size();
        boolean boolean33 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap24.table;
        hashMap14.table = entryArray34;
        int int36 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap14.table;
        hashMap1.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray8;
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) entryArray8);
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap0.table;
        int int10 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(10);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        int int20 = hashMap16.modCount;
        int int21 = hashMap16.modCount;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap16.table;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.size();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) 2, (java.lang.Object) hashMap11);
        int int15 = hashMap1.size();
        boolean boolean16 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap17.modCount = (-1);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        int int33 = hashMap29.modCount;
        int int34 = hashMap29.modCount;
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap27.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap37.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int41 = hashMap37.size();
        java.lang.Object obj42 = hashMap27.get((java.lang.Object) int41);
        int int43 = hashMap27.size();
        hashMap27.modCount = 1;
        java.lang.Object obj46 = hashMap17.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap48.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap48.table = entryArray50;
        java.lang.Object obj52 = hashMap17.get((java.lang.Object) entryArray50);
        hashMap1.table = entryArray50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        int int16 = hashMap12.modCount;
        int int17 = hashMap12.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int24 = hashMap20.size();
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) int24);
        int int26 = hashMap10.size();
        hashMap10.modCount = 1;
        java.lang.Object obj29 = hashMap0.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray37;
        int int39 = hashMap35.modCount;
        int int40 = hashMap35.modCount;
        java.lang.Object obj41 = hashMap33.remove((java.lang.Object) hashMap35);
        java.lang.Object obj42 = hashMap31.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap35.table;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap35.table;
        hashMap0.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        int int16 = hashMap12.modCount;
        int int17 = hashMap12.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int24 = hashMap20.size();
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) int24);
        int int26 = hashMap10.size();
        hashMap10.modCount = 1;
        java.lang.Object obj29 = hashMap0.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        hashMap30.clear();
        int int32 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap30.table;
        hashMap10.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.modCount = '#';
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean7 = hashMap3.repOK();
        hashMap3.clear();
        int int9 = hashMap3.modCount;
        int int10 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap3.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) entryArray26);
        int int29 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        int int35 = hashMap31.modCount;
        boolean boolean36 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap31.table;
        hashMap21.table = entryArray37;
        hashMap17.table = entryArray37;
        hashMap0.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap0.get(obj7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        boolean boolean20 = hashMap18.repOK();
        java.lang.Object obj21 = hashMap10.remove((java.lang.Object) hashMap18);
        java.lang.Object obj22 = hashMap0.get(obj21);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        hashMap23.clear();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.repOK();
        boolean boolean27 = hashMap23.isEmpty();
        hashMap23.clear();
        boolean boolean29 = hashMap23.isEmpty();
        java.lang.Object obj30 = hashMap0.remove((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = hashMap33.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap41.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap41.table;
        hashMap41.modCount = (short) 0;
        java.lang.Object obj51 = hashMap32.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap41);
        boolean boolean52 = hashMap33.isEmpty();
        hashMap33.clear();
        int int54 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj58 = hashMap55.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj60 = hashMap55.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean63 = hashMap62.isEmpty();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap65.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap65.table = entryArray67;
        java.lang.Object obj69 = hashMap62.get((java.lang.Object) entryArray67);
        java.lang.Object obj70 = hashMap55.remove((java.lang.Object) hashMap62);
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean73 = hashMap72.isEmpty();
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap75.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray77 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap75.table = entryArray77;
        java.lang.Object obj79 = hashMap72.get((java.lang.Object) entryArray77);
        int int80 = hashMap72.size();
        boolean boolean81 = hashMap72.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap72.table;
        hashMap62.table = entryArray82;
        java.lang.Object obj85 = hashMap33.put((java.lang.Object) entryArray82, (java.lang.Object) (short) -1);
        hashMap23.table = entryArray82;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap23", hashMap23.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(97, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        int int7 = hashMap3.modCount;
        int int8 = hashMap3.modCount;
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean15 = hashMap11.repOK();
        hashMap11.clear();
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean22 = hashMap18.repOK();
        hashMap18.clear();
        int int24 = hashMap18.modCount;
        int int25 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap18.table;
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        int int15 = hashMap7.size();
        boolean boolean16 = hashMap7.isEmpty();
        hashMap7.clear();
        int int18 = hashMap7.size();
        boolean boolean19 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) entryArray26);
        int int29 = hashMap21.size();
        boolean boolean30 = hashMap21.isEmpty();
        hashMap21.clear();
        hashMap21.modCount = 1;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean36 = hashMap35.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray40;
        java.lang.Object obj42 = hashMap35.get((java.lang.Object) entryArray40);
        hashMap21.table = entryArray40;
        hashMap7.table = entryArray40;
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap7.table;
        hashMap0.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap1.table;
        hashMap1.modCount = 0;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean15 = hashMap11.repOK();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap11.table = entryArray21;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap23.modCount = (-1);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap32.put((java.lang.Object) 100, (java.lang.Object) hashMap36);
        int int38 = hashMap36.size();
        int int39 = hashMap36.size();
        int int40 = hashMap36.size();
        java.lang.Object obj41 = hashMap23.get((java.lang.Object) hashMap36);
        java.lang.Object obj42 = hashMap11.remove((java.lang.Object) hashMap23);
        boolean boolean43 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap11.table;
        hashMap1.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.repOK();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) boolean8);
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

