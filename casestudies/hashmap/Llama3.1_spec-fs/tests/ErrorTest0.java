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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.get(obj10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        hashMap13.clear();
        int int16 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj18 = hashMap7.remove((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap20.table = entryArray23;
        hashMap20.modCount = (short) 100;
        java.lang.Object obj28 = hashMap1.put(obj18, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.modCount = 10;
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(10);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) 10, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        hashMap3.clear();
        int int7 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap10.modCount = (short) 0;
        int int13 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (short) 100);
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        hashMap12.table = entryArray14;
        hashMap11.table = entryArray14;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap11.table;
        hashMap4.table = entryArray18;
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) entryArray18, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        hashMap0.modCount = (byte) 0;
        hashMap0.clear();
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.size();
        boolean boolean12 = hashMap8.isEmpty();
        java.lang.Object obj13 = hashMap0.put(obj6, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap4.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.repOK();
        boolean boolean9 = hashMap6.repOK();
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 100);
        hashMap13.clear();
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.repOK();
        boolean boolean19 = hashMap13.repOK();
        int int20 = hashMap13.modCount;
        hashMap13.modCount = ' ';
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap(3);
        hashMap26.clear();
        hashMap26.modCount = 0;
        int int30 = hashMap26.modCount;
        boolean boolean31 = hashMap26.repOK();
        java.lang.Object obj32 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int3 = hashMap2.size();
        boolean boolean4 = hashMap2.repOK();
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int8 = hashMap7.size();
        boolean boolean9 = hashMap7.repOK();
        boolean boolean10 = hashMap7.repOK();
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) (short) 100);
        hashMap17.clear();
        boolean boolean21 = hashMap17.isEmpty();
        hashMap17.clear();
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) hashMap17);
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.repOK();
        boolean boolean9 = hashMap6.repOK();
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 100);
        hashMap13.clear();
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.repOK();
        boolean boolean19 = hashMap13.repOK();
        int int20 = hashMap13.modCount;
        hashMap13.modCount = ' ';
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) (short) 100);
        hashMap25.clear();
        boolean boolean29 = hashMap25.isEmpty();
        boolean boolean30 = hashMap25.repOK();
        boolean boolean31 = hashMap25.repOK();
        int int32 = hashMap25.modCount;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        hashMap33.modCount = 10;
        boolean boolean36 = hashMap33.repOK();
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap33);
        java.lang.Object obj38 = hashMap13.put((java.lang.Object) (-1), (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap13", hashMap13.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        hashMap3.clear();
        boolean boolean7 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(10);
        java.lang.Object obj11 = hashMap3.get((java.lang.Object) hashMap10);
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap15.modCount = (short) 0;
        hashMap15.clear();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        boolean boolean22 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        hashMap20.table = entryArray26;
        hashMap20.clear();
        boolean boolean30 = hashMap20.repOK();
        java.lang.Object obj31 = hashMap15.remove((java.lang.Object) hashMap20);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap3.put((java.lang.Object) hashMap20, obj32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        int int6 = hashMap1.modCount;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) hashMap10);
        boolean boolean15 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) (short) 100);
        hashMap16.clear();
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.repOK();
        boolean boolean22 = hashMap16.repOK();
        int int23 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int26 = hashMap25.size();
        boolean boolean27 = hashMap25.repOK();
        hashMap25.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int31 = hashMap30.size();
        boolean boolean32 = hashMap30.repOK();
        boolean boolean33 = hashMap30.repOK();
        java.lang.Object obj35 = hashMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = hashMap25.get((java.lang.Object) hashMap30);
        hashMap30.modCount = 100;
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) int23, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) entryArray12, (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        int int6 = hashMap1.modCount;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) hashMap10);
        int int15 = hashMap1.size();
        int int16 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap17.table = entryArray19;
        hashMap17.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.repOK();
        java.lang.Object obj27 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) boolean26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        hashMap1.clear();
        int int5 = hashMap1.modCount;
        hashMap1.modCount = ' ';
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap9.table = entryArray12;
        boolean boolean16 = hashMap9.repOK();
        hashMap9.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        boolean boolean27 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray32;
        hashMap29.table = entryArray32;
        hashMap23.table = entryArray32;
        hashMap19.table = entryArray32;
        hashMap19.modCount = (byte) 10;
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        hashMap4.table = entryArray10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.repOK();
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.repOK();
        boolean boolean9 = hashMap6.repOK();
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) (byte) 1, (java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap1.table = entryArray5;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap16.table;
        java.lang.Class<?> wildcardClass18 = entryArray17.getClass();
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) entryArray14, (java.lang.Object) entryArray17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap5.modCount = (short) 0;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(3);
        int int11 = hashMap10.size();
        hashMap10.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) entryArray17);
        hashMap10.clear();
        java.lang.Class<?> wildcardClass20 = hashMap10.getClass();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        int int26 = hashMap22.size();
        java.lang.Object obj27 = hashMap5.put((java.lang.Object) wildcardClass20, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (short) 100);
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.clear();
        boolean boolean10 = hashMap4.isEmpty();
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap4);
        hashMap4.clear();
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) (short) 100);
        hashMap14.clear();
        boolean boolean18 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        hashMap20.clear();
        int int23 = hashMap20.modCount;
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray29;
        hashMap26.table = entryArray29;
        hashMap20.table = entryArray29;
        java.lang.Object obj33 = hashMap14.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        int int36 = hashMap35.size();
        boolean boolean37 = hashMap35.repOK();
        java.lang.Object obj38 = hashMap4.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap5.clear();
        hashMap5.modCount = (byte) 10;
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(3);
        int int4 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) entryArray5);
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) '#', 1.0f);
        int int11 = hashMap10.size();
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        hashMap17.clear();
        int int20 = hashMap17.modCount;
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap23.table = entryArray26;
        hashMap17.table = entryArray26;
        int int30 = hashMap17.size();
        int int31 = hashMap17.modCount;
        int int32 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap17.table;
        hashMap14.table = entryArray33;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) boolean12, (java.lang.Object) entryArray33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        int int8 = hashMap4.modCount;
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray13;
        boolean boolean15 = hashMap11.isEmpty();
        java.lang.Object obj16 = hashMap1.get((java.lang.Object) boolean15);
        int int17 = hashMap1.size();
        hashMap1.modCount = 3;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray23;
        int int25 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        boolean boolean27 = hashMap21.isEmpty();
        hashMap21.modCount = 'a';
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int32 = hashMap31.size();
        boolean boolean33 = hashMap31.repOK();
        hashMap31.clear();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int37 = hashMap36.size();
        boolean boolean38 = hashMap36.repOK();
        boolean boolean39 = hashMap36.repOK();
        java.lang.Object obj41 = hashMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj42 = hashMap31.get((java.lang.Object) hashMap36);
        hashMap31.clear();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap8.clear();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) 0L, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(35, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        hashMap1.modCount = (short) -1;
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        int int11 = hashMap7.size();
        java.lang.Object obj12 = hashMap1.put(obj5, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(1);
        hashMap13.modCount = (byte) -1;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap17.clear();
        boolean boolean19 = hashMap17.repOK();
        int int20 = hashMap17.size();
        hashMap17.clear();
        java.lang.Object obj22 = hashMap6.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        int int7 = hashMap4.modCount;
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap10.table = entryArray13;
        hashMap4.table = entryArray13;
        int int17 = hashMap4.size();
        int int18 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.repOK();
        hashMap19.modCount = (byte) 0;
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) 0);
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) int18, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(3);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(3);
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.repOK();
        hashMap5.modCount = 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        hashMap11.modCount = 1;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap19.table = entryArray21;
        hashMap19.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        hashMap11.table = entryArray26;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap11.table;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap11.table;
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(3);
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        hashMap5.modCount = (byte) 0;
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) hashMap5);
        hashMap1.modCount = 100;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.modCount = 10;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap13, (java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(4, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        boolean boolean4 = hashMap2.isEmpty();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        hashMap8.modCount = (byte) 100;
        hashMap8.modCount = 2;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) entryArray20);
        int int23 = hashMap18.modCount;
        java.lang.Object obj25 = hashMap18.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray29;
        java.lang.Object obj31 = hashMap18.get((java.lang.Object) hashMap27);
        boolean boolean32 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(3);
        int int35 = hashMap34.size();
        hashMap34.modCount = (short) -1;
        int int38 = hashMap34.modCount;
        java.lang.Object obj39 = hashMap18.remove((java.lang.Object) hashMap34);
        java.lang.Object obj40 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray7;
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap12.modCount = (short) 0;
        int int15 = hashMap12.size();
        boolean boolean16 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap12.table;
        hashMap12.clear();
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) int9, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(3);
        int int11 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) boolean24);
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) boolean24);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(3);
        hashMap28.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(3);
        int int33 = hashMap32.size();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        int int37 = hashMap35.size();
        int int38 = hashMap35.size();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) (short) 100);
        hashMap39.clear();
        boolean boolean43 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap(3);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap39.table = entryArray47;
        hashMap35.table = entryArray47;
        hashMap32.table = entryArray47;
        java.lang.Object obj51 = hashMap0.put((java.lang.Object) hashMap28, (java.lang.Object) entryArray47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        hashMap1.clear();
        int int5 = hashMap1.modCount;
        hashMap1.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(1);
        int int11 = hashMap10.size();
        int int12 = hashMap10.modCount;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        hashMap0.modCount = (byte) 0;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap14.table = entryArray16;
        hashMap13.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        hashMap6.table = entryArray20;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap24.modCount = (short) 0;
        int int27 = hashMap24.modCount;
        hashMap24.modCount = (short) 1;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
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
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap6);
        int int20 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap23.modCount = (short) 0;
        int int26 = hashMap23.size();
        boolean boolean27 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj32 = hashMap23.get((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap23.table;
        hashMap0.table = entryArray33;
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap36.table;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(3);
        int int40 = hashMap39.size();
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) int40);
        int int42 = hashMap36.modCount;
        hashMap36.modCount = 10;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap45.remove((java.lang.Object) (short) 100);
        hashMap45.clear();
        boolean boolean49 = hashMap45.isEmpty();
        hashMap45.clear();
        boolean boolean51 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap45.table;
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) 10, (java.lang.Object) entryArray52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap5.modCount = (short) 0;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap5);
        int int9 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) 100);
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        hashMap11.modCount = 1;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) (short) -1);
        int int21 = hashMap11.modCount;
        int int22 = hashMap11.modCount;
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
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap23.table;
        java.lang.Object obj41 = hashMap11.get((java.lang.Object) hashMap23);
        boolean boolean42 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.repOK();
        boolean boolean45 = hashMap43.repOK();
        hashMap43.modCount = (byte) 0;
        hashMap43.clear();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) 0);
        java.lang.Object obj52 = hashMap11.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        hashMap54.clear();
        int int57 = hashMap54.modCount;
        hashMap54.clear();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap62.table = entryArray63;
        hashMap60.table = entryArray63;
        hashMap54.table = entryArray63;
        int int67 = hashMap54.size();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap54.table;
        java.lang.Object obj69 = hashMap11.remove((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap11.table;
        java.lang.Object obj71 = hashMap0.put((java.lang.Object) 10.0f, (java.lang.Object) entryArray70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 100);
        hashMap3.clear();
        boolean boolean7 = hashMap3.isEmpty();
        hashMap3.clear();
        boolean boolean9 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        java.lang.Class<?> wildcardClass11 = hashMap3.getClass();
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) wildcardClass11, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.repOK();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        java.lang.Class<?> wildcardClass7 = hashMap5.getClass();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        java.lang.Object obj19 = hashMap15.remove((java.lang.Object) entryArray17);
        int int20 = hashMap15.modCount;
        java.lang.Object obj22 = hashMap15.get((java.lang.Object) (-1L));
        int int23 = hashMap15.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        hashMap26.table = entryArray28;
        hashMap25.table = entryArray28;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap15.table = entryArray32;
        hashMap10.table = entryArray32;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap37.modCount = (short) 0;
        int int40 = hashMap37.modCount;
        java.lang.Object obj41 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(4, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.modCount = 1;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) (short) -1);
        int int10 = hashMap0.modCount;
        int int11 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) (short) 100);
        hashMap12.clear();
        boolean boolean16 = hashMap12.isEmpty();
        hashMap12.clear();
        hashMap12.modCount = 1;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap20.table = entryArray22;
        hashMap20.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap20.table;
        hashMap12.table = entryArray27;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap12.table;
        java.lang.Object obj30 = hashMap0.get((java.lang.Object) hashMap12);
        boolean boolean31 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.repOK();
        boolean boolean34 = hashMap32.repOK();
        hashMap32.modCount = (byte) 0;
        hashMap32.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj40 = hashMap32.remove((java.lang.Object) 0);
        java.lang.Object obj41 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap43.clear();
        hashMap43.clear();
        int int46 = hashMap43.modCount;
        hashMap43.clear();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap51.table = entryArray52;
        hashMap49.table = entryArray52;
        hashMap43.table = entryArray52;
        int int56 = hashMap43.size();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap43.table;
        java.lang.Object obj58 = hashMap0.remove((java.lang.Object) hashMap43);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        hashMap60.clear();
        int int63 = hashMap60.modCount;
        hashMap60.clear();
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap66.clear();
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray69 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap68.table = entryArray69;
        hashMap66.table = entryArray69;
        hashMap60.table = entryArray69;
        int int73 = hashMap60.size();
        int int74 = hashMap60.modCount;
        int int75 = hashMap60.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap60.table;
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) entryArray76, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.modCount = (short) 0;
        int int5 = hashMap2.size();
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(1);
        int int9 = hashMap8.size();
        java.lang.Object obj10 = hashMap2.put(obj6, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        hashMap1.clear();
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(3);
        hashMap7.clear();
        hashMap7.modCount = 0;
        int int11 = hashMap7.modCount;
        boolean boolean12 = hashMap7.repOK();
        int int13 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        hashMap15.clear();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        java.lang.Object obj24 = hashMap20.remove((java.lang.Object) entryArray22);
        int int25 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        java.lang.Object obj27 = hashMap15.get((java.lang.Object) entryArray26);
        int int28 = hashMap15.modCount;
        java.lang.Object obj29 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) int28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) entryArray3);
        boolean boolean6 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        boolean boolean10 = hashMap8.isEmpty();
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) hashMap8);
        boolean boolean12 = hashMap1.repOK();
        int int13 = hashMap1.modCount;
        boolean boolean14 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap16.clear();
        hashMap16.modCount = (byte) 10;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap16.remove(obj20);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        boolean boolean24 = hashMap22.isEmpty();
        hashMap22.modCount = (byte) 10;
        java.lang.Object obj27 = hashMap16.get((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(3);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(3);
        int int33 = hashMap32.size();
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) int33);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int38 = hashMap37.size();
        hashMap37.modCount = '#';
        boolean boolean41 = hashMap37.repOK();
        boolean boolean42 = hashMap37.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap37.table;
        int int44 = hashMap37.modCount;
        java.lang.Object obj45 = hashMap29.remove((java.lang.Object) int44);
        java.lang.Object obj46 = hashMap1.put(obj27, (java.lang.Object) int44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        hashMap5.table = entryArray11;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(3);
        int int16 = hashMap15.size();
        hashMap15.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        java.lang.Object obj23 = hashMap15.remove((java.lang.Object) entryArray22);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        hashMap25.clear();
        int int28 = hashMap25.modCount;
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap15.table = entryArray30;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        hashMap33.table = entryArray39;
        hashMap15.table = entryArray39;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap15.table;
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

