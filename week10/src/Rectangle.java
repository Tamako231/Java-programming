

public class Rectangle {
    // 定义两个double类型的字段width和height，默认值为1
    private double width = 1.0;
    private double height = 1.0;

    // 无参构造方法，创建默认的矩形
    public Rectangle() {}

    // 带参数的构造方法，允许指定宽度和高度
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 获取矩形的面积
    public double getArea() {
        return width * height;
    }

    // 获取矩形的周长
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }
}