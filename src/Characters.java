public class Characters {
    public static void main(String[] args) {

        char[] charTab= {'a','g','a','t','k', 'A','a'};
        int small= 0;
        int big= 0;

        for(int i = 0; i< charTab.length; i++){
            if(charTab[i] == 'a' ){
                small++;
            }
            if(charTab[i] == 'A'){
                big++;
            }
        }
        System.out.println("jest w tablicy " +small + " znak(ów) \"a\" oraz "+ big+ " znak(ów)  \"A\"");
    }
}
