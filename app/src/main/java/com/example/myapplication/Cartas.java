package com.example.myapplication;

import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class Cartas {
    private String nome_carta;
    private String atributo;
    private String nivel;
    private String tipo_monstro;
    private String tipo_carta;
    private String ataque;
    private String defesa;
    private String texto_carta;
    private String id;
    private List<String> listar;
    private List<String> listar2;


    public List<String> getListar2() {
        return listar2;
    }

    public void setListar2(List<String> listar2) {
        this.listar2 = listar2;
    }

    public Cartas(List<String> listar) {
        this.listar = listar;
    }

    public Cartas() {
        this.listar = new ArrayList<>();
        this.listar2 =new ArrayList<>();
    }
    public void addlista2(String nome){
        this.listar2.add(nome);
    }

    public void addlista(String nome){
       this.listar.add(nome);
    }
    public List<String> getListar() {
        return listar;
    }

    public void setListar(List<String> listar) {
        this.listar = listar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNome_carta() {
        return nome_carta;
    }

    public void setNome_carta(String nome_carta) {
        this.nome_carta = nome_carta;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }


    public String getTipo_monstro() {
        return tipo_monstro;
    }

    public void setTipo_monstro(String tipo_monstro) {
        this.tipo_monstro = tipo_monstro;
    }

    public String getTipo_carta() {
        return tipo_carta;
    }

    public void setTipo_carta(String tipo_carta) {
        this.tipo_carta = tipo_carta;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getTexto_carta() {
        return texto_carta;
    }

    public void setTexto_carta(String texto_carta) {
        this.texto_carta = texto_carta;
    }



    @Override
    public String toString(){
        return null;
    }
    public String toStringlista() {
        return ""+ listar;

    }
    public String toStringlista2() {
        return ""+ listar2;

    }
    public String toStringconsultaespecial() {
        return "Resultado da consulta do deck especial no índice: \n"
                + id
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }
    public String toStringconsultaestrutural() {
        return "Resultado da consulta do deck estrutural no índice: \n"
                + id
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }


    public String toStringconsultaincial() {
        return "Resultado da consulta do deck inicial no índice: \n"
                + id
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }
    public String toStringcardespecial() {
        return "Cadastrado carta no deck especial:  \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }
    public String toStringcardinical() {
        return "Cadastrado carta no deck inicial:  \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }
    public String toStringcardestrutural() {
        return "Cadastrado carta no deck estrutural:  \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta;
    }
    public String toStringlistarespecial() {
        return "\n Resultado da Lista do deck especial: \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta+"\n________________________________________________________\n";
    }
    public String toStringlistarinicial() {
        return "\n Resultado da Lista do deck inicial: \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta+"\n________________________________________________________\n";
    }
    public String toStringlistarestrutural() {
        return "\n Resultado da Lista do deck estrutural: \n"
                + "\n Nome da carta: "+ nome_carta
                + "\n Atributo: "+ atributo
                + "\n Nível: "+ nivel
                + "\n Tipo monstro: "+ tipo_monstro
                + "\n Tipo carta: "+ tipo_carta
                + "\n Ataque: "+ ataque
                + "\n Defesa: "+ defesa
                + "\n Texto da Carta: "+ texto_carta+"\n________________________________________________________\n";
    }
}

