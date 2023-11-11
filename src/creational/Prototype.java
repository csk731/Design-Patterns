package creational;

class Shape {
    String name;
    private int vertices;
    int edges;
    public Shape(){

    }
    public Shape(String name, int edges){
        this.name=name;
        this.edges=this.vertices=edges;
    }
    public Shape(Shape s){
        this.name=s.name;
        this.edges=s.edges;
        this.vertices=s.vertices;
    }
    public Shape clone(){
        return new Shape(this);
    }
}

class NewShape extends Shape{
    String fillingColor;
    String shadowColor;
    public NewShape(){

    }
    public NewShape(NewShape ns){
        super(ns);
        this.shadowColor=ns.shadowColor;
        this.fillingColor=ns.fillingColor;
    }
    public NewShape(String fillingColor, String shadowColor, String name, int edges){
        super(name,edges);
        this.fillingColor=fillingColor;
        this.shadowColor=shadowColor;
    }
    public NewShape clone(){
        return new NewShape(this);
    }

}
public class Prototype {
    public static void main(String[] args) {
        Shape s1=new Shape("Square",4);
        NewShape s2=new NewShape("Gray","Gray","Tri",3);
        Shape s3=new NewShape("Red","Red","Penta",5);

        Shape s1Copy=s1.clone();
        NewShape s2Copy=s2.clone();
        Shape s3Copy=s3.clone();

    }
}
