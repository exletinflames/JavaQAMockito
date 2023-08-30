package ru.netology.manager;

public class FilmManager {

    private static final int DEFAULT_LIMIT = 5;

    private String[] filmArray;
    private int limit;

    public FilmManager(){
        this(DEFAULT_LIMIT);
    }

    public FilmManager(int limit){
        this.limit = limit;
        filmArray = new String[0];
    }

    public void addFilm(String film) {
        int size = filmArray.length + 1;

        String[] newArray = new String[size];

        for(int i = 0; i < size - 1; i++){
            newArray[i] = filmArray[i];
        }

        newArray[size - 1] = film;

        filmArray = newArray;
    }

    public String[] findAll() {
        int size = filmArray.length;

        String[] newArray = new String[size];

        for(int i = 0; i < size; i++){
            newArray[i] = filmArray[i];
        }

        return newArray;
    }

    public String[] findLast(){
        int size = filmArray.length;

        int count;

        if(size < limit){
            count = size;
        } else {
            count = limit;
        }

        String[] newArray = new String[count];

        for(int i = 0; i < count; i++){
            newArray[i] = filmArray[size - 1 - i];
        }

        return newArray;
    }
}

