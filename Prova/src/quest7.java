public class quest7 {
    public static void main(String[] args) {
        int matriz [][] = new int[2][2];

        matriz[0][0]= 0;
        matriz[0][1]= 1;
        matriz[1][0]= 2;
        matriz[1][1]= 3;

        int calcuo1 = matriz[0][0] + matriz[1][1];
        int calcuo2 = matriz[0][1] + matriz[1][0];

        int calculoFinal = calcuo1-calcuo2;
        System.out.println(calculoFinal);

    }
}
