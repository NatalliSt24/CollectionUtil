import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Текст");
        arrayList.add("Текст один");
        arrayList.add("Текст");
        System.out.println(getElementsbyWorld(arrayList,"Текст"));

    }
        public static ArrayList<String> getElementsbyWorld (ArrayList <String > arrayList, String word){
            return (ArrayList<String>) arrayList.stream().filter(a->a.contains(word)).collect(Collectors.toList());

        }
    }

