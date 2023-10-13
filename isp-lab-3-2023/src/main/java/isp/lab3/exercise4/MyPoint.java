package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z)
    {this.x=x;
        this.y=y;
        this.z=z;

    }

    public double distance(int x, int y,int z)
    {int dx,dy,dz;
    dx=this.x-x;
    dy=this.y-y;
    dz=this.z-z;
    return Math.sqrt(dx*dx+dy*dy+dz*dz);}

    public double distance(MyPoint AnotherPoint)
    {
        return distance(AnotherPoint.getX(), AnotherPoint.getY(), AnotherPoint.getZ() );
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
    public static void main(String[] args)
    { MyPoint point1= new MyPoint(3,2,6);
        MyPoint point2=new MyPoint(-4,4,3);
        System.out.println("Point 1:"+point1.toString());
        System.out.println("Point 2:"+point2.toString());
        double distance1=point1.distance(10,11,5);
        double distance2=point1.distance(point2);
        System.out.println("Distance between first point and (10,11,5) is:"+distance1);
        System.out.println("Distance between the points is:"+distance2);
    }
}
