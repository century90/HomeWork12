public class FilmsPoster {

    protected String[] films = new String[0];
    protected int limit;

    public FilmsPoster() {
        this.limit = 10;

    }
    public FilmsPoster(int limit) {
        this.limit = limit;

    }

    public void add (String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length -1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length -1 - i];
        }
        return tmp;

    }
}
