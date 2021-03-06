
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
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    private Scanner keyboard;
    private int input, newInput;

    public int getNewInput() {
        return newInput;
    }

    public void setNewInput(int newInput) {
        newInput = (getInput() / 2) + 1;
        this.newInput = newInput;
    }
    private int[] asc, desc;

    public int[] getAsc() {
        return asc;
    }

    public void setAsc(int[] asc) {
        this.asc = asc;
    }

    public int[] getDesc() {
        return desc;
    }

    public void setDesc(int[] desc) {
        this.desc = desc;
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        System.out.print("Input Param : ");
        this.keyboard = keyboard;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void display() {
        for (int i = 0; i <= getNewInput() - 1; i++) {
            System.out.println(getAsc()[i] + "+" + getDesc()[i]);
        }
    }

    public void inputAscDesc() {
        for (int i = 0; i <= getInput() / 2; i++) {
            asc[i] = i;
            desc[i] = getInput() - i;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Soal1 soalSatu = new Soal1();
        soalSatu.setKeyboard(new Scanner(System.in));
        soalSatu.setInput(soalSatu.getKeyboard().nextInt());
        soalSatu.setNewInput(soalSatu.getInput());
        soalSatu.setAsc(new int[soalSatu.getNewInput()]);
        soalSatu.setDesc(new int[soalSatu.getNewInput()]);
        soalSatu.inputAscDesc();
        soalSatu.display();
    }
}
