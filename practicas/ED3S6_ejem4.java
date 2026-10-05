
package ed3s6_ejem4;

public class ED3S6_ejem4 {

    public static void main(String[] args) {
        int[] entero = new int[]{1, 2, 3, 4, 5};
        entero[0] = 1;
        entero[1] = 2;
        entero[2] = 3;
        entero[3] = 4;
        entero[4] = 5;

        int[] entero1 = new int[]{1, 2, 3, 4, 5};
        System.out.println("el valor en la ultima posicion es" + entero[4]);

        String[] cadena = new String[]{"uno, dos, tres, cuatro, cinco"};

        for (String vcadena : cadena)
            System.out.println("valor " + vcadena);

        int[][] entero2 = new int[2][2];

        entero2[0][0] = 0;
        entero2[0][1] = 0;
        entero2[1][0] = 0;
        entero2[1][1] = 0;

        System.out.println("el valor en la posicion 1,1 es" + entero2[1][1]);

        int[][] entero3 = new int[][]{{00, 01}, {10, 11}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("el valor de posicion[" + i + "," + j + "] es " + entero3[i][j]);

        for (int i = 0; i < 2; i++)
            for (int valor1 : entero3[i])
                System.out.println("valor del arreglo " + valor1);

    }

}