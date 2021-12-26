public class IniciandoArray {

    public static void main(String[] args) {

        //Array só com o tamanho do Array
        int[] meuArray = new int[7];

        System.out.println(meuArray[0]);

        //Array com parâmetro
        int[] meuArray2 = {2, 4, 6, 8, 10, 12, 14};

        System.out.println(meuArray2);

        //Alterando um valor no Array
        meuArray2[3]= 16;

        System.out.println(meuArray2[3]);

        //Lendo o tamanho de um Array
        System.out.println(meuArray2.length);

        //Percorrendo um Array
        for(int i = 0; i < meuArray2.length; i++) {
            System.out.print(meuArray2[i] + " ");
        }
        System.out.println("");

        //Array Multidimensional
        int[][] meuArray3 = {{1,2,3,4}, {5,6,7,8}};
        for(int i = 0; i < meuArray3.length; i++) {
            for(int j = 0; j < meuArray3[i].length; j++) {
                System.out.println(meuArray3[i][j]);
            }
        }


    }
}
