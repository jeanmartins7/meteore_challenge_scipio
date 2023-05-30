package model;

import lombok.Getter;
import model.domain.Meteore;
import model.domain.Mountain;
import model.domain.Star;
import model.domain.Water;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import static model.LoadImageApp.getImg;

@Getter
public class Calculator {
    private ArrayList<Star> stars;
    private ArrayList<Meteore> meteores;
    private ArrayList<Water> waters;
    private ArrayList<Mountain> mountains;

    public Calculator() {
        this.stars = new ArrayList<>();
        this.meteores = new ArrayList<>();
        this.waters = new ArrayList<>();
        this.mountains = new ArrayList<>();

        BufferedImage image = getImg();
        int width = image.getWidth();
        int height = image.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height ; y++) {

                int rgb = image.getRGB(x, y);

                int red   = (rgb >>> 16) & 0xFF;
                int green = (rgb >>>  8) & 0xFF;
                int blue  = (rgb >>>  0) & 0xFF;

                if (image.getRGB(x, y) == 0xFFFF0000) {
                    meteores.add(new Meteore(x, y));
                }

            }
        }

    }




}
