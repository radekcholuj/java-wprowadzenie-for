public class DisplayNumbers {
    public static void main(String[] args) {
        System.out.println("-------------zadanie1--------------");
        // zadanie 1 od 91 do -7


        for(int i = 91;i >= -7;i--){
            System.out.println(i);
        }
        System.out.println("-------------zadanie2--------------");
        // zadanie 2

        for(int i = 62349;i <= 62392;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }

        }
        System.out.println("-------------zadanie3--------------");
        char a = 'a';
        char z = 'z';
        for(int i = 'a';i <= 'z';i++){
            System.out.println((char)i);
        }
    }
}
