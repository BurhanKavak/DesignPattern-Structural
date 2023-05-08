package example2;

public class Main {
    public static void main(String[] args) {

        Crypt crypt = new CryptA();


        crypt.encrypt("Burhan");
        crypt.decrypt("Kavak");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("Busenur");
        crypt.decrypt("Yilmaz");

        System.out.println("-------------");


        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Yenes");
        crypt.decrypt("Raso");
    }
}
