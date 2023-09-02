import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("AC");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMod = new JButton("%");
    JButton buttonSqrt = new JButton("√");
    JButton buttonLog = new JButton("log");
    JButton buttonBracket1 = new JButton("(");
    JButton buttonBracket2 = new JButton(")");

    Color pastel = new Color(7, 59, 76);
    Color Red = new Color(255,51,51);
    Color Grey = new Color(102,102,102);

    double number;

    public Calculator() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 500);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBounds(10, 20, 270, 60);
        textField.setFont(new Font("Arial",Font.BOLD,28));
        textField.setHorizontalAlignment(JTextField.RIGHT);;
        frame.add(textField);

        buttonSqrt.setBounds(10, 110, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSqrt.setBackground(Grey);
        buttonSqrt.setForeground(Color.white);
        buttonSqrt.addActionListener(this);
        frame.add(buttonSqrt);

        buttonLog.setBounds(80, 110, 60, 40);
        buttonLog.setFont(new Font("Arial", Font.BOLD, 16));
        buttonLog.setBackground(Grey);
        buttonLog.setForeground(Color.white);
        buttonLog.addActionListener(this);
        frame.add(buttonLog);

        buttonBracket1.setBounds(150, 110, 60, 40);
        buttonBracket1.setFont(new Font("Arial", Font.BOLD, 16));
        buttonBracket1.setBackground(Grey);
        buttonBracket1.setForeground(Color.white);
        buttonBracket1.addActionListener(this);
        frame.add(buttonBracket1);

        buttonBracket2.setBounds(220, 110, 60, 40);
        buttonBracket2.setFont(new Font("Arial", Font.BOLD, 18));
        buttonBracket2.setBackground(Grey);
        buttonBracket2.setForeground(Color.white);
        buttonBracket2.addActionListener(this);
        frame.add(buttonBracket2);

        buttonMod.setBounds(10, 170, 60, 40);
        buttonMod.setFont(new Font("Arial", Font.BOLD, 18));
        buttonMod.setBackground(pastel);
        buttonMod.setForeground(Color.white);
        buttonMod.addActionListener(this);
        frame.add(buttonMod);

        buttonClear.setBounds(80, 170, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 16));
        buttonClear.setBackground(Red);
        buttonClear.setForeground(Color.white);
        buttonClear.addActionListener(this);
        frame.add(buttonClear);

        buttonDelete.setBounds(150, 170, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 13));
        buttonDelete.setBackground(Red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.addActionListener(this);
        frame.add(buttonDelete);

        buttonDiv.setBounds(220, 170, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(pastel);
        buttonDiv.setForeground(Color.white);
        buttonDiv.addActionListener(this);
        frame.add(buttonDiv);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(pastel);
        buttonSeven.setForeground(Color.white);
        buttonSeven.addActionListener(this);
        frame.add(buttonSeven);
 
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(pastel);
        buttonEight.setForeground(Color.white);
        buttonEight.addActionListener(this);
        frame.add(buttonEight);
 
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(pastel);
        buttonNine.setForeground(Color.white);
        buttonNine.addActionListener(this);
        frame.add(buttonNine);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(pastel);
        buttonMul.setForeground(Color.white);
        buttonMul.addActionListener(this);
        frame.add(buttonMul);
 
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(pastel);
        buttonFour.setForeground(Color.white);
        buttonFour.addActionListener(this);
        frame.add(buttonFour);
 
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(pastel);
        buttonFive.setForeground(Color.white);
        buttonFive.addActionListener(this);
        frame.add(buttonFive);
 
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(pastel);
        buttonSix.setForeground(Color.white);
        buttonSix.addActionListener(this);
        frame.add(buttonSix);

        buttonMinus.setBounds(220, 290, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 22));
        buttonMinus.setBackground(pastel);
        buttonMinus.setForeground(Color.white);
        buttonMinus.addActionListener(this);
        frame.add(buttonMinus);
 
        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(pastel);
        buttonOne.setForeground(Color.white);
        buttonOne.addActionListener(this);
        frame.add(buttonOne);
 
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(pastel);
        buttonTwo.setForeground(Color.white);
        buttonTwo.addActionListener(this);
        frame.add(buttonTwo);
 
        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(pastel);
        buttonThree.setForeground(Color.white);
        buttonThree.addActionListener(this);
        frame.add(buttonThree);

        buttonPlus.setBounds(220, 350, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(pastel);
        buttonPlus.setForeground(Color.white);
        buttonPlus.addActionListener(this);
        frame.add(buttonPlus);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(pastel);
        buttonZero.setForeground(Color.white);
        buttonZero.addActionListener(this);
        frame.add(buttonZero);
 
        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 28));
        buttonDot.setBackground(pastel);
        buttonDot.setForeground(Color.white);
        buttonDot.addActionListener(this);
        frame.add(buttonDot);
 
        buttonEqual.setBounds(220, 410, 60, 40);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(pastel);
        buttonEqual.setForeground(Color.white);
        buttonEqual.addActionListener(this);
        frame.add(buttonEqual);

    }

    public static double evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
        Stack<Double> values = new Stack<Double>();
        Stack<Character> ops = new Stack<Character>();
 
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i]=='.' || (tokens[i] >= '0' && tokens[i] <= '9'))
            {
                StringBuffer sbuf = new StringBuffer();

                while ((i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') || (i < tokens.length && tokens[i]=='.'))
                    sbuf.append(tokens[i++]);
                    values.push(Double.parseDouble(sbuf.toString()));
                    i--;
            }
            else if (tokens[i] == '(')
                ops.push(tokens[i]);
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                    ops.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/' || tokens[i] == '%')
            {
                while (!ops.empty() && hasPrecedence(tokens[i],ops.peek()))
                    values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                    ops.push(tokens[i]);
            }
        }
        while (!ops.empty()) {
            values.push(applyOp(ops.pop(), values.pop(),values.pop()));
        }

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/' || op1 == '%') &&
            (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static double applyOp(char op, double b, double a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException(
                      "Cannot divide by zero");
            return a / b;
        case '%':
            return a % b;
        }
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object source = ae.getSource();

        if (source == buttonOne) {  
            textField.setText(textField.getText() + "1");
        } 
        else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } 
        else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } 
        else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } 
        else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } 
        else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } 
        else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } 
        else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } 
        else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        }
        else if (source == buttonZero) { 
            if (textField.getText().equals("0")) { 
                return;
            } 
            else { 
                textField.setText(textField.getText() + "0");
            }
        }
        else if (source == buttonDot) {
            if (textField.getText().equals(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        }
        else if (source == buttonPlus) {
            textField.setText(textField.getText()+"+");
        } 
        else if (source == buttonMinus) {
            textField.setText(textField.getText()+"-");
        } 
        else if (source == buttonMul) {
            textField.setText(textField.getText()+"*");
        } 
        else if (source == buttonDiv) {
            textField.setText(textField.getText()+"/");
        }
        else if (source == buttonMod) {
            textField.setText(textField.getText()+"%");
        }
        else if (source == buttonClear) {
            textField.setText("");
        }
        else if (source == buttonDelete) {
            String s = textField.getText();
            String s1="";
            for (int i=0;i<s.length()-1;i++) {
                s1=s1+s.charAt(i);
            }
            textField.setText(s1+"");
        }  
        else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            String sq = Double.toString(sqrt);
            if (sq.endsWith(".0")) {
                textField.setText(sq.replace(".0", ""));
            } else {
                textField.setText(sq);
            }
        } 
        else if (source == buttonLog) {
            number = Double.parseDouble(textField.getText());
            Double log = Math.log(number);
            textField.setText(Double.toString(log));
        }
        else if (source == buttonBracket1) { 
            textField.setText(textField.getText() + "(");
        }
        else if (source == buttonBracket2) { 
            if (textField.getText().equals("")) { 
                return;
            } 
            else { 
                textField.setText(textField.getText() + ")");
            }
        }
        else if (source == buttonEqual) {
            String s = textField.getText();
            Double ans = evaluate(s);
            String result = Double.toString(ans);
            if (result.endsWith(".0")) {
                textField.setText(result.replace(".0", ""));
            } else {
                textField.setText(result);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}