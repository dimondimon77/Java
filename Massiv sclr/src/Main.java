public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {4,2,13,10};
        int[] nums2 = new int[] {2,7,4,3};
        int result = 0;
        int index = 0;
        int size = 4;
        for (;index < size;index++){
            result = result + nums[index] * nums2[index];
            }
            System.out.println("Result = " + result);
        }
    }
