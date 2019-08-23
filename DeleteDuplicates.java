import java.util.*;

public class DeleteDuplicates {
    public static void main(String[] args) {
        String s = "Bananas";
        Set<String> t = new LinkedHashSet<String>(Arrays.asList(s.split("")));
        s = "";
        for(String i : t){
            s = s+i;
        }
        System.out.println(s);
    }
}
