public class ClassPoint2D {
    float x = 0.0f;
    float y = 0.0f;
    public ClassPoint2D(){

    }
    public ClassPoint2D(float x , float y){
     this.x=x;
     this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x , float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(float x , float y){
        float[] array=new  float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "( "+x+","+y+")";
    }
}
