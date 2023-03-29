public class blackJack {
    public static void main(String[] args) {
        System.out.println(blackJacker(24, 50));
        System.out.println(blackJacker(25, 22));
        System.out.println(blackJacker(19, 21));
        System.out.println(blackJacker(23, 19));
        System.out.println(blackJacker(30, 1));
        System.out.println(blackJacker(3, 2));
        System.out.println(blackJacker(17, 19));

    }
    public static int blackJacker(int handOne, int handTwo) {
        if((handOne>21 && handTwo>21) || (handOne<=0 || handTwo<=0)){
            return 0;
        }
        if(handOne>21) {
            return handTwo;
        }
        if(handTwo>21) {
            return handOne;
        }
        if((21-handTwo)>(21-handOne)) {
            return handOne;
        }
        else return handTwo;
    }
}
