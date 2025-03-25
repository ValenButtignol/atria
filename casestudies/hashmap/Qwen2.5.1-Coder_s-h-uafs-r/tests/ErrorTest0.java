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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (-1), obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        boolean boolean6 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) 10, (java.lang.Object) hashMap4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        int int12 = hashMap11.size();
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) 10L);
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.modCount = (short) 0;
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) 0, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        boolean boolean7 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        boolean boolean11 = hashMap9.isEmpty();
        hashMap9.modCount = (byte) 100;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) true, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        int int3 = hashMap2.size();
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) false, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = hashMap0.put(obj6, (java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        int int6 = hashMap5.size();
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        hashMap8.table = entryArray14;
        java.lang.Class<?> wildcardClass16 = hashMap8.getClass();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) wildcardClass16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        int int8 = hashMap5.modCount;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) int8, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        hashMap0.clear();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap13);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) false, (java.lang.Object) wildcardClass18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap13", hashMap13.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        int int12 = hashMap11.size();
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        int int16 = hashMap15.size();
        int int17 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap11.table = entryArray18;
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) entryArray18, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.clear();
        int int7 = hashMap3.modCount;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) int7, obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (short) 100);
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap8.table = entryArray16;
        hashMap4.table = entryArray16;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1L);
        hashMap20.clear();
        int int24 = hashMap20.modCount;
        int int25 = hashMap20.modCount;
        java.lang.Object obj26 = hashMap0.remove((java.lang.Object) int25);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        boolean boolean30 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.get((java.lang.Object) 0.0f);
        java.lang.Object obj34 = hashMap27.remove((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        int int36 = hashMap35.size();
        int int37 = hashMap35.size();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap35.table;
        boolean boolean39 = hashMap35.repOK();
        java.lang.Object obj40 = hashMap27.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        hashMap41.clear();
        boolean boolean43 = hashMap41.isEmpty();
        int int44 = hashMap41.modCount;
        boolean boolean45 = hashMap41.repOK();
        boolean boolean46 = hashMap41.isEmpty();
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.clear();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap8.modCount = (byte) 10;
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap8.get((java.lang.Object) entryArray20);
        int int22 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1L);
        hashMap23.modCount = (short) 0;
        int int28 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap23.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        int int31 = hashMap30.size();
        int int32 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap30.table;
        boolean boolean34 = hashMap30.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap30.table;
        java.lang.Object obj36 = hashMap23.get((java.lang.Object) hashMap30);
        hashMap23.clear();
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) int22, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.get((java.lang.Object) 0.0f);
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 1L);
        hashMap11.clear();
        hashMap11.clear();
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = hashMap3.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        int int20 = hashMap19.size();
        int int21 = hashMap19.size();
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        int int5 = hashMap4.size();
        int int6 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap0.table = entryArray7;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) hashMap9, obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        boolean boolean7 = hashMap5.repOK();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        hashMap0.clear();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 1L);
        hashMap16.modCount = (short) 0;
        int int21 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        hashMap22.clear();
        java.lang.Object obj25 = hashMap22.remove((java.lang.Object) (short) 100);
        int int26 = hashMap22.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap22.table;
        hashMap16.table = entryArray27;
        hashMap13.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap13", hashMap13.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap4.table = entryArray12;
        hashMap0.table = entryArray12;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        boolean boolean20 = hashMap18.isEmpty();
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        java.lang.Object obj25 = hashMap15.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        hashMap26.clear();
        boolean boolean28 = hashMap26.isEmpty();
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) boolean28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        boolean boolean9 = hashMap7.isEmpty();
        int int10 = hashMap7.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap5.table = entryArray11;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.modCount = (short) 0;
        int int18 = hashMap13.size();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap13.get(obj19);
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap5, obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap10.table = entryArray22;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 1L);
        hashMap24.modCount = (short) 0;
        int int29 = hashMap24.modCount;
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap24.remove(obj30);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap24.table;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        boolean boolean7 = hashMap5.repOK();
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(11);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 1L);
        hashMap14.clear();
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) hashMap14);
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) 11, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        hashMap3.clear();
        boolean boolean5 = hashMap3.isEmpty();
        int int6 = hashMap3.modCount;
        boolean boolean7 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        int int9 = hashMap8.size();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        int int13 = hashMap12.size();
        int int14 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap8.table = entryArray15;
        hashMap8.clear();
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) boolean7, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.clear();
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.get((java.lang.Object) 0.0f);
        boolean boolean11 = hashMap8.repOK();
        hashMap8.modCount = 0;
        int int14 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1L);
        hashMap15.clear();
        hashMap15.clear();
        int int20 = hashMap15.modCount;
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int6 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj11 = hashMap9.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        boolean boolean17 = hashMap15.isEmpty();
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap15.table;
        java.lang.Object obj22 = hashMap12.remove((java.lang.Object) hashMap15);
        boolean boolean23 = hashMap15.isEmpty();
        java.lang.Object obj24 = hashMap9.remove((java.lang.Object) hashMap15);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) entryArray7, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        boolean boolean9 = hashMap6.isEmpty();
        int int10 = hashMap6.size();
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap13.table = entryArray21;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1L);
        hashMap23.modCount = (short) 0;
        int int28 = hashMap23.size();
        boolean boolean29 = hashMap23.repOK();
        int int30 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        hashMap31.clear();
        java.lang.Object obj34 = hashMap31.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        hashMap23.table = entryArray35;
        hashMap13.table = entryArray35;
        java.lang.Object obj38 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1L);
        hashMap6.modCount = (short) 0;
        boolean boolean11 = hashMap6.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.clear();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.clear();
        hashMap8.clear();
        hashMap8.clear();
        hashMap8.clear();
        int int15 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        boolean boolean18 = hashMap16.isEmpty();
        int int19 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) 100L);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) int15, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(2);
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        int int7 = hashMap5.size();
        int int8 = hashMap5.modCount;
        boolean boolean9 = hashMap5.isEmpty();
        boolean boolean10 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) boolean10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        boolean boolean9 = hashMap6.isEmpty();
        int int10 = hashMap6.size();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.modCount;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap3.remove(obj9);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap0.table = entryArray11;
        java.lang.Object obj13 = null;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 1L);
        hashMap14.modCount = (short) 0;
        int int19 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap14.table;
        hashMap14.modCount = (byte) 10;
        hashMap14.clear();
        int int24 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap27.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) hashMap27);
        java.lang.Object obj30 = hashMap0.put(obj13, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        boolean boolean9 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        boolean boolean14 = hashMap10.repOK();
        boolean boolean15 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (short) 100);
        int int20 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap16.table;
        boolean boolean22 = hashMap16.repOK();
        boolean boolean23 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap16.table;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(4);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap9.modCount = (-1);
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) 4, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.clear();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 100);
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(4, (float) 1L);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int25 = hashMap24.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) 4, (java.lang.Object) entryArray26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.repOK();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) 10L);
        boolean boolean21 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1L);
        hashMap22.clear();
        hashMap22.clear();
        java.lang.Object obj28 = hashMap22.remove((java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        hashMap29.clear();
        java.lang.Object obj32 = hashMap29.remove((java.lang.Object) (short) 100);
        int int33 = hashMap29.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap29.table;
        java.lang.Object obj35 = hashMap22.remove((java.lang.Object) hashMap29);
        java.lang.Object obj36 = hashMap4.put((java.lang.Object) boolean21, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        hashMap0.clear();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap13);
        int int16 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        hashMap17.clear();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1L);
        hashMap22.clear();
        int int26 = hashMap22.modCount;
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap22.remove(obj27);
        boolean boolean29 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        hashMap30.clear();
        java.lang.Object obj33 = hashMap30.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 1L);
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        hashMap30.table = entryArray38;
        hashMap22.table = entryArray38;
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) entryArray38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap3.modCount = (byte) 10;
        hashMap3.clear();
        int int13 = hashMap3.modCount;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap25.table;
        hashMap25.clear();
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) hashMap25);
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(4);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(2);
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 10.0d);
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1L);
        hashMap9.modCount = (short) 0;
        boolean boolean14 = hashMap9.repOK();
        hashMap9.clear();
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        boolean boolean20 = hashMap17.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        hashMap21.clear();
        java.lang.Object obj24 = hashMap21.remove((java.lang.Object) (short) 100);
        int int25 = hashMap21.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        boolean boolean27 = hashMap21.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap21.table;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(2, (float) 100L);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        boolean boolean13 = hashMap11.repOK();
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap5.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        boolean boolean19 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.get((java.lang.Object) 0.0f);
        java.lang.Object obj23 = hashMap16.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        int int25 = hashMap24.size();
        int int26 = hashMap24.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap24.table;
        boolean boolean28 = hashMap24.repOK();
        java.lang.Object obj29 = hashMap16.get((java.lang.Object) hashMap24);
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        int int34 = hashMap33.size();
        int int35 = hashMap33.size();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap33.table;
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) entryArray36);
        hashMap32.modCount = 2;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 1L);
        hashMap40.modCount = (short) 0;
        int int45 = hashMap40.size();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap40.table;
        hashMap40.modCount = (byte) 10;
        hashMap40.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap51.table;
        java.lang.Object obj53 = hashMap40.get((java.lang.Object) entryArray52);
        hashMap40.modCount = '#';
        int int56 = hashMap40.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap40.table;
        hashMap32.table = entryArray57;
        java.lang.Object obj59 = hashMap24.get((java.lang.Object) entryArray57);
        java.lang.Object obj60 = hashMap0.put(obj15, (java.lang.Object) entryArray57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap10.table = entryArray22;
        hashMap0.table = entryArray22;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        hashMap27.clear();
        boolean boolean29 = hashMap27.isEmpty();
        int int30 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap25.table = entryArray31;
        hashMap0.table = entryArray31;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        hashMap35.clear();
        int int37 = hashMap35.size();
        int int38 = hashMap35.modCount;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        hashMap39.clear();
        java.lang.Object obj42 = hashMap39.remove((java.lang.Object) (short) 100);
        int int43 = hashMap39.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap39.table;
        boolean boolean45 = hashMap39.repOK();
        boolean boolean46 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap39.table;
        hashMap35.table = entryArray47;
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.clear();
        int int12 = hashMap8.modCount;
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap8.remove(obj13);
        boolean boolean15 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1L);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap16.table = entryArray24;
        hashMap8.table = entryArray24;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1L);
        hashMap27.modCount = (short) 0;
        int int32 = hashMap27.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap27.remove(obj33);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap27.table;
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) (short) 100);
        boolean boolean38 = hashMap27.repOK();
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) boolean38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10);
        boolean boolean3 = hashMap2.isEmpty();
        java.lang.Object obj4 = null;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.get((java.lang.Object) 0.0f);
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        int int10 = hashMap5.size();
        java.lang.Object obj11 = hashMap2.put(obj4, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        int int8 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        hashMap10.modCount = (byte) 10;
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap21.table;
        java.lang.Object obj23 = hashMap10.get((java.lang.Object) entryArray22);
        hashMap10.modCount = '#';
        int int26 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        int int33 = hashMap32.size();
        int int34 = hashMap32.size();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) entryArray35);
        int int37 = hashMap31.modCount;
        java.lang.Class<?> wildcardClass38 = hashMap31.getClass();
        java.lang.Object obj39 = hashMap29.get((java.lang.Object) wildcardClass38);
        java.lang.Object obj40 = hashMap4.put((java.lang.Object) hashMap10, (java.lang.Object) wildcardClass38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        int int8 = hashMap0.size();
        int int9 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(2);
        boolean boolean12 = hashMap11.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(2);
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap11.table = entryArray17;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap20.table;
        boolean boolean22 = hashMap20.repOK();
        java.lang.Object obj23 = hashMap11.get((java.lang.Object) boolean22);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 1L);
        hashMap24.modCount = (short) 0;
        hashMap24.clear();
        boolean boolean30 = hashMap24.repOK();
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) boolean30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.get((java.lang.Object) 0.0f);
        boolean boolean9 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        hashMap14.clear();
        java.lang.Object obj17 = hashMap14.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 1L);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap14.table = entryArray22;
        hashMap10.table = entryArray22;
        hashMap6.table = entryArray22;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 1L);
        hashMap26.clear();
        int int30 = hashMap26.modCount;
        int int31 = hashMap26.modCount;
        java.lang.Object obj32 = hashMap6.remove((java.lang.Object) int31);
        hashMap6.clear();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        int int9 = hashMap8.size();
        int int10 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.repOK();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1L);
        hashMap15.modCount = (short) 0;
        int int20 = hashMap15.modCount;
        hashMap15.clear();
        java.lang.Object obj23 = hashMap15.remove((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 1L);
        hashMap24.modCount = (short) 0;
        int int29 = hashMap24.modCount;
        hashMap24.clear();
        java.lang.Object obj32 = hashMap24.remove((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        int int35 = hashMap33.size();
        int int36 = hashMap33.size();
        hashMap33.modCount = (short) 0;
        java.lang.Object obj39 = hashMap24.remove((java.lang.Object) hashMap33);
        java.lang.Object obj40 = hashMap8.put((java.lang.Object) 10L, obj39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap8.table = entryArray16;
        hashMap4.table = entryArray16;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1L);
        hashMap20.clear();
        int int24 = hashMap20.modCount;
        int int25 = hashMap20.modCount;
        java.lang.Object obj26 = hashMap0.remove((java.lang.Object) int25);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1L);
        hashMap27.clear();
        hashMap27.clear();
        java.lang.Object obj33 = hashMap27.remove((java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        hashMap34.clear();
        int int36 = hashMap34.size();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap37.remove((java.lang.Object) 1L);
        hashMap37.clear();
        java.lang.Object obj41 = hashMap34.get((java.lang.Object) hashMap37);
        java.lang.Object obj42 = hashMap0.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap8.modCount = (byte) 10;
        hashMap8.clear();
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap20.table;
        boolean boolean22 = hashMap20.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(11);
        java.lang.Object obj26 = hashMap20.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        int int28 = hashMap27.size();
        java.lang.Object obj30 = hashMap27.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap27.table = entryArray33;
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap27.table;
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) hashMap25, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', 1.0f);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap6.remove((java.lang.Object) (short) 100);
        int int10 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        java.lang.Object obj12 = hashMap5.get((java.lang.Object) entryArray11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        boolean boolean16 = hashMap14.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        boolean boolean20 = hashMap18.isEmpty();
        int int21 = hashMap18.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        hashMap22.clear();
        java.lang.Object obj25 = hashMap22.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 1L);
        hashMap26.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        hashMap22.table = entryArray30;
        hashMap18.table = entryArray30;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap18.table;
        hashMap14.table = entryArray33;
        java.lang.Object obj35 = hashMap5.get((java.lang.Object) entryArray33);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        boolean boolean41 = hashMap39.isEmpty();
        boolean boolean42 = hashMap39.isEmpty();
        java.lang.Object obj43 = hashMap36.get((java.lang.Object) boolean42);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        hashMap44.clear();
        java.lang.Object obj47 = hashMap44.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap48.remove((java.lang.Object) 1L);
        hashMap48.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap48.table;
        hashMap44.table = entryArray52;
        hashMap44.clear();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap55.remove((java.lang.Object) 1L);
        hashMap55.modCount = (short) 0;
        int int60 = hashMap55.modCount;
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = hashMap55.remove(obj61);
        int int63 = hashMap55.size();
        java.lang.Object obj64 = hashMap44.remove((java.lang.Object) hashMap55);
        java.lang.Object obj66 = hashMap44.remove((java.lang.Object) 2);
        java.lang.Object obj67 = hashMap36.get((java.lang.Object) 2);
        java.lang.Object obj68 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        int int9 = hashMap8.size();
        int int10 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.repOK();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        int int17 = hashMap16.size();
        int int18 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) entryArray19);
        hashMap15.modCount = 2;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1L);
        hashMap23.modCount = (short) 0;
        int int28 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap23.table;
        hashMap23.modCount = (byte) 10;
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap34.table;
        java.lang.Object obj36 = hashMap23.get((java.lang.Object) entryArray35);
        hashMap23.modCount = '#';
        int int39 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap23.table;
        hashMap15.table = entryArray40;
        boolean boolean42 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) 1L);
        hashMap43.clear();
        int int47 = hashMap43.modCount;
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap43.remove(obj48);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        int int52 = hashMap50.modCount;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        boolean boolean54 = hashMap53.repOK();
        java.lang.Object obj55 = hashMap50.get((java.lang.Object) hashMap53);
        java.lang.Object obj56 = hashMap43.remove((java.lang.Object) hashMap50);
        java.lang.Object obj57 = hashMap0.put((java.lang.Object) boolean42, obj56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap8.table = entryArray16;
        hashMap4.table = entryArray16;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        int int21 = hashMap20.size();
        int int22 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) 1L);
        hashMap25.modCount = (short) 0;
        int int30 = hashMap25.size();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap25.table;
        hashMap25.modCount = (byte) 10;
        hashMap25.clear();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap36.table;
        java.lang.Object obj38 = hashMap25.get((java.lang.Object) entryArray37);
        int int39 = hashMap25.size();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 1L);
        hashMap40.modCount = (short) 0;
        int int45 = hashMap40.modCount;
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = hashMap40.remove(obj46);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap40.table;
        hashMap25.table = entryArray48;
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) entryArray48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.isEmpty();
        int int9 = hashMap5.size();
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        hashMap2.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap4);
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        boolean boolean15 = hashMap12.isEmpty();
        int int16 = hashMap12.size();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        int int22 = hashMap21.size();
        int int23 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.get((java.lang.Object) 0.0f);
        hashMap26.clear();
        hashMap26.modCount = 0;
        java.lang.Object obj32 = hashMap21.remove((java.lang.Object) hashMap26);
        hashMap21.clear();
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        int int6 = hashMap5.size();
        int int7 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) entryArray8);
        java.lang.Class<?> wildcardClass10 = entryArray8.getClass();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        boolean boolean13 = hashMap11.isEmpty();
        int int14 = hashMap11.modCount;
        boolean boolean15 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (short) 100);
        int int20 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap16.table;
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) entryArray21);
        int int23 = hashMap11.size();
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) entryArray8, (java.lang.Object) int23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap7.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        hashMap14.clear();
        int int16 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        hashMap17.clear();
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) hashMap17);
        boolean boolean22 = hashMap17.isEmpty();
        java.lang.Class<?> wildcardClass23 = hashMap17.getClass();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        boolean boolean27 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.get((java.lang.Object) 0.0f);
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap28);
        int int32 = hashMap28.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        java.lang.Object obj34 = hashMap7.put((java.lang.Object) wildcardClass23, (java.lang.Object) entryArray33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (short) 100);
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        boolean boolean12 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        hashMap14.clear();
        boolean boolean16 = hashMap14.isEmpty();
        int int17 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1L);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        hashMap18.table = entryArray26;
        hashMap14.table = entryArray26;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap14.table;
        hashMap10.table = entryArray29;
        java.lang.Object obj31 = hashMap1.get((java.lang.Object) entryArray29);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        hashMap35.clear();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.modCount;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        hashMap39.clear();
        java.lang.Object obj42 = hashMap39.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) 1L);
        hashMap43.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap39.table = entryArray47;
        hashMap35.table = entryArray47;
        java.lang.Object obj50 = hashMap32.get((java.lang.Object) hashMap35);
        java.lang.Object obj51 = hashMap1.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap52.remove((java.lang.Object) 1L);
        hashMap52.clear();
        int int56 = hashMap52.modCount;
        int int57 = hashMap52.modCount;
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj61 = hashMap52.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        hashMap62.clear();
        java.lang.Object obj65 = hashMap62.remove((java.lang.Object) (short) 100);
        int int66 = hashMap62.modCount;
        java.lang.Object obj67 = hashMap52.remove((java.lang.Object) int66);
        int int68 = hashMap52.size();
        int int69 = hashMap52.size();
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap();
        hashMap70.clear();
        boolean boolean72 = hashMap70.isEmpty();
        int int73 = hashMap70.modCount;
        system.classfixer.classes.HashMap hashMap74 = new system.classfixer.classes.HashMap();
        hashMap74.clear();
        java.lang.Object obj77 = hashMap74.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap78 = new system.classfixer.classes.HashMap();
        java.lang.Object obj80 = hashMap78.remove((java.lang.Object) 1L);
        hashMap78.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap78.table;
        hashMap74.table = entryArray82;
        hashMap70.table = entryArray82;
        system.classfixer.classes.HashMap.Entry[] entryArray85 = hashMap70.table;
        hashMap52.table = entryArray85;
        hashMap1.table = entryArray85;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1L);
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap8.modCount = (byte) 10;
        hashMap8.clear();
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) hashMap8);
        boolean boolean19 = hashMap0.repOK();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1L);
        boolean boolean25 = hashMap22.repOK();
        int int26 = hashMap22.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1L);
        hashMap27.clear();
        hashMap27.clear();
        java.lang.Object obj33 = hashMap27.remove((java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        int int35 = hashMap34.size();
        java.lang.Object obj37 = hashMap34.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap39.table;
        hashMap34.table = entryArray40;
        hashMap27.table = entryArray40;
        java.lang.Object obj43 = hashMap22.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        hashMap44.clear();
        java.lang.Object obj47 = hashMap44.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap44.table;
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        boolean boolean8 = hashMap0.repOK();
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        int int3 = hashMap0.modCount;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        boolean boolean9 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.get((java.lang.Object) 0.0f);
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        int int15 = hashMap14.size();
        int int16 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.repOK();
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        boolean boolean25 = hashMap23.isEmpty();
        boolean boolean26 = hashMap23.isEmpty();
        java.lang.Object obj27 = hashMap20.get((java.lang.Object) boolean26);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 1L);
        hashMap28.modCount = (short) 0;
        int int33 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap28.table;
        hashMap28.modCount = (byte) 10;
        hashMap28.clear();
        java.lang.Object obj38 = hashMap20.remove((java.lang.Object) hashMap28);
        boolean boolean39 = hashMap20.repOK();
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) boolean39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        hashMap0.modCount = 10;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        int int15 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) (short) 0);
        int int20 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        java.lang.Object obj24 = hashMap10.get((java.lang.Object) entryArray23);
        hashMap0.table = entryArray23;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 1L);
        hashMap26.modCount = (short) 0;
        int int31 = hashMap26.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap26.table;
        hashMap26.modCount = (byte) 10;
        hashMap26.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap26.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        hashMap37.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap42.table;
        boolean boolean44 = hashMap42.repOK();
        java.lang.Object obj45 = hashMap37.get((java.lang.Object) hashMap42);
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) hashMap26, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 10.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        int int4 = hashMap3.size();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap3.table = entryArray10;
        hashMap3.clear();
        java.lang.Class<?> wildcardClass13 = hashMap3.getClass();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(2);
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) wildcardClass13, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.repOK();
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.modCount = (short) 0;
        int int18 = hashMap13.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        java.lang.Object obj22 = hashMap19.remove((java.lang.Object) (short) 100);
        int int23 = hashMap19.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap13.table = entryArray24;
        hashMap6.table = entryArray24;
        java.lang.Object obj27 = hashMap0.put(obj5, (java.lang.Object) entryArray24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        boolean boolean4 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(1, (float) 11);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) 11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        int int6 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.clear();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap12);
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) 100, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }
}

