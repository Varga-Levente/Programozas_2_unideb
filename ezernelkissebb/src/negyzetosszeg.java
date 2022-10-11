public class negyzetosszeg {
    public static void main(String[] args) {
        int sum_1 = 0;
        int sum_2 = 0;
        for(int i=1; i<=100; i++){
            sum_1+=Math.pow(i,2);
            sum_2+=i;
        }
        sum_2=(int)Math.pow(sum_2,2);
        System.out.println("Az első tíz természetes szám négyzetösszege: "+sum_1);
        System.out.println("Az első tíz természetes szám összegének a négyzete: "+sum_2);
        System.out.println(sum_2-sum_1);
    }
}
