package psi.expandablel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;


import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MainActivity extends AppCompatActivity{

    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4, expandableLayout5, expandableLayout6, expandableLayout7;
    Toolbar toolbar;

    /*private void hideKeyboard (){
        inputMethodManager inputManager =
                (InputMethodManager) context.
                        getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(
                this.getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }*/

    private EditText nidTarv;
    private EditText nidCSRF;
    private ScrollView scrollView;

    private  void hideKeyboard(EditText editText1){
        final EditText editText =editText1;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean focused) {
                InputMethodManager keyboard = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                if (focused) {
                    keyboard.showSoftInput(editText, 0);
                    Toast.makeText(MainActivity.this, "foco", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "nao foco", Toast.LENGTH_LONG).show();
                    keyboard.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle("Livro de Registo");
        setSupportActionBar(toolbar);

        nidTarv = (EditText) findViewById(R.id.NIDTARV);
        nidCSRF = (EditText) findViewById(R.id.NIDCSRPF);
        scrollView = (ScrollView) findViewById(R.id.scroll);

        scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "scroll", Toast.LENGTH_LONG).show();
            }
        });
        /*
        scrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });**/

        hideKeyboard(nidTarv);
        hideKeyboard(nidCSRF);

    }

    public void expandableButton1(View view) {
        expandableLayout1 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle(); // toggle expand and collapse
    }

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }

    public void expandableButton5(View view) {
        expandableLayout5 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout5);
        expandableLayout5.toggle(); // toggle expand and collapse
    }

    public void expandableButton6(View view) {
        expandableLayout6 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout6);
        expandableLayout6.toggle(); // toggle expand and collapse
    }

    public void expandableButton7(View view) {
        expandableLayout7 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout7);
        expandableLayout7.toggle(); // toggle expand and collapse
    }




}


