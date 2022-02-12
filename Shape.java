public class Shape extends Object {
    //DATA
    private double area;

    //Func

    //Ctor
    public Shape(){ }

    public Shape(double area){
        setArea(area);
    }

    public Shape(Shape other){
        setArea(other.getArea());// we can reach all the attributes including the private ones
    }

    //Getter
    public double getArea(){
        return this.area;
    }

    //SETTER
    public void setArea(double area){
        this.area=area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}
