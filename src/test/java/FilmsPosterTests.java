import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsPosterTests {

    @Test
    public void shouldListFilmsInOrder() {
        FilmsPoster poster = new FilmsPoster();
        poster.add ("film1");
        poster.add ("film2");
        poster.add ("film3");

        String[] expected = { "film1", "film2", "film3" };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListFilmsInOrderMore10() {
        FilmsPoster poster = new FilmsPoster();
        poster.add ("film1");
        poster.add ("film2");
        poster.add ("film3");
        poster.add ("film4");
        poster.add ("film5");
        poster.add ("film6");
        poster.add ("film7");
        poster.add ("film8");
        poster.add ("film9");
        poster.add ("film10");
        poster.add ("film11");

        String[] expected = { "film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11" };
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListFilmsInOrderEquals10() {
        FilmsPoster poster = new FilmsPoster();
        poster.add("film1");
        poster.add("film2");
        poster.add("film3");
        poster.add("film4");
        poster.add("film5");
        poster.add("film6");
        poster.add("film7");
        poster.add("film8");
        poster.add("film9");
        poster.add("film10");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldListFilmsInOrderEquals0() {
        FilmsPoster poster = new FilmsPoster();

        String[] expected = {};
        String[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldListFilmsInReverseOrder() {
        FilmsPoster poster = new FilmsPoster();
        poster.add ("film1");
        poster.add("film2");
        poster.add("film3");

        String[] expected = { "film3", "film2", "film1" };
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListFilmsInReverseOrderMore10() {
        FilmsPoster poster = new FilmsPoster();
        poster.add ("film1");
        poster.add ("film2");
        poster.add ("film3");
        poster.add ("film4");
        poster.add ("film5");
        poster.add ("film6");
        poster.add ("film7");
        poster.add ("film8");
        poster.add ("film9");
        poster.add ("film10");
        poster.add ("film11");

        String[] expected = { "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", };
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldListFilmsInReverseOrderEquals10() {
        FilmsPoster poster = new FilmsPoster();
        poster.add("film1");
        poster.add("film2");
        poster.add("film3");
        poster.add("film4");
        poster.add("film5");
        poster.add("film6");
        poster.add("film7");
        poster.add("film8");
        poster.add("film9");
        poster.add("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldListFilmsInReverseOrderEquals0() {
        FilmsPoster poster = new FilmsPoster();

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
