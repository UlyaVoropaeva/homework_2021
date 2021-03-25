package lesson_8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result implements ActionListener {

    private final StringBuilder stringBuilder;
    private String result;

    public Result(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;

    }

    public String getResult() {
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public  String evaluate (String string) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult1 = scriptEngine.eval(string);
        String result = String.valueOf(expResult1);
        return  result ;
    }
}
