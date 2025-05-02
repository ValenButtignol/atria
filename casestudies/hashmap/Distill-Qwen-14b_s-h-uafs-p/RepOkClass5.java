public class RepOkClass5{
    public boolean property_5() {
        for (Entry[] bucket : table) {
            for (Entry entry = bucket; entry != null; entry = entry.next) {
                if (entry.key == null) {
                    return false;
                }
            }
        }
        return true;
    }


}
