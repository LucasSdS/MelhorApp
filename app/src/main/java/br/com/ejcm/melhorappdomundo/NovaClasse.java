package br.com.ejcm.melhorappdomundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NovaClasse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_classe);
        Intent batata = getIntent();
        String mensagem = batata.getStringExtra(WoW.MENSAGEM);
        TextView ver = new TextView(this);
        ver.setTextSize(40);
        ver.setText(mensagem);
        RelativeLayout vista = (RelativeLayout) findViewById(R.id.vista);
        vista.addView(ver);
    }
}
