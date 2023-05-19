import java.util.Scanner;

public class Binary {

    static void printBinary(int[] binary, int id)
    {

        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }

    public static void decimalToBinary(int num)
    {

        int[] binary = new int[35];
        int id = 0;

        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        printBinary(binary, id);
    }

    public static void main(String[] args)
    {

        int num ;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        decimalToBinary(num);
    }

}
