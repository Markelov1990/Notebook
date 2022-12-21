package com.example.notebook.domain;

import java.util.List;

public interface CitiesRepository {

    List<City> getAll();

    void add(City city);
}
