import java.lang.*;
import java.util.*;

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
            System.out.println("You'll be eligble to vote in "+(18-age)+" year(s)");
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

    public static int greatestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return  a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static boolean isLeapYear (int year) {
     if (year % 100 == 0) {
         return year % 400 == 0 && year % 4 == 0;
     } else return year % 4 == 0;
    }

    public static String alphType(char alphabet) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        if (vowels.contains(alphabet)) return "The given alphabet is a Vowel";
        else return "The given alphabet is a Consonant";
    }

    public static void printHelloNTimes(int n) {
        while (n > 0) {
            System.out.println("Hello");
            n--;
        }
    }

    public static void naturalN(int n, boolean asc) {
        if (asc) {
            int i = 1;
            while (i <= n) System.out.println(i++);
        } else while (n > 0) System.out.println(n--);
    }

    public static void printMulTable(int n) {
        for (int i = 1; i <= 10; i++) System.out.println(n+" * "+i+" = "+(n*i));
    }

    public static int sumUptoN(int n) {
        return (n*(n+1))/2;
    }

    public static int getFactorial(int N) {
        if (N < 0) return -1;
        if (N == 0 || N == 1 || N == 2) return N;
        return N * getFactorial(N-1);
    }

    public static int[] oddAndEvenSum (int n) {
        int[] ans = {0,0};
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) ans[0]+=i;
            else ans[1]+=i;
        }
        return ans;
    }

    public static int[] factorsOfN(int N) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) ans.add(i);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int reverseNumber(int N) {
        int newNum = 0;
        while(N%10 != 0){
            newNum = newNum*10 + N%10;
            N = N/10;
        }
        return newNum;
    }

    public static boolean isStrongNumber(int N) {
        int sum = 0, temp = N;
        while(temp%10 != 0){
            sum+=getFactorial(temp%10);
            temp/=10;
        }
        return sum == N;
    }

    public static boolean isAutomorphic(int N){
        int square = N*N;
        while (N!=0) {
            if (N%10 != square%10) return false;
            N /= 10;
            square /= 10;
        }
        return true;
    }

    public static void que46() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void que47() {
        for (char i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void que48() {
        for (char i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                char temp = (char) (65+j);
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }

    public static void que50(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                if (j==i || j == (2*n-2-i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        que50(6);
    }
}