public class MoveablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    private final float[] arrSpeed = new float[2];

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        arrSpeed[0] = getxSpeed();
        arrSpeed[1] = getySpeed();
    }

    public float[] getSpeed() {
        return arrSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + "(" + getxSpeed() + "," + getySpeed() + ")";
    }

    public MoveablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }
}
