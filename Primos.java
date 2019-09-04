/* entra em loop, falta achar o erro*/
import java.util.Scanner;
public class Primos
{
static void main(){
    printPrimes();
}
public static void printPrimes(){
    int count = 0, i = 2;
    while (count <=50){
        if (isPrime(i)==true){
            count++;
            System.out.println(i);
        }
        i++;
    }
}
public static boolean isPrime(int n){
    for (int divisor = 2; divisor <= n/2; divisor++){
        if(n % divisor == 0){
            return false;
        }
    }
    return false;
}
}
