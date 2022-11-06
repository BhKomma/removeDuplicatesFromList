
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //declares a list of Array and assigns numbers in range of 1-10 with duplicates
        ArrayList<Integer> duplicateList = new ArrayList<>(Arrays.asList(1,1,1,3,4,4,5,5,6,3));

        //Prints the duplicate list
        System.out.println("List with Duplicates: " + duplicateList);

        //Calls a reusable function to read list and remove duplicates
        ArrayList<Integer> noDuplicateList = removeDuplicatesFromList(duplicateList);

        //prints the list without duplicates
        System.out.println("List without Duplicates: " + noDuplicateList);
    }

    public  static <D> ArrayList<D> removeDuplicatesFromList(ArrayList<D> noDuplicateList)
    {
        ArrayList<D> newList = new ArrayList<>();

        //iterates through the duplicateList
        for(D element : noDuplicateList)
        {
            //Finds a number if not added to new list adds it
            if(!newList.contains(element))
            {
                newList.add(element);
            }
        }
        return newList;
    }
}