package com.eaglet.unigo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;


public class RankingFragment extends Fragment {

    private SectionPageAdapter mPageAdapter;
    View view;
    TabLayout tabLayout;
    private ViewPager viewPager;
    public RankingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_ranking, container, false);
//        viewPager=(ViewPager)view.findViewById(R.id.list);
//        SetUpViewPager(viewPager);
//
//        tabLayout=(TabLayout)view.findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    private void SetUpViewPager(ViewPager viewPager)
    {
        SectionPageAdapter adapter=new SectionPageAdapter(getFragmentManager());
        adapter.addFragment(new RankingListFragment(),"نفرات برتر شهر");
        adapter.addFragment(new RankingListFragment(),"نفرات برتر منطقه");
        adapter.addFragment(new RankingListFragment(),"برترین مدارس شهر");
        adapter.addFragment(new RankingListFragment(),"برترین مدارس منطقه");

        viewPager.setAdapter(adapter);
    }
}
