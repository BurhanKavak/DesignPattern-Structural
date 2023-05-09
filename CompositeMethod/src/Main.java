public class Main {
    public static void main(String[] args) {

       MovieContainer thrillerContainer = new MovieContainer();
       thrillerContainer.addMovie(new Thriller(1,"Dovus Kulubu","1999",8.8));
       thrillerContainer.addMovie(new Thriller(2,"Batman","2008",8.9));


       MovieContainer horrorContainer = new MovieContainer();
       horrorContainer.addMovie(new Horror(3,"Korku","2001",8.1));


       MovieContainer container = new MovieContainer();
       container.addMovie(thrillerContainer);
       container.addMovie(horrorContainer);


       container.showMovieInfo();
    }
}
