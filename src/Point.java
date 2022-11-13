public class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    private final float[] arr = new float[0];

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        arr[0] = x;
        arr[1] = y;
    }

    public float[] getXY() {
        return arr;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
