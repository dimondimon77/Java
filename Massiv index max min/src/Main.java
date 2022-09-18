public class Main {
    public static class Boolean {
        public static void main(String[] args) {
            int[] nums = {12, 5, 49, 299, 52, 32};
            boolean minimum = true;
            boolean maximum = true;
            int size = 6;
            int index = 0;
            int max = 0;
            int min = 0;
            int indexMax = 0;
            int indexMin = 0;
            max = nums[index];
            min = nums[index];
            for (; index < size; index++) {
                maximum = max < nums[index];
                minimum = min > nums[index];
                if (maximum) {
                    max = nums[index];
                    indexMax = index;
                }
                if(minimum) {
                    min = nums[index];
                    indexMin = index;
                }
            }
            System.out.println("Max = " + max);
            System.out.println("indexMax = " + indexMax);
            System.out.println("Min = " + min);
            System.out.println("indexMin = " + indexMin);
        }
    }
}

