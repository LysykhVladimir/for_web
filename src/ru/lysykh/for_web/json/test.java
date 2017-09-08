package ru.lysykh.for_web.json;

/**
 * Created by Владимир on 23.08.2017.
 */
public class test {


    public static void main(String[] args) {
        Link link2 =new Link("fullUrl", "asfdaf3", new Link.ShortDate(1, 1));

        StringBuilder js = new StringBuilder();
        js.append('{');
        js.append('"'+"fullUrl"+'"'+':');
        js.append(link2.getFullUrl()+',');
        js.append('"'+"code"+'"'+':');
        js.append(link2.getCode()+',');
        if (link2.getExpiryDate() != null) {
            js.append("\"expiryDate\": {");
            js.append("\"month\": ");
            js.append(String.format("\"%d\",", link2.getExpiryDate().getMonth()));
            js.append("\"year\": ");
            js.append(String.format("\"%d\"", link2.getExpiryDate().getYear()));
            js.append("}");
        } else {
            js.append("\"expiryDate\": null");
        }

        js.append('}');
        System.out.println(js.toString());
    }
}
