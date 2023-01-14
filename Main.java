import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Leap leap;
        System.out.print("Enter the year: ");
        String year = sc.nextLine();
        try{
            int year_n = Integer.parseInt(year);
            if(year_n<0){
                throw new InputMismatchException();
            }
            leap = new Leap(year_n);
            leap.calender();
        }catch (InputMismatchException e){
            System.out.println("wrong input!!!");
        }catch (Exception e){
            System.out.println("wrong input!!!");
        }

    }
}
