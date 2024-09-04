package com.example.lab3;

import java.util.ArrayList;
import java.util.List;

public class DeviceExpert {
    List<String> getDevices(String menu) {
        List<String> devices = new ArrayList<>();
        if (menu.equals("Laptop")) {
            devices.add("Acer Nitro 5");
            devices.add("HP Pavillion");
            devices.add("Asus ROG");
        } else if (menu.equals("Mobile")) {
            devices.add("Iphone 15");
            devices.add("Samsung Galaxy A34");
            devices.add("Pixel 8");
        }
        else if (menu.equals("Camera")) {
            devices.add("Canon EOS R6 Mark II");
            devices.add("Nikon Z 8");
            devices.add("Fujifilm X-S20");
        }
        return devices;
    }
}
