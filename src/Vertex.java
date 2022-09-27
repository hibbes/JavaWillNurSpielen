public class Vertex {
    
    public double x;
    public double y;

    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }
     
    public String toString() {
        return "("+x+","+y+")";
    }

    public double length(){
        return Math.sqrt(x*x+y*y);
    }

}


