public class Rectangle {
    double width;
    double height;
    //default constructor
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }
    //parameterized constructor
    public Rectangle (double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2.0*(width+height);
    }

}
