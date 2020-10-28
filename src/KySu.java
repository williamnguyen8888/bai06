import java.time.LocalDate;

public class KySu extends CanBo {
    private String NganhDaoTao;

    KySu(){

    }
    public KySu(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    public KySu(int id, String name, String gender, LocalDate birthDay, String adress, String nganhDaoTao) {
        super(id, name, gender, birthDay, adress);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu " + super.toString()+
                " NganhDaoTao='" + NganhDaoTao + '\'' ;
    }
}
