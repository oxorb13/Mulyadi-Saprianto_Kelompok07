import java.util.Scanner;
import method.method_return;
/*  Kelompok    : 7
    Shift       : 1
    Nama/NIM    :
        -Shodiqul Faris / 21120121130052
        -Rafly an nindra / 21120121120002
        -Mulyadi Saprianto / 21120121140098
        -Ferdinand Rockwell Sebastian Sinaga / 21120121140111
 */

public class pasar_games {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String username , password;
        int s = 2000000;
        System.out.println("selamat datang di pasar games");
        System.out.println("silahkan login terlebih dahulu");
        boolean cekKondisi = false;
        while (!cekKondisi){
            System.out.print("username : ");                                // usernamenya jhony_ceria
            username = x.nextLine();
            System.out.print("password : ");                                // passwordnya 123456
            password = x.nextLine();
            if (username.equals("jhony_ceria") && password.equals("123456")){
                System.out.println("halo selamat datang jhony_ceria");
                System.out.println("saldo anda saat ini : " + s);
                System.out.println("silahkan pilih game");
                System.out.println("1. genshin impact");
                System.out.println("2. apex legend mobile");
                scase1(x);
                cekKondisi = true;
            }
            else {
                System.out.println("username atau password salah");
                System.out.println("mohon ulangi");
            }
        }
    }
    
    public static void scase1 (Scanner x){
        System.out.print("pilih nomor : ");
        int p = x.nextInt();
        switch (p){
            case (1):
                System.out.println("PAIMON");
                System.out.println("halo traveler apa yang ingin kamu lakukan hari ini ?");
                menu1();
                scase1a(x);
                break;
            case (2):
                System.out.println("halo player, pasar game masih tahap beta");
                System.out.println("disini hanya ada top up");
                LtopupALM();
                scase2(x);
        }
    }
    
    public static void scase1a(Scanner x){
        int j = x.nextInt();
        switch (j){
            case (1):
                System.out.println("silahkan liat akun yang kamu inginkan");
                jAkun1();
                Scase1b(x);
                break;
            case (2):
                System.out.print("silahkan masukkan UID anda : ");
                String s = x.nextLine();
                String v = x.nextLine();
                System.out.println("silahkan pilih menu yang kamu inginkan");
                Ltopupgi();
                Scase1c(x);
                break;
        }
    }
    
    public static void Scase1b(Scanner x){
        method_return objek = new method_return();
        boolean cekKondisi = false;
        while (!cekKondisi){
            System.out.print("pilih nomor : ");
            int i = x.nextInt();
            switch (i) {
                case (1):
                    System.out.println("maaf saldo anda tidak mencukupi");
                    cekKondisi = true;
                    break;
                case (2):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int v = x.nextInt();
                    switch (v){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.pajak3r();
                            double total = 1000000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (3):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int t = x.nextInt();
                    switch (t){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.pajak3r();
                            double total = 600000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (4):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int o = x.nextInt();
                    switch (o){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.bpajak3r();
                            double total = 100000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;

            }
        }
    }
    
    public static void Scase1c(Scanner x){
        method_return objek = new method_return();
        boolean cekKondisi = false;
        while (!cekKondisi){
            System.out.print("pilih nomor : ");
            int i = x.nextInt();
            switch (i) {
                case (1):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int u = x.nextInt();
                    switch (u){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.bpajak3r();
                            double total = 65000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (2):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int n = x.nextInt();
                    switch (n){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.bpajak3r();
                            double total = 195000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (3):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int m = x.nextInt();
                    switch (m){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.pajak3r();
                            double total = 390000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (4):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int w = x.nextInt();
                    switch (w){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.pajak3r();
                            double total = 645000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
                case (5):
                    System.out.println("apakah anda yakin");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("pilih nomor : ");
                    int q = x.nextInt();
                    switch (q){
                        case(1):
                            System.out.println("terima kasih telah menggunakan jasa kami");
                            double z = objek.pajak3r();
                            double total = 1280000 + z;
                            int s = 2000000;
                            double r = objek.sisa(s,total);
                            System.out.println("sisa saldo anda = " + r);
                            System.exit(0);
                            break;
                        case(2):
                            System.out.println("silahkan pilih kembali");
                            break;
                    }
                    break;
            }
        }
    }

    public static void menu1(){ 
        System.out.println("1. Beli akun"); 
        System.out.println("2. Top up"); 
        System.out.print("pilih nomor : "); 
       }
    public static void jAkun1(){ 
        System.out.println("1. sKrullg (ar55)                  Rp.2.200.000"); 
        System.out.println("diluc(c3),keqing(c4),yae miko(c2),mona(c2),raiden shougun(c2),jean(c3)"); 
        System.out.println("all b4 ready for c6"); 
        System.out.println("2. namelessKing (ar40)             Rp.1.000.000"); 
        System.out.println("diluc(c2),ganyu(c1),venti(c0),mona(c2),jean(c3)"); 
        System.out.println("all b4 ready for c6"); 
        System.out.println("3. pak Dadang Hei (ar30)           Rp.600.000"); 
        System.out.println("ayaka(c2),zhongli(c0),mona(c0),jean(c0)"); 
        System.out.println("all b4 ready for c3 except bennet(c5)"); 
        System.out.println("4. oxorb13 (ar8)           Rp.100.000"); 
        System.out.println("ayaka(c1)"); 
        System.out.println("beido(c0),xiangling(c1),barbara(c1),noelle(c0),diona(c0)"); 
    }
}    
