package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity3 extends AppCompatActivity {

    TextView textResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textResults = findViewById(R.id.textResults);
    }

    public void listadeckespecial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasespesial/";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Cartas cartas  = new Cartas();



                        try {
                            JSONArray listar = response.getJSONArray("results");
                            for(int i = 0; i < listar.length(); i++) {

                                String lista = listar.getString(i);

                                JSONObject obj = new JSONObject(lista);

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("link_nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));

                                String nome = cartas.toStringlistarespecial();
                                cartas.addlista(nome);


                            }
                            textResults.setText(cartas.toStringlista());
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

    public void listardeckestrutural(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasestrutural/";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Cartas cartas  = new Cartas();



                        try {
                            JSONArray listar = response.getJSONArray("results");
                            for(int i = 0; i < listar.length(); i++) {

                                String lista = listar.getString(i);

                                JSONObject obj = new JSONObject(lista);

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));
                                String nome = cartas.toStringlistarestrutural();

                                cartas.addlista(nome);


                            }

                            textResults.setText(cartas.toStringlista());
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

    public void listardeckinicial(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://matheus.tech4every1.com.br:8000/cartasinicial/";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Cartas cartas  = new Cartas();



                        try {
                            JSONArray listar = response.getJSONArray("results");
                            for(int i = 0; i < listar.length(); i++) {

                                String lista = listar.getString(i);

                                JSONObject obj = new JSONObject(lista);

                                cartas.setNome_carta(obj.getString("nome_carta"));
                                cartas.setAtributo(obj.getString("atributo"));
                                cartas.setNivel(obj.getString("nivel"));
                                cartas.setTipo_monstro(obj.getString("tipo_monstro"));
                                cartas.setTipo_carta(obj.getString("tipo_carta"));
                                cartas.setAtaque(obj.getString("ataque"));
                                cartas.setDefesa(obj.getString("defesa"));
                                cartas.setTexto_carta(obj.getString("texto_carta"));

                                String nome = cartas.toStringlistarinicial();
                                cartas.addlista(nome);


                            }
                            textResults.setText(cartas.toStringlista());
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