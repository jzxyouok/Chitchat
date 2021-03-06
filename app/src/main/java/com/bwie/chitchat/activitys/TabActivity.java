package com.bwie.chitchat.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.bwie.chitchat.R;
import com.bwie.chitchat.base.IActivity;
import com.bwie.chitchat.fragments.FirstFragment;
import com.bwie.chitchat.fragments.FourthFragment;
import com.bwie.chitchat.fragments.SecondFragment;
import com.bwie.chitchat.fragments.ThirdFragment;
import com.bwie.chitchat.widget.ButtomLayout;

import java.util.ArrayList;
import java.util.List;



/**
 * 主导航
 */

public class TabActivity extends IActivity implements ButtomLayout.OnSelectListener {

    private ButtomLayout buttomLayout;
    private FragmentManager fragmentManager;

    private List<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        fragmentManager = getSupportFragmentManager();

        createFragment(savedInstanceState);



        buttomLayout = (ButtomLayout) findViewById(R.id.buttom_layout);
        buttomLayout.setOnSelectListener(this);


        switchFragment(0);


    }


    public void createFragment(Bundle savedInstanceState){

        FirstFragment firstFragment = (FirstFragment) fragmentManager.findFragmentByTag("FirstFragment");
        SecondFragment secondFragment = (SecondFragment) fragmentManager.findFragmentByTag("SecondFragment");
        ThirdFragment thirdFragment = (ThirdFragment) fragmentManager.findFragmentByTag("ThirdFragment");
        FourthFragment fourthFragment = (FourthFragment) fragmentManager.findFragmentByTag("FourthFragment");

        if(firstFragment == null){
            firstFragment = new FirstFragment();
        }

        if(secondFragment == null){
            secondFragment = new SecondFragment();
        }
        if(thirdFragment == null){
            thirdFragment = new ThirdFragment();
        }
        if(fourthFragment == null){
            fourthFragment = new FourthFragment();
        }


        fragments.add(firstFragment);
        fragments.add(secondFragment);
        fragments.add(thirdFragment);
        fragments.add(fourthFragment);


    }


    public void switchFragment(int pos){

        switchIFragment(pos,fragments,R.id.container);

    }


    /**
     * 底部导航 点击 回调
     * @param index
     */
    @Override
    public void onSelect(int index) {
        switchFragment(index);
    }
}
