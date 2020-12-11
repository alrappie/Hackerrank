    static boolean compare(String decider, char[] huruf) {
        int hasil=0;
        for (char c : huruf){
            if (decider.contains(Character.toString(c))){
                hasil++;
            }
        }
        return hasil >= decider.toCharArray().length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String decider = in.nextLine();
        char[] huruf = new char[10];
        for (int i = 0; i < 10; i++) {
            huruf[i] = in.next().charAt(0);
            // System.out.println(huruf[i]);
        }
        if (compare(decider, huruf)) System.out.println("Bisa");
        else System.out.println("Tidak Bisa");
    }
}
