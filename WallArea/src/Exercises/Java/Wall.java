package Exercises.Java;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }

    public Wall (double _w, double _h){
        this.width = (_w > 0.0d) ? _w : 0.0d;
        this.height = (_h > 0.0d) ? _h : 0.0d;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = (height > 0.0d) ? height : 0.0d;
    }

    public void setWidth(double width) {
        this.width = (width > 0.0d) ? width : 0.0d;
    }
    public double getArea(){
        return width * height;
    }
}
