package np.com.ashok.web2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);             //Enabling JAVASCRIPT

        myWebView.loadUrl("http://nrghimire.com.np/");       //Change to Your URL
        myWebView.setWebViewClient(new WebViewClient());    //To make sure clicking on links doesnot opens up browser

    }
    @Override

    public void onBackPressed()         //Method for returning to previous webpage when back button is pressed
    {
        if(myWebView.canGoBack())
        {
                myWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}
