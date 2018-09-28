package as.bwei.com.wenhao1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import as.bwei.com.wenhao1.R;
import as.bwei.com.wenhao1.fragment.Fragment2;

/**
 * Created by HP on 2018/8/18.
 */

public class FenLeiAdapter extends BaseAdapter{

    private Context context;
    private String[] strings;
    public static int mPosition;


    public FenLeiAdapter(Context context, String[] strings) {
        this.context = context;
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return strings[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout_fenlei_item,null);
        TextView tv = (TextView) convertView.findViewById(R.id.fenlei_name);
        mPosition=position;
        tv.setText(strings[position]);
        if (position == Fragment2.mPosition){
            //图片convertView.setBackgroundResource(R.drawable.tongcheng_all_bg01);
            convertView.setBackgroundColor(Color.parseColor("#F0F0F0"));
        }else {
            convertView.setBackgroundColor(Color.parseColor("#FBFBFB"));
        }
        return convertView;
    }
}
