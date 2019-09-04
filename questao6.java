/*Faça uma calculadora que após informado dois valores inteiros apresente um menu de
opções, sendo: 1-Soma; 2-Subtração, 3-Divisão, 4-Multiplicação; 5-Inserir novos
números; 6-SAIR. O programa deverá apresentar o resultado da operação escolhida
pelo usuário e em seguida voltar ao menu para uma próxima operação. */

import java.util.Scanner;
public class questao6
{
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

public static int change(int a){
    Scanner key = new Scanner(System.in);
    System.out.println("Insira o valor a ser trocado: ");
    a = key.nextInt();
    return a; 
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
        System.out.println("Primeiro valor: ");
        num1=change(num1);
        System.out.println("Segundo valor: ");
        num2=change(num2);
        break;
        case "sair":
        return false;
        default:
        System.out.println("Operação inválida, entre com +,-,*,/,trocar ou sair :D");
        
        
        
    }
}
}
}
