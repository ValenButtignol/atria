public class RepOkClass2{
    public boolean property() {
        int currentCapacity = table.length;
        int expectedThreshold = (int) (currentCapacity * loadFactor);
        return threshold == expectedThreshold;
    }


}
