/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panelMain;

import components.ButtonMenuSearch;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JLayeredPane;
import swing.SearchAll;
import swing.SearchPlaylist;
import swing.SearchSong;

/**
 *
 * @author CAMERA VIET PHAT
 */
public class SearchPane extends javax.swing.JPanel {
    
    /**
     * Creates new form Search
     */
    public SearchPane() {
        initComponents();
        setBackground(Color.BLACK);
        opened();
    }
    
    public void opened() {
        this.btnSearchAllActionPerformed(null);
        this.btnSearchAllMouseClicked(null);
        btnSearchAll.setForeground(Color.decode("#434343"));
    }

    public ButtonMenuSearch getBtnSearchAll() {
        return btnSearchAll;
    }

    public void setBtnSearchAll(ButtonMenuSearch btnSearchAll) {
        this.btnSearchAll = btnSearchAll;
    }

    public ButtonMenuSearch getBtnSearchPlaylist() {
        return btnSearchPlaylist;
    }

    public void setBtnSearchPlaylist(ButtonMenuSearch btnSearchPlaylist) {
        this.btnSearchPlaylist = btnSearchPlaylist;
    }

    public ButtonMenuSearch getBtnSearchSong() {
        return btnSearchSong;
    }

    public void setBtnSearchSong(ButtonMenuSearch btnSearchSong) {
        this.btnSearchSong = btnSearchSong;
    }

    public JLayeredPane getLrpnlSearch() {
        return lrpnlSearch;
    }

    public void setLrpnlSearch(JLayeredPane lrpnlSearch) {
        this.lrpnlSearch = lrpnlSearch;
    }

    public SearchAll getPnlSearchAll() {
        return pnlSearchAll;
    }

    public void setPnlSearchAll(SearchAll pnlSearchAll) {
        this.pnlSearchAll = pnlSearchAll;
    }

    public SearchPlaylist getPnlSearchPlaylist() {
        return pnlSearchPlaylist;
    }

    public void setPnlSearchPlaylist(SearchPlaylist pnlSearchPlaylist) {
        this.pnlSearchPlaylist = pnlSearchPlaylist;
    }

    public SearchSong getPnlSearchSong() {
        return pnlSearchSong;
    }

    public void setPnlSearchSong(SearchSong pnlSearchSong) {
        this.pnlSearchSong = pnlSearchSong;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchAll = new components.ButtonMenuSearch();
        btnSearchSong = new components.ButtonMenuSearch();
        btnSearchPlaylist = new components.ButtonMenuSearch();
        lrpnlSearch = new javax.swing.JLayeredPane();
        pnlSearchPlaylist = new swing.SearchPlaylist();
        pnlSearchSong = new swing.SearchSong();
        pnlSearchAll = new swing.SearchAll();

        btnSearchAll.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchAll.setText("All");
        btnSearchAll.setRadious(new int[] {35, 35});
        btnSearchAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchAllMouseExited(evt);
            }
        });
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        btnSearchSong.setText("Song");
        btnSearchSong.setRadious(new int[] {35, 35});
        btnSearchSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchSongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchSongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchSongMouseExited(evt);
            }
        });
        btnSearchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSongActionPerformed(evt);
            }
        });

        btnSearchPlaylist.setText("Playlist");
        btnSearchPlaylist.setRadious(new int[] {35, 35});
        btnSearchPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchPlaylistMouseExited(evt);
            }
        });
        btnSearchPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPlaylistActionPerformed(evt);
            }
        });

        lrpnlSearch.setPreferredSize(new java.awt.Dimension(1271, 508));

        lrpnlSearch.setLayer(pnlSearchPlaylist, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lrpnlSearch.setLayer(pnlSearchSong, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lrpnlSearch.setLayer(pnlSearchAll, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lrpnlSearchLayout = new javax.swing.GroupLayout(lrpnlSearch);
        lrpnlSearch.setLayout(lrpnlSearchLayout);
        lrpnlSearchLayout.setHorizontalGroup(
            lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSearchAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lrpnlSearchLayout.createSequentialGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
                    .addComponent(pnlSearchPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSearchSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lrpnlSearchLayout.setVerticalGroup(
            lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSearchAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSearchPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lrpnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSearchSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lrpnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchSong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lrpnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        pnlSearchAll.setVisible(true);
        pnlSearchSong.setVisible(false);
        pnlSearchPlaylist.setVisible(false);
        pnlSearchAll.loadSong();
        pnlSearchAll.loadPlaylist();
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnSearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSongActionPerformed
        pnlSearchAll.setVisible(false);
        pnlSearchSong.setVisible(true);
        pnlSearchPlaylist.setVisible(false);
        
    }//GEN-LAST:event_btnSearchSongActionPerformed

    private void btnSearchPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPlaylistActionPerformed
        pnlSearchAll.setVisible(false);
        pnlSearchSong.setVisible(false);
        pnlSearchPlaylist.setVisible(true);
        pnlSearchPlaylist.loadPlaylist();
    }//GEN-LAST:event_btnSearchPlaylistActionPerformed

    private void btnSearchAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchAllMouseClicked
        btnSearchAll.setCheckClick(true);
        btnSearchAll.changePaint();
        btnSearchSong.setCheckClick(false);
        btnSearchSong.rePaint();
        btnSearchPlaylist.setCheckClick(false);
        btnSearchPlaylist.rePaint();
    }//GEN-LAST:event_btnSearchAllMouseClicked

    private void btnSearchSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchSongMouseClicked
        btnSearchAll.setCheckClick(false);
        btnSearchAll.rePaint();
        btnSearchSong.setCheckClick(true);
        btnSearchSong.changePaint();
        btnSearchPlaylist.setCheckClick(false);
        btnSearchPlaylist.rePaint();
    }//GEN-LAST:event_btnSearchSongMouseClicked

    private void btnSearchPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPlaylistMouseClicked
        btnSearchAll.setCheckClick(false);
        btnSearchAll.rePaint();
        btnSearchAll.repaint();
        btnSearchSong.setCheckClick(false);
        btnSearchSong.rePaint();
        btnSearchSong.repaint();
        btnSearchPlaylist.setCheckClick(true);
        btnSearchPlaylist.changePaint();
        btnSearchPlaylist.repaint();
    }//GEN-LAST:event_btnSearchPlaylistMouseClicked

    private void btnSearchAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchAllMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchAllMouseEntered

    private void btnSearchAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchAllMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchAllMouseExited

    private void btnSearchSongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchSongMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSongMouseEntered

    private void btnSearchSongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchSongMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSongMouseExited

    private void btnSearchPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPlaylistMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchPlaylistMouseEntered

    private void btnSearchPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchPlaylistMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchPlaylistMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonMenuSearch btnSearchAll;
    private components.ButtonMenuSearch btnSearchPlaylist;
    private components.ButtonMenuSearch btnSearchSong;
    private javax.swing.JLayeredPane lrpnlSearch;
    private swing.SearchAll pnlSearchAll;
    private swing.SearchPlaylist pnlSearchPlaylist;
    private swing.SearchSong pnlSearchSong;
    // End of variables declaration//GEN-END:variables
}
