
class CastingRounding {
  public static void main(String[] args) {
    
    double value1 = 10.0;
    double value2 = 10.3;
    double value3 = 10.5;
    double value4 = 10.7;
    double value5 = 10.9;
    double value6 = 11.1;
        
    int rounded1 = (int) (value1 + 0.5);
    int rounded2 = (int) (value2 + 0.5);
    int rounded3 = (int) (value3 + 0.5);
    int rounded4 = (int) (value4 + 0.5);
    int rounded5 = (int) (value5 + 0.5);
    int rounded6 = (int) (value6 + 0.5);
            
    System.out.println(value1 + " rounded = " + rounded1);
    System.out.println(value2 + " rounded = " + rounded2);
    System.out.println(value3 + " rounded = " + rounded3);
    System.out.println(value4 + " rounded = " + rounded4);
    System.out.println(value5 + " rounded = " + rounded5);
    System.out.println(value6 + " rounded = " + rounded6);
    
  }
}
