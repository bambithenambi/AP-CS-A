public class lab52 {
    public static void main(String[] args) {
        //MCQ 1
        //sums all multiples of 10 from 100 down to 10
        int x = 100;
        int total = 0;
        while(x>=10)
        {
        total = total + x;
        x = x - 10;
        }

        //MCQ 2
        //find sum of digits in num by repeated mod, until the last digit
        int num = 12345;
        int sum = 0;
        while(num>0)
        {
        sum += num % 10;
        num /= 10;
        }
        System.out.println(sum);

        //MCQ 3
        //prints sequence of numbers starting at 1 and increasing by 5 until it reaches a number over 20
        int a = 1;
        String result = "";
        while (a < 20)
        {
        result += a;
        a += 5;
        }
        System.out.println(result);

        //MCQ 4
        //Finds the number of times you can divide a number, in this case 20, by 2
        int count1 = 0;
        int number = 20;
        while (number > 0)
        {
        number = number / 2;
        count1++;
        }
        System.out.println(count1);

        //sums all even numbers less than or equal to 100
        int tot = 0;
        int tot2 = 0;
        for (int k = 0; k <= 100; k += 2) {
            tot += k;
        }
        for (int k = 1; k <= 101; k += 2) {
            tot2 += k-1;
        }
        System.out.println(tot);
        System.out.println(tot2);
    }
}