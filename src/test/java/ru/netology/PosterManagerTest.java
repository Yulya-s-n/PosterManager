package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void shouldAddMovies() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");

        String[] expected = { "Movie 1", "Movie 2", "Movie 3" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");


        String[] expected = { "Movie 3", "Movie 2", "Movie 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastMoviesOverLimit() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");


        String[] expected = { "Movie 11", "Movie 10","Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesOverManualLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");

        String[] expected = { "Movie 11", "Movie 10","Movie 9", "Movie 8", "Movie 7" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
