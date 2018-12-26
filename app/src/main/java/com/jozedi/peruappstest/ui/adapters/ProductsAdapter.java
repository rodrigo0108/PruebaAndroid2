package com.jozedi.peruappstest.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jozedi.peruappstest.R;
import com.jozedi.peruappstest.callbacks.OnClickListener;
import com.jozedi.peruappstest.models.Product;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    private final List<Product> mDataList;
    private final OnClickListener<Product> mListener;

    public ProductsAdapter(List<Product> items, OnClickListener listener) {
        mDataList = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_products, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.bind(mDataList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View container;
        public TextView title;
        public TextView description;

        public Product model;

        public ViewHolder(View view) {
            super(view);
            container = view;
            title = (TextView) view.findViewById(R.id.text_title);
            description = (TextView) view.findViewById(R.id.text_description);
        }

        public void bind(Product model, int position) {
            this.model = model;
            title.setText(model.getName());
            description.setText(model.getDescription());
        }
    }
}
