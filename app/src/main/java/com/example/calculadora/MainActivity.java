package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv_opera;
    TextView txtv_resultado;
    Button btnClear;
    String txt_operacion;
    double oper1, oper2, res, ans;
    int n, ope, ver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtv_opera = findViewById(R.id.txtvOpera);
        txtv_resultado = findViewById(R.id.txtvRes);
        btnClear = findViewById(R.id.btnAC);
        txtv_opera.setText("");
        txtv_resultado.setText("");
        oper1 = 0.0;
        oper2 = 0.0;
        res = 0.0;
        ans=0.0;
        ver=0;

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    txt_operacion = "";
                    txtv_opera.setText(txt_operacion);
                    txtv_resultado.setText(txt_operacion);
                    oper1 = 0.0;
                    oper2 = 0.0;
                    res = 0.0;
                } catch (IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }
                return;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mAcerca:
                mostrarSeleccionAc();
                break;
            case R.id.mCerrar:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void mostrarSeleccionAc() {
        Intent inSeleccion = new Intent(this, AcercaDe.class);
        startActivity(inSeleccion);
    }

    public void onClick(View v) {
        int seleccion = v.getId();
        txt_operacion = txtv_opera.getText().toString();
        if(txt_operacion=="Error"){
            txt_operacion="";
            txtv_opera.setText(txt_operacion);
            txtv_resultado.setText(txt_operacion);
        }
        switch (seleccion) {
            case R.id.btn0:
                txt_operacion += "0";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn1:
                txt_operacion += "1";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn2:
                txt_operacion += "2";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn3:
                txt_operacion += "3";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn4:
                txt_operacion += "4";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn5:
                txt_operacion += "5";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn6:
                txt_operacion += "6";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn7:
                txt_operacion += "7";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn8:
                txt_operacion += "8";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btn9:
                txt_operacion += "9";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btndiv:
                try {
                    oper1 = Double.parseDouble(txt_operacion);
                    txtv_resultado.setText(txt_operacion + "÷");
                    txt_operacion = "";
                    txtv_opera.setText(txt_operacion);
                } catch (NumberFormatException e) {
                    txtv_opera.setText("Error");
                }
                ope = 4;
                break;
            case R.id.btnmult:
                try {
                    oper1 = Double.parseDouble(txt_operacion);
                    txtv_resultado.setText(txt_operacion + "x");
                    txt_operacion = "";
                    txtv_opera.setText(txt_operacion);
                } catch (NumberFormatException e) {
                    txtv_opera.setText("Error");
                }
                ope = 3;
                break;
            case R.id.btnsuma:
                try {
                    oper1 = Double.parseDouble(txt_operacion);
                    txtv_resultado.setText(txt_operacion + "+");
                    txt_operacion = "";
                    txtv_opera.setText(txt_operacion);
                } catch (NumberFormatException e) {
                    txtv_opera.setText("Error");
                }
                ope = 1;
                break;
            case R.id.btnresta:
                try {
                    oper1 = Double.parseDouble(txt_operacion);
                    txtv_resultado.setText(txt_operacion + "-");
                    txt_operacion = "";
                    txtv_opera.setText(txt_operacion);
                } catch (NumberFormatException e) {
                    txtv_opera.setText("Error");
                }
                ope = 2;
                break;
            case R.id.btnpunt:
                txt_operacion += ".";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnans:
                txt_operacion += "Ans";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btnpi:
                txt_operacion += "π";
                txtv_opera.setText(txt_operacion);
                ver=1;
                break;
            case R.id.btnsin:
                txt_operacion += "sin(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btncos:
                txt_operacion += "cos(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btntan:
                txt_operacion += "tan(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnraiz:
                txt_operacion += "√(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnexp:
                txt_operacion += "^(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnpiz:
                txt_operacion += "(";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnpde:
                txt_operacion += ")";
                txtv_opera.setText(txt_operacion);
                break;
            case R.id.btnDEL:
                try {
                    txt_operacion=txtv_opera.getText().toString();
                    n=txt_operacion.length();
                    txt_operacion = txt_operacion.substring(0, n - 1);
                    txtv_opera.setText(txt_operacion);
                } catch (IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }
                break;
            case R.id.btnres:
                resultado(v);
                break;
        }
    }


    public void resultado(View v) {
        try {
            txt_operacion = txtv_opera.getText().toString();
            String aux =txtv_resultado.getText().toString();
            aux+=txt_operacion;
            txtv_resultado.setText(aux);
            oper2 = Double.parseDouble(txt_operacion);
        } catch (NumberFormatException nfe) {}
        txtv_opera.setText("");

        if (ope == 1) {
            res = oper1 + oper2;
            txtv_opera.setText(String.valueOf(res));
            ver=0;

        } else if (ope == 2) {
            res = oper1 - oper2;
            txtv_opera.setText(String.valueOf(res));
            ver=0;

        } else if (ope == 3) {
            res = oper1 * oper2;
            txtv_opera.setText(String.valueOf(res));
            ver=0;

        } else if (ope == 4) {
            if (oper2 == 0) {
                txtv_opera.setText("Error");
            } else {
                res = oper1 / oper2;
                txtv_opera.setText(String.valueOf(res));
                ver=0;
            }
        }
    }

    public void verificar(View v) {
        if (ver!=0){
            resultado(v);
        }
    }



}




