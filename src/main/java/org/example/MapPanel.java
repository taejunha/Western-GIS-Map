package org.example;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {
    private static JScrollPane mapScroll;
    private static int floorNum;
    private static JLabel imageLabel;
    String buildingCode;

    MapPanel() {
        this.buildingCode = Maps.getBuildingCode();
        setLayout(new BorderLayout());
        floorNum = 1;

        imageLabel = new JLabel(new ImageIcon("./data/maps/"+buildingCode+"/"+buildingCode+floorNum+".png"));
        mapScroll = new JScrollPane(imageLabel);

        add(mapScroll);
    }
    public static JScrollPane getMapScroll() {
        return mapScroll;
    }
    public static void setFloorNum(int i) {
        floorNum = i;
    }
    public static int getFloorNum() {
        return floorNum;
    }
    public static JLabel getImageLabel() {
        return imageLabel;
    }
}
