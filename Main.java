import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    /*ArrayList<Integer> data = new ArrayList<Integer>();
    data.add(2);
    data.add(4);
    data.add(6);
    data.add(8);
    //printArray(number1);
    //int index = number1.indexOf(4);
    //number1.remove(index);
    //printArray(number1);
    printArray(data);
    int index = data.indexOf(2);
    int two = data.get(2);
    System.out.println("index: " + 2 + " value at index: " + two);*/

    // Find the biggest number in the arraylist called smallBig
    ArrayList<Integer> smallBig = new ArrayList<>();
    smallBig.add(100);
    smallBig.add(1);
    smallBig.add(400);
    smallBig.add(10000);
    smallBig.add(-12);
    smallBig.add(2048);
    int biggest = smallBig.get(0);
    for(int i = 1; i < smallBig.size(); i++){
      if(smallBig.get(i) > biggest){
        biggest = smallBig.get(i);
      }
    }
    return biggest;
  }

  public static void printArray(ArrayList<Integer> numbers){
    for(int i = 0; i < numbers.size(); i++){
      System.out.println(numbers.get(i));
    }
    System.out.println();
  }
}