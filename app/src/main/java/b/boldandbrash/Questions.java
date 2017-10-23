package b.boldandbrash;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Questions extends AppCompatActivity {

    int i;
    private TextView question_box;
    private EditText answer_box;
    private Resources res;
    private String[] coping_questions;
    private Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        res = getResources();
        coping_questions = res.getStringArray(R.array.coping_questions);
        question_box = (TextView)findViewById(R.id.coping_question);
        answer_box = (EditText)findViewById(R.id.coping_response);
        question_box.setText(coping_questions[i]);
        clearButton = (Button)findViewById(R.id.submit_response);
        i=1;
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question_box.setText("");
                if(i<6){
                    question_box.setText(coping_questions[i]);
                    answer_box.setText("");
                    i++;
                }else{
                    clearButton.setText("return");
                    //初始化Intent物件
                    Intent intent = new Intent();
                    //從MainActivity 到Main2Activity
                    intent.setClass(Questions.this , MainActivity.class);
                    //開啟Activity
                    startActivity(intent);
                }

            }
        });

    }

    public void submitResponse(View v)
    {
        //changes question display and clears the EditText
        for(int i = 1 ; i < question_box.length() ; i++){

        }
        question_box.setText(coping_questions[i++]);
        answer_box.setText("");

        //!!!add code to save responses to a file

        if(i <= 6)
        {
            Intent intent = new Intent();

            //!!!add more code to transfer to whichever activity comes next
        }
    }

}
