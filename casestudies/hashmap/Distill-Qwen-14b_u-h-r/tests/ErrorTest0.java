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
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
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
        int int9 = hashMap0.size();
        int int10 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int13 = hashMap12.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        int int9 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        int int10 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        hashMap9.table = entryArray14;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.remove(obj3);
        hashMap1.clear();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int45 = hashMap44.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) entryArray46);
        hashMap1.table = entryArray46;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap50.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray52;
        hashMap50.modCount = 0;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap(0);
        int int58 = hashMap57.size();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        hashMap57.table = entryArray62;
        java.lang.Object obj65 = hashMap1.put((java.lang.Object) hashMap50, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int24 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) entryArray25);
        int int27 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        hashMap2.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean7 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        hashMap18.modCount = (short) 0;
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap18);
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
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int53 = hashMap52.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap52.table;
        java.lang.Object obj55 = hashMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) entryArray54);
        hashMap9.table = entryArray54;
        java.lang.Object obj57 = hashMap3.get((java.lang.Object) entryArray54);
        hashMap2.table = entryArray54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean12 = hashMap8.repOK();
        boolean boolean13 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap4.table = entryArray14;
        hashMap4.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap2.table;
        boolean boolean22 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = null;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        hashMap23.modCount = 0;
        java.lang.Object obj29 = hashMap21.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap23.table = entryArray32;
        hashMap2.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean14 = hashMap10.repOK();
        boolean boolean15 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        java.lang.Object obj17 = hashMap9.get((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap0.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
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
        boolean boolean21 = hashMap10.repOK();
        hashMap10.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap4.remove(obj6);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap4.table = entryArray10;
        hashMap1.table = entryArray10;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.isEmpty();
        boolean boolean7 = hashMap1.isEmpty();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        boolean boolean9 = hashMap4.repOK();
        hashMap4.clear();
        int int11 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        int int17 = hashMap13.modCount;
        boolean boolean18 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap4.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.remove(obj3);
        hashMap1.clear();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) (byte) -1);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) (short) 1);
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) (short) 1, (java.lang.Object) 2);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        hashMap24.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap24.table;
        java.lang.Object obj31 = hashMap1.get((java.lang.Object) entryArray30);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap(0);
        int int34 = hashMap33.size();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray38;
        hashMap33.table = entryArray38;
        hashMap1.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap7.table;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        boolean boolean7 = hashMap1.repOK();
        hashMap1.clear();
        hashMap1.modCount = ' ';
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 1);
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        hashMap15.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        hashMap23.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap23.table;
        hashMap15.table = entryArray29;
        hashMap1.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap3.remove(obj5);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap3.table = entryArray9;
        boolean boolean11 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap22.modCount = (short) 0;
        java.lang.Object obj32 = hashMap13.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap14.table;
        hashMap3.table = entryArray33;
        boolean boolean35 = hashMap3.isEmpty();
        java.lang.Object obj36 = hashMap1.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (short) 100);
        java.lang.Object obj40 = hashMap1.put((java.lang.Object) hashMap38, (java.lang.Object) "");
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
        hashMap51.clear();
        boolean boolean63 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap51.table;
        hashMap1.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean6 = hashMap2.repOK();
        boolean boolean7 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) entryArray8);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj21 = hashMap16.put((java.lang.Object) 0, (java.lang.Object) "hi!");
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
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int47 = hashMap46.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap46.table;
        java.lang.Object obj49 = hashMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) entryArray48);
        java.lang.Object obj50 = hashMap16.put((java.lang.Object) 0L, obj49);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap51.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap51.put((java.lang.Object) 100, (java.lang.Object) hashMap55);
        int int57 = hashMap55.size();
        hashMap55.clear();
        java.lang.Object obj59 = hashMap16.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap16.table;
        hashMap1.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap1.table = entryArray7;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean13 = hashMap9.repOK();
        boolean boolean14 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(97, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean7 = hashMap3.repOK();
        boolean boolean8 = hashMap3.isEmpty();
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) boolean8);
        java.lang.Object obj10 = null;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap11.put((java.lang.Object) 100, (java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass20 = hashMap17.getClass();
        java.lang.Object obj21 = hashMap11.get((java.lang.Object) hashMap17);
        java.lang.Object obj22 = hashMap2.put(obj10, (java.lang.Object) hashMap17);
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
        hashMap33.clear();
        hashMap33.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap48.clear();
        java.lang.Object obj51 = hashMap48.get((java.lang.Object) (short) 1);
        int int52 = hashMap48.modCount;
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap54.table;
        int int56 = hashMap54.size();
        java.lang.Object obj57 = hashMap33.put((java.lang.Object) hashMap48, (java.lang.Object) hashMap54);
        hashMap48.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap61.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap61.table = entryArray63;
        int int65 = hashMap61.modCount;
        boolean boolean66 = hashMap61.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap61.table;
        hashMap48.table = entryArray67;
        hashMap17.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap2.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean6 = hashMap2.repOK();
        boolean boolean7 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) entryArray8);
        boolean boolean10 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean19 = hashMap18.isEmpty();
        java.lang.Class<?> wildcardClass20 = hashMap18.getClass();
        java.lang.Object obj21 = hashMap11.put(obj16, (java.lang.Object) wildcardClass20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        int int24 = hashMap23.size();
        java.lang.Object obj25 = hashMap11.remove((java.lang.Object) int24);
        boolean boolean26 = hashMap11.repOK();
        int int27 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap28.put((java.lang.Object) 100, (java.lang.Object) hashMap32);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap32.get(obj34);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap32.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        hashMap38.modCount = 100;
        boolean boolean42 = hashMap38.repOK();
        java.lang.Object obj43 = hashMap11.put((java.lang.Object) entryArray36, (java.lang.Object) hashMap38);
        hashMap1.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap4.clear();
        hashMap4.modCount = (byte) 0;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap4);
        int int12 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        hashMap18.modCount = (short) 0;
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int32 = hashMap31.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        java.lang.Object obj34 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) 0L, obj34);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 0.0f);
        int int39 = hashMap36.modCount;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap36.get(obj40);
        java.lang.Object obj42 = hashMap1.get((java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap47.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap47.table = entryArray49;
        java.lang.Object obj51 = hashMap44.get((java.lang.Object) entryArray49);
        int int52 = hashMap44.size();
        boolean boolean53 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap55.table;
        java.lang.Object obj57 = hashMap44.get((java.lang.Object) entryArray56);
        java.lang.Object obj58 = hashMap36.remove((java.lang.Object) entryArray56);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        int int64 = hashMap60.modCount;
        hashMap60.modCount = (byte) 0;
        boolean boolean67 = hashMap60.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap60.table;
        hashMap36.table = entryArray68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap36", hashMap36.repOK_2());
    }
}

