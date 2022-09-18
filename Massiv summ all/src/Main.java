public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {10,20,30,40,50,60,70};
        int index = 0;
        int size = 7;
        int sum = 0;
        for (;index < size;index++){
            sum = sum + nums[index];
        }
        sum = sum/size;
        System.out.println("Result = " + sum);
    }
}

