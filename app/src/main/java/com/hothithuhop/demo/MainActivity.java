package com.hothithuhop.demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] language ={"C", "C++", "Java",".NET","iPhone",
            "Android", "ASP.NET", "PHP"};
    private Button btn_tuychon, btn_goiy;
    private RadioButton rb_so9,rb_chut,rb_chus;
    private CheckBox cb_so7;
    private TextView tv_cau1;
    private EditText edt_hovaten;
    private RadioGroup rb_g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
anhxa();

        ControlButton();



        tv_cau1.setText("g là chữ số thứ mấy ?");


        String name = edt_hovaten.getText().toString();

        btn_goiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cb_so7.setEnabled(false);
               rb_so9.setEnabled(false);
                rb_chus.setEnabled(false);
                rb_chut.setEnabled(false);
                if (cb_so7.isChecked()||rb_chus.isChecked())
                {
                    btn_goiy.setText("đúng rồi");
                    cb_so7.setTextColor(Color.RED);
                    rb_chus.setTextColor(Color.RED);
                }
                else
            {
                    btn_goiy.setText("học lại chữ cái");
                }

            }
        });


    }



    private void ControlButton() {
        btn_tuychon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_Alert);
                builder.setTitle("Tùy chọn!!!");
                builder.setMessage("hãy lựa chọn để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("thoát", new DialogInterface.OnClickListener() //Đồng ý thoát app
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton(" Nộp bài", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "cảm ơn bạn đã test bảng chữ cái ", Toast.LENGTH_SHORT).show();
                    }//không xét gì thì nghĩa là nó ở lại trang và xét thì sẽ thực hiện bt
                });

                builder.show();

            }
        });


    }

    private void anhxa()
    {
        btn_tuychon=(Button )findViewById(R.id.btn_tuychon);
        btn_goiy=(Button)findViewById(R.id. btn_goiy);
        rb_chus=(RadioButton) findViewById(R.id.rb_chus);
        rb_chut=(RadioButton) findViewById(R.id.rb_chut);
        rb_so9=(RadioButton) findViewById(R.id.rb_So9);
        cb_so7=(CheckBox) findViewById(R.id.cb_So7);
        tv_cau1 = (TextView) findViewById(R.id.tv_cau1);
        edt_hovaten = (EditText) findViewById(R.id.edt_hovaten);

    }
}
