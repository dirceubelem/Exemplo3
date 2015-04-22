package dirceubelem.exemplo3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import dirceubelem.exemplo3.adapter.AdapterEstado;
import dirceubelem.exemplo3.to.Estado;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private List<Estado> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<>();
        lista.add(new Estado(1, "Minas Gerais"));
        lista.add(new Estado(2, "São Paulo"));
        lista.add(new Estado(3, "Rio de Janeiro"));

        AdapterEstado adapter = new AdapterEstado(lista, this);

        ListView listEstado = (ListView) findViewById(R.id.listEstado);
        listEstado.setAdapter(adapter);
        listEstado.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Estado e = lista.get(position);

        Intent i = new Intent(this, CidadeActivity.class);
        i.putExtra("codigoestado", e.getCodigo());
        i.putExtra("descricaoestado", e.getDescricao());

        startActivity(i);


    }
}
