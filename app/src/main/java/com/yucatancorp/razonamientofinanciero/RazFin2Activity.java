package com.yucatancorp.razonamientofinanciero;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;


public class RazFin2Activity extends AppCompatActivity {

    public double cajach;
    public double bancos;
    public double inverTmp;
    public double invent;
    public double clientes;
    public double deudoDiv;
    public double terrenos;
    public double edificios;
    public double mobyEqui;
    public double proveed;
    public double pagares;
    public double acrediv;
    public double anticlie;
    public double impxpag;
    public double hipotks;
    public double dudalp;
    public double capsol;
    public double utilret;

    public double razonCir1;
    public double pruAcida2;
    public double pruSuAcida3;
    public double razonDeuTotal4;
    public double razonApalanca5;
    public double razonDeuLP6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raz_fin2);

        final AlertDialog alertDialog = new AlertDialog.Builder(RazFin2Activity.this).create();
        alertDialog.setTitle("Alerta");
        alertDialog.setMessage("La cuenta que no tenga valor será igual a 0, esto puede afectar el resultado del análisis.\nLe recomendamos que la suma de activos sea igual a la suma de pasivos y capital contable.");
        alertDialog.setCancelable(true);
        alertDialog.show();

        final Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                alertDialog.dismiss();
                timer2.cancel();
            }
        }, 13000);

        Button botonSegundo = (Button) findViewById(R.id.botonSecundario);
        botonSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(RazFin2Activity.this, Third3Activity.class);
                startActivity(intent2);
            }
        });

        Button botonTercero = (Button) findViewById(R.id.botonTerciario);
        botonTercero.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View view) {

                EditText ed1 = (EditText)findViewById(R.id.caja);
                int cantidad = ed1.length();
                if (cantidad == 0)
                {
                    cajach = 0;
                }
                else
                {
                    cajach = Double.parseDouble(ed1.getText().toString());
                }

                EditText ed2 = (EditText)findViewById(R.id.bancos);
                int cantidad2 = ed2.length();
                if (cantidad2 == 0)
                {
                    bancos = 0;
                }
                else
                {
                    bancos = Double.parseDouble(ed2.getText().toString());
                }

                EditText ed3 = (EditText)findViewById(R.id.inversionesTemp);
                int cantidad3 = ed3.length();
                if (cantidad3 == 0)
                {
                    inverTmp = 0;
                }
                else
                {
                    inverTmp = Double.parseDouble(ed3.getText().toString());
                }

                EditText ed4 = (EditText)findViewById(R.id.inventario);
                int cantidad4 = ed4.length();
                if (cantidad4 == 0)
                {
                    invent = 0;
                }
                else
                {
                    invent = Double.parseDouble(ed4.getText().toString());
                }

                EditText ed5 = (EditText)findViewById(R.id.clientes);
                int cantidad5 = ed5.length();
                if (cantidad5 == 0)
                {
                    clientes = 0;
                }
                else
                {
                    clientes = Double.parseDouble(ed5.getText().toString());
                }

                EditText ed6 = (EditText)findViewById(R.id.deudoresDiversos);
                int cantidad6 = ed6.length();
                if (cantidad6 == 0)
                {
                    deudoDiv = 0;
                }
                else
                {
                    deudoDiv = Double.parseDouble(ed6.getText().toString());
                }

                EditText ed7 = (EditText)findViewById(R.id.terrenos);
                int cantidad7 = ed7.length();
                if (cantidad7 == 0)
                {
                    terrenos = 0;
                }
                else
                {
                    terrenos = Double.parseDouble(ed7.getText().toString());
                }

                EditText ed8 = (EditText)findViewById(R.id.edificios);
                int cantidad8 = ed8.length();
                if (cantidad8 == 0)
                {
                    edificios = 0;
                }
                else
                {
                    edificios = Double.parseDouble(ed8.getText().toString());
                }

                EditText ed9 = (EditText)findViewById(R.id.mobiliarioyEquipo);
                int cantidad9 = ed9.length();
                if (cantidad9 == 0)
                {
                    mobyEqui = 0;
                }
                else
                {
                    mobyEqui = Double.parseDouble(ed9.getText().toString());
                }

                EditText ed10 = (EditText)findViewById(R.id.proveedores);
                int cantidad10 = ed10.length();
                if (cantidad10 == 0)
                {
                    proveed = 0;
                }
                else
                {
                    proveed = Double.parseDouble(ed10.getText().toString());
                }

                EditText ed11 = (EditText)findViewById(R.id.documentosXPagar);
                int cantidad11 = ed11.length();
                if (cantidad11 == 0)
                {
                    pagares = 0;
                }
                else
                {
                    pagares = Double.parseDouble(ed11.getText().toString());
                }

                EditText ed12 = (EditText)findViewById(R.id.acreedoresDiversos);
                int cantidad12 = ed12.length();
                if (cantidad12 == 0)
                {
                    acrediv = 0;
                }
                else
                {
                    acrediv = Double.parseDouble(ed12.getText().toString());
                }

                EditText ed13 = (EditText)findViewById(R.id.anticipoDeClientes);
                int cantidad13 = ed13.length();
                if (cantidad13 == 0)
                {
                    anticlie = 0;
                }
                else
                {
                    anticlie = Double.parseDouble(ed13.getText().toString());
                }

                EditText ed14 = (EditText)findViewById(R.id.impuestosPorPagar);
                int cantidad14 = ed14.length();
                if (cantidad14 == 0)
                {
                    impxpag = 0;
                }
                else
                {
                    impxpag = Double.parseDouble(ed14.getText().toString());
                }

                EditText ed15 = (EditText)findViewById(R.id.hipotecas);
                int cantidad15 = ed15.length();
                if (cantidad15 == 0)
                {
                    hipotks = 0;
                }
                else
                {
                    hipotks = Double.parseDouble(ed15.getText().toString());
                }

                EditText ed16 = (EditText)findViewById(R.id.deudasLargoPlazo);
                int cantidad16 = ed16.length();
                if (cantidad16 == 0)
                {
                    dudalp = 0;
                }
                else
                {
                    dudalp = Double.parseDouble(ed16.getText().toString());
                }

                EditText ed17 = (EditText)findViewById(R.id.capitalSocial);
                int cantidad17 = ed17.length();
                if (cantidad17 == 0)
                {
                    capsol = 0;
                }
                else
                {
                    capsol = Double.parseDouble(ed17.getText().toString());
                }

                EditText ed18 = (EditText)findViewById(R.id.utilidadesRetenidas);
                int cantidad18 = ed18.length();
                if (cantidad18 == 0)
                {
                    utilret = 0;
                }
                else
                {
                    utilret = Double.parseDouble(ed18.getText().toString());
                }

                razonCir1 = (cajach + bancos + invent + invent + clientes + deudoDiv)/(proveed + pagares + acrediv + anticlie + impxpag);
                pruAcida2 = razonCir1 - invent;
                pruSuAcida3 = bancos / (proveed + pagares + acrediv + anticlie + impxpag);
                razonDeuTotal4 = (proveed + pagares + acrediv + anticlie + impxpag + hipotks + dudalp) / (cajach + bancos + invent + invent + clientes + deudoDiv + terrenos + edificios + mobyEqui);
                razonApalanca5 = (proveed + pagares + acrediv + anticlie + impxpag + hipotks + dudalp) / (capsol + utilret);
                razonDeuLP6 = (cajach + bancos + invent + invent + clientes + deudoDiv)-(proveed + pagares + acrediv + anticlie + impxpag);

                String razonCir = String.format("%.2f", razonCir1);
                String pruAcida = String.format("%.2f", pruAcida2);
                String pruSuAcida = String.format("%.2f", pruSuAcida3);
                String razonDeuTotal = String.format("%.2f", razonDeuTotal4);
                String razonApalanca = String.format("%.2f", razonApalanca5);
                String razonDeuLP = String.format("%.2f", razonDeuLP6);

                Intent intentMD = new Intent(RazFin2Activity.this, Fourth4Activity.class);
                intentMD.putExtra("razonCir", razonCir);
                intentMD.putExtra("pruAcida", pruAcida);
                intentMD.putExtra("pruSuAcida", pruSuAcida);
                intentMD.putExtra("razonDeuTotal", razonDeuTotal);
                intentMD.putExtra("razonApalanca", razonApalanca);
                intentMD.putExtra("razonDeuLP", razonDeuLP);
                startActivity(intentMD);
            }
        });

    }


}
