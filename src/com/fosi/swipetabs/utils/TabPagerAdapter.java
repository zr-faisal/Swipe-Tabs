package com.fosi.swipetabs.utils;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

	public static ArrayList<Fragment> alFragments;
	
	public TabPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
		super(fm);
		// TODO Auto-generated constructor stub
		alFragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return alFragments.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return alFragments.size();
	}
	
//	@Override
//    public String getPageTitle(int position) {
//		// TODO Auto-generated method stub
//        return alFragments.get(position).getArguments().getString("title", "title");
//    }

}
