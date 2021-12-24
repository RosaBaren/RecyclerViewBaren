package com.example.recyclerview_baren;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
public class Evaluador {

    private String idevaluador;
    private String nombres;
    private String area;
    private String imgJPG;

    public String getIdevaluador() {
        return idevaluador;
    }

    public void setIdevaluador(String idevaluador) {
        this.idevaluador = idevaluador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getImgJPG() {
        return imgJPG;
    }

    public void setImgJPG(String imgJPG) {
        this.imgJPG = imgJPG;
    }
    public Evaluador( JSONObject a) throws JSONException {
        idevaluador =  a.getString("idevaluador").toString();
        nombres =  a.getString("nombres").toString();
        area =  a.getString("area").toString();
        imgJPG =  a.getString("imgJPG").toString();

    }
    public static ArrayList<Evaluador> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Evaluador> Evaluadors = new ArrayList<>();

        for (int i = 0; i < datos.length(); i++) {
            Evaluadors.add(new Evaluador(datos.getJSONObject(i)));
        }
        return Evaluadors;
    }
}
