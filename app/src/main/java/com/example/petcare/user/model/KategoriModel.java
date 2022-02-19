package com.example.petcare.user.model;

import android.content.Context;

public class KategoriModel {
    int icon;
    String title;
    Class toclass;

    public KategoriModel(int icon, String title, Class toclass) {
        this.icon = icon;
        this.title = title;
        this.toclass = toclass;
    }

    public Class getToclass() {
        return toclass;
    }

    public void setToclass(Class toclass) {
        this.toclass = toclass;
    }


    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
