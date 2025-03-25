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
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap6.put(obj9, (java.lang.Object) 1.0d);
        boolean boolean12 = hashMap6.isEmpty();
        hashMap6.modCount = (-1);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        boolean boolean21 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap22.remove(obj27);
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry entry30 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] { entry30 };
        hashMap22.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap22", hashMap22.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        hashMap12.clear();
        hashMap12.modCount = (short) 0;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) true, (java.lang.Object) "");
        int int21 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap25.clear();
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap25);
        java.lang.Object obj31 = hashMap12.put((java.lang.Object) hashMap17, obj30);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        hashMap32.clear();
        hashMap32.modCount = (short) 0;
        boolean boolean36 = hashMap32.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap32.table;
        hashMap12.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        boolean boolean4 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 100.0d);
        java.lang.Object obj17 = hashMap12.put(obj15, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) 100.0d);
        java.lang.Object obj23 = hashMap18.put(obj21, (java.lang.Object) 1.0d);
        boolean boolean24 = hashMap18.isEmpty();
        hashMap18.modCount = (-1);
        java.lang.Object obj27 = hashMap12.get((java.lang.Object) hashMap18);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap12);
        int int29 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        boolean boolean4 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 100.0d);
        java.lang.Object obj17 = hashMap12.put(obj15, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) 100.0d);
        java.lang.Object obj23 = hashMap18.put(obj21, (java.lang.Object) 1.0d);
        boolean boolean24 = hashMap18.isEmpty();
        hashMap18.modCount = (-1);
        java.lang.Object obj27 = hashMap12.get((java.lang.Object) hashMap18);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) (short) -1);
        int int34 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap30.table;
        hashMap0.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        int int7 = hashMap2.modCount;
        hashMap2.modCount = (byte) 100;
        boolean boolean10 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap2.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (-1L), (java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 100.0d);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        boolean boolean19 = hashMap14.isEmpty();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) boolean19, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        hashMap0.clear();
        hashMap0.modCount = 2;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        hashMap15.clear();
        int int18 = hashMap15.size();
        java.lang.Object obj19 = hashMap10.put((java.lang.Object) (-1L), (java.lang.Object) int18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 100.0d);
        java.lang.Object obj23 = hashMap10.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap10.table;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        hashMap4.modCount = (short) 0;
        boolean boolean8 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        java.lang.Object obj14 = hashMap4.put((java.lang.Object) hashMap9, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap4.table = entryArray19;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap4.table;
        hashMap1.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = null;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap6.put(obj9, (java.lang.Object) 1.0d);
        boolean boolean12 = hashMap6.isEmpty();
        hashMap6.modCount = (-1);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap6);
        int int16 = hashMap0.size();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap0.get(obj17);
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap0.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) true, (java.lang.Object) "");
        int int10 = hashMap6.size();
        boolean boolean11 = hashMap6.isEmpty();
        boolean boolean12 = hashMap6.repOK();
        java.lang.Object obj13 = hashMap4.put((java.lang.Object) (-1), (java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        hashMap19.clear();
        int int22 = hashMap19.size();
        java.lang.Object obj23 = hashMap14.put((java.lang.Object) (-1L), (java.lang.Object) int22);
        boolean boolean24 = hashMap14.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        hashMap25.modCount = (short) 0;
        boolean boolean29 = hashMap25.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        hashMap30.clear();
        int int33 = hashMap30.size();
        java.lang.Object obj35 = hashMap25.put((java.lang.Object) hashMap30, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap36.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap36.table;
        hashMap25.table = entryArray40;
        java.lang.Object obj42 = hashMap4.put((java.lang.Object) boolean24, (java.lang.Object) entryArray40);
        hashMap1.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        boolean boolean9 = hashMap4.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) boolean9);
        boolean boolean11 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap14);
        boolean boolean16 = hashMap14.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = null;
        hashMap14.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) true, (java.lang.Object) "");
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        int int18 = hashMap13.modCount;
        hashMap13.modCount = (byte) 100;
        boolean boolean21 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap4.table = entryArray22;
        hashMap0.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 100.0d);
        java.lang.Object obj7 = hashMap2.put(obj5, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 100.0d);
        java.lang.Object obj13 = hashMap8.put(obj11, (java.lang.Object) 1.0d);
        boolean boolean14 = hashMap8.isEmpty();
        hashMap8.modCount = (-1);
        java.lang.Object obj17 = hashMap2.get((java.lang.Object) hashMap8);
        int int18 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap19.table;
        int int24 = hashMap19.modCount;
        hashMap19.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 100.0d);
        java.lang.Object obj33 = hashMap28.put(obj31, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 100.0d);
        java.lang.Object obj39 = hashMap34.put(obj37, (java.lang.Object) 1.0d);
        boolean boolean40 = hashMap34.isEmpty();
        hashMap34.modCount = (-1);
        java.lang.Object obj43 = hashMap28.get((java.lang.Object) hashMap34);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap44.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap44.table;
        boolean boolean49 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap50.table;
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = hashMap50.remove(obj55);
        java.lang.Object obj57 = hashMap28.put((java.lang.Object) boolean49, (java.lang.Object) hashMap50);
        java.lang.Object obj58 = hashMap2.put((java.lang.Object) hashMap19, obj57);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        java.lang.Object obj61 = hashMap59.remove((java.lang.Object) 0.0f);
        int int62 = hashMap59.modCount;
        java.lang.Object obj64 = hashMap19.put((java.lang.Object) hashMap59, (java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap59.table;
        hashMap1.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.clear();
        int int9 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        int int15 = hashMap10.modCount;
        hashMap10.modCount = (byte) 100;
        boolean boolean18 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        hashMap2.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        boolean boolean9 = hashMap4.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) boolean9);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        hashMap13.modCount = (short) 0;
        boolean boolean17 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        hashMap18.clear();
        int int21 = hashMap18.size();
        java.lang.Object obj23 = hashMap13.put((java.lang.Object) hashMap18, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 100.0d);
        java.lang.Object obj30 = hashMap25.put(obj28, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 100.0d);
        java.lang.Object obj36 = hashMap31.put(obj34, (java.lang.Object) 1.0d);
        boolean boolean37 = hashMap31.isEmpty();
        hashMap31.modCount = (-1);
        java.lang.Object obj40 = hashMap25.get((java.lang.Object) hashMap31);
        java.lang.Object obj41 = hashMap13.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap13.table;
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap13.table;
        java.lang.Object obj45 = hashMap0.put((java.lang.Object) 0.0f, (java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        hashMap46.clear();
        hashMap46.modCount = (short) 0;
        boolean boolean50 = hashMap46.repOK();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        hashMap54.clear();
        hashMap54.modCount = (short) 0;
        boolean boolean58 = hashMap54.repOK();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        boolean boolean60 = hashMap59.repOK();
        hashMap59.clear();
        int int62 = hashMap59.size();
        java.lang.Object obj64 = hashMap54.put((java.lang.Object) hashMap59, (java.lang.Object) 100L);
        int int65 = hashMap59.size();
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        hashMap66.clear();
        hashMap66.modCount = (short) 0;
        boolean boolean70 = hashMap66.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap66.table;
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap66.table;
        java.lang.Object obj73 = hashMap59.remove((java.lang.Object) entryArray72);
        java.lang.Object obj74 = hashMap51.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray72);
        hashMap46.table = entryArray72;
        hashMap0.table = entryArray72;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap6.put(obj9, (java.lang.Object) 1.0d);
        boolean boolean12 = hashMap6.isEmpty();
        hashMap6.modCount = (-1);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap6);
        int int16 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        int int22 = hashMap17.modCount;
        hashMap17.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 100.0d);
        java.lang.Object obj31 = hashMap26.put(obj29, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 100.0d);
        java.lang.Object obj37 = hashMap32.put(obj35, (java.lang.Object) 1.0d);
        boolean boolean38 = hashMap32.isEmpty();
        hashMap32.modCount = (-1);
        java.lang.Object obj41 = hashMap26.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap42.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        boolean boolean47 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap48.table;
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = hashMap48.remove(obj53);
        java.lang.Object obj55 = hashMap26.put((java.lang.Object) boolean47, (java.lang.Object) hashMap48);
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap17, obj55);
        java.lang.Object obj58 = hashMap0.remove((java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(35, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        hashMap3.clear();
        hashMap3.modCount = (short) 0;
        boolean boolean7 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        int int8 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        hashMap15.modCount = (short) 0;
        java.lang.Object obj19 = hashMap3.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap15);
        boolean boolean20 = hashMap10.isEmpty();
        java.lang.Object obj21 = hashMap1.get((java.lang.Object) boolean20);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 100.0d);
        java.lang.Object obj27 = hashMap22.put(obj25, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 100.0d);
        java.lang.Object obj33 = hashMap28.put(obj31, (java.lang.Object) 1.0d);
        boolean boolean34 = hashMap28.isEmpty();
        hashMap28.modCount = (-1);
        java.lang.Object obj37 = hashMap22.get((java.lang.Object) hashMap28);
        int int38 = hashMap22.size();
        int int39 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj43 = hashMap40.put((java.lang.Object) true, (java.lang.Object) "");
        int int44 = hashMap40.size();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap40.table;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap40.table;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap47.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        boolean boolean56 = hashMap51.isEmpty();
        java.lang.Object obj57 = hashMap47.remove((java.lang.Object) boolean56);
        boolean boolean58 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        java.lang.Object obj62 = hashMap47.get((java.lang.Object) hashMap61);
        boolean boolean63 = hashMap61.repOK();
        java.lang.Object obj65 = hashMap61.get((java.lang.Object) 10.0d);
        java.lang.Object obj66 = hashMap22.put((java.lang.Object) entryArray46, (java.lang.Object) hashMap61);
        hashMap1.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 100.0d);
        java.lang.Object obj15 = hashMap10.put(obj13, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 100.0d);
        java.lang.Object obj21 = hashMap16.put(obj19, (java.lang.Object) 1.0d);
        boolean boolean22 = hashMap16.isEmpty();
        hashMap16.modCount = (-1);
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) hashMap16);
        int int26 = hashMap10.size();
        int int27 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap28.put((java.lang.Object) true, (java.lang.Object) "");
        int int32 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap35.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap39.table;
        boolean boolean44 = hashMap39.isEmpty();
        java.lang.Object obj45 = hashMap35.remove((java.lang.Object) boolean44);
        boolean boolean46 = hashMap35.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        java.lang.Object obj50 = hashMap35.get((java.lang.Object) hashMap49);
        boolean boolean51 = hashMap49.repOK();
        java.lang.Object obj53 = hashMap49.get((java.lang.Object) 10.0d);
        java.lang.Object obj54 = hashMap10.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap49);
        hashMap0.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashMap14.put(obj17, (java.lang.Object) 1.0d);
        boolean boolean20 = hashMap14.isEmpty();
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 100.0d);
        java.lang.Object obj27 = hashMap22.put(obj25, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 100.0d);
        java.lang.Object obj33 = hashMap28.put(obj31, (java.lang.Object) 1.0d);
        boolean boolean34 = hashMap28.isEmpty();
        hashMap28.modCount = (-1);
        java.lang.Object obj37 = hashMap22.get((java.lang.Object) hashMap28);
        int int38 = hashMap22.size();
        int int39 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj43 = hashMap40.put((java.lang.Object) true, (java.lang.Object) "");
        int int44 = hashMap40.size();
        boolean boolean45 = hashMap40.isEmpty();
        boolean boolean46 = hashMap40.isEmpty();
        hashMap40.modCount = (-1);
        java.lang.Object obj49 = hashMap22.remove((java.lang.Object) hashMap40);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean52 = hashMap51.repOK();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap53.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj59 = hashMap53.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        java.lang.Object obj63 = hashMap60.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap60.table;
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        hashMap65.clear();
        hashMap65.modCount = (short) 0;
        java.lang.Object obj69 = hashMap53.put((java.lang.Object) hashMap60, (java.lang.Object) hashMap65);
        boolean boolean70 = hashMap60.isEmpty();
        java.lang.Object obj71 = hashMap51.get((java.lang.Object) boolean70);
        hashMap51.clear();
        int int73 = hashMap51.size();
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap();
        java.lang.Object obj79 = hashMap76.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap76.clear();
        java.lang.Object obj81 = hashMap75.get((java.lang.Object) hashMap76);
        hashMap76.clear();
        int int83 = hashMap76.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray84 = hashMap76.table;
        java.lang.Object obj85 = hashMap51.get((java.lang.Object) entryArray84);
        java.lang.Object obj86 = hashMap14.put(obj49, (java.lang.Object) entryArray84);
        system.classfixer.classes.HashMap hashMap87 = new system.classfixer.classes.HashMap();
        hashMap87.clear();
        hashMap87.modCount = (short) 0;
        boolean boolean91 = hashMap87.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray92 = hashMap87.table;
        hashMap14.table = entryArray92;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.clear();
        int int9 = hashMap2.modCount;
        boolean boolean10 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 2);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) true, (java.lang.Object) "");
        int int21 = hashMap17.size();
        boolean boolean22 = hashMap17.isEmpty();
        boolean boolean23 = hashMap17.repOK();
        java.lang.Object obj24 = hashMap15.put((java.lang.Object) (-1), (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        hashMap30.clear();
        int int33 = hashMap30.size();
        java.lang.Object obj34 = hashMap25.put((java.lang.Object) (-1L), (java.lang.Object) int33);
        boolean boolean35 = hashMap25.repOK();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        hashMap36.clear();
        hashMap36.modCount = (short) 0;
        boolean boolean40 = hashMap36.repOK();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        hashMap41.clear();
        int int44 = hashMap41.size();
        java.lang.Object obj46 = hashMap36.put((java.lang.Object) hashMap41, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap47.table;
        hashMap36.table = entryArray51;
        java.lang.Object obj53 = hashMap15.put((java.lang.Object) boolean35, (java.lang.Object) entryArray51);
        java.lang.Object obj54 = hashMap13.remove((java.lang.Object) entryArray51);
        hashMap2.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (-1L), (java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 100.0d);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0, (float) 35);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) true, (java.lang.Object) "");
        int int6 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        hashMap15.clear();
        int int18 = hashMap15.size();
        java.lang.Object obj19 = hashMap10.put((java.lang.Object) (-1L), (java.lang.Object) int18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 100.0d);
        java.lang.Object obj23 = hashMap10.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap10.table;
        java.lang.Object obj25 = hashMap2.remove((java.lang.Object) entryArray24);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        boolean boolean31 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap26.table;
        java.lang.Object obj33 = hashMap2.remove((java.lang.Object) entryArray32);
        hashMap1.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.modCount;
        hashMap9.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        int int23 = hashMap18.modCount;
        hashMap18.modCount = (byte) 100;
        boolean boolean26 = hashMap18.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap18.table;
        hashMap9.table = entryArray27;
        hashMap0.table = entryArray27;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap30.put((java.lang.Object) true, (java.lang.Object) "");
        int int34 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap30.table;
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap30.get(obj36);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        int int43 = hashMap38.modCount;
        hashMap38.modCount = (byte) 100;
        boolean boolean46 = hashMap38.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap38.table;
        hashMap30.table = entryArray47;
        int int49 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap50.remove((java.lang.Object) 100.0d);
        hashMap50.modCount = 1;
        boolean boolean55 = hashMap50.repOK();
        java.lang.Object obj56 = hashMap30.remove((java.lang.Object) hashMap50);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap57.clear();
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) hashMap30, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        hashMap2.modCount = (short) 0;
        boolean boolean6 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        hashMap7.clear();
        int int10 = hashMap7.size();
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashMap14.put(obj17, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 100.0d);
        java.lang.Object obj25 = hashMap20.put(obj23, (java.lang.Object) 1.0d);
        boolean boolean26 = hashMap20.isEmpty();
        hashMap20.modCount = (-1);
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) hashMap20);
        java.lang.Object obj30 = hashMap2.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap2.table;
        java.lang.Object obj32 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap6.put(obj9, (java.lang.Object) 1.0d);
        boolean boolean12 = hashMap6.isEmpty();
        hashMap6.modCount = (-1);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        boolean boolean21 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap22.remove(obj27);
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) hashMap22);
        boolean boolean30 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        hashMap31.clear();
        hashMap31.modCount = (short) 0;
        boolean boolean35 = hashMap31.repOK();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.repOK();
        hashMap36.clear();
        int int39 = hashMap36.size();
        java.lang.Object obj41 = hashMap31.put((java.lang.Object) hashMap36, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap44.remove((java.lang.Object) 100.0d);
        java.lang.Object obj48 = hashMap43.put(obj46, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap50.remove((java.lang.Object) 100.0d);
        java.lang.Object obj54 = hashMap49.put(obj52, (java.lang.Object) 1.0d);
        boolean boolean55 = hashMap49.isEmpty();
        hashMap49.modCount = (-1);
        java.lang.Object obj58 = hashMap43.get((java.lang.Object) hashMap49);
        java.lang.Object obj59 = hashMap31.put((java.lang.Object) hashMap42, (java.lang.Object) hashMap43);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap31.table;
        hashMap31.clear();
        java.lang.Object obj62 = hashMap0.remove((java.lang.Object) hashMap31);
        int int63 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap();
        java.lang.Object obj67 = hashMap64.put((java.lang.Object) true, (java.lang.Object) "");
        int int68 = hashMap64.size();
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap64.table;
        hashMap0.table = entryArray69;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 100.0d);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) true, (java.lang.Object) "");
        int int14 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        int int26 = hashMap23.size();
        java.lang.Object obj27 = hashMap18.put((java.lang.Object) (-1L), (java.lang.Object) int26);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 100.0d);
        java.lang.Object obj31 = hashMap18.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap18.table;
        java.lang.Object obj33 = hashMap10.remove((java.lang.Object) entryArray32);
        hashMap0.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 100.0d);
        java.lang.Object obj14 = hashMap9.put(obj12, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 100.0d);
        java.lang.Object obj20 = hashMap15.put(obj18, (java.lang.Object) 1.0d);
        boolean boolean21 = hashMap15.isEmpty();
        hashMap15.modCount = (-1);
        java.lang.Object obj24 = hashMap9.get((java.lang.Object) hashMap15);
        int int25 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        int int31 = hashMap26.modCount;
        hashMap26.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap26.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 100.0d);
        java.lang.Object obj40 = hashMap35.put(obj38, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 100.0d);
        java.lang.Object obj46 = hashMap41.put(obj44, (java.lang.Object) 1.0d);
        boolean boolean47 = hashMap41.isEmpty();
        hashMap41.modCount = (-1);
        java.lang.Object obj50 = hashMap35.get((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        boolean boolean56 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = hashMap57.remove(obj62);
        java.lang.Object obj64 = hashMap35.put((java.lang.Object) boolean56, (java.lang.Object) hashMap57);
        java.lang.Object obj65 = hashMap9.put((java.lang.Object) hashMap26, obj64);
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap9.table;
        hashMap2.table = entryArray66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        int int3 = hashMap1.size();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap5.modCount = 3;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 100.0d);
        java.lang.Object obj12 = hashMap7.put(obj10, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 100.0d);
        java.lang.Object obj18 = hashMap13.put(obj16, (java.lang.Object) 1.0d);
        boolean boolean19 = hashMap13.isEmpty();
        hashMap13.modCount = (-1);
        java.lang.Object obj22 = hashMap7.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap13.table;
        hashMap0.table = entryArray23;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 100.0d);
        java.lang.Object obj30 = hashMap25.put(obj28, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 100.0d);
        java.lang.Object obj36 = hashMap31.put(obj34, (java.lang.Object) 1.0d);
        boolean boolean37 = hashMap31.isEmpty();
        hashMap31.modCount = (-1);
        java.lang.Object obj40 = hashMap25.get((java.lang.Object) hashMap31);
        int int41 = hashMap25.size();
        int int42 = hashMap25.size();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap25, obj43);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        hashMap45.clear();
        hashMap45.modCount = (short) 0;
        boolean boolean49 = hashMap45.repOK();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.repOK();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        hashMap53.clear();
        hashMap53.modCount = (short) 0;
        boolean boolean57 = hashMap53.repOK();
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        boolean boolean59 = hashMap58.repOK();
        hashMap58.clear();
        int int61 = hashMap58.size();
        java.lang.Object obj63 = hashMap53.put((java.lang.Object) hashMap58, (java.lang.Object) 100L);
        int int64 = hashMap58.size();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        hashMap65.clear();
        hashMap65.modCount = (short) 0;
        boolean boolean69 = hashMap65.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap65.table;
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap65.table;
        java.lang.Object obj72 = hashMap58.remove((java.lang.Object) entryArray71);
        java.lang.Object obj73 = hashMap50.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray71);
        hashMap45.table = entryArray71;
        hashMap0.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        hashMap12.clear();
        hashMap12.modCount = (short) 0;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap12);
        boolean boolean17 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean20 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap21.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj27 = hashMap21.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap28.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        hashMap33.clear();
        hashMap33.modCount = (short) 0;
        java.lang.Object obj37 = hashMap21.put((java.lang.Object) hashMap28, (java.lang.Object) hashMap33);
        boolean boolean38 = hashMap28.isEmpty();
        java.lang.Object obj39 = hashMap19.get((java.lang.Object) boolean38);
        hashMap19.clear();
        java.lang.Object obj41 = hashMap7.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap42.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap42.clear();
        hashMap42.clear();
        hashMap42.clear();
        boolean boolean49 = hashMap42.repOK();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap50.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj56 = hashMap50.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        hashMap62.clear();
        hashMap62.modCount = (short) 0;
        java.lang.Object obj66 = hashMap50.put((java.lang.Object) hashMap57, (java.lang.Object) hashMap62);
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap57.table;
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        java.lang.Object obj71 = hashMap68.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap68.clear();
        hashMap68.clear();
        hashMap68.clear();
        boolean boolean75 = hashMap68.repOK();
        int int76 = hashMap68.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray77 = hashMap68.table;
        int int78 = hashMap68.modCount;
        boolean boolean79 = hashMap68.repOK();
        java.lang.Object obj80 = hashMap42.put((java.lang.Object) entryArray67, (java.lang.Object) hashMap68);
        hashMap19.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap19", hashMap19.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap6.put(obj9, (java.lang.Object) 1.0d);
        boolean boolean12 = hashMap6.isEmpty();
        hashMap6.modCount = (-1);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap6);
        boolean boolean16 = hashMap0.isEmpty();
        boolean boolean17 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        int int23 = hashMap18.modCount;
        hashMap18.modCount = (byte) 100;
        boolean boolean26 = hashMap18.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap18.table;
        java.lang.Object obj30 = hashMap18.put((java.lang.Object) 0, (java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap33.clear();
        java.lang.Object obj38 = hashMap32.get((java.lang.Object) hashMap33);
        java.lang.Object obj40 = hashMap33.get((java.lang.Object) true);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        hashMap41.clear();
        hashMap41.modCount = (short) 0;
        boolean boolean45 = hashMap41.repOK();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.repOK();
        hashMap46.clear();
        int int49 = hashMap46.size();
        java.lang.Object obj51 = hashMap41.put((java.lang.Object) hashMap46, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj55 = hashMap52.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap52.table;
        hashMap41.table = entryArray56;
        hashMap41.modCount = (short) 1;
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        java.lang.Object obj65 = hashMap62.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap62.clear();
        java.lang.Object obj67 = hashMap61.get((java.lang.Object) hashMap62);
        java.lang.Object obj69 = hashMap62.get((java.lang.Object) true);
        java.lang.Object obj70 = hashMap33.put((java.lang.Object) (short) 1, (java.lang.Object) true);
        boolean boolean71 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap();
        java.lang.Object obj75 = hashMap72.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap72.clear();
        hashMap72.clear();
        system.classfixer.classes.HashMap hashMap78 = new system.classfixer.classes.HashMap();
        java.lang.Object obj80 = hashMap78.remove((java.lang.Object) 100.0d);
        java.lang.Object obj81 = hashMap72.remove((java.lang.Object) hashMap78);
        java.lang.Object obj82 = hashMap33.get((java.lang.Object) hashMap72);
        java.lang.Object obj83 = hashMap0.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        boolean boolean4 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 100.0d);
        java.lang.Object obj18 = hashMap13.put(obj16, (java.lang.Object) 1.0d);
        boolean boolean19 = hashMap13.isEmpty();
        hashMap13.modCount = (-1);
        java.lang.Object obj24 = hashMap13.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = hashMap13.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 100.0d);
        java.lang.Object obj32 = hashMap27.put(obj30, (java.lang.Object) 1.0d);
        boolean boolean33 = hashMap27.isEmpty();
        java.lang.Object obj34 = hashMap13.get((java.lang.Object) hashMap27);
        java.lang.Object obj35 = hashMap5.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap(10, (float) '4');
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap5.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap11.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap11);
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap18.clear();
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 100.0d);
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap18.table;
        hashMap10.table = entryArray28;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap30.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj36 = hashMap30.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap37.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        hashMap42.clear();
        hashMap42.modCount = (short) 0;
        java.lang.Object obj46 = hashMap30.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap42);
        boolean boolean47 = hashMap37.isEmpty();
        java.lang.Object obj48 = hashMap5.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap49.put((java.lang.Object) true, (java.lang.Object) "");
        int int53 = hashMap49.size();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap49.table;
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = hashMap49.get(obj55);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        int int62 = hashMap57.modCount;
        hashMap57.modCount = (byte) 100;
        boolean boolean65 = hashMap57.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap57.table;
        hashMap49.table = entryArray66;
        hashMap37.table = entryArray66;
        hashMap1.table = entryArray66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 1.0d);
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 100.0d);
        java.lang.Object obj17 = hashMap12.put(obj15, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) 100.0d);
        java.lang.Object obj23 = hashMap18.put(obj21, (java.lang.Object) 1.0d);
        boolean boolean24 = hashMap18.isEmpty();
        hashMap18.modCount = (-1);
        java.lang.Object obj27 = hashMap12.get((java.lang.Object) hashMap18);
        int int28 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap29.table;
        int int34 = hashMap29.modCount;
        hashMap29.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 100.0d);
        java.lang.Object obj43 = hashMap38.put(obj41, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap45.remove((java.lang.Object) 100.0d);
        java.lang.Object obj49 = hashMap44.put(obj47, (java.lang.Object) 1.0d);
        boolean boolean50 = hashMap44.isEmpty();
        hashMap44.modCount = (-1);
        java.lang.Object obj53 = hashMap38.get((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap54.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap54.table;
        boolean boolean59 = hashMap54.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        java.lang.Object obj63 = hashMap60.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap60.table;
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = hashMap60.remove(obj65);
        java.lang.Object obj67 = hashMap38.put((java.lang.Object) boolean59, (java.lang.Object) hashMap60);
        java.lang.Object obj68 = hashMap12.put((java.lang.Object) hashMap29, obj67);
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap();
        java.lang.Object obj71 = hashMap69.remove((java.lang.Object) 0.0f);
        int int72 = hashMap69.modCount;
        java.lang.Object obj74 = hashMap29.put((java.lang.Object) hashMap69, (java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray75 = hashMap69.table;
        hashMap0.table = entryArray75;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        boolean boolean2 = hashMap1.repOK();
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.modCount = 0;
        boolean boolean6 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = null;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.get(obj6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        int int13 = hashMap8.modCount;
        hashMap8.modCount = (byte) 100;
        boolean boolean16 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap8.table;
        hashMap0.table = entryArray17;
        int int19 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 100.0d);
        hashMap20.modCount = 1;
        boolean boolean25 = hashMap20.repOK();
        java.lang.Object obj26 = hashMap0.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap27.modCount = 3;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        hashMap20.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap20", hashMap20.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 100.0d);
        hashMap0.modCount = 1;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 10, 10.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        int int12 = hashMap11.modCount;
        hashMap11.clear();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 100.0d);
        java.lang.Object obj20 = hashMap15.put(obj18, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 100.0d);
        java.lang.Object obj26 = hashMap21.put(obj24, (java.lang.Object) 1.0d);
        boolean boolean27 = hashMap21.isEmpty();
        hashMap21.modCount = (-1);
        java.lang.Object obj30 = hashMap15.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        boolean boolean36 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap37.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = hashMap37.remove(obj42);
        java.lang.Object obj44 = hashMap15.put((java.lang.Object) boolean36, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int47 = hashMap46.modCount;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap48.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap48.table;
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = hashMap48.remove(obj53);
        hashMap48.clear();
        hashMap48.modCount = 2;
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        java.lang.Object obj61 = hashMap58.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap58.clear();
        hashMap58.clear();
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap();
        java.lang.Object obj67 = hashMap64.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap64.table;
        int int69 = hashMap64.modCount;
        hashMap64.modCount = (byte) 100;
        hashMap64.clear();
        java.lang.Object obj73 = hashMap58.remove((java.lang.Object) hashMap64);
        java.lang.Object obj74 = hashMap48.remove(obj73);
        java.lang.Object obj75 = hashMap15.put((java.lang.Object) hashMap46, (java.lang.Object) hashMap48);
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap();
        hashMap76.clear();
        hashMap76.modCount = (short) 0;
        boolean boolean80 = hashMap76.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap76.table;
        hashMap48.table = entryArray81;
        system.classfixer.classes.HashMap.Entry[] entryArray83 = hashMap48.table;
        hashMap11.table = entryArray83;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.get(obj6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        int int13 = hashMap8.modCount;
        hashMap8.modCount = (byte) 100;
        boolean boolean16 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap8.table;
        hashMap0.table = entryArray17;
        int int19 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 100.0d);
        hashMap20.modCount = 1;
        boolean boolean25 = hashMap20.repOK();
        java.lang.Object obj26 = hashMap0.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap27.clear();
        hashMap27.clear();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 100.0d);
        java.lang.Object obj36 = hashMap27.remove((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap27.table;
        hashMap0.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 35);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) true, (java.lang.Object) "");
        int int8 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap2.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 100.0d);
        java.lang.Object obj13 = hashMap8.put(obj11, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashMap14.put(obj17, (java.lang.Object) 1.0d);
        boolean boolean20 = hashMap14.isEmpty();
        hashMap14.modCount = (-1);
        java.lang.Object obj23 = hashMap8.get((java.lang.Object) hashMap14);
        boolean boolean24 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap8.table;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) true, (java.lang.Object) "");
        int int7 = hashMap3.size();
        boolean boolean8 = hashMap3.isEmpty();
        boolean boolean9 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) (-1), (java.lang.Object) hashMap3);
        boolean boolean11 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        hashMap16.modCount = (short) 0;
        boolean boolean20 = hashMap16.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        hashMap21.clear();
        int int24 = hashMap21.size();
        java.lang.Object obj26 = hashMap16.put((java.lang.Object) hashMap21, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap16.table = entryArray31;
        hashMap12.table = entryArray31;
        hashMap1.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (-1L), (java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        int int15 = hashMap10.modCount;
        boolean boolean16 = hashMap10.isEmpty();
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) boolean16);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean20 = hashMap19.repOK();
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) boolean20);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        hashMap15.modCount = (short) 0;
        java.lang.Object obj19 = hashMap3.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap15);
        boolean boolean20 = hashMap10.isEmpty();
        java.lang.Object obj21 = hashMap1.get((java.lang.Object) boolean20);
        hashMap1.clear();
        int int23 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap26.clear();
        java.lang.Object obj31 = hashMap25.get((java.lang.Object) hashMap26);
        hashMap26.clear();
        int int33 = hashMap26.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap26.table;
        java.lang.Object obj35 = hashMap1.get((java.lang.Object) entryArray34);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        hashMap36.clear();
        hashMap36.modCount = (short) 0;
        boolean boolean40 = hashMap36.repOK();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        hashMap41.clear();
        int int44 = hashMap41.size();
        java.lang.Object obj46 = hashMap36.put((java.lang.Object) hashMap41, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap47.table;
        hashMap36.table = entryArray51;
        hashMap1.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (-1L), (java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        int int15 = hashMap10.modCount;
        boolean boolean16 = hashMap10.isEmpty();
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) boolean16);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        int int23 = hashMap18.modCount;
        hashMap18.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap18.table;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean7 = hashMap0.repOK();
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 100.0d);
        java.lang.Object obj14 = hashMap9.put(obj12, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 100.0d);
        java.lang.Object obj20 = hashMap15.put(obj18, (java.lang.Object) 1.0d);
        boolean boolean21 = hashMap15.isEmpty();
        hashMap15.modCount = (-1);
        java.lang.Object obj24 = hashMap9.get((java.lang.Object) hashMap15);
        boolean boolean25 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap9.table;
        hashMap0.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        hashMap4.modCount = (short) 0;
        boolean boolean8 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        java.lang.Object obj14 = hashMap4.put((java.lang.Object) hashMap9, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 100.0d);
        java.lang.Object obj21 = hashMap16.put(obj19, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 100.0d);
        java.lang.Object obj27 = hashMap22.put(obj25, (java.lang.Object) 1.0d);
        boolean boolean28 = hashMap22.isEmpty();
        hashMap22.modCount = (-1);
        java.lang.Object obj31 = hashMap16.get((java.lang.Object) hashMap22);
        java.lang.Object obj32 = hashMap4.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap16.table;
        hashMap0.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) true, (java.lang.Object) "");
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        hashMap16.clear();
        int int19 = hashMap16.size();
        java.lang.Object obj20 = hashMap11.put((java.lang.Object) (-1L), (java.lang.Object) int19);
        hashMap11.modCount = 0;
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) 0);
        int int24 = hashMap6.size();
        java.lang.Object obj26 = hashMap6.remove((java.lang.Object) 4);
        hashMap6.clear();
        java.lang.Object obj28 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 100.0d);
        java.lang.Object obj34 = hashMap29.put(obj32, (java.lang.Object) 1.0d);
        boolean boolean35 = hashMap29.isEmpty();
        hashMap29.modCount = (-1);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap29.table;
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap2);
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap9.clear();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 100.0d);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap9.table;
        hashMap1.table = entryArray19;
        int int21 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = null;
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        int int3 = hashMap0.modCount;
        hashMap0.modCount = 4;
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 100.0d);
        java.lang.Object obj12 = hashMap7.put(obj10, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 100.0d);
        java.lang.Object obj18 = hashMap13.put(obj16, (java.lang.Object) 1.0d);
        boolean boolean19 = hashMap13.isEmpty();
        hashMap13.modCount = (-1);
        java.lang.Object obj22 = hashMap7.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        boolean boolean28 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap29.table;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap29.remove(obj34);
        java.lang.Object obj36 = hashMap7.put((java.lang.Object) boolean28, (java.lang.Object) hashMap29);
        boolean boolean37 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        hashMap38.clear();
        hashMap38.modCount = (short) 0;
        boolean boolean42 = hashMap38.repOK();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.repOK();
        hashMap43.clear();
        int int46 = hashMap43.size();
        java.lang.Object obj48 = hashMap38.put((java.lang.Object) hashMap43, (java.lang.Object) 100L);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap51.remove((java.lang.Object) 100.0d);
        java.lang.Object obj55 = hashMap50.put(obj53, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj59 = hashMap57.remove((java.lang.Object) 100.0d);
        java.lang.Object obj61 = hashMap56.put(obj59, (java.lang.Object) 1.0d);
        boolean boolean62 = hashMap56.isEmpty();
        hashMap56.modCount = (-1);
        java.lang.Object obj65 = hashMap50.get((java.lang.Object) hashMap56);
        java.lang.Object obj66 = hashMap38.put((java.lang.Object) hashMap49, (java.lang.Object) hashMap50);
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap38.table;
        hashMap38.clear();
        java.lang.Object obj69 = hashMap7.remove((java.lang.Object) hashMap38);
        int int70 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap7.table;
        hashMap0.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

