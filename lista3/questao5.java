import java.util.Scanner;
import java.util.Arrays;

public class q5
{
	public static String classicarPorIdade(String[] a, int[] b){
	for(int i = 0; i < a.length; i++){
			System.out.println("Nome: " +a[i]);
            System.out.println("Idade: "+b[i]);
			if(b[i] < 4 ){
				return "idade invalida";
			}else if ((b[i] <= 5) && (b[i] >= 7)){
				return "Classificação: Infantil A";
			}else if (( b[i] <= 8) && ( b[i] >= 10)){
				return "Classificação: Infantil B";
			}else if (( b[i] <= 11) && ( b[i] >= 13)){
				return "Classificação: Juvenil A";
			}else if(( b[i] <= 14 ) && ( b[i] >= 17 )){
				return "Classificação: Juvenil B";
			}else{
				return "Adulto";
			}
	}return "cabo";
	}
   public static void main()
   {
	   Scanner key = new Scanner(System.in);
	   System.out.println("Digite o numero de participantes: ");
	   int tamanho = key.nextInt();
	   String[] partic = new String[tamanho];
	   int[] idade = new int[tamanho];
	   for(int i = 0; i < tamanho; i++)
	   {
		   System.out.println("Digite o nome do participante: ");
		   partic[i] = key.next();
		   System.out.println("Digite a idade do participante: ");
		   idade[i] = key.nextInt();
	   }
	   System.out.println(classicarPorIdade(partic, idade));
   }
}
