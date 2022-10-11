public class Movie {
    private int no;
    private double rating;
    private String name;
    private int year;
    private int likes;

    public Movie(int no, String line){
        String[] line_part = line.split(";");
        String[] name_part = line_part[1].split(" ");
        setNo(no+1);
        setRating(Double.parseDouble(line_part[0].replace(",", ".")));
        setName(line_part[1].substring(0, line_part[1].length() - 7));
        setYear(Integer.parseInt(name_part[name_part.length-1].replaceAll("[()]", "")));
        setLikes(Integer.parseInt(line_part[2]));
    }

    @Override
    public String toString(){
        String rating_color = Color.RED();
        if(getRating()>=5.0){
            rating_color = Color.GREEN();
        }
        return String.format("%d#\t Name: %s | " +
                "Year: %d | " +
                "Rating: %s%.1f%s | " +
                "Likes: %d",
                getNo(), getName(), getYear(), rating_color, getRating(), Color.RESET(), getLikes());
    }

    // Getters
    public int getNo(){
        return this.no;
    }
    public double getRating(){
        return this.rating;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public int getLikes(){
        return this.likes;
    }

    // Setters
    public void setNo(int i){
        this.no = i;
    }
    public void setRating(double d){
        this.rating = d;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setYear(int i){
        this.year = i;
    }
    public void setLikes(int i){
        this.likes = i;
    }
}
