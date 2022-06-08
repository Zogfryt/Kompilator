package com.demo.tools;

class ValueBuilder {

    private ValueBuilder(){}
    static String buildVariableToUse(String value, PythonTypes type)
    {
        StringBuilder build = new StringBuilder();
        build.append("((");
        switch(type)
        {
            case STRING -> build.append("String*)");
            case NUMERICAL -> build.append("Integer*)");
            case FLOAT -> build.append("Double*)");
            case BOOL -> build.append("BOOLEAN*)");
            case NONE -> {
                return value;
            }

        }
        build.append(value);
        build.append(")->value");
        return build.toString();
    }

    static String buildVariableToInitialize(String value, PythonTypes type, String expression)
    {
        StringBuilder build = new StringBuilder();
        build.append("Object* ");
        build.append(value);
        build.append(" = ");

        switch(type)
        {

            case STRING -> build.append("new String");
            case NUMERICAL -> build.append("new Integer");
            case FLOAT -> build.append("new Double");
            case BOOL -> build.append("new Boolean");
            case NONE -> {
                build.append("nullptr;");
                return build.toString();
            }
        }

        build.append("(");
        build.append(expression);
        build.append(");");
        return build.toString();
    }

    static String buildVariableTypeChange(String value, String expression, PythonTypes type, String sep)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("delete ");
        builder.append(value);
        builder.append(";");
        builder.append(sep);

        builder.append(value);
        builder.append(" = ");
        switch(type)
        {
            case STRING -> builder.append("new String");
            case NUMERICAL -> builder.append("new Integer");
            case FLOAT -> builder.append("new Double");
            case BOOL -> builder.append("new Boolean");
            case NONE -> {
                builder.append("nullptr;");
                builder.append(sep);
                return builder.toString();
            }
        }

        builder.append("(");
        builder.append(expression);
        builder.append(");");
        return builder.toString();
    }

    static String buildVariableValuesChange(String value, String expression, PythonTypes type)
    {
        StringBuilder build = new StringBuilder();
        switch(type)
        {
            case STRING -> build.append("((String*)");
            case NUMERICAL -> build.append("((Integer*)");
            case FLOAT -> build.append("((Double*)");
            case BOOL -> build.append("((Boolean*)");
            case NONE -> {
                return value + " = nullptr;";
            }
        }
        build.append(value);
        build.append(")->value = ");
        build.append(expression);
        build.append(";");
        return build.toString();
    }

    static String buildVariableName(String basename)
    {
        return "var_" + basename;
    }
}
