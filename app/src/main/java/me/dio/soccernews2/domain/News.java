package me.dio.soccernews2.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class News {
    @PrimaryKey
    public int id;
    public String title;
    public String description;
    private String image;
    public String link;
    public boolean favorite;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}