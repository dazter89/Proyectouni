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

public class fragmentomain extends android.app.Fragment {
    private WebView mWebView;
    View raizview;
    @Nullable
    @Override
    ///conocenos
    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview = inflater.inflate(R.layout.fragmentomain, Container, false);
        mWebView = (WebView) raizview.findViewById(R.id.webview);
        mWebView.loadUrl("http://www.fic.utp.ac.pa/postgrado-y-maestr%C3%ADas");


        /// habilita javascript

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView.setWebViewClient(new WebViewClient());
        return raizview;

    }
}

