public class L7T11 {
    public static void main(String[] args) {
        final int NUMBLE_OF_CHARS = 175;
        final int CHAR_PER_LINE =25;
        for(int i =0;i<NUMBLE_OF_CHARS;i++){
            char ch =L7T10.getRandomLowerCaseLetter();
            if(((i+1)&CHAR_PER_LINE)==0){
                System.out.println(ch);
            }else {
                System.out.println(ch);
            }
        }
    }

}