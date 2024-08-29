import java.util.*;

public class DanhSachVatPham {
    List<VatPham> dsVatPham;
    public DanhSachVatPham() {
        dsVatPham = new ArrayList<VatPham>();
        dsVatPham.add(new BuaThan());
        dsVatPham.add(new BaoTay());
        dsVatPham.add(new HonDa());
        dsVatPham.add(new Riu());
        dsVatPham.add(new Gay());
    }
    public void nhapVatPham() {
        System.out.println("Mời bạn nhập các vật phẩm (5 vật phẩm) mà Spon cần thu hoạch.");
        for (VatPham vp : dsVatPham) {
            System.out.println("----------\nVật phẩm: " + vp.getTenVp());
            vp.nhap();
        }
    }
    public void inVatPham() {
        for(VatPham vp : dsVatPham){
            System.out.println("----------");
            System.out.println(vp.xuat());
        }
    }
    public void vpDatNhat() {
        Optional<VatPham> vatPhamDatNhat = dsVatPham.stream()
                .max(Comparator.comparing(VatPham::VangQuiDoi));
        System.out.println("----------\nVật phẩm tốn nhiều xu nhất để mua là: ");
        System.out.println(vatPhamDatNhat.get().xuat());
    }
    public void cau4(){
        System.out.println("Nhập vào số xu vàng mà spon thu được: ");
        Scanner sc = new Scanner(System.in);
        int xuvang = sc.nextInt();
        int tongXuCan = dsVatPham.stream().mapToInt(VatPham::VangQuiDoi).reduce(0, Integer::sum);
        if(xuvang >= tongXuCan){
            System.out.print("Yeah! Spon có thể giải cứu đồng đội mình!");
            if(xuvang > tongXuCan){
                System.out.println("Spon dư " + (xuvang-tongXuCan) + " xu nữa!");
            }
        } else{
            System.out.println("Oops! Spon chưa thể giải cứu đồng đội mình!");
            System.out.println("Spon cần thu thập thêmm " + (tongXuCan-xuvang) + " xu nữa!");
        }
    }
}
