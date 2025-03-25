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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap1", hashMap1.repOK_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap1.put(obj2, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        int int4 = hashMap0.size();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.get((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = hashMap0.put(obj7, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap2.table = entryArray6;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) hashMap2, (java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 0L, obj4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        java.lang.Object obj6 = hashMap3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = hashMap3.repOK();
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.get((java.lang.Object) (-1.0d));
        hashMap12.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap12);
        boolean boolean17 = hashMap10.isEmpty();
        java.lang.Object obj18 = hashMap1.put(obj9, (java.lang.Object) boolean17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap8.table = entryArray10;
        int int12 = hashMap8.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) int12);
        java.lang.Object obj14 = null;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.get((java.lang.Object) (-1.0d));
        hashMap15.clear();
        int int19 = hashMap15.size();
        java.lang.Object obj20 = hashMap1.put(obj14, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        int int10 = hashMap9.size();
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) int10, (java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap8.table = entryArray10;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        hashMap13.clear();
        hashMap13.clear();
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) 'a');
        java.lang.Object obj19 = hashMap8.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry22 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        java.lang.Object obj25 = hashMap1.put(obj19, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = hashMap4.repOK();
        boolean boolean9 = hashMap4.isEmpty();
        hashMap4.modCount = 0;
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        int int8 = hashMap4.size();
        boolean boolean9 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass10 = hashMap4.getClass();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) (byte) 0);
        int int16 = hashMap12.modCount;
        boolean boolean17 = hashMap12.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMap12.remove(obj18);
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap12.table;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) wildcardClass10, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap11.clear();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap11);
        int int14 = hashMap11.modCount;
        boolean boolean15 = hashMap11.repOK();
        java.lang.Object obj16 = null;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        hashMap23.clear();
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) 'a');
        java.lang.Object obj29 = hashMap18.get((java.lang.Object) hashMap23);
        int int30 = hashMap18.size();
        java.lang.Object obj31 = hashMap11.put(obj16, (java.lang.Object) int30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.modCount;
        int int6 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.get((java.lang.Object) (-1.0d));
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) (byte) 0);
        int int16 = hashMap12.modCount;
        hashMap12.clear();
        boolean boolean18 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        hashMap19.clear();
        hashMap19.modCount = (byte) 100;
        java.lang.Object obj24 = hashMap12.get((java.lang.Object) (byte) 100);
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) hashMap7, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.size();
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        int int16 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        hashMap14.table = entryArray20;
        hashMap9.table = entryArray20;
        boolean boolean24 = hashMap9.isEmpty();
        boolean boolean25 = hashMap9.isEmpty();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap1.put((java.lang.Object) boolean25, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        hashMap5.table = entryArray11;
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        hashMap0.clear();
        int int4 = hashMap0.size();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (byte) 0);
        int int12 = hashMap8.size();
        boolean boolean13 = hashMap8.repOK();
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry22 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        hashMap17.table = entryArray23;
        hashMap8.table = entryArray23;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry30 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] { entry30 };
        hashMap27.table = entryArray31;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap27.table;
        hashMap8.table = entryArray33;
        java.lang.Class<?> wildcardClass35 = entryArray33.getClass();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        java.lang.Object obj40 = hashMap37.remove((java.lang.Object) (byte) 0);
        int int41 = hashMap37.size();
        boolean boolean42 = hashMap37.repOK();
        java.lang.Object obj44 = hashMap37.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap46.clear();
        int int48 = hashMap46.size();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry51 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] { entry51 };
        hashMap50.table = entryArray52;
        hashMap46.table = entryArray52;
        hashMap37.table = entryArray52;
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) entryArray33, (java.lang.Object) entryArray52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) (byte) -1);
        boolean boolean13 = hashMap9.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap7.table = entryArray14;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        hashMap16.modCount = (short) 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap16.remove(obj20);
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) entryArray14, obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass12 = hashMap6.getClass();
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        int int16 = hashMap15.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        int int18 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.isEmpty();
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) hashMap19);
        java.lang.Object obj23 = hashMap6.put((java.lang.Object) hashMap15, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) (byte) -1);
        boolean boolean9 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap2.table = entryArray10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry16 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        hashMap20.clear();
        java.lang.Object obj25 = hashMap20.remove((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = hashMap20.getClass();
        java.lang.Object obj27 = hashMap15.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap15.table;
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap4.table = entryArray10;
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) hashMap4);
        int int13 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap4.put((java.lang.Object) (byte) -1, obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry6 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] { entry6 };
        hashMap5.table = entryArray7;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) 'a');
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) hashMap10);
        int int17 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap5.table = entryArray21;
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) entryArray21, (java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        int int9 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        int int17 = hashMap15.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry20 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        hashMap15.table = entryArray21;
        hashMap10.table = entryArray21;
        boolean boolean25 = hashMap10.isEmpty();
        boolean boolean26 = hashMap10.isEmpty();
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (byte) 0);
        boolean boolean12 = hashMap8.repOK();
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry18 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap15.table = entryArray21;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry25 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        int int28 = hashMap24.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.repOK();
        hashMap29.clear();
        hashMap29.clear();
        int int33 = hashMap29.size();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap29.remove(obj34);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap29.table;
        hashMap24.table = entryArray36;
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) entryArray21, (java.lang.Object) entryArray36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Class<?> wildcardClass6 = hashMap5.getClass();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap5, obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap6.table = entryArray10;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        hashMap6.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) (byte) 0);
        int int24 = hashMap20.modCount;
        boolean boolean25 = hashMap20.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMap20.remove(obj26);
        hashMap20.clear();
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap20.table;
        hashMap6.table = entryArray31;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry35 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] { entry35 };
        hashMap34.table = entryArray36;
        int int38 = hashMap34.modCount;
        hashMap34.modCount = (byte) 10;
        hashMap34.clear();
        java.lang.Object obj42 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.modCount = (byte) 100;
        int int5 = hashMap0.size();
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap8.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        int int18 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        hashMap19.clear();
        hashMap19.clear();
        int int23 = hashMap19.size();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap19.remove(obj24);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        hashMap14.table = entryArray26;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) entryArray11, (java.lang.Object) entryArray26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap2", hashMap2.repOK_3());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        boolean boolean11 = hashMap7.repOK();
        boolean boolean12 = hashMap7.isEmpty();
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry18 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        hashMap22.clear();
        hashMap22.clear();
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap17.get((java.lang.Object) hashMap22);
        int int29 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap17.table = entryArray33;
        java.lang.Object obj35 = hashMap2.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.modCount;
        hashMap1.clear();
        boolean boolean7 = hashMap1.repOK();
        int int8 = hashMap1.modCount;
        int int9 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        int int14 = hashMap10.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap10.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) entryArray17, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, 1.0f);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry12 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        int int15 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap11.table = entryArray18;
        hashMap5.table = entryArray18;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) entryArray18, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        hashMap8.modCount = (short) 0;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_3) for hashMap8", hashMap8.repOK_3());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj5 = hashMap0.put(obj3, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.repOK();
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry8 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        int int11 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (byte) 0);
        int int17 = hashMap13.modCount;
        boolean boolean18 = hashMap13.isEmpty();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = hashMap13.remove(obj19);
        hashMap13.clear();
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap13.table;
        java.lang.Object obj25 = hashMap7.get((java.lang.Object) entryArray24);
        int int26 = hashMap7.size();
        int int27 = hashMap7.size();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0, (float) (byte) 100);
        hashMap31.modCount = (byte) 100;
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap11.clear();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap11);
        int int14 = hashMap11.modCount;
        java.lang.Object obj15 = null;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        hashMap16.clear();
        hashMap16.clear();
        int int20 = hashMap16.size();
        hashMap16.modCount = (-1);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry25 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.repOK();
        hashMap29.clear();
        hashMap29.clear();
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) 'a');
        java.lang.Object obj35 = hashMap24.get((java.lang.Object) hashMap29);
        int int36 = hashMap24.size();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap24.table;
        java.lang.Object obj38 = hashMap16.remove((java.lang.Object) hashMap24);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry entry40 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] { entry40 };
        hashMap24.table = entryArray41;
        java.lang.Object obj43 = hashMap11.put(obj15, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        int int9 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap4.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (byte) 0);
        int int20 = hashMap16.modCount;
        boolean boolean21 = hashMap16.isEmpty();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = hashMap16.remove(obj22);
        hashMap16.clear();
        hashMap16.clear();
        java.lang.Object obj27 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry6 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] { entry6 };
        hashMap3.table = entryArray7;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        java.lang.Object obj11 = hashMap3.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap14.clear();
        java.lang.Object obj16 = hashMap3.remove((java.lang.Object) hashMap14);
        int int17 = hashMap14.modCount;
        boolean boolean18 = hashMap14.isEmpty();
        boolean boolean19 = hashMap14.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry23 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] { entry23 };
        hashMap20.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        java.lang.Object obj28 = hashMap20.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap31.clear();
        java.lang.Object obj33 = hashMap20.remove((java.lang.Object) hashMap31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) boolean19, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        int int11 = hashMap7.modCount;
        boolean boolean12 = hashMap7.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap7.remove(obj13);
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap7.table;
        java.lang.Object obj19 = hashMap1.get((java.lang.Object) entryArray18);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry27 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] { entry27 };
        hashMap24.table = entryArray28;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap24.table;
        java.lang.Object obj32 = hashMap24.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap24.table;
        boolean boolean34 = hashMap24.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap24.table;
        java.lang.Object obj36 = hashMap1.put((java.lang.Object) entryArray23, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap0.table;
        boolean boolean10 = hashMap0.repOK();
        int int11 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (byte) 0);
        int int17 = hashMap13.size();
        boolean boolean18 = hashMap13.repOK();
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        int int24 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry27 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        hashMap22.table = entryArray28;
        hashMap13.table = entryArray28;
        boolean boolean32 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(10);
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) boolean32, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap8.table = entryArray10;
        int int12 = hashMap8.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) int12);
        int int14 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(10, (float) 100L);
        int int18 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        hashMap8.clear();
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) 'a');
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) hashMap8);
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        hashMap3.table = entryArray19;
        boolean boolean21 = hashMap3.isEmpty();
        int int22 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) (byte) -1);
        boolean boolean28 = hashMap24.repOK();
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap34.table;
        hashMap33.table = entryArray35;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        hashMap33.table = entryArray39;
        int int41 = hashMap33.modCount;
        java.lang.Object obj42 = hashMap24.remove((java.lang.Object) int41);
        java.lang.Class<?> wildcardClass43 = hashMap24.getClass();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) int22, (java.lang.Object) wildcardClass43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        int int5 = hashMap1.size();
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        hashMap10.table = entryArray16;
        hashMap1.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        int int25 = hashMap24.size();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry33 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] { entry33 };
        hashMap30.table = entryArray34;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        int int37 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        hashMap38.modCount = (short) 0;
        java.lang.Object obj42 = hashMap30.get((java.lang.Object) hashMap38);
        java.lang.Object obj43 = hashMap24.remove((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry46 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.repOK();
        boolean boolean50 = hashMap45.repOK();
        java.lang.Object obj51 = hashMap30.remove((java.lang.Object) hashMap45);
        java.lang.Object obj52 = hashMap1.put((java.lang.Object) entryArray23, obj51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 100L);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = null;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        java.lang.Object obj9 = hashMap6.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = hashMap6.repOK();
        hashMap6.modCount = 0;
        hashMap6.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap16.table = entryArray22;
        hashMap6.table = entryArray22;
        java.lang.Object obj25 = hashMap2.put(obj4, (java.lang.Object) entryArray22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        int int11 = hashMap7.modCount;
        boolean boolean12 = hashMap7.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap7.remove(obj13);
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap7.table;
        java.lang.Object obj19 = hashMap1.get((java.lang.Object) entryArray18);
        int int20 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        java.lang.Object obj24 = hashMap1.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        java.lang.Object obj29 = hashMap26.get((java.lang.Object) (byte) -1);
        boolean boolean30 = hashMap26.repOK();
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) 10);
        hashMap26.modCount = '4';
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry37 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap36.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        hashMap41.clear();
        hashMap41.clear();
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) 'a');
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) hashMap41);
        boolean boolean48 = hashMap41.isEmpty();
        java.lang.Object obj49 = hashMap22.put((java.lang.Object) hashMap26, (java.lang.Object) boolean48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap22", hashMap22.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        java.lang.Class<?> wildcardClass10 = entryArray9.getClass();
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) wildcardClass10);
        boolean boolean12 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap14.table;
        java.lang.Class<?> wildcardClass20 = entryArray19.getClass();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap23.table = entryArray25;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        hashMap23.table = entryArray29;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap23.table;
        java.lang.Class<?> wildcardClass32 = entryArray31.getClass();
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) wildcardClass20, (java.lang.Object) wildcardClass32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        int int10 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) (byte) 0);
        int int16 = hashMap12.modCount;
        boolean boolean17 = hashMap12.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMap12.remove(obj18);
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap12.table;
        java.lang.Object obj24 = hashMap6.get((java.lang.Object) entryArray23);
        int int25 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        hashMap27.clear();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) entryArray26, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        int int10 = hashMap6.size();
        hashMap6.modCount = (-1);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry16 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] { entry16 };
        hashMap13.table = entryArray17;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        java.lang.Object obj21 = hashMap13.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap6.table = entryArray22;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) (byte) -1);
        boolean boolean29 = hashMap25.repOK();
        boolean boolean30 = hashMap25.repOK();
        java.lang.Object obj32 = hashMap25.get((java.lang.Object) (short) 100);
        boolean boolean33 = hashMap25.repOK();
        hashMap25.modCount = 1;
        hashMap25.modCount = (short) 100;
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.modCount = (short) 0;
        boolean boolean11 = hashMap7.repOK();
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        java.lang.Object obj14 = hashMap2.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        int int19 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry23 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] { entry23 };
        hashMap20.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        int int27 = hashMap20.modCount;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        hashMap28.modCount = (short) 0;
        java.lang.Object obj32 = hashMap20.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry35 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] { entry35 };
        hashMap34.table = entryArray36;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap20.table = entryArray39;
        hashMap20.clear();
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) int19, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        hashMap3.clear();
        int int7 = hashMap3.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap3.remove(obj8);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Class<?> wildcardClass14 = hashMap13.getClass();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) wildcardClass14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        int int20 = hashMap17.modCount;
        boolean boolean21 = hashMap17.repOK();
        java.lang.Object obj22 = hashMap1.put(obj15, (java.lang.Object) boolean21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap6.table = entryArray10;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        hashMap6.table = entryArray16;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) (byte) 0);
        int int24 = hashMap20.modCount;
        boolean boolean25 = hashMap20.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMap20.remove(obj26);
        hashMap20.clear();
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap20.table;
        hashMap6.table = entryArray31;
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        int int4 = hashMap0.size();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.repOK();
        boolean boolean9 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry13 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] { entry13 };
        hashMap10.table = entryArray14;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        java.lang.Object obj18 = hashMap10.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap21.clear();
        java.lang.Object obj23 = hashMap10.remove((java.lang.Object) hashMap21);
        int int24 = hashMap21.modCount;
        boolean boolean25 = hashMap21.isEmpty();
        boolean boolean26 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        hashMap27.clear();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) boolean26, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        int int7 = hashMap1.size();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry12 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        int int15 = hashMap11.modCount;
        hashMap11.modCount = (byte) 10;
        boolean boolean18 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        hashMap19.modCount = (short) 0;
        int int23 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) boolean18, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        int int11 = hashMap7.modCount;
        boolean boolean12 = hashMap7.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap7.remove(obj13);
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap7.table;
        java.lang.Object obj19 = hashMap1.get((java.lang.Object) entryArray18);
        int int20 = hashMap1.size();
        int int21 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) (byte) 0);
        int int27 = hashMap23.size();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        java.lang.Object obj32 = hashMap29.remove((java.lang.Object) (byte) 0);
        int int33 = hashMap29.modCount;
        boolean boolean34 = hashMap29.isEmpty();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = hashMap29.remove(obj35);
        hashMap29.clear();
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap29.table;
        int int41 = hashMap29.size();
        java.lang.Object obj42 = hashMap23.get((java.lang.Object) hashMap29);
        hashMap29.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (short) 10, 1.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap47.table;
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) (byte) -1);
        boolean boolean9 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap2.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        hashMap12.clear();
        hashMap12.clear();
        int int16 = hashMap12.modCount;
        int int17 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap20.table = entryArray22;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap20.table = entryArray26;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap20.table;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap20.table;
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) entryArray29);
        hashMap2.table = entryArray29;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        int int33 = hashMap32.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        boolean boolean36 = hashMap34.isEmpty();
        java.lang.Object obj37 = hashMap32.get((java.lang.Object) hashMap34);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry41 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] { entry41 };
        hashMap38.table = entryArray42;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap38.table;
        int int45 = hashMap38.modCount;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        hashMap46.modCount = (short) 0;
        java.lang.Object obj50 = hashMap38.get((java.lang.Object) hashMap46);
        java.lang.Object obj51 = hashMap32.remove((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry54 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = new system.classfixer.classes.HashMap.Entry[] { entry54 };
        hashMap53.table = entryArray55;
        boolean boolean57 = hashMap53.repOK();
        boolean boolean58 = hashMap53.repOK();
        java.lang.Object obj59 = hashMap38.remove((java.lang.Object) hashMap53);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.repOK();
        hashMap60.clear();
        hashMap60.clear();
        java.lang.Object obj64 = hashMap53.get((java.lang.Object) hashMap60);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap66.clear();
        java.lang.Object obj69 = hashMap66.remove((java.lang.Object) (byte) 0);
        int int70 = hashMap66.modCount;
        hashMap66.clear();
        hashMap66.clear();
        system.classfixer.classes.HashMap hashMap74 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap();
        java.lang.Object obj77 = hashMap75.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry78 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray79 = new system.classfixer.classes.HashMap.Entry[] { entry78 };
        hashMap75.table = entryArray79;
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap75.table;
        java.lang.Object obj83 = hashMap75.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray84 = hashMap75.table;
        hashMap74.table = entryArray84;
        hashMap66.table = entryArray84;
        java.lang.Class<?> wildcardClass87 = hashMap66.getClass();
        java.lang.Object obj88 = hashMap2.put((java.lang.Object) hashMap60, (java.lang.Object) hashMap66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        boolean boolean5 = hashMap1.repOK();
        hashMap1.modCount = 0;
        hashMap1.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry14 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap11.table = entryArray17;
        hashMap1.table = entryArray17;
        int int20 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) 'a');
        int int23 = hashMap22.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap22.clear();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.get((java.lang.Object) (-1.0d));
        hashMap31.clear();
        java.lang.Object obj35 = hashMap29.get((java.lang.Object) hashMap31);
        hashMap31.clear();
        java.lang.Object obj37 = hashMap28.remove((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) 'a');
        int int40 = hashMap39.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap39.table;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap39.table;
        hashMap28.table = entryArray42;
        hashMap22.table = entryArray42;
        hashMap22.modCount = ' ';
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj49 = hashMap47.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry50 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] { entry50 };
        hashMap47.table = entryArray51;
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap47.table;
        int int54 = hashMap47.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap47.table;
        java.lang.Class<?> wildcardClass56 = hashMap47.getClass();
        java.lang.Object obj57 = hashMap1.put((java.lang.Object) ' ', (java.lang.Object) wildcardClass56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        int int4 = hashMap0.size();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) wildcardClass11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        int int18 = hashMap14.modCount;
        hashMap14.modCount = (byte) 10;
        boolean boolean21 = hashMap14.repOK();
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry25 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        boolean boolean28 = hashMap24.repOK();
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) boolean28);
        boolean boolean30 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.modCount = (short) 0;
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = hashMap31.remove(obj35);
        int int37 = hashMap31.modCount;
        int int38 = hashMap31.size();
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) int38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) (byte) 0);
        int int13 = hashMap9.modCount;
        boolean boolean14 = hashMap9.isEmpty();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = hashMap9.remove(obj15);
        hashMap9.clear();
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap9.table;
        int int21 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        java.lang.Object obj27 = hashMap24.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        hashMap8.modCount = (short) 0;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap8);
        boolean boolean13 = hashMap8.repOK();
        int int14 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        int int18 = hashMap16.size();
        int int19 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        hashMap20.clear();
        int int24 = hashMap20.size();
        int int25 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        hashMap16.table = entryArray26;
        int int28 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        hashMap29.clear();
        hashMap29.modCount = (short) -1;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap29.remove(obj34);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap29.table;
        java.lang.Object obj37 = hashMap8.put((java.lang.Object) int28, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        int int8 = hashMap4.size();
        boolean boolean9 = hashMap4.repOK();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) 2);
        hashMap4.modCount = (-1);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) (-1));
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) 'a');
        int int20 = hashMap19.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap16.table = entryArray22;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry28 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] { entry28 };
        hashMap25.table = entryArray29;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap25.table;
        int int32 = hashMap25.modCount;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        hashMap33.modCount = (short) 0;
        java.lang.Object obj37 = hashMap25.get((java.lang.Object) hashMap33);
        hashMap33.clear();
        boolean boolean39 = hashMap33.repOK();
        java.lang.Object obj40 = hashMap16.get((java.lang.Object) boolean39);
        java.lang.Object obj41 = hashMap1.put((java.lang.Object) 100.0d, (java.lang.Object) boolean39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        int int8 = hashMap6.size();
        int int9 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(10, (float) 100L);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) entryArray16, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry3 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10, 1.0f);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        int int18 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry21 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        hashMap16.table = entryArray22;
        hashMap11.table = entryArray22;
        int int26 = hashMap11.modCount;
        hashMap11.modCount = 1;
        hashMap11.modCount = '4';
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) '4', (float) (short) 10);
        hashMap33.clear();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) '4', (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        hashMap5.table = entryArray11;
        hashMap0.table = entryArray11;
        int int15 = hashMap0.modCount;
        hashMap0.modCount = 1;
        hashMap0.modCount = '4';
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        java.lang.Object obj24 = hashMap21.remove((java.lang.Object) (byte) 0);
        int int25 = hashMap21.modCount;
        hashMap21.clear();
        boolean boolean27 = hashMap21.repOK();
        int int28 = hashMap21.modCount;
        int int29 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        int int34 = hashMap31.modCount;
        java.lang.Object obj35 = hashMap21.get((java.lang.Object) int34);
        java.lang.Object obj36 = hashMap0.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0, (float) (byte) 100);
        hashMap39.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap44.table;
        java.lang.Object obj46 = hashMap21.put((java.lang.Object) hashMap39, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        boolean boolean4 = hashMap1.repOK();
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.get((java.lang.Object) (-1.0d));
        hashMap10.clear();
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) hashMap10);
        hashMap10.clear();
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap10);
        int int17 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        hashMap18.clear();
        hashMap18.modCount = (short) -1;
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap18.remove(obj23);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        hashMap10.table = entryArray25;
        java.lang.Object obj27 = hashMap1.put(obj5, (java.lang.Object) entryArray25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) (byte) -1);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        int int13 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        hashMap14.clear();
        hashMap14.clear();
        int int18 = hashMap14.size();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap14.remove(obj19);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap14.table;
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap7.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap12.table = entryArray16;
        int int18 = hashMap12.modCount;
        hashMap12.modCount = (short) -1;
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) entryArray10, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 0);
        boolean boolean5 = hashMap1.repOK();
        hashMap1.modCount = 0;
        hashMap1.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        int int14 = hashMap10.size();
        hashMap10.modCount = '#';
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) '#');
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj22 = hashMap19.get((java.lang.Object) (byte) -1);
        boolean boolean23 = hashMap19.repOK();
        boolean boolean24 = hashMap19.repOK();
        java.lang.Object obj26 = hashMap19.get((java.lang.Object) (short) 100);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) (short) 100, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap12.table = entryArray18;
        java.lang.Object obj20 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        int int22 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        boolean boolean25 = hashMap23.isEmpty();
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry entry30 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] { entry30 };
        hashMap27.table = entryArray31;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap27.table;
        int int34 = hashMap27.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        hashMap35.modCount = (short) 0;
        java.lang.Object obj39 = hashMap27.get((java.lang.Object) hashMap35);
        java.lang.Object obj40 = hashMap21.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry43 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = new system.classfixer.classes.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.repOK();
        boolean boolean47 = hashMap42.repOK();
        java.lang.Object obj48 = hashMap27.remove((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.repOK();
        hashMap49.clear();
        hashMap49.clear();
        java.lang.Object obj53 = hashMap42.get((java.lang.Object) hashMap49);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap(2, 100.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap56.table;
        hashMap49.table = entryArray57;
        hashMap12.table = entryArray57;
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.repOK();
        hashMap60.clear();
        hashMap60.clear();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap65.clear();
        int int67 = hashMap65.size();
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry70 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray71 = new system.classfixer.classes.HashMap.Entry[] { entry70 };
        hashMap69.table = entryArray71;
        hashMap65.table = entryArray71;
        hashMap60.table = entryArray71;
        boolean boolean75 = hashMap60.isEmpty();
        boolean boolean76 = hashMap60.isEmpty();
        java.lang.Object obj77 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 1L);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass15 = hashMap9.getClass();
        java.lang.Object obj16 = hashMap4.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap4.table;
        hashMap2.table = entryArray17;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        int int24 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        hashMap28.modCount = (short) 0;
        boolean boolean32 = hashMap28.repOK();
        java.lang.Object obj33 = hashMap27.remove((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        java.lang.Object obj35 = hashMap23.remove((java.lang.Object) hashMap27);
        java.lang.Object obj36 = hashMap20.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(10, (float) 10L);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap42.table;
        hashMap39.table = entryArray43;
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) hashMap23, (java.lang.Object) entryArray43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', (float) ' ');
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (byte) 0);
        int int12 = hashMap8.size();
        boolean boolean13 = hashMap8.repOK();
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry22 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        hashMap17.table = entryArray23;
        hashMap8.table = entryArray23;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry29 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] { entry29 };
        hashMap28.table = entryArray30;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        hashMap33.clear();
        hashMap33.clear();
        java.lang.Object obj38 = hashMap33.remove((java.lang.Object) 'a');
        java.lang.Object obj39 = hashMap28.get((java.lang.Object) hashMap33);
        int int40 = hashMap28.size();
        int int41 = hashMap28.modCount;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry44 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = new system.classfixer.classes.HashMap.Entry[] { entry44 };
        hashMap43.table = entryArray45;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        boolean boolean49 = hashMap48.repOK();
        hashMap48.clear();
        hashMap48.clear();
        java.lang.Object obj53 = hashMap48.remove((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap43.get((java.lang.Object) hashMap48);
        java.lang.Object obj55 = hashMap28.get((java.lang.Object) hashMap48);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry58 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray59 = new system.classfixer.classes.HashMap.Entry[] { entry58 };
        hashMap57.table = entryArray59;
        int int61 = hashMap57.modCount;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap63.table;
        hashMap57.table = entryArray64;
        java.lang.Object obj66 = hashMap28.get((java.lang.Object) entryArray64);
        hashMap8.table = entryArray64;
        java.lang.Object obj68 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }
}

