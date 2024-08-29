import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachVatPham danhSachVatPham = new DanhSachVatPham();
        while (true){
            System.out.println("-----\nChọn chức năng: ");
            System.out.println("1. Nhập thông tin vật phẩm");
            System.out.println("2. In thông tin vật phẩm");
            System.out.println("3. Vật phẩm tốn nhiều xu nhất");
            System.out.println("4. Spon có giải cứu thành công?");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            int choi = scanner.nextInt();
            if (choi == 5){
                System.out.println("Goodbye!");
                break;
            }else {
                switch (choi){
                    case 1: danhSachVatPham.nhapVatPham(); break;
                    case 2: danhSachVatPham.inVatPham(); break;
                    case 3: danhSachVatPham.vpDatNhat(); break;
                    case 4: danhSachVatPham.cau4(); break;
                }
            }
        }
    }
}