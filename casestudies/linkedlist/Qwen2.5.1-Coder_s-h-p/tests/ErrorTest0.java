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
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean3 = linkedList0.add((java.lang.Object) 10.0d);
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.property();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        boolean boolean7 = linkedList6.repOK();
        boolean boolean8 = linkedList6.repOK();
        int int9 = linkedList6.size();
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        boolean boolean11 = linkedList10.repOK();
        boolean boolean13 = linkedList10.add((java.lang.Object) 10.0d);
        boolean boolean15 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean16 = linkedList10.property();
        boolean boolean17 = linkedList6.add((java.lang.Object) linkedList10);
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        boolean boolean21 = linkedList19.property();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = linkedList19.remove(obj22);
        boolean boolean26 = linkedList19.remove((java.lang.Object) false);
        boolean boolean27 = linkedList0.add((java.lang.Object) boolean26);
        system.classfixer.classes.LinkedList linkedList28 = new system.classfixer.classes.LinkedList();
        int int29 = linkedList28.size();
        boolean boolean30 = linkedList28.property();
        int int31 = linkedList28.size();
        boolean boolean33 = linkedList28.add((java.lang.Object) (short) 10);
        boolean boolean34 = linkedList28.property();
        boolean boolean35 = linkedList0.add((java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }
}

