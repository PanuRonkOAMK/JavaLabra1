public class LabraV1 {
    public static void main(String[] args) throws Exception {
        System.out.println(isEven(8));
        System.out.println(isEven(7));
        System.out.println(describe(0));
        System.out.println(describe(8));
        System.out.println(describe(7));
        System.out.println(describe(-8));
        System.out.println(describe(-7));
        System.out.println(order2(5,2));
        System.out.println(order3(5,2,3));
        System.out.println(table10(5));
        System.out.println(login(new String[]{"no", "java123", "x"}));
        System.out.println(login(new String[]{"no", "y", "x"}));
        System.out.println(login(new String[]{"no", "asd", "x", "y"}));


    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static String sign(int n){
        if(n > 0) {
            return("positiivinen");
        }
        if(n < 0) {
            return("negatiivinen");
        } else {
            return("nolla");
        }
    }
    public static String describe(int n){
       if(n == 0) {
            return("nolla");
        }else if(isEven(n)) {
            return(sign(n) + " parillinen");
        } else {
            return(sign(n) + " pariton");
        }
    }
    public static String order2(int a,int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        return min + "," + max;
    }
    static String order3(int a,int b,int c){
        int max = Math.max(a,b);
        max = Math.max(max, c);
        int min = Math.min(a,b);
        min = Math.min(min,c);
        int mid = (a+b+c) - max - min;
        return min + "," + mid + "," + max;
    }
    static String line(int n,int i){
        int tulo = n * i;
        return n + " x " + i + " = " + tulo;
    }
    static String table10(int n){
        StringBuilder sb = new StringBuilder(20);
        int i = 1;
        while(i <= 10) {
            sb.append(line(n,i) + "\n");
            i++;
        }
        return sb.toString();
    }
    static boolean check(String s){
        if("java123".equals(s)) {
            return true;
        } else {
            return false;
        }
    }
    static String login(String[] tries){
        if(tries.length != 3) {
            return "Liian monta yritystä";
        } else {
            int i = 0;
            while (i < tries.length) {
                if(check(tries[i])) {
                    return "Tervetuloa!";
                }
                i++;
            }
        }
        return "Liian monta yritystä";
    }
    static double average(int[] a){
        if (a.length == 0) {
            return 0.0;
        }
        double summa = 0;
        for(int i = 0;i < a.length; i++) {
            summa += a[i];
        }
        return summa/a.length;
    }
    static int max(int[] a){
        if (a.length == 0) {
            return Integer.MIN_VALUE;
        }
        int suurin = a[0];
        for(int i = 0;i < a.length; i++) {
            if(a[i] > suurin) {
                suurin = a[i];
            }
        }
        return suurin;
    }
}
