
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangu
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    private static int code;
    private static Scanner keyboard;
    private static int input;

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Soal3.code = code;
    }

    public static Scanner getKeyboard() {
        return keyboard;
    }

    public static void setKeyboard(Scanner keyboard) {
        Soal3.keyboard = keyboard;
    }

    public static int getInput() {
        return input;
    }

    public static void setInput(int input) {
        Soal3.input = input;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Soal3 soalTiga = new Soal3();
        Soal3.setKeyboard(new Scanner(System.in));
        Soal3.setInput(Soal3.getKeyboard().nextInt());
        System.out.println(input);
        System.out.println(getCodeMessage(input));
    }

    public static String getCodeMessage(int input) {
        return switch (input) {
            case 5 ->
                "Error Other";
            case 68 ->
                "Error Timeout";
            case 14 ->
                "Error Unknown Subscriber";
            case 63 ->
                "Error No Payment";
            case 89 ->
                "Error Bill Not Available";
            default ->
                "Uknown code";
        };
    }

}
