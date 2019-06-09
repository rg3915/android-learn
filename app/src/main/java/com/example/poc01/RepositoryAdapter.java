package com.example.poc01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class RepositoryAdapter extends ArrayAdapter<Repository> {

    private final Context context;
    private final List<Repository> elementos;

    public RepositoryAdapter(Context context, List<Repository> elementos) {
        super(context, R.layout.line_repository, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.line_repository, parent, false);

        Repository repository = this.elementos.get(position);

        TextView textNome = rowView.findViewById(R.id.nome);
        textNome.setText(repository.getName());

        TextView intId = rowView.findViewById(R.id.id);
        intId.setText(String.valueOf(repository.getId()));

        return rowView;
    }
}