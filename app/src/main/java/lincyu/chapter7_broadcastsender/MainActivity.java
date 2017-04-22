package lincyu.chapter7_broadcastsender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    EditText et_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn_notification);
        btn.setOnClickListener(rec_notification);
        et_msg = (EditText)findViewById(R.id.et_msg);
    }


    private OnClickListener rec_notification = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("lincyu.NOTIFICATION");
            String msg = et_msg.getEditableText().toString();
            intent.putExtra("KEY_MSG", msg);
            sendBroadcast(intent);
        }
    };

}
