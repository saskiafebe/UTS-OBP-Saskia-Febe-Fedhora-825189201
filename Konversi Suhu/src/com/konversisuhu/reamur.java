package com.konversisuhu;

public class reamur {
    double tofahrenheit() {
        return konversisuhu.suhu * 2.25D + 32.0D;
    }

    double tokelvin() {
        return konversisuhu.suhu / 0.8D + 237.15D;
    }

    double tocelcius() {
        return konversisuhu.suhu / 0.8D;
    }
}