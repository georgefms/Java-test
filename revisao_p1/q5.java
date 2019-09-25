import java.util.ArrayList;
import java.util.Scanner;
public class q5
{
   static Scanner key = new Scanner(System.in);
   static int cont = 0;
   static ArrayList<Integer> ultimo = new ArrayList<Integer>();
   static boolean isPar(int a)
   {
       if (a % 2 == 0 ){
           return true;
       }else{
           return false;
       }
   }
   static void main()
   {
       ArrayList<Integer> pares = new ArrayList<Integer>();
       ArrayList<Integer> impares = new ArrayList<Integer>();
       boolean segue = true;
       do{
       System.out.println("Insira um valor: ");
       int valor = key.nextInt();
       if ( valor != 0)
       {
           if (isPar(valor) == true){
            pares.add(valor);
            cont++;
            }else{
            impares.add(valor);
            cont++;
           }
        } else
        {
            segue = false;
        }
       }while (segue == true);
       ultimo.addAll(pares);
       ultimo.addAll(impares);
       System.out.println(ultimo);
       pares.clear();
       impares.clear();
    }
   
}
