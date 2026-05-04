import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    
    JLabel namaLabel = new JLabel("Nama Lengkap");
    JTextField namaTextField = new JTextField(30);

    JLabel tglLabel = new JLabel("Tanggal Lahir");
    JTextField tglTextField = new JTextField(30);

    JLabel noDaftarLabel = new JLabel("Nomor Pendaftaran");
    JTextField noDaftarTextField = new JTextField(30);

    JLabel hpLabel = new JLabel("No. Telp");
    JTextField hpTextField = new JTextField(30);

    JLabel alamatLabel = new JLabel("Alamat");
    JTextArea alamatTextArea = new JTextArea();
    JScrollPane alamatScroll = new JScrollPane(alamatTextArea);

    JLabel emailLabel = new JLabel("E-mail");    
    JTextField emailTextField = new JTextField(30);
    
    JButton submit = new JButton("submit");

    MainFrame() {
        setTitle("DATA MAHASISWA");
        setLocation(300, 100);
        setSize(350, 320); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        KomponenVisual();
        AksiReaksi();
    }

    void KomponenVisual() {
        getContentPane().setLayout(null);

        getContentPane().add(namaLabel);
        namaLabel.setBounds(10, 10, 120, 20);
        getContentPane().add(namaTextField);
        namaTextField.setBounds(150, 10, 175, 20);

        getContentPane().add(tglLabel);
        tglLabel.setBounds(10, 40, 120, 20);
        getContentPane().add(tglTextField);
        tglTextField.setBounds(150, 40, 175, 20);

        getContentPane().add(noDaftarLabel);
        noDaftarLabel.setBounds(10, 70, 140, 20);
        getContentPane().add(noDaftarTextField);
        noDaftarTextField.setBounds(150, 70, 175, 20);

        getContentPane().add(hpLabel);
        hpLabel.setBounds(10, 100, 140, 20);
        getContentPane().add(hpTextField);
        hpTextField.setBounds(150, 100, 175, 20);

        getContentPane().add(alamatLabel);
        alamatLabel.setBounds(10,130,140,20);
        getContentPane().add(alamatScroll);
        alamatScroll.setBounds(150, 130, 175, 60);

        getContentPane().add(emailLabel);
        emailLabel.setBounds(10, 200, 140, 20);
        getContentPane().add(emailTextField);
        emailTextField.setBounds(150, 200, 175, 20);

        getContentPane().add(submit);
        submit.setBounds(240, 240, 80, 25);

    }
    
    void AksiReaksi() {
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (namaTextField.getText().isEmpty() ||
                    tglTextField.getText().isEmpty() ||
                    noDaftarTextField.getText().isEmpty() ||
                    hpTextField.getText().isEmpty() ||
                    alamatTextArea.getText().isEmpty() ||
                    emailTextField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null,
                            "Semua kolom harus diisi!");
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah anda yakin data sudah benar?",
                        "Konfirmasi",
                        JOptionPane.OK_CANCEL_OPTION
                );

                if (confirm != JOptionPane.OK_OPTION) {
                    return;
                }

                String[] data = {
                    namaTextField.getText(),
                    tglTextField.getText(),
                    noDaftarTextField.getText(),
                    hpTextField.getText(),
                    alamatTextArea.getText(),
                    emailTextField.getText()
                };       

                new TampilFrame(data);
            }
        });

        setVisible(true); 
    
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
