import java.util.ArrayList;
import java.util.Scanner;

public class q6
{
   public static ArrayList<String> alunos = new ArrayList<String>();
   public static Scanner key = new Scanner(System.in);
   public static void mostrar(){
       for(int i = 0; i < alunos.size(); i++){
           System.out.println("Cod: "+i+" Aluno: "+alunos.get(i));
        }
    }
   public static void menu()
    {
        boolean cont = true;    
        do {
        System.out.println("Escolha uma opção: 1 add aluno/n 2 Remover aluno/n 3 Editar nome aluno/n 0 p/ Sair");
        int opc = key.nextInt();
        switch(opc)
        {
            case 1:
            System.out.println("Insira o nome do aluno: ");
            String nome = key.next();
            alunos.add(nome);
            break;
            case 2:
            mostrar();
            System.out.println("Insira o cod do aluno a deletar: ");
            int code = key.nextInt();
            alunos.remove(code);
            mostrar();
            break;
            case 3:
            mostrar();
            System.out.println("Insira o cod do aluno que quer editar");
            code = key.nextInt();
            System.out.println("Insira o novo nome do aluno");
            nome = key.next();
            alunos.set(code, nome);
            mostrar();
            break;
            case 0:
            cont = false;
            break;
            default:
                System.out.println("Opção inválida");
        }
        }while( cont == true);   
    }
    
}
