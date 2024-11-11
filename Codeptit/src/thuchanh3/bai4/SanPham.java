/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai4;

/**
 *
 * @author Moment
 */
public class SanPham {
    private String id,name;
    private long price;
    private int  insuranceTime;

    public SanPham(String id, String name, long price, int insuranceTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.insuranceTime = insuranceTime;
    }

    public String getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public int getInsuranceTime() {
        return insuranceTime;
    }
    
}
