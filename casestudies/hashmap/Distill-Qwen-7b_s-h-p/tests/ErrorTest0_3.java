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
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap2.table = entryArray4;
        boolean boolean6 = hashMap2.isEmpty();
        boolean boolean7 = hashMap2.composedRepOK();
        boolean boolean8 = hashMap2.isEmpty();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) boolean8, (java.lang.Object) (byte) 10);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.composedRepOK();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) 10.0d);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4');
        boolean boolean7 = hashMap6.property_1();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4');
        int int12 = hashMap11.size();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) int12);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (short) -1);
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) 100.0d);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.composedRepOK();
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        int int14 = hashMap10.modCount;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) int14);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap2", hashMap2.property_3());
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (short) -1);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap5.table = entryArray7;
        boolean boolean9 = hashMap5.isEmpty();
        boolean boolean10 = hashMap5.composedRepOK();
        hashMap5.modCount = 1;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.composedRepOK();
        boolean boolean19 = hashMap13.isEmpty();
        int int20 = hashMap13.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        boolean boolean25 = hashMap21.isEmpty();
        boolean boolean26 = hashMap21.composedRepOK();
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        boolean boolean34 = hashMap29.composedRepOK();
        boolean boolean35 = hashMap29.isEmpty();
        java.lang.Object obj36 = hashMap21.get((java.lang.Object) hashMap29);
        hashMap29.modCount = '4';
        java.lang.Object obj39 = hashMap5.put((java.lang.Object) hashMap13, (java.lang.Object) '4');
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry45 = null;
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] { entry45 };
        hashMap44.table = entryArray46;
        boolean boolean48 = hashMap44.isEmpty();
        boolean boolean49 = hashMap44.composedRepOK();
        java.lang.Object obj51 = hashMap44.remove((java.lang.Object) 10.0d);
        int int52 = hashMap44.size();
        java.lang.Object obj53 = hashMap5.put((java.lang.Object) entryArray42, (java.lang.Object) int52);
        hashMap0.table = entryArray42;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (byte) 10, (float) 10L);
        hashMap57.modCount = 0;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry61 = null;
        system.testclass.HashMap.Entry[] entryArray62 = new system.testclass.HashMap.Entry[] { entry61 };
        hashMap60.table = entryArray62;
        boolean boolean64 = hashMap60.isEmpty();
        system.testclass.HashMap.Entry[] entryArray65 = hashMap60.table;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap60.table;
        hashMap57.table = entryArray66;
        java.lang.Object obj68 = hashMap0.remove((java.lang.Object) hashMap57);
        int int69 = hashMap0.modCount;
        int int70 = hashMap0.size();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }
}

