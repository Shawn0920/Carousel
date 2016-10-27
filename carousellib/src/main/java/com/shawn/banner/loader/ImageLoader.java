package com.shawn.banner.loader;

import android.content.Context;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * 加载图片
 * Created by Shawn on 2016/10/25.
 */

public interface ImageLoader extends Serializable {

    void displayImage(Context context, Object path, ImageView imageView);

}
