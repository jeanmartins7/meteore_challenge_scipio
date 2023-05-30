import model.Calculator;

import java.awt.image.BufferedImage;

import static model.LoadImageApp.getImg;

public class Main {
    public static void main(String[] args) {

        BufferedImage image = getImg();

        Calculator calculator = new Calculator();

        System.out.printf(String.valueOf(calculator.getMeteores().size()));
    }
}
