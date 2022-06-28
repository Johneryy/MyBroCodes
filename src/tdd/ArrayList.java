package tdd;

import java.util.Objects;

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
            if(Objects.equals(item, elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, size - i);
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
