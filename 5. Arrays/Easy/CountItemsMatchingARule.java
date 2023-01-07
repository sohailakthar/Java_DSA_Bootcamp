import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        return res;
    }

    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        
        List<List<String>> input = new ArrayList<List<String>>();

        String[] item1 = {"phone","blue","pixel"};
        String[] item2 = {"computer","silver","lenovo"};
        String[] item3 = {"phone","gold","iphone"};

        input.add(new ArrayList<>(Arrays.asList(item1)));
        input.add(new ArrayList<>(Arrays.asList(item2)));
        input.add(new ArrayList<>(Arrays.asList(item3)));

        System.out.print("Enter ruleKey: ");
        String ruleKey = sc.nextLine();
        System.out.print("Enter ruleValue: ");
        String ruleValue = sc.nextLine();

        System.out.println("Count = "+countMatches(input, ruleKey, ruleValue));

        sc.close();
    }
}
