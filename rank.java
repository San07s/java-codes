import java.util.*;
class rank {
    static Scanner s=new Scanner(System.in);
    public static void main(String[]sp){
      System.out.print("Enter Your Number:");
      int n=s.nextInt();
      int m=8;
      if (n<m){
          System.out.println("Lesser");
      }
      else if (n>m){
          System.out.println("Greater");
      }
      else
      System.out.println("Equal");
    }
}