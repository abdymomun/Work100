import java.util.Scanner;
public class Main {
public static void main(String[] args) {


    System.out.println("Добро пажаловать в кино watch Введите пароль что бы войти ");
    Cast cast = new Cast("James Cameron", "Сэм Уортингтон"); //TODO Avatar

    Cast cast1 = new Cast("Roberto Orci","Shia LaBeouf");//TODO Tranformers

    Cast cast2 = new Cast("Мэтт Деймон","Цзин Тянь");//TODO Graet wall

    Cast[] casts = {cast,cast1,cast2};//Todo array casts


    Director director = new Director("Джеймс", "Кэмерон");//TODO Avatar

    Director director1 = new Director("Michael ","Bay");//TODO Tranformers

    Director director2 = new Director("Чжан Имоу","Имоу");//TODO Graet wall

    Director [] directors = {director,director1,director2};//Todo array directors


    Movie movie = new Movie("Avatar", 2022, "Фантастический фильм", "Чжан Имоу", director, new Cast[]{cast},2005);//todo Avator

    Movie movie1 = new Movie("Transformers",2007,"Фантастический фильм", "Чжан Имоу", director1, new Cast[]{cast1},2005);//todo Transformers

    Movie movie2 = new Movie("Great wall",2016,"Фантастический фильм","Чжан Имоу",director2, new Cast[]{cast2},2005);//todo Great wall

    Movie [] movies = {movie,movie1,movie2};//todo array movies
    System.out.println(movie.passwordPhone());
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            switch (a) {
                case "2005":
                    System.out.println("пароль верно напишите Название Фильма ");
                    break;
                case "Все фильмы":
                movie.getAllMovies(movies);
                    break;
                case "Avatar":
                movie.findMovieByName(movies);
                    break;
                case "Transformers":
                movie1.findMovieByName(movies);
                    break;
                case "Great wall":
                    movie2.findMovieByName(movies);
                    break;
                default:
                    System.out.println("такого Фильма нет ");
            }
        }
    }
}