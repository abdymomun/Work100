import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Movie implements Findable {


    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] casts;
    private int password;

    public Movie(String name, int year, String description, String s, Director director, Cast[] casts,int password) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = casts;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Cast[] getCasts() {
        return casts;
    }

    public void setCasts(Cast[] casts) {
        this.casts = casts;
    }

    @Override
    public String toString() {
        return  "\n Фильм :" + name +
                "\n Год   :" + year +
                "\n Описание :" + description +
                "\n Директор :" + director +
                "\n В роле :" + Arrays.toString(casts)
                ;
    }
    public String passwordPhone() {
        Scanner scanner = new Scanner(System.in);
        int enteredPassword = scanner.nextInt();

        if (enteredPassword == (password)) {
            return " Пaрол правильный " +
                    "\nФильмы которые у вас есть"+
                    "\nAvatar " +
                    "\nTransformers" +
                    "\nGreat wall " +
                    "\nНапишите название фильма";
        } else {
            return "Неправильный пароль  ,  Попробуйте еще раз.";
        }
    }

    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m : movies
        ) {
            System.out.println(m.toString());

        }
    }

    @Override
    public void findMovieByName(String movies) {

    }

    @Override
    public void findMovieByActorName() {

    }

    @Override
    public void getAllmovies(Cast[] casts) {

    }

    @Override
    public void getAllmovies(Movie[] movies) {

    }

    @Override
    public void findMovieByName(Movie[] movies) {
        for (Movie m : movies
        ) {
            if (m.name.equals(name)) {
                System.out.println(m.toString());
            }

        }
    }


    @Override
    public void findMovieByActorName(Movie[] movies) {
        for (Movie m : movies
        ) {
            for (Cast c : casts
            ) {
                if (c.getActorFullName().equals(name.toUpperCase(Locale.ROOT)))
                    System.out.println(m.toString());
            }


        }

    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        for (Movie m : movies
        ) {
            if (m.getYear() == year) {
                System.out.println(m.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        for (Movie m : movies
        ) {
            if (director.getName().equals(name)) {
                System.out.println(m.toString());
            }

        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {

        for (Movie m : movies
        ) {
            if (m.getDescription().equals(name)) {
                System.out.println(m.toString());
            }

        }
    }

    @Override
    public void findMovieByRole(Movie[] movies) {

        for (Movie m : movies
        ) {
            for (Cast c : casts
            ) {
                if (c.getRole().equals(name))
                    System.out.println(m.toString());
            }

        }
    }
}