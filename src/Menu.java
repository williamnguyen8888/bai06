import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public CongNhan addCongNhan(){
        CongNhan congNhan = new CongNhan();
        System.out.println("Mời bạn nhập id công nhân");
        congNhan.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập họ tên công nhân");
        congNhan.setName(scanner.nextLine());
        System.out.println("Mời bạn nhập giới tính của công nhân " + congNhan.getName());
        congNhan.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập ngày tháng năm sinh của công nhân "+congNhan.getName());
        String birthDay = scanner.nextLine();
        LocalDate date = LocalDate.parse(birthDay);
        congNhan.setBirthDay(date);
        System.out.println("Mời bạn nhập địa chỉ của công nhân "+congNhan.getName());
        congNhan.setAdress(scanner.nextLine());
        System.out.println("MỜi bạn nhập bậc của công nhân từ 1-7");
        congNhan.setBac(Integer.parseInt(scanner.nextLine()));
        return congNhan;
    }
    public KySu addKySu(){
        KySu kySu = new KySu();
        System.out.println("mời bạn nhập id của kỹ sư");
        kySu.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập họ tên kỹ sư");
        kySu.setName(scanner.nextLine());
        System.out.println("Mời bạn nhập giới tính của kỹ sư " + kySu.getName());
        kySu.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập ngày tháng năm sinh của kỹ sư "+kySu.getName());
        String birthDay = scanner.nextLine();
        LocalDate date = LocalDate.parse(birthDay);
        kySu.setBirthDay(date);
        System.out.println("Mời bạn nhập địa chỉ của kỹ sư "+kySu.getName());
        kySu.setAdress(scanner.nextLine());
        System.out.println("Mời bạn nhập ngành đào tạo của của kỹ sư "+kySu.getName());
        kySu.setNganhDaoTao(scanner.nextLine());
        return kySu;
    }
    public  NhanVien addNhanVien(){
        NhanVien nhanVien = new NhanVien();
        System.out.println("Mời bạn nhập id của nhân viên");
        nhanVien.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập họ tên nhân viên");
        nhanVien.setName(scanner.nextLine());
        System.out.println("Mời bạn nhập giới tính của nhân viên " + nhanVien.getName());
        nhanVien.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập ngày tháng năm sinh của nhân viên "+nhanVien.getName());
        String birthDay = scanner.nextLine();
        LocalDate date = LocalDate.parse(birthDay);
        nhanVien.setBirthDay(date);
        System.out.println("Mời bạn nhập địa chỉ của nhân viên "+nhanVien.getName());
        nhanVien.setAdress(scanner.nextLine());
        System.out.println("Mời bạn nhập công việc của của nhân viên "+nhanVien.getName());
        nhanVien.setCongViec(scanner.nextLine());
        return nhanVien;
    }
}
