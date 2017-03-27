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
 * Created by David on 03/05/2017.
 */

public class fragmento_requisitos extends Fragment {
    private WebView mWebView;
    View raizview;
    @Nullable
    @Override
//requisitos
    public View onCreateView (LayoutInflater inflater, ViewGroup Container, Bundle SavedInstanceState) {

        raizview = inflater.inflate(R.layout.fragment_fragmento_requisitos, Container, false);
        mWebView = (WebView) raizview.findViewById(R.id.webview4);
        mWebView.loadUrl("http://utp.ac.pa/admision-los-programas-de-postgrado-maestrias-y-doctorado");


        /// habilita javascript

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /// fuerza la conexion y abre en web view en vez del buscador
        mWebView.setWebViewClient(new WebViewClient());
        return raizview;
    }
}
