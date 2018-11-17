package com.company;
import javafx.scene.control.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;

public class Main {

    public static String gender = "Male" ;
    public static String bloodType ="A" ;
    public static String input="";

//    public void guiTest(){
//        ButtonListener buttonListener = new ButtonListener();
//
//    }
    public static void main(String[] args) {
        JFrame guiTest = new JFrame("HW2");
        guiTest.setSize(1500, 600);
        guiTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//      用ArrayList來存
        ArrayList<String> jcbArrList = new ArrayList();
        jcbArrList.add("Andy,Male,O");
        jcbArrList.add("Allen,Male,AB");
        jcbArrList.add("Sandy,Female,B");
        jcbArrList.add("Windy,Female,A");
        jcbArrList.add("Rose,Female,A");
//      根據ArrayList大小 生成Array
        int n = jcbArrList.size();
        String[] jcbArr = new String[n];
//      放ArrayList物件進去 Array
        for(int i=0; i<n; ++i ){
//            Object s = jcbArrList.get(i);
            jcbArr[i] = jcbArrList.get(i);

        }

        JComboBox comboBox = new JComboBox(jcbArr); //放陣列
        JPanel panel = new JPanel();//排版用 可把元件加入panel裡面
        JButton btn = new JButton("confirm");//放button名稱
        JTextField textField = new JTextField("Your Name");


        JRadioButton rbtnMale = new JRadioButton("Male");
        JRadioButton rbtnFemale = new JRadioButton("FeMale");
        rbtnMale.setSelected(true);//預設

        JRadioButton rbtnO = new JRadioButton("O");
        JRadioButton rbtnB = new JRadioButton("B");
        JRadioButton rbtnA = new JRadioButton("A");
        JRadioButton rbtnAB = new JRadioButton("AB");
        rbtnA.setSelected(true);//預設
        System.out.println(rbtnA);
        System.out.println(rbtnB);

        JLabel label = new JLabel("try");
        JLabel label1 = new JLabel("NEW ITEM");
        JLabel label2 = new JLabel("NAME");
        JLabel label3 = new JLabel("GENDER");
        JLabel label4 = new JLabel("BLOOD TYPE");

//        guiTest.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        guiTest.getContentPane().setLayout(null);//setLayout設成null 須自行定義座標

        //setBounds(x, y, width, height)  setLayout設成null 須自行定義座標
        comboBox.setBounds(10, 10, 150, 25);
        label1.setBounds(170, 10, 100, 25);
        btn.setBounds(280, 10, 100, 25);

        label.setBounds(10, 35, 300, 25);
        label2.setBounds(170, 65, 100, 25);
        label3.setBounds(280, 65, 100, 25);
        label4.setBounds(390, 65, 100, 25);

        textField.setBounds(170, 100, 100, 25);
        rbtnMale.setBounds(280, 100, 100, 25);
        rbtnA.setBounds(390, 100, 100, 25);

        rbtnFemale.setBounds(280, 135, 100, 25);
        rbtnO.setBounds(390, 135, 100, 25);

        rbtnB.setBounds(390, 170, 100, 25);
        rbtnAB.setBounds(390, 205, 100, 25);






        //getContentPane() 把元件加入JFrame的ContentPane 兩種皆可
        guiTest.getContentPane().add(comboBox);
        guiTest.getContentPane().add(panel);
        guiTest.add(btn);
        guiTest.add(textField);
        guiTest.getContentPane().add(rbtnMale);
        guiTest.getContentPane().add(rbtnFemale);
        guiTest.getContentPane().add(rbtnO);
        guiTest.getContentPane().add(rbtnB);
        guiTest.getContentPane().add(rbtnA);
        guiTest.getContentPane().add(rbtnAB);
        guiTest.add(label);
        guiTest.add(label1);
        guiTest.add(label2);
        guiTest.add(label3);
        guiTest.add(label4);



        //Group the radio buttons.
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(rbtnMale);
        groupGender.add(rbtnFemale);

        //Group the radio buttons.
        ButtonGroup groupBlood = new ButtonGroup();
        groupBlood.add(rbtnA);
        groupBlood.add(rbtnB);
        groupBlood.add(rbtnO);
        groupBlood.add(rbtnAB);


//        guiTest.pack();



        //rbtnFemale.isSelected()為布林值
//        if (rbtnMale.isSelected()){
//            gender = "Male";
//            System.out.println(gender);
//        }
//        else{
//            gender = "Female";
//            System.out.println(gender);
//        }
//
//        if (rbtnA.isSelected()){
//            bloodType = "A";
//            System.out.println(bloodType);
//
//        }
//        else if(rbtnB.isSelected()){
//            bloodType = "B";
//            System.out.println(bloodType);
//        }
//        else if(rbtnO.isSelected()){
//            bloodType = "O";
//            System.out.println(bloodType);
//
//        }
//        else {
//            bloodType = "AB";
//            System.out.println(bloodType);
//
//        }


        //confirm的 button listener 寫法
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = textField.getText();
                System.out.println(input+","+gender+","+bloodType);
                jcbArrList.add(input);

                label.setText("Your input is:"+input+","+gender+","+bloodType);
                comboBox.addItem(input+","+gender+","+bloodType);

            }
        });

        rbtnMale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender = "Male";
                System.out.println(gender);
            }
        });

        rbtnFemale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender = "Female";
                System.out.println(gender);
            }
        });

        rbtnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bloodType = "A";
            }
        });
        rbtnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bloodType = "B";
            }
        });
        rbtnAB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bloodType = "AB";
            }
        });
        rbtnO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bloodType = "O";
            }
        });

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
//                e.getStateChange()==ItemEvent.SELECTED==1
                if(e.getStateChange()==ItemEvent.SELECTED){
//                  e.getItem()選擇的
                    System.out.println("Your choise is:"+e.getItem());
                    label.setText("Your choise is:"+e.getItem());
                }
            }
        });
//        input = textField.getText();
//        textField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(textField.getText());
//                input = textField.getText();
//            }
//        });



//        rbtnMale.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(rbtnMale.getText());
//                this.gender = rbtnMale.getText();
//            }
//        });

        guiTest.setVisible(true);

    }




//    private JPanel testfield;
//    private JComboBox comboBox1;
//    private JButton Button;
//    private JTextField textField1;
//    private JRadioButton maleRadioButton;
//    private JRadioButton femaleRadioButton;
//    private JRadioButton oRadioButton;
//    private JRadioButton bRadioButton;
//    private JRadioButton aRadioButton;
//    private JRadioButton ABRadioButton;
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Main");
//        frame.setContentPane(new Main().testfield);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//
//    }
//    private void $$$setupUI$$$() {
//        final JPanel panel1 = new JPanel();
//        panel1.setLayout(new GridBagLayout());
//    }
}