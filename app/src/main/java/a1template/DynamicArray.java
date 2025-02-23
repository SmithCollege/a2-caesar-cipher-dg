// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
// DynamicArray should be written to work for any generic object.

    // 
    // public T get(int i);


    // public T get(int i, int offset);




public class DynamicArray<T> implements IndexAccess<T>{
    
    private T[] arr;
    private int offset;

    // constructor to make a new DynamicArray Object from an array
    // index is the offset?
    public DynamicArray(int offset, T[] arr) {
        this.arr = arr;
        this.offset = offset;

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
        // //the numbers in indexes until then are moved to the end of the array
        // T[] result = (T[])Array.newInstance(this.arr.getClass(), this.arr.length);

        // for (int a = offset; a < arr.length-offset; a++) {
        //     result[i] = this.arr[i+offset];
        // }
        // for (int b = this.arr.length-offset, c = 0; b < this.arr.length; b++, c++){
        //     result[b] = this.arr[c];
        // }


        return this.arr[i+offset];
        

    }

    /** Stores the given value at the given index
    //  * @param i index of locaßtion to store
    //  * @param val value to store at given index
    //  */
    public void set(int i, T val) {
        this.arr[i] = val;

    }

}