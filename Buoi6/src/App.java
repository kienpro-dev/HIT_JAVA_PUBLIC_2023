import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(1);
        array3.add(2);
        array3.add(3);
        array3.add(1);
        array3.add(4);

        int idx1 = array3.indexOf(1);
        int idx2 = array3.lastIndexOf(1);
        int idx3 = array3.indexOf(5);

        for(int i = 0 ; i < array3.size() ; i++){
            array3.set(i, 100);
            System.out.print(array3.get(i) + " ");
        }

    }
}
