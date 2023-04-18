public class quest8 {
    public static void main(String[] args) {
        String texto []= new String[4];
        texto [0] ="eu quero jogar bola hoje";
        texto [1] ="eu nao quero jogar bola hoje";
        texto [2] ="eu desejo comer pao";
        texto [3] ="eu suponho que voce queira";

        for(int i = 0 ; i< texto.length;i++){
            if (texto[i].contains("jogar")){
                System.out.println(texto[i].concat(texto[i]));
            }
        }

    }
}

