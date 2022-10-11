public class FizzBuzz {
    public int limit;
    public FizzBuzz(int limit){
        this.limit = limit;
    }
    public void start(){
        for(int i=0; i<this.limit; i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else{
                if(i%3==0){
                    System.out.println("fizz");
                }
                if(i%5==0){
                    System.out.println("buzz");
                }
            }
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
