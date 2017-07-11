package in.codingninjas.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rohan on 11/07/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    Context context;
    ArrayList<Note> notes;

    public RecyclerAdapter(Context context, ArrayList<Note> notes){
        this.context = context;
        this.notes = notes;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_note,parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.titleTextView.setText(note.getTitle());
        holder.descTextView.setText(note.getDescription());

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        TextView descTextView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title);
            descTextView = itemView.findViewById(R.id.description);
        }
    }
}
