public class RepOkClass1{
    public boolean repOK() {
        // Check if the size does not exceed the capacity
        if (size > capacity) {
            return false;
        }
        
        // Check if the heap property is maintained
        for (int i = 0; i < size; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < size && heap[left] < heap[i]) {
                return false;
            }
            if (right < size && heap[right] < heap[i]) {
                return false;
            }
        }
        
        // Check if the heap is complete
        int lastLevel = (int) (Math.log(size) / Math.log(2)) + 1;
        int lastLevelStart = (int) Math.pow(2, lastLevel - 1);
        for (int i = lastLevelStart; i < size; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left >= size || right >= size) {
                continue;
            }
            if (heap[left] < heap[i] || heap[right] < heap[i]) {
                return false;
            }
        }
        
        return true;
    }


}
