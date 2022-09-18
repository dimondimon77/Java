public class Main {
    public static void main(String[] args) {
        int[] num = {2, -5, 28, -34, -9, 7, 12};
        int count = 0;
        int index = 0;
        int size = 7;
        while (index<size){
            if (num[index]>0){
                count = count +1;
            }
            index = index+1;
        }
        System.out.println("Count = " + count);
    }
}