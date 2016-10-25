package kr.hs.emirim.thsgkdud123.gallerytest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    ImageView imgMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery_1);
        imgMain=(ImageView)findViewById(R.id.imgv_main);
        MyGalleryAdapter adapter=new MyGalleryAdapter(this);
        gallery.setAdapter(adapter);

    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        int[] posterIDs={R.drawable.jpg01, R.drawable.jpg02,R.drawable.jpg03,R.drawable.jpg04,R.drawable.jpg05,R.drawable.jpg06,
                R.drawable.jpg07,R.drawable.jpg08,R.drawable.jpg09,R.drawable.jpg10,};
        public MyGalleryAdapter(Context context){
            this.context=context;
        }

        @Override
        public int getCount() {
            return posterIDs.length;
            //썸네일 이미지
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgV=new ImageView(context);
            imgV.setLayoutParams(new Gallery.LayoutParams(100,150));
            imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgV.setPadding(5,5,5,5);
            imgV.setImageResource(posterIDs[position]);
            return imgV;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
    }
}
