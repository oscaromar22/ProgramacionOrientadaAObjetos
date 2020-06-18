package IMC;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class Imc {

    private double altura;
    private double peso;

    public Imc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public ArrayList<String> OperacionesImc() {
        ArrayList<String> datos = new ArrayList<>();
        double imc = ((this.peso) / (this.altura * this.altura));
        String operacion = imc + "";
        String mensaje = "";
        datos.add(operacion);

        if (imc < 18.5) {
            mensaje = "Tu peso es Bajo";
        } else if (imc > 18.5 && imc < 25) {
            mensaje = "Tu peso es Normal";
        } else if (imc >= 25 && imc < 30) {
            mensaje = "Tu peso es Sobrepeso";
        } else if (imc >= 30) {
            mensaje = "Tu peso es Obesidad";
        }

        datos.add(mensaje);

        return datos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
