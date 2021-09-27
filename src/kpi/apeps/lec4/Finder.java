package kpi.apeps.lec4;

/**
 * Клас з узагальненим методом
 */
public class Finder {
    static <T extends Number, V extends T> boolean isIn(T t, V[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])) return true;
        }
    return false;
    }
}
