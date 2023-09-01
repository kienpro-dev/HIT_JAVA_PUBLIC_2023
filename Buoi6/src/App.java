import java.util.ArrayList;

public class App {
        public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        // Thêm phần tử vào dãy: add và addAll
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(5);
        // array1: 1, 2, 3, 5

        array1.add(1, 4); // add theo chỉ số (index)
        // array1: 1, 4, 2, 3, 5

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(5);
        array2.add(6);
        // array2: 5, 6

        array1.addAll(array2); // add ArrayList vào ArrayList khác
        // array1: 1, 4, 2, 3, 5, 5, 6

        // Kiểm tra phẩn tử có trong dãy hay không (true hoặc false): contains
        boolean checkNumber = array1.contains(5); // => true

        // Phương thức array1.retainAll(array2): xóa những phần tử không thuộc
        // array2 khỏi array1
        // array1: 1, 4, 2, 3, 5, 5, 6
        // array2: 5, 6
        array1.retainAll(array2);
        // array1: 5, 5, 6
        // array2: 5, 6

        // Phương thức array1.removeAll(array2): ngược lại, xóa những phần tử
        // thuộc array2 khỏi array1
        array1.removeAll(array2);
        // array1: (NOTHING)
        // array2: 5, 6

        // Phương thức lấy vị trí của phần tử dãy
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(1);
        array3.add(2);
        array3.add(3);
        array3.add(1);
        array3.add(4);

        int idx1 = array3.indexOf(1);
        int idx2 = array3.lastIndexOf(1);
        int idx3 = array3.indexOf(5);

        // Các phương thức thông dụng khác để truy xuất đến phần tử trong dãy
        for(int i = 0 ; i < array3.size() ; i++){
            array3.set(i, 100);
            System.out.print(array3.get(i) + " ");
        }

    }
}
