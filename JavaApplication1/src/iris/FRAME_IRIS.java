package iris;

import java.util.ArrayList;
import java.util.Collections;

public class FRAME_IRIS extends javax.swing.JFrame {

    
    public FRAME_IRIS() {
        initComponents();
    }
    
    static double jarakEuclidean(double a1, double a2, double b1, double b2, double c1, double c2, double d1, double d2){
        return Math.sqrt(Math.pow(a1 - a2, 2) + Math.pow(b1 - b2, 2) + Math.pow(c1 - c2, 2) + Math.pow(d1 - d2, 2) );
    }
    //inilah koding kami
    public void Iris(){
        
        
        ArrayList jarak_setosa = new ArrayList();
        ArrayList jarak_versi_color = new ArrayList();
        ArrayList jarak_virginica = new ArrayList();
        
        double[][]q = {
            {5.1, 3.5, 1.4, 0.2},
            {4.9, 3.0, 1.4, 0.2},
            {4.7, 3.2, 1.3, 0.2},
            {4.6, 3.1, 1.5, 0.2},
            {5.0, 3.6, 1.4, 0.2},
            {5.4, 3.9, 1.7, 0.4},
            {4.6, 3.4, 1.4, 0.3},
            {5.0, 3.4, 1.5, 0.2},
            {4.4, 2.9, 1.4, 0.2},
            {4.9, 3.1, 1.5, 0.1},
            {5.4, 3.7, 1.5, 0.2},
            {4.8, 3.4, 1.6, 0.2},
            {4.8, 3.0, 1.4, 0.1},
            {4.3, 3.0, 1.1, 0.1},
            {5.8, 4.0, 1.2, 0.2},
            {5.7, 4.4, 1.5, 0.4},
            {5.4, 3.9, 1.3, 0.4},
            {5.1, 3.5, 1.4, 0.3},
            {5.7, 3.8, 1.7, 0.3},
            {5.1, 3.8, 1.5, 0.3},
            {5.4, 3.4, 1.7, 0.2},
            {5.1, 3.7, 1.5, 0.4},
            {4.6, 3.6, 1.0, 0.2},
            {5.1, 3.3, 1.7, 0.5},
            {4.8, 3.4, 1.9, 0.2},
            {5.0, 3.0, 1.6, 0.2},
            {5.0, 3.4, 1.6, 0.4},
            {5.2, 3.5, 1.5, 0.2},
            {5.2, 3.4, 1.4, 0.2},
            {4.7, 3.2, 1.6, 0.2},
            {4.8, 3.1, 1.6, 0.2},
            {5.4, 3.4, 1.5, 0.4},
            {5.2, 4.1, 1.5, 0.1},
            {5.5, 4.2, 1.4, 0.2},
            {4.9, 3.1, 1.5, 0.1},
            {5.0, 3.2, 1.2, 0.2},
            {5.5, 3.5, 1.3, 0.2},
            {4.9, 3.1, 1.5, 0.1},
            {4.4, 3.0, 1.3, 0.2},
            {5.1, 3.4, 1.5, 0.2},
            {5.0, 3.5, 1.3, 0.3},
            {4.5, 2.3, 1.3, 0.3},
            {4.4, 3.2, 1.3, 0.2},
            {5.0, 3.5, 1.6, 0.6},
            {5.1, 3.8, 1.9, 0.4},
            {4.8, 3.0, 1.4, 0.3},
            {5.1, 3.8, 1.6, 0.2},
            {4.6, 3.2, 1.4, 0.2},
            {5.3, 3.7, 1.5, 0.2},
            {5.0, 3.3, 1.4, 0.2}, 
            
            {7.0, 3.2, 4.7, 1.4},
            {6.4, 3.2, 4.5, 1.5},
            {6.9, 3.1, 4.9, 1.5},
            {5.5, 2.3, 4.0, 1.3},
            {6.5, 2.8, 4.6, 1.5},
            {5.7, 2.8, 4.5, 1.3},
            {6.3, 3.3, 4.7, 1.6},
            {4.9, 2.4, 3.3, 1.0},
            {6.6, 2.9, 4.6, 1.3},
            {5.2, 2.7, 3.9, 1.4},
            {5.0, 2.0, 3.5, 1.0},
            {5.9, 3.0, 4.2, 1.5},
            {6.0, 2.2, 4.0, 1.0},
            {6.1, 2.9, 4.7, 1.4},
            {5.6, 2.9, 3.6, 1.3},
            {6.7, 3.1, 4.4, 1.4},
            {5.6, 3.0, 4.5, 1.5},
            {5.8, 2.7, 4.1, 1.0},
            {6.2, 2.2, 4.5, 1.5},
            {5.6, 2.5, 3.9, 1.1},
            {5.9, 3.2, 4.8, 1.8},
            {6.1, 2.8, 4.0, 1.3},
            {6.3, 2.5, 4.9, 1.5},
            {6.1, 2.8, 4.7, 1.2},
            {6.4, 2.9, 4.3, 1.3},
            {6.6, 3.0, 4.4, 1.4},
            {6.8, 2.8, 4.8, 1.4},
            {6.7, 3.0, 5.0, 1.7},
            {6.0, 2.9, 4.5, 1.5},
            {5.7, 2.6, 3.5, 1.0},
            {5.5, 2.4, 3.8, 1.1},
            {5.5, 2.4, 3.7, 1.0},
            {5.8, 2.7, 3.9, 1.2},
            {6.0, 2.7, 5.1, 1.6},
            {5.4, 3.0, 4.5, 1.5},
            {6.0, 3.4, 4.5, 1.6},
            {6.7, 3.1, 4.7, 1.5},
            {6.3, 2.3, 4.4, 1.3},
            {5.6, 3.0, 4.1, 1.3},
            {5.5, 2.5, 4.0, 1.3},
            {5.5, 2.6, 4.4, 1.2},
            {6.1, 3.0, 4.6, 1.4},
            {5.8, 2.6, 4.0, 1.2},
            {5.0, 2.3, 3.3, 1.0},
            {5.6, 2.7, 4.2, 1.3},
            {5.7, 3.0, 4.2, 1.2},
            {5.7, 2.9, 4.2, 1.3},
            {6.2, 2.9, 4.3, 1.3},
            {5.1, 2.5, 3.0, 1.1},
            {5.7, 2.8, 4.1, 1.3}, 

            {6.3, 3.3, 6.0, 2.5},
            {5.8, 2.7, 5.1, 1.9},
            {7.1, 3.0, 5.9, 2.1},
            {6.3, 2.9, 5.6, 1.8},
            {6.5, 3.0, 5.8, 2.2},
            {7.6, 3.0, 6.6, 2.1},
            {4.9, 2.5, 4.5, 1.7},
            {7.3, 2.9, 6.3, 1.8},
            {6.7, 2.5, 5.8, 1.8},
            {7.2, 3.6, 6.1, 2.5},
            {6.5, 3.2, 5.1, 2.0},
            {6.4, 2.7, 5.3, 1.9},
            {6.8, 3.0, 5.5, 2.1},
            {5.7, 2.5, 5.0, 2.0},
            {5.8, 2.8, 5.1, 2.4},
            {6.4, 3.2, 5.3, 2.3},
            {6.5, 3.0, 5.5, 1.8},
            {7.7, 3.8, 6.7, 2.2},
            {7.7, 2.6, 6.9, 2.3},
            {6.0, 2.2, 5.0, 1.5},
            {6.9, 3.2, 5.7, 2.3},
            {5.6, 2.8, 4.9, 2.0},
            {7.7, 2.8, 6.7, 2.0},
            {6.3, 2.7, 4.9, 1.8},
            {6.7, 3.3, 5.7, 2.1},
            {7.2, 3.2, 6.0, 1.8},
            {6.2, 2.8, 4.8, 1.8},
            {6.1, 3.0, 4.9, 1.8},
            {6.4, 2.8, 5.6, 2.1},
            {7.2, 3.0, 5.8, 1.6},
            {7.4, 2.8, 6.1, 1.9},
            {7.9, 3.8, 6.4, 2.0},
            {6.4, 2.8, 5.6, 2.2},
            {6.3, 2.8, 5.1, 1.5},
            {6.1, 2.6, 5.6, 1.4},
            {7.7, 3.0, 6.1, 2.3},
            {6.3, 3.4, 5.6, 2.4},
            {6.4, 3.1, 5.5, 1.8},
            {6.0, 3.0, 4.8, 1.8},
            {6.9, 3.1, 5.4, 2.1},
            {6.7, 3.1, 5.6, 2.4},
            {6.9, 3.1, 5.1, 2.3},
            {5.8, 2.7, 5.1, 1.9},
            {6.8, 3.2, 5.9, 2.3},
            {6.7, 3.3, 5.7, 2.5},
            {6.7, 3.0, 5.2, 2.3},
            {6.3, 2.5, 5.0, 1.9},
            {6.5, 3.0, 5.2, 2.0},
            {6.2, 3.4, 5.4, 2.3},
            {5.9, 3.0, 5.1, 1.8}, 

        };
        
      
        double a, b, c, d; //seharusnya nilai inputan dari user
        a = Double.parseDouble(p_sepal.getText());
        b = Double.parseDouble(l_sepal.getText());
        c = Double.parseDouble(p_petal.getText());
        d = Double.parseDouble(l_petal.getText());
        
        //menghitung jarak 
        double j_sementara = 0;
        
        for(int i=0; i<50; i++)
        {
            j_sementara = jarakEuclidean(q[i][0], a, q[i][1], b, q[i][2], c, q[i][3], d); 
            jarak_setosa.add(j_sementara);
        }
        
        for(int i=50; i<100; i++)
        {
            j_sementara = jarakEuclidean(q[i][0], a, q[i][1], b, q[i][2], c, q[i][3], d); 
            jarak_versi_color.add(j_sementara);
        }
        
        for(int i=100; i<150; i++)
        {
            j_sementara = jarakEuclidean(q[i][0], a, q[i][1], b, q[i][2], c, q[i][3], d); 
            jarak_virginica.add(j_sementara);
        }
        
        //mengurutkan data
        Collections.sort(jarak_setosa);
        Collections.sort(jarak_versi_color);
        Collections.sort(jarak_virginica);
        
        
        //mengambil k
        ArrayList k = new ArrayList();
        int setosa = 0;
        int versi_color = 0;
        int virginica = 0;
        double l, m, n, min;
        for (int i=0; i<5; i++)
        {
           l = (double) jarak_setosa.get(i);
            m = (double) jarak_versi_color.get(i);
            n = (double) jarak_virginica.get(i);
            min = 0;
            min = (double) jarak_setosa.get(i);
            setosa++;
            
            if(m<min)
            {
                min = (double) jarak_versi_color.get(i);
                versi_color++;
                setosa--;
                if(n<min)
                {
                    min = (double) jarak_virginica.get(i);
                    virginica++;
                    versi_color--;
                }
            }
            
            
            k.add(min);
            //perbaiki k.add
        }
        
        
        //memutuskan hasil diagnosis
        int max = setosa;
        if(max<versi_color)
        {
            max = versi_color;
            String hasil = "Iris Versi Color";
            txt_area_dgs.setText(String.valueOf(hasil));
        }
        else if(max<virginica)
        {
            max = virginica;
            String hasil = "Iris Virginica";
            txt_area_dgs.setText(String.valueOf(hasil));
        }
        else
        {
            String hasil = "Iris Setosa";
            txt_area_dgs.setText(String.valueOf(hasil));
        }
    }

   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_nilai = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l_sepal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p_sepal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        p_petal = new javax.swing.JTextField();
        btn_proses = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        l_petal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_dgs = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INPUT DATA IRIS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_nilai.setBackground(new java.awt.Color(153, 204, 255));
        panel_nilai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Input nilai berikut");

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan Nilai Panjang Sepal :");

