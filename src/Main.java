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

//    Ques 56
    public static int secondBigInt(int[] nums) {
        if (nums.length <= 1) return -1;
        if (nums.length == 2) return Math.min(nums[0], nums[1]);

        int max = nums[0], smax = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
            } else if (nums[i] != max && nums[i] > smax) {
                smax = nums[i];
            }
        }
        return smax;
    }

    public static void reverseArray(int[] nums) {
        if (nums.length <= 1) return;
        if (nums.length == 2) return;

        int s = 0, e = nums.length-1;

        while (s<=e) {
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
    }

    public static void reverseArray(int[] nums, int s, int e) {
        if (s == e || s > e) return;
        if (nums.length <= 1) return;
        if (nums.length == 2) return;

        while (s<=e) {
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
    }

    public static void rotateArrayByK (int[] nums, int k) {
        if (k < 1 || nums.length <= 1) return;
        if (nums.length == 2) return;
        if (k > nums.length) k = k % nums.length;
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
        reverseArray(nums);
    }

    public static int binSearch(int[] nums, int n) {
        int s = 0, e = nums.length-1;
        while (s<=e) {
            int mid = (s+e)/2;
            if (n == nums[mid]) return mid;
            else if (n<nums[mid]) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }

    public static void swap(int[] nums, int n, int m) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] >= nums[j+1]) swap(nums, j, j+1);
            }
        }
    }

    public static void moveNegRight(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            if (nums[s] < 0 && nums[e] > -1) {
                swap(nums, s++, e--);
            }
            if (nums[s] >= 0) s++;
            if (nums[e] < 0) e--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-9,1,0,-4,0,-2,7,-3,0,-1,0};
        int[] ans = new int[2*nums.length];
        moveNegRight(nums);
        System.out.println(Arrays.toString(nums));
    }
}