public class Game {
  private String title;
    private String developer;
    private int year;
    private String completion;
    private int rating;  
}

public void Game(String title, String developer, int year, String completion){
    this.title = title;
    this.developer = developer;
    this.year = year;
    this.completion = completion;
}

public String getTitle(){
    return this.title;
}
public String getDeveloper(){
    return this.developer;
}
public int getYear(){
    return this.year;
}
public String getCompletion(){
    return this.completion;
}
public int getRating(){
    return this.rating;
}


public void setTitle(String title){
    this.title = title;
}
public void setDeveloper(String developer){
    this.developer = developer;
}
public void setYear(int year){
    this.year = year;
}
public void setCompletion(String completion){
    this.completion = completion;
}
public void setRating(int rating){
    this.rating = rating;
}

public boolean comesBefore(Game anotherGame){
    int titleCompare = this.title.compareToIgnoreCase(anotherGame.title); 
    if (titleCompare != 0){ 
        return titleCompare < 0; 
    } 
    else { 
        return this.year.compareTo(anotherGame.year) < 0; 
    }
}

public void display(){
    System.out.println(getTitle() + " (" + getYear() + ") - completion: " + getCompletion());
}
