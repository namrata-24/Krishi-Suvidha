package namrata.hack1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lenovo on 2/2/2018.
 */

public class Adapt extends RecyclerView.Adapter<Adapt.Holder> {

    String[] data ;
    Adapt(String[] data){
        this.data=data;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View my = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        return new Holder(my);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
    String a = data[position];
        holder.text.setText(a);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class Holder extends RecyclerView.ViewHolder{

        private TextView text ;

        public Holder(View itemView) {
            super(itemView);
            text = (TextView)itemView.findViewById(R.id.text);
        }
    }

}
