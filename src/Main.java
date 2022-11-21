import java.util.Scanner;

public class Main {
    static void add(int x,int y)
    {
        int a = x + y ;
    }
    static void sub(int x,int y) {
        int b = x - y;
    }
    static void mul(int x, int y)
    {
        int c = x - y;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the 2 numbers");
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.println("enter 1 for addition");
        System.out.println("enter 2 for subtraction");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for division");
        int z = sc.nextInt();

    }
}