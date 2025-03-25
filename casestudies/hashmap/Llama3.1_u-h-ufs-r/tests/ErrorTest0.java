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
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        hashMap9.clear();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        boolean boolean15 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap16.table = entryArray18;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap25);
        java.lang.Object obj28 = hashMap13.put((java.lang.Object) entryArray18, (java.lang.Object) hashMap25);
        hashMap13.clear();
        java.lang.Object obj30 = hashMap4.put((java.lang.Object) boolean11, (java.lang.Object) hashMap13);
        int int31 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        java.lang.Object obj41 = hashMap35.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap39);
        int int42 = hashMap35.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap35.table;
        hashMap33.table = entryArray43;
        java.lang.Object obj45 = hashMap4.get((java.lang.Object) entryArray43);
        hashMap4.modCount = 'a';
        system.classfixer.classes.HashMap.Entry[] entryArray48 = null;
        hashMap4.table = entryArray48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }
}

