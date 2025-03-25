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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) false, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) entryArray10);
        java.lang.Object obj12 = null;
        java.lang.Object obj14 = hashMap0.put(obj12, (java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.clear();
        int int7 = hashMap3.modCount;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap3.remove(obj8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        int int11 = hashMap10.size();
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) entryArray13);
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) entryArray13, (java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) entryArray9);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        java.lang.Object obj13 = hashMap0.put(obj10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.clear();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.modCount;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap12.remove(obj18);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap12.table;
        hashMap9.table = entryArray20;
        hashMap0.table = entryArray20;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj26 = hashMap24.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap28.table;
        boolean boolean30 = hashMap28.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj17 = hashMap15.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) 1L);
        hashMap19.clear();
        java.lang.Object obj23 = hashMap15.get((java.lang.Object) hashMap19);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap6, obj23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) entryArray10);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) 100);
        java.lang.Object obj14 = null;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        java.lang.Object obj18 = hashMap0.put(obj14, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        int int5 = hashMap4.size();
        int int6 = hashMap4.size();
        java.lang.Class<?> wildcardClass7 = hashMap4.getClass();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) 1L, (java.lang.Object) wildcardClass7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        int int8 = hashMap6.size();
        hashMap6.modCount = 0;
        int int11 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.get((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap12);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap12, obj16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) (short) 100);
        int int13 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) entryArray14);
        boolean boolean16 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        boolean boolean21 = hashMap19.isEmpty();
        int int22 = hashMap19.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap17.table = entryArray23;
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap8, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        int int10 = hashMap8.size();
        boolean boolean11 = hashMap8.repOK();
        boolean boolean12 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1L);
        hashMap5.clear();
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1L);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap10.table = entryArray20;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        hashMap22.clear();
        hashMap22.clear();
        java.lang.Object obj26 = hashMap5.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.modCount = (short) 0;
        boolean boolean8 = hashMap3.repOK();
        java.lang.Class<?> wildcardClass9 = hashMap3.getClass();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap3, obj10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.repOK();
        boolean boolean9 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        int int16 = hashMap10.size();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap7.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Class<?> wildcardClass11 = entryArray10.getClass();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) wildcardClass11);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) entryArray17);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        boolean boolean22 = hashMap21.repOK();
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap28.table;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj31 = hashMap26.get((java.lang.Object) entryArray30);
        hashMap21.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) '4');
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1L);
        hashMap5.clear();
        int int9 = hashMap5.modCount;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap5.remove(obj10);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        int int13 = hashMap12.size();
        int int14 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        java.lang.Object obj16 = hashMap5.remove((java.lang.Object) entryArray15);
        java.lang.Object obj18 = hashMap5.remove((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        int int21 = hashMap19.size();
        boolean boolean22 = hashMap19.repOK();
        int int23 = hashMap19.modCount;
        boolean boolean24 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj28 = hashMap26.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Class<?> wildcardClass30 = entryArray29.getClass();
        java.lang.Object obj31 = hashMap19.remove((java.lang.Object) wildcardClass30);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 1L);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap32.table;
        java.lang.Object obj37 = hashMap19.get((java.lang.Object) entryArray36);
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) hashMap5, obj37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap10);
        boolean boolean20 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        hashMap21.clear();
        java.lang.Object obj24 = hashMap21.remove((java.lang.Object) (short) 100);
        int int25 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        boolean boolean32 = hashMap29.isEmpty();
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) boolean32);
        boolean boolean34 = hashMap26.repOK();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 1L);
        hashMap35.clear();
        int int39 = hashMap35.modCount;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap35.remove(obj40);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        int int43 = hashMap42.size();
        int int44 = hashMap42.size();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap35.remove((java.lang.Object) entryArray45);
        java.lang.Object obj48 = hashMap35.remove((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        hashMap49.clear();
        boolean boolean51 = hashMap49.isEmpty();
        int int52 = hashMap49.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap49.table;
        hashMap35.table = entryArray53;
        java.lang.Object obj55 = hashMap26.remove((java.lang.Object) entryArray53);
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) (short) 100);
        int int14 = hashMap10.modCount;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) int14);
        int int16 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap10);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap7.put((java.lang.Object) 'a', obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) (short) 0);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        int int10 = hashMap8.size();
        hashMap8.modCount = 0;
        int int13 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.get((java.lang.Object) 0.0f);
        java.lang.Object obj17 = hashMap8.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        int int20 = hashMap19.size();
        java.lang.Object obj22 = hashMap19.get((java.lang.Object) 10L);
        hashMap19.modCount = '4';
        boolean boolean25 = hashMap19.repOK();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.modCount = (short) 0;
        int int12 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        hashMap23.clear();
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) (short) 100);
        int int27 = hashMap23.modCount;
        java.lang.Object obj28 = hashMap13.remove((java.lang.Object) int27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        hashMap31.clear();
        java.lang.Object obj34 = hashMap31.remove((java.lang.Object) (short) 100);
        int int35 = hashMap31.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap31.table;
        java.lang.Object obj37 = hashMap30.get((java.lang.Object) entryArray36);
        hashMap13.table = entryArray36;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 1L);
        hashMap39.clear();
        int int43 = hashMap39.modCount;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap39.remove(obj44);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        int int47 = hashMap46.size();
        int int48 = hashMap46.size();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap39.remove((java.lang.Object) entryArray49);
        java.lang.Object obj51 = hashMap13.remove((java.lang.Object) hashMap39);
        java.lang.Object obj52 = hashMap7.get((java.lang.Object) hashMap39);
        int int53 = hashMap7.modCount;
        java.lang.Object obj55 = hashMap0.put((java.lang.Object) int53, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.clear();
        hashMap7.clear();
        boolean boolean12 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        boolean boolean17 = hashMap15.isEmpty();
        int int18 = hashMap15.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap13.table = entryArray19;
        boolean boolean21 = hashMap13.isEmpty();
        java.lang.Class<?> wildcardClass22 = hashMap13.getClass();
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 1.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 10L);
        hashMap0.modCount = '4';
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap7);
        hashMap7.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.modCount = (short) 0;
        int int9 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        int int15 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        hashMap20.clear();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) (short) 100);
        int int24 = hashMap20.modCount;
        java.lang.Object obj25 = hashMap10.remove((java.lang.Object) int24);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        hashMap28.clear();
        java.lang.Object obj31 = hashMap28.remove((java.lang.Object) (short) 100);
        int int32 = hashMap28.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        java.lang.Object obj34 = hashMap27.get((java.lang.Object) entryArray33);
        hashMap10.table = entryArray33;
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 1L);
        hashMap36.clear();
        int int40 = hashMap36.modCount;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap36.remove(obj41);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        int int44 = hashMap43.size();
        int int45 = hashMap43.size();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap43.table;
        java.lang.Object obj47 = hashMap36.remove((java.lang.Object) entryArray46);
        java.lang.Object obj48 = hashMap10.remove((java.lang.Object) hashMap36);
        java.lang.Object obj49 = hashMap4.get((java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean52 = hashMap51.isEmpty();
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) hashMap36, (java.lang.Object) hashMap51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        boolean boolean4 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        int int8 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        int int15 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        hashMap20.clear();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) (short) 100);
        int int24 = hashMap20.modCount;
        java.lang.Object obj25 = hashMap10.remove((java.lang.Object) int24);
        int int26 = hashMap10.size();
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1L);
        hashMap6.modCount = (short) 0;
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        hashMap6.modCount = (byte) 10;
        hashMap6.clear();
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        boolean boolean21 = hashMap19.isEmpty();
        int int22 = hashMap19.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap17.table = entryArray23;
        boolean boolean25 = hashMap17.isEmpty();
        java.lang.Class<?> wildcardClass26 = hashMap17.getClass();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        hashMap27.clear();
        java.lang.Object obj30 = hashMap27.remove((java.lang.Object) (short) 100);
        int int31 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap27.table;
        int int33 = hashMap27.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap27.get((java.lang.Object) hashMap34);
        java.lang.Object obj38 = hashMap6.put((java.lang.Object) wildcardClass26, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (short) 100);
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray7);
        boolean boolean9 = hashMap1.repOK();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        boolean boolean4 = hashMap2.isEmpty();
        int int5 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        hashMap0.table = entryArray6;
        int int8 = hashMap0.modCount;
        boolean boolean9 = hashMap0.repOK();
        java.lang.Object obj10 = null;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 1L);
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.modCount;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap11.remove(obj17);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap11.table;
        java.lang.Object obj20 = hashMap0.put(obj10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) entryArray10);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) 100);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1L);
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        java.lang.Object obj22 = hashMap19.remove((java.lang.Object) (short) 100);
        int int23 = hashMap19.modCount;
        java.lang.Object obj24 = hashMap9.remove((java.lang.Object) int23);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        hashMap27.clear();
        java.lang.Object obj30 = hashMap27.remove((java.lang.Object) (short) 100);
        int int31 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap27.table;
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) entryArray32);
        hashMap9.table = entryArray32;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 1L);
        hashMap35.clear();
        int int39 = hashMap35.modCount;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap35.remove(obj40);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        int int43 = hashMap42.size();
        int int44 = hashMap42.size();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap35.remove((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap9.remove((java.lang.Object) hashMap35);
        java.lang.Object obj48 = hashMap3.get((java.lang.Object) hashMap35);
        int int49 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap50.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        boolean boolean55 = hashMap53.isEmpty();
        boolean boolean56 = hashMap53.isEmpty();
        java.lang.Object obj57 = hashMap50.get((java.lang.Object) boolean56);
        int int58 = hashMap50.size();
        java.lang.Object obj59 = hashMap0.put((java.lang.Object) int49, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        int int6 = hashMap0.size();
        int int7 = hashMap0.size();
        java.lang.Object obj8 = null;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1L);
        hashMap9.modCount = (short) 0;
        int int14 = hashMap9.modCount;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap9.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        boolean boolean18 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap9.table;
        java.lang.Object obj20 = hashMap0.put(obj8, (java.lang.Object) entryArray19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0, 100.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 100, 10.0f);
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap7.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Class<?> wildcardClass11 = entryArray10.getClass();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) wildcardClass11);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) entryArray17);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        boolean boolean22 = hashMap21.repOK();
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 1L);
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        boolean boolean33 = hashMap31.isEmpty();
        java.lang.Object obj34 = hashMap21.put((java.lang.Object) hashMap28, (java.lang.Object) boolean33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (short) 100);
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj10 = hashMap8.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.clear();
        java.lang.Object obj16 = hashMap8.get((java.lang.Object) hashMap12);
        hashMap8.modCount = 2;
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int23 = hashMap22.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj25 = hashMap1.put(obj19, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (short) 100);
        int int12 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        int int14 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) hashMap15);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap8.get(obj19);
        hashMap8.clear();
        java.lang.Object obj22 = hashMap1.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap24.modCount = 0;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        boolean boolean30 = hashMap28.isEmpty();
        boolean boolean31 = hashMap28.isEmpty();
        int int32 = hashMap28.size();
        java.lang.Object obj33 = hashMap24.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        hashMap34.clear();
        boolean boolean36 = hashMap34.isEmpty();
        int int37 = hashMap34.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 1L);
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap39.table;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap39.table;
        hashMap34.table = entryArray44;
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) hashMap28, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1L);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        boolean boolean17 = hashMap14.isEmpty();
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) 10.0d);
        boolean boolean20 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap14.table;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        hashMap23.clear();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap12.table = entryArray27;
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 1L);
        hashMap34.modCount = (short) 0;
        int int39 = hashMap34.modCount;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap34.remove(obj40);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap34.table;
        boolean boolean43 = hashMap34.repOK();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap44.remove((java.lang.Object) 1L);
        hashMap44.modCount = (short) 0;
        int int49 = hashMap44.size();
        boolean boolean50 = hashMap44.repOK();
        int int51 = hashMap44.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap44.table;
        java.lang.Object obj53 = hashMap34.get((java.lang.Object) hashMap44);
        hashMap44.clear();
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap56.table;
        hashMap56.modCount = 0;
        java.lang.Object obj60 = hashMap44.remove((java.lang.Object) hashMap56);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap44.table;
        java.lang.Object obj62 = hashMap32.remove((java.lang.Object) hashMap44);
        java.lang.Object obj63 = hashMap0.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap6.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.clear();
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) hashMap10);
        hashMap6.modCount = 2;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        int int19 = hashMap18.size();
        java.lang.Object obj21 = hashMap18.get((java.lang.Object) 10L);
        hashMap18.modCount = '4';
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) entryArray24);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 1L);
        hashMap26.modCount = (short) 0;
        int int31 = hashMap26.modCount;
        hashMap26.clear();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 1L);
        hashMap33.modCount = (short) 0;
        int int38 = hashMap33.size();
        boolean boolean39 = hashMap33.repOK();
        java.lang.Object obj40 = hashMap26.get((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int43 = hashMap42.size();
        java.lang.Object obj44 = hashMap6.put((java.lang.Object) hashMap26, (java.lang.Object) int43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) entryArray10);
        hashMap5.clear();
        java.lang.Class<?> wildcardClass13 = hashMap5.getClass();
        java.lang.Object obj14 = hashMap1.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1L);
        hashMap15.modCount = (short) 0;
        int int20 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap15.table;
        hashMap15.modCount = (byte) 10;
        int int24 = hashMap15.modCount;
        hashMap15.modCount = (byte) 100;
        java.lang.Object obj27 = hashMap5.get((java.lang.Object) hashMap15);
        hashMap15.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap15", hashMap15.repOK_2());
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
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1L);
        hashMap4.modCount = (short) 0;
        int int9 = hashMap4.modCount;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap4.remove(obj10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap0.table = entryArray12;
        boolean boolean14 = hashMap0.repOK();
        java.lang.Object obj15 = null;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        int int17 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        int int19 = hashMap18.size();
        int int20 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap16.table = entryArray21;
        int int23 = hashMap16.modCount;
        boolean boolean24 = hashMap16.isEmpty();
        java.lang.Class<?> wildcardClass25 = hashMap16.getClass();
        java.lang.Object obj26 = hashMap0.put(obj15, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        int int9 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) entryArray16);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.get((java.lang.Object) 0.0f);
        hashMap18.clear();
        hashMap18.modCount = 0;
        int int24 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap25.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        boolean boolean35 = hashMap33.isEmpty();
        boolean boolean36 = hashMap33.isEmpty();
        java.lang.Object obj37 = hashMap30.get((java.lang.Object) boolean36);
        int int38 = hashMap30.size();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        hashMap39.clear();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 1L);
        hashMap42.modCount = (short) 0;
        int int47 = hashMap42.modCount;
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap42.remove(obj48);
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap42.table;
        hashMap39.table = entryArray50;
        hashMap30.table = entryArray50;
        java.lang.Object obj53 = hashMap25.get((java.lang.Object) entryArray50);
        java.lang.Object obj54 = hashMap18.get((java.lang.Object) hashMap25);
        java.lang.Object obj55 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) (short) 100);
        int int14 = hashMap10.modCount;
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) int14);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.modCount;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap12.remove(obj18);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap12.table;
        hashMap9.table = entryArray20;
        hashMap0.table = entryArray20;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        hashMap24.clear();
        java.lang.Object obj27 = hashMap24.remove((java.lang.Object) (short) 100);
        int int28 = hashMap24.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap24.table;
        int int30 = hashMap24.size();
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(0, (float) 11);
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 10.0d);
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) (short) 100);
        int int13 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap8);
        int int17 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(100, (float) 1);
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) boolean21);
        hashMap8.modCount = 0;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) 1L);
        hashMap25.clear();
        int int29 = hashMap25.modCount;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        hashMap30.clear();
        java.lang.Object obj33 = hashMap30.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 1L);
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        hashMap30.table = entryArray38;
        hashMap25.table = entryArray38;
        hashMap8.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        boolean boolean8 = hashMap6.isEmpty();
        hashMap6.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 1L);
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.modCount;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap11.remove(obj17);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap11.table;
        hashMap6.table = entryArray19;
        hashMap0.table = entryArray19;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap23.table;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap0.table = entryArray25;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        hashMap27.clear();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        hashMap29.clear();
        boolean boolean31 = hashMap29.isEmpty();
        int int32 = hashMap29.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap29.table;
        hashMap27.table = entryArray33;
        boolean boolean35 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        hashMap39.clear();
        java.lang.Object obj42 = hashMap39.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) 1L);
        hashMap43.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap39.table = entryArray47;
        hashMap36.table = entryArray47;
        hashMap27.table = entryArray47;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj53 = hashMap51.remove((java.lang.Object) 1L);
        hashMap51.clear();
        int int55 = hashMap51.modCount;
        hashMap51.clear();
        boolean boolean57 = hashMap51.isEmpty();
        boolean boolean58 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        hashMap61.clear();
        java.lang.Object obj63 = hashMap51.get((java.lang.Object) hashMap61);
        java.lang.Object obj64 = hashMap0.put((java.lang.Object) hashMap27, obj63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.repOK();
        int int11 = hashMap7.modCount;
        boolean boolean12 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj16 = hashMap14.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Class<?> wildcardClass18 = entryArray17.getClass();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) wildcardClass18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1L);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap7.get((java.lang.Object) entryArray24);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        boolean boolean29 = hashMap28.repOK();
        java.lang.Object obj30 = hashMap7.get((java.lang.Object) hashMap28);
        int int31 = hashMap7.size();
        java.lang.Class<?> wildcardClass32 = hashMap7.getClass();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        hashMap35.clear();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        hashMap33.table = entryArray39;
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Object obj43 = hashMap33.get((java.lang.Object) wildcardClass42);
        boolean boolean44 = hashMap33.isEmpty();
        java.lang.Object obj45 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) boolean44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap10);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        hashMap22.modCount = 0;
        java.lang.Object obj26 = hashMap10.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        hashMap28.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        boolean boolean32 = hashMap30.isEmpty();
        boolean boolean33 = hashMap30.isEmpty();
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) 10.0d);
        boolean boolean36 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap30.table;
        java.lang.Object obj38 = hashMap28.get((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        hashMap39.clear();
        int int41 = hashMap39.size();
        boolean boolean42 = hashMap39.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap39.table;
        hashMap28.table = entryArray43;
        java.lang.Object obj45 = hashMap10.remove((java.lang.Object) hashMap28);
        hashMap28.modCount = (byte) 0;
        int int48 = hashMap28.modCount;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        hashMap49.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        hashMap51.clear();
        boolean boolean53 = hashMap51.isEmpty();
        int int54 = hashMap51.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        hashMap49.table = entryArray55;
        boolean boolean57 = hashMap49.isEmpty();
        boolean boolean58 = hashMap49.repOK();
        hashMap49.modCount = 10;
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap();
        java.lang.Object obj63 = hashMap61.remove((java.lang.Object) 1L);
        hashMap61.clear();
        hashMap61.clear();
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj69 = hashMap67.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap67.table;
        int int71 = hashMap67.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap67.table;
        boolean boolean73 = hashMap67.repOK();
        java.lang.Object obj74 = hashMap61.remove((java.lang.Object) hashMap67);
        java.lang.Object obj75 = hashMap28.put((java.lang.Object) hashMap49, (java.lang.Object) hashMap61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap28", hashMap28.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1L);
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap3.modCount = (byte) 10;
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        java.lang.Object obj19 = hashMap3.remove((java.lang.Object) int18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1L);
        hashMap20.modCount = (short) 0;
        int int25 = hashMap20.modCount;
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap20.remove(obj26);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap20.table;
        boolean boolean29 = hashMap20.repOK();
        hashMap20.clear();
        java.lang.Object obj31 = hashMap2.put(obj19, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 10;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = ' ';
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        int int7 = hashMap5.size();
        hashMap5.modCount = 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) entryArray16);
        hashMap5.table = entryArray16;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) 1L);
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        boolean boolean27 = hashMap25.isEmpty();
        hashMap25.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 1L);
        hashMap30.modCount = (short) 0;
        int int35 = hashMap30.modCount;
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap30.remove(obj36);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap30.table;
        hashMap25.table = entryArray38;
        hashMap19.table = entryArray38;
        java.lang.Object obj41 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1L);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap5.table = entryArray13;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 1L);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        boolean boolean21 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(52);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        hashMap5.clear();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1L);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap5.table = entryArray13;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        int int18 = hashMap16.size();
        boolean boolean19 = hashMap16.repOK();
        boolean boolean20 = hashMap16.repOK();
        int int21 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        hashMap22.clear();
        boolean boolean24 = hashMap22.isEmpty();
        hashMap22.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1L);
        hashMap27.modCount = (short) 0;
        int int32 = hashMap27.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap27.remove(obj33);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap27.table;
        hashMap22.table = entryArray35;
        hashMap16.table = entryArray35;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) 1L);
        hashMap38.modCount = (short) 0;
        int int43 = hashMap38.size();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap38.table;
        java.lang.Object obj45 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (short) 100);
        int int12 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        int int14 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) hashMap15);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap8.get(obj19);
        hashMap8.clear();
        java.lang.Object obj22 = hashMap1.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap25.remove((java.lang.Object) (short) 100);
        int int29 = hashMap25.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap25.table;
        java.lang.Object obj31 = hashMap24.get((java.lang.Object) entryArray30);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 1L);
        hashMap32.clear();
        int int36 = hashMap32.modCount;
        hashMap32.modCount = (byte) 1;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap32.table;
        java.lang.Object obj40 = hashMap1.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        boolean boolean11 = hashMap9.isEmpty();
        hashMap9.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 1L);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap9.table = entryArray19;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        hashMap21.clear();
        boolean boolean23 = hashMap21.isEmpty();
        int int24 = hashMap21.modCount;
        boolean boolean25 = hashMap21.repOK();
        hashMap21.clear();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        boolean boolean30 = hashMap27.isEmpty();
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap27.table;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        hashMap21.table = entryArray34;
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) entryArray19, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1L);
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.modCount;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap12.remove(obj18);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap12.table;
        hashMap9.table = entryArray20;
        hashMap0.table = entryArray20;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        hashMap25.clear();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) entryArray34);
        boolean boolean36 = hashMap30.repOK();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap37.remove((java.lang.Object) 1L);
        hashMap37.modCount = (short) 0;
        boolean boolean42 = hashMap37.repOK();
        boolean boolean43 = hashMap37.isEmpty();
        hashMap37.clear();
        java.lang.Object obj45 = hashMap25.put((java.lang.Object) boolean36, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap25", hashMap25.repOK_2());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.modCount;
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap10.remove(obj16);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        hashMap7.table = entryArray18;
        hashMap0.table = entryArray18;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1L);
        hashMap22.clear();
        int int26 = hashMap22.modCount;
        hashMap22.modCount = (byte) 1;
        boolean boolean29 = hashMap22.isEmpty();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1L);
        hashMap10.modCount = (short) 0;
        int int15 = hashMap10.size();
        boolean boolean16 = hashMap10.repOK();
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap10.table;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap10);
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        hashMap22.modCount = 0;
        java.lang.Object obj26 = hashMap10.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1L);
        hashMap27.clear();
        int int31 = hashMap27.modCount;
        hashMap27.clear();
        hashMap27.clear();
        hashMap27.modCount = 1;
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 1L);
        hashMap36.clear();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        hashMap40.clear();
        java.lang.Object obj42 = hashMap36.remove((java.lang.Object) hashMap40);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap36.table;
        hashMap27.table = entryArray43;
        boolean boolean45 = hashMap27.repOK();
        java.lang.Object obj47 = hashMap10.put((java.lang.Object) boolean45, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 10L);
        hashMap0.modCount = '4';
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.modCount = (short) 0;
        int int12 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1L);
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        hashMap23.clear();
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) (short) 100);
        int int27 = hashMap23.modCount;
        java.lang.Object obj28 = hashMap13.remove((java.lang.Object) int27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        hashMap31.clear();
        java.lang.Object obj34 = hashMap31.remove((java.lang.Object) (short) 100);
        int int35 = hashMap31.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap31.table;
        java.lang.Object obj37 = hashMap30.get((java.lang.Object) entryArray36);
        hashMap13.table = entryArray36;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 1L);
        hashMap39.clear();
        int int43 = hashMap39.modCount;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap39.remove(obj44);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        int int47 = hashMap46.size();
        int int48 = hashMap46.size();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap39.remove((java.lang.Object) entryArray49);
        java.lang.Object obj51 = hashMap13.remove((java.lang.Object) hashMap39);
        java.lang.Object obj52 = hashMap7.get((java.lang.Object) hashMap39);
        int int53 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        int int55 = hashMap54.size();
        java.lang.Object obj57 = hashMap54.get((java.lang.Object) 10L);
        hashMap54.modCount = '4';
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap54.table;
        hashMap7.table = entryArray60;
        java.lang.Object obj62 = hashMap0.get((java.lang.Object) entryArray60);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        hashMap63.clear();
        boolean boolean65 = hashMap63.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap63.table;
        java.lang.Object obj67 = hashMap0.get((java.lang.Object) hashMap63);
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        hashMap68.clear();
        boolean boolean70 = hashMap68.isEmpty();
        int int71 = hashMap68.modCount;
        boolean boolean72 = hashMap68.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap68.table;
        boolean boolean74 = hashMap68.isEmpty();
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap();
        boolean boolean76 = hashMap75.repOK();
        int int77 = hashMap75.size();
        hashMap75.modCount = 0;
        system.classfixer.classes.HashMap hashMap80 = new system.classfixer.classes.HashMap();
        hashMap80.clear();
        java.lang.Object obj83 = hashMap80.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap84 = new system.classfixer.classes.HashMap();
        java.lang.Object obj86 = hashMap84.remove((java.lang.Object) 1L);
        hashMap84.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray88 = hashMap84.table;
        hashMap80.table = entryArray88;
        hashMap75.table = entryArray88;
        int int91 = hashMap75.size();
        boolean boolean92 = hashMap75.repOK();
        java.lang.Object obj93 = hashMap63.put((java.lang.Object) boolean74, (java.lang.Object) hashMap75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap63", hashMap63.repOK_2());
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 'a');
        java.lang.Object obj8 = hashMap0.put(obj4, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1L);
        hashMap6.modCount = (short) 0;
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        hashMap6.modCount = (byte) 10;
        hashMap6.clear();
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        hashMap17.modCount = (short) 0;
        int int22 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1L);
        hashMap23.modCount = (short) 0;
        int int28 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap23.table;
        hashMap23.modCount = (byte) 10;
        hashMap23.clear();
        java.lang.Object obj33 = hashMap17.remove((java.lang.Object) hashMap23);
        java.lang.Object obj34 = hashMap0.remove(obj33);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        boolean boolean37 = hashMap35.isEmpty();
        boolean boolean38 = hashMap35.isEmpty();
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap35.table;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap35.table;
        int int43 = hashMap35.size();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap44.remove((java.lang.Object) 1L);
        hashMap44.modCount = (short) 0;
        int int49 = hashMap44.size();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        hashMap50.clear();
        boolean boolean52 = hashMap50.isEmpty();
        hashMap50.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap55.remove((java.lang.Object) 1L);
        hashMap55.modCount = (short) 0;
        int int60 = hashMap55.modCount;
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = hashMap55.remove(obj61);
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap55.table;
        hashMap50.table = entryArray63;
        hashMap44.table = entryArray63;
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap67.table;
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap67.table;
        hashMap44.table = entryArray69;
        hashMap44.modCount = 1;
        system.classfixer.classes.HashMap hashMap73 = new system.classfixer.classes.HashMap();
        int int74 = hashMap73.size();
        int int75 = hashMap73.size();
        java.lang.Object obj76 = hashMap44.get((java.lang.Object) hashMap73);
        java.lang.Object obj77 = hashMap0.put((java.lang.Object) int43, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1L);
        hashMap7.modCount = (short) 0;
        int int12 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap7.table;
        hashMap7.modCount = (byte) 10;
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1L);
        hashMap17.clear();
        int int21 = hashMap17.modCount;
        int int22 = hashMap17.modCount;
        java.lang.Object obj23 = hashMap7.remove((java.lang.Object) int22);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        hashMap24.clear();
        java.lang.Object obj27 = hashMap24.remove((java.lang.Object) (short) 100);
        int int28 = hashMap24.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap24.table;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap24.table;
        java.lang.Object obj31 = hashMap7.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 1L);
        hashMap33.modCount = (short) 0;
        int int38 = hashMap33.modCount;
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) int38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.size();
        hashMap0.modCount = 3;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) hashMap6, obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

