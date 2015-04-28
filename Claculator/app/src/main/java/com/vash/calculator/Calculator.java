package com.vash.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {


    Double val_1, func_new_value, a = (double) 0;
    String op = null;
    String string;

    public double fact(double num) {
        return (num == 0) ? 1 : num * fact(num - 1);
    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vash.calculator.R.layout.activity_calculator_horizontal);


        final TextView view = (TextView) findViewById(R.id.textView1);
        final TextView view1 = (TextView) findViewById(R.id.textView2);
        Button b_0 = (Button) findViewById(R.id.button1);
        Button b_1 = (Button) findViewById(R.id.button5);
        Button b_2 = (Button) findViewById(R.id.button6);
        Button b_3 = (Button) findViewById(R.id.button7);
        Button b_4 = (Button) findViewById(R.id.button9);
        Button b_5 = (Button) findViewById(R.id.button10);
        Button b_6 = (Button) findViewById(R.id.button11);
        Button b_7 = (Button) findViewById(R.id.button13);
        Button b_8 = (Button) findViewById(R.id.button14);
        Button b_9 = (Button) findViewById(R.id.button15);
        Button b_division = (Button) findViewById(R.id.button16);
        Button b_multiply = (Button) findViewById(R.id.button12);
        Button b_add = (Button) findViewById(R.id.button8);
        Button b_subtract = (Button) findViewById(R.id.button4);
        Button b_entry = (Button) findViewById(R.id.button3);
        Button b_point = (Button) findViewById(R.id.button2);
        Button b_ac = (Button) findViewById(R.id.button17);
        Button b_power = (Button) findViewById(R.id.button18);
        Button b_sin = (Button) findViewById(R.id.button19);
        Button b_cos = (Button) findViewById(R.id.button20);
        Button b_tg = (Button) findViewById(R.id.button21);
        Button b_ctg = (Button) findViewById(R.id.button22);
        Button b_pi = (Button) findViewById(R.id.button23);
        Button b_e = (Button) findViewById(R.id.button24);
        Button b_log = (Button) findViewById(R.id.button25);
        Button b_sqrt = (Button) findViewById(R.id.button26);
        Button b_fact = (Button) findViewById(R.id.button27);
        Button b_op = (Button) findViewById(R.id.button28);


        b_0.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "0";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0") /*|| (op != null)*/) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "1";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "2";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "3";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "4";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "5";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "6";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "7";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_8.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "8";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_9.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = "9";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_point.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String buttn = ".";
                String pre_val = view.getText().toString();
                String new_val;

                if (pre_val.equals("0")) {
                    new_val = buttn;
                } else {
                    new_val = pre_val.concat(buttn);
                }

                view.setText(new_val);
            }
        });

        b_pi.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                final Double buttn = Math.PI;
                view.setText(buttn + "");
            }
        });

        b_e.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                final Double buttn = Math.E;
                view.setText(buttn + "");
            }
        });

        b_division.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "division";
                view.setText("0");
            }
        });

        b_multiply.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "multiply";
                view.setText("0");
            }
        });

        b_add.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                func_new_value = a + val_1;
                op = "add";
                view.setText("0");
            }
        });

        b_subtract.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "subtract";
                view.setText("0");
            }
        });

        b_power.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "power";
                view.setText("0");
            }
        });

        b_sin.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "sin";
                func_new_value = Math.sin(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_cos.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "cos";
                func_new_value = Math.cos(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_tg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "tg";
                func_new_value = Math.tan(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_ctg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "ctg";
                func_new_value = (1 / Math.tan(val_1));
                view.setText(func_new_value + "");
            }
        });

        b_log.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "log";
                func_new_value = Math.log(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_sqrt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "sqrt";
                func_new_value = Math.sqrt(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_fact.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = view.getText().toString();
                val_1 = Double.parseDouble(value);
                op = "fact";
                func_new_value = fact(val_1);
                view.setText(func_new_value + "");
            }
        });

        b_op.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText("");
                String val_2 = TranslationInScr.inPolishNotation(string);
                view1.setText(val_2);
            }
        });


        b_entry.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String operation = op;
                Double value_1 = Double.parseDouble(view.getText().toString());
                Double value_2 = val_1;

                if (operation != null) {
                    if (operation.equals("division")) {
                        func_new_value = value_2 / value_1;
                        string = (value_2 + "/" + value_1);
                        view.setText(func_new_value + "");
                        view1.setText(string);
                    } else if (operation.equals("multiply")) {
                        func_new_value = value_2 * value_1;
                        view.setText(func_new_value + "");
                    } else if (operation.equals("add")) {
                        func_new_value = func_new_value + value_1;
                        view.setText(func_new_value + "");
                    } else if (operation.equals("subtract")) {
                        func_new_value = value_2 - value_1;
                        view.setText(func_new_value + "");
                    } else if (operation.equals("power")) {
                        func_new_value = Math.pow(value_2, value_1);
                        view.setText(func_new_value + "");
                    }
                }

                val_1 = func_new_value;
                op = null;
            }
        });

        b_ac.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                view.setText("0");
                view1.setText("");
                val_1 = (double) 0;
                op = null;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.vash.calculator.R.menu.activity_calculator, menu);
        return true;
    }
}
