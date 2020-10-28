import java.util.ArrayList;
import java.util.List;

public class Method {
    List<CanBo> canBos = new ArrayList<>();

    public void Add(CanBo canBoAdd) {
        canBos.add(canBoAdd);
    }

    public void update(CanBo canBoUpdate) {
        for (CanBo canBo : canBos) {
            if (canBo.getId() == canBoUpdate.getId()) {
                canBo = canBoUpdate;
            }
        }
    }

    public void delete(int id) {
        for (CanBo canBo : canBos) {
            if (canBo.getId() == id) {
                canBos.remove(canBo);
            }
        }
    }

    public void read() {
        for (CanBo canBo : canBos) {
            if (canBo instanceof CongNhan) {
                CongNhan congNhan = (CongNhan) canBo;
                System.out.println(congNhan.toString());
            } else if (canBo instanceof KySu) {
                KySu kySu = (KySu) canBo;
                System.out.println(kySu.toString());
            } else if (canBo instanceof NhanVien) {
                NhanVien nhanVien = (NhanVien) canBo;
                System.out.println(nhanVien.toString());
            }
        }
    }

    public void find(String canboFind) {
        for (CanBo canBo : canBos) {
            if (canBo.getName().equals(canboFind)) {
                System.out.println(canBo.toString());
            }
        }
    }


}
