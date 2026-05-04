import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class TampilFrame extends JFrame {

    public TampilFrame(String[] data) {
        setTitle("Data Mahasiswa");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ===== PANEL UTAMA =====
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

        // ===== TITLE =====
        JLabel title = new JLabel("Data Mahasiswa", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(title, BorderLayout.NORTH);

        // ===== PANEL ISI =====
        JPanel contentPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        // Label kiri & isi kanan
        contentPanel.add(new JLabel("Nama"));
        contentPanel.add(new JLabel(": " + data[0]));

        contentPanel.add(new JLabel("Tanggal Lahir"));
        contentPanel.add(new JLabel(": " + data[1]));

        contentPanel.add(new JLabel("No.Pendaftaran"));
        contentPanel.add(new JLabel(": " + data[2]));

        contentPanel.add(new JLabel("No.Telp"));
        contentPanel.add(new JLabel(": " + data[3]));

        contentPanel.add(new JLabel("Alamat"));
        contentPanel.add(new JLabel(": " + data[4]));

        contentPanel.add(new JLabel("E-mail"));
        contentPanel.add(new JLabel(": " + data[5]));

        mainPanel.add(contentPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }
}