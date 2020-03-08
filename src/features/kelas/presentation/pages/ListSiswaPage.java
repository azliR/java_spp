package features.kelas.presentation.pages;

import cores.entities.Siswa;
import cores.styles.Colors;
import cores.styles.Constants;
import cores.styles.Fonts;
import cores.styles.Strings;
import cores.utils.Navigator;
import cores.widgets.RoundedButton;
import cores.widgets.a_ScrollPane;
import features.siswa.data.repositories.SiswaRepository;
import features.siswa.presentation.pages.*;
import features.siswa.presentation.widgets.SiswaTile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizal
 */
public class ListSiswaPage extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;

    private final SiswaRepository repository;

    public final List<SiswaTile> listSiswaTiles = new ArrayList<>();
    public final List<Siswa> listSiswa = new ArrayList<>();

    public final int maxResult = 15;
    public boolean isLoading = false;
    public boolean isLasIndex = false;
    public int currentIndex = 0;
    public String currentJenisKelaminValue = Strings.SEMUA;

    public ListSiswaPage(SiswaRepository repository) {
        this.repository = repository;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisKelaminGroup = new javax.swing.ButtonGroup();
        appbar3 = new javax.swing.JPanel();
        b_add = new RoundedButton(Constants.XLARGE_BORDER_RADIUS);
        jSeparator4 = new javax.swing.JSeparator();
        tv_title = new javax.swing.JLabel();
        chipsPanel = new javax.swing.JPanel();
        chipsPanel3 = new javax.swing.JPanel();
        scrollPane = new a_ScrollPane(jPanel1);
        jPanel1 = new javax.swing.JPanel();
        gridLayout = new javax.swing.JPanel();

        setBackground(Colors.BACKGROUND_COLOR);

        appbar3.setBackground(Colors.BACKGROUND_COLOR);

        b_add.setBackground(Colors.PRIMARY_COLOR);
        b_add.setFont(Fonts.PRODUCT_SANS_MEDIUM.deriveFont(14f)
        );
        b_add.setForeground(Colors.WHITE_TEXT_COLOR);
        b_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/ic_plus_white.png"))); // NOI18N
        b_add.setText("Tambah");
        b_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 16));
        b_add.setBorderPainted(false);
        b_add.setContentAreaFilled(false);
        b_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_add.setFocusPainted(false);
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(Colors.BORDER_COLOR);

        tv_title.setFont(Fonts.GOOGLE_SANS.deriveFont(16f)
        );
        tv_title.setText("Daftar Siswa");

        chipsPanel.setBackground(Colors.BACKGROUND_COLOR);
        chipsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 0, 2, 0));
        chipsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 0));

        chipsPanel3.setBackground(Colors.BACKGROUND_COLOR);
        chipsPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 0, 2, 0));
        chipsPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 0));
        chipsPanel.add(chipsPanel3);

        javax.swing.GroupLayout appbar3Layout = new javax.swing.GroupLayout(appbar3);
        appbar3.setLayout(appbar3Layout);
        appbar3Layout.setHorizontalGroup(
            appbar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(appbar3Layout.createSequentialGroup()
                .addComponent(tv_title)
                .addGap(16, 16, 16)
                .addComponent(chipsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(b_add)
                .addContainerGap())
        );
        appbar3Layout.setVerticalGroup(
            appbar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appbar3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(appbar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chipsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(appbar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tv_title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        scrollPane.setBackground(Colors.BACKGROUND_COLOR);
        scrollPane.setBorder(null);

        jPanel1.setBackground(Colors.BACKGROUND_COLOR);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 8));

        gridLayout.setBackground(Colors.BACKGROUND_COLOR);
        gridLayout.setLayout(new java.awt.GridLayout(0, 3, 8, 8));
        jPanel1.add(gridLayout);

        scrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addComponent(appbar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(appbar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        scrollPane.getVerticalScrollBar().setUnitIncrement(12);
    }// </editor-fold>//GEN-END:initComponents

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        Navigator.push(new AddSiswaPage(repository, null));
    }//GEN-LAST:event_b_addActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appbar3;
    private javax.swing.JButton b_add;
    private javax.swing.JPanel chipsPanel;
    public javax.swing.JPanel chipsPanel3;
    public javax.swing.JPanel gridLayout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.ButtonGroup jenisKelaminGroup;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel tv_title;
    // End of variables declaration//GEN-END:variables
}
