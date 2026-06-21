package main.java.software.ulpgc.kata2;

import java.util.List;

public class Main {

  public static final String url = "https://datasets.imdbws.com/title.basics.tsv.gz";

  public static void main(String[] args) {
    List<Movie> movies = new RemoteMovieDesealizer(url, MovieDeserialize::fromTsv).loadAll();
    System.out.println("Total Movies: " + movies.size());
    movies.stream().limit(10).forEach(System.out::println);
  }
}
