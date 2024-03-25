package com.example;
import java.util.HashMap;

public class Environment {
    private HashMap<String, Object> variables;
    private HashMap<String, Function> functions;

    public Environment() {
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
        // Agregar las nuevas funciones al entorno
        functions.put("fahrenheit-to-celsius", null);
        functions.put("fibonacci-and-factorial", null);
    }

    public void addVariable(String name, Object value) {
        variables.put(name, value);
    }

    public Object getVariableValue(String name) {
        return variables.get(name);
    }

    public void addFunction(String name, Function function) {
        functions.put(name, function);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }
}

