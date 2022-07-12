import java.util.*;

public class TaskOne {
    public static void main (String[] args){


            Scanner scan =new Scanner(System.in);
            System.out.println("enter the time");
            int time = scan.nextInt();



                switch (time){
                   case 1 :
                        System.out.println("Monday");
                        break;
                    case 2 :
                        System.out.println("thusday");
                        break;
                    case 3 :
                        System.out.println("wednesday");
                        break;
                    case 4 :
                        System.out.println("thusday");
                        break;
                    case 5 :
                        System.out.println("friday");
                        break;
                    case 6 :
                        System.out.println("saturday");
                        break;
                    case 7 :
                        System.out.println("sunday");
                        break;
                    default :
                        System.out.println("not the number");
          }

      }
   }


