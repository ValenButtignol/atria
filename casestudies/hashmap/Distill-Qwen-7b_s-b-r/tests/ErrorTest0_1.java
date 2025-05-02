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
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap14.table = entryArray18;
        hashMap7.table = entryArray18;
        hashMap7.modCount = (byte) -1;
        int int23 = hashMap7.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        int int28 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap32);
        int int35 = hashMap29.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.modCount = 0;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        hashMap39.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap39.table;
        hashMap36.table = entryArray44;
        hashMap29.table = entryArray44;
        java.lang.Object obj47 = hashMap7.put((java.lang.Object) hashMap24, (java.lang.Object) entryArray44);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap48.table;
        boolean boolean52 = hashMap48.isEmpty();
        hashMap48.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.clear();
        int int58 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap54.table;
        hashMap48.table = entryArray59;
        java.lang.Object obj61 = hashMap7.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap(0);
        boolean boolean66 = hashMap65.isEmpty();
        java.lang.Object obj67 = hashMap62.get((java.lang.Object) boolean66);
        int int68 = hashMap62.size();
        boolean boolean69 = hashMap62.isEmpty();
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap70.table;
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        boolean boolean75 = hashMap74.isEmpty();
        int int76 = hashMap74.size();
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        java.lang.Object obj79 = hashMap74.get((java.lang.Object) hashMap77);
        hashMap74.modCount = 'a';
        java.lang.Object obj82 = hashMap70.remove((java.lang.Object) hashMap74);
        hashMap70.clear();
        hashMap70.modCount = (byte) -1;
        java.lang.Object obj86 = null;
        java.lang.Object obj87 = hashMap70.get(obj86);
        java.lang.Object obj88 = hashMap62.get(obj86);
        java.lang.Object obj89 = hashMap0.put((java.lang.Object) hashMap48, obj88);
        system.testclass.HashMap.Entry[] entryArray90 = null;
        hashMap0.table = entryArray90;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }
}

