import java.util.ArrayList;
import java.util.Scanner;
public class q8
{
  public static ArrayList<String> baixoPeso = new ArrayList<String>();
  public static ArrayList<String> pesoNormal = new ArrayList<String>();
  public static ArrayList<String> preObeso = new ArrayList<String>();
  public static ArrayList<String> obeso1 = new ArrayList<String>();
  public static ArrayList<String> obeso2 = new ArrayList<String>();
  public static ArrayList<String> obeso3 = new ArrayList<String>();
  public static void classifica(String nome, float imc){
      if(imc < 18.5){
          baixoPeso.add(nome);
      }else if ((imc > 18.5)&&(imc <= 24.9)){
          pesoNormal.add(nome);
      }else if ((imc > 25)&&(imc <= 29.9)){
          preObeso.add(nome);
      }else if ((imc > 30)&&(imc <= 34.9)){
          obeso1.add(nome);
      }else if ((imc > 35)&&(imc <= 39.9)){
          obeso2.add(nome);
      }else{
          obeso3.add(nome);
      }
  }
  public static void mostrar(ArrayList<String> a){
      for(int i=0; i < a.size(); i++){
          System.out.println(i+" - "+a.get(i));
       }
  }
  public static void main()
  {
    int cont = 0;
      do{
      Scanner key = new Scanner(System.in);
      System.out.println("Insira o nome da pessoa: ");
      String nome = key.next();
      System.out.println("Insira o peso da pessoa");
      float peso = key.nextFloat();
      System.out.println("Insira a altura da pessoa: ");
      float altura = key.nextFloat();
      float imc = peso/(altura * altura);
      classifica(nome, imc);
      cont++;
    }while(cont != 2);
    System.out.println("Baixo peso: ");
    mostrar(baixoPeso);
    System.out.println("Peso Normal: ");
    mostrar(pesoNormal);
    System.out.println("Pre obeso: ");
    mostrar(preObeso);
    System.out.println("Obeso 1: ");
    mostrar(obeso1);
    System.out.println("Obeso 2: ");
    mostrar(obeso2);
    System.out.println("Obeso 3: ");
    mostrar(obeso3);
  }
}
