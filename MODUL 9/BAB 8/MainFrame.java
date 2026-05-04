import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame {
    Label titleLabel, utsLabel, uasLabel, kuisLabel, tugasLabel, hasilLabel;
    TextField utsField, uasField, kuisField, tugasField, hasilField;       
    Button hitungButton, tampilButton;
    CheckboxGroup cbg;
    Checkbox pemlanCb, asdCb, matkomlanCb, probstatCb;
    TextArea hasilTextArea;

    double nilaiPemlan, nilaiAsd, nilaiMatkomlan, nilaiProbstat;

    MataKuliah pemlan = new Pemlan();
    MataKuliah asd = new ASD();
    MataKuliah matkomlan = new Matkomlan();
    MataKuliah probstat = new Probstat();

    public MainFrame(){
        setLayout(null);

        titleLabel = new Label("Hitung Nilai Akhir");
        titleLabel.setFont(new Font("Arial", 1, 14));
        add(titleLabel);
        titleLabel.setBounds(180, 30, 200, 20);

        cbg = new CheckboxGroup();

        asdCb = new Checkbox("ASD", cbg, false);    
        this.add(asdCb).setBounds(80, 60, 90, 20);

        pemlanCb = new Checkbox("Pemlan", cbg, false);    
        this.add(pemlanCb).setBounds(160, 60, 90, 20);

        matkomlanCb = new Checkbox("Matkomlan", cbg, false);    
        this.add(matkomlanCb).setBounds(250, 60, 90, 20);

        probstatCb = new Checkbox("Probstat", cbg, false);    
        this.add(probstatCb).setBounds(340, 60, 90, 20);

        tugasLabel = new Label("Tugas : ");
        add(tugasLabel);
        tugasLabel.setBounds(160, 90, 70, 20);

        kuisLabel = new Label("Kuis : ");
        add(kuisLabel);
        kuisLabel.setBounds(160, 120, 70, 20);

        utsLabel = new Label("UTS : ");
        add(utsLabel);
        utsLabel.setBounds(160, 150, 70, 20);

        uasLabel = new Label("UAS : ");
        add(uasLabel);
        uasLabel.setBounds(160, 180, 70, 20);
        
        hasilLabel = new Label("Hasil : ");
        add(hasilLabel);
        hasilLabel.setBounds(160, 210, 70, 20);

        tugasField = new TextField();
        add(tugasField);
        tugasField.setBounds(240, 90, 60, 20);

        kuisField = new TextField();
        add(kuisField);
        kuisField.setBounds(240, 120, 60, 20);

        utsField = new TextField();
        add(utsField);
        utsField.setBounds(240, 150, 60, 20);
        
        uasField = new TextField();
        add(uasField);
        uasField.setBounds(240, 180, 60, 20);
        
        hasilField = new TextField();
        add(hasilField);
        hasilField.setBounds(240, 210, 60, 20);

        hitungButton = new Button("Hitung");
        add(hitungButton);
        hitungButton.setBounds(180, 260, 100, 20);

        tampilButton = new Button("Tampilkan nilai semua matkul");
        add(tampilButton);
        tampilButton.setBounds(100, 410, 270, 20);

        hasilTextArea = new TextArea(); 
        add(hasilTextArea); 
        hasilTextArea.setBounds(100, 300, 270, 100);
        
        ItemListener resetField = new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                tugasField.setText("");
                kuisField.setText("");
                utsField.setText("");
                uasField.setText("");
                hasilField.setText("");
            }
        };

        pemlanCb.addItemListener(resetField);
        asdCb.addItemListener(resetField);
        matkomlanCb.addItemListener(resetField);
        probstatCb.addItemListener(resetField);

        hitungButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int tugas = Integer.parseInt(tugasField.getText().trim());
                    int kuis = Integer.parseInt(kuisField.getText().trim());
                    int uts = Integer.parseInt(utsField.getText().trim());
                    int uas = Integer.parseInt(uasField.getText().trim());

                    if(pemlanCb.getState()){
                        pemlan.setNilai(uts, uas, tugas, kuis);
                        nilaiPemlan = pemlan.hitungNilaiAkhir();
                        hasilField.setText(String.valueOf(nilaiPemlan));
                    } else if(asdCb.getState()){
                        asd.setNilai(uts, uas, tugas, kuis);
                        nilaiAsd = asd.hitungNilaiAkhir();
                        hasilField.setText(String.valueOf(nilaiAsd));
                    } else if(matkomlanCb.getState()){
                        matkomlan.setNilai(uts, uas, tugas, kuis);
                        nilaiMatkomlan = matkomlan.hitungNilaiAkhir();
                        hasilField.setText(String.valueOf(nilaiMatkomlan));
                    } else if(probstatCb.getState()){
                        probstat.setNilai(uts, uas, tugas, kuis);
                        nilaiProbstat = probstat.hitungNilaiAkhir();
                        hasilField.setText(String.valueOf(nilaiProbstat));
                    }
                    
                } catch(NumberFormatException ex){
                    System.out.println("Input salah");
                }
            }
        });

        tampilButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hasilTextArea.setText(
                    "HASIL NILAI SEMUA MATA KULIAH" + "\n" +
                    "\n"+
                    "Pemlan        : " + nilaiPemlan + " (" + pemlan.getGrade() +")" + "\n" +
                    "ASD             : " + nilaiAsd +" (" + asd.getGrade() +")" + "\n" +
                    "Matkomlan   : " + nilaiMatkomlan +" (" + matkomlan.getGrade() +")" + "\n" +
                    "Probstat       : " + nilaiProbstat + " (" + probstat.getGrade() +")" 
                );
            }
        });
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setSize(450, 490);
        mf.setVisible(true);
        mf.setTitle("Hitung Nilai Akhir");
    }
}
