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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0f));
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) '4');
        hashMap6.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap0.table = entryArray6;
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
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap15);
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap.Entry[] entryArray21 = null;
        hashMap15.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap15", hashMap15.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (short) 10);
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) entryArray12);
        hashMap3.table = entryArray12;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) 10.0d);
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) (-1.0f));
        hashMap9.modCount = (byte) 1;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap2.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        int int5 = hashMap0.modCount;
        hashMap0.modCount = 10;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) 10.0d);
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) (-1.0f));
        hashMap8.modCount = (byte) 1;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj19 = hashMap8.get((java.lang.Object) hashMap18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap0.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) (-1.0f));
        hashMap12.modCount = (byte) 1;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0f));
        boolean boolean23 = hashMap12.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) '4');
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        boolean boolean10 = hashMap5.isEmpty();
        hashMap5.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) int9);
        int int11 = hashMap5.modCount;
        java.lang.Object obj13 = hashMap3.put((java.lang.Object) int11, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap3.table = entryArray16;
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) (-1.0f));
        hashMap12.modCount = (byte) 1;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0f));
        boolean boolean23 = hashMap12.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) (short) 0);
        int int30 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap0.remove((java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        java.lang.Object obj38 = hashMap33.remove((java.lang.Object) int37);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap33.table;
        hashMap0.table = entryArray39;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap4.remove(obj8);
        java.lang.Object obj12 = hashMap4.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int13 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap4.table;
        hashMap2.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.size();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) int9);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.size();
        boolean boolean4 = hashMap2.isEmpty();
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) 10.0d);
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) (-1.0f));
        hashMap9.modCount = (byte) 1;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj25 = hashMap21.get((java.lang.Object) 10.0d);
        java.lang.Object obj27 = hashMap21.get((java.lang.Object) (-1.0f));
        hashMap21.modCount = (byte) 1;
        java.lang.Object obj31 = hashMap21.get((java.lang.Object) (-1.0f));
        boolean boolean32 = hashMap21.isEmpty();
        java.lang.Object obj33 = hashMap9.get((java.lang.Object) boolean32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) (short) 0);
        int int39 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap36.table;
        java.lang.Object obj41 = hashMap9.remove((java.lang.Object) entryArray40);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        java.lang.Object obj47 = hashMap42.remove((java.lang.Object) int46);
        system.testclass.HashMap.Entry[] entryArray48 = hashMap42.table;
        hashMap9.table = entryArray48;
        hashMap8.table = entryArray48;
        hashMap2.table = entryArray48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = null;
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        int int3 = hashMap2.modCount;
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        hashMap2.clear();
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 10.0d);
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) (-1.0f));
        hashMap6.modCount = (byte) 1;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) (-1.0f));
        boolean boolean17 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap6.table;
        hashMap2.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) int6);
        int int8 = hashMap2.modCount;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) int8, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) 10.0d);
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) (-1.0f));
        hashMap15.modCount = (byte) 1;
        java.lang.Object obj25 = hashMap15.get((java.lang.Object) (-1.0f));
        boolean boolean26 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap15.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        int int32 = hashMap28.modCount;
        hashMap28.modCount = 10;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        int int39 = hashMap35.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        hashMap40.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        hashMap44.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        hashMap40.table = entryArray46;
        hashMap35.table = entryArray46;
        hashMap28.table = entryArray46;
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) entryArray27, (java.lang.Object) hashMap28);
        hashMap28.clear();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        java.lang.Object obj56 = hashMap52.get((java.lang.Object) 10.0d);
        java.lang.Object obj58 = hashMap52.get((java.lang.Object) (-1.0f));
        hashMap52.modCount = (byte) 1;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj63 = hashMap52.get((java.lang.Object) hashMap62);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        hashMap64.modCount = 0;
        java.lang.Object obj68 = hashMap64.get((java.lang.Object) 10.0d);
        java.lang.Object obj70 = hashMap64.get((java.lang.Object) (-1.0f));
        hashMap64.modCount = (byte) 1;
        java.lang.Object obj74 = hashMap64.get((java.lang.Object) (-1.0f));
        boolean boolean75 = hashMap64.isEmpty();
        java.lang.Object obj76 = hashMap52.get((java.lang.Object) boolean75);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj81 = hashMap79.remove((java.lang.Object) (short) 0);
        int int82 = hashMap79.modCount;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap79.table;
        java.lang.Object obj84 = hashMap52.remove((java.lang.Object) entryArray83);
        hashMap28.table = entryArray83;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap28", hashMap28.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) int6);
        int int8 = hashMap2.modCount;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) int8, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) 10.0d);
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) int26);
        int int28 = hashMap22.modCount;
        java.lang.Object obj29 = hashMap15.remove((java.lang.Object) int28);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap30.remove((java.lang.Object) int34);
        int int36 = hashMap30.modCount;
        int int37 = hashMap30.modCount;
        int int38 = hashMap30.size();
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) int38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap0.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) (short) 0);
        int int46 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10.0d);
        int int8 = hashMap3.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) int13);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap9.table;
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) entryArray15);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) '4');
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj27 = hashMap19.remove(obj26);
        int int28 = hashMap19.modCount;
        java.lang.Object obj29 = hashMap2.put(obj16, (java.lang.Object) hashMap19);
        hashMap19.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap19", hashMap19.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        int int7 = hashMap3.modCount;
        hashMap3.modCount = 10;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        hashMap10.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap17.remove((java.lang.Object) entryArray24);
        hashMap15.table = entryArray24;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap15.table;
        java.lang.Object obj28 = hashMap10.get((java.lang.Object) hashMap15);
        java.lang.Object obj29 = hashMap3.remove((java.lang.Object) hashMap10);
        boolean boolean30 = hashMap10.isEmpty();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap10.table;
        hashMap2.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        int int8 = hashMap4.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap9.table = entryArray15;
        hashMap4.table = entryArray15;
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10.0d);
        int int8 = hashMap3.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) int13);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap9.table;
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) entryArray15);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) '4');
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj27 = hashMap19.remove(obj26);
        int int28 = hashMap19.modCount;
        java.lang.Object obj29 = hashMap2.put(obj16, (java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap30.remove((java.lang.Object) int34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap30.table;
        hashMap2.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(2, 10.0f);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.modCount;
        hashMap0.modCount = '#';
        int int12 = hashMap0.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) int19);
        int int21 = hashMap15.modCount;
        java.lang.Object obj23 = hashMap13.put((java.lang.Object) int21, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap13.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap24.table = entryArray30;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        java.lang.Object obj39 = hashMap34.remove((java.lang.Object) int38);
        int int40 = hashMap34.modCount;
        java.lang.Object obj42 = hashMap32.put((java.lang.Object) int40, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        java.lang.Object obj46 = hashMap32.get((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        hashMap47.modCount = 0;
        java.lang.Object obj51 = hashMap47.get((java.lang.Object) 10.0d);
        java.lang.Object obj53 = hashMap47.get((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.clear();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        java.lang.Object obj59 = hashMap54.remove((java.lang.Object) int58);
        int int60 = hashMap54.modCount;
        java.lang.Object obj61 = hashMap47.remove((java.lang.Object) int60);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        hashMap62.clear();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        java.lang.Object obj67 = hashMap62.remove((java.lang.Object) int66);
        int int68 = hashMap62.modCount;
        int int69 = hashMap62.modCount;
        int int70 = hashMap62.size();
        java.lang.Object obj71 = hashMap32.put((java.lang.Object) hashMap47, (java.lang.Object) int70);
        system.testclass.HashMap.Entry[] entryArray72 = hashMap47.table;
        java.lang.Object obj73 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) entryArray72);
        system.testclass.HashMap.Entry[] entryArray74 = null;
        hashMap0.table = entryArray74;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) (-1.0f));
        hashMap12.modCount = (byte) 1;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0f));
        boolean boolean23 = hashMap12.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        java.lang.Object obj27 = hashMap0.get((java.lang.Object) boolean26);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (short) 10);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.clear();
        int int33 = hashMap31.modCount;
        hashMap31.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap31.remove((java.lang.Object) entryArray38);
        hashMap29.table = entryArray38;
        hashMap0.table = entryArray38;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 10);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) entryArray13);
        hashMap4.table = entryArray13;
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0f));
        boolean boolean11 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(2);
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) 2);
        hashMap0.modCount = 100;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.remove(obj23);
        java.lang.Object obj27 = hashMap19.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap19.table;
        hashMap0.table = entryArray29;
        system.testclass.HashMap.Entry[] entryArray31 = null;
        hashMap0.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.modCount;
        hashMap0.modCount = 10;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        hashMap12.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap12.table = entryArray18;
        hashMap7.table = entryArray18;
        hashMap0.table = entryArray18;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        hashMap22.clear();
        java.lang.Object obj27 = hashMap0.get((java.lang.Object) hashMap22);
        hashMap0.clear();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(35, (float) 2);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap9.get(obj10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) 10.0d);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) (-1.0f));
        hashMap17.modCount = (byte) 1;
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) (-1.0f));
        boolean boolean28 = hashMap17.isEmpty();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap17.table;
        hashMap12.table = entryArray29;
        java.lang.Object obj31 = hashMap9.remove((java.lang.Object) entryArray29);
        hashMap2.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(4, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10.0d);
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) (-1.0f));
        hashMap4.modCount = (byte) 1;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) hashMap14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) '4');
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap14.get((java.lang.Object) entryArray21);
        hashMap14.modCount = 'a';
        system.testclass.HashMap.Entry[] entryArray25 = hashMap14.table;
        hashMap2.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        int int13 = hashMap10.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap10.table = entryArray17;
        int int19 = hashMap10.modCount;
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) hashMap10);
        boolean boolean21 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = hashMap22.get((java.lang.Object) (-1.0f));
        hashMap22.modCount = (byte) 1;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) hashMap32);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap32.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(0, (float) '4');
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        java.lang.Object obj40 = hashMap32.get((java.lang.Object) entryArray39);
        hashMap10.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) '4');
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap10.get((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) '4');
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap21.remove((java.lang.Object) int26);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap21.table;
        hashMap10.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) (-1.0f));
        hashMap12.modCount = (byte) 1;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0f));
        boolean boolean23 = hashMap12.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) (short) 0);
        int int30 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap0.remove((java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        java.lang.Object obj38 = hashMap33.remove((java.lang.Object) int37);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap33.table;
        hashMap0.table = entryArray39;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap0.table;
        int int42 = hashMap0.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = hashMap43.remove(obj47);
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int52 = hashMap43.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.modCount = 0;
        java.lang.Object obj57 = hashMap53.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        int int61 = hashMap58.size();
        java.lang.Object obj62 = hashMap53.remove((java.lang.Object) hashMap58);
        java.lang.Object obj63 = hashMap43.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap.Entry[] entryArray64 = hashMap58.table;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0, 100.0f);
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) hashMap58, (java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap(0, (float) '4');
        hashMap71.clear();
        system.testclass.HashMap.Entry[] entryArray73 = hashMap71.table;
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        int int75 = hashMap74.modCount;
        int int76 = hashMap74.modCount;
        java.lang.Object obj77 = hashMap71.remove((java.lang.Object) int76);
        system.testclass.HashMap.Entry[] entryArray78 = hashMap71.table;
        hashMap58.table = entryArray78;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap58", hashMap58.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) (-1.0f));
        hashMap12.modCount = (byte) 1;
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0f));
        boolean boolean23 = hashMap12.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) (short) 0);
        int int30 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap0.remove((java.lang.Object) entryArray31);
        hashMap0.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        hashMap0.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        hashMap13.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap13.table = entryArray19;
        hashMap10.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) int6);
        int int8 = hashMap2.modCount;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) int8, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) 10.0d);
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) int26);
        int int28 = hashMap22.modCount;
        java.lang.Object obj29 = hashMap15.remove((java.lang.Object) int28);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap30.remove((java.lang.Object) int34);
        int int36 = hashMap30.modCount;
        int int37 = hashMap30.modCount;
        int int38 = hashMap30.size();
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) int38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap0.table;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        int int45 = hashMap41.modCount;
        hashMap41.modCount = 10;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.modCount = 0;
        hashMap48.clear();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) (short) 10);
        int int54 = hashMap53.modCount;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        hashMap55.clear();
        int int57 = hashMap55.modCount;
        hashMap55.clear();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        java.lang.Object obj63 = hashMap55.remove((java.lang.Object) entryArray62);
        hashMap53.table = entryArray62;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap53.table;
        java.lang.Object obj66 = hashMap48.get((java.lang.Object) hashMap53);
        java.lang.Object obj67 = hashMap41.remove((java.lang.Object) hashMap48);
        boolean boolean68 = hashMap48.isEmpty();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap48.table;
        hashMap0.table = entryArray69;
        int int71 = hashMap0.modCount;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.clear();
        int int12 = hashMap10.modCount;
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap18.remove(obj22);
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        java.lang.Object obj27 = hashMap5.put((java.lang.Object) hashMap14, (java.lang.Object) "");
        hashMap14.modCount = '#';
        hashMap14.modCount = (short) 100;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        int int36 = hashMap32.modCount;
        hashMap32.modCount = 10;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        int int43 = hashMap39.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        hashMap44.modCount = 0;
        hashMap44.clear();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap48.table;
        hashMap44.table = entryArray50;
        hashMap39.table = entryArray50;
        hashMap32.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        hashMap54.clear();
        java.lang.Object obj59 = hashMap32.get((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap(1, (float) (byte) 100);
        java.lang.Object obj64 = hashMap54.put((java.lang.Object) '4', (java.lang.Object) hashMap63);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0, (float) '4');
        hashMap67.clear();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap67.table;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        java.lang.Object obj73 = hashMap67.remove((java.lang.Object) int72);
        hashMap67.clear();
        system.testclass.HashMap.Entry[] entryArray75 = hashMap67.table;
        hashMap63.table = entryArray75;
        hashMap14.table = entryArray75;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

