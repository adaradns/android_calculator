package com.adaradenis.calculadora;

import android.view.View;
import android.widget.TextView;



/**
 * Created by Adara on 3/29/2017.
 */
public class Controller  implements View.OnClickListener {

    private TextView txtEtiqueta1;
    private int valor;
    private boolean suma = false;
    private boolean resta = false;
    private boolean division = false;
    private boolean multiplicacion = false;
    Integer[] num = new Integer[10];
    int resultado = 0;

    private ScreenManager screenManager;



    public Controller(TextView txtEtiqueta1) {
        this.txtEtiqueta1 = txtEtiqueta1;
    }

    public void setScreenManager(ScreenManager sm) {
        this.screenManager = sm;
    }


    @Override
    public void onClick(View view) {
        valor = view.getId();
        String capturaValor = String.valueOf(screenManager.getNumeroEnDisplay());

        try {
            switch (valor) {

                case R.id.btnNum0:
                    screenManager.mostrarNumero(capturaValor + "0");
                    break;
                case R.id.btnNum1:
                    screenManager.mostrarNumero(capturaValor + "1");
                    break;
                case R.id.btnNum2:
                    screenManager.mostrarNumero(capturaValor + "2");
                    break;
                case R.id.btnNum3:
                    screenManager.mostrarNumero(capturaValor + "3");
                    break;
                case R.id.btnNum4:
                    screenManager.mostrarNumero(capturaValor + "4");
                    break;
                case R.id.btnNum5:
                    screenManager.mostrarNumero(capturaValor + "5");
                    break;
                case R.id.btnNum6:
                    screenManager.mostrarNumero(capturaValor + "6");
                    break;
                case R.id.btnNum7:
                    screenManager.mostrarNumero(capturaValor + "7");
                    break;
                case R.id.btnNum8:
                    screenManager.mostrarNumero(capturaValor + "8");
                    break;
                case R.id.btnNum9:
                    screenManager.mostrarNumero(capturaValor + "9");
                    break;
                case R.id.btnPunto:
                    screenManager.mostrarNumero(capturaValor + ".");
                    break;
                case R.id.btnDividir:
                    division = true;
                    num[0] = Integer.parseInt(capturaValor);
                    screenManager.mostrarNumero("");
                    break;
                case R.id.btnMultiplicacion:
                    multiplicacion = true;
                    num[0] = Integer.parseInt(capturaValor);
                    screenManager.mostrarNumero("");
                    break;
                case R.id.btnResta:
                    resta = true;
                    num[0] = Integer.parseInt(capturaValor);
                    screenManager.mostrarNumero("");
                    break;
                case R.id.btnSuma:
                    suma = true;
                    num[0] = Integer.parseInt(capturaValor);
                    screenManager.mostrarNumero("");
                    break;
                case R.id.btnIgual:
                    num[1] = Integer.parseInt(capturaValor);
                    if (suma == true) {
                        resultado = num[0] + num[1];
                        screenManager.mostrarNumero(String.valueOf(resultado));
                        screenManager.getNumeroEnDisplay();
                    } else if (resta == true) {
                        resultado = num[0] - num[1];
                        screenManager.mostrarNumero(String.valueOf(resultado));
                    } else if (division == true) {
                        resultado = num[0] / num[1];
                        screenManager.mostrarNumero(String.valueOf(resultado));
                        screenManager.getNumeroEnDisplay();
                    } else if (multiplicacion == true) {
                        resultado = num[0] * num[1];
                        screenManager.mostrarNumero(String.valueOf(resultado));
                        screenManager.getNumeroEnDisplay();
                    }

                    suma = false;
                    resta = false;
                    division = false;
                    multiplicacion = false;
                    break;
                case R.id.btnLimpiar:
                    screenManager.mostrarNumero("");
                    break;

            }

        } catch (Exception e) {
            screenManager.mostrarNumero("Error");
        }


    }

}
