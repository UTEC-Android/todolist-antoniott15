package pe.utec.cs.androidcourse.ui.main;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import pe.utec.cs.androidcourse.R;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolderDatos> {
    ArrayList<String> listDatos;

    public TasksAdapter(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.giveDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.idDato);
        }

        public void giveDatos(String datos) {
            dato.setText(datos);
        }
    }
}
