package busuu.company.tandat.busuu;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 25/08/2016.
 */
public class AdapterCustom extends ArrayAdapter<Lession>{
    Context context;
    ArrayList<Lession> listLession = new ArrayList<Lession>();
    public AdapterCustom(Context context, int resource, List<Lession> objects) {
        super(context, resource, objects);

        this.context=context;
        this.listLession= new ArrayList<Lession>(objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView= convertView;
        ViewHolder viewHolder;
        if(rowView==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            rowView= inflater.inflate(R.layout.custom_display, null);

            viewHolder= new ViewHolder();
            viewHolder.txtName= (TextView) rowView.findViewById(R.id.txt_lesion);
            viewHolder.txtTitle= (TextView) rowView.findViewById(R.id.txt_title);
            viewHolder.image= (ImageView) rowView.findViewById(R.id.image);

            rowView.setTag(viewHolder);

        }else
        {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        Lession lession = listLession.get(position);
        viewHolder.txtName.setText(lession.getNameLession());
        viewHolder.txtTitle.setText(lession.getTitle());
        viewHolder.image.setImageResource(lession.getPicture());

        return rowView;
    }

    static class ViewHolder{
        TextView txtName;
        TextView txtTitle;
        ImageView image;
    }
}
