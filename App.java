//111中央資管程式題目
import java.util.Scanner;

public class App {
    private float hour;
    private float minute;
    private float angle = 0;
    static int[] num = new int[2];

    public void set(float hour, float minute){
        this.hour = (float) ((hour*60 + minute)*0.5);
        this.minute = minute * 6;
        angle = (this.minute - this.hour)%360;
        if(angle < 0)
            angle = 360 + angle;
        if(angle > 180)
            angle = 360 - angle;
        if(angle == 0)
            System.out.println("0.0" + "度");
        else
            System.out.println("angle :" + " " + angle + "度");
    }

    public static void split(String input){
        String[] arr = input.split(":");

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
    }

    public static void main(String[] args) {
        App time = new App();
        System.out.println("INPUT:");
        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.nextLine();
        split(input);
        time.set(num[0], num[1]);
    }
}