

public class StringMatcher {

        public static void main(String[] args){
            String s1 = "aabc";
            String s2 = "caabcaa";
            String s3= "";
            //you have to find the value of n;

            for(int i=0;i<s2.length();i++){
                s3 = s3+s1;
                System.out.println(s3.indexOf(s2));

                if(s3.indexOf(s2) > 0){
                    System.out.println("true and n = "+i+1);
                    break;
                }
            }

        }
    }
