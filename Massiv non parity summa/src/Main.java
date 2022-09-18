public class Main {
    public static class Boolean {
        public static void main(String[] args) {
            boolean parity = true;
            boolean condition = true;
            int[] nums = {17, 2, 13, 4, 15};
            int size = 4;
            int result = 0;
            int index = 0;
            for (; condition; index++) {
                condition = index < size;
                parity = nums[index] % 2 == 0;
                if (!parity){
                    result = result + nums[index];
                }
                if (!condition){
                    System.out.println("Result = " + result);
                }
            }
        }
    }
}