        l_sepal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_sepalActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Masukkan Nilai Lebar Sepal  :");

        p_sepal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_sepalActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Masukkan Nilai Panjang Petal  :");

        p_petal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_petalActionPerformed(evt);
            }
        });

        btn_proses.setBackground(new java.awt.Color(0, 153, 153));
        btn_proses.setText("PROSES");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Masukkan Nilai Lebar Petal  :");

        l_petal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_petalActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hasil Diagnosa");

        txt_area_dgs.setColumns(20);
        txt_area_dgs.setRows(5);
        jScrollPane1.setViewportView(txt_area_dgs);

        javax.swing.GroupLayout panel_nilaiLayout = new javax.swing.GroupLayout(panel_nilai);
        panel_nilai.setLayout(panel_nilaiLayout);
        panel_nilaiLayout.setHorizontalGroup(
            panel_nilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nilaiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_nilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(panel_nilaiLayout.createSequentialGroup()
                        .addGroup(panel_nilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_nilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_proses)
                                .addComponent(p_petal)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p_sepal)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(l_sepal)
                                .addComponent(jLabel8)
                                .addComponent(l_petal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_nilaiLayout.setVerticalGroup(
            panel_nilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nilaiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_sepal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_sepal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_petal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_petal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_proses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TES_PROJECT_IRIS/tiga_iris.jpg"))); // NOI18N
        gambar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_nilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_sepalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_sepalActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_p_sepalActionPerformed

    private void l_sepalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_sepalActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_l_sepalActionPerformed

    private void p_petalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_petalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_p_petalActionPerformed

    private void l_petalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_petalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_l_petalActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
        // TODO add your handling code here:
        Iris();
    }//GEN-LAST:event_btn_prosesActionPerformed

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
            java.util.logging.Logger.getLogger(FRAME_IRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRAME_IRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRAME_IRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRAME_IRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRAME_IRIS().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_proses;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField l_petal;
    private javax.swing.JTextField l_sepal;
    private javax.swing.JTextField p_petal;
    private javax.swing.JTextField p_sepal;
    private javax.swing.JPanel panel_nilai;
    private javax.swing.JTextArea txt_area_dgs;
    // End of variables declaration//GEN-END:variables
}
