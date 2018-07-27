import java.util.Arrays;
import java.util.Comparator;

public class LargestGapNumber {

    public static void main(String args[]){

        int a[] = {3,30,34,5,9};
        System.out.println(largestNumber(a));
    }


    public static String largestNumber(int[] num) {
        if(num == null || num.length == 0)
            return "";

        // Convert int array to String array, so we can sort later on
        String[] s_num = new String[num.length];
        for(int i = 0; i < num.length; i++)
            s_num[i] = String.valueOf(num[i]);

        // Comparator to decide which string should come first in concatenation
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String s1 = str1 + str2;//319
                String s2 = str2 + str1;//913
                System.out.print(s1 + " " + s2);
                System.out.println();
                System.out.println(s2.compareTo(s1));
                System.out.println(s1.compareTo(s2));
                return s2.compareTo(s1); // reverse order here, so we can do append() later
            }
        };

        Arrays.asList(s_num).stream().forEach(s -> System.out.print(s));
        System.out.println();
        Arrays.sort(s_num, comp);

        Arrays.asList(s_num).stream().forEach(s -> System.out.print(s));
        System.out.println();

        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
        if(s_num[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String s: s_num)
            sb.append(s);

        return sb.toString();

    }
}