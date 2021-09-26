import Entities.GiangVien;
import Entities.GiangVienCoHuu;
import Entities.GiangVienThinhGiang;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Số giảng viên: ");
         int n = Integer.parseInt(sc.nextLine());

         GiangVien[] list = new GiangVien[n];
         for (int i = 0; i < n; i++) {
           System.out.format("Giảng viên thứ %d\n", i + 1);
           System.out.print("- Loại giảng viên (0. Cơ hữu / 1. Thỉnh giảng): ");
           int type = Integer.parseInt(sc.nextLine());

           if (type == 0) {
             list[i] = new GiangVienCoHuu();
           } else {
             list[i] = new GiangVienThinhGiang();
           }

           list[i].fromConsole(sc);
         }

//         In danh sách GiangVien
        for (GiangVien gv : list) {
            System.out.println(gv);
        }

//         In danh sách GiangVienCoHuu
        for(GiangVien gv : list) {
            if (gv instanceof GiangVienCoHuu) {
                System.out.println(gv);
            }
        }

//         In danh sách GiangVienThinhGiang
        for(GiangVien gv : list) {
            if (gv instanceof GiangVienThinhGiang) {
                System.out.println(gv);
            }
        }

    }
}
