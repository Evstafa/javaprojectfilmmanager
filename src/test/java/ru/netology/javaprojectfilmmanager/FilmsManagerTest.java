package ru.netology.javaprojectfilmmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void testOneFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testZeroFilms() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllNineFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllTwelveFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");
        manager.addFilm("Film XI");
        manager.addFilm("Film XII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X", "Film XI", "Film XII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitLessSix() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllFilmsLimitMoreSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllOneFilmsLimitSeven() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllZeroFilmsLimitSeven() {
        FilmsManager manager = new FilmsManager(7);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitOfFilmsIsTheSame() {
        FilmsManager manager = new FilmsManager(11);
        manager.findlast();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");
        manager.addFilm("Film XI");

        String[] expected = {"Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesLast() {
        FilmsManager manager = new FilmsManager(11);
        manager.findlast();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");

        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenTheMoviesIsZeroAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);
        String[] expected = {};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WhenTheMoviesIsOneAndTheLimitIsEleven() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilm("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }
}