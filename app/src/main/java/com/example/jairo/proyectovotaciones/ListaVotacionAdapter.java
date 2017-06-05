package com.example.jairo.proyectovotaciones;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jairo.proyectovotaciones.models.VotacionPasto;

import java.util.ArrayList;

public class ListaVotacionAdapter extends RecyclerView.Adapter<ListaVotacionAdapter.ViewHolder> {

    private ArrayList<VotacionPasto> dataset;
    private Context context;

    public ListaVotacionAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista_votacion_adapter, parent, false);
        return new ViewHolder(view);
    }

    public static String ucFirst(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        } else {
            return  Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length()).toLowerCase();
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        VotacionPasto p = dataset.get(position);
        if(p.getMunicipio()!=null)
        {
            holder.nombreTextView.setText("Municipio " + ucFirst(p.getMunicipio()));
        }
        else
        {
            holder.nombreTextView.setText("Candidato " +ucFirst(p.getNombres())+" "+ucFirst(p.getApellidos()));
            holder.nombrePartidoTextView.setText(ucFirst(p.getNombre_partido()));

            if(p.getNombre_partido().equals("PARTIDO DE LA U"))
            {
                Glide.with(context)
                        .load("http://www.asambleadebolivar.gov.co/sites/default/files/u_0.png")
                        .into(holder.fotoImageView);
            }
            else if(p.getNombre_partido().equals("PARTIDO CONSERVADOR COLOMBIANO"))
            {
                Glide.with(context)
                        .load("http://partidoconservador.com/wp-content/uploads/2015/05/logo-nuevo-blanco.jpg")
                        .into(holder.fotoImageView);
            }
            else if(p.getNombre_partido().equals("PARTIDO OPCION CIUDADANA"))
            {
                Glide.with(context)
                        .load("https://ciudadaniaycongresistas.org/sites/www.ciudadaniaycongresistas.org/files/styles/party_logo/public/logo-partido-opcion-ciudadana.jpg?itok=kWQbBlvq")
                        .into(holder.fotoImageView);
            }
            else if(p.getNombre_partido().equals("PARTIDO LIBERAL COLOMBIANO"))
            {
                Glide.with(context)
                        .load("https://upload.wikimedia.org/wikipedia/commons/c/cb/Logo_del_partido_liberal.jpg")
                        .into(holder.fotoImageView);
            }
        }
        holder.votacionTextView.setText("Votacion " + p.getSumVotacion());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaVotacion(ArrayList<VotacionPasto> listaVotacion) {
        dataset.addAll(listaVotacion);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView fotoImageView;
        private TextView nombreTextView;
        private TextView votacionTextView;
        private TextView nombrePartidoTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            fotoImageView = (ImageView) itemView.findViewById(R.id.fotoImageView);
            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
            votacionTextView = (TextView) itemView.findViewById(R.id.votacionTextView);
            nombrePartidoTextView = (TextView) itemView.findViewById(R.id.nombrePartidoTextView);
        }
    }
}
