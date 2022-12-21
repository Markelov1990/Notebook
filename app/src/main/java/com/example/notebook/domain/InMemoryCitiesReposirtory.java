package com.example.notebook.domain;

import android.content.Context;

import java.util.List;

public class InMemoryCitiesReposirtory implements CitiesRepository {

    private static CitiesRepository INSTANCE;

    public static CitiesRepository getINSTANCE(Context context) {
        return INSTANCE;
    }

    private Context context;

    private InMemoryCitiesReposirtory(Context context) {
        this.context = context;
    }


    @Override
    public List<City> getAll() {
        return null;
    }

    @Override
    public void add(City city) {

    }
}
