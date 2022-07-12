import java.util.*;

public class Taskfour {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the year");
        int year=scan.nextInt();
        boolean x=(year % 4)==0;
        boolean y=(year % 100) !=0;
        boolean z=((year % 100 ==0) && (year % 400 ==0));
      if (x && (y||z))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");

        }
    }
}

