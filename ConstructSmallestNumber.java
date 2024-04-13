public class ConstructSmallestNumber {
    public static String smallestNumber(String s) {
        String out = "";
        int current = 1;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                break;
            }
            current++;
        }
        out += current;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'D'){

                    int a = Character.getNumericValue(out.charAt(i));
                    out += (--a);
                

            }else{
                int j = i;
                for(j=i+1; j<s.length(); j++){
                    if(s.charAt(j) == 'D'){
                        current++;
                    }else{
                        break;
                    }
                }
                out += (++current);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber("DDDIII"));
    }
}
