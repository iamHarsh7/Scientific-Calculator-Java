

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Label;

public class ScientificCalculator {

    private JFrame frmAdvanceCalculator;
    private JTextField txtDisplay;

    double fnum;
    double fnum1;
    double snum;
    double snum1;
    double result;
    double result1;
    String opr;
    String opr1;
    String ans;
    String ans1;

    double[] i = new double[5];
    double Nigerian_Naira = 5.6243;
    double US_Dollar = 0.0122;
    double Chinese_Yuan = 0.084;
    double Pakistani_Rupee = 3.4746;
    double Canadian_Dollar = 0.0163;
    double Bangladeshi_Taka = 1.3002;
    double Nepal_Rupee = 1.6003;
    double Indonesian_Rupiah = 178.5714;

    private JTextField histbox;

    private JTextField jtxtConverts;
    private JTextField jlblConverts;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ScientificCalculator window = new ScientificCalculator();
                    window.frmAdvanceCalculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ScientificCalculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAdvanceCalculator = new JFrame();
        frmAdvanceCalculator.getContentPane().setBackground(new Color(255, 255, 255));
        frmAdvanceCalculator.setTitle("advance calculator");
        frmAdvanceCalculator.setBounds(200, 200, 614, 454);
        frmAdvanceCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frmAdvanceCalculator.setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("File");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("standard");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args) {

                frmAdvanceCalculator.setTitle("advance calculator");
                frmAdvanceCalculator.setBounds(200, 200, 1000, 450);

                txtDisplay.setBounds(10, 11, 243, 37);

            }
        });
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("unit conversion");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmAdvanceCalculator.setTitle("unit conversion");
                frmAdvanceCalculator.setBounds(200, 200, 1220, 450);

                txtDisplay.setBounds(10, 11, 350 , 37);
            }
        });
        mnNewMenu.add(mntmNewMenuItem_3);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("exit");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
                System.out.print("exit");
            }
        });
        mnNewMenu.add(mntmNewMenuItem_2);
        frmAdvanceCalculator.getContentPane().setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        txtDisplay.setBounds(10, 10, 350, 37);
        frmAdvanceCalculator.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);

        JButton btnset = new JButton("CE");
        btnset.setBounds(10, 57, 80, 58);
        btnset.setBackground(new Color(255, 0, 0));
        btnset.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                opr = "Exp";

            }
        });
        frmAdvanceCalculator.getContentPane().add(btnset);

        JButton button = new JButton("<-");
        button.setBounds(100, 57, 80, 58);
        button.setFont(new Font("Tahoma", Font.BOLD, 20));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (txtDisplay.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(txtDisplay.getText());
                    str.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = str.toString();
                    txtDisplay.setText(backspace);
                }
            }
        });
        button.setBackground(new Color(0, 128, 192));
        frmAdvanceCalculator.getContentPane().add(button);

        JButton btnplusminus = new JButton("+\r\n-");
        btnplusminus.setBounds(190, 57, 80, 58);
        btnplusminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                double ops1 = Double.parseDouble(String.valueOf(histbox.getText()));
                ops = ops * (-1);
                ops1 = ops1 * (-1);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops1));
            }
        });
        btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnplusminus);

        JButton btndivide = new JButton("/");
        btndivide.setBounds(280, 57, 80, 58);
        btndivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());

                txtDisplay.setText("");

                opr = "/";




            }
        });
        btndivide.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btndivide);

        final JButton btnone = new JButton("1");
        btnone.setBounds(10, 123, 80, 58);
        btnone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String iNum = txtDisplay.getText() + btnone.getText();
                //String iNum1 = histbox.getText() + btnone.getText();

                txtDisplay.setText(iNum);

            }
        });
        btnone.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnone);

        final JButton btn2 = new JButton("2");
        btn2.setBounds(100, 125, 80, 56);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn2.getText();
                //String iNum1 = histbox.getText() + btn2.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn2);

        final JButton btn3 = new JButton("3");
        btn3.setBounds(190, 125, 80, 56);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn3.getText();
                //String iNum1 = histbox.getText() + btn3.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn3);

        JButton btnmul = new JButton("X");
        btnmul.setBounds(280, 125, 80, 56);
        btnmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());
                //fnum1 = Double.parseDouble(histbox.getText());
                txtDisplay.setText("");
                //histbox.setText("");
                opr = "*";
                //opr1 = "*";
            }
        });
        btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnmul);

        final JButton btn4 = new JButton("4");
        btn4.setBounds(10, 191, 80, 56);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn4.getText();
                //String iNum1 = histbox.getText() + btn4.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn4);

        final JButton btn5 = new JButton("5");
        btn5.setBounds(100, 191, 80, 56);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn5.getText();
                //String iNum1 = histbox.getText() + btn5.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn5);

        final JButton btn6 = new JButton("6");
        btn6.setBounds(190, 191, 80, 56);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn6.getText();
                //String iNum1 = histbox.getText() + btn6.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn6);

        JButton btnsub = new JButton("-");
        btnsub.setBounds(280, 191, 80, 56);
        btnsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());
                //fnum1 = Double.parseDouble(histbox.getText());
                txtDisplay.setText("");
                histbox.setText("");
                opr = "-";
                //opr1 = "_";
            }
        });
        btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnsub);

        final JButton btn7 = new JButton("7");
        btn7.setBounds(10, 257, 80, 58);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn7.getText();
                //String iNum1 = histbox.getText() + btn7.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn7);

        final JButton btn8 = new JButton("8");
        btn8.setBounds(100, 257, 80, 58);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn8.getText();
                //String iNum1 = histbox.getText() + btn8.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn8);

        final JButton btn9 = new JButton("9");
        btn9.setBounds(190, 257, 80, 58);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn9.getText();
                //String iNum1 = histbox.getText() + btn9.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn9);

        final JButton btnplus = new JButton("+");
        btnplus.setBounds(280, 257, 80, 58);
        btnplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                fnum = Double.parseDouble(txtDisplay.getText());
                //fnum1 = Double.parseDouble(histbox.getText());
                txtDisplay.setText("");
                //histbox.setText("");
                opr = "+";
                //opr1 = "+";

            }
        });
        btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnplus);

        JButton btnper = new JButton("%");
        btnper.setBounds(10, 325, 80, 58);
        btnper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());
                //fnum1 = Double.parseDouble(histbox.getText());
                txtDisplay.setText("");
                //histbox.setText("");
                opr = "%";
                //opr1 = "%";
            }
        });
        btnper.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnper);

        final JButton btn0 = new JButton("0");
        btn0.setBounds(100, 325, 80, 58);
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btn0.getText();
                //String iNum1 = histbox.getText() + btn0.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btn0);

        final JButton btndecimal = new JButton(".");
        btndecimal.setBounds(190, 325, 80, 58);
        btndecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String iNum = txtDisplay.getText() + btndecimal.getText();
                //String iNum1 = histbox.getText() + btndecimal.getText();
                txtDisplay.setText(iNum);
                //histbox.setText(iNum1);
            }
        });
        btndecimal.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btndecimal);

        JButton btnequal = new JButton("=");
        btnequal.setBounds(280, 325, 80, 58);
        btnequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ans;
                snum = Double.parseDouble(txtDisplay.getText());
                //snum1 = Double.parseDouble(histbox.getText());
                if (opr == "+")
                {
                    result = fnum + snum;
                    ans = String.format("%.2f", result);
                    txtDisplay.setText(ans);
                    histbox.setText(fnum+" + "+snum+"="+ans+" ");

                }

                else if (opr == "-")
                {
                    result = fnum - snum;
                    ans = String.format("%.2f", result);
                    txtDisplay.setText(ans);
                    histbox.setText(fnum+" - "+snum+"="+ans+" ");
                }
                else if (opr == "*")
                {
                    result = fnum * snum;
                    ans = String.format("%.2f", result);
                    txtDisplay.setText(ans);
                    histbox.setText(fnum+" * "+snum+"="+ans+" ");
                }
                else if (opr == "/")
                {
                    if(snum==0)
                    {
                        histbox.setText("undefined");
                    }
                    else {
                        result = fnum / snum;
                        ans = String.format("%.2f", result);
                        txtDisplay.setText(ans);
                        histbox.setText(fnum + " / " + snum + "=" + ans + " ");
                    }
                }
                else if (opr == "%")
                {
                    result = fnum * (snum/100);
                    ans = String.format("%.2f", result);
                    txtDisplay.setText(ans);
                    histbox.setText(fnum+" % "+snum+"="+ans+" ");
                }
                else if (opr == "x^y")
                {
                    result = Math.pow(fnum , snum);
                    ans = String.format("%.2f", result);
                    txtDisplay.setText(ans);
                    histbox.setText(fnum+" ^ "+snum+"="+ans+" ");

                }

            }
        });
        btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
        frmAdvanceCalculator.getContentPane().add(btnequal);

        histbox = new JTextField();
        histbox.setFont(new Font("Tahoma", Font.BOLD, 18));
        histbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        histbox.setBounds(391, 10, 203, 305);
        frmAdvanceCalculator.getContentPane().add(histbox);
        histbox.setColumns(10);

        JButton btnclr = new JButton("Clear History");
        btnclr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                histbox.setText(null);
                histbox.setText(null);
            }
        });
        btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnclr.setBounds(391, 325, 203, 58);
        frmAdvanceCalculator.getContentPane().add(btnclr);

        JButton btnlog = new JButton("Log");
        btnlog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.log(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnlog.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnlog.setBounds(616, 57, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnlog);

        JButton btnsin = new JButton("Sin");
        btnsin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.sin(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnsin.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnsin.setBounds(706, 58, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnsin);

        JButton btnpi = new JButton("π");
        btnpi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops;
                ops = (3.1415926535897932384626433832795);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnpi.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnpi.setBounds(616, 123, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnpi);

        JButton btnsq = new JButton("x^2");
        btnsq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = (ops * ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnsq.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnsq.setBounds(616, 191, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btnsq);

        JButton btnexp = new JButton("x^y");
        btnexp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());
                //fnum1 = Double.parseDouble(histbox.getText());
                txtDisplay.setText("");
                //histbox.setText("");
                opr = "x^y";
            }
        });
        btnexp.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnexp.setBounds(616, 257, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnexp);

        JButton btncubic = new JButton("x^3");
        btncubic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.pow(ops , 3);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btncubic.setFont(new Font("Tahoma", Font.BOLD, 20));
        btncubic.setBounds(616, 325, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btncubic);

        JButton btncos = new JButton("Cos");
        btncos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.cos(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btncos.setFont(new Font("Tahoma", Font.BOLD, 17));
        btncos.setBounds(706, 124, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btncos);

        JButton btntan = new JButton("Tan");
        btntan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.tan(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btntan.setFont(new Font("Tahoma", Font.BOLD, 17));
        btntan.setBounds(706, 192, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btntan);

        JButton btncbr = new JButton("Cbr");
        btncbr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.cbrt(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btncbr.setFont(new Font("Tahoma", Font.BOLD, 17));
        btncbr.setBounds(706, 258, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btncbr);

        JButton btnbin = new JButton("Bin");
        btnbin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtDisplay.getText());
                txtDisplay.setText(Integer.toString(a,2));
                histbox.setText(Integer.toString(a,2));
            }
        });
        btnbin.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnbin.setBounds(706, 326, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnbin);

        JButton btnsh = new JButton("SinH");
        btnsh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.sinh(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnsh.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnsh.setBounds(796, 59, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btnsh);

        JButton btncosh = new JButton("CosH");
        btncosh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.cosh(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btncosh.setFont(new Font("Tahoma", Font.BOLD, 17));
        btncosh.setBounds(796, 124, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btncosh);

        JButton btntanh = new JButton("TanH");
        btntanh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.tanh(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btntanh.setFont(new Font("Tahoma", Font.BOLD, 17));
        btntanh.setBounds(796, 195, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btntanh);

        JButton btnround = new JButton("Rd.");
        btnround.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.round(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnround.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnround.setBounds(796, 258, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnround);

        JButton btnhex = new JButton("Hex");
        btnhex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtDisplay.getText());
                txtDisplay.setText(Integer.toString(a,16));
                histbox.setText(Integer.toString(a,16));
            }
        });
        btnhex.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnhex.setBounds(796, 326, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btnhex);

        JButton btnmod = new JButton("Mod");
        btnmod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                histbox.setText("");
                opr = "Mod";
            }
        });
        btnmod.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnmod.setBounds(886, 59, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btnmod);

        JButton btnlnx = new JButton("lnx");
        btnlnx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.log10(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnlnx.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnlnx.setBounds(886, 126, 80, 54);
        frmAdvanceCalculator.getContentPane().add(btnlnx);

        JButton btnroot = new JButton("√");
        btnroot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = Math.sqrt(ops);
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btnroot.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnroot.setBounds(886, 195, 80, 56);
        frmAdvanceCalculator.getContentPane().add(btnroot);

        JButton btn2pi = new JButton("2*π");
        btn2pi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops;
                ops = (3.1415926535897932384626433832795) * 2;
                txtDisplay.setText(String.valueOf(ops));
                histbox.setText(String.valueOf(ops));
            }
        });
        btn2pi.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn2pi.setBounds(886, 258, 80, 58);
        frmAdvanceCalculator.getContentPane().add(btn2pi);

        JButton btnoctal = new JButton("Octal");
        btnoctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtDisplay.getText());
                txtDisplay.setText(Integer.toString(a,8));
                histbox.setText(Integer.toString(a,8));
            }
        });
        btnoctal.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnoctal.setBounds(886, 327, 80, 57);
        frmAdvanceCalculator.getContentPane().add(btnoctal);

        JList list = new JList();
        list.setBounds(1056, 114, 1, 1);
        frmAdvanceCalculator.getContentPane().add(list);

        JList list_1 = new JList();
        list_1.setBounds(1153, 139, -48, -55);
        frmAdvanceCalculator.getContentPane().add(list_1);

        JSeparator separator = new JSeparator();
        separator.setBounds(1044, 252, 32, -13);
        frmAdvanceCalculator.getContentPane().add(separator);

        final JComboBox jcomboBox = new JComboBox();
        jcomboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
        jcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "China", "Canada", "Pakistan", "Indonesia", "Nepal", "Bangladesh"}));
        jcomboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        jcomboBox.setBounds(981, 57, 196, 58);
        frmAdvanceCalculator.getContentPane().add(jcomboBox);

        JLabel lblNewLabel = new JLabel("Currency convert");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(981, 10, 196, 37);
        frmAdvanceCalculator.getContentPane().add(lblNewLabel);

        jtxtConverts = new JTextField();
        jtxtConverts.setBounds(980, 157, 197, 54);
        frmAdvanceCalculator.getContentPane().add(jtxtConverts);
        jtxtConverts.setColumns(10);

        jlblConverts = new JTextField();
        jlblConverts.setBounds(980, 232, 197, 47);
        frmAdvanceCalculator.getContentPane().add(jlblConverts);
        jlblConverts.setColumns(10);

        JButton btnConverts = new JButton("Converts");
        btnConverts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double Indian_Rupee = Double.parseDouble(jtxtConverts.getText());
                if (jcomboBox.getSelectedItem().equals("Nigeria"))
                {
                    String cConvert1 = String.format("N %.2f", Indian_Rupee * Nigerian_Naira);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("USA"))
                {
                    String cConvert1 = String.format("$ %.2f", Indian_Rupee * US_Dollar);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("China"))
                {
                    String cConvert1 = String.format("CNY %.2f", Indian_Rupee * Chinese_Yuan);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("Pakistan"))
                {
                    String cConvert1 = String.format("PKR %.2f", Indian_Rupee * Pakistani_Rupee);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("Canada"))
                {
                    String cConvert1 = String.format("C$ %.2f", Indian_Rupee * Canadian_Dollar);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("Bangladesh"))
                {
                    String cConvert1 = String.format("BDT %.2f", Indian_Rupee * Bangladeshi_Taka);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("Nepal"))
                {
                    String cConvert1 = String.format("NPR %.2f", Indian_Rupee * Nepal_Rupee);
                    jlblConverts.setText(cConvert1);
                }

                if (jcomboBox.getSelectedItem().equals("Indonesia"))
                {
                    String cConvert1 = String.format("IDR %.2f", Indian_Rupee * Indonesian_Rupiah);
                    jlblConverts.setText(cConvert1);
                }
            }
        });
        btnConverts.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnConverts.setBounds(981, 325, 95, 37);
        frmAdvanceCalculator.getContentPane().add(btnConverts);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jtxtConverts.setText(null);
                jlblConverts.setText(null);
                jcomboBox.setSelectedItem("Choose One...");
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnClear.setBounds(1086, 325, 91, 37);
        frmAdvanceCalculator.getContentPane().add(btnClear);

        Label label = new Label("INR");
        label.setFont(new Font("Dialog", Font.BOLD, 12));
        label.setBounds(981, 130, 95, 21);
        frmAdvanceCalculator.getContentPane().add(label);
    }
}