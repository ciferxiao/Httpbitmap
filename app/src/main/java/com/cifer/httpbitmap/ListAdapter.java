package com.cifer.httpbitmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by xiaojinggong on 11/27/17.
 */

public class ListAdapter extends ArrayAdapter<Book> {

    private int resourceid;
    private Context mcontext;

    public ListAdapter(Context context, int id,List<Book> objects){
        super(context,id,objects);
        resourceid = id;
        mcontext = context;
    }

    @Override
    public View getView(final int i, View contextview, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        Book book = getItem(i);
        View view;
        if (contextview == null){
            view = LayoutInflater.from(getContext()).inflate(resourceid,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView)view.findViewById(R.id.picture);
            viewHolder.textView = (TextView)view.findViewById(R.id.title);
            view.setTag(viewHolder);
        }else{
            view = contextview;
            viewHolder = (ViewHolder)view.getTag();
        }
            viewHolder.imageView.setImageBitmap(book.getMbookid());
            viewHolder.textView.setText(book.getMbooktitle());
            viewHolder.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int x= i;
                    Toast.makeText(mcontext,"you click textview " + x,Toast.LENGTH_SHORT).show();
                }
            });

        return view;
    }


    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }


}
