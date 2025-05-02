import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        java.lang.Class<?> wildcardClass15 = hashMap6.getClass();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        java.lang.Object obj23 = hashMap16.put((java.lang.Object) hashMap21, (java.lang.Object) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap16.table;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) wildcardClass15, (java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap16.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap16", hashMap16.property_3());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(53);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 10);
        boolean boolean7 = hashMap6.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap2.table = entryArray8;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) (byte) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        java.lang.Object obj17 = hashMap10.put((java.lang.Object) hashMap15, (java.lang.Object) (byte) 1);
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        java.lang.Object obj26 = hashMap19.put((java.lang.Object) hashMap24, (java.lang.Object) (byte) 1);
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) 100);
        hashMap19.clear();
        java.lang.Object obj30 = hashMap15.remove((java.lang.Object) hashMap19);
        hashMap19.modCount = ' ';
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap33.table = entryArray36;
        hashMap19.table = entryArray36;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        java.lang.Object obj40 = hashMap7.put((java.lang.Object) entryArray36, (java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj45 = hashMap41.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        java.lang.Object obj48 = hashMap41.put((java.lang.Object) hashMap46, (java.lang.Object) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap41.table;
        java.lang.Object obj51 = hashMap39.put((java.lang.Object) hashMap41, (java.lang.Object) 0.0f);
        boolean boolean52 = hashMap41.property_2();
        int int53 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap41.table;
        hashMap1.table = entryArray54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        boolean boolean4 = hashMap0.composedRepOK();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        java.lang.Object obj14 = hashMap7.put((java.lang.Object) hashMap12, (java.lang.Object) (byte) 1);
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        java.lang.Object obj23 = hashMap16.put((java.lang.Object) hashMap21, (java.lang.Object) (byte) 1);
        java.lang.Object obj25 = hashMap16.get((java.lang.Object) 100);
        hashMap16.clear();
        java.lang.Object obj27 = hashMap12.remove((java.lang.Object) hashMap16);
        hashMap16.modCount = ' ';
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap30.table = entryArray33;
        hashMap16.table = entryArray33;
        java.lang.Object obj37 = hashMap6.put((java.lang.Object) entryArray33, (java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap6.table;
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) (byte) 1);
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap1.table = entryArray11;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap13.modCount = (short) -1;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 1;
        boolean boolean21 = hashMap18.composedRepOK();
        hashMap18.clear();
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj28 = hashMap24.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        java.lang.Object obj31 = hashMap24.put((java.lang.Object) hashMap29, (java.lang.Object) (byte) 1);
        boolean boolean32 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        java.lang.Object obj40 = hashMap33.put((java.lang.Object) hashMap38, (java.lang.Object) (byte) 1);
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) 100);
        hashMap33.clear();
        java.lang.Object obj44 = hashMap29.remove((java.lang.Object) hashMap33);
        hashMap33.modCount = ' ';
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap48.table;
        hashMap47.table = entryArray50;
        hashMap33.table = entryArray50;
        hashMap1.table = entryArray50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 10);
        boolean boolean4 = hashMap3.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }
}

