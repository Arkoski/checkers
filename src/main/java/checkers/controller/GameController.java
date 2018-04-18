package checkers.controller;

import java.util.Arrays;
import java.util.List;

public class GameController {

    public boolean controller(String[] fromTo, String[][] array) {
        String[] temp = {"B8", "D8", "F8", "H8", "A7", "C7", "E7", "G7", "B6", "D6", "F6", "H6", "A5", "C5", "E5", "G5",
                "B4", "D4", "F4", "H4", "A3", "C3", "E3", "G3", "B2", "D2", "F2", "H2", "A1", "C1", "E1", "G1"};
        List<String> availAbleMoves = Arrays.asList(temp);
        if (availAbleMoves.contains(fromTo[0]) && availAbleMoves.contains(fromTo[1])) {
            Integer[] fromField = split(fromTo[0]);
            Integer[] toField = split(fromTo[1]);
            if (array[fromField[0]][fromField[1]] == null) {
                return false;
            } else {
                if (Math.abs(fromField[0] - toField[0]) == 1) {
                    if (array[toField[0]][toField[1]] != null && array[toField[0]][toField[1]] == " ") {
                        return true;
                    } else {
                        return false;
                    }

                } else if (Math.abs(fromField[0] - toField[0]) == 2) {
                    Integer X = fromField[0] - ((fromField[0] - toField[0]) / 2);
                    Integer Y = fromField[1] - ((fromField[1] - toField[1]) / 2);

                    if ((array[X][Y] != null || array[X][Y] != " ")
                            && array[toField[0]][toField[1]] != null && array[toField[0]][toField[1]] == " "
                            && array[X][Y] != array[fromField[0]][fromField[1]]) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    private static Integer[] split(String value) {
        String[] entry = value.split("");
        Integer[] result = new Integer[2];
        String[] temp = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int i = 0; i < temp.length; i++) {
            if (entry[0].equals(temp[i])) {
                result[0] = i;
                result[1] = 8 - Integer.parseInt(entry[1]);
            }
        }
        return result;
    }

}
