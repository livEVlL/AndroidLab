package tw.org.iii.java04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3Activity extends AppCompatActivity {

    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Intent it = getIntent();
        int  level = it.getIntExtra("level",0);
        String name = it.getStringExtra("name");
        boolean sound = it.getBooleanExtra("sound",false);

        mesg = (TextView) findViewById(R.id.page3_mesg);
        mesg.setText("Name :"+ name + "\n" +
                "Level" + level + "\n" +
                "Sound" + (sound?"On":"Off"));
    }

    @Override
    public void finish() {
        Intent it = new Intent();
        it.putExtra("key1","value1");
        setResult(321,it);  //在Finish之前　可以再編要做什麼事情
        super.finish();
    }
}
