public class Hamming {
    private int Hamming;

    private String word1;
    private String word2;

    public void Hamming(String w1, String w2){
        SetWord1(w1);
        SetWord2(w2);
    }

    public static int distance(String w1, String w2){
        int i = 0, counter = 0;
        if(w1.length() != w2.length()) {
            return -1;
        }else if(w1.length()==0 || w2.length()==0 || w1.equals("") || w2.equals("")){
            return -1;
        }else {
            while (i < w1.length()) {
                if (w1.charAt(i) != w2.charAt(i))
                    counter++;
                i++;
            }
            return counter;
        }
    }

    public void SetWord1(String w1){
        this.word1 = w1;
    }
    public void SetWord2(String w2){
        this.word2 = w2;
    }

    public String GetWord1(){
        return this.word1;
    }
    public String GetWord2(){
        return this.word2;
    }
}
