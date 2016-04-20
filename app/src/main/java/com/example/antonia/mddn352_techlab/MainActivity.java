package com.example.antonia.mddn352_techlab;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.tech.Ndef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NfcAdapter nfc = NfcAdapter.getDefaultAdapter(this);

        if(nfc != null && nfc.isEnabled()){
            if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
                Toast.makeText(this, "NFC tag detected", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "NFC is on, no tag detected", Toast.LENGTH_LONG).show();

            }

        } else {
            Toast.makeText(this, "NFC is not activated", Toast.LENGTH_LONG).show();
        }
    }

    protected void onResume(){
        super.onResume();

    }
}
