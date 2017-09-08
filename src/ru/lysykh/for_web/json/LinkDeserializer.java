package ru.lysykh.for_web.json;

import com.google.gson.Gson;

public class LinkDeserializer {

    private static final Gson GSON = new Gson();

    public static Link deserialize(final String json) {
        return GSON.fromJson(json, Link.class);
    }

}