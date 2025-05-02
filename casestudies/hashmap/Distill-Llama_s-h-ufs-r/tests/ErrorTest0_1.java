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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) 1L, obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = (byte) -1;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap19);
        hashMap16.modCount = 'a';
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap16);
        hashMap12.modCount = (byte) 10;
        int int27 = hashMap12.modCount;
        int int28 = hashMap12.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 10);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap39);
        hashMap36.modCount = 'a';
        java.lang.Object obj44 = hashMap32.remove((java.lang.Object) hashMap36);
        hashMap32.modCount = (byte) 10;
        int int47 = hashMap32.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean54 = hashMap53.isEmpty();
        hashMap53.clear();
        system.testclass.HashMap.Entry entry56 = null;
        system.testclass.HashMap.Entry[] entryArray57 = new system.testclass.HashMap.Entry[] { entry56 };
        hashMap53.table = entryArray57;
        hashMap50.table = entryArray57;
        hashMap32.table = entryArray57;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        int int64 = hashMap61.size();
        int int65 = hashMap61.modCount;
        int int66 = hashMap61.size();
        java.lang.Object obj67 = hashMap30.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap61);
        java.lang.Object obj68 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) 100.0d);
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap8);
        int int11 = hashMap5.modCount;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 0.0f);
        int int8 = hashMap2.modCount;
        java.lang.Object obj9 = null;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap2.put(obj9, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (short) 10, obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap6.put(obj22, (java.lang.Object) entryArray26);
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap3.clear();
        boolean boolean8 = hashMap3.isEmpty();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) boolean8);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap11.get((java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap16.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        hashMap16.table = entryArray27;
        java.lang.Object obj29 = hashMap11.remove((java.lang.Object) entryArray27);
        hashMap11.modCount = (byte) 1;
        java.lang.Object obj33 = hashMap1.put((java.lang.Object) (byte) 1, (java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0);
        java.lang.Object obj37 = hashMap35.get((java.lang.Object) 100.0d);
        int int38 = hashMap35.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        java.lang.Object obj42 = hashMap39.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        int int46 = hashMap43.size();
        java.lang.Class<?> wildcardClass47 = hashMap43.getClass();
        java.lang.Object obj48 = hashMap39.get((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) int38, (java.lang.Object) wildcardClass47);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        java.lang.Object obj53 = hashMap50.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.isEmpty();
        java.lang.Object obj59 = hashMap54.get((java.lang.Object) hashMap57);
        java.lang.Object obj60 = hashMap50.get((java.lang.Object) hashMap57);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        java.lang.Object obj68 = hashMap66.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray69 = hashMap66.table;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        boolean boolean71 = hashMap70.isEmpty();
        int int72 = hashMap70.size();
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        boolean boolean74 = hashMap73.isEmpty();
        java.lang.Object obj75 = hashMap70.get((java.lang.Object) hashMap73);
        int int76 = hashMap73.size();
        java.lang.Object obj77 = hashMap63.put((java.lang.Object) entryArray69, (java.lang.Object) int76);
        hashMap50.table = entryArray69;
        hashMap1.table = entryArray69;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap2.table = entryArray6;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) 0);
        hashMap2.modCount = 10;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        hashMap20.modCount = 0;
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean28 = hashMap27.isEmpty();
        hashMap27.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        boolean boolean33 = hashMap30.isEmpty();
        java.lang.Object obj34 = hashMap27.remove((java.lang.Object) hashMap30);
        int int35 = hashMap27.modCount;
        java.lang.Object obj36 = hashMap13.put((java.lang.Object) '#', (java.lang.Object) int35);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap13.table;
        hashMap2.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        java.lang.Class<?> wildcardClass8 = hashMap4.getClass();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) wildcardClass8);
        hashMap0.clear();
        int int11 = hashMap0.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap23.get((java.lang.Object) 100.0d);
        int int26 = hashMap23.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) hashMap28);
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) hashMap28);
        hashMap12.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap32.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap32.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj48 = hashMap42.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        java.lang.Object obj53 = hashMap32.put(obj48, (java.lang.Object) entryArray52);
        hashMap32.clear();
        java.lang.Class<?> wildcardClass55 = hashMap32.getClass();
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        hashMap57.clear();
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = hashMap57.remove(obj61);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray65 = hashMap64.table;
        hashMap57.table = entryArray65;
        hashMap0.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        hashMap6.modCount = 0;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj11 = hashMap6.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        int int12 = hashMap6.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap29.get((java.lang.Object) 100.0d);
        int int32 = hashMap29.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) hashMap34);
        java.lang.Object obj36 = hashMap18.get((java.lang.Object) hashMap34);
        java.lang.Object obj37 = hashMap16.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap16.table;
        hashMap6.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.modCount;
        java.lang.Object obj4 = null;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) hashMap10);
        hashMap10.clear();
        hashMap10.clear();
        java.lang.Object obj17 = hashMap1.put(obj4, (java.lang.Object) hashMap10);
        boolean boolean18 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap20.modCount = (short) 0;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap24.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj40 = hashMap34.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        java.lang.Object obj45 = hashMap24.put(obj40, (java.lang.Object) entryArray44);
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap24);
        boolean boolean47 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        java.lang.Object obj51 = hashMap48.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        int int54 = hashMap52.size();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        java.lang.Object obj57 = hashMap52.get((java.lang.Object) hashMap55);
        java.lang.Object obj58 = hashMap48.get((java.lang.Object) hashMap55);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        java.lang.Object obj66 = hashMap64.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray67 = hashMap64.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        int int70 = hashMap68.size();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        java.lang.Object obj73 = hashMap68.get((java.lang.Object) hashMap71);
        int int74 = hashMap71.size();
        java.lang.Object obj75 = hashMap61.put((java.lang.Object) entryArray67, (java.lang.Object) int74);
        hashMap48.table = entryArray67;
        hashMap24.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap24", hashMap24.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap7);
        hashMap4.modCount = 'a';
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap0.modCount = (byte) 10;
        int int15 = hashMap0.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap18.table = entryArray22;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) 100);
        hashMap18.modCount = (byte) 1;
        java.lang.Object obj28 = hashMap0.get((java.lang.Object) (byte) 1);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj32 = hashMap30.get((java.lang.Object) 100.0d);
        int int33 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) hashMap37);
        int int40 = hashMap34.modCount;
        java.lang.Object obj42 = hashMap30.put((java.lang.Object) hashMap34, (java.lang.Object) (short) 100);
        java.lang.Object obj43 = hashMap0.remove(obj42);
        java.lang.Object obj44 = null;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap45.table;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        java.lang.Object obj54 = hashMap45.remove((java.lang.Object) hashMap50);
        boolean boolean55 = hashMap45.isEmpty();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        int int59 = hashMap56.size();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap60.table;
        boolean boolean64 = hashMap60.isEmpty();
        hashMap60.clear();
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0);
        java.lang.Object obj68 = hashMap56.put((java.lang.Object) hashMap60, (java.lang.Object) hashMap67);
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = hashMap45.put((java.lang.Object) hashMap60, obj69);
        boolean boolean71 = hashMap45.isEmpty();
        java.lang.Object obj72 = hashMap0.put(obj44, (java.lang.Object) boolean71);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        boolean boolean74 = hashMap73.isEmpty();
        java.lang.Object obj76 = hashMap73.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        int int81 = hashMap80.modCount;
        int int82 = hashMap80.modCount;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap80.table;
        hashMap79.table = entryArray83;
        java.lang.Object obj85 = hashMap73.remove((java.lang.Object) entryArray83);
        hashMap0.table = entryArray83;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }
}

