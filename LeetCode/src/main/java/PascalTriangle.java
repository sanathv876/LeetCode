import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<>();
        List<Integer> innerListOne = new ArrayList<>();
        innerListOne.add(1);
        List<Integer> innerListTwo = new ArrayList<>();
        innerListTwo.add(1);
        innerListTwo.add(1);
        pascalList.add(innerListOne);
        pascalList.add(innerListTwo);
        if(numRows == 1){
            pascalList.remove(1);
        }else if(numRows == 2){
            return pascalList;
        }else{
            for(int o = 3; o <= numRows; o ++){
                List<Integer> temp = new ArrayList<Integer>(o);
                temp.add(0,1);
                //temp.add(temp.size()-1, 1);
                for(int i = 1; i < o-1; i ++){
                    List<Integer> tempList = pascalList.get(o-2);
                    int num = tempList.get(i-1) + tempList.get(i);
                    temp.add(num);
                }
                temp.add(temp.size(), 1);
                pascalList.add(temp);
            }
        }

        return pascalList;


    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(6));


    }
}
