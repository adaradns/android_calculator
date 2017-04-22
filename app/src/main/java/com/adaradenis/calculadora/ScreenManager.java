package com.adaradenis.calculadora;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Adara on 4/7/2017.
 */
public class ScreenManager {

     TextView txtEtiqueta1;
     Button  btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6,
            btnNum7, btnNum8, btnNum9,btnNum0,
            btnIgual, btnSumar, btnResta, btnMultiplicacion,
            btnDivision, btnLimpiar, btnPunto;


    public ScreenManager(Activity a, View.OnClickListener buttonsListener)
    {
        // obtener los objetos con findviewbyid sobre el objeto "a"
        txtEtiqueta1 = (TextView) a.findViewById(R.id.txtEtiqueta1);
        btnLimpiar = (Button) a.findViewById(R.id.btnLimpiar);
        btnIgual = (Button) a.findViewById(R.id.btnIgual);
        btnMultiplicacion = (Button) a.findViewById(R.id.btnMultiplicacion);
        btnDivision = (Button) a.findViewById(R.id.btnDividir);
        btnResta = (Button) a.findViewById(R.id.btnResta);
        btnSumar = (Button) a.findViewById(R.id.btnSuma);
        btnPunto = (Button) a.findViewById(R.id.btnPunto);
        btnNum0 = (Button) a.findViewById(R.id.btnNum0);
        btnNum1 = (Button) a.findViewById(R.id.btnNum1);
        btnNum2 = (Button) a.findViewById(R.id.btnNum2);
        btnNum3 = (Button) a.findViewById(R.id.btnNum3);
        btnNum4 = (Button) a.findViewById(R.id.btnNum4);
        btnNum5 = (Button) a.findViewById(R.id.btnNum5);
        btnNum6 = (Button) a.findViewById(R.id.btnNum6);
        btnNum7 = (Button) a.findViewById(R.id.btnNum7);
        btnNum8 = (Button) a.findViewById(R.id.btnNum8);
        btnNum9 = (Button) a.findViewById(R.id.btnNum9);


        // setear como listener de los botones obtenidos, al objeto "buttonsListener" (que es el controller)

        btnLimpiar.setOnClickListener(buttonsListener);
        btnIgual.setOnClickListener(buttonsListener);
        btnMultiplicacion.setOnClickListener(buttonsListener);
        btnDivision.setOnClickListener(buttonsListener);
        btnResta.setOnClickListener(buttonsListener);
        btnSumar.setOnClickListener(buttonsListener);
        btnPunto.setOnClickListener(buttonsListener);
        btnNum0.setOnClickListener(buttonsListener);
        btnNum1.setOnClickListener(buttonsListener);
        btnNum2.setOnClickListener(buttonsListener);
        btnNum3.setOnClickListener(buttonsListener);
        btnNum4.setOnClickListener(buttonsListener);
        btnNum5.setOnClickListener(buttonsListener);
        btnNum6.setOnClickListener(buttonsListener);
        btnNum7.setOnClickListener(buttonsListener);
        btnNum8.setOnClickListener(buttonsListener);
        btnNum9.setOnClickListener(buttonsListener);
    }



    public void mostrarNumero(String numero)
    {
        txtEtiqueta1.setText(numero);
    }

    public int getNumeroEnDisplay()
    {
        // devolver el numero que se muestra en el textview convertido a int
        int num = 0;

        try {
            num = Integer.parseInt(txtEtiqueta1.getText().toString());
        }catch (Exception e){
            txtEtiqueta1.setText("0");
        }

        return num;
    }
}
