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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap4.clear();
        boolean boolean12 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        hashMap13.clear();
        boolean boolean16 = hashMap13.isEmpty();
        hashMap13.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap13.table = entryArray20;
        hashMap4.table = entryArray20;
        hashMap0.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.clear();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        boolean boolean16 = hashMap13.isEmpty();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap13);
        hashMap8.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap0.clear();
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        hashMap9.clear();
        boolean boolean12 = hashMap9.isEmpty();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap9);
        int int14 = hashMap9.size();
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) 1.0d);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        int int20 = hashMap17.size();
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap17.clear();
        boolean boolean25 = hashMap17.isEmpty();
        hashMap17.modCount = (byte) 1;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap17.table;
        java.lang.Object obj30 = hashMap9.put((java.lang.Object) hashMap17, (java.lang.Object) 1.0d);
        hashMap9.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(2);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        hashMap2.modCount = 0;
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap9.remove(obj11);
        java.lang.Object obj13 = hashMap4.remove(obj11);
        hashMap4.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.clear();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        hashMap4.clear();
        boolean boolean7 = hashMap4.isEmpty();
        hashMap4.clear();
        int int9 = hashMap4.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) hashMap13);
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        boolean boolean20 = hashMap17.isEmpty();
        java.lang.Object obj21 = hashMap4.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        java.lang.Object obj22 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap23.clear();
        boolean boolean31 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        hashMap32.clear();
        boolean boolean35 = hashMap32.isEmpty();
        hashMap32.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        hashMap32.table = entryArray39;
        hashMap23.table = entryArray39;
        java.lang.Class<?> wildcardClass42 = hashMap23.getClass();
        java.lang.Object obj43 = hashMap4.remove((java.lang.Object) hashMap23);
        int int44 = hashMap4.size();
        int int45 = hashMap4.modCount;
        hashMap4.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) hashMap2);
        hashMap2.modCount = 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        int int13 = hashMap10.size();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap10.clear();
        boolean boolean18 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        hashMap19.clear();
        boolean boolean22 = hashMap19.isEmpty();
        java.lang.Object obj23 = hashMap10.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap19.table = entryArray26;
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        int int32 = hashMap29.size();
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) 0.0f);
        system.testclass.HashMap.Entry entry35 = null;
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] { entry35 };
        hashMap29.table = entryArray36;
        hashMap2.table = entryArray36;
        int int39 = hashMap2.modCount;
        int int40 = hashMap2.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        int int44 = hashMap41.size();
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap41.clear();
        boolean boolean49 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        hashMap50.clear();
        boolean boolean53 = hashMap50.isEmpty();
        java.lang.Object obj54 = hashMap41.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        hashMap56.clear();
        java.lang.Object obj58 = hashMap55.remove((java.lang.Object) hashMap56);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        int int62 = hashMap59.size();
        java.lang.Object obj65 = hashMap59.put((java.lang.Object) 10L, (java.lang.Object) true);
        hashMap59.clear();
        boolean boolean67 = hashMap59.isEmpty();
        hashMap59.modCount = (byte) 1;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap59.table;
        hashMap56.table = entryArray70;
        hashMap41.table = entryArray70;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap41.table;
        boolean boolean74 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        hashMap75.clear();
        hashMap75.clear();
        int int80 = hashMap75.size();
        int int81 = hashMap75.modCount;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        int int83 = hashMap82.modCount;
        int int84 = hashMap82.modCount;
        java.lang.Object obj85 = hashMap75.remove((java.lang.Object) hashMap82);
        boolean boolean86 = hashMap82.isEmpty();
        java.lang.Object obj87 = hashMap2.put((java.lang.Object) boolean74, (java.lang.Object) hashMap82);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 1);
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

