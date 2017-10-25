package zhanghegang.com.bawei.yuekaolianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DrawCicle drawCicle;
    private CicleImage cicle_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        drawCicle = (DrawCicle) findViewById(R.id.cicle);
//        cicle_img = (CicleImage) findViewById(R.id.cicle_img);
    }
}
