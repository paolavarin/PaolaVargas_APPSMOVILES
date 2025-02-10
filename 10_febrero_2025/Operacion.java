public class Operacion {
    private Double operando1;
    private Double operando2;
    private String tipoOperacion;

    public Operacion(Double operando1, Double operando2, String tipoOperacion) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.tipoOperacion = tipoOperacion;
    }

    public Double getOperando1() {
        return operando1;
    }

    public Double getOperando2() {
        return operando2;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }
}

