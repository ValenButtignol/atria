public class RepOkClass2{
    public boolean property_2() {
        int currentCapacity = table.length;
        int expectedThreshold = (int) (currentCapacity * loadFactor);
        return threshold == expectedThreshold;
    }


}
