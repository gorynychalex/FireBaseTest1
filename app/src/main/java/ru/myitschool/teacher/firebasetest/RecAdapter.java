package ru.myitschool.teacher.firebasetest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private List<Project> array;

    public RecAdapter(List<Project> array) {
        this.array = array;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.description.setText(array.get(position).description);
        holder.count.setText(String.valueOf(array.get(position).count));
        holder.language.setText(array.get(position).language);
        holder.name.setText(array.get(position).name);

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    static class ViewHolder extends  RecyclerView.ViewHolder {
        public TextView description;
        public TextView count;
        public TextView language;
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            description = itemView.findViewById(R.id.descriprion);
            count = itemView.findViewById(R.id.count);
            language = itemView.findViewById(R.id.language);
            name = itemView.findViewById(R.id.name);
        }
    }
}
