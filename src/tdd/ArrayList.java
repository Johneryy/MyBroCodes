package tdd;

public class ArrayList implements List{
    private final boolean isEmpty = true;
    private int size;
    private final String[] elements = new String[8];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
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

}
