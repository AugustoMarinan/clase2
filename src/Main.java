public class Main {
    public static void main(String[] args) {
//parte 1
        String texto1 = "Hola buenos dias, como estas?";
        char letra = 'o';
        int vecesLetra = 0;

        for (int i=0; i<texto1.length();i++)

            if (texto1.charAt(i)== letra) {
                vecesLetra++;
            }
        System.out.println(vecesLetra);
//parte 2

        int numeros[] = new int[]{9, 14, 25};



//parte 3

            int numeros2[] = new int[] {5,7,9,12,15};
            int numX = 8;
            int suma = 0;

            for (int i=0; i<numeros2.length; i++) {

            if (numeros2[i]>numX) {
                suma+= numeros2[i] ;
            }
        }
        System.out.println(suma);

            //parte 4

            String fraseMover = "ahola que tal";
            int desplazamiento = 2;

            for (int i = 0; i < fraseMover.length(); i++) {
                char caracter = fraseMover.charAt(i);
        }
        System.out.println(fraseMover);

        }
    }



