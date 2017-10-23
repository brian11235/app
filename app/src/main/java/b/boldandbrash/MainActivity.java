package b.boldandbrash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button textButton;
    private Button rateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得此Button的實體
        button = (Button)findViewById(R.id.button);
        rateButton = (Button)findViewById(R.id.buttonRate);
        textButton = (Button)findViewById(R.id.button2);
        //實做OnClickListener界面
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(MainActivity.this , MediaRecorderActivity.class);
                //開啟Activity
                startActivity(intent);
            }
        });
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(MainActivity.this , backToMainPageActivity.class);
                //開啟Activity
                startActivity(intent);
            }
        });
        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(MainActivity.this , RateActivity.class);
                //開啟Activity
                startActivity(intent);
            }
        });
    }

}
