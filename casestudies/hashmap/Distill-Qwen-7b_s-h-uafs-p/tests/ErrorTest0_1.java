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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap2", hashMap2.property_1());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = (byte) -1;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap8);
        int int12 = hashMap2.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        hashMap18.modCount = (byte) 10;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean27 = hashMap26.isEmpty();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap18.table = entryArray28;
        hashMap16.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap34.table = entryArray36;
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap31.table = entryArray39;
        hashMap16.table = entryArray39;
        java.lang.Object obj42 = hashMap14.get((java.lang.Object) hashMap16);
        int int43 = hashMap14.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap44.table;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) hashMap49);
        java.lang.Object obj54 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap2", hashMap2.property_1());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.isEmpty();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean15 = hashMap14.isEmpty();
        hashMap14.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap17.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap17.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0);
        java.lang.Object obj30 = hashMap28.get((java.lang.Object) 100.0d);
        int int31 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj34 = hashMap28.remove((java.lang.Object) hashMap33);
        java.lang.Object obj35 = hashMap17.get((java.lang.Object) hashMap33);
        java.lang.Class<?> wildcardClass36 = hashMap17.getClass();
        java.lang.Object obj37 = hashMap5.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        java.lang.Object obj41 = hashMap38.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        java.lang.Object obj47 = hashMap42.get((java.lang.Object) hashMap45);
        int int48 = hashMap42.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        hashMap49.clear();
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = hashMap49.remove(obj53);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray57 = hashMap56.table;
        hashMap49.table = entryArray57;
        java.lang.Object obj59 = hashMap38.put((java.lang.Object) int48, (java.lang.Object) entryArray57);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) (short) 10);
        int int62 = hashMap61.modCount;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap63.table;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap63.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        system.testclass.HashMap.Entry[] entryArray71 = hashMap68.table;
        java.lang.Object obj72 = hashMap63.remove((java.lang.Object) hashMap68);
        java.lang.Object obj73 = hashMap38.put((java.lang.Object) int62, (java.lang.Object) hashMap68);
        int int74 = hashMap68.modCount;
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray77 = new system.testclass.HashMap.Entry[] {};
        hashMap75.table = entryArray77;
        hashMap75.modCount = (byte) 10;
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean84 = hashMap83.isEmpty();
        system.testclass.HashMap.Entry[] entryArray85 = hashMap83.table;
        hashMap75.table = entryArray85;
        int int87 = hashMap75.modCount;
        java.lang.Object obj88 = hashMap5.put((java.lang.Object) int74, (java.lang.Object) int87);
        hashMap5.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap5", hashMap5.property_1());
    }
}

