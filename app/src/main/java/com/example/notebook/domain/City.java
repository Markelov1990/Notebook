package com.example.notebook.domain;

import androidx.annotation.DrawableRes;

public class City {
    private String name;
    private @DrawableRes
    int icon;

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }
}
