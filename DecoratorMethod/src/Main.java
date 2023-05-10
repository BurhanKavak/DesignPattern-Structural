public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Daire normal Border degerlerine sahip");
        circle.draw();


        System.out.println("\n Daire Kirmizi Border degerlerine sahip");
        circle.draw();

        System.out.println("\n Kare Kirmizi Border degerlerine sahip");
        circle.draw();


    }
}