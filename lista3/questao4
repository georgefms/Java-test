import java.util.ArrayList;
import java.util.Scanner;

public class q4
{
   public static double obterMediaPonderada(ArrayList<Integer> x, ArrayList<Integer>y)
   {
      float aux = 0; float sump = 0;
      for(int i = 0; i <= x.size() - 1; i++){
         aux += (x.get(i)*y.get(i));
         sump += y.get(i);
     }return aux/sump;
   }
   public static void main()
   {
       Scanner key = new Scanner(System.in);
       ArrayList<Integer> valores = new ArrayList<Integer>();
       ArrayList<Integer> pesos = new ArrayList<Integer>();
       boolean cont = true;
       do {
       System.out.println("Insira um valor ou 0 para parar de inserir");
       int opc = key.nextInt();
       if (opc != 0){
        valores.add(opc);
        System.out.println("Insira o peso do valor: "+opc);
        pesos.add(key.nextInt());
       }else {
           System.out.println(valores);
           cont = false;
       }
       }while(cont == true );
       System.out.println("Media ponderada: "+obterMediaPonderada(valores, pesos));
       
   }
}
