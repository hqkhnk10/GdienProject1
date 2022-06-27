package Tuan33;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    List<ThiSinh> ThiSinhs;

    public TuyenSinh() {
        this.ThiSinhs = new ArrayList<>();
    }

    public void add(ThiSinh ThiSinh) {
        this.ThiSinhs.add(ThiSinh);
    }

    public void showInfor() {
        this.ThiSinhs.forEach(ThiSinh -> System.out.println(ThiSinh.toString()));
    }

    public ThiSinh searchById(String id) {
        return this.ThiSinhs.stream().filter(ThiSinh -> ThiSinh.getId().equals(id)).findFirst().orElse(null);
    }

}