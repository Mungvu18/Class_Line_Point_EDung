
import java.util.Scanner;

public class MainTest {
    static LineManage lineManage = new LineManage();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Thêm đoạn thẳng");
            System.out.println("2.Hiển thị toàn bộ các đoạn thẳng");
            System.out.println("3. Tìm kiếm và hiển thị đoạn thẳng qua đoạn điểm");
            System.out.println("0.Thoát chương trình");
            System.out.println("Nhập biến lựa trọn choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng đoạn thẳng bạn muốn thêm");
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        addLine();
                    }
                    break;
                case 2:
                    lineManage.showAll();
                case 3:
                    findAndShowLineByPoint();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (choice != 0);

    }

    private static void findAndShowLineByPoint() {
        System.out.println("Mời bạn nhập tọa độ x của điểm bạn muốn tìm");
        int pos_x = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tọa độ y của điểm bạn muốn tìm");
        int pos_y = Integer.parseInt(sc.nextLine());
        lineManage.findLineByBeginPoint(pos_x,pos_y);
    }

    private static void addLine() {
        System.out.println("Mời bạn nhập tọa đọ x của điểm đầu");
        int pos_x_beginPoint = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tọa độ y của điểm đầu");
        int pos_y_beginPoint = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tọa độ x của điểm cuối");
        int pos_x_endPoint = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tọa độ y của điểm cuối");
        int pos_y_endPoint = Integer.parseInt(sc.nextLine());
        Point endPoint = new Point(pos_x_endPoint, pos_y_endPoint);
        Point beginPoint = new Point(pos_x_beginPoint, pos_y_beginPoint);
        Line line = new Line(beginPoint, endPoint);
        lineManage.addNewLine(line);
        System.out.println("-----------------------------------------");
    }
}
