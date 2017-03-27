package Fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import proyectouni.david.proyectouni.R;



/**
 * Created by David on 03/05/2017.
 */
///facciencia y tecnologia
public class fragmento_postgrado extends  android.app.Fragment {
    private WebView mWebView2;
    View raizview2;
    @Nullable
    @Override

    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview2 = inflater.inflate(R.layout.fragmento_postgrado, Container, false);
        mWebView2 = (WebView) raizview2.findViewById(R.id.webview2);
        mWebView2.loadUrl("http://www.fct.utp.ac.pa/postgrado-0");


        /// habilita javascript

        WebSettings webSettings = mWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView2.setWebViewClient(new WebViewClient());
        return raizview2;
    }
}
