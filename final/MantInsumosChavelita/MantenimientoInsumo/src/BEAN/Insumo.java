package BEAN;

public class Insumo {
    private int IdInsumo;
    private String DescInsumo;
    private String Tipo;
    private String FechaVencimiento;
    private String FechaLLegada;
    private int Stock;
    private String Unidad;

    public Insumo() {
    }

    public Insumo(int IdInsumo, String DescInsumo, String Tipo, String FechaVencimiento, String FechaLLegada, int Stock, String Unidad) {
        this.IdInsumo = IdInsumo;
        this.DescInsumo = DescInsumo;
        this.Tipo = Tipo;
        this.FechaVencimiento = FechaVencimiento;
        this.FechaLLegada = FechaLLegada;
        this.Stock = Stock;
        this.Unidad = Unidad;
    }

    public int getIdInsumo() {
        return IdInsumo;
    }

    public void setIdInsumo(int IdInsumo) {
        this.IdInsumo = IdInsumo;
    }

    public String getDescInsumo() {
        return DescInsumo;
    }

    public void setDescInsumo(String DescInsumo) {
        this.DescInsumo = DescInsumo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getFechaLLegada() {
        return FechaLLegada;
    }

    public void setFechaLLegada(String FechaLLegada) {
        this.FechaLLegada = FechaLLegada;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }
      
}
