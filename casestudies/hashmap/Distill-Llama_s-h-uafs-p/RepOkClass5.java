public class RepOkClass5{
    public boolean property() {
        // Check if the threshold is correctly calculated as capacity multiplied by loadFactor
        int expectedThreshold = (int) (capacity * loadFactor);
        return threshold == expectedThreshold;
    }


}
