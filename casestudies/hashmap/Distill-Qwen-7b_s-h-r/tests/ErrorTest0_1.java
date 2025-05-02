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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj11 = hashMap7.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap12.remove(obj14);
        int int16 = hashMap12.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        boolean boolean21 = hashMap17.isEmpty();
        java.lang.Object obj22 = hashMap12.remove((java.lang.Object) hashMap17);
        int int23 = hashMap12.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap12.get((java.lang.Object) entryArray26);
        hashMap7.table = entryArray26;
        int int29 = hashMap7.size();
        java.lang.Class<?> wildcardClass30 = hashMap7.getClass();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        java.lang.Object obj33 = hashMap5.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap31);
        java.lang.Object obj34 = hashMap0.get(obj33);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0);
        int int37 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) hashMap13);
        hashMap12.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) entryArray20);
        java.lang.Object obj23 = hashMap1.put(obj21, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap8.table = entryArray19;
        hashMap5.table = entryArray19;
        hashMap5.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(2);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) hashMap26);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap5, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        int int9 = hashMap6.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '#');
        boolean boolean12 = hashMap11.isEmpty();
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) boolean12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        int int21 = hashMap19.modCount;
        java.lang.Object obj22 = hashMap18.get((java.lang.Object) int21);
        int int23 = hashMap18.modCount;
        java.lang.Object obj24 = hashMap14.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap25.remove(obj27);
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        java.lang.Object obj34 = hashMap30.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap35.remove(obj37);
        int int39 = hashMap35.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        hashMap40.clear();
        boolean boolean44 = hashMap40.isEmpty();
        java.lang.Object obj45 = hashMap35.remove((java.lang.Object) hashMap40);
        int int46 = hashMap35.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        hashMap47.clear();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap47.table;
        java.lang.Object obj50 = hashMap35.get((java.lang.Object) entryArray49);
        hashMap30.table = entryArray49;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap30.table;
        java.lang.Object obj54 = hashMap25.put((java.lang.Object) entryArray52, (java.lang.Object) '#');
        hashMap14.table = entryArray52;
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = hashMap6.put((java.lang.Object) entryArray52, obj56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) '#');
        hashMap1.modCount = 2;
        hashMap1.modCount = (-1);
        int int8 = hashMap1.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 1);
        hashMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) hashMap10, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(2);
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(2);
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        int int21 = hashMap20.size();
        hashMap20.modCount = (-1);
        int int24 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap20.table;
        java.lang.Object obj26 = hashMap5.put((java.lang.Object) hashMap17, (java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(2);
        int int29 = hashMap28.modCount;
        java.lang.Object obj30 = hashMap1.put(obj26, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap6.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) hashMap15);
        hashMap14.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        java.lang.Object obj23 = hashMap14.get((java.lang.Object) entryArray22);
        hashMap12.table = entryArray22;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = hashMap26.remove(obj28);
        int int30 = hashMap26.modCount;
        java.lang.Object obj31 = hashMap0.put(obj25, (java.lang.Object) int30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap8.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap33);
        hashMap33.clear();
        java.lang.Object obj37 = hashMap20.get((java.lang.Object) hashMap33);
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap33);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap33.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        java.lang.Object obj45 = hashMap40.get((java.lang.Object) 2);
        int int46 = hashMap40.modCount;
        java.lang.Object obj47 = hashMap33.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.modCount = 0;
        java.lang.Object obj53 = hashMap49.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj56 = hashMap50.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.modCount = 0;
        java.lang.Object obj62 = hashMap58.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        hashMap63.clear();
        java.lang.Object obj65 = hashMap58.remove((java.lang.Object) hashMap63);
        hashMap63.clear();
        java.lang.Object obj67 = hashMap50.get((java.lang.Object) hashMap63);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        int int70 = hashMap68.size();
        hashMap68.clear();
        int int72 = hashMap68.modCount;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        int int74 = hashMap73.modCount;
        int int75 = hashMap73.modCount;
        hashMap73.clear();
        java.lang.Object obj77 = hashMap68.remove((java.lang.Object) hashMap73);
        java.lang.Class<?> wildcardClass78 = hashMap68.getClass();
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj82 = hashMap80.remove((java.lang.Object) (-1L));
        hashMap80.clear();
        java.lang.Object obj84 = hashMap50.put((java.lang.Object) hashMap68, (java.lang.Object) hashMap80);
        system.testclass.HashMap.Entry[] entryArray85 = hashMap80.table;
        hashMap33.table = entryArray85;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap33", hashMap33.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 101);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = ' ';
        hashMap6.clear();
        java.lang.Object obj12 = null;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) hashMap22);
        hashMap21.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap19.table = entryArray29;
        java.lang.Object obj32 = hashMap13.remove((java.lang.Object) hashMap19);
        hashMap13.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        int int37 = hashMap34.modCount;
        int int38 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap34.table;
        java.lang.Object obj40 = hashMap13.remove((java.lang.Object) entryArray39);
        java.lang.Object obj41 = hashMap6.put(obj12, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) hashMap3, obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap7.remove(obj9);
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) hashMap12);
        int int18 = hashMap7.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap7.get((java.lang.Object) entryArray21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        hashMap28.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap28.get((java.lang.Object) entryArray36);
        hashMap23.table = entryArray36;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = hashMap40.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        hashMap45.clear();
        java.lang.Object obj47 = hashMap40.remove((java.lang.Object) hashMap45);
        java.lang.Object obj48 = hashMap7.put((java.lang.Object) hashMap23, (java.lang.Object) hashMap45);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap23.table;
        boolean boolean50 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.modCount = 0;
        java.lang.Object obj56 = hashMap52.remove((java.lang.Object) hashMap53);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj59 = hashMap53.get((java.lang.Object) (short) 10);
        java.lang.Object obj60 = hashMap1.put((java.lang.Object) hashMap23, obj59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        int int21 = hashMap20.size();
        hashMap20.modCount = (-1);
        java.lang.Object obj24 = hashMap11.get((java.lang.Object) hashMap20);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap11, obj25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap8);
        hashMap8.modCount = ' ';
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(2);
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        int int31 = hashMap30.size();
        hashMap30.modCount = (-1);
        int int34 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap30.table;
        java.lang.Object obj36 = hashMap15.put((java.lang.Object) hashMap27, (java.lang.Object) entryArray35);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        int int41 = hashMap37.modCount;
        java.lang.Object obj42 = hashMap0.put(obj36, (java.lang.Object) int41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(101, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap5.remove(obj7);
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap5.remove((java.lang.Object) hashMap10);
        int int16 = hashMap5.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap5.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        int int26 = hashMap0.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 1);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) hashMap32);
        hashMap31.clear();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = hashMap38.remove((java.lang.Object) hashMap39);
        hashMap38.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        hashMap44.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap38.get((java.lang.Object) entryArray46);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.modCount = 0;
        java.lang.Object obj53 = hashMap49.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj56 = hashMap50.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.modCount = 0;
        java.lang.Object obj62 = hashMap58.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        hashMap63.clear();
        java.lang.Object obj65 = hashMap58.remove((java.lang.Object) hashMap63);
        hashMap63.clear();
        java.lang.Object obj67 = hashMap50.get((java.lang.Object) hashMap63);
        java.lang.Object obj68 = hashMap31.put((java.lang.Object) entryArray46, (java.lang.Object) hashMap63);
        java.lang.Object obj69 = hashMap28.get((java.lang.Object) entryArray46);
        hashMap28.modCount = 'a';
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        boolean boolean73 = hashMap72.isEmpty();
        int int74 = hashMap72.size();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) (byte) 0);
        hashMap76.modCount = 0;
        java.lang.Object obj79 = hashMap72.remove((java.lang.Object) hashMap76);
        java.lang.Object obj80 = hashMap0.put((java.lang.Object) hashMap28, obj79);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 1);
        int int4 = hashMap3.modCount;
        hashMap3.modCount = 100;
        hashMap3.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.clear();
        int int12 = hashMap10.modCount;
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) int12);
        int int14 = hashMap9.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        int int17 = hashMap15.modCount;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.clear();
        java.lang.Object obj24 = hashMap20.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap25.remove(obj27);
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.clear();
        boolean boolean34 = hashMap30.isEmpty();
        java.lang.Object obj35 = hashMap25.remove((java.lang.Object) hashMap30);
        int int36 = hashMap25.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        java.lang.Object obj40 = hashMap25.get((java.lang.Object) entryArray39);
        hashMap20.table = entryArray39;
        hashMap15.table = entryArray39;
        hashMap9.table = entryArray39;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        hashMap46.clear();
        int int50 = hashMap46.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.clear();
        java.lang.Object obj57 = hashMap53.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        hashMap58.clear();
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = hashMap58.remove(obj60);
        int int62 = hashMap58.modCount;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        int int65 = hashMap63.size();
        hashMap63.clear();
        boolean boolean67 = hashMap63.isEmpty();
        java.lang.Object obj68 = hashMap58.remove((java.lang.Object) hashMap63);
        int int69 = hashMap58.modCount;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.clear();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap70.table;
        java.lang.Object obj73 = hashMap58.get((java.lang.Object) entryArray72);
        hashMap53.table = entryArray72;
        int int75 = hashMap53.size();
        java.lang.Class<?> wildcardClass76 = hashMap53.getClass();
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        java.lang.Object obj79 = hashMap51.put((java.lang.Object) hashMap53, (java.lang.Object) hashMap77);
        java.lang.Object obj80 = hashMap46.get(obj79);
        system.testclass.HashMap.Entry[] entryArray81 = hashMap46.table;
        hashMap44.table = entryArray81;
        hashMap44.clear();
        java.lang.Object obj84 = hashMap3.put((java.lang.Object) entryArray39, (java.lang.Object) hashMap44);
        hashMap1.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) hashMap15);
        hashMap15.clear();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap15);
        hashMap15.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        hashMap25.modCount = 0;
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap21.get((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        hashMap35.modCount = 'a';
        java.lang.Object obj39 = hashMap34.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap35.table;
        boolean boolean41 = hashMap35.isEmpty();
        java.lang.Object obj42 = hashMap15.put(obj31, (java.lang.Object) boolean41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap15", hashMap15.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(32, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        hashMap11.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj29 = hashMap23.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) hashMap36);
        hashMap36.clear();
        java.lang.Object obj40 = hashMap23.get((java.lang.Object) hashMap36);
        java.lang.Object obj41 = hashMap4.put((java.lang.Object) entryArray19, (java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap36.table;
        hashMap2.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 101);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap8.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        hashMap6.table = entryArray16;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap0.table;
        java.lang.Object obj21 = null;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 1);
        hashMap23.modCount = (byte) 10;
        hashMap23.clear();
        java.lang.Object obj27 = hashMap0.put(obj21, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(101, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap8);
        hashMap8.modCount = ' ';
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap0.table;
        java.lang.Object obj15 = null;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        int int23 = hashMap21.modCount;
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) int23);
        int int25 = hashMap20.modCount;
        java.lang.Object obj26 = hashMap16.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap27.remove(obj29);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.clear();
        java.lang.Object obj36 = hashMap32.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.clear();
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = hashMap37.remove(obj39);
        int int41 = hashMap37.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        hashMap42.clear();
        boolean boolean46 = hashMap42.isEmpty();
        java.lang.Object obj47 = hashMap37.remove((java.lang.Object) hashMap42);
        int int48 = hashMap37.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        java.lang.Object obj52 = hashMap37.get((java.lang.Object) entryArray51);
        hashMap32.table = entryArray51;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap32.table;
        java.lang.Object obj56 = hashMap27.put((java.lang.Object) entryArray54, (java.lang.Object) '#');
        hashMap16.table = entryArray54;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap16.table;
        java.lang.Object obj59 = hashMap0.put(obj15, (java.lang.Object) entryArray58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) true, obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap3.table = entryArray14;
        hashMap0.table = entryArray14;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap17.remove(obj19);
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        boolean boolean26 = hashMap22.isEmpty();
        java.lang.Object obj27 = hashMap17.remove((java.lang.Object) hashMap22);
        int int28 = hashMap17.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj32 = hashMap17.get((java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        int int36 = hashMap33.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = hashMap38.remove((java.lang.Object) hashMap39);
        hashMap38.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        hashMap44.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap38.get((java.lang.Object) entryArray46);
        hashMap33.table = entryArray46;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.modCount = 0;
        java.lang.Object obj54 = hashMap50.remove((java.lang.Object) hashMap51);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        hashMap55.clear();
        java.lang.Object obj57 = hashMap50.remove((java.lang.Object) hashMap55);
        java.lang.Object obj58 = hashMap17.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap55);
        java.lang.Object obj59 = hashMap0.get((java.lang.Object) hashMap33);
        int int60 = hashMap33.size();
        int int61 = hashMap33.size();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap33.table;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj66 = hashMap64.remove((java.lang.Object) '#');
        hashMap64.modCount = 2;
        int int69 = hashMap64.modCount;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap64.table;
        hashMap33.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap33", hashMap33.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        java.lang.Object obj9 = hashMap5.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap10.remove(obj12);
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        boolean boolean19 = hashMap15.isEmpty();
        java.lang.Object obj20 = hashMap10.remove((java.lang.Object) hashMap15);
        int int21 = hashMap10.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) entryArray24);
        hashMap5.table = entryArray24;
        boolean boolean27 = hashMap5.isEmpty();
        hashMap5.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap5.remove(obj29);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.clear();
        int int33 = hashMap31.modCount;
        int int34 = hashMap31.size();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        int int39 = hashMap35.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        java.lang.Object obj44 = hashMap35.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj50 = hashMap40.get((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap51.table;
        hashMap45.table = entryArray53;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        hashMap58.modCount = 0;
        java.lang.Object obj61 = hashMap57.remove((java.lang.Object) hashMap58);
        hashMap57.clear();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.modCount = 0;
        java.lang.Object obj68 = hashMap64.remove((java.lang.Object) hashMap65);
        hashMap64.clear();
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.clear();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap70.table;
        java.lang.Object obj73 = hashMap64.get((java.lang.Object) entryArray72);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        hashMap76.modCount = 0;
        java.lang.Object obj79 = hashMap75.remove((java.lang.Object) hashMap76);
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj82 = hashMap76.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        hashMap85.modCount = 0;
        java.lang.Object obj88 = hashMap84.remove((java.lang.Object) hashMap85);
        system.testclass.HashMap hashMap89 = new system.testclass.HashMap();
        hashMap89.clear();
        java.lang.Object obj91 = hashMap84.remove((java.lang.Object) hashMap89);
        hashMap89.clear();
        java.lang.Object obj93 = hashMap76.get((java.lang.Object) hashMap89);
        java.lang.Object obj94 = hashMap57.put((java.lang.Object) entryArray72, (java.lang.Object) hashMap89);
        java.lang.Object obj95 = hashMap45.put((java.lang.Object) false, (java.lang.Object) entryArray72);
        java.lang.Object obj96 = hashMap31.get((java.lang.Object) entryArray72);
        java.lang.Object obj97 = hashMap0.put(obj30, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(3, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap5.remove(obj7);
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap5.remove((java.lang.Object) hashMap10);
        int int16 = hashMap5.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap5.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        int int22 = hashMap0.size();
        int int23 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) 1L);
        hashMap0.modCount = (short) -1;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap31.table;
        hashMap31.modCount = 32;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        hashMap46.modCount = 0;
        java.lang.Object obj49 = hashMap45.remove((java.lang.Object) hashMap46);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.clear();
        java.lang.Object obj52 = hashMap45.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        hashMap45.table = entryArray56;
        hashMap42.table = entryArray56;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap42.table;
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap31, (java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        int int64 = hashMap61.size();
        java.lang.Class<?> wildcardClass65 = hashMap61.getClass();
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = hashMap42.put((java.lang.Object) wildcardClass65, obj66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap42", hashMap42.repOK_1());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        hashMap1.modCount = (short) 1;
        java.lang.Object obj4 = null;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        boolean boolean15 = hashMap11.isEmpty();
        java.lang.Object obj16 = hashMap1.put(obj4, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }
}

