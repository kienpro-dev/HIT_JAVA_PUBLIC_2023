package CodeMau;

public class Oto {
    //Thuộc tính của lớp Ô tô
    // private: chỉ được phép truy xuất ngay bên trong lớp đó
    private String ten;
    private int namSanXuat;

    // Phương thức của lớp ô tô
    // public: có thể được truy xuất ở bất kì đâu
    public void diChuyen() {
        System.out.println("Ô tô đang di chuyển");
    }

    public void dungLai() {
        System.out.println("Ô tô dừng lại");
    }

    public void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Nam san xuat: " + namSanXuat);
    }

    // Getter setters
    // get + ten thuoc tinh
    public String getTen() {
        return ten;
    }

    // set + ten thuoc tinh
    public void setTen(String ten2) {
        ten = ten2;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int nam2) {
        namSanXuat = nam2;
    }

    // Math.PI
    public Oto() {

    }

    public Oto(String ten2, int nam2) {
        ten = ten2;
        namSanXuat = nam2;
    }
}
