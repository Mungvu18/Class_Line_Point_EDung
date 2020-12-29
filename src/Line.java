public class Line {
    private Point beginPoint;
    private Point endPoint;

    public Line(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Line(int pos_x1, int pos_y1, int pos_x2, int pos_y2) {
        this.beginPoint.setPos_x(pos_x1);
        this.beginPoint.setPos_y(pos_y1);
        this.endPoint.setPos_x(pos_x2);
        this.endPoint.setPos_y(pos_y2);
    }

    public Point getBeginPoint() {
        return beginPoint;
    }


    public Point getEndPoint() {
        return endPoint;
    }


    public double getLength() {
        int pos_x = this.beginPoint.getPos_x();
        int pos_x1 = this.endPoint.getPos_x();
        int pos_y = this.beginPoint.getPos_y();
        int pos_y1 = this.endPoint.getPos_y();
        int brand_Pos_x = pos_x - pos_x1;
        int brand_Pos_y = pos_y - pos_y1;
        return Math.sqrt(Math.pow(brand_Pos_x, 2) + Math.pow(brand_Pos_y, 2));
    }

    @Override
    public String toString() {
        return "Line:" + "beginPoint={" + beginPoint + ", endPoint={" + endPoint +", length="+ getLength();
    }
}
