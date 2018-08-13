# QTitleBar
自定义标题栏View<br>
![gif效果图](https://github.com/272664150/QTitleBar/blob/master/screenshots/1.png) 

1.设置标题栏透明度
##
    setAlpha(@FloatRange(from = 0.0, to = 1.0) float alpha)

2.设置标题栏背景色
##
    setBackgroundColor(@ColorInt int color)
    setBackgroundResource(@DrawableRes int resId)

3.设置左侧操作区域1
##
    setLeft1Visibility(int visibility)
    setLeft1Icon(@Nullable Drawable left)
    setLeft1Icon(@DrawableRes int resId)
    setLeft1Text(CharSequence text)
    setLeft1Text(@StringRes int resId)
    setLeft1TextColor(@ColorInt int resId)
    setLeft1TextSize(float size)
    setLeft1ClickListener(OnClickListener onClickListener)

4.设置左侧操作区域2
##
    setLeft2Visibility(int visibility)
    setLeft2Icon(@Nullable Drawable left)
    setLeft2Icon(@DrawableRes int resId)
    setLeft2Text(CharSequence text)
    setLeft2Text(@StringRes int resId)
    setLeft2TextColor(@ColorInt int resId)
    setLeft2TextSize(float size)
    setLeft2ClickListener(OnClickListener onClickListener)

5.设置标题栏Logo
##
    setTitleLogoVisibility(int visibility)
    setTitleLogo(@NonNull Drawable drawable)
    setTitleLogo(@DrawableRes int resId)

6.设置标题栏Title
##
    setTitleVisibility(int visibility)
    setTitleText(CharSequence text)
    setTitleText(@StringRes int resId)
    setTitleTextColor(@ColorInt int resId)
    setTitleTextSize(float size)

7.设置右侧操作区域1
##
    setRight1Visibility(int visibility)
    setRight1Icon(@Nullable Drawable right)
    setRight1Icon(@DrawableRes int resId)
    setRight1Text(CharSequence text)
    setRight1Text(@StringRes int resId)
    setRight1TextColor(@ColorInt int resId)
    setRight1TextSize(float size)
    setRight1ClickListener(OnClickListener onClickListener)

8.设置右侧操作区域2
##
    setRight2Visibility(int visibility)
    setRight2Icon(@Nullable Drawable right)
    setRight2Icon(@DrawableRes int resId)
    setRight2Text(CharSequence text)
    setRight2Text(@StringRes int resId)
    setRight2TextColor(@ColorInt int resId)
    setRight2TextSize(float size)
    setRight2ClickListener(OnClickListener onClickListener)

9.设置标题栏底部分隔线
##
    setBottomLineVisibility(int visibility)

10.设置标题栏上的自定义View
##
    addView(View view, int gravity)
    removeView(View view)

 
参考：
##
    https://blog.csdn.net/delmoremiao/article/details/52145067