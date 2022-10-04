public class Test {

    public static void main(String args[]) {

        Vertex v1 = new Vertex(34, 2);
        Vertex v2 = new Vertex(42, 0);
        Vertex v4 = new Vertex(34, 2);
        Vertex vv = new Vertex(0, 0);

        System.out.println(v1);
        System.out.println(v2.toString());
        System.out.println("v1.x = " + v1.x);

        System.out.println(v1.length());
        v1.skalarMod(2);
        System.out.println(v1);
        Vertex v3 = v1.add(v2);
        System.out.println(v3);
        v1.skalarMod(0.5);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v4));

    }
}
