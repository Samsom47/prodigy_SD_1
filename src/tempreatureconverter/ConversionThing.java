/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tempreatureconverter;

/**
 *
 * @author user
 */
public class ConversionThing {

    private double amount;
    private double T_k;
    private double T_c;
    private double T_f;

    public double kelvinToCelsius() {
        T_c = amount - 273;
        return T_c;
    }

    public double celciusToKelvin() {
        T_k = amount + 273;
        return T_k;
    }

    public double fahrenheitToCelcius() {
        T_c = ((amount - 32) * 5) / 9;
        return T_c;
    }

    public double celciusToFahrenheit() {
        T_f = (amount * 9 / 5) + 32;
        return T_f;
    }

    public double kelvinToFahrenheit() {
        T_f = ((amount - 273) * 9 / 5) + 32;
        return T_f;
    }

    public double fahrenheitToKelvin() {
        T_k = ((amount - 32) * 5 / 9) + 273;
        return T_k;
    }

    public ConversionThing(double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public double T_k() {
        return T_k;
    }

    public double T_c() {
        return T_c;
    }

    public double T_f() {
        return T_f;
    }

    public void setT_k(double T_k) {
        this.T_k = T_k;
    }

    public void setT_c(double T_c) {
        this.T_c = T_c;
    }

    public void setT_f(double T_f) {
        this.T_f = T_f;
    }

    public String tostring() {
        return "" + amount + T_k + T_c + T_f;
    }

}
