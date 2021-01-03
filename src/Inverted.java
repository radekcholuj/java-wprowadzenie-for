public class Inverted {
    public static void main(String[] args) {
        char[] word = {'t','u','n','e','l'};
        char[] reverseWord = new char[word.length];

        System.out.println("początkowa tablica");
        for (int i = 0; i< word.length; i++){
            System.out.print(word[i]);
        }

        System.out.println("\nodwrócona tablica");

        for (int i = 0, j = word.length-1 ; i< word.length; i++, j--){
            reverseWord[i] = word[j];
            System.out.print(reverseWord[i]);
        }
    }
}
