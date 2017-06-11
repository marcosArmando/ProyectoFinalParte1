package com.yucatancorp.razonamientofinanciero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourth4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth4);

        Intent intent = getIntent();
        final String razonCirculante = intent.getStringExtra("razonCir");
        final String pruebaAcida = intent.getStringExtra("pruAcida");
        final String pruebaSuperAcida = intent.getStringExtra("pruSuAcida");
        final String razonDeudaTotal = intent.getStringExtra("razonDeuTotal");
        final String razonApalancamiento = intent.getStringExtra("razonApalanca");
        final String razonDeudaLP = intent.getStringExtra("razonDeuLP");

        Button boton1_1 = (Button) findViewById(R.id.botonrazon1);
        boton1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText0 = "Razón circulante: ";
                final String valor1f = String.format(razonCirculante);
                final String valorText1 = "Con la razón circulante, usted puede saber que tan capaz es su empresa de poder saldar sus deudas a corto plazo,\nse puede " +
                        "tomar un valor entre 1 y 2, como un indicador sano para sus finanzas. Un valor menor a 1, indicaría que no podría su empresa saldar " +
                        "las deudas que tiene a corto plazo, por otro lado, un valor mayor a 2, indicaría que cuenta con holgura financiera, lo cual podría" +
                        " verse como un exceso de efectivo no utilizado" + "\n" + "Por cada peso que debe a corto plazo, usted pueda pagar hoy " + valor1f;
                final String valorf = valorText0 + valor1f + "\n" + valorText1 + " pesos de esa deuda.";
                intent2.putExtra("valorf", valorf);
                startActivity(intent2);
            }
        });

        Button boton2_1 = (Button) findViewById(R.id.botonrazon2);
        boton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText2 = "Prueba acida: ";
                final String valor2f = String.format(pruebaAcida);
                final String valorText3 = "El ratio correspondiente a la prueba acida, tiene la misma naturaleza que la razón circulante, sin embargo, en esta ocación no se " +
                        "toma en cuenta el valor de los inventarios, es decir, las ventas a un futuro inmediato aún no se toman en cuenta para saldar la deuda que se cobraría " +
                        "a corto plazo." + "\n" + "Por cada peso que debe a corto plazo, usted pueda pagar hoy (sin tomar en cuenta inventarios), " + valor2f + " pesos de esa deuda.";
                final String valorf = valorText2 + valor2f + "\n" + valorText3;
                intent3.putExtra("valorf", valorf);
                startActivity(intent3);
            }
        });

        Button boton3_1 = (Button) findViewById(R.id.botonrazon3);
        boton3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText4 = "Prueba súper acida: ";
                final String valor3f = String.format(pruebaSuperAcida);
                final String valorText5 = "\"El ratio denomindado coomo prueba súper acida, corresponde a la capacidad de la empresa de pagar la deuda a corto plazo con el dinero " +
                        "que se tiene en efectivo y en las cuentas bancarias." + "\n" + "En esta ocación: " + "Por cada peso que debe a corto plazo, usted pueda pagar hoy " +
                        "(tomando en cuenta solo efectivo y cuentas bancarias), " + valor3f + " pesos de esa deuda.";
                final String valorf = valorText4 + valor3f + "\n" + valorText5;
                intent4.putExtra("valorf", valorf);
                startActivity(intent4);
            }
        });

        Button boton4_1 = (Button) findViewById(R.id.botonrazon4);
        boton4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText6 = "Razón de deuda total: ";
                final String valor4f = String.format(razonDeudaTotal);
                final String valorText7 = "Con la razón de deuda total, puede conocer cuanto de lo que posee la empresa en activos, está en deuda, de esa manera " +
                        "y cuanto es propiedad de la entidad." + "\n" + "Por cada peso que posee la empresa " + valor4f + " pesos corresponden a deuda.";
                final String valorf = valorText6 + valor4f + "\n" + valorText7;
                intent5.putExtra("valorf", valorf);
                startActivity(intent5);
            }
        });

        Button boton5_1 = (Button) findViewById(R.id.botonrazon5);
        boton5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText8 = "Razón de apalancamiento: ";
                final String valor5f = String.format(razonApalancamiento);
                final String valorText9 = "Para saber cuanto de la deuda total corresponde a los propietarios (accionistas). Se utiliza la razón de apalancamiento donde, " +
                        "de un peso en pasivos de la empresa, " + valor5f + "pesos corresponden a los propietarios, se podría mencionar que lo restante corresponde a la empresa." + "\n" +
                        "Esta razón financiera, al igual que las demás, es para analizar el estado de las finanzas de la empresa.";
                final String valorf = valorText8 + valor5f + "\n" + valorText9;
                intent6.putExtra("valorf", valorf);
                startActivity(intent6);
            }
        });

        Button boton6_1 = (Button) findViewById(R.id.botonrazon6);
        boton6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(Fourth4Activity.this, Third3Activity.class);
                final String valorText10 = "Razón de capital neto de trabajo: ";
                final String valor6f = String.format(razonDeudaLP);
                final String valorText11 = "La razón de capital neto de trabajo, le ayudará a saber, cuánto de la deuda a corto plazo que tiene la empresa le puede puede saldar con " +
                        "los activos circulantes que posee." + "\n" + "Por lo que, de cada peso que debe a corto plazo, su empresa pued pagar " + valor6f + "pesos." + "\n" +
                        "Un cantidad positiva sería recomendable.";
                final String valorf = valorText10 + valor6f + "\n" + valorText11;
                intent7.putExtra("valorf", valorf);
                startActivity(intent7);
            }
        });
    }
}
