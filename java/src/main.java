import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;


class Main {

    public static void main(String[] args) {

        List<String> urlArray = new ArrayList<>(Arrays.asList( "HTTPS://GOLANG.ORG",
                                                               "HTTPS://SCALA-LANG.ORG",
                                                               "HTTPS://JAVA.COM",
                                                               "HTTPS://PYTHON.ORG",
                                                               "HTTPS://ISOCPP.ORG"));

        List<String> newUrlArray = new ArrayList<>();

        // Functional literals
        Consumer<String> funcLit = (url) -> newUrlArray.add(url.toLowerCase());

        // Array traversing technique
        urlArray.forEach(funcLit);

        System.out.println(newUrlArray);
    }
}