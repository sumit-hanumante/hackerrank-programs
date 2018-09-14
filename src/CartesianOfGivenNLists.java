import java.util.ArrayList;
import java.util.List;


/**
 *
 Example 1 (2 lists as input) :
    Input : [ [a,b] , [p,q] ]
    Output : [ [a,p], [a,q], [b,p], [b,q] ]


 Example 2 (3 lists as input):
        Input : [ [a,b] , [p,q] , [l,m] ]
        Output : [ [a,p,l], [a,p,m], [a,q,l], [a,q, m] , [b,p,l] , [b,p,m] , [b,q,l] , [b,q,m] ]
 *
 */

public class CartesianOfGivenNLists {

    public List<List<String>> cartesian(List<List<String>> inputLists) {

        List<List<String>> result = new ArrayList<>();

        if (inputLists.size()==0){
            result.add(new ArrayList<>());
            return result;
        }


        List<String> firstList = inputLists.get(0);
        List<List<String>> remainingList = cartesian(inputLists.subList(1,inputLists.size()));

        for (String firstWord: firstList){
            for (List<String> remainingWords: remainingList){
                List<String> temp = new ArrayList<>();
                temp.add(firstWord);
                temp.addAll(remainingWords);
                result.add(temp);
            }
        }

        return result;
    }
}
