package Login;


import Register.RegisterForm;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import service.UserService;
import view.ListUserFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jonny Dam
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null );
        
        jpasswordfield.setText("enter your password");
        jpasswordfield.setForeground(Color.LIGHT_GRAY);
        jpasswordfield.setEchoChar((char)0);
        
        Border black = BorderFactory.createMatteBorder(3,3,3,3,Color.pink);
        Background.setBorder(black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        backgroundtitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        Jlabel_notamember = new javax.swing.JLabel();
        jlabel_signup = new javax.swing.JLabel();
        jlabel_username = new javax.swing.JLabel();
        jbutton_login = new javax.swing.JButton();
        textfield_Username = new javax.swing.JTextField();
        Password_JL = new javax.swing.JLabel();
        jpasswordfield = new javax.swing.JPasswordField();
        jlabel_forgotpass = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(245, 245, 245));
        Background.setForeground(new java.awt.Color(153, 153, 153));
        Background.setPreferredSize(new java.awt.Dimension(355, 430));

        backgroundtitle.setBackground(new java.awt.Color(51, 51, 51));
        backgroundtitle.setForeground(new java.awt.Color(245, 245, 245));
        backgroundtitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        title.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Login");

        minimize.setBackground(new java.awt.Color(0, 0, 0));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setText("-");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundtitleLayout = new javax.swing.GroupLayout(backgroundtitle);
        backgroundtitle.setLayout(backgroundtitleLayout);
        backgroundtitleLayout.setHorizontalGroup(
            backgroundtitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundtitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(76, 76, 76)
                .addComponent(minimize)
                .addGap(18, 18, 18)
                .addComponent(Exit)
                .addGap(18, 18, 18))
        );
        backgroundtitleLayout.setVerticalGroup(
            backgroundtitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundtitleLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(backgroundtitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize)
                    .addComponent(Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundtitleLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(245, 245, 245));

        Jlabel_notamember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jlabel_notamember.setForeground(new java.awt.Color(153, 153, 153));
        Jlabel_notamember.setText("Not a member?");

        jlabel_signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabel_signup.setForeground(new java.awt.Color(51, 153, 255));
        jlabel_signup.setText("Signup");
        jlabel_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_signupMouseClicked(evt);
            }
        });

        jlabel_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabel_username.setForeground(new java.awt.Color(153, 153, 153));
        jlabel_username.setText("Username");

        jbutton_login.setBackground(new java.awt.Color(255, 102, 102));
        jbutton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbutton_login.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_login.setText("Login");
        jbutton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_loginActionPerformed(evt);
            }
        });

        textfield_Username.setBackground(new java.awt.Color(102, 102, 102));
        textfield_Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textfield_Username.setForeground(new java.awt.Color(255, 255, 255));
        textfield_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfield_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfield_UsernameFocusLost(evt);
            }
        });

        Password_JL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_JL.setForeground(new java.awt.Color(153, 153, 153));
        Password_JL.setText("Password");

        jpasswordfield.setBackground(new java.awt.Color(102, 102, 102));
        jpasswordfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpasswordfield.setForeground(new java.awt.Color(255, 255, 255));
        jpasswordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpasswordfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpasswordfieldFocusLost(evt);
            }
        });

        jlabel_forgotpass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlabel_forgotpass.setForeground(new java.awt.Color(153, 153, 153));
        jlabel_forgotpass.setText("Forgot Password?");
        jlabel_forgotpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(Jlabel_notamember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabel_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbutton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_forgotpass, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_JL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_JL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel_forgotpass)
                .addGap(18, 18, 18)
                .addComponent(jbutton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel_notamember)
                    .addComponent(jlabel_signup))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(backgroundtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void jlabel_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_signupMouseClicked
       RegisterForm su = new RegisterForm();
       su.setVisible(true);
       su.pack();
       su.setLocationRelativeTo(null);
       su.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jlabel_signupMouseClicked

    private void jbutton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_loginActionPerformed
        
        String username = textfield_Username.getText();
        String password = String.valueOf(jpasswordfield.getPassword());
                
        UserService us = new UserService();
        try {
            if(us.checkUser(username, password)){
                 ListUserFrame luf = new ListUserFrame();
                 luf.setVisible(true);
                 luf.pack();
                 luf.setLocationRelativeTo(null);
                 this.dispose();
            }
            else{
                  JOptionPane.showMessageDialog (null,"Invalid Username / Password","Login Error (dang nhap that bai)",2) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbutton_loginActionPerformed

    private void textfield_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_UsernameFocusLost
        if(textfield_Username.getText().trim().toLowerCase().equals("")){
                textfield_Username.setText("enter your username");
                textfield_Username.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_textfield_UsernameFocusLost

    private void textfield_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfield_UsernameFocusGained
         if(textfield_Username.getText().trim().toLowerCase().equals("enter your username")){
                textfield_Username.setText("");
                textfield_Username.setForeground(Color.white);
        }
    }//GEN-LAST:event_textfield_UsernameFocusGained

    private void jpasswordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswordfieldFocusGained
       String pass = String.valueOf(jpasswordfield.getPassword());
        if(pass.trim().toLowerCase().equals("enter your password")){
                jpasswordfield.setEchoChar('*');
                jpasswordfield.setText("");
                jpasswordfield.setForeground(Color.white);
        }
    }//GEN-LAST:event_jpasswordfieldFocusGained

    private void jpasswordfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswordfieldFocusLost
        String pass = String.valueOf(jpasswordfield.getPassword());
        if(pass.trim().toLowerCase().equals("")){
                jpasswordfield.setText("enter your password");
                jpasswordfield.setForeground(Color.LIGHT_GRAY);
                jpasswordfield.setEchoChar((char)0);
        }
    }//GEN-LAST:event_jpasswordfieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Jlabel_notamember;
    private javax.swing.JLabel Password_JL;
    private javax.swing.JPanel backgroundtitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutton_login;
    private javax.swing.JLabel jlabel_forgotpass;
    private javax.swing.JLabel jlabel_signup;
    private javax.swing.JLabel jlabel_username;
    private javax.swing.JPasswordField jpasswordfield;
    private javax.swing.JPanel main;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField textfield_Username;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
