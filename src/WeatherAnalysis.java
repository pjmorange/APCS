import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {
        int days = 0;
        double temp = 0;
        double sum = 0;//cumulative sum variable

        Scanner scan = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        days = scan.nextInt();//user input
        double doubledays = days / 1.0;
        double[] box = new double[days];//array declaration
        intro(days, temp, box, scan);//call of intro method
        math(box, doubledays, days, sum);//calculation method call
    }


    public static void intro(int days, double temp, double[] box,Scanner scan){
        for(int i = 0; i < days; i++){//array storage method
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temp = scan.nextDouble();
            box[i]= temp;
        }
    }
    public static void math(double[] box, double doubledays,int days, double sum) {
        int end = 0;
        for (int j = 0; j < days; j++) {
            sum += box[j];//add to cumulative sum variable

        }
        sum = (sum / doubledays);//find average
        sum = (Math.round(sum * 10.0)) / 10.0;//round the average
        System.out.println("Average temp = " + sum);
        for (int m = 0; m < days; m++) {
            if (box[m] > sum) {
                end++;//find the amount of themperatures that were above average
            }
        }
        System.out.println(end + " days were above average.");//print the result

    }
}
