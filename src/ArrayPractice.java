import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;

        }
        System.out.println(Arrays.toString(numbers));
        randomArray();
    }
    public static void randomArray(){
        int[] box = new int[(int)(Math.random()*10)+1];
        for(int i = 0; i < box.length; i++){
            box[i] = (int)(Math.random()*10)+1;;
        }
        System.out.println(Arrays.toString(box));
    }
}
