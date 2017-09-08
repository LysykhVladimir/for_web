package ru.lysykh.for_web.json;


import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testSerialization(new Link("fullUrl", "asfdaf1", null));
        testSerialization(new Link("fullUrl", "asfdaf3", new Link.ShortDate(1, 1)));
        testSerialization(new Link("fullUrl", "asfdaf3", new Link.ShortDate(10, 2)));
        testSerialization(new Link("fullUrl", null, new Link.ShortDate(10, 3)));
        testSerialization(new Link(null, "sadf34", new Link.ShortDate(10, 4)));
        testSerialization(new Link(null, null, null));
    }

    private static void testSerialization(final Link link) {
        final String json = LinkSerializer.toJson(link);
        final Link afterSerialization = LinkDeserializer.deserialize(json);
        if (!link.equals(afterSerialization)) {
            throw new RuntimeException(
                    String.format("Original link:\n %s\nGot serialized to:\n %s", link.toString(), json));
        } else {
            System.out.println(String.format("Original link:\n %s\nGot serialized to:\n %s", link.toString(), json));
        }
    }

}
