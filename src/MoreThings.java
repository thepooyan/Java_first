import java.util.ArrayList;
import java.util.List;

public class MoreThings {
    public static void main(String[] args) {

        List data = new ArrayList();
        data.add(10);
        data.add(true);
        data.add("ali");

        System.out.println(data.get(0));
        for (Object item : data) {
            System.out.println(item);
        }
    }
}
