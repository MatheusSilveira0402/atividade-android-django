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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    EditText editnome_carta, editatributo, editlink_nivel, edittipo_monstro, edittipo_carta, editataque, editdefesa, edittexto_carta;
    TextView TextResutado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextResutado = findViewById(R.id.TextResutado);
        editnome_carta = findViewById(R.id.editnome_carta);
        editatributo = findViewById(R.id.editatributo);
        editlink_nivel = findViewById(R.id.editlink_nivel);
        edittipo_monstro = findViewById(R.id.edittipo_monstro);
        edittipo_carta = findViewById(R.id.edittipo_carta);
        editataque = findViewById(R.id.editataque);
        editdefesa = findViewById(R.id.editdefesa);
        edittexto_carta = findViewById(R.id.edittexto_carta);
    }


    public void Cadastrarcartaespecial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasespesial/";

        JSONObject obj = new JSONObject();
        try {
            obj.put("nome_carta", editnome_carta.getText().toString());
            obj.put("atributo", editatributo.getText().toString());
            obj.put("link_nivel", editlink_nivel.getText().toString());
            obj.put("tipo_monstro", edittipo_monstro.getText().toString());
            obj.put("tipo_carta", edittipo_carta.getText().toString());
            obj.put("ataque", editataque.getText().toString());
            obj.put("defesa", editdefesa.getText().toString());
            obj.put("texto_carta", edittexto_carta.getText().toString());



        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url,obj,
                new Response.Listener<JSONObject>() {
                    @Override


                    public void onResponse(JSONObject response) {
                        String cartas = response.toString();

                        try {
                         JSONObject obj = new JSONObject(cartas);
                         Cartas cart = new Cartas();

                         if(obj.has("nome_carta")){
                             cart.setNome_carta(obj.getString("nome_carta"));
                             cart.setAtributo(obj.getString("atributo"));
                             cart.setNivel(obj.getString("link_nivel"));
                             cart.setTipo_monstro(obj.getString("tipo_monstro"));
                             cart.setTipo_carta(obj.getString("tipo_carta"));
                             cart.setAtaque(obj.getString("ataque"));
                             cart.setDefesa(obj.getString("defesa"));
                             cart.setTexto_carta(obj.getString("texto_carta"));
                            }
                            TextResutado.setText(cart.toStringcardespecial());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        TextResutado.setText(error.getMessage());
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


    public void Cadastrarcartaestrutural(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasestrutural/";

        JSONObject obj = new JSONObject();
        try {
            obj.put("nome_carta", editnome_carta.getText().toString());
            obj.put("atributo", editatributo.getText().toString());
            obj.put("nivel", editlink_nivel.getText().toString());
            obj.put("tipo_monstro", edittipo_monstro.getText().toString());
            obj.put("tipo_carta", edittipo_carta.getText().toString());
            obj.put("ataque", editataque.getText().toString());
            obj.put("defesa", editdefesa.getText().toString());
            obj.put("texto_carta", edittexto_carta.getText().toString());



        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url,obj,
                new Response.Listener<JSONObject>() {
                    @Override


                    public void onResponse(JSONObject response) {
                        String cartas = response.toString();

                        try {
                            JSONObject obj = new JSONObject(cartas);
                            Cartas cart = new Cartas();

                            if(obj.has("nome_carta")){
                                cart.setNome_carta(obj.getString("nome_carta"));
                                cart.setAtributo(obj.getString("atributo"));
                                cart.setNivel(obj.getString("nivel"));
                                cart.setTipo_monstro(obj.getString("tipo_monstro"));
                                cart.setTipo_carta(obj.getString("tipo_carta"));
                                cart.setAtaque(obj.getString("ataque"));
                                cart.setDefesa(obj.getString("defesa"));
                                cart.setTexto_carta(obj.getString("texto_carta"));
                            }
                            TextResutado.setText(cart.toStringcardestrutural());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        TextResutado.setText(error.getMessage());
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

    public void Cadastrarcartainicial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasinicial/";

        JSONObject obj = new JSONObject();
        try {
            obj.put("nome_carta", editnome_carta.getText().toString());
            obj.put("atributo", editatributo.getText().toString());
            obj.put("nivel", editlink_nivel.getText().toString());
            obj.put("tipo_monstro", edittipo_monstro.getText().toString());
            obj.put("tipo_carta", edittipo_carta.getText().toString());
            obj.put("ataque", editataque.getText().toString());
            obj.put("defesa", editdefesa.getText().toString());
            obj.put("texto_carta", edittexto_carta.getText().toString());



        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url,obj,
                new Response.Listener<JSONObject>() {
                    @Override


                    public void onResponse(JSONObject response) {
                        String cartas = response.toString();

                        try {
                            JSONObject obj = new JSONObject(cartas);
                            Cartas cart = new Cartas();

                            if(obj.has("nome_carta")){
                                cart.setNome_carta(obj.getString("nome_carta"));
                                cart.setAtributo(obj.getString("atributo"));
                                cart.setNivel(obj.getString("nivel"));
                                cart.setTipo_monstro(obj.getString("tipo_monstro"));
                                cart.setTipo_carta(obj.getString("tipo_carta"));
                                cart.setAtaque(obj.getString("ataque"));
                                cart.setDefesa(obj.getString("defesa"));
                                cart.setTexto_carta(obj.getString("texto_carta"));
                            }
                            TextResutado.setText(cart.toStringcardinical());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        TextResutado.setText(error.getMessage());
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