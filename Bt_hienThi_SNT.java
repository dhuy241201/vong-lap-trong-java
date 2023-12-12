public class Bt_hienThi_SNT {
    public static void main(String[] args) {
        int count = 0;
        int amount = 0;
        for (int SNT = 2; amount <= 20; SNT++) {
            count = 0;
            for (int i = 1; i <= SNT; i++) {
                if (SNT % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Số nguyên tố thứ "+ amount+ " là: " + SNT);
                amount++;
            }
        }
    }
}