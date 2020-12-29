public class Point {
    private int pos_x;
    private  int pos_y;
    // tạo hàm khởi tạo hai tham số pos_x và pos_y

    public Point(int pos_x, int pos_y) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    // phương thức get/set cho pos_x và pos_y;

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
    // ghi đè toString của lớp Object

    @Override
    public String toString() {
        return "Line{" +
                "pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
