import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class urlDecoder {
    public static void main(String[] args)
            throws UnsupportedEncodingException
    {
        // encoded string
        String encodedString = "https%3A%2F%2Fgithub.com%2Fworscik";
        System.out.println("Encoded String :");
        System.out.println(encodedString);

        // decode() method
        System.out.println("Decoded String :");
        System.out.println(URLDecoder.decode(encodedString, "UTF-8"));
    }
}