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
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap6.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap18);
        hashMap3.table = entryArray11;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = null;
        hashMap3.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }
}

