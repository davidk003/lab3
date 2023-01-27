

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }

  static void reverseInPlaceFixed(int[] arr) {
    int temp;
    for(int i = 0; i < arr.length/2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }
  }

  static int[] reversedFixed(int[] arr) { 
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[arr.length - i - 1] = arr[i];
    }
    return newArray;
  }
  
  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowestFixed(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    int lowestIndex = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if(Double.compare(arr[i], arr[lowestIndex]) < 0){lowestIndex = i;}
    }
    double sum = 0;
    for(int i = 0; i < arr.length; i++)
    {
      if(i != lowestIndex){sum+=arr[i];}
    }
    return sum / (arr.length - 1);
  }
  

}

