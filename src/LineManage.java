import java.util.ArrayList;

public class LineManage {
    public static final String LINE_NOT_EXITS = "Line not exits";
    static ArrayList<Line> listLine = new ArrayList<>();

    public void addNewLine(Line line) {
        listLine.add(line);
    }

    public void showAll() {
        for (int i = 0; i < listLine.size(); i++) {
            System.out.println(listLine);
        }
    }

    public void findLineByBeginPoint(int pos_x, int pos_y) {
        boolean testLine = false;
        for (Line line : listLine) {
            Point beginPoint = line.getBeginPoint();
            Point endPoint = line.getEndPoint();
            boolean testBeginPoint = testPoint(beginPoint, pos_x, pos_y);
            boolean testEndPoint = testPoint(endPoint, pos_x, pos_y);
            testLine = testBeginPoint || testEndPoint;
            if (testLine) {
                System.out.println(line);
                continue;
            }
            return;
        }
        if (!testLine) {
            System.out.println(LINE_NOT_EXITS);
        }
    }

    public boolean testPoint(Point point, int pos_x, int pos_y) {
        boolean testPos_x = point.getPos_x() == pos_x;
        boolean testPos_y = point.getPos_y() == pos_y;
        boolean testBeginPoint = testPos_x && testPos_y;
        if (testBeginPoint) return true;
        return false;
    }
}
