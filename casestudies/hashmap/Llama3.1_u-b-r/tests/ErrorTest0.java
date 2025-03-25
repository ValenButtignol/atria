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
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        hashMap2.table = entryArray4;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) entryArray10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (short) -1, obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap3.table = entryArray5;
        hashMap3.modCount = (byte) 100;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) hashMap3, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.get(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(1);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        hashMap1.clear();
        hashMap1.modCount = 0;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap5.table = entryArray8;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        hashMap14.clear();
        int int17 = hashMap14.modCount;
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap20.table = entryArray23;
        hashMap14.table = entryArray23;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(2);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap7.modCount = (short) 0;
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 1);
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.get(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        int int9 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap6);
        boolean boolean12 = hashMap6.isEmpty();
        boolean boolean13 = hashMap6.isEmpty();
        int int14 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = null;
        hashMap6.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) (short) 100);
        hashMap2.clear();
        boolean boolean6 = hashMap2.isEmpty();
        boolean boolean7 = hashMap2.repOK();
        int int8 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        hashMap1.table = entryArray9;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        boolean boolean16 = hashMap11.repOK();
        boolean boolean17 = hashMap11.repOK();
        int int18 = hashMap11.modCount;
        boolean boolean19 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) (short) 100);
        hashMap22.clear();
        boolean boolean26 = hashMap22.isEmpty();
        boolean boolean27 = hashMap22.repOK();
        int int28 = hashMap22.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap21.table = entryArray29;
        hashMap11.table = entryArray29;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) entryArray29, (java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) (short) 100);
        hashMap8.clear();
        boolean boolean12 = hashMap8.isEmpty();
        hashMap8.clear();
        boolean boolean14 = hashMap8.isEmpty();
        hashMap8.modCount = 0;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.get(obj20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        hashMap23.clear();
        int int26 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj28 = hashMap17.remove((java.lang.Object) hashMap23);
        java.lang.Object obj29 = hashMap8.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        int int34 = hashMap31.modCount;
        boolean boolean35 = hashMap31.repOK();
        java.lang.Object obj36 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap5.table = entryArray8;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int14 = hashMap13.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) (short) 100);
        hashMap15.clear();
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.repOK();
        boolean boolean21 = hashMap15.repOK();
        int int22 = hashMap15.modCount;
        boolean boolean23 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap15.table;
        hashMap13.table = entryArray24;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        hashMap30.clear();
        int int33 = hashMap30.modCount;
        hashMap30.clear();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        hashMap36.table = entryArray39;
        hashMap30.table = entryArray39;
        hashMap28.table = entryArray39;
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) entryArray24, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = null;
        hashMap2.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        boolean boolean5 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.modCount = 10;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) entryArray12);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) 10, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        int int6 = hashMap4.size();
        int int7 = hashMap4.size();
        boolean boolean8 = hashMap4.repOK();
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) boolean8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        hashMap2.clear();
        boolean boolean4 = hashMap2.repOK();
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        int int2 = hashMap1.size();
        hashMap1.modCount = ' ';
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        boolean boolean10 = hashMap6.repOK();
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        hashMap12.table = entryArray18;
        hashMap12.clear();
        boolean boolean22 = hashMap12.repOK();
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        hashMap3.clear();
        boolean boolean7 = hashMap3.isEmpty();
        hashMap3.clear();
        boolean boolean9 = hashMap3.isEmpty();
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) (short) 100);
        hashMap12.clear();
        boolean boolean16 = hashMap12.isEmpty();
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap20.table = entryArray22;
        hashMap19.table = entryArray22;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        hashMap12.table = entryArray26;
        java.lang.Object obj28 = hashMap3.get((java.lang.Object) entryArray26);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap31.modCount = (short) 0;
        hashMap31.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap31.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap.Entry entry40 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] { entry40 };
        hashMap35.table = entryArray41;
        hashMap3.table = entryArray41;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap3.table;
        java.lang.Object obj45 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        boolean boolean7 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int11 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        hashMap12.table = entryArray14;
        hashMap12.modCount = (byte) 100;
        hashMap12.modCount = 2;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap12.table;
        hashMap10.table = entryArray21;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) boolean7, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap4.modCount = (short) 0;
        hashMap4.clear();
        int int8 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0, (float) '4');
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) int8, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        hashMap3.clear();
        boolean boolean7 = hashMap3.isEmpty();
        int int8 = hashMap3.size();
        boolean boolean9 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = 'a';
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        boolean boolean9 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        hashMap10.clear();
        boolean boolean14 = hashMap10.isEmpty();
        boolean boolean15 = hashMap10.repOK();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        boolean boolean18 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        int int22 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap25.modCount = (short) 0;
        java.lang.Object obj28 = hashMap20.get((java.lang.Object) hashMap25);
        java.lang.Object obj29 = hashMap10.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray40;
        hashMap37.table = entryArray40;
        hashMap31.table = entryArray40;
        hashMap31.clear();
        java.lang.Object obj45 = hashMap20.remove((java.lang.Object) hashMap31);
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) boolean9, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        hashMap0.table = entryArray2;
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.size();
        hashMap0.modCount = '#';
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap18.table = entryArray20;
        hashMap17.table = entryArray20;
        boolean boolean24 = hashMap17.repOK();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) boolean24, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.modCount = (short) 0;
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap6.table = entryArray12;
        boolean boolean14 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int17 = hashMap16.size();
        hashMap16.modCount = '#';
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int23 = hashMap22.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) hashMap25);
        hashMap22.modCount = 'a';
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) (short) 100);
        hashMap30.clear();
        boolean boolean34 = hashMap30.isEmpty();
        boolean boolean35 = hashMap30.repOK();
        boolean boolean36 = hashMap30.repOK();
        int int37 = hashMap30.modCount;
        java.lang.Object obj38 = hashMap6.put((java.lang.Object) hashMap22, (java.lang.Object) int37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap12.modCount = (short) 0;
        java.lang.Object obj15 = hashMap7.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(3);
        int int18 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap17);
        java.lang.Object obj22 = hashMap1.put(obj6, obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        hashMap5.table = entryArray11;
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap16.table = entryArray19;
        hashMap5.table = entryArray19;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) entryArray19);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap(2, (float) (byte) 10);
        java.lang.Object obj27 = hashMap0.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(1);
        boolean boolean30 = hashMap29.repOK();
        boolean boolean31 = hashMap29.isEmpty();
        int int32 = hashMap29.size();
        boolean boolean33 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        hashMap35.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap39.table;
        hashMap35.table = entryArray40;
        hashMap29.table = entryArray40;
        hashMap26.table = entryArray40;
        hashMap26.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap26", hashMap26.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.modCount = (short) 0;
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap6.table = entryArray12;
        int int14 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        boolean boolean17 = hashMap15.repOK();
        boolean boolean18 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        int int22 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 1);
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) 1);
        java.lang.Object obj27 = hashMap6.put((java.lang.Object) boolean18, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        int int6 = hashMap1.modCount;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) (-1L));
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        hashMap10.clear();
        boolean boolean14 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap1.table = entryArray15;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(10, 1.0f);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        hashMap20.modCount = (byte) 0;
        hashMap20.modCount = 1;
        int int29 = hashMap20.size();
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) 10, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) (short) 100);
        hashMap9.clear();
        boolean boolean13 = hashMap9.isEmpty();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap17.table = entryArray19;
        hashMap16.table = entryArray19;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap16.table;
        hashMap9.table = entryArray23;
        java.lang.Object obj25 = hashMap0.get((java.lang.Object) entryArray23);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap28.modCount = (short) 0;
        hashMap28.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap28.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry entry37 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] { entry37 };
        hashMap32.table = entryArray38;
        hashMap0.table = entryArray38;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(3);
        int int4 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) hashMap6);
        java.lang.Class<?> wildcardClass10 = hashMap3.getClass();
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        int int15 = hashMap14.size();
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        boolean boolean21 = hashMap18.repOK();
        boolean boolean22 = hashMap18.repOK();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) (short) 100);
        hashMap25.clear();
        boolean boolean29 = hashMap25.isEmpty();
        boolean boolean30 = hashMap25.repOK();
        int int31 = hashMap25.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap24.table = entryArray32;
        java.lang.Object obj34 = hashMap3.put((java.lang.Object) boolean22, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        int int2 = hashMap1.size();
        hashMap1.modCount = ' ';
        hashMap1.modCount = 1;
        int int7 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        int int10 = hashMap8.size();
        int int11 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) (short) 100);
        hashMap14.clear();
        boolean boolean18 = hashMap14.isEmpty();
        hashMap14.clear();
        hashMap14.modCount = 1;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap22.table = entryArray24;
        hashMap22.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap14.table = entryArray29;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap14.table;
        java.lang.Class<?> wildcardClass32 = entryArray31.getClass();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        hashMap33.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.repOK();
        boolean boolean40 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap42.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray44;
        hashMap38.table = entryArray44;
        hashMap38.clear();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap51.table = entryArray52;
        hashMap49.table = entryArray52;
        hashMap38.table = entryArray52;
        java.lang.Object obj56 = hashMap33.get((java.lang.Object) entryArray52);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap(2, (float) (byte) 10);
        java.lang.Object obj60 = hashMap33.get((java.lang.Object) hashMap59);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap(1);
        boolean boolean63 = hashMap62.repOK();
        boolean boolean64 = hashMap62.isEmpty();
        int int65 = hashMap62.size();
        boolean boolean66 = hashMap62.isEmpty();
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap68.clear();
        hashMap68.clear();
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap72.table;
        hashMap68.table = entryArray73;
        hashMap62.table = entryArray73;
        hashMap59.table = entryArray73;
        java.lang.Object obj77 = hashMap8.put((java.lang.Object) wildcardClass32, (java.lang.Object) hashMap59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = null;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(10);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        hashMap3.clear();
        boolean boolean7 = hashMap3.isEmpty();
        int int8 = hashMap3.size();
        hashMap3.clear();
        boolean boolean10 = hashMap3.isEmpty();
        int int11 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        boolean boolean16 = hashMap12.isEmpty();
        hashMap12.modCount = (byte) 0;
        hashMap12.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap12.table;
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.repOK();
        int int6 = hashMap0.modCount;
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        int int6 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) (byte) 1);
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) 1, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        int int6 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        int int12 = hashMap7.modCount;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = null;
        hashMap7.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap7.table = entryArray10;
        hashMap1.table = entryArray10;
        int int14 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) entryArray18);
        int int21 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap24.table = entryArray26;
        hashMap23.table = entryArray26;
        hashMap16.table = entryArray26;
        hashMap1.table = entryArray26;
        int int32 = hashMap1.modCount;
        boolean boolean33 = hashMap1.repOK();
        hashMap1.clear();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(10);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) entryArray6);
        int int9 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(100, (float) (byte) 100);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (byte) 0);
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) 1.0f, obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap6.modCount = (short) 0;
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap10.table = entryArray16;
        java.lang.Class<?> wildcardClass18 = entryArray16.getClass();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        hashMap20.clear();
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap2.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 10);
        boolean boolean2 = hashMap1.repOK();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int6 = hashMap5.size();
        boolean boolean7 = hashMap5.repOK();
        boolean boolean8 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        hashMap10.clear();
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        int int17 = hashMap15.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap20.modCount = (short) 0;
        java.lang.Object obj23 = hashMap15.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) (short) 100);
        hashMap25.clear();
        boolean boolean29 = hashMap25.isEmpty();
        hashMap25.clear();
        hashMap25.modCount = 1;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap34.table = entryArray35;
        hashMap33.table = entryArray35;
        hashMap33.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        hashMap25.table = entryArray40;
        java.lang.Object obj42 = hashMap20.put((java.lang.Object) 1.0f, (java.lang.Object) entryArray40);
        hashMap10.table = entryArray40;
        hashMap5.table = entryArray40;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap(0);
        hashMap46.modCount = 3;
        boolean boolean49 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap50.remove((java.lang.Object) (short) 100);
        hashMap50.clear();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap55.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap55.table;
        int int58 = hashMap55.modCount;
        boolean boolean59 = hashMap55.repOK();
        hashMap55.clear();
        java.lang.Object obj61 = hashMap50.get((java.lang.Object) hashMap55);
        int int62 = hashMap55.size();
        java.lang.Object obj63 = hashMap46.get((java.lang.Object) int62);
        java.lang.Object obj64 = hashMap1.put((java.lang.Object) hashMap5, obj63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj7 = null;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap9.table = entryArray12;
        hashMap9.modCount = (short) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        java.lang.Object obj18 = hashMap0.put(obj7, (java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.repOK();
        boolean boolean22 = hashMap19.repOK();
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap24.table = entryArray26;
        hashMap24.modCount = (byte) 100;
        hashMap24.modCount = 2;
        boolean boolean33 = hashMap24.isEmpty();
        java.lang.Object obj34 = hashMap19.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        hashMap36.clear();
        int int39 = hashMap36.modCount;
        hashMap36.clear();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap42.clear();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap44.table = entryArray45;
        hashMap42.table = entryArray45;
        hashMap36.table = entryArray45;
        int int49 = hashMap36.size();
        int int50 = hashMap36.modCount;
        hashMap36.modCount = (byte) 100;
        java.lang.Object obj53 = hashMap19.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap55.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap55.table;
        int int58 = hashMap55.size();
        java.lang.Object obj59 = hashMap19.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap61.table;
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap(3);
        int int65 = hashMap64.size();
        java.lang.Object obj66 = hashMap61.get((java.lang.Object) int65);
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap61.table;
        boolean boolean68 = hashMap61.isEmpty();
        hashMap61.modCount = (byte) 100;
        java.lang.Object obj71 = hashMap55.remove((java.lang.Object) hashMap61);
        boolean boolean72 = hashMap61.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = null;
        hashMap61.table = entryArray73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap61", hashMap61.repOK_2());
    }
}

