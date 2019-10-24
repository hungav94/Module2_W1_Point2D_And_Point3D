public class Main {
    public static void listArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        Point3D point3D = new Point3D(1, 2, 3);

        System.out.println("getXY of Point2D: ");
        listArray(point2D.getXY());
        System.out.println("\ngetXYZ of Point3D: ");
        listArray(point3D.getXYZ());

        point2D.setXY(2, 3);
        System.out.println("\ngetXY of Point 2D: ");
        listArray(point2D.getXY());

        System.out.println("\n" + point3D.toString());
    }
}
