import java.util.ArrayList;
import java.util.Scanner;

public class q3
{
   public static double obterMediaAritmetica(ArrayList<Integer> x )
   {
     float aux = 0;
     for(int i = 0; i <= x.size() - 1; i++){
         aux += (x.get(i));
     } return aux/x.size();
   }
   public static void main()
   {
       Scanner key = new Scanner(System.in);
       ArrayList<Integer> valores = new ArrayList<Integer>();
       boolean cont = true;
       do {
       System.out.println("Insira um valor ou 0 para parar de inserir");
       int opc = key.nextInt();
       if (opc != 0){
        valores.add(opc);
       }else {
           System.out.println(valores);
           cont = false;
       }
       }while(cont == true );
       System.out.println("Media aritimetica: " + obterMediaAritmetica(valores));
       
   }
}
