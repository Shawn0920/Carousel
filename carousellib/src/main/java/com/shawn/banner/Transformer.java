package com.shawn.banner;

import android.support.v4.view.ViewPager;

import com.shawn.banner.transformer.AccordionTransformer;
import com.shawn.banner.transformer.BackgroundToForegroundTransformer;
import com.shawn.banner.transformer.CubeInTransformer;
import com.shawn.banner.transformer.CubeOutTransformer;
import com.shawn.banner.transformer.DefaultTransformer;
import com.shawn.banner.transformer.DepthPageTransformer;
import com.shawn.banner.transformer.FlipHorizontalTransformer;
import com.shawn.banner.transformer.FlipVerticalTransformer;
import com.shawn.banner.transformer.ForegroundToBackgroundTransformer;
import com.shawn.banner.transformer.RotateDownTransformer;
import com.shawn.banner.transformer.RotateUpTransformer;
import com.shawn.banner.transformer.ScaleInOutTransformer;
import com.shawn.banner.transformer.StackTransformer;
import com.shawn.banner.transformer.TabletTransformer;
import com.shawn.banner.transformer.ZoomInTransformer;
import com.shawn.banner.transformer.ZoomOutSlideTransformer;
import com.shawn.banner.transformer.ZoomOutTranformer;

/**
 * Created by Shawn on 2016/10/25.
 */

public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
