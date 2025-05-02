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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        hashMap3.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) (short) 100);
        int int10 = hashMap9.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap9.table = entryArray14;
        hashMap3.table = entryArray14;
        hashMap2.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) (short) 100);
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (-1.0f));
        hashMap0.modCount = (byte) 1;
        hashMap0.modCount = 2;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) 0L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        java.lang.Object obj12 = hashMap3.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj20 = hashMap2.put(obj16, (java.lang.Object) '4');
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj33 = hashMap29.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        int int37 = hashMap34.size();
        java.lang.Object obj38 = hashMap29.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.clear();
        int int41 = hashMap39.modCount;
        java.lang.Object obj42 = hashMap29.get((java.lang.Object) hashMap39);
        int int43 = hashMap29.modCount;
        java.lang.Object obj44 = hashMap26.remove((java.lang.Object) hashMap29);
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) hashMap21, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 10);
        hashMap4.clear();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) (-1));
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        java.lang.Object obj13 = hashMap4.put((java.lang.Object) 0, (java.lang.Object) hashMap11);
        int int14 = hashMap4.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap15.table = entryArray21;
        hashMap4.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        int int11 = hashMap5.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 10);
        hashMap23.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        java.lang.Object obj27 = hashMap23.put((java.lang.Object) 'a', (java.lang.Object) hashMap26);
        java.lang.Object obj28 = hashMap5.put(obj21, (java.lang.Object) hashMap23);
        boolean boolean29 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj34 = hashMap30.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(0, (float) (short) 100);
        int int38 = hashMap37.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        hashMap37.table = entryArray42;
        hashMap30.table = entryArray42;
        hashMap23.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        int int7 = hashMap6.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap6.table = entryArray11;
        hashMap0.table = entryArray11;
        system.testclass.HashMap.Entry[] entryArray14 = null;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) (-1.0f));
        hashMap2.modCount = (byte) 1;
        hashMap2.modCount = 2;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        hashMap13.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        int int20 = hashMap19.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap19.table = entryArray24;
        hashMap13.table = entryArray24;
        hashMap2.table = entryArray24;
        hashMap1.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 0);
        int int16 = hashMap13.modCount;
        int int17 = hashMap13.size();
        hashMap13.modCount = '#';
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        boolean boolean23 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        hashMap24.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) (short) 100);
        int int31 = hashMap30.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap30.table = entryArray35;
        hashMap24.table = entryArray35;
        hashMap20.table = entryArray35;
        java.lang.Object obj39 = hashMap13.get((java.lang.Object) entryArray35);
        hashMap0.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) (short) 0);
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) 10.0d);
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) (-1.0f));
        hashMap7.modCount = (byte) 1;
        hashMap7.modCount = 2;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj22 = hashMap7.put((java.lang.Object) hashMap20, (java.lang.Object) 0L);
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) 0.0d, (java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(1, (float) (byte) 100);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10);
        hashMap28.clear();
        java.lang.Object obj31 = hashMap26.put((java.lang.Object) hashMap28, (java.lang.Object) (-1));
        java.lang.Object obj32 = hashMap2.get(obj31);
        java.lang.Object obj33 = null;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj38 = hashMap34.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        int int42 = hashMap39.size();
        java.lang.Object obj43 = hashMap34.remove((java.lang.Object) hashMap39);
        hashMap39.clear();
        int int45 = hashMap39.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj50 = hashMap48.remove((java.lang.Object) (short) 0);
        int int51 = hashMap48.modCount;
        int int52 = hashMap48.size();
        hashMap48.modCount = 10;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) (short) 10);
        hashMap56.clear();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        java.lang.Object obj60 = hashMap56.put((java.lang.Object) 'a', (java.lang.Object) hashMap59);
        java.lang.Object obj61 = hashMap39.put((java.lang.Object) 10, (java.lang.Object) hashMap56);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        hashMap62.modCount = 0;
        java.lang.Object obj66 = hashMap62.get((java.lang.Object) 10.0d);
        java.lang.Object obj68 = hashMap62.get((java.lang.Object) (-1.0f));
        hashMap62.modCount = (byte) 1;
        hashMap62.modCount = 2;
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj77 = hashMap62.put((java.lang.Object) hashMap75, (java.lang.Object) 0L);
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj82 = hashMap80.remove((java.lang.Object) (short) 0);
        boolean boolean83 = hashMap80.isEmpty();
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap();
        hashMap84.modCount = 0;
        java.lang.Object obj88 = hashMap84.get((java.lang.Object) 10.0d);
        java.lang.Object obj90 = hashMap84.get((java.lang.Object) (-1.0f));
        hashMap84.modCount = (byte) 1;
        hashMap84.modCount = 2;
        java.lang.Object obj95 = hashMap80.get((java.lang.Object) hashMap84);
        java.lang.Object obj96 = hashMap56.put(obj77, obj95);
        java.lang.Object obj97 = hashMap2.put(obj33, (java.lang.Object) hashMap56);
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
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        boolean boolean10 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap5.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        int int11 = hashMap5.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 10);
        hashMap23.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        java.lang.Object obj27 = hashMap23.put((java.lang.Object) 'a', (java.lang.Object) hashMap26);
        java.lang.Object obj28 = hashMap5.put(obj21, (java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj33 = hashMap31.remove((java.lang.Object) (short) 0);
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        hashMap39.table = entryArray45;
        hashMap38.table = entryArray45;
        hashMap31.table = entryArray45;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        hashMap31.table = entryArray52;
        hashMap23.table = entryArray52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 100);
        int int17 = hashMap16.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap16.table = entryArray21;
        java.lang.Object obj23 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap0.remove(obj23);
        hashMap0.modCount = (byte) -1;
        boolean boolean27 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) (short) 0);
        boolean boolean33 = hashMap30.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = (short) -1;
        hashMap34.modCount = (byte) -1;
        java.lang.Object obj39 = hashMap30.get((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0, (float) (short) 100);
        int int43 = hashMap42.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        hashMap42.table = entryArray47;
        hashMap30.table = entryArray47;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        hashMap1.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) (short) 100);
        int int12 = hashMap11.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap11.table = entryArray16;
        java.lang.Object obj18 = hashMap5.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap11.table;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) '4');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap8.table = entryArray14;
        hashMap7.table = entryArray14;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap17.remove(obj21);
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int26 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj28 = hashMap7.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        hashMap29.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) (short) 100);
        int int36 = hashMap35.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        hashMap35.table = entryArray40;
        hashMap29.table = entryArray40;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj47 = hashMap45.remove((java.lang.Object) (short) 0);
        int int48 = hashMap45.modCount;
        int int49 = hashMap45.size();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap56.table;
        hashMap53.table = entryArray59;
        hashMap52.table = entryArray59;
        hashMap45.table = entryArray59;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        hashMap45.table = entryArray66;
        hashMap29.table = entryArray66;
        java.lang.Object obj69 = hashMap7.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj75 = hashMap73.remove((java.lang.Object) (short) 0);
        boolean boolean76 = hashMap73.isEmpty();
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        hashMap77.modCount = (short) -1;
        hashMap77.modCount = (byte) -1;
        java.lang.Object obj82 = hashMap73.get((java.lang.Object) hashMap77);
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap(0, (float) (short) 100);
        int int86 = hashMap85.size();
        system.testclass.HashMap hashMap87 = new system.testclass.HashMap();
        int int88 = hashMap87.modCount;
        int int89 = hashMap87.modCount;
        system.testclass.HashMap.Entry[] entryArray90 = hashMap87.table;
        hashMap85.table = entryArray90;
        hashMap73.table = entryArray90;
        java.lang.Object obj93 = hashMap7.put((java.lang.Object) (short) 100, (java.lang.Object) entryArray90);
        hashMap1.table = entryArray90;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        boolean boolean11 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = (short) -1;
        hashMap12.modCount = (byte) -1;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap0.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        int int5 = hashMap2.modCount;
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap12);
        boolean boolean17 = hashMap12.isEmpty();
        hashMap12.modCount = (byte) 100;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        java.lang.Object obj24 = hashMap2.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        java.lang.Object obj30 = hashMap25.remove((java.lang.Object) int29);
        int int31 = hashMap25.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        hashMap25.table = entryArray34;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        java.lang.Object obj44 = hashMap40.get((java.lang.Object) 10.0d);
        java.lang.Object obj46 = hashMap40.get((java.lang.Object) (-1.0f));
        hashMap40.modCount = (byte) 1;
        hashMap40.modCount = 2;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.modCount = 0;
        hashMap51.clear();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0, (float) (short) 100);
        int int58 = hashMap57.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        hashMap57.table = entryArray62;
        hashMap51.table = entryArray62;
        hashMap40.table = entryArray62;
        java.lang.Object obj66 = hashMap25.put((java.lang.Object) hashMap36, (java.lang.Object) entryArray62);
        hashMap21.table = entryArray62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap21", hashMap21.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 3);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap3.table = entryArray9;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap14.table = entryArray20;
        hashMap13.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        java.lang.Object obj31 = hashMap23.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int32 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj34 = hashMap13.remove((java.lang.Object) hashMap23);
        java.lang.Object obj35 = hashMap3.get(obj34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        hashMap39.table = entryArray45;
        hashMap38.table = entryArray45;
        hashMap3.table = entryArray45;
        hashMap2.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        int int7 = hashMap6.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap6.table = entryArray11;
        hashMap0.table = entryArray11;
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap0.table = entryArray18;
        int int20 = hashMap0.modCount;
        int int21 = hashMap0.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) (short) 0);
        boolean boolean31 = hashMap28.isEmpty();
        int int32 = hashMap28.size();
        java.lang.Object obj33 = hashMap24.remove((java.lang.Object) int32);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap24.table;
        hashMap0.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) ' ');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (short) 100, (float) (short) 1);
        hashMap17.modCount = 10;
        java.lang.Object obj20 = hashMap3.get((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj25 = hashMap21.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        int int29 = hashMap26.size();
        java.lang.Object obj30 = hashMap21.remove((java.lang.Object) hashMap26);
        boolean boolean31 = hashMap26.isEmpty();
        hashMap26.modCount = (byte) 100;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) (short) 0);
        boolean boolean39 = hashMap36.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        java.lang.Object obj44 = hashMap40.get((java.lang.Object) 10.0d);
        java.lang.Object obj46 = hashMap40.get((java.lang.Object) (-1.0f));
        hashMap40.modCount = (byte) 1;
        hashMap40.modCount = 2;
        java.lang.Object obj51 = hashMap36.get((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        java.lang.Object obj56 = hashMap52.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        int int60 = hashMap57.size();
        java.lang.Object obj61 = hashMap52.remove((java.lang.Object) hashMap57);
        java.lang.Object obj62 = hashMap26.put((java.lang.Object) hashMap40, (java.lang.Object) hashMap52);
        java.lang.Object obj63 = hashMap2.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        hashMap64.clear();
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        hashMap66.clear();
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        hashMap70.clear();
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = hashMap70.remove(obj74);
        java.lang.Object obj78 = hashMap70.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int79 = hashMap70.modCount;
        hashMap70.clear();
        system.testclass.HashMap.Entry[] entryArray81 = hashMap70.table;
        hashMap66.table = entryArray81;
        hashMap64.table = entryArray81;
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap();
        hashMap84.clear();
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        int int87 = hashMap86.modCount;
        int int88 = hashMap86.modCount;
        java.lang.Object obj89 = hashMap84.remove((java.lang.Object) int88);
        int int90 = hashMap84.size();
        system.testclass.HashMap hashMap92 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray93 = hashMap92.table;
        hashMap84.table = entryArray93;
        hashMap64.table = entryArray93;
        hashMap2.table = entryArray93;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int9 = hashMap0.size();
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        int int26 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap14.get((java.lang.Object) hashMap24);
        int int28 = hashMap14.modCount;
        java.lang.Object obj29 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        hashMap14.table = entryArray33;
        hashMap0.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        int int13 = hashMap12.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap12.table = entryArray17;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) (short) 0);
        int int24 = hashMap21.modCount;
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) (-1));
        java.lang.Object obj27 = hashMap12.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        hashMap12.table = entryArray31;
        hashMap5.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap.Entry[] entryArray5 = null;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) int7);
        int int9 = hashMap3.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap3.table = entryArray12;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        int int11 = hashMap5.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) (short) 0);
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.size();
        hashMap14.modCount = 10;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (short) 10);
        hashMap22.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        java.lang.Object obj26 = hashMap22.put((java.lang.Object) 'a', (java.lang.Object) hashMap25);
        java.lang.Object obj27 = hashMap5.put((java.lang.Object) 10, (java.lang.Object) hashMap22);
        boolean boolean28 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap29.table = entryArray35;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        hashMap40.table = entryArray46;
        hashMap39.table = entryArray46;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        hashMap49.clear();
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = hashMap49.remove(obj53);
        java.lang.Object obj57 = hashMap49.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int58 = hashMap49.modCount;
        hashMap49.clear();
        java.lang.Object obj60 = hashMap39.remove((java.lang.Object) hashMap49);
        java.lang.Object obj61 = hashMap29.get(obj60);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj66 = hashMap64.remove((java.lang.Object) (short) 0);
        int int67 = hashMap64.modCount;
        int int68 = hashMap64.size();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        int int73 = hashMap72.modCount;
        int int74 = hashMap72.modCount;
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        hashMap72.table = entryArray78;
        hashMap71.table = entryArray78;
        hashMap64.table = entryArray78;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        int int83 = hashMap82.modCount;
        int int84 = hashMap82.modCount;
        system.testclass.HashMap.Entry[] entryArray85 = hashMap82.table;
        hashMap64.table = entryArray85;
        java.lang.Object obj87 = hashMap29.remove((java.lang.Object) hashMap64);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        int int89 = hashMap88.modCount;
        int int90 = hashMap88.modCount;
        hashMap88.clear();
        int int92 = hashMap88.modCount;
        system.testclass.HashMap.Entry[] entryArray93 = hashMap88.table;
        hashMap29.table = entryArray93;
        hashMap5.table = entryArray93;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10.0d);
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) (-1.0f));
        hashMap4.modCount = (byte) 1;
        hashMap4.modCount = 2;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        hashMap15.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) (short) 100);
        int int22 = hashMap21.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap21.table = entryArray26;
        hashMap15.table = entryArray26;
        hashMap4.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap3.table;
        hashMap1.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) '4');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) (short) 0);
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = (short) -1;
        hashMap11.modCount = (byte) -1;
        java.lang.Object obj16 = hashMap7.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) 10.0d);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) (-1.0f));
        hashMap17.modCount = (byte) 1;
        hashMap17.modCount = 2;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        hashMap28.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0, (float) (short) 100);
        int int35 = hashMap34.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap34.table = entryArray39;
        hashMap28.table = entryArray39;
        hashMap17.table = entryArray39;
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap17.table;
        hashMap11.table = entryArray44;
        hashMap1.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) (short) 0);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = (short) -1;
        hashMap6.modCount = (byte) -1;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        hashMap14.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap14.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        int int25 = hashMap21.modCount;
        hashMap21.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj30 = hashMap21.get((java.lang.Object) 100.0f);
        java.lang.Object obj31 = hashMap6.put((java.lang.Object) hashMap14, obj30);
        hashMap6.clear();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        java.lang.Object obj12 = hashMap3.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) hashMap13);
        int int17 = hashMap3.modCount;
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap0.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.size();
        hashMap2.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        hashMap10.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        java.lang.Object obj14 = hashMap10.put((java.lang.Object) 'a', (java.lang.Object) hashMap13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap13.get(obj15);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) (short) 0);
        boolean boolean22 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = (short) -1;
        hashMap23.modCount = (byte) -1;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) hashMap23);
        hashMap19.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        hashMap31.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        java.lang.Object obj35 = hashMap31.put((java.lang.Object) 'a', (java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        java.lang.Object obj41 = hashMap36.remove((java.lang.Object) int40);
        int int42 = hashMap36.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap36.table = entryArray45;
        java.lang.Object obj47 = hashMap19.put((java.lang.Object) 'a', (java.lang.Object) hashMap36);
        java.lang.Object obj48 = hashMap13.get(obj47);
        java.lang.Object obj49 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj54 = hashMap52.remove((java.lang.Object) (short) 0);
        int int55 = hashMap52.modCount;
        int int56 = hashMap52.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        hashMap60.table = entryArray66;
        hashMap59.table = entryArray66;
        hashMap52.table = entryArray66;
        java.lang.Object obj71 = hashMap2.put((java.lang.Object) entryArray66, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) hashMap14);
        int int17 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap18.remove(obj22);
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int27 = hashMap18.modCount;
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap18.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (short) 1, (float) (byte) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) '4');
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) (short) 0);
        int int39 = hashMap36.modCount;
        int int40 = hashMap36.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        hashMap44.table = entryArray50;
        hashMap43.table = entryArray50;
        hashMap36.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        hashMap36.table = entryArray57;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.modCount = 0;
        java.lang.Object obj63 = hashMap59.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        int int67 = hashMap64.size();
        java.lang.Object obj68 = hashMap59.remove((java.lang.Object) hashMap64);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        hashMap69.clear();
        int int71 = hashMap69.modCount;
        java.lang.Object obj72 = hashMap59.get((java.lang.Object) hashMap69);
        java.lang.Object obj73 = hashMap33.put((java.lang.Object) entryArray57, (java.lang.Object) hashMap69);
        java.lang.Object obj74 = hashMap14.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap69);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        hashMap75.clear();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        int int81 = hashMap79.modCount;
        hashMap79.clear();
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = hashMap79.remove(obj83);
        java.lang.Object obj87 = hashMap79.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int88 = hashMap79.modCount;
        hashMap79.clear();
        system.testclass.HashMap.Entry[] entryArray90 = hashMap79.table;
        hashMap75.table = entryArray90;
        system.testclass.HashMap.Entry[] entryArray92 = hashMap75.table;
        hashMap14.table = entryArray92;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }
}

