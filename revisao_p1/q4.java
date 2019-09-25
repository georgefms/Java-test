import java.util.Scanner;

public class q4
{
    static int convDia(String a)
    {
        switch(a)
        {
        case "domingo": return 1;
        case "segunda": return 2;
        case "terca": return 3;
        case "quarta": return 4;
        case "quinta": return 5;
        case "sexta": return 6;
        case "sabado": return 7;
        }
        return -99;
    }
    static String convDia(int b)
    {
        switch(b)
        {
        case 1: return "Domingo";
        case 2: return "Segunda";
        case 3: return "Terça";
        case 4: return "Quarta";
        case 5: return "Quinta";
        case 6: return "Sexta";
        case 7: return "Sábado";
        }
        return "Erro";
    }
    static void main()
    {
        Scanner key = new Scanner(System.in);
        System.out.println("CONVERSOR DE DIAS DA SEMANA TEXTO <=> NÚMERO");
        System.out.println("Deseja usar texto(1) ou o numero do dia(2)?");
        int opc = key.nextInt();
        if (opc == 1)
        {
            System.out.println("Digite o dia da semana a converter: ");
            String diaS = key.next();
            System.out.println(convDia(diaS));
        } else /* sem o tratamento do caso de ser diferente de 1 ou 2 */
        {
            System.out.println("Digite o número do dia: ");
            int diaN = key.nextInt();
            System.out.println("Dia :" + convDia(diaN));
        }
        
        
    }
}
