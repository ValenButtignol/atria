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
        hashMap0.modCount = (short) 0;
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (short) -1);
        int int7 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap3);
        int int10 = hashMap0.size();
        int int11 = hashMap0.size();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap0.clear();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        hashMap2.clear();
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap2.table = entryArray9;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap2.table;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        int int8 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        boolean boolean11 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap2.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        int int4 = hashMap0.size();
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        int int12 = hashMap7.modCount;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) -1);
        int int20 = hashMap16.size();
        boolean boolean21 = hashMap16.repOK();
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) boolean21);
        boolean boolean23 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap29.table;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap29.remove(obj34);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.repOK();
        java.lang.Object obj39 = hashMap36.get((java.lang.Object) (short) -1);
        int int40 = hashMap36.size();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap41.put((java.lang.Object) true, (java.lang.Object) "");
        int int45 = hashMap41.size();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap41.table;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap41.table;
        hashMap36.table = entryArray47;
        hashMap29.table = entryArray47;
        hashMap26.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap26", hashMap26.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (short) -1);
        int int7 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap3);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (short) -1);
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) true, (java.lang.Object) "");
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap3.table = entryArray14;
        hashMap1.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        int int4 = hashMap0.size();
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        int int12 = hashMap7.modCount;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) -1);
        int int20 = hashMap16.size();
        boolean boolean21 = hashMap16.repOK();
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) boolean21);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = null;
        hashMap7.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        int int18 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        hashMap19.modCount = (short) 0;
        int int23 = hashMap19.size();
        java.lang.Class<?> wildcardClass24 = hashMap19.getClass();
        java.lang.Object obj25 = hashMap7.get((java.lang.Object) wildcardClass24);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        hashMap38.clear();
        hashMap38.modCount = (short) 0;
        java.lang.Object obj42 = hashMap26.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap38);
        boolean boolean43 = hashMap33.isEmpty();
        int int44 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj51 = hashMap45.remove((java.lang.Object) (short) 10);
        java.lang.Object obj52 = hashMap7.put((java.lang.Object) int44, (java.lang.Object) (short) 10);
        int int53 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap54.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap54.table;
        int int59 = hashMap54.modCount;
        hashMap54.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap54.table;
        java.lang.Object obj63 = hashMap7.remove((java.lang.Object) entryArray62);
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean66 = hashMap65.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap65.table;
        hashMap7.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap7.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.repOK();
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        hashMap7.modCount = (short) 0;
        java.lang.Object obj11 = hashMap0.put(obj6, (java.lang.Object) (short) 0);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 10.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) (short) -1);
        int int13 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj15 = hashMap6.get((java.lang.Object) hashMap9);
        int int16 = hashMap6.size();
        int int17 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap6.table;
        hashMap4.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        int int4 = hashMap0.size();
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        int int12 = hashMap7.modCount;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) -1);
        int int20 = hashMap16.size();
        boolean boolean21 = hashMap16.repOK();
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) boolean21);
        boolean boolean23 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) hashMap26);
        hashMap26.modCount = ' ';
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        int int36 = hashMap31.modCount;
        hashMap31.modCount = (byte) 100;
        boolean boolean39 = hashMap31.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap31.table;
        hashMap26.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap26", hashMap26.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap9.clear();
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        hashMap24.clear();
        hashMap24.modCount = (short) 0;
        java.lang.Object obj28 = hashMap12.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap24);
        boolean boolean29 = hashMap19.isEmpty();
        int int30 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        hashMap31.clear();
        hashMap31.modCount = (short) 0;
        int int35 = hashMap31.size();
        java.lang.Class<?> wildcardClass36 = hashMap31.getClass();
        java.lang.Object obj37 = hashMap19.get((java.lang.Object) wildcardClass36);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap38.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj44 = hashMap38.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap45.table;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        hashMap50.clear();
        hashMap50.modCount = (short) 0;
        java.lang.Object obj54 = hashMap38.put((java.lang.Object) hashMap45, (java.lang.Object) hashMap50);
        boolean boolean55 = hashMap45.isEmpty();
        int int56 = hashMap45.modCount;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj60 = hashMap57.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj63 = hashMap57.remove((java.lang.Object) (short) 10);
        java.lang.Object obj64 = hashMap19.put((java.lang.Object) int56, (java.lang.Object) (short) 10);
        int int65 = hashMap19.modCount;
        java.lang.Object obj66 = hashMap9.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        java.lang.Object obj70 = hashMap67.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap67.table;
        int int72 = hashMap67.modCount;
        hashMap67.modCount = (byte) 100;
        boolean boolean75 = hashMap67.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap67.table;
        system.classfixer.classes.HashMap hashMap77 = new system.classfixer.classes.HashMap();
        java.lang.Object obj80 = hashMap77.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap77.table;
        int int82 = hashMap77.modCount;
        hashMap77.modCount = (byte) 100;
        java.lang.Object obj85 = hashMap67.remove((java.lang.Object) hashMap77);
        system.classfixer.classes.HashMap hashMap86 = new system.classfixer.classes.HashMap();
        java.lang.Object obj89 = hashMap86.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray90 = hashMap86.table;
        int int91 = hashMap86.modCount;
        hashMap86.modCount = (byte) 100;
        boolean boolean94 = hashMap86.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray95 = hashMap86.table;
        java.lang.Object obj96 = hashMap67.remove((java.lang.Object) entryArray95);
        hashMap9.table = entryArray95;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = null;
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        int int18 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        hashMap19.modCount = (short) 0;
        int int23 = hashMap19.size();
        java.lang.Class<?> wildcardClass24 = hashMap19.getClass();
        java.lang.Object obj25 = hashMap7.get((java.lang.Object) wildcardClass24);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        hashMap38.clear();
        hashMap38.modCount = (short) 0;
        java.lang.Object obj42 = hashMap26.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap38);
        boolean boolean43 = hashMap33.isEmpty();
        int int44 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj51 = hashMap45.remove((java.lang.Object) (short) 10);
        java.lang.Object obj52 = hashMap7.put((java.lang.Object) int44, (java.lang.Object) (short) 10);
        hashMap7.modCount = 3;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = null;
        hashMap7.table = entryArray55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        hashMap3.clear();
        boolean boolean5 = hashMap3.isEmpty();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap3.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) '4');
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = 0;
        hashMap0.modCount = ' ';
        system.classfixer.classes.HashMap.Entry[] entryArray10 = null;
        hashMap0.table = entryArray10;
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
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 100);
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        hashMap23.clear();
        hashMap23.modCount = (short) 0;
        java.lang.Object obj27 = hashMap11.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap23);
        boolean boolean28 = hashMap18.isEmpty();
        int int29 = hashMap18.modCount;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap30.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap30.table;
        int int35 = hashMap30.modCount;
        hashMap30.modCount = (byte) 100;
        boolean boolean38 = hashMap30.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap30.table;
        hashMap18.table = entryArray39;
        hashMap9.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        int int18 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        hashMap19.clear();
        hashMap19.modCount = (short) 0;
        int int23 = hashMap19.size();
        java.lang.Class<?> wildcardClass24 = hashMap19.getClass();
        java.lang.Object obj25 = hashMap7.get((java.lang.Object) wildcardClass24);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        hashMap38.clear();
        hashMap38.modCount = (short) 0;
        java.lang.Object obj42 = hashMap26.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap38);
        boolean boolean43 = hashMap33.isEmpty();
        int int44 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap45.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj51 = hashMap45.remove((java.lang.Object) (short) 10);
        java.lang.Object obj52 = hashMap7.put((java.lang.Object) int44, (java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap7.table;
        boolean boolean54 = hashMap7.repOK();
        hashMap7.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
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
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.modCount = '#';
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 100);
        boolean boolean13 = hashMap12.repOK();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap12);
        int int15 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) (short) 10);
        int int23 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap16.table;
        hashMap12.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        int int8 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        hashMap13.modCount = (short) 0;
        int int17 = hashMap13.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap20.clear();
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap20);
        java.lang.Object obj26 = hashMap13.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap19.table;
        hashMap3.table = entryArray27;
        hashMap2.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = (byte) 100;
        boolean boolean12 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        boolean boolean19 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) (short) -1);
        int int24 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) true, (java.lang.Object) "");
        int int29 = hashMap25.size();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap25.table;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap25.table;
        hashMap20.table = entryArray31;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        int int38 = hashMap33.modCount;
        hashMap33.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap33.table;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap33.table;
        hashMap20.table = entryArray42;
        hashMap14.table = entryArray42;
        hashMap4.table = entryArray42;
        hashMap1.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        hashMap14.clear();
        hashMap14.modCount = (short) 0;
        int int18 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap21.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap21.clear();
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) hashMap21);
        java.lang.Object obj27 = hashMap14.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap20.table;
        hashMap4.table = entryArray28;
        hashMap2.table = entryArray28;
        java.lang.Object obj31 = hashMap1.get((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(10, 10.0f);
        int int35 = hashMap34.modCount;
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.repOK();
        hashMap36.clear();
        hashMap36.modCount = 0;
        int int41 = hashMap36.modCount;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        java.lang.Object obj45 = hashMap42.get((java.lang.Object) (short) -1);
        int int46 = hashMap42.size();
        int int47 = hashMap42.modCount;
        hashMap42.clear();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap51.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap51.clear();
        java.lang.Object obj56 = hashMap50.get((java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap50.table;
        hashMap42.table = entryArray57;
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        hashMap59.clear();
        boolean boolean61 = hashMap59.isEmpty();
        boolean boolean62 = hashMap59.isEmpty();
        java.lang.Object obj63 = hashMap42.get((java.lang.Object) boolean62);
        boolean boolean64 = hashMap42.isEmpty();
        java.lang.Object obj65 = hashMap34.put((java.lang.Object) hashMap36, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        java.lang.Object obj69 = hashMap66.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap66.table;
        hashMap42.table = entryArray70;
        hashMap1.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 35);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (short) -1);
        int int7 = hashMap3.size();
        int int8 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        hashMap9.modCount = (short) 0;
        int int13 = hashMap9.size();
        java.lang.Class<?> wildcardClass14 = hashMap9.getClass();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap3.put((java.lang.Object) wildcardClass14, (java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        java.lang.Object obj20 = hashMap17.get((java.lang.Object) (short) -1);
        int int21 = hashMap17.size();
        int int22 = hashMap17.modCount;
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap26.clear();
        java.lang.Object obj31 = hashMap25.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap17.table = entryArray32;
        hashMap15.table = entryArray32;
        hashMap2.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) true, (java.lang.Object) "");
        int int8 = hashMap4.size();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap4.put((java.lang.Object) 0L, obj10);
        int int12 = hashMap4.size();
        hashMap4.clear();
        boolean boolean14 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap4.table;
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        hashMap17.modCount = (short) 0;
        java.lang.Object obj21 = hashMap5.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        hashMap5.modCount = ' ';
        int int24 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap5.table;
        hashMap1.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 35);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        boolean boolean4 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        hashMap6.clear();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        hashMap9.clear();
        boolean boolean11 = hashMap9.isEmpty();
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) boolean11);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        int int18 = hashMap13.modCount;
        hashMap13.modCount = (byte) 100;
        boolean boolean21 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        int int28 = hashMap23.modCount;
        hashMap23.modCount = (byte) 100;
        java.lang.Object obj31 = hashMap13.remove((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        hashMap32.clear();
        hashMap32.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap35.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        hashMap32.table = entryArray39;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap32.table;
        java.lang.Object obj42 = hashMap23.get((java.lang.Object) entryArray41);
        hashMap6.table = entryArray41;
        hashMap2.table = entryArray41;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 1);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        hashMap16.modCount = (short) 0;
        java.lang.Object obj20 = hashMap4.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap16);
        hashMap4.modCount = ' ';
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap4.table;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap7.clear();
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) hashMap7);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap6.table;
        boolean boolean15 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj26 = hashMap20.remove((java.lang.Object) (short) 10);
        int int27 = hashMap20.size();
        boolean boolean28 = hashMap20.repOK();
        int int29 = hashMap20.modCount;
        java.lang.Object obj30 = hashMap6.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap20);
        hashMap16.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap16", hashMap16.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (short) -1);
        int int7 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap3);
        int int10 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        java.lang.Object obj3 = null;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) (short) -1);
        int int8 = hashMap4.size();
        int int9 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        hashMap10.modCount = (short) 0;
        int int14 = hashMap10.size();
        java.lang.Class<?> wildcardClass15 = hashMap10.getClass();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap4.put((java.lang.Object) wildcardClass15, (java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap18.remove(obj23);
        hashMap18.clear();
        java.lang.Object obj26 = hashMap4.remove((java.lang.Object) hashMap18);
        java.lang.Class<?> wildcardClass27 = hashMap4.getClass();
        java.lang.Object obj28 = hashMap2.put(obj3, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap34.put((java.lang.Object) true, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (short) 10);
        java.lang.Object obj40 = hashMap34.remove((java.lang.Object) (short) 10);
        int int41 = hashMap34.size();
        boolean boolean42 = hashMap34.isEmpty();
        java.lang.Object obj43 = hashMap29.remove((java.lang.Object) hashMap34);
        int int44 = hashMap29.modCount;
        int int45 = hashMap29.size();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        hashMap46.clear();
        hashMap46.modCount = (short) 0;
        int int50 = hashMap46.size();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap53.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap53.clear();
        java.lang.Object obj58 = hashMap52.get((java.lang.Object) hashMap53);
        java.lang.Object obj59 = hashMap46.get((java.lang.Object) hashMap52);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.repOK();
        java.lang.Object obj63 = hashMap60.get((java.lang.Object) (short) -1);
        int int64 = hashMap60.size();
        int int65 = hashMap60.modCount;
        hashMap60.clear();
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap();
        java.lang.Object obj72 = hashMap69.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap69.clear();
        java.lang.Object obj74 = hashMap68.get((java.lang.Object) hashMap69);
        system.classfixer.classes.HashMap.Entry[] entryArray75 = hashMap68.table;
        hashMap60.table = entryArray75;
        hashMap52.table = entryArray75;
        hashMap52.clear();
        hashMap52.modCount = 10;
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap52.table;
        hashMap29.table = entryArray81;
        hashMap2.table = entryArray81;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) (short) -1);
        int int11 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) true, (java.lang.Object) "");
        int int16 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        hashMap7.table = entryArray18;
        hashMap0.table = entryArray18;
        boolean boolean21 = hashMap0.repOK();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        hashMap4.modCount = (short) 0;
        int int8 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap11.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap11);
        java.lang.Object obj17 = hashMap4.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        java.lang.Object obj21 = hashMap18.get((java.lang.Object) (short) -1);
        int int22 = hashMap18.size();
        int int23 = hashMap18.modCount;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) true, (java.lang.Object) "");
        hashMap27.clear();
        java.lang.Object obj32 = hashMap26.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap26.table;
        hashMap18.table = entryArray33;
        hashMap10.table = entryArray33;
        hashMap1.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        int int4 = hashMap0.size();
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        int int12 = hashMap7.modCount;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) -1);
        int int20 = hashMap16.size();
        boolean boolean21 = hashMap16.repOK();
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) boolean21);
        int int23 = hashMap0.size();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = null;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

