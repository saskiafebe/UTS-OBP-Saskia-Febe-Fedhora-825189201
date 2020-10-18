package com.konversisuhu;

public class kelvin {
    double tofahrenheit() {
        return konversisuhu.suhu * 1.8D - 459.67D;
    }

    double toreamur() {
        return (konversisuhu.suhu - 273.15D) * 0.8D;
    }

    double tocelcius() {
        return konversisuhu.suhu - 273.15D;
    }
}