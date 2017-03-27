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

public class fragmento_ingelectrica extends Fragment {

    private WebView mWebView1;
    View raizview1;
    @Nullable
    @Override

    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview1 = inflater.inflate(R.layout.fragmentoingelectrica, Container, false);
        mWebView1 = (WebView) raizview1.findViewById(R.id.webview5);
        mWebView1.loadUrl("http://www.fie.utp.ac.pa/postgrado");


        /// habilita javascript

        WebSettings webSettings = mWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView1.setWebViewClient(new WebViewClient());
        return raizview1;
    }
}