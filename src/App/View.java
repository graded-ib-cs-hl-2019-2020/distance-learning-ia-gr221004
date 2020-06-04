/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author isa
 */
public class View extends javax.swing.JFrame {

    /*
    This class holds the heart and soul of this project. It stems from user input
    as well as being able to directly and easily communicate with 
    Netbeans-Java features. This is where most of my code lies.
    */
    
    // controls all aspects of JList automatically, implementing a basic list model
    DefaultListModel<String> listModel = new DefaultListModel();
    
    // creating the arrayList that is the clas slist
    public static ArrayList<String> arrayList = new ArrayList<>();
    
    // to stop multiple entries in file
    boolean flag = true;
    
    // creates the counter that lets the "view desks" button know how many times its been clicked
    int counter = 0;
    
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        finishedInputBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addStudentBtn = new javax.swing.JButton();
        editStudentBtn = new javax.swing.JButton();
        clearListBtn = new javax.swing.JButton();
        removeStudentBtn = new javax.swing.JButton();
        importCLBtn = new javax.swing.JButton();
        exportCLBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nGroups = new javax.swing.JTextField();
        input = new javax.swing.JTextField();
        nGroupsBtn = new javax.swing.JButton();
        studentListBtn = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        sortedLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        separatedStudentsText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        viewDesksBtn = new javax.swing.JButton();

        dialog.setBackground(new java.awt.Color(255, 204, 204));
        dialog.setModal(true);
        dialog.setPreferredSize(new java.awt.Dimension(700, 450));
        dialog.setSize(new java.awt.Dimension(700, 450));

