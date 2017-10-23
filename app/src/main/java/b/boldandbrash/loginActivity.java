package b.boldandbrash;

/**
 * Created by linbrian on 2017/10/8.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
public class loginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        //取得此Button的實體
        loginButton = (Button) findViewById(R.id.button);
        username = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.editText4);
        //實做OnClickListener界面
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if("admin".equals(username)&&"admin".equals(password)){
                    //初始化Intent物件
                    Intent intent = new Intent();
                    //從MainActivity 到Main2Activity
                    intent.setClass(loginActivity.this, HomeScreen.class);
                    //開啟Activity
                    startActivity(intent);
                //}
//                }else{
//                    Builder MyAlertDialog = new AlertDialog.Builder(this);
//                    MyAlertDialog.setTitle("warning");
//                    MyAlertDialog.setMessage("username or password is wrong");
//                    MyAlertDialog.show();
//                }
            }
        });
    }

}
