public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Circle Cizimi[ renk: yesil, yaricap: " + radius + ",x: " + x + ",y: " + y);
    }
}
