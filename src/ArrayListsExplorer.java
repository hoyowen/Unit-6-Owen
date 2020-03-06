import java.util.ArrayList;
public class ArrayListsExplorer {
    public ArrayListsExplorer() {

    }

    public static void removeZeros(ArrayList<Integer> list) {
        for (int i = list.size() -1; i >= 0; i--) {
            if (list.get(i) == 0)
                list.remove(i);
        }
    }

    public static int countLetters(ArrayList list) {
        int count = 0;
        String x;
        for (int i = 0; i < list.size(); i++) {
            x = (String) list.get(i);
            count = count + x.length();
        }
        return count;
    }

    public static int findPosition(int keyValue, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == keyValue)
                return i;
        }
        return -1;
    }

    public static ArrayList parseIntoArrayList(String input) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.substring(i , i+1));
        }
        return list;
    }
    public static String findMin(ArrayList<Person> list) {
        int min = list.get(0).getAge();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() < min)
                min = i;
        }
        Person person = list.get(min);
        return person.getName();
    }
}
