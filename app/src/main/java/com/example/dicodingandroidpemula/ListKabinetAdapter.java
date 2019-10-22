package com.example.dicodingandroidpemula;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

    public class ListKabinetAdapter extends RecyclerView.Adapter<ListKabinetAdapter.ListViewHolder> {
        private ArrayList<Kabinet> listKabinet;
        private OnItemClickCallback onItemClickCallback;

        public interface OnItemClickCallback {
            void onItemClicked(Kabinet data);
        }

        void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
            this.onItemClickCallback = onItemClickCallback;
        }

        ListKabinetAdapter(ArrayList<Kabinet> list) {
            this.listKabinet = list;
        }

        @NonNull
        @Override
        public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kabinet, viewGroup, false);
            return new ListViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
            Kabinet kabinet = listKabinet.get(position);

            Glide.with(holder.itemView.getContext())
                    .load(kabinet.getFoto())
                    .apply(new RequestOptions().override(55, 55))
                    .into(holder.imgPhoto);

            holder.tvName.setText(kabinet.getName());
            holder.tvDetail.setText(kabinet.getDetail());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickCallback.onItemClicked(listKabinet.get(holder.getAdapterPosition()));
                }
            });
        }

        @Override
        public int getItemCount() {
            return listKabinet.size();
        }

        class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPhoto;
            TextView tvName, tvDetail;

            ListViewHolder(View itemView) {
                super(itemView);
                imgPhoto = itemView.findViewById(R.id.img_item_photo);
                tvName = itemView.findViewById(R.id.tv_item_name);
                tvDetail = itemView.findViewById(R.id.tv_item_detail);
            }
        }
    }
