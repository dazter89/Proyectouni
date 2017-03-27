package proyectouni.david.proyectouni;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Correo extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_correo);


        }

        public void onClick(View v) {
            // Reemplazamos el email por algun otro real
            String[] to = {"daz890724@hotmail.com"};
            //String[] cc = { "otroEmail@ejemplo.com" };
            enviar(to, "Ingrese el asunto",
                    "Esto es un email enviado desde una app de Android");
        }

        private void enviar(String[] to,
                            String asunto, String mensaje) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse("mailto:"));
            //String[] to = direccionesEmail;
            //String[] cc = copias;
            emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
            // emailIntent.putExtra(Intent.EXTRA_CC, cc);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
            emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
            emailIntent.setType("message/rfc822");
            startActivity(Intent.createChooser(emailIntent, "Email "));
        }
    }
