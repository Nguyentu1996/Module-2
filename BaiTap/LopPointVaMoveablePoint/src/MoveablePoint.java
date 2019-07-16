public class MoveablePoint extends Point {
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x,float y ,float xSpeed,float ySpeed){
     super(x, y);
     this.xSpeed=xSpeed;
     this.ySpeed=ySpeed;
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
    public void setSpeed(){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[]array=new float[2];
        array[0]=xSpeed;
        array[2]=ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return super.toString()+" speed = ("+xSpeed+","+ySpeed+")";
    }
    public MoveablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
