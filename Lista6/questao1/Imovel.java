package questao1;

class Imovel{

    String endereco;
    double preco;

    Imovel(String end, double pre){
        endereco = end;
        preco = pre;
    }

    /** 
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }
/*
    public String toString(){
        return String.format("Endereço: %s\nPreço: %d", getEndereco(),getPreco());
    }*/
    public void mostraPreço(){
        System.out.println(preco);
    }
}