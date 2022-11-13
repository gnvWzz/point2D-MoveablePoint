public class testMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint point2 = new MoveablePoint();
        System.out.println(point2);
        point2 = new MoveablePoint(2.0f,3.0f,1.0f,3.0f);
        System.out.println(point2);
        point2.move();
        System.out.println(point2);
    }
}
