package questao1;


public class Velho extends Imovel{

    Velho(String end, double pre){
        super(end, pre);
        this.preco *= 0.50;
    }


}