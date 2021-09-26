package Entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private int luong, soGioDayToiThieu;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String ten, String email, String diaChi, String dienThoai, int soGioDay, int luong, int soGioDayToiThieu) {
        super(ten, email, diaChi, dienThoai, soGioDay);
        this.luong = luong;
        this.soGioDayToiThieu = soGioDayToiThieu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVienCoHuu{");
        sb.append("Tên: ").append(ten).append('\'');
        sb.append(", email: ").append(email).append('\'');
        sb.append(", địa chỉ: ").append(diaChi).append('\'');
        sb.append(", điện thoại: ").append(dienThoai).append('\'');
        sb.append(", lương: ").append(luong).append('\'');
        sb.append(", số giờ dạy tối thiểu: ").append(soGioDayToiThieu).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("- Lương thỏa thuận: ");
        this.luong = Integer.parseInt(sc.nextLine());

        System.out.print("- Số giờ dạy tối thiểu: ");
        this.soGioDayToiThieu= Integer.parseInt(sc.nextLine());

    }

}
