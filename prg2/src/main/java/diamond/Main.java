package diamond;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static void printDiamond(int n)
    {
        int space = n/2;

        // run loop (parent loop)
        // till number of rows
        for (int i = 0; i < n/2 + 1; i++)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // Repeat again in
        // reverse order
        space = 1;

        // run loop (parent loop)
        // till number of rows
        for (int i = n/2; i > 0; i--)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }

    public static void main(String[] args)
    {
        try {
            String h;
            int n = 1;

            do {
                System.out.print("Gyémánt magassága: ");
                Scanner sc = new Scanner(System.in);
                h=sc.nextLine();
                if(!h.chars().allMatch( Character::isDigit )){
                    System.out.println("Nem számot adott meg!");
                    exit(1);
                }
                if(sc.nextLine().isEmpty()){
                    System.out.println("Nem adott meg magasságot!");
                    exit(1);
                }
                n=Integer.parseInt(h);
            }while (n%2==0);

            printDiamond(n);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

