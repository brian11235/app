package b.boldandbrash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by linbrian on 2017/10/8.
 */

public class backToMainPageActivity extends AppCompatActivity {
    private Button returnButton;
    private Button submitButton;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_function);
        //取得此Button的實體
        returnButton = (Button)findViewById(R.id.button7);
        submitButton = (Button)findViewById(R.id.button6);
        editText = (EditText)findViewById(R.id.editText);

        //實做OnClickListener界面
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(backToMainPageActivity.this , MainActivity.class);
                //開啟Activity
                startActivity(intent);
            }
        });
        //connect to question
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(backToMainPageActivity.this , Questions.class);
                //開啟Activity
                //Bundle bundle = new Bundle();
                //bundle.putString("data",editText.getText().toString());
                //intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
