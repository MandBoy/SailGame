package dk.kea.shipgame.Model;

import java.util.*;
import java.io.*;

public class Map {
    private int hexId = 1;
    private double top = 10;
    private double left;
    private final int leftF = 12;
    private List<MyImage> images = new ArrayList<>();

    public Map(Inputhandler inputhandler, Functions functions, Values values){
        topPart(images);
        middlePart(images);
        topPart(images);
        middlePart(images);
        topPart(images);
        middlePart(images);
        topPart(images);
        middlePart(images);
        topPart(images);
        middlePart(images);
        images.add(new MyImage(hexId, "Small", 10, 10));
    }
    public void topPart(List<MyImage> images) {
        for (int i = 0; i != 25; i++) {
            images.add(new MyImage(hexId, "Hexagon", top, left));
            hexId++;
            left += 23;
        }
        top += 20;
        left = leftF;
    }
    public void middlePart(List<MyImage> images){
        for (int i = 0; i != 24; i++) {
            images.add(new MyImage(hexId, "Hexagon", top, left));
            hexId++;
            left += 23;
        }
        top += 20;
        left = 0;
    }

}
