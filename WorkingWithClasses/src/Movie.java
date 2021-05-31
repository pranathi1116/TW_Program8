public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG(Movie movies[]) {
        Movie PGratingMovie[] = new Movie[movies.length];
        int j = 0;
        for (int i = 0; i < movies.length; i++)
            if (movies[i].rating.contains("PG")) {
                System.out.println(movies[i].title+" ,"+movies[i].studio);
                PGratingMovie[j] = new Movie(movies[i].title, movies[i].studio, movies[i].rating);
                j++;
            }
        return PGratingMovie;
}
    public static void main(String args[]) {
        Movie movies[] = new Movie[3];
        movies[0] = new Movie("Casino Royale", "Eon Productions", "PG-13");
        movies[1] = new Movie("Titanic", "SR Productions", "PG");
        movies[2] = new Movie("Inception", "EROS Productions", "R");
        movies[0].getPG(movies);
    }
}
