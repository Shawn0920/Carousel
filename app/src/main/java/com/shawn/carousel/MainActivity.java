package com.shawn.carousel;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shawn.banner.Banner;
import com.shawn.banner.listener.OnBannerClickListener;
import com.shawn.carousel.common.BaseRecyclerAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    static final int REFRESH_COMPLETE = 0X1112;
    SwipeRefreshLayout mSwipeLayout;
    RecyclerView recyclerView;
    Banner banner;
    String[] images, titles;
    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    images = getResources().getStringArray(R.array.url2);
                    banner.setImages(Arrays.asList(images)).start();
                    mSwipeLayout.setRefreshing(false);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = getResources().getStringArray(R.array.url);
        titles = getResources().getStringArray(R.array.title);

        mSwipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        mSwipeLayout.setOnRefreshListener(this);

        recyclerView= (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BaseRecyclerAdapter adapter = new BaseRecyclerAdapter<>(new SampleAdapter());

        /**
         * 将banner添加到recyclerView头部
         */
        View header= LayoutInflater.from(this).inflate(R.layout.header,null);
        banner = (Banner) header.findViewById(R.id.banner);
        //如果你不需要用xml的属性，那么也可以直接创建对象来实现
//        banner=new Banner(this);
        banner.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,500));
        adapter.addHeader(banner);
        recyclerView.setAdapter(adapter);

        //简单使用
        banner.setImages(Arrays.asList(images)).setImageLoader(new GlideImageLoader()).start();

        banner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void onBannerClick(int position) {
                Toast.makeText(getApplicationContext(), "点击：" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("--", "onStart");
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("--", "onStop");
        //结束轮播
        banner.stopAutoPlay();
    }

    @Override
    public void onRefresh() {
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000);
    }
}
