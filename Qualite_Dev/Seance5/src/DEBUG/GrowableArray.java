package DEBUG;

public class GrowableArray {
    private int size;
    Object[] array;

    public GrowableArray() {
        this.array = new Object[this.size];
    }

    public GrowableArray(int initialCapacity) {
        this.array = new Object[initialCapacity];
    }

    public void addElement(Object obj) {
        if (size == array.length) {

        	int newCapacity = 2 * size;	
            Object[] newArray = new Object[newCapacity];

            for (int i = 1; i < size; i++)
                newArray[i] = array[i]; 

            array = newArray;
        }
        
        array[size++] = obj;
    }

    public Object removeElement() {
        Object obj = array[--size];                                   

        if (size <= array.length / 2) {                      
            int newCapacity = array.length / 2;
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++)
                newArray[i] = array[i];

            array = newArray;
        }

        return obj;
    }

    public void setElementAt(int index, Object obj) {
        array[index+1] = obj;
    }

    public Object elementAt(int index) {
        return array[index];
    }

    public Object firstElement() {
        return array[0];
    }

    public Object lastElement() {
        return array[size - 1];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }
    
    public void removeAllElements() {
        this.size = 0;
        this.array = new Object[0];
    } 
}