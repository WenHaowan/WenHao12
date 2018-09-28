package as.bwei.com.wenhao1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import as.bwei.com.wenhao1.R;
import as.bwei.com.wenhao1.adapter.FenLeiAdapter;

/**
 * Created by HP on 2018/8/18.
 */

public class Fragment2 extends Fragment implements AdapterView.OnItemClickListener {
    private View view;
    private ListView listview;
    private String[] strs = { "常用分类", "服饰内衣", "外套", "手机", "家用电器",
            "电脑", "玩具", "零食", "大型电器",
            "空调", "拖鞋", "平板", "学习用品",
            "数码", "电脑办公","个护化妆", "图书" };
    public static int mPosition;
    private FenLeiFragment1 fenLeiFragment1;
    private FenLeiAdapter fenLeiAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2,container,false);
        iniView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //点击切换页面
        listViewClick();
    }

    private void listViewClick() {
        fenLeiAdapter = new FenLeiAdapter(getActivity(), strs);
        listview.setAdapter(fenLeiAdapter);
        listview.setOnItemClickListener(this);
        //创建fragment
        fenLeiFragment1 = new FenLeiFragment1();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fenLeiFragment1);
        //通过bundle传值给MyFragment
        Bundle bundle = new Bundle();
        bundle.putString("name", strs[mPosition]);
        fenLeiFragment1.setArguments(bundle);
        fragmentTransaction.commit();
    }

    private void iniView() {
        listview = (ListView) view.findViewById(R.id.listview);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //拿到当前位置
        mPosition = position;
        //即使刷新adapter
        fenLeiAdapter.notifyDataSetChanged();
        for (int i = 0; i < strs.length; i++) {
            fenLeiFragment1 = new FenLeiFragment1();
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                    .beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fenLeiFragment1);
            Bundle bundle = new Bundle();
            bundle.putString("name", strs[position]);
            fenLeiFragment1.setArguments(bundle);
            fragmentTransaction.commit();
        }
    }
}
