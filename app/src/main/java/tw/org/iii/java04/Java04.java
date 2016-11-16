package tw.org.iii.java04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Java04 extends AppCompatActivity {
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java04);
        Log.v("Java", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Java", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Java", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Java", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Java", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Java", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Java", "onDestroy");
    }

    public void test1(View view) {

        Intent it = new Intent(this, Page2Activity.class);
        //↑物件   ↑此為類別
        startActivity(it);
    }

    public void test3(View view) {
        Intent it = new Intent(this, Page3Activity.class);
        //↑物件   ↑此為類別
        it.putExtra("name","Java");
        it.putExtra("level",1);
        it.putExtra("sound",true);
        startActivity(it);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String key1 = data.getStringExtra("key1");
        Log.v("Java","onActivityResult : " + requestCode + ":" + requestCode + ":" + key1);
    }

    public void test4(View view) {
        Intent it = new Intent(this, Page3Activity.class);
        //↑物件   ↑此為類別
        it.putExtra("name","Java");
        it.putExtra("level",1);
        it.putExtra("sound",true);
        //startActivity(it);
        startActivityForResult(it,123);  //requestCode =>123
    }
}