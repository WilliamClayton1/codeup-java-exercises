package movies;

public class Movie {

    private String name;

    private String category;

    //constructor
    public Movie(String movieName, String movieCategory) {
        name = movieName;
        category = movieCategory;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }

    //setter
    public void setName (String name) {
        this.name = name;
    }
    public void setCategory (String category) {
        this.category = category;
    }

}
