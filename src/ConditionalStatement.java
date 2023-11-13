public class ConditionalStatement {
    public static void main(String[] args) {
        int Plat_Nomor_Digit_1 = 8;
        int Plat_Nomor_Digit_2 = 5;
        int Plat_Nomor_Digit_3 = 7;
        int Plat_Nomor_Digit_4 = 2;
            if (Plat_Nomor_Digit_1 + Plat_Nomor_Digit_2 + Plat_Nomor_Digit_3 + Plat_Nomor_Digit_4 %2 == 0) {
                System.out.println("Plat Nomor Valid");
        }else {
                System.out.println("Plat Nomor Invalid");
        }
    }
}
