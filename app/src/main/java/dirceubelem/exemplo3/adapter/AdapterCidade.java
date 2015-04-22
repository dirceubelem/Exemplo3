package dirceubelem.exemplo3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import dirceubelem.exemplo3.R;
import dirceubelem.exemplo3.to.Cidade;

/**
 * Created by dirceubelem on 06/03/15.
 */
public class AdapterCidade extends BaseAdapter {

    private List<Cidade> list;
    private Context context;

    public AdapterCidade(List<Cidade> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cidade c = list.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item_list, null);

        TextView txtCidade = (TextView) v.findViewById(R.id.txtEstado);

        txtCidade.setText(c.getDescricao());

        return v;
    }
}
