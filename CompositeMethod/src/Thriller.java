public class Thriller implements Movie {

    private int id;
    private String name;
    private String releaseDate;
    private double imdb;

    public Thriller(int id, String name, String releaseDate, double imdb) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.imdb = imdb;
    }

    @Override
    public void showMovieInfo() {
        System.out.println("Film adi : " + name);
        System.out.println("Yayin tarihi : " + releaseDate);
        System.out.println("Imdb : " + imdb);
        System.out.println("--");
    }
}
