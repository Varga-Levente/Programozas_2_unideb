package ezernelkissebb;

public class Main {
    public static void negyzetosszeg(){
        int sum_1 = 0;
        int sum_2 = 0;
        for(int i=1; i<=100; i++){
            sum_1+=Math.pow(i,2);
            sum_2+=i;
        }
        sum_2=(int)Math.pow(sum_2,2);
        System.out.println("Az első tíz természetes szám négyzetösszege: "+sum_1);
        System.out.println("Az első tíz természetes szám összegének a négyzete: "+sum_2);
        System.out.println();
        System.out.println("Számítsuk ki az első száz természetes szám összegének a négyzete és az első száz természetes szám négyzetösszege közti különbséget!");
        System.out.println(sum_2-sum_1);
    }
    public static int ezernelkisebb(int n){
        if(n%3==0 || n%5==0){
            return n;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<1000; i++){
            sum+=ezernelkisebb(i);
        }
        System.out.println("1000-nél kisebb szamok összege, amik 3 vagy 5 többszörösei: "+sum);
        System.out.println();
        negyzetosszeg();
    }
}
