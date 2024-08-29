import java.util.Scanner;

public class VatPham {
    protected String tenVp;
    protected int chiSoSucManh;
    protected float heSoSucManh;
    protected int heSoVangQuiDoi;

    public VatPham() {
    }

    public VatPham(String tenVp, int chiSoSucManh, float heSoSucManh, int heSoVangQuiDoi) {
        this.tenVp = tenVp;
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
        this.heSoVangQuiDoi = heSoVangQuiDoi;
    }

    public String getTenVp() {
        return tenVp;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chỉ số sức mạnh: ");
        chiSoSucManh = sc.nextInt();
        System.out.print("Hệ số sức mạnh: ");
        sc.nextLine();
        heSoSucManh = Float.parseFloat(sc.nextLine());
        System.out.print("Số vàng quy đổi trên 1 sức công phá: ");
        heSoVangQuiDoi = sc.nextInt();
    }

    public String xuat(){
        return "Tên Vật phẩm: " + tenVp +
                "\nChỉ số sức mạnh: " + chiSoSucManh
                + "   Hệ số sức manh: " + heSoSucManh
                + "\nSỨC CÔNG PHÁ: " + sucCongPha()
                + "\nVàng qui đổi/sức công phá: " + heSoVangQuiDoi + " xu"
                + "\nSố vàng để mua: " + VangQuiDoi() + " xu";
    }

    public float sucCongPha(){
        return chiSoSucManh*heSoSucManh;
    }
    public int  VangQuiDoi(){
        return (int) (heSoVangQuiDoi*sucCongPha());
    }
}
