public class Fan {
    int slow = 1;
    int medium=2;
    int fast=3;
    public int speed=slow;
    public boolean on;
    private double radius=5;
    private String color="blue";
    public Fan(){

    }
    public Fan(int speed,boolean on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean getOn(){
        return on;
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        Fan fan1 = new Fan(3,true,10,"yellow");
        System.out.println(fan1);


    }

    @Override
    public String toString() {
        if(on==true){
            return (" Speed: "+this.speed+"  color: " +this.color +" radius: "+this.radius + " fan is on");
        } else {
            return ("color: "+this.color+" radius: "+this.radius + " fan is off");
        }
    }
}
