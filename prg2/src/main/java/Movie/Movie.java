package Movie;

public class Movie{
    private int no;
    private String name;
    private String category;
    private double rating;

    public Movie(int no, String line){
        String[] split_line = line.split(";");
        setNo(no+1);
        setName(split_line[0]);
        setCategory(split_line[3]);
        setRating(Double.parseDouble(split_line[1]));
    }

    @Override
    public String toString(){
        return String.format("%d# Name: %s | " +
                "Category: %s | " +
                "Rating: %.1f",
                getNo(),
                getName(),
                getCategory(),
                getRating());
    }

    // Setters
    public void setNo(int i){
        this.no = i;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setCategory(String s){
        this.category = s;
    }
    public void setRating(double s){
        this.rating = s;
    }

    // Getters
    public int getNo(){
        return this.no;
    }
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public double getRating(){
        return  this.rating;
    }
}