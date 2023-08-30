import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.FilmManager;


public class FilmManagerTest {


    @Test
    public void test1() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");
        filmManager.addFilm("test4");
        filmManager.addFilm("test5");

        String[] array = new String[]{
                "test5", "test4", "test3", "test2", "test1"
        };

        Assertions.assertArrayEquals(array, filmManager.findLast());
    }

    @Test
    public void test2() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");

        String[] array = new String[]{
                "test3", "test2", "test1"
        };

        String[] expected = {"Test1", "Test2" , "Test3"};
        String[] actual = filmManager.findLast();

     Assertions.assertArrayEquals(expected , actual );
    }

    @Test
    public void test3() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");
        filmManager.addFilm("test4");
        filmManager.addFilm("test5");
        filmManager.addFilm("test6");
        filmManager.addFilm("test7");

        String[] array = new String[]{
                "test7", "test6", "test5", "test4", "test3"
        };

        Assertions.assertArrayEquals(array, filmManager.findLast());
    }

    @Test
    public void test4() {
        FilmManager filmManager = new FilmManager(7);
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");
        filmManager.addFilm("test4");
        filmManager.addFilm("test5");
        filmManager.addFilm("test6");
        filmManager.addFilm("test7");

        String[] array = new String[]{
                "test7", "test6", "test5", "test4", "test3", "test2", "test1"
        };

        Assertions.assertArrayEquals(array, filmManager.findLast());
    }

    @Test
    public void test5() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");

        String[] array = new String[]{
                "test1", "test2", "test3"
        };

        Assertions.assertArrayEquals(array, filmManager.findAll());
    }

    @Test
    public void test6() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");
        filmManager.addFilm("test4");
        filmManager.addFilm("test5");

        String[] array = new String[]{
                "test1", "test2", "test3", "test4", "test5"
        };

        Assertions.assertArrayEquals(array, filmManager.findAll());
    }

    @Test
    public void test7() {
        FilmManager filmManager = new FilmManager();
        filmManager.addFilm("test1");
        filmManager.addFilm("test2");
        filmManager.addFilm("test3");
        filmManager.addFilm("test4");
        filmManager.addFilm("test5");
        filmManager.addFilm("test6");
        filmManager.addFilm("test7");

        String[] array = new String[]{
                "test1", "test2", "test3", "test4", "test5", "test6", "test7"
        };

        Assertions.assertArrayEquals(array, filmManager.findAll());
    }

    @Test
    public void test8() {
        FilmManager filmManager = new FilmManager();

        Assertions.assertArrayEquals(filmManager.findAll(), new String[]{});

        filmManager.addFilm("test1");

        Assertions.assertArrayEquals(filmManager.findAll(), new String[]{"test1"});
    }

}

