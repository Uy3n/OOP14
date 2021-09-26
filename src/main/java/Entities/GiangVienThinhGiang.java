package Entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuan;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String ten, String email, String diaChi, String dienThoai, int soGioDay, String coQuan) {
        super(ten, email, diaChi, dienThoai, soGioDay);
        this.coQuan = coQuan;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVienThinhGiang{");

        sb.append("Tên: ").append(ten).append('\'');
        sb.append(", email: ").append(email).append('\'');
        sb.append(", địa chỉ: ").append(diaChi).append('\'');
        sb.append(", điện thoại: ").append(dienThoai).append('\'');
        sb.append(", cơ quan: ").append(coQuan).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("- Cơ quan: ");
        this.coQuan = sc.nextLine();
    }
}