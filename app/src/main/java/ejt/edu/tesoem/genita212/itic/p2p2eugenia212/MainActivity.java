package ejt.edu.tesoem.genita212.itic.p2p2eugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> listaEstados;
    String[] strsEstados;
    Spinner objSpinner;
    ArrayAdapter<String> listEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objSpinner= findViewById(R.id.CargarLista);
        strsEstados = new String[]{"CDMX","Estado de Mexico","Veracruz","Hidalgo","Yucatan"};
        listaEstados= new ArrayList<String>();
        Collections.addAll(listaEstados,strsEstados);
        listEstados= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listaEstados);
        objSpinner.setAdapter(listEstados);
    }
}
