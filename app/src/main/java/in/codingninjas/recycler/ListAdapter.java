package in.codingninjas.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rohan on 11/07/17.
 */

public class ListAdapter extends ArrayAdapter<Note> {

    private Context context;
    private ArrayList<Note> notes;

    public ListAdapter(@NonNull Context context,@NonNull ArrayList<Note> notes) {
        super(context, 0);
        this.context = context;
        this.notes = notes;
    }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Nullable
    @Override
    public Note getItem(int position) {
        return notes.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View output = convertView;
        if(output == null){
            output = LayoutInflater.from(context).inflate(R.layout.item_note,parent,false);
            ListItemViewHolder holder = new ListItemViewHolder(output);
            //output.setTag(holder);
        }

        //ListItemViewHolder holder = (ListItemViewHolder) output.getTag();
        Note note = getItem(position);

//        holder.titleTextView.setText(note.getTitle());
//        holder.descTextView.setText(note.getDescription());

        TextView titleTextView = output.findViewById(R.id.title);
        titleTextView.setText(note.getTitle());
        TextView descTextView = output.findViewById(R.id.description);
        descTextView.setText(note.getDescription());

        return output;
    }

    public static class ListItemViewHolder {

        public TextView titleTextView;
        public TextView descTextView;

        public ListItemViewHolder(View itemView){
            titleTextView = itemView.findViewById(R.id.title);
            descTextView = itemView.findViewById(R.id.description);
        }

    }
}
