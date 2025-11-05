import com.google.gson.annotations.SerializedName;

public class Monedas {
    @SerializedName("base_code")
    private String monedaBase;
    @SerializedName("target_code")
    private String monedaACalcular;
    @SerializedName("conversion_rate")
    private double valorUnitario;
    private double cantidad;
    private int conversion;

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaACalcular() {
        return monedaACalcular;
    }

    public void calcularConversion(){
        conversion = (int) (this.cantidad * this.valorUnitario);
    }

    @Override
    public String toString() {
        return "Moneda Base = " + monedaBase +
                ", Moneda A Calcular = " + monedaACalcular +
                ", la tasa de cambio de 1 " + monedaBase + " actualmente es de "
                + valorUnitario + " " + monedaACalcular +
                ".\n************************************************\n"
                + cantidad + " " + monedaBase + " equivalen a " + conversion + " " + monedaACalcular + "\n";
    }
}
