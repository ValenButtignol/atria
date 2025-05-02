import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.remove(obj16);
        hashMap12.clear();
        int int19 = hashMap12.size();
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) int19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap9.table = entryArray29;
        hashMap2.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        int int10 = hashMap3.size();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap3.put(obj11, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap11.remove(obj15);
        hashMap11.clear();
        hashMap11.modCount = 0;
        int int20 = hashMap11.modCount;
        int int21 = hashMap11.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int25 = hashMap24.size();
        java.lang.Object obj26 = hashMap3.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap10.remove(obj14);
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj22 = hashMap17.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap17.table;
        hashMap10.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap25.remove(obj29);
        hashMap25.clear();
        hashMap25.modCount = 0;
        int int34 = hashMap25.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        hashMap35.clear();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj46 = hashMap39.remove((java.lang.Object) ' ');
        java.lang.Object obj47 = hashMap35.remove(obj46);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap48.table;
        hashMap35.table = entryArray51;
        hashMap25.table = entryArray51;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        hashMap25.table = entryArray57;
        boolean boolean59 = hashMap25.isEmpty();
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) boolean59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        hashMap9.modCount = 0;
        int int18 = hashMap9.modCount;
        java.lang.Object obj19 = hashMap6.remove((java.lang.Object) int18);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        hashMap20.clear();
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) hashMap20);
        java.lang.Object obj25 = hashMap2.put(obj23, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        int int10 = hashMap3.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap14.remove(obj18);
        java.lang.Object obj20 = hashMap13.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap21.table;
        hashMap14.table = entryArray27;
        java.lang.Class<?> wildcardClass29 = hashMap14.getClass();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap30.table;
        java.lang.Object obj35 = hashMap3.put((java.lang.Object) wildcardClass29, (java.lang.Object) entryArray34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap7.remove(obj11);
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap7);
        boolean boolean14 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '#');
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap7.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        boolean boolean15 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) entryArray18);
        hashMap7.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj32 = hashMap25.remove((java.lang.Object) ' ');
        java.lang.Object obj33 = hashMap21.remove(obj32);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap21.table = entryArray37;
        boolean boolean39 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        hashMap40.clear();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray48 = hashMap47.table;
        java.lang.Object obj49 = hashMap40.remove((java.lang.Object) entryArray48);
        hashMap21.table = entryArray48;
        java.lang.Object obj51 = hashMap0.put((java.lang.Object) entryArray18, (java.lang.Object) entryArray48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.clear();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap7.remove(obj11);
        hashMap7.clear();
        hashMap7.modCount = 0;
        int int16 = hashMap7.modCount;
        java.lang.Object obj17 = hashMap4.remove((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap4.get((java.lang.Object) hashMap18);
        hashMap18.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) entryArray26);
        hashMap6.table = entryArray26;
        int int29 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = (short) 1;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.modCount = '#';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap8.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap8.remove((java.lang.Object) entryArray13);
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) (byte) 10, obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) ' ');
        java.lang.Object obj12 = hashMap0.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap0.table = entryArray16;
        boolean boolean18 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        java.lang.Object obj28 = hashMap19.remove((java.lang.Object) entryArray27);
        hashMap0.table = entryArray27;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.clear();
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap36);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        hashMap39.clear();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = hashMap39.remove(obj43);
        hashMap39.clear();
        int int46 = hashMap39.size();
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) int46);
        int int48 = hashMap36.size();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj53 = hashMap51.remove((java.lang.Object) 2);
        hashMap51.modCount = 10;
        java.lang.Object obj56 = hashMap36.get((java.lang.Object) hashMap51);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        hashMap57.clear();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj68 = hashMap61.remove((java.lang.Object) ' ');
        java.lang.Object obj69 = hashMap57.remove(obj68);
        int int70 = hashMap57.size();
        boolean boolean71 = hashMap57.isEmpty();
        java.lang.Object obj72 = hashMap0.put((java.lang.Object) hashMap36, (java.lang.Object) boolean71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, 100.0f);
        hashMap13.modCount = '4';
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.remove(obj23);
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap19);
        boolean boolean26 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '#');
        int int29 = hashMap28.modCount;
        java.lang.Object obj30 = hashMap19.remove((java.lang.Object) hashMap28);
        boolean boolean31 = hashMap28.isEmpty();
        java.lang.Object obj32 = hashMap6.put((java.lang.Object) '4', (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap8.table = entryArray12;
        hashMap2.table = entryArray12;
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) (short) -1);
        boolean boolean8 = hashMap3.isEmpty();
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) boolean8, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) ' ');
        java.lang.Object obj12 = hashMap0.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap0.table = entryArray16;
        boolean boolean18 = hashMap0.isEmpty();
        java.lang.Object obj19 = new java.lang.Object();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(2, 10.0f);
        java.lang.Object obj23 = hashMap0.put(obj19, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        hashMap2.clear();
        int int6 = hashMap2.size();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10L);
        hashMap2.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap10.remove(obj14);
        hashMap10.clear();
        int int17 = hashMap10.size();
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '#');
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap12);
        boolean boolean15 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) 0.0f);
        hashMap12.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        int int9 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) entryArray18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        hashMap6.table = entryArray20;
        hashMap6.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        int int10 = hashMap3.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) ' ');
        java.lang.Object obj23 = hashMap11.remove(obj22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        hashMap11.table = entryArray27;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap3.put((java.lang.Object) entryArray27, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int11 = hashMap10.size();
        hashMap10.modCount = (short) 1;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap10);
        int int15 = hashMap10.size();
        hashMap10.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        int int18 = hashMap6.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap22.remove(obj26);
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        boolean boolean33 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        java.lang.Object obj38 = hashMap29.get((java.lang.Object) entryArray37);
        hashMap29.clear();
        java.lang.Object obj40 = hashMap6.put(obj28, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.modCount = '#';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) '#', (java.lang.Object) entryArray14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) ' ');
        java.lang.Object obj16 = hashMap4.remove(obj15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap4.table = entryArray20;
        hashMap2.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        boolean boolean10 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap11.table;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) boolean10, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = (short) 1;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) (short) -1);
        int int11 = hashMap5.modCount;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        hashMap0.modCount = (byte) 100;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        hashMap15.clear();
        int int19 = hashMap15.size();
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) 10L);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) entryArray22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        boolean boolean12 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        hashMap13.modCount = 0;
        hashMap13.modCount = 2;
        int int24 = hashMap13.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap13.table = entryArray30;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) boolean12, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        int int10 = hashMap2.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.modCount = '#';
        int int16 = hashMap11.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap17.remove(obj21);
        int int23 = hashMap17.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = hashMap27.remove(obj31);
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap26.table;
        hashMap17.table = entryArray34;
        hashMap11.table = entryArray34;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.clear();
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        java.lang.Object obj45 = hashMap37.remove((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap46.remove(obj50);
        hashMap46.clear();
        int int53 = hashMap46.size();
        java.lang.Object obj54 = hashMap43.get((java.lang.Object) int53);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        boolean boolean59 = hashMap55.isEmpty();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap60.table;
        java.lang.Object obj64 = hashMap55.get((java.lang.Object) entryArray63);
        hashMap43.table = entryArray63;
        int int66 = hashMap43.size();
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        hashMap67.modCount = 0;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        hashMap70.clear();
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = hashMap70.remove(obj74);
        hashMap70.clear();
        hashMap70.modCount = 0;
        int int79 = hashMap70.modCount;
        java.lang.Object obj80 = hashMap67.remove((java.lang.Object) int79);
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        boolean boolean82 = hashMap81.isEmpty();
        hashMap81.clear();
        java.lang.Object obj84 = hashMap67.get((java.lang.Object) hashMap81);
        java.lang.Object obj85 = hashMap43.remove((java.lang.Object) hashMap67);
        hashMap43.clear();
        java.lang.Object obj87 = hashMap2.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        int int10 = hashMap2.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int14 = hashMap13.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = hashMap13.remove(obj20);
        hashMap13.modCount = 0;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) (byte) 0);
        hashMap24.modCount = 'a';
        hashMap24.clear();
        hashMap24.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        hashMap34.clear();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap24.table = entryArray39;
        java.lang.Object obj41 = hashMap13.remove((java.lang.Object) entryArray39);
        hashMap2.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        hashMap2.clear();
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        hashMap0.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap13);
        int int15 = hashMap0.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 10);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int22 = hashMap21.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.clear();
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = hashMap21.remove(obj28);
        hashMap21.modCount = 0;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap32.table;
        hashMap21.table = entryArray36;
        hashMap18.table = entryArray36;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap18, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        boolean boolean15 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        int int22 = hashMap0.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        hashMap23.clear();
        int int30 = hashMap23.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        hashMap31.clear();
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) (short) -1);
        java.lang.Object obj38 = hashMap31.get((java.lang.Object) ' ');
        java.lang.Object obj40 = hashMap31.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int44 = hashMap43.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) (byte) 0);
        java.lang.Object obj51 = hashMap43.remove(obj50);
        hashMap43.modCount = 0;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap54.table;
        hashMap43.table = entryArray58;
        boolean boolean60 = hashMap43.isEmpty();
        java.lang.Object obj61 = hashMap31.get((java.lang.Object) boolean60);
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) hashMap23, obj61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) entryArray26);
        hashMap6.table = entryArray26;
        int int29 = hashMap6.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap33.remove(obj37);
        hashMap33.clear();
        hashMap33.modCount = 0;
        int int42 = hashMap33.modCount;
        java.lang.Object obj43 = hashMap30.remove((java.lang.Object) int42);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        hashMap44.clear();
        java.lang.Object obj47 = hashMap30.get((java.lang.Object) hashMap44);
        java.lang.Object obj48 = hashMap6.remove((java.lang.Object) hashMap30);
        hashMap6.clear();
        int int50 = hashMap6.size();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        hashMap54.clear();
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = hashMap54.remove(obj58);
        java.lang.Object obj60 = hashMap53.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap53.table;
        hashMap53.clear();
        java.lang.Object obj64 = hashMap6.put((java.lang.Object) hashMap53, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap6.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) entryArray11);
        hashMap2.modCount = ' ';
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap25.remove(obj29);
        hashMap25.clear();
        int int32 = hashMap25.size();
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) int32);
        int int34 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap22.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj47 = hashMap40.remove((java.lang.Object) ' ');
        java.lang.Object obj48 = hashMap36.remove(obj47);
        int int49 = hashMap36.size();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int53 = hashMap52.size();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.clear();
        java.lang.Object obj59 = hashMap54.get((java.lang.Object) (byte) 0);
        java.lang.Object obj60 = hashMap52.remove(obj59);
        hashMap52.modCount = 0;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap63.table;
        hashMap52.table = entryArray67;
        hashMap36.table = entryArray67;
        java.lang.Object obj70 = hashMap22.get((java.lang.Object) entryArray67);
        hashMap2.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        hashMap13.modCount = 0;
        int int22 = hashMap13.modCount;
        java.lang.Object obj23 = hashMap10.remove((java.lang.Object) int22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        hashMap24.clear();
        java.lang.Object obj27 = hashMap10.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(10, (float) ' ');
        java.lang.Object obj31 = hashMap0.put(obj27, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        hashMap8.clear();
        int int15 = hashMap8.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) hashMap22);
        int int25 = hashMap22.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        boolean boolean30 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap26.get((java.lang.Object) entryArray34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap26.table;
        hashMap22.table = entryArray36;
        hashMap8.table = entryArray36;
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) entryArray36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        hashMap0.clear();
        java.lang.Object obj11 = null;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(2, 10.0f);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap14.table = entryArray18;
        java.lang.Object obj20 = hashMap0.put(obj11, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap17.remove(obj21);
        hashMap17.clear();
        int int24 = hashMap17.size();
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) int24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        boolean boolean30 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap26.get((java.lang.Object) entryArray34);
        hashMap14.table = entryArray34;
        hashMap14.clear();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap14, obj38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        hashMap8.clear();
        int int12 = hashMap8.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap22.remove(obj26);
        hashMap22.clear();
        int int29 = hashMap22.size();
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) int29);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        boolean boolean35 = hashMap31.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        java.lang.Object obj40 = hashMap31.get((java.lang.Object) entryArray39);
        hashMap19.table = entryArray39;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = hashMap45.remove(obj49);
        java.lang.Object obj51 = hashMap44.remove((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        hashMap52.clear();
        java.lang.Object obj57 = hashMap52.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap52.table;
        hashMap45.table = entryArray58;
        hashMap19.table = entryArray58;
        java.lang.Object obj61 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap5.remove(obj9);
        hashMap5.clear();
        hashMap5.modCount = 0;
        int int14 = hashMap5.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj26 = hashMap19.remove((java.lang.Object) ' ');
        java.lang.Object obj27 = hashMap15.remove(obj26);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        hashMap15.table = entryArray31;
        hashMap5.table = entryArray31;
        java.lang.Class<?> wildcardClass34 = entryArray31.getClass();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        java.lang.Object obj43 = hashMap35.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        hashMap44.clear();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap44.remove(obj48);
        hashMap44.clear();
        int int51 = hashMap44.size();
        java.lang.Object obj52 = hashMap41.get((java.lang.Object) int51);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        boolean boolean57 = hashMap53.isEmpty();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap58.table;
        java.lang.Object obj62 = hashMap53.get((java.lang.Object) entryArray61);
        hashMap41.table = entryArray61;
        java.lang.Object obj64 = hashMap0.put((java.lang.Object) entryArray31, (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) entryArray26);
        hashMap6.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap32.remove(obj36);
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        hashMap39.clear();
        java.lang.Object obj44 = hashMap39.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap39.table;
        hashMap32.table = entryArray45;
        hashMap6.table = entryArray45;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap48.table;
        boolean boolean52 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        java.lang.Object obj57 = hashMap48.get((java.lang.Object) entryArray56);
        hashMap48.clear();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj62 = hashMap48.remove((java.lang.Object) hashMap61);
        java.lang.Object obj64 = hashMap6.put((java.lang.Object) hashMap48, (java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (short) -1);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        hashMap23.clear();
        int int30 = hashMap23.size();
        java.lang.Object obj31 = hashMap20.get((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        boolean boolean36 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap32.get((java.lang.Object) entryArray40);
        hashMap20.table = entryArray40;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        java.lang.Object obj47 = hashMap20.get((java.lang.Object) int46);
        int int48 = hashMap20.modCount;
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) int48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) (byte) 0);
        hashMap3.modCount = 'a';
        hashMap3.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int15 = hashMap14.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = hashMap14.remove(obj21);
        hashMap14.modCount = 2;
        java.lang.Object obj25 = hashMap3.remove((java.lang.Object) 2);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.remove(obj33);
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap29);
        boolean boolean36 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '#');
        int int39 = hashMap38.modCount;
        java.lang.Object obj40 = hashMap29.remove((java.lang.Object) hashMap38);
        boolean boolean41 = hashMap38.isEmpty();
        hashMap38.clear();
        java.lang.Object obj43 = hashMap1.put((java.lang.Object) 2, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        hashMap3.clear();
        hashMap3.modCount = 0;
        int int12 = hashMap3.modCount;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) int12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        hashMap14.clear();
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap14);
        int int18 = hashMap0.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) 'a');
        hashMap20.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) ' ');
        java.lang.Object obj34 = hashMap22.remove(obj33);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap22.table = entryArray38;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap40.remove(obj44);
        hashMap40.clear();
        hashMap40.modCount = 0;
        int int49 = hashMap40.modCount;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        hashMap50.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj61 = hashMap54.remove((java.lang.Object) ' ');
        java.lang.Object obj62 = hashMap50.remove(obj61);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        hashMap50.table = entryArray66;
        hashMap40.table = entryArray66;
        hashMap22.table = entryArray66;
        java.lang.Object obj70 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) hashMap8);
        boolean boolean15 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap7.table;
        boolean boolean17 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap21.remove(obj25);
        java.lang.Object obj27 = hashMap20.remove((java.lang.Object) hashMap21);
        int int28 = hashMap21.size();
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        hashMap0.clear();
        hashMap0.clear();
        int int10 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) ' ');
        java.lang.Object obj12 = hashMap0.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap18.table = entryArray29;
        hashMap0.table = entryArray29;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap35.table = entryArray39;
        java.lang.Object obj41 = hashMap0.get((java.lang.Object) hashMap35);
        int int42 = hashMap35.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int46 = hashMap45.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        hashMap47.clear();
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = hashMap45.remove(obj52);
        hashMap45.modCount = 2;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        hashMap56.clear();
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = hashMap56.remove(obj60);
        int int62 = hashMap56.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        hashMap66.clear();
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = hashMap66.remove(obj70);
        java.lang.Object obj72 = hashMap65.remove((java.lang.Object) hashMap66);
        system.testclass.HashMap.Entry[] entryArray73 = hashMap65.table;
        hashMap56.table = entryArray73;
        int int75 = hashMap56.size();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        boolean boolean77 = hashMap76.isEmpty();
        int int78 = hashMap76.size();
        hashMap76.clear();
        java.lang.Object obj81 = hashMap76.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        boolean boolean83 = hashMap82.isEmpty();
        java.lang.Object obj84 = hashMap76.remove((java.lang.Object) hashMap82);
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        int int86 = hashMap85.modCount;
        int int87 = hashMap85.modCount;
        hashMap85.clear();
        java.lang.Object obj89 = null;
        java.lang.Object obj90 = hashMap85.remove(obj89);
        hashMap85.clear();
        int int92 = hashMap85.size();
        java.lang.Object obj93 = hashMap82.get((java.lang.Object) int92);
        int int94 = hashMap82.size();
        system.testclass.HashMap.Entry[] entryArray95 = hashMap82.table;
        java.lang.Object obj96 = hashMap56.remove((java.lang.Object) entryArray95);
        java.lang.Object obj97 = hashMap35.put((java.lang.Object) hashMap45, (java.lang.Object) hashMap56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap35", hashMap35.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        boolean boolean15 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int25 = hashMap24.size();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.clear();
        java.lang.Object obj31 = hashMap26.get((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = hashMap24.remove(obj31);
        hashMap24.modCount = 0;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) (byte) 0);
        hashMap35.modCount = 'a';
        hashMap35.clear();
        hashMap35.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        hashMap45.modCount = 0;
        hashMap45.clear();
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        hashMap35.table = entryArray50;
        java.lang.Object obj52 = hashMap24.remove((java.lang.Object) entryArray50);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        hashMap53.clear();
        java.lang.Object obj58 = hashMap53.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        java.lang.Object obj61 = hashMap53.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        hashMap62.clear();
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = hashMap62.remove(obj66);
        hashMap62.clear();
        int int69 = hashMap62.size();
        java.lang.Object obj70 = hashMap59.get((java.lang.Object) int69);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        int int72 = hashMap71.modCount;
        int int73 = hashMap71.modCount;
        system.testclass.HashMap.Entry[] entryArray74 = hashMap71.table;
        boolean boolean75 = hashMap71.isEmpty();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        int int77 = hashMap76.modCount;
        int int78 = hashMap76.modCount;
        system.testclass.HashMap.Entry[] entryArray79 = hashMap76.table;
        java.lang.Object obj80 = hashMap71.get((java.lang.Object) entryArray79);
        hashMap59.table = entryArray79;
        java.lang.Object obj82 = hashMap0.put(obj52, (java.lang.Object) hashMap59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap18.remove(obj22);
        hashMap18.clear();
        int int25 = hashMap18.size();
        java.lang.Object obj26 = hashMap15.get((java.lang.Object) int25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        boolean boolean31 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap27.get((java.lang.Object) entryArray35);
        hashMap15.table = entryArray35;
        int int38 = hashMap15.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        hashMap15.table = entryArray42;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        hashMap44.clear();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap44.remove(obj48);
        hashMap44.clear();
        hashMap44.modCount = 0;
        int int53 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap44.table;
        hashMap15.table = entryArray54;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap(0, 100.0f);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        boolean boolean63 = hashMap59.isEmpty();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap64.table;
        java.lang.Object obj68 = hashMap59.get((java.lang.Object) entryArray67);
        hashMap59.clear();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj73 = hashMap59.remove((java.lang.Object) hashMap72);
        java.lang.Object obj74 = hashMap58.remove(obj73);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap77.clear();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        int int81 = hashMap79.modCount;
        system.testclass.HashMap.Entry[] entryArray82 = hashMap79.table;
        java.lang.Object obj83 = hashMap77.remove((java.lang.Object) entryArray82);
        hashMap58.table = entryArray82;
        hashMap15.table = entryArray82;
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        hashMap86.modCount = 0;
        hashMap86.clear();
        system.testclass.HashMap hashMap92 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean93 = hashMap92.isEmpty();
        java.lang.Object obj94 = hashMap86.get((java.lang.Object) boolean93);
        int int95 = hashMap86.modCount;
        java.lang.Object obj96 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) int95);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        hashMap0.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        hashMap15.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap15.get((java.lang.Object) boolean22);
        int int24 = hashMap15.modCount;
        int int25 = hashMap15.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.remove(obj33);
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap29);
        boolean boolean36 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '#');
        int int39 = hashMap38.modCount;
        java.lang.Object obj40 = hashMap29.remove((java.lang.Object) hashMap38);
        boolean boolean41 = hashMap38.isEmpty();
        java.lang.Object obj42 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        hashMap0.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap13);
        int int15 = hashMap0.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '#', (float) 10L);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '#');
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap12);
        boolean boolean15 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) 0.0f);
        hashMap12.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj30 = hashMap23.remove((java.lang.Object) ' ');
        java.lang.Object obj31 = hashMap19.remove(obj30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap19.table = entryArray35;
        hashMap12.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap4.remove(obj8);
        hashMap4.clear();
        hashMap4.modCount = 0;
        int int13 = hashMap4.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) ' ');
        java.lang.Object obj26 = hashMap14.remove(obj25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        hashMap14.table = entryArray30;
        hashMap4.table = entryArray30;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap36.remove(obj40);
        java.lang.Object obj42 = hashMap35.remove((java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap36.table;
        java.lang.Object obj44 = hashMap2.put((java.lang.Object) entryArray30, (java.lang.Object) entryArray43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap3.table = entryArray14;
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) (-1));
        hashMap3.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) (byte) 0);
        hashMap19.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 10);
        int int29 = hashMap28.modCount;
        java.lang.Object obj30 = hashMap3.put((java.lang.Object) hashMap19, (java.lang.Object) int29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) hashMap20);
        int int23 = hashMap20.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        boolean boolean28 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap24.get((java.lang.Object) entryArray32);
        java.lang.Object obj34 = hashMap20.get(obj33);
        java.lang.Object obj35 = hashMap13.remove(obj34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        hashMap36.clear();
        boolean boolean41 = hashMap36.isEmpty();
        java.lang.Object obj42 = hashMap3.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '#');
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap12);
        boolean boolean15 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) 0.0f);
        hashMap12.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj24 = hashMap19.remove((java.lang.Object) (short) -1);
        java.lang.Object obj26 = hashMap19.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) ' ');
        java.lang.Object obj39 = hashMap27.remove(obj38);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        hashMap27.table = entryArray43;
        boolean boolean45 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        hashMap46.clear();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray54 = hashMap53.table;
        java.lang.Object obj55 = hashMap46.remove((java.lang.Object) entryArray54);
        hashMap27.table = entryArray54;
        hashMap27.modCount = 2;
        java.lang.Object obj59 = hashMap19.get((java.lang.Object) 2);
        system.testclass.HashMap.Entry[] entryArray60 = hashMap19.table;
        hashMap12.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = hashMap2.remove(obj9);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap2.table = entryArray17;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap21.remove(obj25);
        hashMap21.clear();
        hashMap21.modCount = 0;
        int int30 = hashMap21.modCount;
        int int31 = hashMap21.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        boolean boolean36 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap32.get((java.lang.Object) entryArray40);
        hashMap21.table = entryArray40;
        hashMap19.table = entryArray40;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        java.lang.Object obj52 = hashMap44.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        hashMap53.clear();
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = hashMap53.remove(obj57);
        hashMap53.clear();
        int int60 = hashMap53.size();
        java.lang.Object obj61 = hashMap50.get((java.lang.Object) int60);
        int int62 = hashMap50.size();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj67 = hashMap65.remove((java.lang.Object) 2);
        hashMap65.modCount = 10;
        java.lang.Object obj70 = hashMap50.get((java.lang.Object) hashMap65);
        java.lang.Object obj71 = hashMap2.put((java.lang.Object) entryArray40, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap7.remove(obj11);
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap7);
        boolean boolean14 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        java.lang.Object obj16 = hashMap7.get((java.lang.Object) entryArray15);
        hashMap4.table = entryArray15;
        hashMap4.modCount = 2;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap22.table = entryArray26;
        boolean boolean28 = hashMap22.isEmpty();
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) 2, (java.lang.Object) boolean28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) ' ');
        java.lang.Object obj12 = hashMap0.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap0.table = entryArray16;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap0.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 2);
        hashMap22.modCount = 10;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) ' ');
        java.lang.Object obj39 = hashMap27.remove(obj38);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = hashMap43.remove(obj47);
        java.lang.Object obj49 = hashMap42.remove((java.lang.Object) hashMap43);
        int int50 = hashMap43.size();
        java.lang.Object obj51 = hashMap27.get((java.lang.Object) hashMap43);
        java.lang.Object obj52 = hashMap22.remove(obj51);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap53.table;
        java.lang.Object obj58 = hashMap0.put(obj52, (java.lang.Object) entryArray57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(99, 10.0f);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = hashMap5.remove(obj12);
        hashMap5.modCount = 0;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        hashMap16.modCount = 'a';
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        hashMap26.clear();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        hashMap16.table = entryArray31;
        java.lang.Object obj33 = hashMap5.remove((java.lang.Object) entryArray31);
        hashMap2.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap13.get((java.lang.Object) entryArray21);
        hashMap10.table = entryArray21;
        hashMap10.modCount = 2;
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) entryArray9, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap2.remove(obj6);
        hashMap2.clear();
        hashMap2.modCount = 0;
        int int11 = hashMap2.modCount;
        int int12 = hashMap2.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap13.get((java.lang.Object) entryArray21);
        hashMap2.table = entryArray21;
        hashMap0.table = entryArray21;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray13 = hashMap12.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean17 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap20.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap20.remove((java.lang.Object) entryArray25);
        java.lang.Object obj27 = hashMap16.get((java.lang.Object) entryArray25);
        hashMap16.modCount = ' ';
        int int30 = hashMap16.size();
        int int31 = hashMap16.modCount;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) entryArray13, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap3.table = entryArray14;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap25.remove(obj29);
        hashMap25.clear();
        int int32 = hashMap25.size();
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) int32);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        boolean boolean38 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        java.lang.Object obj43 = hashMap34.get((java.lang.Object) entryArray42);
        hashMap22.table = entryArray42;
        int int45 = hashMap22.size();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj57 = hashMap50.remove((java.lang.Object) ' ');
        java.lang.Object obj58 = hashMap46.remove(obj57);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        hashMap46.table = entryArray62;
        java.lang.Object obj64 = hashMap22.remove((java.lang.Object) entryArray62);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        system.testclass.HashMap.Entry[] entryArray71 = hashMap68.table;
        hashMap67.table = entryArray71;
        boolean boolean73 = hashMap67.isEmpty();
        java.lang.Object obj75 = hashMap67.get((java.lang.Object) 10.0f);
        boolean boolean76 = hashMap67.isEmpty();
        java.lang.Object obj77 = hashMap3.put(obj64, (java.lang.Object) boolean76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        hashMap6.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = hashMap2.remove(obj9);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap2.table = entryArray17;
        hashMap2.modCount = (byte) 10;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        java.lang.Object obj25 = hashMap21.get((java.lang.Object) (short) -1);
        boolean boolean26 = hashMap21.isEmpty();
        hashMap21.clear();
        int int28 = hashMap21.modCount;
        hashMap21.modCount = (byte) 10;
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = hashMap2.put((java.lang.Object) (byte) 10, obj31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.modCount = '#';
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap0.table = entryArray10;
        hashMap0.clear();
        hashMap0.modCount = 2;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        boolean boolean19 = hashMap16.isEmpty();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) ' ');
        java.lang.Object obj34 = hashMap22.remove(obj33);
        int int35 = hashMap22.size();
        boolean boolean36 = hashMap22.isEmpty();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap22.table;
        int int38 = hashMap22.modCount;
        boolean boolean39 = hashMap22.isEmpty();
        boolean boolean40 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        boolean boolean45 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap41.get((java.lang.Object) entryArray49);
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap41.table;
        java.lang.Object obj53 = hashMap22.get((java.lang.Object) entryArray52);
        java.lang.Object obj54 = hashMap0.put((java.lang.Object) hashMap16, obj53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) '#');
        java.lang.Object obj3 = null;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(100);
        java.lang.Object obj6 = hashMap2.put(obj3, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 10.0f);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, 100.0f);
        hashMap5.modCount = '4';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        hashMap8.clear();
        int int15 = hashMap8.size();
        boolean boolean16 = hashMap8.isEmpty();
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) '4', (java.lang.Object) boolean16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) ' ');
        java.lang.Object obj16 = hashMap4.remove(obj15);
        int int17 = hashMap4.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int21 = hashMap20.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = hashMap20.remove(obj27);
        hashMap20.modCount = 0;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap31.table;
        hashMap20.table = entryArray35;
        hashMap4.table = entryArray35;
        hashMap0.table = entryArray35;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        hashMap39.clear();
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) (byte) 0);
        hashMap39.modCount = 'a';
        int int47 = hashMap39.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj51 = hashMap0.put((java.lang.Object) hashMap39, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.modCount = '#';
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, 100.0f);
        hashMap8.modCount = '4';
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) (byte) 0);
        hashMap14.modCount = 'a';
        hashMap14.clear();
        hashMap14.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        hashMap30.clear();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap30.remove(obj34);
        hashMap30.clear();
        hashMap30.modCount = 0;
        int int39 = hashMap30.modCount;
        java.lang.Object obj40 = hashMap27.remove((java.lang.Object) int39);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        hashMap41.clear();
        java.lang.Object obj44 = hashMap27.get((java.lang.Object) hashMap41);
        java.lang.Object obj45 = hashMap26.remove((java.lang.Object) hashMap27);
        int int46 = hashMap27.size();
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) int46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = (short) 1;
        java.lang.Object obj3 = null;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap4.table;
        hashMap4.clear();
        int int12 = hashMap4.size();
        java.lang.Object obj13 = hashMap0.put(obj3, (java.lang.Object) int12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) entryArray11);
        hashMap0.table = entryArray11;
        hashMap0.modCount = 2;
        int int16 = hashMap0.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap17.remove(obj21);
        hashMap17.clear();
        hashMap17.modCount = 0;
        hashMap17.modCount = 2;
        int int28 = hashMap17.modCount;
        java.lang.Object obj29 = hashMap0.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap33.remove(obj37);
        hashMap33.clear();
        hashMap33.modCount = 0;
        int int42 = hashMap33.modCount;
        java.lang.Object obj43 = hashMap30.remove((java.lang.Object) int42);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) (byte) 0);
        hashMap44.modCount = 'a';
        hashMap44.clear();
        hashMap44.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.modCount = 0;
        hashMap54.clear();
        hashMap54.clear();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap54.table;
        hashMap44.table = entryArray59;
        java.lang.Object obj61 = hashMap30.remove((java.lang.Object) entryArray59);
        java.lang.Object obj62 = hashMap0.get((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean66 = hashMap65.isEmpty();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap69.clear();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        int int72 = hashMap71.modCount;
        int int73 = hashMap71.modCount;
        system.testclass.HashMap.Entry[] entryArray74 = hashMap71.table;
        java.lang.Object obj75 = hashMap69.remove((java.lang.Object) entryArray74);
        java.lang.Object obj76 = hashMap65.get((java.lang.Object) entryArray74);
        system.testclass.HashMap.Entry[] entryArray77 = hashMap65.table;
        java.lang.Object obj78 = hashMap30.get((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int82 = hashMap81.size();
        hashMap81.modCount = (short) 1;
        hashMap81.clear();
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int89 = hashMap88.size();
        hashMap88.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray92 = hashMap88.table;
        java.lang.Object obj93 = hashMap30.put((java.lang.Object) hashMap81, (java.lang.Object) hashMap88);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap30", hashMap30.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap6.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) entryArray11);
        int int14 = hashMap2.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) (byte) 0);
        hashMap15.modCount = 'a';
        hashMap15.clear();
        hashMap15.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap15.table = entryArray30;
        hashMap2.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        hashMap0.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int12 = hashMap11.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = hashMap11.remove(obj18);
        hashMap11.modCount = 2;
        java.lang.Object obj22 = hashMap0.remove((java.lang.Object) 2);
        int int23 = hashMap0.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) ' ');
        java.lang.Object obj36 = hashMap24.remove(obj35);
        int int37 = hashMap24.size();
        boolean boolean38 = hashMap24.isEmpty();
        boolean boolean39 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(99, (float) (short) 100);
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap6);
        java.lang.Object obj13 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap2.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap15.modCount = 2;
        int int31 = hashMap15.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap32.remove(obj36);
        hashMap32.clear();
        hashMap32.modCount = 0;
        hashMap32.modCount = 2;
        int int43 = hashMap32.modCount;
        java.lang.Object obj44 = hashMap15.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int48 = hashMap47.size();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap47.table;
        java.lang.Object obj50 = hashMap32.get((java.lang.Object) entryArray49);
        hashMap2.table = entryArray49;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        boolean boolean56 = hashMap52.isEmpty();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        java.lang.Object obj61 = hashMap52.get((java.lang.Object) entryArray60);
        hashMap52.clear();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj66 = hashMap52.remove((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap70.table;
        boolean boolean74 = hashMap70.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        java.lang.Object obj79 = hashMap70.get((java.lang.Object) entryArray78);
        hashMap67.table = entryArray78;
        hashMap67.modCount = 2;
        int int83 = hashMap67.modCount;
        boolean boolean84 = hashMap67.isEmpty();
        java.lang.Object obj85 = hashMap2.put((java.lang.Object) hashMap52, (java.lang.Object) boolean84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) (short) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        hashMap3.clear();
        hashMap3.modCount = 0;
        int int12 = hashMap3.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) ' ');
        java.lang.Object obj25 = hashMap13.remove(obj24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap13.table = entryArray29;
        hashMap3.table = entryArray29;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap3.table = entryArray35;
        hashMap2.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) ' ');
        java.lang.Object obj12 = hashMap0.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap18.table = entryArray29;
        hashMap0.table = entryArray29;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap35.table = entryArray39;
        java.lang.Object obj41 = hashMap0.get((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, 100.0f);
        hashMap44.modCount = '4';
        java.lang.Object obj48 = hashMap44.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap.Entry[] entryArray49 = hashMap44.table;
        java.lang.Object obj50 = hashMap35.get((java.lang.Object) hashMap44);
        hashMap44.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap44", hashMap44.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(98);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) entryArray10);
        hashMap2.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj16 = hashMap2.remove((java.lang.Object) hashMap15);
        hashMap2.modCount = 'a';
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.remove(obj23);
        hashMap19.clear();
        int int26 = hashMap19.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.clear();
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap33);
        int int36 = hashMap33.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        boolean boolean41 = hashMap37.isEmpty();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap37.get((java.lang.Object) entryArray45);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap37.table;
        hashMap33.table = entryArray47;
        hashMap19.table = entryArray47;
        java.lang.Object obj50 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap11.remove(obj15);
        hashMap11.clear();
        hashMap11.modCount = 0;
        hashMap11.modCount = 2;
        int int22 = hashMap11.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        hashMap23.clear();
        hashMap23.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap23.table;
        hashMap11.table = entryArray28;
        hashMap0.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        boolean boolean35 = hashMap31.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        java.lang.Object obj40 = hashMap31.get((java.lang.Object) entryArray39);
        hashMap31.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 100L);
        java.lang.Object obj45 = hashMap31.remove((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(2, 10.0f);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        hashMap48.table = entryArray52;
        int int54 = hashMap48.size();
        java.lang.Object obj55 = hashMap0.put(obj45, (java.lang.Object) int54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        int int6 = hashMap2.size();
        hashMap2.modCount = (byte) 100;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, 100.0f);
        hashMap11.modCount = '4';
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) (short) -1);
        boolean boolean22 = hashMap17.isEmpty();
        hashMap17.clear();
        int int24 = hashMap17.modCount;
        hashMap17.modCount = (byte) 10;
        java.lang.Class<?> wildcardClass27 = hashMap17.getClass();
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) wildcardClass27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap3.table = entryArray14;
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) (-1));
        int int18 = hashMap3.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(2, (float) ' ');
        int int22 = hashMap21.size();
        hashMap21.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (short) 10, (float) '#');
        boolean boolean27 = hashMap26.isEmpty();
        boolean boolean28 = hashMap26.isEmpty();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap21.table = entryArray29;
        int int31 = hashMap21.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        boolean boolean39 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        java.lang.Object obj44 = hashMap35.get((java.lang.Object) entryArray43);
        hashMap32.table = entryArray43;
        hashMap32.modCount = 2;
        int int48 = hashMap32.modCount;
        java.lang.Object obj49 = hashMap3.put((java.lang.Object) int31, (java.lang.Object) int48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        hashMap9.modCount = 0;
        int int18 = hashMap9.modCount;
        int int19 = hashMap9.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) entryArray28);
        hashMap9.table = entryArray28;
        int int31 = hashMap9.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        hashMap32.clear();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap9.get((java.lang.Object) int36);
        java.lang.Object obj38 = hashMap0.get((java.lang.Object) int36);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = hashMap43.remove(obj47);
        hashMap43.clear();
        hashMap43.modCount = 0;
        int int52 = hashMap43.modCount;
        java.lang.Object obj53 = hashMap40.remove((java.lang.Object) int52);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        hashMap54.clear();
        java.lang.Object obj57 = hashMap40.get((java.lang.Object) hashMap54);
        hashMap40.clear();
        boolean boolean59 = hashMap40.isEmpty();
        boolean boolean60 = hashMap40.isEmpty();
        java.lang.Object obj61 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        int int18 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap6.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap22.table = entryArray26;
        boolean boolean28 = hashMap22.isEmpty();
        java.lang.Object obj30 = hashMap22.get((java.lang.Object) 10.0f);
        boolean boolean31 = hashMap22.isEmpty();
        int int32 = hashMap22.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap36.remove(obj40);
        hashMap36.clear();
        hashMap36.modCount = 0;
        int int45 = hashMap36.modCount;
        java.lang.Object obj46 = hashMap33.remove((java.lang.Object) int45);
        hashMap33.modCount = (byte) 0;
        int int49 = hashMap33.size();
        java.lang.Object obj50 = hashMap6.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) entryArray11);
        hashMap0.table = entryArray11;
        hashMap0.modCount = 2;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = hashMap24.remove(obj28);
        hashMap24.clear();
        hashMap24.modCount = 0;
        int int33 = hashMap24.modCount;
        java.lang.Object obj34 = hashMap21.remove((java.lang.Object) int33);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        hashMap35.clear();
        java.lang.Object obj38 = hashMap21.get((java.lang.Object) hashMap35);
        hashMap21.clear();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        hashMap40.clear();
        java.lang.Object obj45 = hashMap40.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        java.lang.Object obj48 = hashMap40.remove((java.lang.Object) hashMap46);
        java.lang.Object obj50 = hashMap46.get((java.lang.Object) (byte) -1);
        int int51 = hashMap46.size();
        java.lang.Object obj52 = hashMap21.get((java.lang.Object) hashMap46);
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.modCount = '#';
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.size();
        int int7 = hashMap0.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj20 = hashMap13.remove((java.lang.Object) ' ');
        java.lang.Object obj21 = hashMap9.remove(obj20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap9.table = entryArray25;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        boolean boolean34 = hashMap30.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap30.get((java.lang.Object) entryArray38);
        hashMap27.table = entryArray38;
        hashMap9.table = entryArray38;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap44.table = entryArray48;
        java.lang.Object obj50 = hashMap9.get((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0, 100.0f);
        hashMap53.modCount = '4';
        java.lang.Object obj57 = hashMap53.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap.Entry[] entryArray58 = hashMap53.table;
        java.lang.Object obj59 = hashMap44.get((java.lang.Object) hashMap53);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        hashMap63.modCount = 0;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        hashMap66.clear();
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = hashMap66.remove(obj70);
        hashMap66.clear();
        hashMap66.modCount = 0;
        int int75 = hashMap66.modCount;
        java.lang.Object obj76 = hashMap63.remove((java.lang.Object) int75);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        hashMap77.clear();
        java.lang.Object obj80 = hashMap63.get((java.lang.Object) hashMap77);
        java.lang.Object obj81 = hashMap62.remove((java.lang.Object) hashMap63);
        system.testclass.HashMap.Entry[] entryArray82 = hashMap63.table;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap63.table;
        java.lang.Object obj84 = hashMap53.get((java.lang.Object) entryArray83);
        java.lang.Object obj85 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) hashMap53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap15.remove(obj19);
        hashMap15.clear();
        int int22 = hashMap15.size();
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) int22);
        int int24 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap12.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        hashMap26.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj37 = hashMap30.remove((java.lang.Object) ' ');
        java.lang.Object obj38 = hashMap26.remove(obj37);
        int int39 = hashMap26.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int43 = hashMap42.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) (byte) 0);
        java.lang.Object obj50 = hashMap42.remove(obj49);
        hashMap42.modCount = 0;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap53.table;
        hashMap42.table = entryArray57;
        hashMap26.table = entryArray57;
        java.lang.Object obj60 = hashMap12.get((java.lang.Object) entryArray57);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        boolean boolean65 = hashMap61.isEmpty();
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap66.table;
        java.lang.Object obj70 = hashMap61.get((java.lang.Object) entryArray69);
        hashMap61.clear();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap61.table;
        java.lang.Object obj73 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) entryArray72);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.remove(obj16);
        hashMap12.clear();
        int int19 = hashMap12.size();
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) int19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) entryArray29);
        hashMap9.table = entryArray29;
        int int32 = hashMap9.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap36.remove(obj40);
        hashMap36.clear();
        hashMap36.modCount = 0;
        int int45 = hashMap36.modCount;
        java.lang.Object obj46 = hashMap33.remove((java.lang.Object) int45);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        hashMap47.clear();
        java.lang.Object obj50 = hashMap33.get((java.lang.Object) hashMap47);
        java.lang.Object obj51 = hashMap9.remove((java.lang.Object) hashMap33);
        hashMap9.clear();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        hashMap56.clear();
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = hashMap56.remove(obj60);
        java.lang.Object obj62 = hashMap55.remove((java.lang.Object) hashMap56);
        boolean boolean63 = hashMap55.isEmpty();
        system.testclass.HashMap.Entry[] entryArray64 = hashMap55.table;
        java.lang.Object obj65 = hashMap9.remove((java.lang.Object) entryArray64);
        hashMap2.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

