// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray < T > implements IndexAccess < T > {

  /** Generic array to offset */
  private T[] arr;
  /** int amount the array is offset */
  private int aOffset;

  // constructor to make a new DynamicArray Object from an array
  // index is the offset?
  public DynamicArray(int offset, T[] arr) {
    this.arr = arr;
    this.aOffset = offset;

  }

  /** Returns the value stored at a given index
  //  * @param i index of element to read
  //  * @return value stored at the given index
  //  */
  public T get(int i) {
    return this.arr[i];

  }

  /** Returns the value stored at a given index plus the offset
    //  * @param i index of element to read
    //  * @param offset adjust index by this value
    //  * @return value stored at the given index
/  */
  public T get(int i, int offset) {
    // the values in indexes until offset are moved to the end of the array
    T[] result = (T[]) new Object[this.arr.length];

    for (int a = offset, d = 0; a < this.arr.length; a++, d++) {
      if (offset > -1) {
        result[a] = this.arr[d];
      } 
      else {
        result[d] = this.arr[(this.arr.length) + a];
      }

    }
    //values in indexes equal to and after the offset are set to be the values that came before the offset
    for (int b = 0, c = this.arr.length - offset; c < this.arr.length; b++, c++) {
      result[b] = this.arr[c];
    }

    //System.out.println(Arrays.toString(result));

    if (i >= this.arr.length) {
      i = i - this.arr.length;
      return result[i];
    } 
    else if (i > -1 && i < this.arr.length) {
      return result[i];
    } 
    else {
      return result[result.length + i];
    }

  }

  /** Stores the given value at the given index
  //  * @param i index of locaßtion to store
  //  * @param val value to store at given index
  //  */
  public void set(int i, T val) {
    this.arr[i] = val;

  }

}