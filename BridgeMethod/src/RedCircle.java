public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Circle Cizimi[ renk: kirmizi, yaricap: " + radius + ",x: " + x + ",y: " + y);
    }
}
