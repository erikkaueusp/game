package teste;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int i1 = i / 0;
            } catch (Exception e) {
                System.out.println("Peguei a bomba!");
            }
        }
        System.out.println("Fim do metodo2");
    }
}
