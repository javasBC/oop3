public class Point3D extends  MyPoint{
    //DATA
    // MyPoint => x,y
    private int z=0;

    //Func
    public  Point3D(){}

    public Point3D(MyPoint other,int z) {
        super(other.getX(), other.getY());
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z){
        this.z=z;
    }
    public int getZ(){
        return this.z;
    }

    public int[] getXYZ(){

        int[] c = {super.getX(),getY(),this.getZ()};
        return c;
    }

    public double distance(int x,int y,int z){
        return Math.sqrt(Math.pow((super.getX()-x),2)+Math.pow((super.getY()-y),2)+Math.pow((this.getZ()-z),2));
    }
    public double distance(Point3D other){
        return  this.distance(other.getX(),other.getY(), other.getZ());
    }

    @Override
    public double distance(){
        return this.distance(0,0,0);
    }








}
