import java.util.Scanner;
public class repasoParcial {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n1 = Math.abs(sc.nextInt());
       int n2 = Math.abs(sc.nextInt());
       int n1_digit = n1 % 10;
       int n2_digit = n2 % 10;
       
       if(n1_digit == n2_digit){
         System.out.println("Los ultimos digitos son iguales");
       }else{
         System.out.println("Los ultimos digitos no son iguales");
       }
}
}
