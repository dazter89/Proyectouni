package Fragmentos;

import android.app.Fragment;
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
 * Created by David on 03/19/2017.
 */

public class fragmentoingindustrial extends Fragment {

    private WebView mWebView2;
    View raizview2;
    @Nullable

    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview2 = inflater.inflate(R.layout.fragmentoingindustrial, Container, false);
        mWebView2 = (WebView) raizview2.findViewById(R.id.webview6);
        mWebView2.loadUrl("http://www.fii.utp.ac.pa/oferta-de-postgrados");


        /// habilita javascript

        WebSettings webSettings = mWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView2.setWebViewClient(new WebViewClient());
        return raizview2;
    }
}

