public class Main {
    public static class Boolean {
        public static void main(String[] args) {
            int[] nums = {10, 20, 56, 25, 99, 52};
            boolean compare = true;
            boolean cicl = true;
            int size = 6;
            int index = 0;
            int max = 0;
            int min = 0;
            int indexMax = 0;
            int indexMin = 0;
            int indexsum = 0;
            int sum = 0;
            int i = 0;
            max = nums[index];
            min = nums[index];
            for (; index < size; index++) {
                cicl = max < nums[index];
                compare = min > nums[index];
                if (cicl) {
                    max = nums[index];
                    indexMax = index;
                }
                if (compare) {
                    min = nums[index];
                    indexMin = index;
                }
            }
            System.out.println("Max = " + max);
            System.out.println("indexMax = " + indexMax);
            System.out.println("Min = " + min);
            System.out.println("indexMin = " + indexMin);
            indexsum = indexMax - indexMin;
            if (indexMax < indexMin) {
                if (indexsum < 0) {
                    indexsum = indexsum * (-1);
                }
                for (; indexsum > i - 1; i++) {
                    sum = sum + nums[indexMin];
                    indexMin--;
                }
                System.out.println("sum = " + sum);
            }
            else if (indexMax > indexMin) {
                for (i = 0, sum = 0; indexsum > i - 1; i++) {
                    sum = nums[indexMax] + sum;
                    indexMax--;
                }
                System.out.println("sum = " + sum);
            }
        }
    }
}





