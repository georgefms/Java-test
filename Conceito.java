import java.util.Scanner;
public class Conceito
{
    
static void main(){
    Scanner key = new Scanner(System.in);
    System.out.println("Insira a média final do Aluno: ");
    float nota = key.nextFloat();
    System.out.println(rodaaroda(nota));

}

public static String rodaaroda(float nota){
	
    if (nota < 5){
        return "Insuficiente";
    }else if (nota <7){
        return "regular";
        }else if (nota < 9) {
            return "Bom";
        }else if ((nota <9) && (nota >= 10)){
                return "Execelente";
            }else{
                return "erro";}
    
}
}
