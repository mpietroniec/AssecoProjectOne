package com.example.assecoprojectone;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {

    private ArrayList<Model> mModelList;
    private final Context context;
    private ItemClickListener mItemClickListener;

    public ReviewAdapter(ArrayList<Model> mModelList, Context context, ItemClickListener itemClickListener) {
        this.mModelList = mModelList;
        this.context = context;
        this.mItemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_row, parent, false);
        ReviewViewHolder viewHolder = new ReviewViewHolder(view, mItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        Model model = mModelList.get(position);
        Picasso.get().load(Uri.parse(model.getmThumbnail())).centerCrop().fit().into(holder.ivModelImage);
        holder.txtModelName.setText(model.getmModelName());

        holder.cvModelRow.setOnClickListener(view -> {
            Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
            Uri intentUri =
                    Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                            .appendQueryParameter("file", model.getmModel())
                            .appendQueryParameter("mode", "browser_preferred")
                            .build();
            sceneViewerIntent.setData(intentUri);
            sceneViewerIntent.setPackage("com.google.ar.core");
            context.startActivity(sceneViewerIntent);
        });
    }

    @Override
    public int getItemCount() {
        return mModelList.size();
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtModelName;
        private ImageView ivModelImage;
        CardView cvModelRow;
        ItemClickListener itemClickListener;

        public ReviewViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            txtModelName = itemView.findViewById(R.id.txt_model_row);
            ivModelImage = itemView.findViewById(R.id.iv_model_image);
            cvModelRow = itemView.findViewById(R.id.cv_model_row);
            this.itemClickListener = itemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onItemClickListener(getAdapterPosition());
        }
    }
}
