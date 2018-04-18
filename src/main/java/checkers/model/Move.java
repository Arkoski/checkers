package checkers.model;

import checkers.view.ConsoleView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Move {

    public static void move(String[] fromTo, String[][] array) {

        Integer[] fromField = split(fromTo[0]);
        Integer[] toField = split(fromTo[1]);

        if (Math.abs(fromField[0] - toField[0]) == 1) {
            array[toField[0]][toField[1]] = array[fromField[0]][fromField[1]];
            array[fromField[0]][fromField[1]] = " ";
        } else if (Math.abs(fromField[0] - toField[0]) == 2) {

            Integer X = fromField[0] - ((fromField[0] - toField[0]) / 2);
            Integer Y = fromField[1] - ((fromField[1] - toField[1]) / 2);
            array[toField[0]][toField[1]] = array[fromField[0]][fromField[1]];
            array[X][Y] = " ";
            array[fromField[0]][fromField[1]] = " ";
        }


        //return array;
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


//    public static void move(String[] fromTo, String[][] array) {
//        String[] temp = {"B8", "D8", "F8", "H8", "A7", "C7", "E7", "G7", "B6", "D6", "F6", "H6", "A5", "C5", "E5", "G5",
//                "B4", "D4", "F4", "H4", "A3", "C3", "E3", "G3", "B2", "D2", "F2", "H2", "A1", "C1", "E1", "G1"};
//        List<String> availAbleMoves = Arrays.asList(temp);
//        if (availAbleMoves.contains(fromTo[0]) && availAbleMoves.contains(fromTo[1])){
//            Integer[] fromField = split(fromTo[0]);
//            Integer[] toField = split(fromTo[1]);
//            if (array[fromField[0]][fromField[1]] == null) {
//                System.out.println("Ruch nieprawidlowy");
//            } else {
//                if (Math.abs(fromField[0] - toField[0]) == 1) {
//                    if (array[toField[0]][toField[1]] != null && array[toField[0]][toField[1]] == " ") {
//                        array[toField[0]][toField[1]] = array[fromField[0]][fromField[1]];
//                        array[fromField[0]][fromField[1]] = " ";
//                    } else {
//                        System.out.println("Ruch nieprawidlowy");
//                    }
//
//                } else if (Math.abs(fromField[0] - toField[0]) == 2) {
//                    Integer X = fromField[0] - ((fromField[0] - toField[0]) / 2);
//                    Integer Y = fromField[1] - ((fromField[1] - toField[1]) / 2);
//
//                    if ((array[X][Y] != null || array[X][Y] != " ")
//                            && array[toField[0]][toField[1]] != null && array[toField[0]][toField[1]] == " "
//                            && array[X][Y] != array[fromField[0]][fromField[1]]) {
//                        array[toField[0]][toField[1]] = array[fromField[0]][fromField[1]];
//                        array[X][Y] = " ";
//                        array[fromField[0]][fromField[1]] = " ";
//                    } else {
//                        System.out.println("Ruch nieprawidlowy");
//                    }
//                } else {
//                    System.out.println("Ruch nieprawidlowy");
//                }
//            }
//        }else{
//            System.out.println("Bledne pole");
//        }
//        //return array;
//    }
//
//    private static Integer[] split(String value) {
//        String[] entry = value.split("");
//        Integer[] result = new Integer[2];
//        String[] temp = {"A", "B", "C", "D", "E", "F", "G", "H"};
//        for (int i = 0; i < temp.length; i++) {
//            if (entry[0].equals(temp[i])) {
//                result[0] = i;
//                result[1] = 8 - Integer.parseInt(entry[1]);
//            }
//        }
//        return result;
//    }

//    private static void swap2dArray(Board board,Integer[] from, Integer[] to){
//        String temp = board.getBoard()[from[0]][from[1]];
//        board.getBoard()[to[0]][to[1]] = board.getBoard()[from[0]][from[1]];
//
//
//    }

}
