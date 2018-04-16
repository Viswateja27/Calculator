package com.example.viswatejayetukuri.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    public String p,q;
    public TextView txt1,result;
    public double n1,n2,r;
    Boolean add=false,sub=false,mul=false,div=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView) findViewById(R.id.txt1);
        result=(TextView) findViewById(R.id.result);
    }
    public void buttonc(View view)
    {
        txt1.setText(" ");
        result.setText(" ");
    }
    public void division(View view)
    {
        Button bdiv=(Button) findViewById(R.id.bdiv);
        p=txt1.getText().toString();
        if(p.length()!=0)
        {
            n1=Double.parseDouble(p);
            txt1.setText(" ");
            result.setText(n1+" /");
            div=true;
            add=false;
            sub=false;
            mul=false;
        }
        else
        {
            q=result.getText().toString();
            n1=Double.parseDouble(q);
            txt1.setText(" ");
            result.setText(n1+" /");
            div=true;
            add=false;
            sub=false;
            mul=false;
        }
    }
    public void multiplication(View view)
    {
        Button bmul=(Button) findViewById(R.id.bmul);
        p=txt1.getText().toString();
        if(p.length()!=0)
        {
            n1=Double.parseDouble(p);
            txt1.setText(" ");
            result.setText(n1+" *");
            div=false;
            add=false;
            sub=false;
            mul=true;
        }
        else
        {
            q= result.getText().toString();
            n1=Double.parseDouble(q);
            txt1.setText("");
            result.setText(n1 +" *");
            mul=true;
            add= false;
            sub=false;
            div=false;
        }
    }
    public void addition(View view)
    {
        Button bplus=(Button) findViewById(R.id.bplus);
        p=txt1.getText().toString();
        if(p.length()!=0)
        {
            n1=Double.parseDouble(p);
            txt1.setText(" ");
            result.setText(n1+" +");
            add=true;
            mul=false;
            div=false;
            sub=false;
        }
        else
        {
            q=result.getText().toString();
            n1=Double.parseDouble(q);
            txt1.setText(" ");
            result.setText(n1+" +");
            add=true;
            mul=false;
            sub=false;
            div=false;
        }
    }
    public void subtraction(View view)
    {
        Button bminus=(Button)findViewById(R.id.bminus);
        p=txt1.getText().toString();
        if(p.length()!=0)
        {
            n1=Double.parseDouble(p);
            txt1.setText(" ");
            result.setText(n1+" -");
            sub=true;
            mul=false;
            div=false;
            add=false;
        }
        else
        {
            q=result.getText().toString();
            n1=Double.parseDouble(q);
            txt1.setText(" ");
            result.setText(n1+" -");
            sub=true;
            mul=false;
            div=false;
            add=false;
        }
    }


    public void nine(View view)
    {
        Button b9 = (Button)findViewById(R.id.b9);
        txt1.setText(txt1.getText().toString()+"9");
    }
    public void eight(View view)
    {
        Button b8=(Button)findViewById(R.id.b8);
        txt1.setText(txt1.getText().toString()+"8");
    }

    public void seven(View view)
    {
        Button b7=(Button)findViewById(R.id.b7);
        txt1.setText(txt1.getText().toString()+"7");
    }

    public void six(View view) {
        Button b6=(Button)findViewById(R.id.b6);
        txt1.setText(txt1.getText().toString()+"6");
    }

    public void five(View view) {
        Button b5=(Button)findViewById(R.id.b5);
        txt1.setText(txt1.getText().toString()+"5");
    }

    public void four(View view) {
        Button b4=(Button)findViewById(R.id.b4);
        txt1.setText(txt1.getText().toString()+"4");
    }

    public void three(View view) {
        Button b3=(Button)findViewById(R.id.b3);
        txt1.setText(txt1.getText().toString()+"3");
    }

    public void two(View view) {
        Button b2=(Button)findViewById(R.id.b2);
        txt1.setText(txt1.getText().toString()+"2");
    }

    public void one(View view) {
        Button b1=(Button)findViewById(R.id.b1);
        txt1.setText(txt1.getText().toString()+"1");
    }

    public void zz(View view) {
        Button b00=(Button)findViewById(R.id.b00);
        txt1.setText(txt1.getText().toString()+"00");
    }

    public void dot(View view) {
        Button bdot=(Button)findViewById(R.id.bdot);
        txt1.setText(txt1.getText().toString()+".");
    }

    public void zero(View view) {
        Button b0=(Button)findViewById(R.id.b0);
        txt1.setText(txt1.getText().toString()+"0");
    }

    public void equal(View view) {
        Button bequal=(Button)findViewById(R.id.bequal);
        q=txt1.getText().toString();
        n2=Double.parseDouble(q);
        txt1.setText("");
        if(add==true) {
            r=n1+n2;
            String ans=String.valueOf(r);
            result.setText(ans);
        }
        if(sub==true) {
            r=n1-n2;
            String ans=String.valueOf(r);
            result.setText(ans);
        }
        if(mul==true) {
            r=n1*n2;
            String ans=String.valueOf(r);
            result.setText(ans);
        }
        if(div==true) {
            r=n1/n2;
            String ans=String.valueOf(r);
            result.setText(ans);
        }
    }
}
