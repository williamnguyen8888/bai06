import java.time.LocalDate;

public class CanBo {
    private int Id;
    private String name;
    private String gender;
    private LocalDate birthDay;
    private String adress;

    public CanBo() {
    }


    public CanBo(int id, String name, String gender, LocalDate birthDay, String adress) {
        Id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.adress = adress;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public CanBo(String name, String gender, LocalDate birthDay, String adress) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getAdress() {
        return adress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", adress='" + adress + '\''
                ;
    }
}
