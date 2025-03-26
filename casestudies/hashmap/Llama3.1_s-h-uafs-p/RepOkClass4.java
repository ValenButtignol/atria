public class RepOkClass4{
    public boolean property() {
        int hash = hash(maskNull("test"));
        int hash2 = hash(maskNull("test"));
        return hash == hash2;
    }


}
