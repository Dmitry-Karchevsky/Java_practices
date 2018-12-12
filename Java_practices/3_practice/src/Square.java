public class Square extends Rectangle {
    public Square(){
        this.width = 0;
        this.length = this.width;
    }

    public Square(double side){
        this.width = side;
        this.length = this.width;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = this.width;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString(){
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}