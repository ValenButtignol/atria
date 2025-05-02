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
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.property_1();
        boolean boolean13 = hashMap11.property_1();
        java.lang.Class<?> wildcardClass14 = hashMap11.getClass();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.property_1();
        boolean boolean17 = hashMap15.property_1();
        hashMap15.clear();
        boolean boolean19 = hashMap15.property_2();
        int int20 = hashMap15.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, (float) 1);
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) hashMap23);
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap11, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for hashMap0", hashMap0.property_4());
    }
}

