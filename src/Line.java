public class Line {
    private  Point beginPoint; // thuộc tính điểm bắt đầu begin thuộc kiểu của lớp Point
    private Point endPoint;
    // tạo hàm khởi tạo có hai tham số là điểm bắt đầu beginPoint và điêm kết thúc endPoint

    public Line(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Line(int pos_x1, int pos_y1, int pos_x2, int pos_y2){
        this.beginPoint.setPos_x(pos_x1);
        this.beginPoint.setPos_y(pos_y1);
        this.endPoint.setPos_x(pos_x2);
        this.endPoint.setPos_y(pos_y2);
    }
    // tạo hàm set/get của 2 điểm beginPoint và endPoint
    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    // phương thức lấy chiều dài của đoạn thẳng
    // công thức tính chiều dài của 1 đoạn thẳng là sqrt((x1-x2)^2+(y1-y2)^2) trong đó (x1,y1) tọa độ điểm đầu (x2,y2) tọa độ điểm cuối
    public double getLength(){
        int pos_x = this.beginPoint.getPos_x();
        int pos_x1 = this.endPoint.getPos_x();
        int pos_y = this.beginPoint.getPos_y();
        int pos_y1 = this.endPoint.getPos_y();
        return Math.sqrt(Math.pow((pos_x - pos_x1),2)+Math.pow((pos_y - pos_y1),2));
    }
}
