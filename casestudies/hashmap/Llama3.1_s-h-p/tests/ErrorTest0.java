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
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) false);
        int int5 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap9.table = entryArray13;
        hashMap6.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        hashMap18.clear();
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap16.table = entryArray24;
        hashMap6.table = entryArray24;
        java.lang.Object obj27 = hashMap2.get((java.lang.Object) entryArray24);
        hashMap1.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.property();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        int int4 = hashMap3.modCount;
        hashMap3.clear();
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.property();
        hashMap4.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (-1L));
        boolean boolean16 = hashMap13.repOK();
        int int17 = hashMap13.size();
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) int17);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.property();
        int int21 = hashMap19.modCount;
        boolean boolean22 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap19.table;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap11.put((java.lang.Object) entryArray23, obj24);
        hashMap4.table = entryArray23;
        hashMap1.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.property();
        java.lang.Object obj5 = new java.lang.Object();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 100);
        int int8 = hashMap7.size();
        java.lang.Object obj9 = hashMap0.put(obj5, (java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        hashMap10.clear();
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) 1);
        int int14 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        java.lang.Object obj19 = hashMap15.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 10);
        java.lang.Object obj26 = hashMap17.put((java.lang.Object) entryArray23, (java.lang.Object) hashMap25);
        java.lang.Object obj27 = hashMap10.get((java.lang.Object) entryArray23);
        hashMap7.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap7", hashMap7.property_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        boolean boolean9 = hashMap5.property();
        hashMap5.modCount = (byte) 1;
        boolean boolean12 = hashMap5.isEmpty();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 10);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        int int18 = hashMap17.modCount;
        hashMap17.clear();
        int int20 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.get((java.lang.Object) false);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap22.table;
        boolean boolean26 = hashMap22.property();
        hashMap22.modCount = (byte) 1;
        boolean boolean29 = hashMap22.isEmpty();
        java.lang.Object obj30 = hashMap17.remove((java.lang.Object) hashMap22);
        java.lang.Object obj31 = hashMap16.remove((java.lang.Object) hashMap22);
        int int32 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap16.table;
        hashMap5.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap5", hashMap5.property_2());
    }
}

