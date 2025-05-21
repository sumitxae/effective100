import java.lang.*;

public class Main {
    public static void qu1 (int a, int b) {
        System.out.println("The sum of "+a+" "+b+" is ="+(a+b));
    }
    public static void qu2(int length, int breadth) {
        System.out.println("Area of Rectangle : "+ (length*breadth));
        System.out.println("Perimeter of Rectangle : " + (2*(length+breadth)));
    }
    public static void qu3(int P, int R, int T, int N) {
        double A = P * Math.pow((1+((double) R /(100*N))), (N*T));
        double CI = A - P;
        System.out.println("Your compounded interest is : "+CI);
    }
    public static int maxNum (int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static void gndrMsg (char gender) {
        gender = Character.toLowerCase(gender);
        if (gender == 'm')
            System.out.println("Good Morning Sir");
        else if (gender == 'f') System.out.println("Good Morning Ma'am");
        else System.out.println("Invalid gender input, Please use M or F");
    }

    public static boolean isEligbleVoter (String name, int age) {
        if (age >= 18) {
            System.out.println("Hello "+name+ " You are a valid voter.");
            return true;
        } else {
            System.out.println("Sorry "+name+" you can't cast the vote.");
            return false;
        }
    }

    public static String dayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid input";
        }
    }

    public static void main(String[] args) {
        System.out.println(dayName(45));
    }
}