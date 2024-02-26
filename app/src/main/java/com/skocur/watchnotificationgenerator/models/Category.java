package com.skocur.watchnotificationgenerator.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Category {

    @PrimaryKey(autoGenerate = true)
    public int categoryUid;

    @ColumnInfo(name = "category_name")
    public String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryUid() {
        return categoryUid;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}
