public class Lab {
    public static void main(String[] args) {
        //MCQ 1
        // a<b is true, c<b is true
        //true!=true yields false
        int a = 2;
        int b = 6;
        int c = 3;
        System.out.println(a < b != c < b);

        //MCQ 2
        // true==!false is true
        // true != false is true
        boolean a1 = true;
        boolean b1 = false;
        System.out.println((a1 == !b1) != false);

        //MCQ 3
        //3+4==5 is false, and 3+4>=5 is true
        //false!=true is valid, so true is printed
        System.out.println((3 + 4 == 5) != (3 + 4 >= 5));

        //MCQ 4
        //first if runs, unitprice set to 3
        //second if skips
        //3*20+8=68
        int quant = 20;
        int unitPrice = 4;
        int ship = 8;
        int total;
        if (quant > 10) unitPrice =3;
        if (quant > 20) ship =0;
        total = quant*unitPrice+ship;
        System.out.println(total);

        //MCQ 5
        //first if runs, a stays 0, b becomes 1, c becomes 0
        //second if skips
        int a2 = 1;
        int b2 = 0;
        int c2 = -1;
        if ((b2+1) == a2){
            b2++;
            c2+=b2;
        }
        if (c2==a2) {
            a2--;
            b2=4;
        }
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
    }
}