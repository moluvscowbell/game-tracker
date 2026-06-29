public class GameCollection {
     private Game[] collection;
    private int numGames;
    public final int MAX_GAMES = 20;
}

public void Collection(){
    numGames = 0;
    collection = new Game[MAX_GAMES];
}

public int getNumGames(){
    return this.numGames;
}

public boolean addGame(Game newGame){
    for (int i = 0; i < collection.length; i++){
        if (collection[i] == null){
            collection[i] = newGame;
            numGames++;
            return true;
        } 
    }
    return false;
}

public Game findGame(String title){
    for (int i = 0; i < numGames; i++){
        if (collection[i].getTitle().equalsIgnoreCase(title)){
            return collection[i];
        }
    }
    return null;
}

public void sortGames(){
    for (int i = 0; i < numGames; i++){
        int min = i;
        for (int j = i; j < numGames; j++){
            if (collection[j].comesBefore(collection[i])){
                min = j;
            }
        }
        Game temp = collection[min];
        collection[min] = collection[i];
        collection[i] = temp;
    }
    
}
