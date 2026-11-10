import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftLeft(int [] array, int move)
    {
        int [] tempArr = Arrays.copyOfRange(array, 0, move);
        for (int i = move; i<array.length; i++)
            array[i-move] = array[i];
        for (int i=0; i<tempArr.length;i++)
            array[array.length - move + i] = tempArr[i];
        return array;
    }
    public static int[] shiftRight(int [] array, int move)
    {
        int [] tempArr = Arrays.copyOfRange(array, array.length-move, array.length);
        for (int i = array.length-1; i>=move; i--)
            array[i] = array[i-move];
        for (int i=0; i<tempArr.length;i++)
            array[i] = tempArr[i];
        return array;
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0)
            return array;

        if (move > array.length)
            move = move%array.length;
        else if (move < -array.length)
            move = move%array.length;

        if (direction == 'L' && move > 0)
            return shiftLeft(array, move);
        else if (direction == 'R' && move > 0)
                return shiftRight(array, move);
            else if (direction == 'L' && move < 0)
                return shiftRight(array, -move);
                else if (direction == 'R' && move < 0)
                    return shiftLeft(array, -move);
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}