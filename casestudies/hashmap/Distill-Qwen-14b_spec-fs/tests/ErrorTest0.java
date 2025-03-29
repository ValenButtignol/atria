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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        boolean boolean9 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap19);
        java.lang.Object obj22 = hashMap7.put((java.lang.Object) entryArray12, (java.lang.Object) hashMap19);
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = null;
        hashMap1.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        hashMap0.clear();
        int int8 = hashMap0.size();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = null;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap1.table = entryArray11;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap16.table = entryArray18;
        hashMap15.table = entryArray18;
        hashMap13.table = entryArray18;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap5.table = entryArray12;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap5.table;
        hashMap1.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = null;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap7);
        int int10 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        java.lang.Object obj18 = hashMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap16);
        int int19 = hashMap12.modCount;
        hashMap12.clear();
        int int21 = hashMap12.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap26);
        int int29 = hashMap22.modCount;
        hashMap22.clear();
        int int31 = hashMap22.modCount;
        java.lang.Object obj32 = hashMap12.get((java.lang.Object) int31);
        int int33 = hashMap12.modCount;
        java.lang.Object obj34 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        java.lang.Object obj41 = hashMap35.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        hashMap39.table = entryArray43;
        hashMap3.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }
}

