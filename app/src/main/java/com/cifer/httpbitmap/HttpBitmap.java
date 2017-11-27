package com.cifer.httpbitmap;

import android.graphics.Bitmap;
import android.os.Handler;

/**
 * Created by xiaojinggong on 11/27/17.
 */

public class HttpBitmap {
    private Handler mhandler;
    private Bitmap mbitmap;
    public HttpBitmap(Handler handler){
        this.mhandler = handler;
    }

   /* public Bitmap bitmap(String url){
        try {
            URL url1=new URL(url);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.connect();
            InputStream is=conn.getInputStream();
            byte[] buffer=new byte[1024];
            int len=0;
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            while((len=is.read(buffer))!=-1){
                bos.write(buffer, 0, len);
            }
            byte[] data=bos.toByteArray();
            mbitmap= BitmapFactory.decodeByteArray(data, 0, data.length);
            bos.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return mbitmap;


    }*/

}
