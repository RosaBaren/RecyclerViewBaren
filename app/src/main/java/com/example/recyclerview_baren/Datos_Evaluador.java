package com.example.recyclerview_baren;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Datos_Evaluador {
    private Context Ctx;
    private List<Evaluador> lstEvaluadors;

    public Datos_Evaluador(Context mCtx, List<Evaluador> Evaluadors) {
        this.lstEvaluadors = Evaluadors;
        Ctx=mCtx;
    }


    public DatosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.datos_user, null);
        return new DatosViewHolder(view);
    }


    public void onBindViewHolder(DatosViewHolder holder, int position) {

        Evaluador Evaluador = lstEvaluadors.get(position);

        holder.textViewID.setText(Evaluador.getIdevaluador());
        holder.textViewNombre.setText(Evaluador.getNombres());
        holder.textViewArea.setText(Evaluador.getArea());
        Glide.with(Ctx).load(Evaluador.getImgJPG()).error(R.drawable.foto)
                .into(holder.imageView);

    }

    public int getItemCount() {
        return lstEvaluadors.size();
    }


    class DatosViewHolder extends RecyclerView.ViewHolder {

        TextView textViewID, textViewNombre, textViewArea;
        ImageView imageView;

        public DatosViewHolder(View itemView) {
            super(itemView);

            textViewID= itemView.findViewById(R.id.txtID);
            textViewNombre = itemView.findViewById(R.id.txtNombre);
            textViewArea = itemView.findViewById(R.id.txtArea);
            imageView = itemView.findViewById(R.id.imgAvatar);
        }
    }
}
