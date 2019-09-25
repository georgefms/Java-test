import java.util.ArrayList;
import java.util.Scanner;

public class q6{
    static Scanner key = new Scanner(System.in);
    static ArrayList<String> produtos = new ArrayList<String>();
    static ArrayList<Integer> precos = new ArrayList<Integer>();
    static void cadastrarProd(){
        System.out.println("Entre com o nome e preço do produto: ");
        System.out.println("Nome: ");
        produtos.add(key.next());
        System.out.println("Preço: ");
        precos.add(key.nextInt());
    }
    static void verProd(){
        System.out.println("=================================");
        for(int i = 0; i < produtos.size(); i++ )
       {
        System.out.println("Cod: "+i+" Produto: "+produtos.get(i)+" Preço (R$): "+precos.get(i));
        System.out.println("=================================");
       }
    }
    static void removProd(){
            System.out.println("Insira o cod do produto a deletar: ");
            int code = key.nextInt();
            produtos.remove(code);
            precos.remove(code);
    }
    static void menu()
    {
        boolean cont = true;
        do{
            System.out.println("1 - cadastrar produtos");
            System.out.println("2 - remover produtos ");
            System.out.println("3 - ver produtos");
            System.out.println("4 - sair");
            int opc = key.nextInt();
            switch(opc)
            {
                case 1:
                cadastrarProd();
                break;
                case 2:
                verProd();
                removProd();
                break;
                case 3:
                verProd();
                case 4:
                cont = false;
                default:
                System.out.println("Opção inválida");
            }
        }while (cont = true);
        
    }
    static void main(){
    menu();
    }




