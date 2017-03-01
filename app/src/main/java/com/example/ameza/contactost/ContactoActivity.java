package com.example.ameza.contactost;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactoActivity extends AppCompatActivity {

    TextInputEditText nombreContacto, correoContacto, comentarioContacto;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        nombreContacto = (TextInputEditText) findViewById(R.id.nombreContacto);
        correoContacto = (TextInputEditText) findViewById(R.id.correoContacto);
        comentarioContacto = (TextInputEditText) findViewById(R.id.comentarioContacto);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);


    }

    public void onClick(View v) {
        // Reemplazamos el email por algun otro real

        String nombre = nombreContacto.getText().toString();
        String correo = correoContacto.getText().toString();
        String comentario = comentarioContacto.getText().toString();

        String[] to = { correo };
       // String[] cc = { "otroEmail@ejemplo.com" };
    //    String mensaje = Uri.encode ("Nombre: "+nombre+"\nCorreo: "+correo+"\nComentario: "+comentario);
        enviar(to, "Mensaje de"+" "+nombre.toUpperCase(),"Nombre: "+nombre+"\nCorreo: "+correo+"\nComentario: "+comentario
                );
    }

    private void enviar(String[] to,
                        String asunto, String mensaje) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/html");
        //String[] to = direccionesEmail;
        //String[] cc = copias;
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        //emailIntent.putExtra(Intent.EXTRA_CC, cc);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        //emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email "));
    }


}
