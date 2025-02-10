import java.io.*;

class CalculadoraImpl implements ICalculadora {

    @Override
    public Double Calcular(Operacion operacion) {
        System.out.println("Operando 1: " + operacion.getOperando1());
        System.out.println("Operando 2: " + operacion.getOperando2());

        Double resultado = 0.0;
        switch (operacion.getTipoOperacion()) {
            case "Suma":
                resultado = operacion.getOperando1() + operacion.getOperando2();
                break;
            case "Resta":
                resultado = operacion.getOperando1() - operacion.getOperando2();
                break;
            case "Multiplicacion":
                resultado = operacion.getOperando1() * operacion.getOperando2();
                break;
            case "Division":
                if (operacion.getOperando2() != 0) {
                    resultado = operacion.getOperando1() / operacion.getOperando2();
                } else {
                    System.out.println("Error: División por cero.");
                    return null;
                }
                break;
            default:
                System.out.println("Operación desconocida.");
                return null;
        }

        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}


