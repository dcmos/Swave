package swing;

import dao.CommentDAO;
import dao.CommentInteractionDAO;
import dao.UserDAO;
import entity.Comment;
import entity.CommentInteraction;
import entity.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import swave.Login;
import swave.MainFrame;

/**
 *
 * @author NGUYEN VAN SI
 */
public class CommentPane extends javax.swing.JPanel {

    /**
     * Creates new form lyricsPane
     */
    CommentDAO cDao = new CommentDAO();
    CommentInteractionDAO ciDao = new CommentInteractionDAO();
    UserDAO uDao = new UserDAO();
    List<Comment> cList = new ArrayList<>();
    List<CommentInteraction> ciByCmtIDList = new ArrayList<>();
    public MainFrame main;

    public CommentPane() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new Color(0, 0, 0, 0));
    }

    public void addComment(Comment data) {
        User uEntity = uDao.selectByIDUser(data.getUserID());
        ciByCmtIDList = ciDao.selectByCMId(data.getCommentID());

        int like = 0;
        int dislike = 0;
        if (ciByCmtIDList != null) {
            for (CommentInteraction commentInteraction : ciByCmtIDList) {
                if (commentInteraction.isLiked()) {
                    like++;
                } else {
                    dislike++;
                }
            }
        }
        System.out.println(uEntity.getAvt());
        CommentItem item = new CommentItem(uEntity.getFullname(), data.getContent(), like, dislike, uEntity.getAvt());
        item.js = jScrollPane1;
        item.data = data;
        item.loadDataCommentIn();
        pnlComments.add(item);

        if (pnlComments.getComponentCount() > 4) {
            pnlComments.setPreferredSize(new Dimension(620, pnlComments.getHeight() + 113));
        }

        validate();
        pnlComments.repaint();
        pnlComments.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlComments = new javax.swing.JPanel();
        scrollBar1 = new component.ScrollBar();
        txtComment = new model.input();
        lblPlaceholder = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        btnSend = new component.Button();
        lblTitle = new javax.swing.JLabel();
        lblCountComment = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(77, 0, 79));
        setPreferredSize(new java.awt.Dimension(672, 737));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        pnlComments.setOpaque(false);
        pnlComments.setPreferredSize(new java.awt.Dimension(620, 544));
        pnlComments.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        jScrollPane1.setViewportView(pnlComments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 118, 620, 544));
        add(scrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 300));

        txtComment.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtComment.setPreferredSize(new java.awt.Dimension(64, 35));
        txtComment.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCommentCaretUpdate(evt);
            }
        });
        add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 510, -1));

        lblPlaceholder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPlaceholder.setForeground(new java.awt.Color(125, 108, 108));
        lblPlaceholder.setText("Nhập bình luận");
        lblPlaceholder.setPreferredSize(new java.awt.Dimension(37, 35));
        add(lblPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 290, 35));

        lblComment.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtComment.png"))); // NOI18N
        add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 682, -1, -1));

        btnSend.setText("Gửi");
        btnSend.setColor1(new java.awt.Color(255, 0, 245));
        btnSend.setColor2(new java.awt.Color(255, 0, 245));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setPreferredSize(new java.awt.Dimension(68, 34));
        btnSend.setSizeSpeed(12.0F);
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 680, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Bình luận");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 18, 170, 50));

        lblCountComment.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblCountComment.setForeground(new java.awt.Color(125, 108, 108));
        lblCountComment.setText("14 bình luận");
        add(lblCountComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, 30));

        jSeparator1.setPreferredSize(new java.awt.Dimension(624, 624));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 69, -1, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closeWindow 1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 33, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
    }//GEN-LAST:event_formMouseEntered

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        String content = txtComment.getText();
        Comment item = new Comment();
        item.setContent(content);
        item.setUserID(Login.user.getUserID());
        item.setSongID(main.getToolPlay1().getData().getSongID());
        cDao.insert(item);
        txtComment.setText("");
        loadDataComment();
    }//GEN-LAST:event_btnSendMouseClicked

    private void txtCommentCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCommentCaretUpdate
        if (!txtComment.getText().equals("")) {
            lblPlaceholder.setText("");
        } else {
            lblPlaceholder.setText("Nhập bình luận");
        }
    }//GEN-LAST:event_txtCommentCaretUpdate

    public void loadDataComment() {
        cList = cDao.selectAllBySong(main.getToolPlay1().getData().getSongID());
        pnlComments.removeAll();
        pnlComments.setPreferredSize(new Dimension(620, 544));
        if (cList != null) {
            for (Comment comment : cList) {
                addComment(comment);
            }
            lblCountComment.setText(cList.size() + " bình luận");
        }

        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblCountComment;
    private javax.swing.JLabel lblPlaceholder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlComments;
    private component.ScrollBar scrollBar1;
    private model.input txtComment;
    // End of variables declaration//GEN-END:variables
}
