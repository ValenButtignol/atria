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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap5.put((java.lang.Object) 100, (java.lang.Object) hashMap9);
        hashMap5.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap5, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap7.put((java.lang.Object) 100, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap7.table;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        hashMap1.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        int int14 = hashMap6.modCount;
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj22 = hashMap17.remove((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap17.table;
        hashMap6.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap6", hashMap6.repOK_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        hashMap4.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray10;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        hashMap9.table = entryArray20;
        hashMap0.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        hashMap8.modCount = 0;
        boolean boolean12 = hashMap8.isEmpty();
        java.lang.Object obj13 = hashMap5.get((java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) false, obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        hashMap3.clear();
        hashMap3.modCount = (short) 100;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) hashMap3, obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        hashMap3.clear();
        hashMap3.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray13;
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) entryArray13);
        int int16 = hashMap8.size();
        boolean boolean17 = hashMap8.isEmpty();
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        boolean boolean22 = hashMap20.repOK();
        java.lang.Object obj23 = hashMap3.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = hashMap26.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap26.table;
        java.lang.Object obj35 = hashMap25.put((java.lang.Object) hashMap26, (java.lang.Object) 100L);
        hashMap26.clear();
        hashMap26.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap(0);
        hashMap41.clear();
        hashMap41.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean47 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap49.table = entryArray51;
        java.lang.Object obj53 = hashMap46.get((java.lang.Object) entryArray51);
        int int54 = hashMap46.size();
        boolean boolean55 = hashMap46.isEmpty();
        java.lang.Object obj56 = hashMap39.put((java.lang.Object) hashMap41, (java.lang.Object) hashMap46);
        java.lang.Object obj57 = hashMap26.get((java.lang.Object) hashMap46);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap26.table;
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap26.table;
        hashMap3.table = entryArray59;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap3", hashMap3.repOK_3());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray13;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        boolean boolean21 = hashMap19.repOK();
        hashMap19.clear();
        java.lang.Object obj24 = hashMap17.put((java.lang.Object) hashMap19, (java.lang.Object) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap19.table;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap1.table = entryArray8;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        int int13 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj16 = hashMap11.remove((java.lang.Object) 'a');
        java.lang.Object obj19 = hashMap11.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap11.table;
        hashMap1.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) 100L);
        hashMap2.clear();
        hashMap2.clear();
        boolean boolean14 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        hashMap18.clear();
        hashMap18.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray28;
        java.lang.Object obj30 = hashMap23.get((java.lang.Object) entryArray28);
        int int31 = hashMap23.size();
        boolean boolean32 = hashMap23.isEmpty();
        java.lang.Object obj33 = hashMap16.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap23);
        java.lang.Object obj35 = hashMap16.get((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap38.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj44 = hashMap38.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap38.table;
        java.lang.Object obj47 = hashMap37.put((java.lang.Object) hashMap38, (java.lang.Object) 100L);
        hashMap38.clear();
        hashMap38.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap(0);
        hashMap53.clear();
        hashMap53.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean59 = hashMap58.isEmpty();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap61.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap61.table = entryArray63;
        java.lang.Object obj65 = hashMap58.get((java.lang.Object) entryArray63);
        int int66 = hashMap58.size();
        boolean boolean67 = hashMap58.isEmpty();
        java.lang.Object obj68 = hashMap51.put((java.lang.Object) hashMap53, (java.lang.Object) hashMap58);
        java.lang.Object obj69 = hashMap38.get((java.lang.Object) hashMap58);
        java.lang.Object obj70 = hashMap2.put((java.lang.Object) 1.0d, obj69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean8 = hashMap0.repOK();
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) 0L);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        java.lang.Object obj12 = hashMap5.get((java.lang.Object) entryArray10);
        int int13 = hashMap5.modCount;
        hashMap5.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap16.put((java.lang.Object) 100, (java.lang.Object) hashMap20);
        int int22 = hashMap20.size();
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray26 = null;
        hashMap25.table = entryArray26;
        java.lang.Object obj28 = hashMap20.remove((java.lang.Object) entryArray26);
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) (byte) 10, obj28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        hashMap1.modCount = 1;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap7.put((java.lang.Object) 100, (java.lang.Object) hashMap11);
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean6 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = null;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap3.put((java.lang.Object) 100, (java.lang.Object) hashMap7);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray13;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray23;
        java.lang.Object obj25 = hashMap18.get((java.lang.Object) entryArray23);
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) "", (java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.repOK();
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        int int9 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        hashMap8.table = entryArray16;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        hashMap1.table = entryArray12;
        boolean boolean15 = hashMap1.repOK();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        int int21 = hashMap18.modCount;
        hashMap18.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        hashMap1.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        hashMap1.table = entryArray12;
        boolean boolean15 = hashMap1.repOK();
        int int16 = hashMap1.size();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap1.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        hashMap3.modCount = 0;
        hashMap3.modCount = ' ';
        hashMap3.modCount = (byte) -1;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap3.table;
        hashMap2.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        hashMap1.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        hashMap5.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        boolean boolean5 = hashMap3.repOK();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        hashMap12.clear();
        hashMap12.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        int int25 = hashMap17.size();
        boolean boolean26 = hashMap17.isEmpty();
        java.lang.Object obj27 = hashMap10.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        boolean boolean31 = hashMap29.repOK();
        java.lang.Object obj32 = hashMap12.remove((java.lang.Object) hashMap29);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        hashMap37.clear();
        hashMap37.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        java.lang.Object obj49 = hashMap42.get((java.lang.Object) entryArray47);
        int int50 = hashMap42.size();
        boolean boolean51 = hashMap42.isEmpty();
        java.lang.Object obj52 = hashMap35.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        boolean boolean56 = hashMap54.repOK();
        java.lang.Object obj57 = hashMap37.remove((java.lang.Object) hashMap54);
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray60 = null;
        hashMap1.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        boolean boolean5 = hashMap3.repOK();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        hashMap12.clear();
        hashMap12.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        int int25 = hashMap17.size();
        boolean boolean26 = hashMap17.isEmpty();
        java.lang.Object obj27 = hashMap10.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        boolean boolean31 = hashMap29.repOK();
        java.lang.Object obj32 = hashMap12.remove((java.lang.Object) hashMap29);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        hashMap37.clear();
        hashMap37.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        java.lang.Object obj49 = hashMap42.get((java.lang.Object) entryArray47);
        int int50 = hashMap42.size();
        boolean boolean51 = hashMap42.isEmpty();
        java.lang.Object obj52 = hashMap35.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        boolean boolean56 = hashMap54.repOK();
        java.lang.Object obj57 = hashMap37.remove((java.lang.Object) hashMap54);
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) '#');
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap6.put((java.lang.Object) 100, (java.lang.Object) hashMap10);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        java.lang.Object obj14 = hashMap4.get((java.lang.Object) hashMap6);
        hashMap4.modCount = ' ';
        int int17 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean22 = hashMap18.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap4.get((java.lang.Object) entryArray23);
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        int int12 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        hashMap11.table = entryArray19;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.modCount = (-1);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) entryArray14);
        boolean boolean17 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray18;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        hashMap22.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray28;
        hashMap9.table = entryArray28;
        hashMap0.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap1.table = entryArray8;
        int int10 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap11.put((java.lang.Object) 100, (java.lang.Object) hashMap15);
        int int17 = hashMap15.size();
        int int18 = hashMap15.modCount;
        boolean boolean19 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) entryArray26);
        int int29 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap32.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj38 = hashMap32.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap32.table;
        java.lang.Object obj41 = hashMap31.put((java.lang.Object) hashMap32, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap(1);
        java.lang.Object obj44 = hashMap21.put((java.lang.Object) hashMap31, (java.lang.Object) hashMap43);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap31.table;
        java.lang.Object obj46 = hashMap15.get((java.lang.Object) entryArray45);
        hashMap1.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray13;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        boolean boolean25 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray26;
        hashMap0.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        hashMap1.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        int int14 = hashMap6.modCount;
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) hashMap6);
        hashMap1.modCount = 10;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        boolean boolean5 = hashMap3.repOK();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        hashMap12.clear();
        hashMap12.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        int int25 = hashMap17.size();
        boolean boolean26 = hashMap17.isEmpty();
        java.lang.Object obj27 = hashMap10.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        boolean boolean31 = hashMap29.repOK();
        java.lang.Object obj32 = hashMap12.remove((java.lang.Object) hashMap29);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        hashMap37.clear();
        hashMap37.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        java.lang.Object obj49 = hashMap42.get((java.lang.Object) entryArray47);
        int int50 = hashMap42.size();
        boolean boolean51 = hashMap42.isEmpty();
        java.lang.Object obj52 = hashMap35.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        boolean boolean56 = hashMap54.repOK();
        java.lang.Object obj57 = hashMap37.remove((java.lang.Object) hashMap54);
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap(32, (float) (short) 100);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        java.lang.Object obj66 = hashMap63.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj69 = hashMap63.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap63.table;
        hashMap63.modCount = (short) 0;
        int int73 = hashMap63.size();
        system.classfixer.classes.HashMap.Entry[] entryArray74 = hashMap63.table;
        java.lang.Object obj75 = hashMap62.get((java.lang.Object) entryArray74);
        hashMap1.table = entryArray74;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean14 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        boolean boolean16 = hashMap10.isEmpty();
        boolean boolean17 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        int int23 = hashMap19.modCount;
        int int24 = hashMap19.modCount;
        hashMap19.modCount = 1;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        int int30 = hashMap28.size();
        int int31 = hashMap28.size();
        hashMap28.modCount = (short) 0;
        java.lang.Object obj34 = hashMap10.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj41 = hashMap35.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap35.table;
        hashMap35.modCount = (short) 0;
        int int45 = hashMap35.size();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap35.table;
        java.lang.Object obj47 = hashMap28.get((java.lang.Object) entryArray46);
        hashMap1.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) 100, (java.lang.Object) hashMap6);
        hashMap2.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap2);
        hashMap0.modCount = ' ';
        int int13 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        int int16 = hashMap15.size();
        boolean boolean17 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        hashMap3.clear();
        hashMap3.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray13;
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) entryArray13);
        int int16 = hashMap8.size();
        boolean boolean17 = hashMap8.isEmpty();
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap8);
        boolean boolean19 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean24 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        boolean boolean26 = hashMap20.isEmpty();
        boolean boolean27 = hashMap20.repOK();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        int int33 = hashMap29.modCount;
        int int34 = hashMap29.modCount;
        hashMap29.modCount = 1;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        int int40 = hashMap38.size();
        int int41 = hashMap38.size();
        hashMap38.modCount = (short) 0;
        java.lang.Object obj44 = hashMap20.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = hashMap45.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap45.table;
        hashMap45.modCount = (short) 0;
        int int55 = hashMap45.size();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap45.table;
        java.lang.Object obj57 = hashMap38.get((java.lang.Object) entryArray56);
        hashMap3.table = entryArray56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap3", hashMap3.repOK_3());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 1.0f);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        hashMap9.modCount = 0;
        boolean boolean13 = hashMap9.isEmpty();
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) boolean13);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap6.remove((java.lang.Object) entryArray18);
        boolean boolean21 = hashMap6.isEmpty();
        boolean boolean22 = hashMap6.isEmpty();
        java.lang.Object obj23 = hashMap4.remove((java.lang.Object) hashMap6);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) (short) 100);
        int int26 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        java.lang.Object obj35 = hashMap28.get((java.lang.Object) entryArray33);
        int int36 = hashMap28.size();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean39 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray43;
        java.lang.Object obj45 = hashMap38.get((java.lang.Object) entryArray43);
        int int46 = hashMap38.size();
        boolean boolean47 = hashMap38.isEmpty();
        java.lang.Object obj48 = hashMap28.remove((java.lang.Object) hashMap38);
        boolean boolean49 = hashMap38.repOK();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap50.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = hashMap2.put((java.lang.Object) hashMap38, obj53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray13;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray23;
        java.lang.Object obj25 = hashMap18.get((java.lang.Object) entryArray23);
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) "", (java.lang.Object) hashMap18);
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0);
        int int31 = hashMap30.size();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean34 = hashMap33.isEmpty();
        hashMap33.modCount = 0;
        boolean boolean37 = hashMap33.isEmpty();
        java.lang.Object obj38 = hashMap30.get((java.lang.Object) boolean37);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap40.table = entryArray42;
        java.lang.Object obj44 = hashMap30.remove((java.lang.Object) entryArray42);
        boolean boolean45 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = hashMap51.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap51.table;
        java.lang.Object obj60 = hashMap50.put((java.lang.Object) hashMap51, (java.lang.Object) 100L);
        hashMap51.clear();
        hashMap51.clear();
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap(0);
        hashMap66.clear();
        hashMap66.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap71 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean72 = hashMap71.isEmpty();
        system.classfixer.classes.HashMap hashMap74 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap74.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray76 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap74.table = entryArray76;
        java.lang.Object obj78 = hashMap71.get((java.lang.Object) entryArray76);
        int int79 = hashMap71.size();
        boolean boolean80 = hashMap71.isEmpty();
        java.lang.Object obj81 = hashMap64.put((java.lang.Object) hashMap66, (java.lang.Object) hashMap71);
        java.lang.Object obj82 = hashMap51.get((java.lang.Object) hashMap71);
        system.classfixer.classes.HashMap.Entry[] entryArray83 = hashMap51.table;
        java.lang.Object obj84 = hashMap48.remove((java.lang.Object) entryArray83);
        java.lang.Object obj85 = hashMap0.put((java.lang.Object) boolean45, obj84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap4.put((java.lang.Object) 100, (java.lang.Object) hashMap8);
        int int10 = hashMap8.size();
        int int11 = hashMap8.modCount;
        int int12 = hashMap8.modCount;
        int int13 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        int int17 = hashMap15.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) 'a');
        boolean boolean21 = hashMap15.isEmpty();
        hashMap15.modCount = '#';
        boolean boolean24 = hashMap15.repOK();
        hashMap15.modCount = (short) 100;
        java.lang.Object obj27 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap30.put((java.lang.Object) 100, (java.lang.Object) hashMap34);
        hashMap30.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap30.table;
        java.lang.Object obj38 = hashMap28.get((java.lang.Object) hashMap30);
        hashMap28.modCount = ' ';
        int int41 = hashMap28.modCount;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap(0);
        int int44 = hashMap43.size();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean47 = hashMap46.isEmpty();
        hashMap46.modCount = 0;
        boolean boolean50 = hashMap46.isEmpty();
        java.lang.Object obj51 = hashMap43.get((java.lang.Object) boolean50);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap53.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap53.table = entryArray55;
        java.lang.Object obj57 = hashMap43.remove((java.lang.Object) entryArray55);
        hashMap43.modCount = (-1);
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap63.clear();
        boolean boolean65 = hashMap63.repOK();
        hashMap63.clear();
        java.lang.Object obj68 = hashMap61.put((java.lang.Object) hashMap63, (java.lang.Object) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap63.table;
        java.lang.Object obj70 = hashMap28.put((java.lang.Object) (-1), (java.lang.Object) entryArray69);
        hashMap1.table = entryArray69;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.repOK();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(32, (float) (short) 100);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        hashMap13.modCount = (short) 0;
        int int23 = hashMap13.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap13.table;
        java.lang.Object obj25 = hashMap12.get((java.lang.Object) entryArray24);
        hashMap7.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap7", hashMap7.repOK_3());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        int int8 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) 'a');
        java.lang.Object obj14 = hashMap6.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        hashMap0.modCount = 0;
        hashMap0.modCount = ' ';
        hashMap0.modCount = (byte) -1;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap0.table;
        boolean boolean17 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap18.put((java.lang.Object) 100, (java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.get((java.lang.Object) 0L);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        hashMap7.table = entryArray15;
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) entryArray15);
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        java.lang.Object obj14 = hashMap4.put((java.lang.Object) hashMap5, (java.lang.Object) 100L);
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap16.put((java.lang.Object) 100, (java.lang.Object) hashMap20);
        int int22 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap23.put((java.lang.Object) 100, (java.lang.Object) hashMap27);
        hashMap23.clear();
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap23.table;
        hashMap20.table = entryArray31;
        hashMap5.table = entryArray31;
        hashMap1.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (short) 1;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj17 = hashMap11.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap11.table;
        java.lang.Object obj20 = hashMap10.put((java.lang.Object) hashMap11, (java.lang.Object) 100L);
        int int21 = hashMap10.modCount;
        java.lang.Object obj22 = hashMap0.get((java.lang.Object) int21);
        hashMap0.modCount = '#';
        system.classfixer.classes.HashMap.Entry[] entryArray25 = null;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.modCount;
        hashMap1.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        java.lang.Object obj26 = hashMap16.put((java.lang.Object) hashMap17, (java.lang.Object) 100L);
        hashMap17.clear();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(0);
        hashMap32.clear();
        hashMap32.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap40.table = entryArray42;
        java.lang.Object obj44 = hashMap37.get((java.lang.Object) entryArray42);
        int int45 = hashMap37.size();
        boolean boolean46 = hashMap37.isEmpty();
        java.lang.Object obj47 = hashMap30.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap37);
        java.lang.Object obj48 = hashMap17.get((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap17.table;
        java.lang.Object obj50 = hashMap14.remove((java.lang.Object) entryArray49);
        hashMap1.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) 100L);
        hashMap2.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        java.lang.Object obj23 = hashMap16.get((java.lang.Object) entryArray21);
        boolean boolean24 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray25;
        hashMap2.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 0);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        int int13 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        hashMap15.modCount = 0;
        boolean boolean19 = hashMap15.isEmpty();
        java.lang.Object obj20 = hashMap12.get((java.lang.Object) boolean19);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        java.lang.Object obj26 = hashMap12.remove((java.lang.Object) entryArray24);
        hashMap10.table = entryArray24;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) 100L);
        hashMap2.clear();
        boolean boolean13 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean18 = hashMap14.isEmpty();
        hashMap14.clear();
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap22.put((java.lang.Object) 100, (java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        hashMap29.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray35 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray35;
        java.lang.Object obj37 = hashMap22.remove((java.lang.Object) entryArray35);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap39.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        java.lang.Object obj49 = hashMap42.get((java.lang.Object) entryArray47);
        hashMap42.clear();
        java.lang.Object obj51 = hashMap22.put((java.lang.Object) entryArray40, (java.lang.Object) hashMap42);
        java.lang.Object obj52 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap53.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean57 = hashMap53.repOK();
        boolean boolean58 = hashMap53.repOK();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        hashMap60.modCount = 1;
        java.lang.Object obj66 = hashMap42.put((java.lang.Object) hashMap53, (java.lang.Object) hashMap60);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        java.lang.Object obj70 = hashMap67.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap67.clear();
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap();
        java.lang.Object obj74 = hashMap72.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap();
        java.lang.Object obj77 = hashMap72.put((java.lang.Object) 100, (java.lang.Object) hashMap76);
        hashMap72.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray79 = hashMap72.table;
        hashMap67.table = entryArray79;
        hashMap53.table = entryArray79;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap53", hashMap53.repOK_3());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        int int7 = hashMap4.modCount;
        boolean boolean8 = hashMap4.repOK();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        hashMap14.clear();
        hashMap14.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        java.lang.Object obj26 = hashMap19.get((java.lang.Object) entryArray24);
        int int27 = hashMap19.size();
        boolean boolean28 = hashMap19.isEmpty();
        java.lang.Object obj29 = hashMap12.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap19);
        java.lang.Object obj31 = hashMap12.get((java.lang.Object) 1.0d);
        java.lang.Object obj32 = hashMap4.put((java.lang.Object) 100.0d, (java.lang.Object) hashMap12);
        int int33 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap34.put((java.lang.Object) 100, (java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray43;
        hashMap41.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray47;
        java.lang.Object obj49 = hashMap34.remove((java.lang.Object) entryArray47);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean53 = hashMap52.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap55.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap55.table = entryArray57;
        java.lang.Object obj59 = hashMap52.get((java.lang.Object) entryArray57);
        java.lang.Object obj60 = hashMap34.put((java.lang.Object) "", (java.lang.Object) hashMap52);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap52.table;
        hashMap4.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap4", hashMap4.repOK_3());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) 'a');
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        int int13 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        java.lang.Object obj22 = hashMap15.get((java.lang.Object) entryArray20);
        hashMap12.table = entryArray20;
        java.lang.Object obj24 = hashMap1.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(10, 1.0f);
        int int28 = hashMap27.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0);
        int int32 = hashMap31.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean35 = hashMap34.isEmpty();
        hashMap34.modCount = 0;
        boolean boolean38 = hashMap34.isEmpty();
        java.lang.Object obj39 = hashMap31.get((java.lang.Object) boolean38);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray43;
        java.lang.Object obj45 = hashMap31.remove((java.lang.Object) entryArray43);
        boolean boolean46 = hashMap31.isEmpty();
        boolean boolean47 = hashMap31.isEmpty();
        java.lang.Object obj48 = hashMap29.remove((java.lang.Object) hashMap31);
        java.lang.Object obj50 = hashMap27.put((java.lang.Object) hashMap31, (java.lang.Object) (short) 100);
        boolean boolean51 = hashMap27.repOK();
        int int52 = hashMap27.modCount;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj55 = hashMap53.remove((java.lang.Object) 0.0f);
        int int56 = hashMap53.modCount;
        hashMap53.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap53.table;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap(1, (float) '#');
        int int63 = hashMap62.modCount;
        boolean boolean64 = hashMap62.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap62.table;
        java.lang.Object obj66 = hashMap27.put((java.lang.Object) hashMap53, (java.lang.Object) entryArray65);
        hashMap1.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.modCount;
        hashMap1.modCount = (byte) 10;
        boolean boolean12 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        java.lang.Object obj24 = hashMap14.put((java.lang.Object) hashMap15, (java.lang.Object) 100L);
        hashMap15.clear();
        boolean boolean26 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean31 = hashMap27.isEmpty();
        hashMap27.clear();
        java.lang.Object obj34 = hashMap27.remove((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap35.put((java.lang.Object) 100, (java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap42.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray44;
        hashMap42.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray48;
        java.lang.Object obj50 = hashMap35.remove((java.lang.Object) entryArray48);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap52.table;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean56 = hashMap55.isEmpty();
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap58.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap58.table = entryArray60;
        java.lang.Object obj62 = hashMap55.get((java.lang.Object) entryArray60);
        hashMap55.clear();
        java.lang.Object obj64 = hashMap35.put((java.lang.Object) entryArray53, (java.lang.Object) hashMap55);
        java.lang.Object obj65 = hashMap15.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap55);
        int int66 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap27.table;
        hashMap1.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean7 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        boolean boolean9 = hashMap3.isEmpty();
        boolean boolean10 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        int int16 = hashMap12.modCount;
        int int17 = hashMap12.modCount;
        hashMap12.modCount = 1;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        int int23 = hashMap21.size();
        int int24 = hashMap21.size();
        hashMap21.modCount = (short) 0;
        java.lang.Object obj27 = hashMap3.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap21);
        boolean boolean28 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        int int34 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap36.table;
        hashMap30.table = entryArray37;
        boolean boolean39 = hashMap30.repOK();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        int int43 = hashMap41.size();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) 'a');
        boolean boolean47 = hashMap41.isEmpty();
        java.lang.Object obj48 = hashMap30.get((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = hashMap51.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap51.table;
        java.lang.Object obj60 = hashMap50.put((java.lang.Object) hashMap51, (java.lang.Object) 100L);
        hashMap51.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap51.table;
        java.lang.Object obj64 = hashMap41.get((java.lang.Object) entryArray63);
        java.lang.Object obj65 = hashMap21.remove((java.lang.Object) entryArray63);
        hashMap1.table = entryArray63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int10 = hashMap0.size();
        hashMap0.clear();
        int int12 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0, 100.0f);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray23;
        java.lang.Object obj25 = hashMap18.get((java.lang.Object) entryArray23);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap18.table;
        java.lang.Object obj28 = hashMap15.get((java.lang.Object) entryArray27);
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) 'a');
        java.lang.Object obj15 = hashMap7.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap16.put((java.lang.Object) 100, (java.lang.Object) hashMap20);
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap7.get((java.lang.Object) int22);
        int int24 = hashMap7.size();
        hashMap7.modCount = (short) 1;
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0);
        int int31 = hashMap30.size();
        int int32 = hashMap30.modCount;
        java.lang.Object obj33 = hashMap7.put((java.lang.Object) (byte) 1, (java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.remove((java.lang.Object) int32);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        java.lang.Object obj43 = hashMap36.get((java.lang.Object) entryArray41);
        boolean boolean44 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray45;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap36.table;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap0", hashMap0.repOK_3());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap4.table = entryArray5;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) entryArray5);
        int int8 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        int int11 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        hashMap13.modCount = 0;
        boolean boolean17 = hashMap13.isEmpty();
        java.lang.Object obj18 = hashMap10.get((java.lang.Object) boolean17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap10.remove((java.lang.Object) entryArray22);
        boolean boolean25 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap10.table;
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }
}

