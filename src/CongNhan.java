import java.time.LocalDate;

public class CongNhan extends CanBo {
    private int Bac;

    CongNhan() {

    }

    public CongNhan(int bac) {
        Bac = bac;
    }

    public CongNhan(int id, String name, String gender, LocalDate birthDay, String adress, int bac) {
        super(id, name, gender, birthDay, adress);
        Bac = bac;
    }


    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan " +
                super.toString() + " Bac=" + Bac;
    }
}
