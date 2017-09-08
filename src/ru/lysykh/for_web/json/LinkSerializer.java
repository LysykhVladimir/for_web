package ru.lysykh.for_web.json;

public class LinkSerializer {

    public static String toJson(final Link link) {
        // BEGIN (write your solution here)
        StringBuilder js = new StringBuilder();
        js.append('{');
        js.append("\"fullUrl\" :");
        js.append(link.getFullUrl()+',');
        js.append(" \"code\" :");
        js.append(link.getCode()+',');
        if (link.getExpiryDate() != null) {
            js.append("\"expiryDate\": {");
            js.append("\"month\": ");
            js.append(String.format("\"%d\",", link.getExpiryDate().getMonth()));
            js.append("\"year\": ");
            js.append(String.format("\"%d\"", link.getExpiryDate().getYear()));
            js.append("}");
        } else {
            js.append("\"expiryDate\": null");
        }
        js.append('}');
        return js.toString();
        // END
    }

}
