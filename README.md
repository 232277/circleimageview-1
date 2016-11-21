在项目中使用圆形的图片的需求还是蛮大的，所以封装一个圆形图片的控件，可以加载本地图片以及网络图片，此控件是继承自Imageview控件。

## 项目地址

[https://github.com/crazyandcoder/circleimageview](https://github.com/crazyandcoder/circleimageview)


----------


### 效果预览
![](http://img.blog.csdn.net/20161121093645535)

### 使用方法 
**1、maven方式**
```
<dependency>
  <groupId>liji.library.dev</groupId>
  <artifactId>circleimageview</artifactId>
  <version>0.1.0</version>
  <type>pom</type>
</dependency>
```

**2、gradle方式**

```
compile 'liji.library.dev:circleimageview:0.1.0'
```

**3、代码使用**

对于加载本地图片的话，**我们需要设置src而不是background**

```
<com.liji.circleimageview.CircleImageView
            android:src="@drawable/head"
            app:circle_border_color="#ffffff"
            app:circle_border_width="5dp"
            android:layout_width="150dp"
            android:layout_height="150dp" />

```

对于加载网络图片，我们一般需要使用第三方的加载库如glide、ImageLoader等等，都可以，使用方法同ImageView。

```

CircleImageView border_image=(CircleImageView)findViewById(R.id.border_image);

Glide.with(MainActivity.this).load("http://s15.sinaimg.cn/mw690/bf131490gd817c13a0dfe&690").into(border_image);

```

**4、自定义属性**

添加对自定义属性命名空间的使用

```
 xmlns:app="http://schemas.android.com/apk/res-auto"
```

1、边框颜色

> app:circle_border_color="#ffffff"

2、边框宽度
> app:circle_border_width="5dp"

----------


**关于作者**

我的博客：http://crazyandcoder.github.io/

我的github: https://github.com/crazyandcoder

简书号：http://www.jianshu.com/users/18281bdb07ce/latest_articles
