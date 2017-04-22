package com.adaradenis.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtEtiqueta1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEtiqueta1 = (TextView) findViewById(R.id.txtEtiqueta1);

        Controller controller = new Controller(txtEtiqueta1);

        ScreenManager vista = new ScreenManager(this, controller);

        controller.setScreenManager(vista);
    }

}
