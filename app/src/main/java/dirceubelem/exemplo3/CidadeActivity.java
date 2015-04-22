package dirceubelem.exemplo3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import dirceubelem.exemplo3.adapter.AdapterCidade;
import dirceubelem.exemplo3.to.Cidade;


public class CidadeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade);

        List<Cidade> l = new ArrayList<>();
        l.add(new Cidade(1, "Belo Horizonte"));
        l.add(new Cidade(2, "Contagem"));
        l.add(new Cidade(3, "Betim"));

        AdapterCidade adapter = new AdapterCidade(l, this);

        ListView listCidade = (ListView) findViewById(R.id.listCidade);
        listCidade.setAdapter(adapter);

    }


}
