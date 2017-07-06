package com.example.raiman.calculatorscientific;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnswer;
    Button btn1, btn2,btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnStop,btnTanh,btnCosh,btnCoth,btnSqr;
    Button btnAdd, btnSubt,btnMult,btnEquals,btnSin,btnCos,btnTan,btnCe,btnC,btnDiv,btnPerc,btnLog,btnReg, btnDeg,btnExp;
    Double Answer; Double Val2 =0.0; Double Val1 =0.1;
    String Sign; boolean solved = false; boolean solvedWithouEqu = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddOnclickListenersForButton();
    }
    private void AddOnclickListenersForButton(){
        txtAnswer = (TextView) findViewById(R.id.editText);
        btn0=(Button)findViewById(R.id.btn0);btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);btn7=(Button)findViewById(R.id.btn7);
        btn9=(Button)findViewById(R.id.btn9);btn8=(Button)findViewById(R.id.btn8);
        btnC=(Button)findViewById(R.id.C);btnCe=(Button)findViewById(R.id.Ce);
        btnCos=(Button)findViewById(R.id.cos);btnTan=(Button)findViewById(R.id.tan);
        btnEquals=(Button)findViewById(R.id.equals);btnPerc=(Button)findViewById(R.id.perc);
        btnDiv=(Button)findViewById(R.id.div);btnAdd=(Button)findViewById(R.id.add);
        btnSubt=(Button)findViewById(R.id.subt);btnLog=(Button)findViewById(R.id.log);
        btnStop=(Button)findViewById(R.id.dot);btnMult=(Button)findViewById(R.id.mult);
        btnTanh=(Button)findViewById(R.id.tanh);btnCoth=(Button)findViewById(R.id.sinh);
        btnCosh=(Button)findViewById(R.id.cosh);btnSqr=(Button)findViewById(R.id.sqrt);
        btnSin=(Button)findViewById(R.id.sin);btnExp=(Button)findViewById(R.id.exp);
        btnDeg=(Button)findViewById(R.id.deg);btnReg=(Button)findViewById(R.id.rad);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn0.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btn9.getText().toString());
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved==true || solvedWithouEqu==true){txtAnswer.setText(""); solved=false;solvedWithouEqu=false;}
                txtAnswer.setText(txtAnswer.getText().toString() +  btnStop.getText().toString());
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="+";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Val1 + Double.parseDouble(txtAnswer.getText().toString())  ;
                        txtAnswer.setText(Val1.toString()); Sign="+";solvedWithouEqu=true;}
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }
            }
        });
        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="-";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Val1 - Double.parseDouble(txtAnswer.getText().toString())  ;
                        txtAnswer.setText(Val1.toString()); Sign="-";solvedWithouEqu=true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAnswer.setText("");Val2=0.0; Val1=0.0;
            }
        });
        btnCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int i= txtAnswer.getText().length();
                    txtAnswer.setText(txtAnswer.getText().subSequence(0,i-1));
                    if (txtAnswer.getText()==null){Val1=0.0;}
                }
                catch (Exception ex) {txtAnswer.setText("");}
                finally {

                }


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="/";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Val1 / Double.parseDouble(txtAnswer.getText().toString())  ;
                        txtAnswer.setText(Val1.toString()); Sign="/";solvedWithouEqu=true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="*";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Val1 * Double.parseDouble(txtAnswer.getText().toString())  ;
                        txtAnswer.setText(Val1.toString()); Sign="*";solvedWithouEqu=true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="^";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1=Math.pow(Val1, Double.parseDouble(txtAnswer.getText().toString()))  ;
                        txtAnswer.setText(Val1.toString()); Sign="^";solvedWithouEqu=true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if (Val2==0.0){
                        Val1=Double.parseDouble(txtAnswer.getText().toString()) ;
                        txtAnswer.setText(""); Sign="%";Val2=Double.parseDouble("1");
                    }
                    else {
                        Val1 = Val1 * (Double.parseDouble(txtAnswer.getText().toString()) / 100);
                        txtAnswer.setText(Val1.toString());
                        Sign = "%";
                        solvedWithouEqu = true;
                    }
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.log(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.sin(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.cos(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.tan(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });
        btnCoth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.sinh(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally { }

            }
        });
        btnCosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.cosh(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally { }

            }
        });
        btnTanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.tanh(Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString())));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.toRadians(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        btnDeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Answer=Math.toDegrees(Double.parseDouble(txtAnswer.getText().toString()));
                    Val2=0.0; Val1=0.0;
                    txtAnswer.setText(Answer.toString());solvedWithouEqu=true;

                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Val2=Double.parseDouble(txtAnswer.getText().toString());
                    switch (Sign){
                        case  "+":Answer=Val1 + Val2; break;
                        case  "-":Answer=Val1 - Val2; break;
                        case  "*":Answer=Val1 * Val2; break;
                        case  "/":Answer=Val1 / Val2; break;
                        case  "%":Answer=Val1 * (Val2/100); break;
                        case  "^":Answer=Math.pow(Val1, Val2); break;
                        default:
                    }
                    txtAnswer.setText(String.format(Answer.toString()));
                    Val2=0.0; Val1=0.0; solved=true; Sign="";
                }
                catch (Exception ex) {txtAnswer.setText("0");}
                finally {

                }

            }
        });

    }
}
