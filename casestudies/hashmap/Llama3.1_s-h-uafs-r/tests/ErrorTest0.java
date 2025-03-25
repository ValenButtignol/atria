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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        hashMap11.clear();
        int int14 = hashMap11.modCount;
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) boolean9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(3);
        int int5 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) 0.0f, (java.lang.Object) entryArray6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        int int9 = hashMap6.modCount;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) int9, (java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(3);
        hashMap3.clear();
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) (short) 100);
        hashMap7.clear();
        boolean boolean11 = hashMap7.isEmpty();
        hashMap7.clear();
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        hashMap15.table = entryArray17;
        hashMap15.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap7.table = entryArray22;
        hashMap3.table = entryArray22;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap27.modCount = (short) 0;
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        int int7 = hashMap4.modCount;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 0);
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap6.table = entryArray9;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) 0L, (java.lang.Object) entryArray9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(3);
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        int int12 = hashMap8.modCount;
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) int12);
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) 10L, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        hashMap1.clear();
        hashMap1.modCount = 0;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(3);
        hashMap7.clear();
        hashMap7.modCount = 0;
        boolean boolean11 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int14 = hashMap13.size();
        hashMap13.modCount = '#';
        boolean boolean17 = hashMap13.repOK();
        int int18 = hashMap13.modCount;
        boolean boolean19 = hashMap13.repOK();
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) boolean11, (java.lang.Object) hashMap13);
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
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) (short) 0, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap3.table = entryArray5;
        hashMap3.modCount = (byte) 100;
        boolean boolean10 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap11.table;
        int int17 = hashMap11.modCount;
        boolean boolean18 = hashMap11.isEmpty();
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) boolean10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        int int7 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        hashMap11.modCount = 1;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) (short) -1);
        int int21 = hashMap11.modCount;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) (-1L), (java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap3.table = entryArray9;
        hashMap3.clear();
        boolean boolean13 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap16.modCount = (short) 0;
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) boolean13, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap7.table;
        hashMap5.table = entryArray14;
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) entryArray14, (java.lang.Object) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) '#', 1.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap8.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) entryArray16);
        int int19 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap22.table = entryArray24;
        hashMap21.table = entryArray24;
        hashMap14.table = entryArray24;
        hashMap8.table = entryArray24;
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.modCount = 1;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) (short) -1);
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(10, 10.0f);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        hashMap15.clear();
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) hashMap15);
        boolean boolean18 = hashMap13.repOK();
        boolean boolean19 = hashMap13.repOK();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) boolean19, (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        hashMap6.modCount = '#';
        boolean boolean10 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap19.table = entryArray21;
        hashMap18.table = entryArray21;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        hashMap11.table = entryArray25;
        java.lang.Object obj27 = hashMap6.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) (short) 100);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap11, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.size();
        hashMap1.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        hashMap8.clear();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        boolean boolean13 = hashMap8.repOK();
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) boolean13);
        boolean boolean15 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        java.lang.Object obj21 = hashMap17.remove((java.lang.Object) entryArray19);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) (short) 100);
        hashMap23.clear();
        boolean boolean27 = hashMap23.isEmpty();
        hashMap23.clear();
        hashMap23.modCount = 1;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap31.table = entryArray33;
        hashMap31.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap31.table;
        hashMap23.table = entryArray38;
        hashMap23.clear();
        boolean boolean41 = hashMap23.repOK();
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap46.table = entryArray47;
        hashMap44.table = entryArray47;
        hashMap23.table = entryArray47;
        int int51 = hashMap23.modCount;
        java.lang.Object obj52 = hashMap1.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) entryArray11);
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(100, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        int int22 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        boolean boolean27 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray32;
        hashMap29.table = entryArray32;
        hashMap25.table = entryArray32;
        hashMap18.table = entryArray32;
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(3);
        int int10 = hashMap9.size();
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) int10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        hashMap13.clear();
        java.lang.Class<?> wildcardClass16 = hashMap13.getClass();
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) int10, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.modCount = (short) 0;
        boolean boolean5 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap6.modCount = (byte) 100;
        hashMap6.modCount = 2;
        boolean boolean15 = hashMap6.isEmpty();
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap20.table = entryArray22;
        hashMap20.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap20.table;
        hashMap18.table = entryArray27;
        hashMap18.clear();
        hashMap18.modCount = (short) -1;
        java.lang.Object obj32 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        hashMap1.clear();
        hashMap1.modCount = 0;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap8.modCount = (byte) 0;
        boolean boolean11 = hashMap8.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMap8.getClass();
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) ' ', (java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        boolean boolean7 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        boolean boolean11 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.size();
        hashMap14.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        hashMap21.clear();
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        boolean boolean26 = hashMap21.repOK();
        java.lang.Object obj27 = hashMap14.get((java.lang.Object) boolean26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        hashMap14.table = entryArray30;
        java.lang.Object obj32 = hashMap1.put((java.lang.Object) entryArray12, (java.lang.Object) entryArray30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        int int11 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap14.table = entryArray16;
        hashMap10.table = entryArray16;
        int int20 = hashMap10.modCount;
        int int21 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) (short) 100);
        hashMap22.clear();
        boolean boolean26 = hashMap22.isEmpty();
        hashMap22.clear();
        hashMap22.modCount = 1;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray32;
        hashMap30.table = entryArray32;
        hashMap30.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap30.table;
        hashMap22.table = entryArray37;
        hashMap22.clear();
        boolean boolean40 = hashMap22.repOK();
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        int int9 = hashMap6.modCount;
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap12.table = entryArray15;
        hashMap6.table = entryArray15;
        int int19 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap6.table;
        java.lang.Object obj21 = hashMap4.remove((java.lang.Object) entryArray20);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap22.modCount = ' ';
        java.lang.Object obj27 = hashMap4.remove((java.lang.Object) hashMap22);
        java.lang.Object obj29 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 1.0f);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 10);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) (byte) 10, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 100L);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap16.table = entryArray19;
        hashMap10.table = entryArray19;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap6.modCount = (short) 0;
        hashMap6.clear();
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 10);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(10, 10.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(100, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        int int14 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap21.table = entryArray24;
        hashMap17.table = entryArray24;
        hashMap9.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap9.table;
        java.lang.Object obj30 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        hashMap1.clear();
        hashMap1.modCount = 0;
        boolean boolean5 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        boolean boolean9 = hashMap7.isEmpty();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) '4');
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) hashMap16);
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 10.0f);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap5.table = entryArray8;
        boolean boolean12 = hashMap5.repOK();
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        hashMap18.clear();
        int int21 = hashMap18.modCount;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap24.table = entryArray27;
        hashMap18.table = entryArray27;
        int int31 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap18.table;
        java.lang.Object obj33 = hashMap16.remove((java.lang.Object) entryArray32);
        java.lang.Object obj34 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 35);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) '#', 1.0f);
        int int7 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        hashMap9.clear();
        int int12 = hashMap9.modCount;
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap15.table = entryArray18;
        hashMap9.table = entryArray18;
        int int22 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap9.table;
        hashMap9.modCount = '#';
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) int7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap10.table = entryArray13;
        hashMap4.table = entryArray13;
        hashMap4.modCount = 0;
        java.lang.Object obj19 = hashMap1.get((java.lang.Object) hashMap4);
        hashMap1.modCount = 3;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(1, (float) 10L);
        boolean boolean25 = hashMap24.repOK();
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        boolean boolean30 = hashMap29.isEmpty();
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap24, (java.lang.Object) boolean30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap12.table = entryArray15;
        hashMap6.table = entryArray15;
        hashMap2.table = entryArray15;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 1);
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }
}

