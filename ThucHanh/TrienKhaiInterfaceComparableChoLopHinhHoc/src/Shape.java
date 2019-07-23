public class Shape {
    public String color;
    public boolean filled=false;
    public Shape(){

    }
    public Shape(String color , boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "a shape have color"+getColor() +" filled:"+isFilled();
    }
}
