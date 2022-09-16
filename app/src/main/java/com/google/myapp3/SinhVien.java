package com.google.myapp3;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String HoTen;
    private String MSV;

    public SinhVien (String hoTen, String msv)
    {
        HoTen = hoTen;
        MSV =msv;
    }
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

}
