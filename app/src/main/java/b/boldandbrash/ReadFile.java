package b.boldandbrash;

/**
 * Created by linbrian on 2017/10/8.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
public class ReadFile extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            FileWriter fw = new FileWriter("/sdcard/output.txt", false);
            BufferedWriter bw = new BufferedWriter(fw); //將BufferedWeiter與FileWrite物件做連結
            bw.write(getIntent().getStringExtra("data"));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
