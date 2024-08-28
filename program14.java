
public  class program14{

    public static void main(String[] args) {
        String s = "The Book Is Green";
        StringBuilder result = new StringBuilder(s.length());
        boolean capitalize = true;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(capitalize && c == Character.toUpperCase(c)){
                result.append(Character.toLowerCase(c));
                capitalize =false;
            }else{
                result.append(c);
            }
            if(c == ' '){
                capitalize = true;
            }

        }
        System.out.println(result.toString());
    }
}