        jPanel1.setBackground(new java.awt.Color(241, 221, 207));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 450));
        jPanel1.setSize(new java.awt.Dimension(700, 450));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel1.setText("Input Students Here");

        finishedInputBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        finishedInputBtn.setText("List Completed");
        finishedInputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedInputBtnActionPerformed(evt);
            }
        });

        jList.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel2.setText("Student List");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("File name must be \"Student List.txt\"");

        addStudentBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        addStudentBtn.setText("Add Student");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        editStudentBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        editStudentBtn.setText("Edit and Update Student");
        editStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBtnActionPerformed(evt);
            }
        });

        clearListBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        clearListBtn.setText("Clear List");
        clearListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListBtnActionPerformed(evt);
            }
        });

        removeStudentBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        removeStudentBtn.setText("Remove Student");
        removeStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentBtnActionPerformed(evt);
            }
        });

        importCLBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        importCLBtn.setText("Import Class List");
        importCLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCLBtnActionPerformed(evt);
            }
        });

        exportCLBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        exportCLBtn.setText("Export Class List");
        exportCLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCLBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("enter one by one to add, click on student name to edit/remove");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Into groups of how many would you like them to be sorted into?");

        nGroups.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        input.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        nGroupsBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        nGroupsBtn.setText("Done");
        nGroupsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nGroupsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(editStudentBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(importCLBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addStudentBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearListBtn)
                                .addGap(31, 31, 31)
                                .addComponent(removeStudentBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(25, 25, 25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(nGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(nGroupsBtn)
                                            .addGap(119, 119, 119)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(finishedInputBtn)
                                        .addGap(162, 162, 162))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(exportCLBtn)
                                        .addGap(38, 38, 38))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(118, 118, 118))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importCLBtn)
                            .addComponent(exportCLBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addStudentBtn)
                            .addComponent(removeStudentBtn)
                            .addComponent(clearListBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editStudentBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nGroups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nGroupsBtn))
                        .addGap(26, 26, 26)
                        .addComponent(finishedInputBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 226, 242));
        setLocation(new java.awt.Point(350, 200));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));

        studentListBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        studentListBtn.setText("Input Students");
        studentListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListBtnActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(184, 226, 242));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sortedLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sortedLabel.setText("Sorted Students");

        separatedStudentsText.setColumns(1);
        separatedStudentsText.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        separatedStudentsText.setLineWrap(true);
        separatedStudentsText.setRows(10);
        jScrollPane1.setViewportView(separatedStudentsText);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setText("Welcome To Student Seating Sorter!");

        viewDesksBtn.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        viewDesksBtn.setText("View Desks");
        viewDesksBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDesksBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentListBtn)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6))
                    .addComponent(jDesktopPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(viewDesksBtn)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sortedLabel)
                                .addGap(36, 36, 36))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentListBtn)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewDesksBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sortedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void finishedInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedInputBtnActionPerformed

        // makes the window become "hidden" so user returns to main screen
        dialog.setVisible(false);
       
    }//GEN-LAST:event_finishedInputBtnActionPerformed

    private void importCLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCLBtnActionPerformed
        /* 
        I decided to use a BufferedReader to get long strings from a txt document
        to be able to import it into the current class list. The buffering makes
        reading of files efficient.
        */
        if (flag) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Student List.txt"));
            
            //reads the first line from file (int value, # of entries in file)
            int val = Integer.parseInt(br.readLine());
            for (int i = 0; i<val; i++) {
                // reads data from file
                String name = br.readLine();
                
                // adds data to listModel object
               listModel.addElement(name);
            }
            // stores listModel to JList object
            jList.setModel(listModel);
            // controls multiple entries
            flag = false;
        } catch (IOException | NumberFormatException e){
            System.out.println("" + e);
        } finally {
            try {
                br.close();
            } catch (IOException e){
                System.out.println("" + e);
            }
        }
    }
    }//GEN-LAST:event_importCLBtnActionPerformed

    private void studentListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListBtnActionPerformed
        
        // makes the officially separated student groups list appear blank
        separatedStudentsText.setText("");
        
        // clears the class list array to create a new class list, but previous list still appears on JList
        arrayList.clear();
        
        // resets the counter
        counter = 0;
        
        // makes student input window visible
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setBounds((screenSize.width-700)/2, (screenSize.height-450)/2, 700, 450);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_studentListBtnActionPerformed
    
    public void convertRandomize() {
        // converts JList to an ArrayList
        int size = jList.getModel().getSize();
        for(int i=0; i < size ; i++){
            arrayList.add(jList.getModel().getElementAt(i));
        }
        
        // shuffles/randomizes the arrayList
        Collections.shuffle(arrayList);

    }
    
    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed

        // adds input to JList
        add(input.getText());
        
        //clears input box
        input.setText("");
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void add(String input){
        
        // makes JList follow DefaultListModel, which essentially controls everything in JList
        jList.setModel(listModel);
        
        // adds input as an accepted source to the model's contents
        listModel.addElement(input);
        
    }
    
    private void editStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBtnActionPerformed
        
        // allows user to select and edit whichever part of student's name they want to, and change it by clicking the button
        int index = jList.getSelectedIndex();
        listModel.setElementAt(input.getText(), index);
        
        //clears input box
        input.setText("");
    }//GEN-LAST:event_editStudentBtnActionPerformed

    private void removeStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentBtnActionPerformed
        
        // allows the user to select a name and remove it from the list
        int index = jList.getSelectedIndex();
        listModel.removeElementAt(index);
        
        //clears input box
        input.setText("");
    }//GEN-LAST:event_removeStudentBtnActionPerformed

    private void clearListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListBtnActionPerformed
        
        //clears JList and resets the model
        listModel.clear();
        jList.setModel(listModel);
    }//GEN-LAST:event_clearListBtnActionPerformed

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked
        
        // when the mouse clicks on an item on the JList, it will be selected
        String selected = jList.getSelectedValue();
        input.setText(selected);
    }//GEN-LAST:event_jListMouseClicked

    private void exportCLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCLBtnActionPerformed
        /*
        I decided to use PrintWriter because it's the equivalent of FileWriter,
        but it uses println to write to file, which is a lot easier to manage.
        */
        
        PrintWriter writer = null;
        
        // gets the size of JList and store in variable
        int val = jList.getModel().getSize();
        try {
            writer = new PrintWriter("Student List.txt");
            
            // writes size of JList to file to help store # of entries using loop
            writer.println(val);
            
            for (int i=0; i<val; i++) {
                // gets the element from JList through index
                writer.println(jList.getModel().getElementAt(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("" + e);
        } finally {
            
            // forget to close file
            writer.close();
        }
    }//GEN-LAST:event_exportCLBtnActionPerformed

    private void nGroupsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nGroupsBtnActionPerformed

        convertRandomize();
        
        // converts text acquired from input box for # of ppl per group into an integer
        int numGroups = Integer.parseInt(nGroups.getText());
        
        //split into groups and display in text area
        StringBuilder b = new StringBuilder();
        for (List<String> part : Partition.ofSize(arrayList, numGroups)) {
            b.append(part + "\n"); 
            separatedStudentsText.setText(b.toString().replace("[", "").replace("]", ""));
        }
        
        
    }//GEN-LAST:event_nGroupsBtnActionPerformed

    private void viewDesksBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDesksBtnMouseClicked

        counter++;
        
        /*
        If the button has been clicked only once, the desks will appear normally.
        The desks won't duplicate even if the user clicks again.
        */
        if (counter == 1) {
            for (int i=0; i < arrayList.size(); i++){
            Desk desk = new Desk();
            jDesktopPane1.add(desk).setVisible(true);
            desk.studentName.setText(arrayList.get(i));
            
            } 
        } else {
            System.out.println("Error! No duplicate desks allowed.");
        }
    }//GEN-LAST:event_viewDesksBtnMouseClicked


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton clearListBtn;
    private javax.swing.JInternalFrame desk;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton editStudentBtn;
    private javax.swing.JButton exportCLBtn;
    private javax.swing.JButton finishedInputBtn;
    private javax.swing.JButton importCLBtn;
    private javax.swing.JTextField input;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nGroups;
    private javax.swing.JButton nGroupsBtn;
    private javax.swing.JButton removeStudentBtn;
    private javax.swing.JTextArea separatedStudentsText;
    private javax.swing.JLabel sortedLabel;
    private javax.swing.JButton studentListBtn;
    private javax.swing.JLabel studentName;
    private javax.swing.JButton viewDesksBtn;
    // End of variables declaration//GEN-END:variables


}
