import java.time.LocalDate;

public class NhanVien extends CanBo {
    private String CongViec;

    NhanVien() {

    }

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public NhanVien(int id, String name, String gender, LocalDate birthDay, String adress, String congViec) {
        super(id, name, gender, birthDay, adress);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien " +
                 super.toString()+" CongViec='" + CongViec + '\'';
    }
}
