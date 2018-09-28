package as.bwei.com.wenhao1.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import as.bwei.com.wenhao1.R;

/**
 * Created by HP on 2018/8/22.
 */

public class day18 extends Fragment{

    private View view;
    private View all;
    private View layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        all = view.findViewById(R.id.all);
        layout = view.findViewById(R.id.frame_layout);
        init();
    }

    private void init() {

    }
}
