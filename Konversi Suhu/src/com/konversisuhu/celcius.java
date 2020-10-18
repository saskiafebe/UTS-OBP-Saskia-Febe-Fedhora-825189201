package com.konversisuhu;

public class celcius {
    double tofahrenheit() {
        return konversisuhu.suhu * 1.8D + 32.0D;
    }

    double toreamur() {
        return konversisuhu.suhu * 0.8D;
    }

    double tokelvin() {
        return konversisuhu.suhu + 273.15D;
    }
}