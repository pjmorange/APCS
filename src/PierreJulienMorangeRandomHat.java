import java.util.Scanner;

public class PierreJulienMorangeRandomHat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Amount of teams: ");//user input for amount of teams
        int amount = scan.nextInt();

        int[] array = new int[amount];//creation of array

        for (int i = 0; i < amount; i++) {
            array[i] = i + 1;//amount of teams being stored in array
        }

        math(amount, array);//calling of main math method

    }
    public static void math(int amount, int[] array){
        int random = (int) (Math.random() * amount - 1);//creation of random int

        for(int j = 0; j < amount/2; j++) {
            random=creation(array, amount, random);//calling of shuffling method

            System.out.print("Teams: " + (random+1)+ ", ");//print the shuffled result

            array[random]=-1;//makes the number no longer usable

            random=creation(array, amount, random);//repeat

            System.out.print((random+1));//print the second shuffled result

            array[random]=-1;

            System.out.println();
        }
    }
    public static int creation(int[] array, int amount, int random) {//shuffling method
        while (array[random] == -1) {//while there are still usable numbers
            random = (int) (Math.random() * amount);//shuffle the numbers
        }
        return random;//return shuffled result
    }

}