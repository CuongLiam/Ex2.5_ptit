import java.util.Scanner;
// Hãy viết chương trình cho phép nhập vào các chuỗi, tính và xuất ra
// tổng chiều dài của các chuỗi có chứa ký tự in hoa.
// Nếu người dùng nhập vào chuỗi rỗng thì kết thúc chương trình.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLength = 0;

        System.out.println("Nhập chuỗi (nhập chuỗi rỗng để kết thúc):");

        while (true) {
            String str = scanner.nextLine();

            if (str.isEmpty()) {
                break; // end input when empty
            }

            boolean flag = false;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch >= 'A' && ch <= 'Z') {
                    flag = true;
                    break; // we found an uppercase, no need to check more
                }
            }

            if (flag) {
                totalLength += str.length();
            }
        }

        System.out.println(totalLength);
    }
}
