package com.hao.thigk2nguyenduchao;

import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.ViewHolder> {

    List<DiaDiem> list;

    public DiaDiemAdapter(List<DiaDiem> list) {
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvTen, tvDiaChi;

        public ViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.img);
            tvTen = view.findViewById(R.id.tvTen);
            tvDiaChi = view.findViewById(R.id.tvDiaChi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dulich, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DiaDiem d = list.get(position);
        holder.tvTen.setText(d.ten);
        holder.tvDiaChi.setText(d.diaChi);
        holder.img.setImageResource(d.hinh);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}