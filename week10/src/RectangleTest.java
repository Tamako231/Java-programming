public class RectangleTest {

    public static void main(String[] args) {
        // 创建第一个矩形对象，宽度为4，高度为40
        Rectangle rectangle1 = new Rectangle(4, 40);

        // 创建第二个矩形对象，宽度为3.5，高度为35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // 显示第一个矩形的信息
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // 显示第二个矩形的信息
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}