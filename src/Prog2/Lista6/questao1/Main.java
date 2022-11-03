package questao1;
import java.util.*;
class Main{
public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Digite o endereço do imovel: ");
    String end =key.next();
    System.out.println("Digite o valor do Imovel: ");
    double pre = key.nextDouble();
    System.out.println("O imovel é novo ou velho? ");
    int opc = key.nextInt();

    if (opc == 1){
        Novo novo = new Novo(end, pre);
        novo.mostraPreço();
    }else if(opc == 2){
        Velho velho = new Velho(end, pre);
        velho.mostraPreço();
    }else{
        System.out.println("Opção inválida");
    }
    
    
}
}