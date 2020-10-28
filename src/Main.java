import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        CanBo canBo = new CanBo();
        do {
            System.out.println("1.Thêm công nhân mới");
            System.out.println("2.Thêm kỹ sư mới");
            System.out.println("3.Thêm nhân viên mới");
            System.out.println("4.Sửa thông tin nhân viên theo id");
            System.out.println("5.xóa nhân viên");
            System.out.println("6.tìm kiếm nhân viên");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CongNhan congNhan = menu.addCongNhan();
                    method.Add(congNhan);
                    method.read();
                    break;
                case 2:
                    KySu kySu = menu.addKySu();
                    method.Add(kySu);
                    method.read();
                    break;
                case 3:
                    NhanVien nhanVien = menu.addNhanVien();
                    method.Add(nhanVien);
                    method.read();
                    break;
                case 6:
                    System.out.println("mời bạn nhập tên cán bộ cần tìm kiếm");
                    String find = scanner.nextLine();
                    method.find(find);

            }
        } while (true);
    }
}
