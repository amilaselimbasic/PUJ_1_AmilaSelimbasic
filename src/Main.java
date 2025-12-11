package com.amilaselimbasic.financeapp;

import com.amilaselimbasic.financeapp.ui.MainForm;

import javax.swing.*;

// glavna klasa, ovdje samo pokrećem GUI
public class Main {

    public static void main(String[] args) {

        // ovdje pokrećem swing
        SwingUtilities.invokeLater(() -> {

            // pravim formu iz MainForm klase
            MainForm mainForm = new MainForm();

            // pravim glavni prozor
            JFrame frame = new JFrame("Finance App");

            // stavljam panel iz forme u prozor
            frame.setContentPane(mainForm.getMainPanel());

            // gašenje app-a
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // automatsko podešavanje dimenzija
            frame.pack();

            // centriram prozor na ekran
            frame.setLocationRelativeTo(null);

            // prikaži
            frame.setVisible(true);
        });
    }
}
