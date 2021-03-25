package lesson_8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import  java.lang.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ButtonListener implements ActionListener {
    private final JTextField in;

    public ButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton btn = (JButton) e.getSource();
        StringBuilder stringBuilder = new StringBuilder(in.getText());
        CalcListener calcListener = new CalcListener(stringBuilder);
        Result result = new Result(stringBuilder);

       /** if (btn.getText().equals("=")){
            try {
                result.evaluate(stringBuilder.toString());
                in.setText(result.getResult());
                stringBuilder.delete(0, stringBuilder.length());
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }
        }else {

            stringBuilder.append(btn.getText());
            in.setText(stringBuilder.toString());
        }

    }*/

      if (btn.getText() == "=") {

            calcListener.calculate(stringBuilder.toString());
            in.setText(calcListener.getCalcListener());
            stringBuilder.delete(0, stringBuilder.length());

        } else if (btn.getText() == "sqrt") {
            in.setText(calculateSQRT(stringBuilder.toString()));
        } else {
            stringBuilder.append(btn.getText());
            in.setText(stringBuilder.toString());
        }
        if (btn.getText() == "C") {
            stringBuilder.delete(0,stringBuilder.length());
            in.setText(stringBuilder.toString());
        }
    }

    public String calculateSQRT(String string) {

        return String.valueOf(Math.sqrt(Double.parseDouble(string.substring(0, string.length()))));
    }

    }








