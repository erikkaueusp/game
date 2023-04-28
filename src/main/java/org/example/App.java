package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mago mago = new Mago();
        Padre padre = new Padre();

        mago.getMagia();

        testaMetodo(mago);
    }

    public static void testaMetodo(Vilao personagem) {
        personagem.roubaXp();
        System.out.println("é um vilão");
    }

}
