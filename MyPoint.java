public class MyPoint {
    //DATA
    private int x=0;
    private int y=0;


    //func
    public MyPoint(){}

    public MyPoint(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y=y;
    }

    public void setX(int x) {
        this.x=x;
    }

    public int[] getXY(){
        int [] c={this.getX(),this.getY()};
        return c;
    }

    public double distance(int x,int y ){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }

    public double distance(MyPoint other){
        return  distance(other.getX(), other.getY());
    }

    public double distance(){
        return distance(0,0);
    }


}
