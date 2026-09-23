package Encapsulation;//Write a  Java program to create a class called Movie
// with private instance variables title, director, and duration.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called getMovieDetails() that returns a formatted string containing the movie details.

class Movie{
    private String title;
    private String director;
    private int duration;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public String getMovieDetails() {
        return "Title: " + title + ", Director: " + director + ", Duration: " + duration + " minutes";
    }
}

class Task4{
    public static void main(String[] args){
        Movie A = new Movie();
        A.setTitle("Moive A");
        A.setDirector("Director A");
        A.setDuration(120);

        System.out.println( A.getMovieDetails());

    }
}