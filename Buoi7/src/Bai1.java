import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                int n = s.charAt(i) - 48;
                boolean check = true;
                if(i > 0 && s.charAt(i - 1) == '-') {
                    check = false;
                }
                int j = i + 1;
                while(j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
//                    n = n * 10;
//                    n = n + (s.charAt(j) - 48);
                    n *= 10 + (s.charAt(j) - 48);
                    j++;
                    i++;
                }
                if(check == false) {
                    n *= -1;
                }
                res += n;
            }
        }
        System.out.println(res);
    }
}
