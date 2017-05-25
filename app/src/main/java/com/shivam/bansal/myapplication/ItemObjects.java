package com.shivam.bansal.myapplication;

/**
 * Created by DELL on 5/8/2017.
 */

class ItemObjects {
    private String name;
    private int photo_id;

    public ItemObjects(String name, int photo_id) {
        this.name = name;
        this.photo_id = photo_id;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        //String photo = String.valueOf(photo_id);
        return photo_id;
    }
}
