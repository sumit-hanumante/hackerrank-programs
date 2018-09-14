import java.util.ArrayList;
import java.util.List;

/**

 Example 1: Input=[a,b] Output=[ [a], [b], [c], [a,b] ]

 Example 2 : Input=[a,b,c] Output=[ [a], [b], [c], [a,b], [b,c], [a,c], [a,b,c] ]

 Example 3 ( any size given as input) :
    Input=[a ,b ,c, d, e, f, g, h, i…]
         Output=
         [a]
         [a, b]
         [a, b, c]
         [a, b, c, d]
         [a, b, c, d, e]
         [a, b, c, d, e, f]
         [a, b, c, d, e, f, g]
         [a, b, c, d, e, f, g, h]
         [a, b, c, d, e, f, g, h, i]
 */

public class SubsetOfList {

    public List<List<String>> subsets(List<String> inputList) {

        List<List<String>> result = new ArrayList<>();
        int lastIndex = 1 <<inputList.size();
        for (int i = 0; i< lastIndex;i++){
            List<String> temp = new ArrayList<>();
            for (int j = 0; j< inputList.size(); j++){
                if ((i &(1<< j))> 0){
                    temp.add(inputList.get(j));
                }
            }
            result.add(temp);
        }

        if (result.size()>0){
            result.remove(0);
        }

        return result;
    }
}
