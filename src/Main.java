import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("JavaScript");
//        String scriptText = "function sum(a,b) {return a+b;}";
//        engine.eval(scriptText);
//        Invocable invocable = (Invocable) engine;
//        Object result = invocable.invokeFunction("sum", 100, 99);
//        System.out.println(result);
        String url = "http://www.baidu.com/{width}/{height}";
        url = url.replace("{width}", "120").replace("{height}", "240");
        System.out.println(url);
    }
}
