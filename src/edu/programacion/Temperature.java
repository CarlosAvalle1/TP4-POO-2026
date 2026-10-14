package edu.programacion;

public class Temperature {

    private Double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double value) {
        this.celsius = value;
    }

    public Double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public void setFahrenheit(Double value) {
        this.celsius = (value - 32) / 1.8;
    }

    public Double getKelvin() {
        return celsius + 273.15;
    }

    public void setKelvin(Double value) {
        this.celsius = value - 273.15;
    }

    public Double convertTemperature(Double value, String scale, String targetScale) {
        Double valorEnCelsius = aCelsius(value, scale.toUpperCase());
        return desdeCelsius(valorEnCelsius, targetScale.toUpperCase());
    }

    private Double aCelsius(Double valor, String escala) {
        switch (escala) {
            case "CELSIUS":
                return valor;
            case "FAHRENHEIT":
                return (valor - 32) / 1.8;
            case "KELVIN":
                return valor - 273.15;
            case "RANKINE":
                return (valor - 491.67) * 5.0 / 9.0;
            default:
                throw new IllegalArgumentException("Escala desconocida: " + escala);
        }
    }

    private Double desdeCelsius(Double valorCelsius, String escala) {
        switch (escala) {
            case "CELSIUS":
                return valorCelsius;
            case "FAHRENHEIT":
                return valorCelsius * 1.8 + 32;
            case "KELVIN":
                return valorCelsius + 273.15;
            case "RANKINE":
                return valorCelsius * 9.0 / 5.0 + 491.67;
            default:
                throw new IllegalArgumentException("Escala desconocida: " + escala);
        }
    }
}