package com.malikpoutch.tramparadise.metier.connexionBDD.UsersBDD;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Malik on 11/09/2015.
 *
 * Update la position de l'user. Classe executé dans le onLocationChanged
 */
public class UpdatePositionUser extends AsyncTask<String, Void, String> {


    // Mettre l'adresse du script PHP
    // Attention localhost ou 127.0.0.1 ne fonctionnent pas. Mettre l'adresse IP local.
    public static final String strURL = "http://tramp.hol.es/AccesBDDTramParadise/Users/updatePositionUsers.php";

    //Variable globale name, lat et long
    double latitude;
    double longitude;
    String name;

    //Context + constructeur
    private Context mContext;


    //Constructeur par défaut utilisé lors du onChanged position
    public UpdatePositionUser(){

    }

    //Constructeur qui initialise variables
    public UpdatePositionUser(double latitude, double longitude, String name, Context context) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.mContext = context;
    }

    protected String doInBackground(String... urls) {


        InputStream is = null;
        String result = "";
        String returnString = "";


        // Envoyer la requête au script PHP.
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("name", name));
        nameValuePairs.add(new BasicNameValuePair("lat", latitude + ""));
        nameValuePairs.add(new BasicNameValuePair("long", longitude + ""));


        // Envoie de la commande http
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(strURL);
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();
        } catch (Exception e) {
            Log.e("log_tag", "Error in http connection " + e.toString());
        }
        return returnString;
    }


    //This Method is called when Network-Request finished
    @Override
    protected void onPostExecute(String serverData) {
        Log.e("onPostExecute", "envoi en base ok");
    }

    //Getters Setters

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}




