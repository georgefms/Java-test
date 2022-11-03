package Exemplo1;

class Main{
    public static void main(String[] args) 
    {
        Retangulo r = new Retangulo();
        Triangulo t = new Triangulo();
        Circulo c = new Circulo();

        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = r;
        formas[1] = t;
        formas[2] = c;

        System.out.println(formas[1]);
        for(int i = 0; i < formas.length; i++ )
        {
            System.out.print(formas[i].calcA());
        }
    }
}