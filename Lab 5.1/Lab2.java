public class Lab2 {
    public static void main(String[] args) {
        int x = 100;
        int total = 0;

        while(x>=10) {
            System.out.println(x);
            total+=x;
            x-=10;
        }
        System.out.println(total);

    }
}