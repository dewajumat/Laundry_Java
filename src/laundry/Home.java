package laundry;
//By Kelompok 6
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    Sql sql = new Sql();
    Cucian cucian = new Cucian();
    Transaksi transaksi = new Transaksi();
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    FileSetting setting = new FileSetting();
    public Home() {
        initComponents();
        status.setText(sql.stats());
        this.tabChange(false,false,true,false);
    }
    public final void tabChange(boolean t,boolean l,boolean c,boolean s){
        tPanel.setVisible(t);
        lPanel.setVisible(l);
        cPanel.setVisible(c);
        sPanel.setVisible(s);
    }
    public void displayCucian(){
        try
        {
            sql.execute("SELECT `idCucian`, `berat` , `status` FROM `cucian` ");           
            DefaultTableModel model = (DefaultTableModel) table_no1.getModel();            
            if (table_no1.getRowCount() > 0) {
                for (int i = table_no1.getRowCount()-1; i > -1; i--) {
                    model.removeRow(i);
                }
            }
            while(sql.getHasil().next()){
                String idCucian = sql.getHasil().getString("idCucian");
                String sts = sql.getHasil().getString("status");
                String berat = String.valueOf(sql.getHasil().getInt("berat"));
                String [] data = { idCucian,berat,sts };
                model.addRow(data);
            }
            sql.getHasil().close();
        }
        catch(SQLException e)  {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgM = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabTransaksi = new javax.swing.JLabel();
        tabReport = new javax.swing.JLabel();
        tabCucian = new javax.swing.JLabel();
        tabSetting = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cPanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_no1 = new javax.swing.JTable();
        idDisplay = new javax.swing.JLabel();
        gantiStatus = new javax.swing.JButton();
        khusus = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        kiloan = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        kiloanPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        inCucian = new javax.swing.JTextField();
        bInCucian = new javax.swing.JButton();
        khususPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        inCucian1 = new javax.swing.JTextField();
        bInCucian1 = new javax.swing.JButton();
        tPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        trans = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        inIdCucian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        status = new javax.swing.JTextArea();
        lPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_no = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cari = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        sPanel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        saveSetting = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        setHarga = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        harga1 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        nama1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 18, 53));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N

        tabTransaksi.setBackground(new java.awt.Color(30, 49, 92));
        tabTransaksi.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        tabTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        tabTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_cash_in_hand_30px_1.png"))); // NOI18N
        tabTransaksi.setText("TRANSAKSI");
        tabTransaksi.setOpaque(true);
        tabTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTransaksiMouseClicked(evt);
            }
        });

        tabReport.setBackground(new java.awt.Color(30, 49, 92));
        tabReport.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        tabReport.setForeground(new java.awt.Color(255, 255, 255));
        tabReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_pie_chart_report_30px_1.png"))); // NOI18N
        tabReport.setText("LAPORAN");
        tabReport.setOpaque(true);
        tabReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabReportMouseClicked(evt);
            }
        });

        tabCucian.setBackground(new java.awt.Color(30, 49, 92));
        tabCucian.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        tabCucian.setForeground(new java.awt.Color(255, 255, 255));
        tabCucian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_clothes_line_32px.png"))); // NOI18N
        tabCucian.setText("CUCIAN");
        tabCucian.setOpaque(true);
        tabCucian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCucianMouseClicked(evt);
            }
        });

        tabSetting.setBackground(new java.awt.Color(30, 49, 92));
        tabSetting.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        tabSetting.setForeground(new java.awt.Color(255, 255, 255));
        tabSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_settings_50px.png"))); // NOI18N
        tabSetting.setText("SETTING");
        tabSetting.setOpaque(true);
        tabSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(tabCucian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tabCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabReport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cPanel.setBackground(new java.awt.Color(30, 49, 92));

        jPanel14.setBackground(new java.awt.Color(105, 117, 146));

        jLabel12.setBackground(new java.awt.Color(30, 49, 92));
        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_clothes_line_32px.png"))); // NOI18N
        jLabel12.setText("CUCIAN");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(30, 49, 92));

        table_no1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cucian", "Berat", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_no1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setViewportView(table_no1);
        if (table_no1.getColumnModel().getColumnCount() > 0) {
            table_no1.getColumnModel().getColumn(0).setMinWidth(50);
            table_no1.getColumnModel().getColumn(0).setPreferredWidth(100);
            table_no1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        idDisplay.setBackground(new java.awt.Color(30, 49, 92));
        idDisplay.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        idDisplay.setForeground(new java.awt.Color(255, 255, 255));
        idDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        idDisplay.setOpaque(true);

        gantiStatus.setBackground(new java.awt.Color(0, 18, 53));
        gantiStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gantiStatus.setForeground(new java.awt.Color(255, 255, 255));
        gantiStatus.setText("Tandai Selesai");
        gantiStatus.setBorderPainted(false);
        gantiStatus.setSelected(true);
        gantiStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gantiStatusActionPerformed(evt);
            }
        });

        khusus.setBackground(new java.awt.Color(105, 117, 146));
        khusus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        khusus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khususMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(30, 49, 92));
        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_iron_32px.png"))); // NOI18N
        jLabel17.setText("Satuan");

        javax.swing.GroupLayout khususLayout = new javax.swing.GroupLayout(khusus);
        khusus.setLayout(khususLayout);
        khususLayout.setHorizontalGroup(
            khususLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khususLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        khususLayout.setVerticalGroup(
            khususLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
        );

        kiloan.setBackground(new java.awt.Color(105, 117, 146));
        kiloan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        kiloan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kiloanMouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(30, 49, 92));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_basket_24px.png"))); // NOI18N
        jLabel16.setText("Kiloan");

        javax.swing.GroupLayout kiloanLayout = new javax.swing.GroupLayout(kiloan);
        kiloan.setLayout(kiloanLayout);
        kiloanLayout.setHorizontalGroup(
            kiloanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kiloanLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kiloanLayout.setVerticalGroup(
            kiloanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        kiloanPanel.setBackground(new java.awt.Color(30, 49, 92));

        jLabel13.setBackground(new java.awt.Color(30, 49, 92));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Berat");
        jLabel13.setOpaque(true);

        jPanel16.setBackground(new java.awt.Color(105, 117, 146));

        inCucian.setBackground(new java.awt.Color(105, 117, 146));
        inCucian.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inCucian.setForeground(new java.awt.Color(255, 255, 255));
        inCucian.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inCucian.setToolTipText("");
        inCucian.setAlignmentY(1.0F);
        inCucian.setBorder(null);
        inCucian.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inCucian.setName(""); // NOI18N
        inCucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCucianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inCucian)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(inCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        bInCucian.setBackground(new java.awt.Color(0, 18, 53));
        bInCucian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_enter_32px.png"))); // NOI18N
        bInCucian.setBorderPainted(false);
        bInCucian.setSelected(true);
        bInCucian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInCucianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kiloanPanelLayout = new javax.swing.GroupLayout(kiloanPanel);
        kiloanPanel.setLayout(kiloanPanelLayout);
        kiloanPanelLayout.setHorizontalGroup(
            kiloanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kiloanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kiloanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bInCucian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kiloanPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kiloanPanelLayout.setVerticalGroup(
            kiloanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kiloanPanelLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bInCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        khususPanel.setBackground(new java.awt.Color(30, 49, 92));

        jLabel14.setBackground(new java.awt.Color(30, 49, 92));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Harga");
        jLabel14.setOpaque(true);

        jPanel17.setBackground(new java.awt.Color(105, 117, 146));

        inCucian1.setBackground(new java.awt.Color(105, 117, 146));
        inCucian1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inCucian1.setForeground(new java.awt.Color(255, 255, 255));
        inCucian1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inCucian1.setToolTipText("");
        inCucian1.setAlignmentY(1.0F);
        inCucian1.setBorder(null);
        inCucian1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inCucian1.setName(""); // NOI18N
        inCucian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCucian1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inCucian1)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(inCucian1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        bInCucian1.setBackground(new java.awt.Color(0, 18, 53));
        bInCucian1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_enter_32px.png"))); // NOI18N
        bInCucian1.setBorderPainted(false);
        bInCucian1.setSelected(true);
        bInCucian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInCucian1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout khususPanelLayout = new javax.swing.GroupLayout(khususPanel);
        khususPanel.setLayout(khususPanelLayout);
        khususPanelLayout.setHorizontalGroup(
            khususPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khususPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khususPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bInCucian1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, khususPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        khususPanelLayout.setVerticalGroup(
            khususPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khususPanelLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bInCucian1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(kiloanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(khususPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiloanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(khususPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kiloanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(khususPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gantiStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(kiloan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(khusus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khusus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kiloan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gantiStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout cPanelLayout = new javax.swing.GroupLayout(cPanel);
        cPanel.setLayout(cPanelLayout);
        cPanelLayout.setHorizontalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cPanelLayout.setVerticalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tPanel.setBackground(new java.awt.Color(30, 49, 92));

        jPanel3.setBackground(new java.awt.Color(105, 117, 146));

        jLabel4.setBackground(new java.awt.Color(30, 49, 92));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_cash_in_hand_30px_1.png"))); // NOI18N
        jLabel4.setText("TRANSAKSI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(30, 49, 92));

        jLabel3.setBackground(new java.awt.Color(30, 49, 92));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Cucian");
        jLabel3.setOpaque(true);

        trans.setBackground(new java.awt.Color(0, 18, 53));
        trans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_enter_32px.png"))); // NOI18N
        trans.setBorderPainted(false);
        trans.setSelected(true);
        trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(105, 117, 146));

        inIdCucian.setBackground(new java.awt.Color(105, 117, 146));
        inIdCucian.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inIdCucian.setForeground(new java.awt.Color(255, 255, 255));
        inIdCucian.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inIdCucian.setToolTipText("");
        inIdCucian.setAlignmentY(1.0F);
        inIdCucian.setBorder(null);
        inIdCucian.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inIdCucian.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inIdCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(inIdCucian, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        status.setEditable(false);
        status.setColumns(20);
        status.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        status.setRows(5);
        jScrollPane1.setViewportView(status);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(trans)
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout tPanelLayout = new javax.swing.GroupLayout(tPanel);
        tPanel.setLayout(tPanelLayout);
        tPanelLayout.setHorizontalGroup(
            tPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tPanelLayout.setVerticalGroup(
            tPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lPanel.setBackground(new java.awt.Color(30, 49, 92));

        jPanel11.setBackground(new java.awt.Color(105, 117, 146));

        jLabel10.setBackground(new java.awt.Color(30, 49, 92));
        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_pie_chart_report_30px_1.png"))); // NOI18N
        jLabel10.setText("LAPORAN");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(30, 49, 92));

        table_no.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Tanggal", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_no.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(table_no);
        if (table_no.getColumnModel().getColumnCount() > 0) {
            table_no.getColumnModel().getColumn(0).setMinWidth(50);
            table_no.getColumnModel().getColumn(0).setPreferredWidth(100);
            table_no.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        cari.setBackground(new java.awt.Color(0, 18, 53));
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_30px.png"))); // NOI18N
        cari.setBorderPainted(false);
        cari.setSelected(true);
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(30, 49, 92));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("yyyy-mm-dd");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout lPanelLayout = new javax.swing.GroupLayout(lPanel);
        lPanel.setLayout(lPanelLayout);
        lPanelLayout.setHorizontalGroup(
            lPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lPanelLayout.setVerticalGroup(
            lPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanelLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sPanel.setBackground(new java.awt.Color(30, 49, 92));

        jPanel13.setBackground(new java.awt.Color(105, 117, 146));

        jLabel15.setBackground(new java.awt.Color(30, 49, 92));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_settings_50px.png"))); // NOI18N
        jLabel15.setText("SETTING");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(30, 49, 92));

        saveSetting.setBackground(new java.awt.Color(0, 18, 53));
        saveSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_30px.png"))); // NOI18N
        saveSetting.setBorderPainted(false);
        saveSetting.setSelected(true);
        saveSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSettingActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(30, 49, 92));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Set Harga /Kg");
        jLabel18.setOpaque(true);

        jPanel19.setBackground(new java.awt.Color(105, 117, 146));

        setHarga.setBackground(new java.awt.Color(105, 117, 146));
        setHarga.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        setHarga.setForeground(new java.awt.Color(255, 255, 255));
        setHarga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        setHarga.setToolTipText("");
        setHarga.setAlignmentY(1.0F);
        setHarga.setBorder(null);
        setHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setHarga.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(setHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jPanel20.setBackground(new java.awt.Color(105, 117, 146));

        harga1.setBackground(new java.awt.Color(105, 117, 146));
        harga1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        harga1.setForeground(new java.awt.Color(255, 255, 255));
        harga1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        harga1.setToolTipText("");
        harga1.setAlignmentY(1.0F);
        harga1.setBorder(null);
        harga1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        harga1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(harga1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(harga1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jPanel21.setBackground(new java.awt.Color(105, 117, 146));

        nama1.setBackground(new java.awt.Color(105, 117, 146));
        nama1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        nama1.setForeground(new java.awt.Color(255, 255, 255));
        nama1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nama1.setToolTipText("");
        nama1.setAlignmentY(1.0F);
        nama1.setBorder(null);
        nama1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nama1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jLabel19.setBackground(new java.awt.Color(30, 49, 92));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nama");
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(30, 49, 92));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Harga");
        jLabel20.setOpaque(true);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(saveSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sPanelLayout = new javax.swing.GroupLayout(sPanel);
        sPanel.setLayout(sPanelLayout);
        sPanelLayout.setHorizontalGroup(
            sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sPanelLayout.setVerticalGroup(
            sPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(cPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(lPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(cPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(sPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(lPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(cPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(sPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transActionPerformed
        status.setText(transaksi.proses(inIdCucian.getText()));
        if (transaksi.getError()==0){
            status.setText(transaksi.nonMemProses());
        }
    }//GEN-LAST:event_transActionPerformed

    private void tabTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTransaksiMouseClicked
        this.tabChange(true,false,false,false);
    }//GEN-LAST:event_tabTransaksiMouseClicked

    private void tabReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabReportMouseClicked
        this.tabChange(false,true,false,false);
    }//GEN-LAST:event_tabReportMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        try
        {       
            System.out.println(date.format(jDateChooser1.getDate()));
            sql.execute("SELECT `kode`, `tanggal`, `biaya` FROM `transaksi` "
                    + "WHERE tanggal like '%"+date.format(jDateChooser1.getDate())+"%'");           
            DefaultTableModel model = (DefaultTableModel) table_no.getModel();            
            if (table_no.getRowCount() > 0) {
                for (int i = table_no.getRowCount()-1; i > -1; i--) {
                    model.removeRow(i);
                }
            }
            while(sql.getHasil().next()){
                String kode = String.valueOf(sql.getHasil().getInt("kode"));
                String tanggal = sql.getHasil().getString("tanggal");;
                String jumlah = String.valueOf(sql.getHasil().getInt("biaya"));
                String [] data = { kode,tanggal,jumlah };
                model.addRow(data);
            }
            sql.getHasil().close();
        }
        catch(SQLException e)  {
            System.out.println(e);
        }
    }//GEN-LAST:event_cariActionPerformed

    private void tabCucianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCucianMouseClicked
        this.tabChange(false,false,true,false);
        this.displayCucian();
    }//GEN-LAST:event_tabCucianMouseClicked

    private void bInCucianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInCucianActionPerformed
        idDisplay.setText("");
        idDisplay.setText(cucian.inputCucian(Integer.parseInt(inCucian.getText())));     
        this.displayCucian();
    }//GEN-LAST:event_bInCucianActionPerformed

    private void gantiStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gantiStatusActionPerformed
        idDisplay.setText(String.valueOf(table_no1.getValueAt(table_no1.getSelectedRow(), 0)));
        cucian.changeStats(String.valueOf(table_no1.getValueAt(table_no1.getSelectedRow(), 0)));
        this.displayCucian();
    }//GEN-LAST:event_gantiStatusActionPerformed

    private void inCucianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCucianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCucianActionPerformed

    private void inCucian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCucian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCucian1ActionPerformed

    private void bInCucian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInCucian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInCucian1ActionPerformed

    private void kiloanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kiloanMouseClicked
        khususPanel.setVisible(false);
        kiloanPanel.setVisible(true);
    }//GEN-LAST:event_kiloanMouseClicked

    private void khususMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khususMouseClicked
        khususPanel.setVisible(true);
        kiloanPanel.setVisible(false);
    }//GEN-LAST:event_khususMouseClicked

    private void tabSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSettingMouseClicked
        this.tabChange(false,false,false,true);
        setting.createFile();
        setHarga.setText(setting.readFileHarga()); 
        setHarga.setText(setting.setting.get(0));
        nama1.setText(setting.setting.get(1));
        harga1.setText(setting.setting.get(2));
    }//GEN-LAST:event_tabSettingMouseClicked

    private void saveSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSettingActionPerformed
        setting.writeFile(setHarga.getText(),nama1.getText(),harga1.getText());
        setting.setting.clear();
        setHarga.setText(setting.readFileHarga()); 
        setHarga.setText(setting.setting.get(0));
        nama1.setText(setting.setting.get(1));
        harga1.setText(setting.setting.get(2));  
    }//GEN-LAST:event_saveSettingActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgM;
    private javax.swing.JButton bInCucian;
    private javax.swing.JButton bInCucian1;
    private javax.swing.JPanel cPanel;
    private javax.swing.JButton cari;
    private javax.swing.JButton gantiStatus;
    private javax.swing.JTextField harga1;
    private javax.swing.JLabel idDisplay;
    private javax.swing.JTextField inCucian;
    private javax.swing.JTextField inCucian1;
    private javax.swing.JTextField inIdCucian;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel khusus;
    private javax.swing.JPanel khususPanel;
    private javax.swing.JPanel kiloan;
    private javax.swing.JPanel kiloanPanel;
    private javax.swing.JPanel lPanel;
    private javax.swing.JTextField nama1;
    private javax.swing.JPanel sPanel;
    private javax.swing.JButton saveSetting;
    private javax.swing.JTextField setHarga;
    private javax.swing.JTextArea status;
    private javax.swing.JPanel tPanel;
    private javax.swing.JLabel tabCucian;
    private javax.swing.JLabel tabReport;
    private javax.swing.JLabel tabSetting;
    private javax.swing.JLabel tabTransaksi;
    private javax.swing.JTable table_no;
    private javax.swing.JTable table_no1;
    private javax.swing.JButton trans;
    // End of variables declaration//GEN-END:variables
}
