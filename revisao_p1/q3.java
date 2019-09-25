import java.util.ArrayList;
import java.util.Scanner;

public class q3
{
    public static float media(ArrayList<Integer> a)
    {
        float md = 0;
        for(int i = 0; i < a.size(); i++)
        {
            md += a.get(i);
        }
        return md/(a.size());
    }
    static void main()
    {
    ArrayList<Integer> valores = new ArrayList<Integer>();
    Scanner key = new Scanner(System.in);
    System.out.println("Entre a seguir com 5 valores inteiros");
    
    for (int i = 0; i < 5; i++){
    System.out.println("Digite um valor: ");
    valores.add(key.nextInt());
    }
    System.out.println("Média : "+media(valores));
    }
    
}
