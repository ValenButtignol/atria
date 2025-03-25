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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        int int5 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap4.table = entryArray9;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.remove(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        int int11 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        hashMap10.table = entryArray15;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        int int21 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int24 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap1.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        int int21 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap25.table;
        java.lang.Object obj27 = hashMap23.get((java.lang.Object) entryArray26);
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap3.put((java.lang.Object) 100, (java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj15 = hashMap10.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap7.put(obj15, obj16);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) 1L);
        boolean boolean24 = hashMap18.isEmpty();
        int int25 = hashMap18.modCount;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = hashMap26.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap26.table;
        hashMap18.table = entryArray33;
        java.lang.Object obj35 = hashMap7.get((java.lang.Object) entryArray33);
        hashMap1.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        int int21 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap22.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap22.table;
        hashMap1.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = hashMap12.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap12.table;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1L);
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.repOK();
        hashMap0.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap10.put((java.lang.Object) 100, (java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        int int21 = hashMap17.modCount;
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap31.table;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = hashMap39.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap39.table;
        hashMap39.modCount = (short) 0;
        java.lang.Object obj49 = hashMap30.put((java.lang.Object) hashMap31, (java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap31.table;
        java.lang.Object obj51 = hashMap10.put((java.lang.Object) entryArray28, (java.lang.Object) entryArray50);
        hashMap0.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        hashMap13.modCount = (short) 0;
        java.lang.Object obj23 = hashMap4.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap13);
        boolean boolean24 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap5.table;
        hashMap2.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap15.modCount = (short) 0;
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap15);
        boolean boolean26 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap7.table;
        hashMap1.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        int int6 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) entryArray11);
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) 1L);
        boolean boolean19 = hashMap13.isEmpty();
        java.lang.Object obj20 = null;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        java.lang.Object obj24 = hashMap13.put(obj20, (java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap13.table;
        hashMap1.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        int int5 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap4.table = entryArray9;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = null;
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = hashMap26.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap26.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap34.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj40 = hashMap34.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap34.table;
        hashMap34.modCount = (short) 0;
        java.lang.Object obj44 = hashMap25.put((java.lang.Object) hashMap26, (java.lang.Object) hashMap34);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap25.table;
        java.lang.Class<?> wildcardClass46 = entryArray45.getClass();
        java.lang.Object obj47 = hashMap2.put((java.lang.Object) 10L, (java.lang.Object) wildcardClass46);
        system.classfixer.classes.HashMap.Entry entry48 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray49 = new system.classfixer.classes.HashMap.Entry[] { entry48 };
        hashMap2.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        hashMap3.clear();
        int int5 = hashMap3.size();
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.repOK();
        hashMap3.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 1L);
        boolean boolean10 = hashMap4.isEmpty();
        boolean boolean11 = hashMap4.repOK();
        hashMap4.modCount = (byte) 10;
        int int14 = hashMap4.size();
        hashMap4.clear();
        boolean boolean16 = hashMap4.repOK();
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) boolean16);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = null;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj22 = hashMap16.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap24.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap24.table;
        hashMap24.modCount = (short) 0;
        java.lang.Object obj34 = hashMap15.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap24);
        boolean boolean35 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap16.table;
        hashMap7.table = entryArray36;
        hashMap3.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap4.put((java.lang.Object) 100, (java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray13;
        int int15 = hashMap11.modCount;
        java.lang.Object obj16 = hashMap4.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj33 = hashMap27.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        hashMap27.modCount = (short) 0;
        java.lang.Object obj37 = hashMap18.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap19.table;
        java.lang.Object obj40 = hashMap4.put((java.lang.Object) entryArray38, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap41.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) 1L);
        boolean boolean47 = hashMap41.isEmpty();
        int int48 = hashMap41.modCount;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap49.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj55 = hashMap49.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap49.table;
        hashMap41.table = entryArray56;
        java.lang.Object obj58 = hashMap3.put(obj40, (java.lang.Object) entryArray56);
        hashMap1.table = entryArray56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        boolean boolean7 = hashMap4.repOK();
        hashMap4.modCount = '4';
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        int int19 = hashMap11.size();
        boolean boolean20 = hashMap11.isEmpty();
        hashMap11.clear();
        boolean boolean22 = hashMap11.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap11.table;
        hashMap4.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap3.put((java.lang.Object) 100, (java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        int int14 = hashMap10.modCount;
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap24.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap32.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj38 = hashMap32.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap32.table;
        hashMap32.modCount = (short) 0;
        java.lang.Object obj42 = hashMap23.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap24.table;
        java.lang.Object obj44 = hashMap3.put((java.lang.Object) entryArray21, (java.lang.Object) entryArray43);
        hashMap2.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap3);
        int int7 = hashMap0.size();
        boolean boolean8 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj17 = hashMap11.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        java.lang.Object obj29 = hashMap10.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap19);
        java.lang.Object obj30 = hashMap0.get((java.lang.Object) hashMap19);
        boolean boolean31 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap34.put((java.lang.Object) 100, (java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray43;
        int int45 = hashMap41.modCount;
        java.lang.Object obj46 = hashMap34.get((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap49.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj55 = hashMap49.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap49.table;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj63 = hashMap57.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap57.table;
        hashMap57.modCount = (short) 0;
        java.lang.Object obj67 = hashMap48.put((java.lang.Object) hashMap49, (java.lang.Object) hashMap57);
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap49.table;
        java.lang.Object obj70 = hashMap34.put((java.lang.Object) entryArray68, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap71 = new system.classfixer.classes.HashMap();
        java.lang.Object obj74 = hashMap71.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj76 = hashMap71.remove((java.lang.Object) 1L);
        boolean boolean77 = hashMap71.isEmpty();
        int int78 = hashMap71.modCount;
        system.classfixer.classes.HashMap hashMap79 = new system.classfixer.classes.HashMap();
        java.lang.Object obj82 = hashMap79.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj85 = hashMap79.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray86 = hashMap79.table;
        hashMap71.table = entryArray86;
        java.lang.Object obj88 = hashMap33.put(obj70, (java.lang.Object) entryArray86);
        hashMap19.table = entryArray86;
        system.classfixer.classes.HashMap hashMap91 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray92 = hashMap91.table;
        hashMap19.table = entryArray92;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap19", hashMap19.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        int int7 = hashMap5.size();
        int int8 = hashMap5.modCount;
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) entryArray11);
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.size();
        boolean boolean9 = hashMap0.repOK();
        boolean boolean10 = hashMap0.repOK();
        int int11 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        hashMap2.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap15.modCount = (short) 0;
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap7.table;
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        boolean boolean6 = hashMap4.isEmpty();
        boolean boolean7 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap4.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) 1L);
        boolean boolean9 = hashMap3.isEmpty();
        java.lang.Object obj10 = null;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap12.table;
        java.lang.Object obj14 = hashMap3.put(obj10, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap3.table;
        java.lang.Object obj16 = hashMap2.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap20.put((java.lang.Object) 100, (java.lang.Object) hashMap24);
        int int26 = hashMap24.size();
        boolean boolean27 = hashMap24.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) '4');
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap32.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) 1L);
        boolean boolean38 = hashMap32.isEmpty();
        int int39 = hashMap32.modCount;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap40.put((java.lang.Object) 100, (java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap(0);
        hashMap47.clear();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj52 = hashMap47.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = hashMap44.put(obj52, obj53);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj58 = hashMap55.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj60 = hashMap55.remove((java.lang.Object) 1L);
        boolean boolean61 = hashMap55.isEmpty();
        int int62 = hashMap55.modCount;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        java.lang.Object obj66 = hashMap63.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj69 = hashMap63.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap63.table;
        hashMap55.table = entryArray70;
        java.lang.Object obj72 = hashMap44.get((java.lang.Object) entryArray70);
        hashMap32.table = entryArray70;
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap(0, 100.0f);
        java.lang.Object obj77 = hashMap24.put((java.lang.Object) entryArray70, (java.lang.Object) hashMap76);
        system.classfixer.classes.HashMap hashMap79 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass80 = hashMap79.getClass();
        java.lang.Object obj81 = hashMap19.put((java.lang.Object) entryArray70, (java.lang.Object) hashMap79);
        hashMap2.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int10 = hashMap9.modCount;
        java.lang.Class<?> wildcardClass11 = hashMap9.getClass();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) wildcardClass11);
        int int13 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) 1L);
        boolean boolean20 = hashMap14.isEmpty();
        int int21 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap22.put((java.lang.Object) 100, (java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj34 = hashMap29.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = hashMap26.put(obj34, obj35);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap37.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj42 = hashMap37.remove((java.lang.Object) 1L);
        boolean boolean43 = hashMap37.isEmpty();
        int int44 = hashMap37.modCount;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = hashMap45.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap45.table;
        hashMap37.table = entryArray52;
        java.lang.Object obj54 = hashMap26.get((java.lang.Object) entryArray52);
        hashMap14.table = entryArray52;
        java.lang.Object obj56 = hashMap7.get((java.lang.Object) entryArray52);
        hashMap1.table = entryArray52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, 1.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        hashMap13.modCount = (short) 0;
        java.lang.Object obj23 = hashMap4.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap5.table;
        hashMap2.table = entryArray24;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap28.put((java.lang.Object) 100, (java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray37;
        int int39 = hashMap35.modCount;
        java.lang.Object obj40 = hashMap28.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap43.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj49 = hashMap43.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap43.table;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = hashMap51.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap51.table;
        hashMap51.modCount = (short) 0;
        java.lang.Object obj61 = hashMap42.put((java.lang.Object) hashMap43, (java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap43.table;
        java.lang.Object obj64 = hashMap28.put((java.lang.Object) entryArray62, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        java.lang.Object obj68 = hashMap65.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj70 = hashMap65.remove((java.lang.Object) 1L);
        boolean boolean71 = hashMap65.isEmpty();
        int int72 = hashMap65.modCount;
        system.classfixer.classes.HashMap hashMap73 = new system.classfixer.classes.HashMap();
        java.lang.Object obj76 = hashMap73.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj79 = hashMap73.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray80 = hashMap73.table;
        hashMap65.table = entryArray80;
        java.lang.Object obj82 = hashMap27.put(obj64, (java.lang.Object) entryArray80);
        hashMap27.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap86 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean87 = hashMap86.isEmpty();
        system.classfixer.classes.HashMap hashMap89 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap89.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray91 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap89.table = entryArray91;
        java.lang.Object obj93 = hashMap86.get((java.lang.Object) entryArray91);
        int int94 = hashMap86.size();
        system.classfixer.classes.HashMap.Entry[] entryArray95 = hashMap86.table;
        java.lang.Object obj97 = hashMap27.put((java.lang.Object) entryArray95, (java.lang.Object) 0);
        hashMap2.table = entryArray95;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 10, 1.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap17.modCount = (short) 0;
        java.lang.Object obj27 = hashMap8.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap9.table;
        hashMap6.table = entryArray28;
        hashMap1.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 10L);
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1L);
        boolean boolean6 = hashMap0.isEmpty();
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj20 = hashMap15.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap12.put(obj20, obj21);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) 1L);
        boolean boolean29 = hashMap23.isEmpty();
        int int30 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap31.table;
        hashMap23.table = entryArray38;
        java.lang.Object obj40 = hashMap12.get((java.lang.Object) entryArray38);
        hashMap0.table = entryArray38;
        hashMap0.modCount = (short) 1;
        int int44 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap(0);
        int int47 = hashMap46.size();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap49.table = entryArray51;
        hashMap46.table = entryArray51;
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap46.table;
        boolean boolean55 = hashMap46.repOK();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap57.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap57.table = entryArray59;
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        hashMap46.table = entryArray61;
        hashMap0.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.size();
        boolean boolean9 = hashMap0.repOK();
        boolean boolean10 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) entryArray17);
        int int20 = hashMap12.size();
        boolean boolean21 = hashMap12.isEmpty();
        hashMap12.clear();
        boolean boolean23 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap12.table;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        int int21 = hashMap1.modCount;
        int int22 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) ' ', (float) 10);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap1.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap17.modCount = (short) 0;
        java.lang.Object obj27 = hashMap8.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap17);
        int int28 = hashMap8.modCount;
        int int29 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap8.table;
        hashMap1.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap1.table;
        int int10 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap11.remove((java.lang.Object) 1L);
        boolean boolean17 = hashMap11.isEmpty();
        int int18 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        hashMap11.table = entryArray26;
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap1.table;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        hashMap25.modCount = (short) 1;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap1.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        hashMap6.table = entryArray11;
        int int14 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        int int7 = hashMap1.size();
        int int8 = hashMap1.modCount;
        int int9 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) 1L);
        boolean boolean16 = hashMap10.isEmpty();
        boolean boolean17 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap1.table;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = hashMap25.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = hashMap33.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        hashMap33.modCount = (short) 0;
        java.lang.Object obj43 = hashMap24.put((java.lang.Object) hashMap25, (java.lang.Object) hashMap33);
        hashMap24.clear();
        int int45 = hashMap24.modCount;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap(0);
        int int48 = hashMap47.size();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap50.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray52;
        hashMap47.table = entryArray52;
        java.lang.Object obj55 = hashMap1.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap(0);
        int int58 = hashMap57.size();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        hashMap57.table = entryArray62;
        int int65 = hashMap57.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap57.table;
        java.lang.Object obj67 = hashMap1.get((java.lang.Object) hashMap57);
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap69.table;
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap69.table;
        hashMap1.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        hashMap2.modCount = 1;
        hashMap2.modCount = 2;
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        int int19 = hashMap15.modCount;
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = hashMap29.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap37.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = hashMap37.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap37.table;
        hashMap37.modCount = (short) 0;
        java.lang.Object obj47 = hashMap28.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap29.table;
        java.lang.Object obj49 = hashMap8.put((java.lang.Object) entryArray26, (java.lang.Object) entryArray48);
        hashMap2.table = entryArray48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap1.table;
        hashMap1.clear();
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        int int21 = hashMap1.modCount;
        boolean boolean22 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean25 = hashMap24.repOK();
        hashMap24.clear();
        int int27 = hashMap24.size();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        hashMap1.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap7);
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
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap15.table;
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) entryArray34, (java.lang.Object) "hi!");
        boolean boolean37 = hashMap0.repOK();
        hashMap0.modCount = (short) 1;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = null;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) hashMap6);
        int int10 = hashMap3.size();
        boolean boolean11 = hashMap3.isEmpty();
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        int int19 = hashMap17.size();
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap17);
        boolean boolean22 = hashMap17.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap17.table;
        hashMap1.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap21.put((java.lang.Object) 100, (java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray30;
        int int32 = hashMap28.modCount;
        java.lang.Object obj33 = hashMap21.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray37;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap42.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj48 = hashMap42.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap42.table;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap50.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj56 = hashMap50.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap50.table;
        hashMap50.modCount = (short) 0;
        java.lang.Object obj60 = hashMap41.put((java.lang.Object) hashMap42, (java.lang.Object) hashMap50);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap42.table;
        java.lang.Object obj62 = hashMap21.put((java.lang.Object) entryArray39, (java.lang.Object) entryArray61);
        java.lang.Object obj63 = hashMap10.get((java.lang.Object) entryArray39);
        int int64 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        java.lang.Object obj70 = hashMap67.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj73 = hashMap67.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray74 = hashMap67.table;
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap();
        java.lang.Object obj78 = hashMap75.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj81 = hashMap75.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap75.table;
        hashMap75.modCount = (short) 0;
        java.lang.Object obj85 = hashMap66.put((java.lang.Object) hashMap67, (java.lang.Object) hashMap75);
        system.classfixer.classes.HashMap.Entry[] entryArray86 = hashMap66.table;
        hashMap10.table = entryArray86;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) 100, (java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        int int13 = hashMap9.modCount;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = hashMap25.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap25.modCount = (short) 0;
        java.lang.Object obj35 = hashMap16.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap17.table;
        java.lang.Object obj38 = hashMap2.put((java.lang.Object) entryArray36, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj44 = hashMap39.remove((java.lang.Object) 1L);
        boolean boolean45 = hashMap39.isEmpty();
        int int46 = hashMap39.modCount;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap47.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj53 = hashMap47.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap47.table;
        hashMap39.table = entryArray54;
        java.lang.Object obj56 = hashMap1.put(obj38, (java.lang.Object) entryArray54);
        boolean boolean57 = hashMap1.isEmpty();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1L);
        boolean boolean6 = hashMap0.isEmpty();
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj20 = hashMap15.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap12.put(obj20, obj21);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) 1L);
        boolean boolean29 = hashMap23.isEmpty();
        int int30 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap31.table;
        hashMap23.table = entryArray38;
        java.lang.Object obj40 = hashMap12.get((java.lang.Object) entryArray38);
        hashMap0.table = entryArray38;
        boolean boolean42 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap44.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj50 = hashMap44.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap44.table;
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap44.table;
        int int53 = hashMap44.size();
        java.lang.Object obj54 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean57 = hashMap56.isEmpty();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap59.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap59.table = entryArray61;
        java.lang.Object obj63 = hashMap56.get((java.lang.Object) entryArray61);
        hashMap56.clear();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        java.lang.Object obj68 = hashMap65.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap65.clear();
        java.lang.Object obj70 = hashMap56.remove((java.lang.Object) hashMap65);
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap56.table;
        hashMap0.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap17.modCount = (short) 0;
        java.lang.Object obj27 = hashMap8.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap8.table;
        java.lang.Object obj29 = hashMap0.remove((java.lang.Object) hashMap8);
        boolean boolean30 = hashMap8.repOK();
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap32.put((java.lang.Object) 100, (java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        int int43 = hashMap39.modCount;
        java.lang.Object obj44 = hashMap32.get((java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap46.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap46.table = entryArray48;
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap46.table;
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap53.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap53.table;
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap();
        java.lang.Object obj64 = hashMap61.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj67 = hashMap61.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap61.table;
        hashMap61.modCount = (short) 0;
        java.lang.Object obj71 = hashMap52.put((java.lang.Object) hashMap53, (java.lang.Object) hashMap61);
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap53.table;
        java.lang.Object obj73 = hashMap32.put((java.lang.Object) entryArray50, (java.lang.Object) entryArray72);
        hashMap8.table = entryArray72;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        int int12 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap3.table;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.remove(obj3);
        hashMap1.clear();
        int int6 = hashMap1.size();
        boolean boolean7 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean12 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        int int22 = hashMap14.size();
        boolean boolean23 = hashMap14.isEmpty();
        hashMap14.clear();
        boolean boolean25 = hashMap14.repOK();
        java.lang.Object obj26 = hashMap8.get((java.lang.Object) hashMap14);
        boolean boolean27 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap8.table;
        hashMap1.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap1.table;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = hashMap25.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = hashMap33.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        hashMap33.modCount = (short) 0;
        java.lang.Object obj43 = hashMap24.put((java.lang.Object) hashMap25, (java.lang.Object) hashMap33);
        hashMap24.clear();
        int int45 = hashMap24.modCount;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap(0);
        int int48 = hashMap47.size();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap50.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray52;
        hashMap47.table = entryArray52;
        java.lang.Object obj55 = hashMap1.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap(0);
        int int58 = hashMap57.size();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        hashMap57.table = entryArray62;
        int int65 = hashMap57.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap57.table;
        java.lang.Object obj67 = hashMap1.get((java.lang.Object) hashMap57);
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap(4, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap70.table;
        hashMap57.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap57", hashMap57.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap23.table;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap23.table;
        java.lang.Class<?> wildcardClass32 = entryArray31.getClass();
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass32);
        boolean boolean34 = hashMap2.repOK();
        int int35 = hashMap2.size();
        int int36 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int39 = hashMap38.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap2.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        hashMap2.modCount = 1;
        hashMap2.modCount = 2;
        hashMap2.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = null;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }
}

