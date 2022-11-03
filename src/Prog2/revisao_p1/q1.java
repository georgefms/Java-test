import java.util.Arrays;
import java.util.ArrayList;
class q1
{
 static void tamanhoDaLista(int[] a)
    {
        System.out.println(a.length);
    }
 static void tamanhoDaLista(ArrayList<Integer> b)
    {
        System.out.println(b.size());
    }
 public static void main()
    {
        int[] isso = {1,2,3,4,5};
        ArrayList aaa = new ArrayList<Integer>();
        aaa.add(1);
        aaa.add(2);
        aaa.add(3);
        aaa.add(4);
        
        tamanhoDaLista(aaa);
        tamanhoDaLista(isso);
        
        
    }
}
