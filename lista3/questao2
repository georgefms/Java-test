import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista3
{
    public static Scanner key =  new Scanner(System.in);
    public static float[] idade = new float[2];
    public static float[] salario = new float[2];
    public static String[] nome = new String[2];
    public static String[] cargo = new String[2];
    public static String[] dataadm = new String[2];
    
    static void mostrardados(){
        System.out.println("=======================================");
        for (int i = 0; i <= 1; i++)
        {
            
            System.out.println("Código: "+i);
            System.out.println("Nome: "+ nome[i]);
            System.out.println("Idade: "+idade[i]);
            System.out.println("Cargo :"+ cargo[i]);
            System.out.println("Data de Admissão: "+ dataadm[i]);
            System.out.println("Salario (R$): "+ salario[i]);
            System.out.println("=======================================");
        }
    }
    static void editfunc(int cod){
        System.out.println("Escolha o dado de "+nome[cod]+"que deseja editar");
        System.out.println("1 p/ nome, 2 p/ idade, 3 p/ cargo 4 p/ data de admissao, 5 p/ salario");
        int opc = key.nextInt();
        switch(opc)
        {
            case 1:
            System.out.println("Insira o novo nome do funcionario: "+nome[cod]);
            nome[cod] = key.next();
            break;
            case 2:
            System.out.println("Insira a nova idade de: "+nome[cod]);
            idade[cod] = key.nextInt();
            break;
            case 3:
            System.out.println("Insira o novo nome do cargo de: "+nome[cod]);
            cargo[cod] = key.next();
            break;
            case 4:
            System.out.println("Insira a nova data de admissao de: "+nome[cod]);
            dataadm[cod] = key.next();
            break;
            case 5:
            System.out.println("Insira o novo salario de: "+nome[cod]);
            salario[cod] = key.nextInt();
 
        }
    }
    static float media(float[] x){
        float aux = 0;
        for (int i = 0; i <= x.length -1; i++)
        {
            aux += ( x[i]);
        }
        return aux/(x.length);
    }
    public static void cadastro()
    { 
        for(int i = 0; i<=1; i++)
        {
            System.out.println("nome do func? ");
            nome[i] = key.next();
            System.out.println("Idade do func? ");
            idade[i] = key.nextInt();
            System.out.println("Cargo do func? ");
            cargo[i] = key.next();
            System.out.println("Data de Admição? ");
            dataadm[i] = key.next();
            System.out.println("Salario que o cara ganha? ");
            salario[i] = key.nextFloat();
        }
    }
        
    public static void main()
        {
            cadastro();
            System.out.println(salario.length);
            System.out.println(idade.length);
            boolean cont = true;
            do
            {
                System.out.println("1 p/ mostrar funcionarios, 2 p/ alterar dados, 3 p/ media das idades, 4 p/ media salario, 0 p/ SAIR");
                int opc = key.nextInt();
                switch(opc)
                {
                    case 1:
                    mostrardados();
                    break;
                    case 2:
                    System.out.println("Insira do cod do Funcionário: ");
                    int cod = key.nextInt();
                    editfunc(cod);
                    break;
                    case 3:
                    media(idade);
                    System.out.println("Média das idades: "+media(idade));
                    break;
                    case 4:
                    media(salario);
                    System.out.println("Média dos salarios: "+media(salario));
                    break;
                    case 0:
                    cont = false;
                    break;
                    default:
                    System.out.println("Opção invalida!!!!");
                }
            }
            while (cont == true);
        }
    }
