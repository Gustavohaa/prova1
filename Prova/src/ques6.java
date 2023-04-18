public class ques6 {
    public static void main(String[] args) {
        String teste ="eu quero";
        char chars []= new char[teste.length()];

        for (int i = teste.length() - 1 ; i>=0; i--){
            chars[teste.length()-1 -i]= teste.charAt(i);

        }
        String novaString = new String(chars);
        System.out.println(novaString);
    }
}
