package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView textResults;
    EditText editNumerocarta;

    private Button button, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResults = findViewById(R.id.textResults);
        editNumerocarta = findViewById(R.id.editNumerocarta);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonActivity();
            }


        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1Activity();
            }


        });
    }
    private void buttonActivity() {

        startActivity(new Intent(MainActivity.this,  MainActivity2.class));

    }
    private void button1Activity() {

        startActivity(new Intent(MainActivity.this,  MainActivity3.class));

    }



    public void Consultardeckinicial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasinicial/"+ editNumerocarta.getText().toString();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String carta = response.toString();
                        Cartas cartas  = new Cartas();

                        cartas.setId(editNumerocarta.getText().toString());
                        try {
                            JSONObject obj = new JSONObject(carta);
                            if (obj.has("nome_carta")){

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));

                                textResults.setText(cartas.toStringconsultaincial());
                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textResults.setText(error.getMessage());
                    }
                }
        ) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("X-Api-Key", "JOXDUFCj.uUxeU4v2Im6cQ4IWFYnR8LaIwL8fFuT9");

                return params;
            }
        };
        queue.add(request);


    }

    public void Consultardeckestrutural(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasestrutural/"+ editNumerocarta.getText().toString();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String carta = response.toString();
                        Cartas cartas  = new Cartas();

                        cartas.setId(editNumerocarta.getText().toString());
                        try {
                            JSONObject obj = new JSONObject(carta);
                            if (obj.has("nome_carta")){

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));

                                textResults.setText(cartas.toStringconsultaestrutural());
                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textResults.setText(error.getMessage());
                    }
                }
        ) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("X-Api-Key", "JOXDUFCj.uUxeU4v2Im6cQ4IWFYnR8LaIwL8fFuT9");

                return params;
            }
        };
        queue.add(request);
    }


    public void Consultardeckespecial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasespesial/"+ editNumerocarta.getText().toString();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String carta = response.toString();
                        Cartas cartas  = new Cartas();

                        cartas.setId(editNumerocarta.getText().toString());
                        try {
                            JSONObject obj = new JSONObject(carta);
                            if (obj.has("nome_carta")){

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("link_nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));

                                textResults.setText(cartas.toStringconsultaespecial());
                            }



                        } catch (JSONException e) {
                            e.printStackTrace();
                        }



                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textResults.setText(error.getMessage());
                    }
                }
        ) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("X-Api-Key", "JOXDUFCj.uUxeU4v2Im6cQ4IWFYnR8LaIwL8fFuT9");

                return params;
            }
        };
        queue.add(request);
    }

}
