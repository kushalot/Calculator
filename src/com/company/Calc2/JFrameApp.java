package com.company.Calc2;

import com.company.Calc2.JPanelApp;

import javax.swing.*;

public class JFrameApp extends JFrame
{
    public JFrameApp()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelApp());
        setVisible(true);
    }
}
