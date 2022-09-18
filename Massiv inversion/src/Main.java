
public class Main {

        public static void main(String[] args) {
            int[] nums = {100, 20, 160, 10, 5};
            int size = 5;
            int index = 0;
            int inversion = 0;
            int massiv = 0;
            for (; index < size ; index++) {
                massiv = nums[index];
                inversion = nums[size - index - 1];;
                System.out.println("Massiv " + massiv);
                System.out.println("Inversion " + inversion);
            }
    }
}

