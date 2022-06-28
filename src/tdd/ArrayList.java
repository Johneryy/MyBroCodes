package tdd;

public class ArrayList implements List{
    private int size;
    private int capacity = 5;
    private String[] elements = new String[capacity];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        if(size == capacity-1) {
            int oldCap = capacity;
            capacity*=2;
            String [] freshArray = new String[capacity];
            System.arraycopy(elements,0,
                    freshArray,0,oldCap);
            elements = freshArray;
        }
        elements[size++] = item;
    }

    @Override
    public  void remove(String item) {
        for (int i = 0; i < size; i++) {
            if(item == elements[i]) {
                for (int j = i; j < size; j++) {
                    elements[j] = elements[j + 1];
                }
            }
        }
        size--;
    }
    @Override
    public int size() {
      return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return capacity;
    }
}
