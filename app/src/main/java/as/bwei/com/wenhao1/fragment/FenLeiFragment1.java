package as.bwei.com.wenhao1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import as.bwei.com.wenhao1.R;

/**
 * Created by HP on 2018/8/18.
 */

public class FenLeiFragment1 extends Fragment{

    private String str;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fen_lei_fragment1, null);
        TextView tv_title = (TextView) view.findViewById(R.id.tv_titl);
        str = getArguments().getString("name");
        tv_title.setText(str);
        return view;
    }
}
