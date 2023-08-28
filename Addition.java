import java.util.*;

class Helloworld { 

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in) ;
    System.out.println("Enter value of a");
    int a = input.nextInt();
    System.out.println("enter the value of b");
    int b= input.nextInt();
    int result ;
    result=a-b;
    System.out.println("sum of result is" + "= " + result);
  }
}