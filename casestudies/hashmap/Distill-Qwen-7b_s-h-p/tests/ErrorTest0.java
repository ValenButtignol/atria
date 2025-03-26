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
        boolean boolean4 = hashMap0.property();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        hashMap0.clear();
        boolean boolean8 = hashMap0.property();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.property();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        hashMap0.clear();
        boolean boolean8 = hashMap0.repOK();
        boolean boolean9 = hashMap0.property();
        int int10 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.property();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) 100.0f);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) 100.0f);
        boolean boolean14 = hashMap0.property();
        int int15 = hashMap0.modCount;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 10L);
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        hashMap0.modCount = '4';
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.property();
        hashMap0.clear();
        int int7 = hashMap0.modCount;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }
}

