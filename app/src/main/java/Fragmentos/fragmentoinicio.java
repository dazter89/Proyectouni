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

public class fragmentoinicio extends Fragment {
    private WebView mWebView1;
    View raizview1;
    @Nullable


    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview1 = inflater.inflate(R.layout.fragmentoinicio, Container, false);
        mWebView1 = (WebView) raizview1.findViewById(R.id.webview7);
        mWebView1.loadUrl("http://utp.ac.pa");


        /// habilita javascript

        WebSettings webSettings = mWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView1.setWebViewClient(new WebViewClient());
        return raizview1;
    }
}