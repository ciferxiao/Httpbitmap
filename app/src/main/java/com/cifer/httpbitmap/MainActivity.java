package com.cifer.httpbitmap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //图片下载的请求地址
    private String img_path0
            = "http://ogviubbr9.bkt.clouddn.com/UserImg1504017851884";
    private String img_path1
            = "http://ogviubbr9.bkt.clouddn.com/UserImg1504017851884";
    private String img_path2
            = "http://ogviubbr9.bkt.clouddn.com/UserImg1504017851884";
    private String img_path3
            = "http://ogviubbr9.bkt.clouddn.com/UserImg1504017851884";
    private String img_path4
            = "http://ogviubbr9.bkt.clouddn.com/UserImg1504017851884";

    private String[]  bookname ={"JAVA学习的自我修养","Andoird自我修养","数据结构算法"
            ,"IOS自我开发","数据结构算法","数据结构算法"};

    private Book[] books = new Book[6];
    List<Book> list = new ArrayList<>();

    private OkhttpManager okhttpManager;


    private ImageView imageView;
    private Bitmap mbitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        okhttpManager = OkhttpManager.getInstance();

        getHttpdata(img_path0);

        imageView = (ImageView)findViewById(R.id.imager);

        ListView listView = (ListView) findViewById(R.id.list);
        ListAdapter adapter = new ListAdapter(MainActivity.this,R.layout.list_item,list);
        listView.setAdapter(adapter);
    }


    //动态添加
    private void initbook(Bitmap bitmap){
        for(int i = 0; i<bookname.length;i++){
            books[i] = new Book(bitmap,bookname[i]);
            //books[i].setMbookid(bitmap);
            list.add(books[i]);
        }
    }

    //获取网络图片 方法
    private void getHttpdata(String urlpath){
        okhttpManager.asyncDownLoadImgtByUrl(urlpath, new OkhttpManager.Fun3() {
            @Override
            public void onResponse(Bitmap bitmap) {
                mbitmap=bitmap;
                initbook(mbitmap);
            }
        });
    }
}
