import java.util.Scanner;
public class questao6
{
/*public static void input(int a, int b){
    Scanner key = new Scanner(System.in);
    System.out.println("Primeiro valor: ");
    int num1 = key.nextInt();  
    System.out.println("Segundo valor: ");
    int num2 = key.nextInt();
}*/
public static int soma(int a,int b){
    return a+b;
}
public static int subtrai(int a, int b){
    return a-b;
}
public static int multp(int a, int b){
    return a*b;
}
public static double div(int a, int b){
    double result = a/b;
    return result;  
}
public static int changea(int a){
    a = changea(a);
    return a; //Ainda não funciona
}
public static int changeb(int b){
    b = changeb(b);
    return b; //tbm não 
}
public static boolean main(String args[]){
    Scanner key = new Scanner(System.in);    
    System.out.println("Primeiro valor: ");
    int num1 = key.nextInt();  
    System.out.println("Segundo valor: ");
    int num2 = key.nextInt();
    while (true){
    System.out.println("Entre com a operação desejada: ");
    System.out.println("Operações disponíveis: (+) (-) (*) (/) \n*trocar* valores e sair");
    String op = key.next();
    switch(op)
    {
        case "+":
        System.out.println(soma(num1,num2));
        break;
        case "-":
        System.out.println(subtrai(num1,num2));
        break;
        case "*":
        System.out.println(multp(num1,num2));
        break;
        case "/":
        System.out.println(div(num1,num2));
        break;
        case "trocar":
        changea(num1);
        changeb(num2);
        break;
        case "sair":
        return false;
        default:
        System.out.println("Operação inválida, entre com +,-,*,/,trocar ou sair :D");
        
        
        
    }
}
}
}
