package kr.co.sunnyvale.twobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    Button plusButton;
    Button minusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // id에 대항하는 레퍼런스를 찾아온다.
        tv = (TextView)findViewById(R.id.textView);
        plusButton = (Button)findViewById(R.id.plusButton);
        minusButton = (Button)findViewById(R.id.minusButton);

        plusButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // textView에 적혀있는 글자를 읽어온다.
                        String s = tv.getText().toString();
                        // 문자열을 정수로 변환
                        int i = Integer.parseInt(s);
                        i++;
                        // 정수를 문장열로 바꿔서 tv의 값을 바꿔준다.
                        tv.setText(i+ "");
                    }
                }
        ); // setOnClickListener

        minusButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // textView에 적혀있는 글자를 읽어온다.
                        String s = tv.getText().toString();
                        // 문자열을 정수로 변환
                        int i = Integer.parseInt(s);
                        i--;
                        // 정수를 문장열로 바꿔서 tv의 값을 바꿔준다.
                        tv.setText(i+ "");
                    }
                }
        ); // setOnClickListener
    } // onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
