package e4;



import java.util.ArrayList;
import java.util.Objects;

public class Calculator {
    public enum Operations{
        SUMA("+") {
            @Override
            public float perform(float operand1, float operand2) {
                return operand1 + operand2;
            }
        },
        RESTA("-") {
            @Override
            public float perform(float operand1, float operand2) {
                return operand1 - operand2;
            }
        },
        MULTIPLICACION("*") {
            @Override
            public float perform(float operand1, float operand2) {
                return operand1 * operand2;
            }
        },
        DIVISION("/") {
            @Override
            public float perform(float operand1, float operand2) {
                return operand1 / operand2;
            }
        };

        private final String operator;

        Operations(String operator) {
            this.operator = operator;
        }

        public String getOperators() {
            return operator;
        }

        public abstract float perform(float operand1, float operand2);
    }


    ArrayList<Operations> Operaciones;
    public float Resultados;
    ArrayList<Float> Operandos;

    public Calculator() {
        Operaciones = new ArrayList<Operations>();
        Operandos = new ArrayList<Float>();

    }

       private float operaciones(Operations operacion,float param1,float param2){
        float Resultado=0f;
          switch(operacion){
            case SUMA:
                 Resultado = Operations.SUMA.perform(param1,param2);
                break;
            case RESTA:
                 Resultado = Operations.RESTA.perform(param1, param2);
                break;
            case MULTIPLICACION:
                 Resultado = Operations.MULTIPLICACION.perform(param1,param2);
                break;
            case DIVISION:
                 Resultado = Operations.DIVISION.perform(param1,param2);
                break;
            default:
        }
           return Resultado;
       }

    public void cleanOperations(){
        Operaciones.clear();
        Operandos.clear();
    }
    public void addOperation(String operation, float... arguments) {
            if (Operandos.isEmpty()) {
                Operandos.add(arguments[0]);
                Operandos.add(arguments[1]);
            } else if(Operandos.size()>1)
                Operandos.add(arguments[0]);


        if (operation != "+" && operation != "-" && operation != "/" && operation != "*") {
            cleanOperations();
            throw new IllegalArgumentException();
        } else {
            if (operation == "+")
                Operaciones.add(Operations.SUMA);
            if (operation == "-")
                Operaciones.add(Operations.RESTA);
            if (operation == "*")
                Operaciones.add(Operations.MULTIPLICACION);
            if (operation == "/")
                Operaciones.add(Operations.DIVISION);
        }


    }

     public float executeOperations () {
       for (int i = 0; i < Operandos.size()-1; i++) {
        if (Operaciones.get(i) == Operations.DIVISION && Operandos.get(i + 1) == 0) {
            cleanOperations();
            throw new ArithmeticException();
        }
           if (i == 0) {
               Resultados = operaciones(Operaciones.get(i), Operandos.get(i), Operandos.get(i + 1));
           } else {
               Resultados = operaciones(Operaciones.get(i), Resultados, Operandos.get(i + 1));
           }
       }
            cleanOperations();
            return Resultados;

        }




    public String toString() {
        String state = new String("[STATE:");
        for (int j = 0; j < Operaciones.size(); j++) {
            if (j==0) {
                state = state + "[";
                //state = state + Operaciones.get(j);
                if(Operaciones.get(j) == Operations.SUMA) state = state + "+";
                else if(Operaciones.get(j) == Operations.RESTA) state = state + "-";
                else if(Operaciones.get(j) == Operations.MULTIPLICACION) state = state + "*";
                else if(Operaciones.get(j) == Operations.DIVISION) state = state + "/";
                state = state + "]";
                state = state + Operandos.get(0) + "_" + Operandos.get(1) + "";
            }
            else{
                state = state + "[";
                if(Operaciones.get(j) == Operations.SUMA) state = state + "+";
                else if(Operaciones.get(j) == Operations.RESTA) state = state + "-";
                else if(Operaciones.get(j) == Operations.MULTIPLICACION) state = state + "*";
                else if(Operaciones.get(j) == Operations.DIVISION) state = state + "/";
                state = state + "]";
                state = state + Operandos.get(j+1) + "";
            }
        }
        state = state + "]";
        return state;

    }

}