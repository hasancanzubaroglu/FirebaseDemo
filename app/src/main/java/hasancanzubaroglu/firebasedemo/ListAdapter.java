package hasancanzubaroglu.firebasedemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
        private ArrayList<User> mDataset;

        public class ViewHolder extends RecyclerView.ViewHolder {

                public TextView txtHeader;
                public TextView txtFooter;

                public ViewHolder(View v) {
                        super(v);
                        txtHeader = (TextView) v.findViewById(R.id.firstLine);
                        txtFooter = (TextView) v.findViewById(R.id.secondLine);
                }
        }



        public void add(User user) {
                mDataset.add(user);
                notifyDataSetChanged();
        }

        public void remove(User user) {
                int position = mDataset.indexOf(user);
                mDataset.remove(position);
                notifyItemRemoved(position);
        }

        public void removeAll() {
                mDataset.clear();
                notifyDataSetChanged();
        }


        public ListAdapter(ArrayList<User> myDataset) {
                mDataset = myDataset;
        }

        @Override
        public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {

                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);

                ViewHolder vh = new ViewHolder(v);
                return vh;
        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
                // - get element from your dataset at this position
                // - replace the contents of the view with that element
                final String name = mDataset.get(position).getName();
                holder.txtHeader.setText(name);

                holder.txtFooter.setText(mDataset.get(position).getSurname());

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
                return mDataset.size();
        }

}