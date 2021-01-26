import chapterOne.BinarySearch;

public class Main
{
    public static void main(String[] args) {
        String[] array = new String[] {"arr", "bff", "ccc"};

        Integer searchPos = BinarySearch.search(array, "ccc");

        System.out.println("SEARCH_POS " + searchPos);
    }
}