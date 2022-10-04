public class Test {

    public static void main(String args[]) {

        Vertex v1 = new Vertex(34, 2);

        SimpleTriangle dreieck = new SimpleTriangle(v1, 100);
        System.out.println(dreieck);
        System.out.println(dreieck.area());

    }
}
