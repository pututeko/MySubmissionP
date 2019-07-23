package net.putut.mysubmissionp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMotorAda extends RecyclerView.Adapter<ListMotorAda.ListViewHolder> {
    private ArrayList<Motor> listMotor;

    public ListMotorAda(ArrayList<Motor> list){
        this.listMotor =list;
    }
    @NonNull
    @Override
    public ListMotorAda.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View viewMotor = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_motor , viewGroup, false);
        return new ListViewHolder(viewMotor);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Motor data =listMotor.get(position);

        Glide.with(holder.itemView.getContext())
                .load(data.getFoto())
                .apply(new RequestOptions().override(60,60))
                .into(holder.FotoMotor);

        holder.TeksNama.setText(data.getNama());
        holder.TeksDeskripsi.setText(data.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listMotor.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView FotoMotor;
        TextView TeksNama,TeksDeskripsi;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            FotoMotor = itemView.findViewById(R.id.foto_motor);
            TeksNama = itemView.findViewById(R.id.teks_nama);
            TeksDeskripsi = itemView.findViewById(R.id.teks_deskripsi);
        }
    }
}
