public class n20 {
    protected String title;
    protected int duration;

    public n20(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends n20 {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends n20 {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Artist: " + artist);
    }
}

class ClassHierarchyExample {
    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", 142, "Frank Darabont");
        movie.displayInformation();

        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Thriller", 14, "Michael Jackson");
        musicVideo.displayInformation();
    }
}
