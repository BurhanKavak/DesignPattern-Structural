package example2;

public class CodeXAdapter implements Crypt{

    private CodeX codeX;

    public CodeXAdapter(CodeX codeX) {
        this.codeX = codeX;
    }
    @Override
    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codeX.codetoText(text);
    }
}
