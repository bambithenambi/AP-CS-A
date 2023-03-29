public class Tester {
    public int main(String args[]) {
//Q1
        int[] arr = {1, 2, 3, 4, 5};


//A
arr[0] = 10; 

arr[1] = 10;

//B array is 0-indexed, so 1 and 2 are not first two elements
arr[1] = 10;

arr[2] = 10;

//C array can't acess multiple elements 
arr[0, 1] = 10;

//D array array can't acess multiple elements 
arr[1, 2] = 10;

//E array array can't acess multiple elements 
arr = 10, 10, 3, 4, 5;

//Q2
public int[] transform(int[] a)

{

a[0]++;

a[2]++;

return a;

}

int[] arr = {0, 0, 0, 0}; //creates 4 int array, each int is 0
int[] arr = new int[0]; //creates a 0 int array, which doesn't exist
int[] arr = new int[4]; //creates 4 int array, each int is 0

    }

//Q3
public static int checkString(String[] arr)

{

int count = 0;

for (int k = 0; k < arr.length; k++)

{

if (arr[k].length() >= 3)

{

count++;

}

}

return count;

}


checkString(new String[]); //must be intialized with a length
checkString(new String[0]); 
String[] str = {"cat", "dog"};
checkString(str);

//Q4

}