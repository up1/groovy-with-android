package cc.somkiat.demogroovy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView

class MainActivity extends AppCompatActivity {

    @InjectView(R.id.hello) TextView helloTextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        contentView = R.layout.activity_main
        SwissKnife.inject(this)

        helloTextView.text = "Hello World From Groovy"
    }
}
