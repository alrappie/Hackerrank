    public static void main(String[] args) {
        //semangat !
        Scanner GG = new Scanner(System.in);
        String line = GG.nextLine();
        char[]data = line.toCharArray();
        int acaraPoin =0;
        int DDMPoin =0;
        int kestariPoin =0;
        int humasPoin =0;
        int adminPoin =0;
        int PITPoin =0;

        for (int i =0;i<data.length;i++){
            if (data[i]=='a'){
                if (data[i+1]=='c'){
                    acaraPoin++;
                }else {
                    adminPoin++;
                }
                i+=4;
            }else if (data[i]=='d'){
                i+=2;
                DDMPoin++;
            }else if (data[i]=='k'){
                i+=6;
                kestariPoin++;
            }else if(data[i]=='h'){
                i+=4;
                humasPoin++;
            }else if(data[i]=='p'){
                i+=2;
                PITPoin++;
            }
        }
        print(acaraPoin,"Acara");
        print(DDMPoin,"DDM");
        print(kestariPoin,"Kestari");
        print(humasPoin,"Humas");
        print(adminPoin,"Admin");
        print(PITPoin,"PIT");
    }
    static void print(int poinnya,String message){
        for (int i =0;i<poinnya;i++){
            System.out.print(message+" ");
        }
    }
}
