import java.util.Arrays;
import java.util.Scanner;

public class q2
{
    public static float media(int[] a)
    {
        float md = 0;
        for(int i = 0; i < a.length; i++)
        {
            md += (a[i]);
        }
        return md/(a.length);
    }
    static void main()
    {
    int[] valores = new int[5];
    Scanner key = new Scanner(System.in);
    System.out.println("Entre a seguir com 5 valores inteiros");
    
    for (int i = 0; i < valores.length; i++){
    System.out.println("Digite um valor: ");
    valores[i] = key.nextInt();
    }
    System.out.println("Média : "+media(valores));
    }
    
}
