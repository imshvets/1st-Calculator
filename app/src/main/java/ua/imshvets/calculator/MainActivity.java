package ua.imshvets.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> stroka = new ArrayList<>();
    private float digit1;
    private float digit2;
    private float equile;
    private String s = "";
    private TextView sDigit;
    private TextView sDigit1;
    private TextView sDigit2;
    private TextView sZnak;
    private int operaciya = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sDigit = (TextView)findViewById(R.id.textView);
        sDigit1 = (TextView)findViewById(R.id.textView2);
        sDigit2 = (TextView)findViewById(R.id.textView3);
        sZnak = (TextView)findViewById(R.id.textView4);
    }

    public void sbros(View view) {
        stroka.clear();
        sDigit1.setText("");
        sDigit2.setText("");
        sZnak.setText("");
        vivodStroki(sDigit);
    }

    public void delete(View view) {
        int i = stroka.size();
        if (i == 0){
            vivodStroki(sDigit);
        } else {
            stroka.remove(i-1);
            vivodStroki(sDigit);
        }
    }

    public void vivodStroki(View view) {
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        sDigit.setText(s);
        s = "";
    }

    public void add1(View view) {
        stroka.add("1");
        vivodStroki(sDigit);
    }

    public void add2(View view) {
        stroka.add("2");
        vivodStroki(sDigit);
    }

    public void add3(View view) {
        stroka.add("3");
        vivodStroki(sDigit);
    }

    public void add4(View view) {
        stroka.add("4");
        vivodStroki(sDigit);
    }

    public void add5(View view) {
        stroka.add("5");
        vivodStroki(sDigit);
    }

    public void add6(View view) {
        stroka.add("6");
        vivodStroki(sDigit);
    }

    public void add7(View view) {
        stroka.add("7");
        vivodStroki(sDigit);
    }

    public void add8(View view) {
        stroka.add("8");
        vivodStroki(sDigit);
    }

    public void add9(View view) {
        stroka.add("9");
        vivodStroki(sDigit);
    }

    public void add0(View view) {
        stroka.add("0");
        vivodStroki(sDigit);
    }

    public void addpoint(View view) {
        stroka.add(".");
        vivodStroki(sDigit);
    }

    public void equile(View view) {
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        try {
            sDigit2.setText(s + " =");
            digit2 = new Float (s);
        }
        catch (Exception e) {
            sDigit.setText("ошибочка");
        }
        stroka.clear();
        switch (operaciya) {
            case 1: equile = digit1 + digit2;
                break;
            case 2: equile = digit1 - digit2;
                break;
            case 3: equile = digit1 * digit2;
                break;
            case 4: equile = digit1 / digit2;
                break;
            default: equile = 0;
                break;
        }
        s = Float.toString(equile);
        sDigit.setText(s);
    }

    public void plus(View view) {
        operaciya = 1;
        sZnak.setText("+");
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        try {
            sDigit1.setText(s);
            digit1 = new Float (s);
        }
        catch (Exception e) {
            sDigit.setText("ошибочка");
        }
        stroka.clear();
        vivodStroki(sDigit);
        s = "";
    }

    public void minus(View view) {
        operaciya = 2;
        sZnak.setText("-");
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        try {
            sDigit1.setText(s);
            digit1 = new Integer (s);
        }
        catch (Exception e) {
            sDigit.setText("ошибочка");
        }
        stroka.clear();
        vivodStroki(sDigit);
        s = "";
    }

    public void multipli(View view) {
        operaciya = 3;
        sZnak.setText("*");
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        try {
            sDigit1.setText(s);
            digit1 = new Integer (s);
        }
        catch (Exception e) {
            sDigit.setText("ошибочка");
        }
        stroka.clear();
        vivodStroki(sDigit);
        s = "";
    }

    public void divide(View view) {
        operaciya = 4;
        sZnak.setText("/");
        for (int i = 0; i < stroka.size(); i++) {
            s = s + stroka.get(i);
        }
        try {
            sDigit1.setText(s);
            digit1 = new Integer (s);
        }
        catch (Exception e) {
            sDigit.setText("ошибочка");
        }
        stroka.clear();
        vivodStroki(sDigit);
        s = "";
    }

}
