import java.util.*;
//Abhijit Nambiar
//Steve Matthew
//P7
public class ArrayAL {
    public static void main(String[] args) {
        //1
        // A. Create an empty array of Strings with 12 slots.
        String[] empty = new String[12];
        System.out.println(Arrays.toString(empty));
        // B. Create an empty ArrayList of Strings.
        ArrayList<String> emptyAL = new ArrayList<String>();
        System.out.println(emptyAL);
        // C. Create an array with evens 2-10 in order. - Hint: Slide - Make array - specify values
        int[] evens = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(evens));
        // D. Create an ArrayList with evens 2-10 in order - Hint: Slide - Initialization using asList()
        ArrayList<Integer> evensAL = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println(evensAL);
        // E. Create an array with Strings: go, SFHS, Lancers.
        String[] str = {"go", "SFHS", "Lancers"};
        System.out.println(Arrays.toString(str));
        // F. Create an an ArrayList with Strings: go, SFHS, Lancers.
        ArrayList<String> strAL = new ArrayList<String>(Arrays.asList("go", "SFHS", "Lancers"));
        System.out.println(strAL);
        // G. Get the last element of the array from C using the structure’s length or size.
        System.out.println(evens[evens.length-1]);
        // H. Get the last element of the ArrayList from D using the structure’s length or size.
        System.out.println(evensAL.get(evensAL.size()-1));
        
        //2
        ArrayList<Integer> q2List = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        int[] q2Arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(keepMultiplesFour(q2Arr)); //array version
        System.out.println(keepMultiplesFourAL(q2List)); //AL version

        //3
        ArrayList<Integer> q3List = new ArrayList<Integer>(Arrays.asList(-1, 0, -1, 2, 0, 3, -2, -4));
        int[] q3Arr = {-1, 0, -1, 2, 0, 3, -2, -4};
        System.out.println(findMax(q3Arr)); //array version
        System.out.println(findMaxAL(q3List)); //AL version

        //4
        String[] my = {"go", "SFHS", "Lancers", "goop", "go", "brown", "go"};
        ArrayList<String> myTest = new ArrayList<String>(Arrays.asList("go", "SFHS", "Lancers", "goop", "go", "brown", "go"));
        System.out.println(countStrings(my, "go"));
        System.out.println(countStringsAL(myTest, "go"));

        //5
        ArrayList<Integer> q5List = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        int[] q5Arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(average(q5Arr)); //array version
        System.out.println(averageAL(q5List)); //AL version

        //6
        ArrayList<Integer> q6List = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 17, 19));
        int[] q6Arr = {2, 4, 6, 8, 10, 12, 14, 16, 17, 19};
        System.out.println(filterEvenOrOdd(q6Arr, 1)); //array version
        System.out.println(filterEvenOrOddAL(q6List, 2)); //AL version
    }

    public static ArrayList<Integer> keepMultiplesFour(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0;
        while(i<arr.length) {
            if (arr[i]%4==0) {
                res.add(arr[i]);
            }
            i++;
        }
        return res;
    }

    public static ArrayList<Integer> keepMultiplesFourAL(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;  i<list.size(); i++) {
            if (list.get(i)%4==0) {
                res.add(list.get(i));
            }
        }
        return res;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i:arr) {
            if (i>max) max=i;
        }
        return max;
    }

    public static int findMaxAL(ArrayList<Integer> list) {
        int max = list.get(0);
        for(int i:list) {
            if (i>max) max=i;
        }
        return max;
    }

    public static int countStrings(String[] arr, String target) {
        int count =0;
        for(String i:arr) {
            if (i.equals(target)) count++;
        }
        return count;
    }

    public static int countStringsAL(ArrayList<String> arr, String target) {
        int count =0;
        for(String i:arr) {
            if (i.equals(target)) count++;
        }
        return count;
    }

    public static double average(int[] arr) {
        int sum = 0;
        for(int i:arr) {
            sum+=i;
        }
        return (double)sum/arr.length;
    }

    public static double averageAL(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i:arr) {
            sum+=i;
        }
        return (double)sum/arr.size();
    }

    public static ArrayList<Integer> filterEvenOrOdd(int[] arr, int s) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (s==2) {
            int i=0;
            while(i<arr.length) {
                if (arr[i]%2==0) {
                    res.add(arr[i]);
                }
                i++;
            }
            return res;
        }
        else if (s==1) {  
            int i=0;
            while(i<arr.length) {
                if (arr[i]%2==1) {
                    res.add(arr[i]);
                }
                i++;
            }
            return res;
        }
        else {
            for(int i:arr) {
                res.add(i);
            }
            return res;
        }
    }

    public static ArrayList<Integer> filterEvenOrOddAL(ArrayList<Integer> arr, int s) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (s==2) {
            for(int i:arr) {
                if (i%2==0) {
                    res.add(i);
                }
            }
            return res;
        }
        else if (s==1) {  
            for(int i:arr) {
                if (i%2==1) {
                    res.add(i);
                }
            }
            return res;
        }
        else {
            for(int i:arr) {
                res.add(i);
            }
            return res;
        }
    }
}
