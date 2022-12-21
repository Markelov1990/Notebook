package com.example.notebook.domain;

import android.content.Context;

import com.example.notebook.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryCitiesReposirtory implements CitiesRepository {

    private static CitiesRepository INSTANCE;

    public static CitiesRepository getINSTANCE(Context context) {
        if (INSTANCE == null) {
            INSTANCE= new InMemoryCitiesReposirtory(context);
        }
        return INSTANCE;
    }

    private Context context;

    private InMemoryCitiesReposirtory(Context context) {
        this.context = context;
    }


    @Override
    public List<City> getAll() {
        ArrayList<City> result = new ArrayList<>();
        result.add(new City(context.getString(R.string.kazan), R.drawable.kazan_gerb));
        result.add(new City(context.getString(R.string.ekb), R.drawable.ekaterinburg_gerb));
        result.add(new City(context.getString(R.string.nn), R.drawable.nizhny_novgorod_gerb));
        result.add(new City(context.getString(R.string.novosib), R.drawable.novosibirsk_gerb));
        return result;
    }

    @Override
    public void add(City city) {

    }
}
