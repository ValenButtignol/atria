public class RepOkClass1{
        public boolean repOK() {
            if (threshold < 0 || threshold > table.length) {
                return false;
            }
            if (loadFactor < 0 || loadFactor > 1.0f) {
                return false;
            }
            if (size > threshold) {
                return false;
            }
            if (modCount != this.modCount) {
                return false;
            }
            for (Entry e : table) {
                if (e != null && (e.key == null || e.key == NULL_KEY)) {
                    return false;
                }
                if (e != null && (e.value == null || e.value == NULL_KEY)) {
                    return false;
                }
            }
            return true;
        }


}
