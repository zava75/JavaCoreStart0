package lesson13_CustomCollections;

import java.util.Arrays;

public class MyArrayString {
    private int size = 0;
    private String[] array = new String[10];

    public void addString(String string) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        } else if (size < array.length) {
            array[size] = string;
            size++;
        }
    }

    public void removeString(String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(string)) {
                array[i] = null; // Заменяем строку на null
//                break; // Завершаем поиск, если нужно удалить только первое вхождение
            }
        }
    }

    public void removeStringAtIndex(int index) {
        if(index >= 0 && index < array.length) {
            array[index] = null;
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String getStringAtIndex(int index) {
        if(index >= 0 && index < array.length) {
            return array[index];
        }
        return "INDEX BEYOND THE ARRAY IS NULL";
    }

    @Override
    public String toString() {
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(array.length);
        return super.toString();
    }
}
