package com.example.calculadorabasica;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class CalculadoraBasica extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_basica);
        
        View boton1 = findViewById(R.id.Btn1);
        View boton2 = findViewById(R.id.Btn2);
        View boton3 = findViewById(R.id.Btn3);
        View boton4 = findViewById(R.id.Btn4);
        View boton5 = findViewById(R.id.Btn5);
        View boton6 = findViewById(R.id.Btn6);
        View boton7 = findViewById(R.id.Btn7);
        View boton8 = findViewById(R.id.Btn8);
        View boton9 = findViewById(R.id.Btn9);
        
        
        
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculadora_basica, menu);
        return true;
    }
    
    
    
    
    
    
    public void onClick(View vista){
    	
    	
    	Button temp;
    	
    	
    	temp = (Button)findViewById(R.id.Btn1);
    	TextView resultado = (TextView)findViewById(R.id.textView2);
    	resultado.setText(temp.getText().toString());
    	
    	/*
    	try{
    		float a = Float.parseFloat(temp.getText().toString());
    		temp = (TextView)findViewById(R.id.editText2);
    		float b = Float.parseFloat(temp.getText().toString());
    		resultado.setText("resultado: "+(a+b));
    	}catch(Exception e){
    		resultado.setText("solo se aceptan numeros");
    	}*/
    	
    }
    
}
