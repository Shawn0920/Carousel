package com.shawn.carousel;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shawn.banner.loader.ImageLoader;

/**
 * Created by Shawn on 2016/10/25.
 */

public class GlideImageLoader implements ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
        Glide.with(context).load(path).into(imageView);
    }
}
