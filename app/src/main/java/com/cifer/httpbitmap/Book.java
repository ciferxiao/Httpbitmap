package com.cifer.httpbitmap;

import android.graphics.Bitmap;

/**
 * Created by xiaojinggong on 11/27/17.
 */

public class Book {
    private String mbooktitle;
    private Bitmap mbookmap;

    public Book(Bitmap bookid,String booktitle){
        this.mbookmap = bookid;
        this.mbooktitle = booktitle;
    }

    public String getMbooktitle() {
        return mbooktitle;
    }

    public Bitmap getMbookid() {
        return mbookmap;
    }

    public Bitmap setMbookid(Bitmap bitmap) {
        mbookmap = bitmap;
        return mbookmap;
    }

}
