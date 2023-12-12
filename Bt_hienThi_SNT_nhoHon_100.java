import javax.sound.midi.Soundbank;

public class Bt_hienThi_SNT_nhoHon_100 {
    public static void main(String[] args) {
        int count = 0;
        int stt = 1;

        System.out.println("Danh sách các số nguyên tố nhỏ hơn 100:\n");
        for(int SNT = 2; SNT <100; SNT++){
            count = 0;
            for(int i = 1; i <= SNT; i++){
                if(SNT%i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.printf("Số nguyên tố thứ %d là: %d\n%n",stt,SNT);
                stt++;
            }
        }
    }
}
