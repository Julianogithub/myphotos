package net.devstudy.myphotos.model;

import net.devstudy.myphotos.exception.ValidationException;

public enum SortMode {

    POPULAR_PHOTO,
    POPULAR_AUTHOR;

    public static SortMode of(String name) {
        for (SortMode sortMode : SortMode.values()) {
            if (sortMode.name().equalsIgnoreCase(name)) {
                return sortMode;
            }
        }
        throw new ValidationException("Undefined sort mode: " + String.valueOf(name).toUpperCase());
    }
    
}
