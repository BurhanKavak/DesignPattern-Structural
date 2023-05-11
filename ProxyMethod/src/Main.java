public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // Görüntü Diskten yüklenir
        image.display();
        System.out.println("");

        // Görüntü diskten yüklenmeyecek
        image.display();
    }
}