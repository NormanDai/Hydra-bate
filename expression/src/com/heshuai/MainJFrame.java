package com.heshuai;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 * 
 * @author Administrator
 */
public class MainJFrame extends javax.swing.JFrame
{

	final static Font fontPLAIN = new Font("Dialog", Font.PLAIN, 12);
	final static Font fontBOLD = new Font("Dialog", Font.BOLD | Font.ITALIC, 12);
	CheckBoxItemListener _checkBoxItemListener = new CheckBoxItemListener();
	MUItemListener _MUItemListener = new MUItemListener();
	HHItemListener _HHItemListener = new HHItemListener();
	DDItemListener _DDItemListener = new DDItemListener();
	MMItemListener _MMItemListener = new MMItemListener();
	WKItemListener _WKItemListener = new WKItemListener();
	SpinnerNumberModel sp_MU_From_Model = new SpinnerNumberModel(0, 0, 59, 1);   //?????????????????????????????????? SpinnerNumberModel(int value, int minmum, int maxmum, int stepSize)
	SpinnerNumberModel sp_MU_Every_Model = new SpinnerNumberModel(5, 1, 50, 1);
	java.util.Map<Integer, JCheckBox> jCB_MU_Map = new java.util.TreeMap<Integer, JCheckBox>();
	java.util.Map<Integer, JCheckBox> jCB_HH_Map = new java.util.TreeMap<Integer, JCheckBox>();
	java.util.Map<Integer, JCheckBox> jCB_DD_Map = new java.util.TreeMap<Integer, JCheckBox>();
	java.util.Map<Integer, JCheckBox> jCB_MM_Map = new java.util.TreeMap<Integer, JCheckBox>();
	java.util.Map<Integer, JCheckBox> jCB_WK_Map = new java.util.TreeMap<Integer, JCheckBox>();

	public MainJFrame()
	{
		initComponents();
		postInitUI();
	}

	@SuppressWarnings("unchecked")    //??????????????????????????????????????????????????????????????????????????????????????????????
	private void initComponents()
	{

		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		buttonGroup3 = new javax.swing.ButtonGroup();
		buttonGroup4 = new javax.swing.ButtonGroup();
		buttonGroup5 = new javax.swing.ButtonGroup();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel4 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jSP_MU_From = new javax.swing.JSpinner();
		jLabel10 = new javax.swing.JLabel();
		jSP_MU_Every = new javax.swing.JSpinner();
		jLabel12 = new javax.swing.JLabel();
		jRB_MU_Loop = new javax.swing.JRadioButton();
		jRB_MU_Assign = new javax.swing.JRadioButton();
		jPanel12 = new javax.swing.JPanel();
		jCB_MU_0 = new javax.swing.JCheckBox();
		jCB_MU_1 = new javax.swing.JCheckBox();
		jCB_MU_2 = new javax.swing.JCheckBox();
		jCB_MU_3 = new javax.swing.JCheckBox();
		jCB_MU_4 = new javax.swing.JCheckBox();
		jCB_MU_5 = new javax.swing.JCheckBox();
		jCB_MU_6 = new javax.swing.JCheckBox();
		jCB_MU_7 = new javax.swing.JCheckBox();
		jCB_MU_8 = new javax.swing.JCheckBox();
		jCB_MU_9 = new javax.swing.JCheckBox();
		jCB_MU_10 = new javax.swing.JCheckBox();
		jCB_MU_11 = new javax.swing.JCheckBox();
		jCB_MU_12 = new javax.swing.JCheckBox();
		jCB_MU_13 = new javax.swing.JCheckBox();
		jCB_MU_14 = new javax.swing.JCheckBox();
		jCB_MU_15 = new javax.swing.JCheckBox();
		jCB_MU_16 = new javax.swing.JCheckBox();
		jCB_MU_17 = new javax.swing.JCheckBox();
		jCB_MU_18 = new javax.swing.JCheckBox();
		jCB_MU_19 = new javax.swing.JCheckBox();
		jCB_MU_20 = new javax.swing.JCheckBox();
		jCB_MU_21 = new javax.swing.JCheckBox();
		jCB_MU_22 = new javax.swing.JCheckBox();
		jCB_MU_23 = new javax.swing.JCheckBox();
		jCB_MU_24 = new javax.swing.JCheckBox();
		jCB_MU_25 = new javax.swing.JCheckBox();
		jCB_MU_26 = new javax.swing.JCheckBox();
		jCB_MU_27 = new javax.swing.JCheckBox();
		jCB_MU_28 = new javax.swing.JCheckBox();
		jCB_MU_29 = new javax.swing.JCheckBox();
		jCB_MU_30 = new javax.swing.JCheckBox();
		jCB_MU_31 = new javax.swing.JCheckBox();
		jCB_MU_32 = new javax.swing.JCheckBox();
		jCB_MU_33 = new javax.swing.JCheckBox();
		jCB_MU_34 = new javax.swing.JCheckBox();
		jCB_MU_35 = new javax.swing.JCheckBox();
		jCB_MU_36 = new javax.swing.JCheckBox();
		jCB_MU_37 = new javax.swing.JCheckBox();
		jCB_MU_38 = new javax.swing.JCheckBox();
		jCB_MU_39 = new javax.swing.JCheckBox();
		jCB_MU_40 = new javax.swing.JCheckBox();
		jCB_MU_41 = new javax.swing.JCheckBox();
		jCB_MU_42 = new javax.swing.JCheckBox();
		jCB_MU_43 = new javax.swing.JCheckBox();
		jCB_MU_44 = new javax.swing.JCheckBox();
		jCB_MU_45 = new javax.swing.JCheckBox();
		jCB_MU_46 = new javax.swing.JCheckBox();
		jCB_MU_47 = new javax.swing.JCheckBox();
		jCB_MU_48 = new javax.swing.JCheckBox();
		jCB_MU_49 = new javax.swing.JCheckBox();
		jCB_MU_50 = new javax.swing.JCheckBox();
		jCB_MU_51 = new javax.swing.JCheckBox();
		jCB_MU_52 = new javax.swing.JCheckBox();
		jCB_MU_53 = new javax.swing.JCheckBox();
		jCB_MU_54 = new javax.swing.JCheckBox();
		jCB_MU_55 = new javax.swing.JCheckBox();
		jCB_MU_56 = new javax.swing.JCheckBox();
		jCB_MU_57 = new javax.swing.JCheckBox();
		jCB_MU_58 = new javax.swing.JCheckBox();
		jCB_MU_59 = new javax.swing.JCheckBox();
		jPanel5 = new javax.swing.JPanel();
		jRB_HH_Every = new javax.swing.JRadioButton();
		jRB_HH_Assign = new javax.swing.JRadioButton();
		jPanel9 = new javax.swing.JPanel();
		jCB_HH_0 = new javax.swing.JCheckBox();
		jCB_HH_1 = new javax.swing.JCheckBox();
		jCB_HH_2 = new javax.swing.JCheckBox();
		jCB_HH_3 = new javax.swing.JCheckBox();
		jCB_HH_4 = new javax.swing.JCheckBox();
		jCB_HH_5 = new javax.swing.JCheckBox();
		jCB_HH_6 = new javax.swing.JCheckBox();
		jCB_HH_7 = new javax.swing.JCheckBox();
		jCB_HH_8 = new javax.swing.JCheckBox();
		jCB_HH_9 = new javax.swing.JCheckBox();
		jCB_HH_10 = new javax.swing.JCheckBox();
		jCB_HH_11 = new javax.swing.JCheckBox();
		jCB_HH_12 = new javax.swing.JCheckBox();
		jCB_HH_13 = new javax.swing.JCheckBox();
		jCB_HH_14 = new javax.swing.JCheckBox();
		jCB_HH_15 = new javax.swing.JCheckBox();
		jCB_HH_16 = new javax.swing.JCheckBox();
		jCB_HH_17 = new javax.swing.JCheckBox();
		jCB_HH_18 = new javax.swing.JCheckBox();
		jCB_HH_19 = new javax.swing.JCheckBox();
		jCB_HH_20 = new javax.swing.JCheckBox();
		jCB_HH_21 = new javax.swing.JCheckBox();
		jCB_HH_22 = new javax.swing.JCheckBox();
		jCB_HH_23 = new javax.swing.JCheckBox();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jRB_DD_Every = new javax.swing.JRadioButton();
		jRB_DD_Assign = new javax.swing.JRadioButton();
		jPanel10 = new javax.swing.JPanel();
		jCB_DD_1 = new javax.swing.JCheckBox();
		jCB_DD_2 = new javax.swing.JCheckBox();
		jCB_DD_3 = new javax.swing.JCheckBox();
		jCB_DD_4 = new javax.swing.JCheckBox();
		jCB_DD_5 = new javax.swing.JCheckBox();
		jCB_DD_6 = new javax.swing.JCheckBox();
		jCB_DD_7 = new javax.swing.JCheckBox();
		jCB_DD_8 = new javax.swing.JCheckBox();
		jCB_DD_9 = new javax.swing.JCheckBox();
		jCB_DD_10 = new javax.swing.JCheckBox();
		jCB_DD_11 = new javax.swing.JCheckBox();
		jCB_DD_12 = new javax.swing.JCheckBox();
		jCB_DD_13 = new javax.swing.JCheckBox();
		jCB_DD_14 = new javax.swing.JCheckBox();
		jCB_DD_15 = new javax.swing.JCheckBox();
		jCB_DD_16 = new javax.swing.JCheckBox();
		jCB_DD_17 = new javax.swing.JCheckBox();
		jCB_DD_18 = new javax.swing.JCheckBox();
		jCB_DD_19 = new javax.swing.JCheckBox();
		jCB_DD_20 = new javax.swing.JCheckBox();
		jCB_DD_21 = new javax.swing.JCheckBox();
		jCB_DD_22 = new javax.swing.JCheckBox();
		jCB_DD_23 = new javax.swing.JCheckBox();
		jCB_DD_24 = new javax.swing.JCheckBox();
		jCB_DD_25 = new javax.swing.JCheckBox();
		jCB_DD_26 = new javax.swing.JCheckBox();
		jCB_DD_27 = new javax.swing.JCheckBox();
		jCB_DD_28 = new javax.swing.JCheckBox();
		jCB_DD_29 = new javax.swing.JCheckBox();
		jCB_DD_30 = new javax.swing.JCheckBox();
		jCB_DD_31 = new javax.swing.JCheckBox();
		jPanel7 = new javax.swing.JPanel();
		jRB_MM_Every = new javax.swing.JRadioButton();
		jRB_MM_Assign = new javax.swing.JRadioButton();
		jPanel11 = new javax.swing.JPanel();
		jCB_MM_1 = new javax.swing.JCheckBox();
		jCB_MM_2 = new javax.swing.JCheckBox();
		jCB_MM_3 = new javax.swing.JCheckBox();
		jCB_MM_4 = new javax.swing.JCheckBox();
		jCB_MM_5 = new javax.swing.JCheckBox();
		jCB_MM_6 = new javax.swing.JCheckBox();
		jCB_MM_7 = new javax.swing.JCheckBox();
		jCB_MM_8 = new javax.swing.JCheckBox();
		jCB_MM_9 = new javax.swing.JCheckBox();
		jCB_MM_10 = new javax.swing.JCheckBox();
		jCB_MM_11 = new javax.swing.JCheckBox();
		jCB_MM_12 = new javax.swing.JCheckBox();
		jPanel8 = new javax.swing.JPanel();
		jCB_WK_Use = new javax.swing.JCheckBox();
		jPanel1_WK = new javax.swing.JPanel();
		jCB_WK_1 = new javax.swing.JCheckBox();
		jCB_WK_2 = new javax.swing.JCheckBox();
		jCB_WK_3 = new javax.swing.JCheckBox();
		jCB_WK_4 = new javax.swing.JCheckBox();
		jCB_WK_5 = new javax.swing.JCheckBox();
		jCB_WK_6 = new javax.swing.JCheckBox();
		jCB_WK_7 = new javax.swing.JCheckBox();
		jRB_WK_Every = new javax.swing.JRadioButton();
		jRB_WK_Assign = new javax.swing.JRadioButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTF_Cron_Second = new javax.swing.JTextField();
		jTF_Cron_Minute = new javax.swing.JTextField();
		jTF_Cron_Hour = new javax.swing.JTextField();
		jTF_Cron_Day = new javax.swing.JTextField();
		jTF_Cron_Month = new javax.swing.JTextField();
		jTF_Cron_Week = new javax.swing.JTextField();
		jTF_Cron_Exp = new javax.swing.JTextField();
		jButton_Parse = new javax.swing.JButton();
		jPanel13 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jTF_Schedule_Start = new javax.swing.JTextField();
		jLabel14 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTA_Schedule_Next = new javax.swing.JTextArea();
		jPanel3 = new javax.swing.JPanel();
		jButton_Copy = new javax.swing.JButton();
		jButton_Exit = new javax.swing.JButton();
		jButton_Make = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Quartz????????????");
		setResizable(false);

		jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "????,????"));
		

		jLabel9.setText("From");    //????...????????????????...??????????????
		jSP_MU_From.setModel(sp_MU_From_Model);
		jLabel10.setText("Minute start,Every");
		jSP_MU_Every.setModel(sp_MU_Every_Model);
		jLabel12.setText("Minute Execute");		

		buttonGroup1.add(jRB_MU_Loop);
		jRB_MU_Loop.setSelected(true);
		jRB_MU_Loop.setText("Cycle:");
		

		buttonGroup1.add(jRB_MU_Assign);
		jRB_MU_Assign.setText("Assign:");
		jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());  //????????????????????????????????????
		jCB_MU_0.setText("0");
		jCB_MU_0.setEnabled(false);
		jCB_MU_1.setText("1");
		jCB_MU_1.setEnabled(false);
		jCB_MU_2.setText("2");
		jCB_MU_2.setEnabled(false);
		jCB_MU_3.setText("3");
		jCB_MU_3.setEnabled(false);
		jCB_MU_4.setText("4");
		jCB_MU_4.setEnabled(false);
		jCB_MU_5.setText("5");
		jCB_MU_5.setEnabled(false);
		jCB_MU_6.setText("6");
		jCB_MU_6.setEnabled(false);
		jCB_MU_7.setText("7");
		jCB_MU_7.setEnabled(false);
		jCB_MU_8.setText("8");
		jCB_MU_8.setEnabled(false);
		jCB_MU_9.setText("9");
		jCB_MU_9.setEnabled(false);
		jCB_MU_10.setText("10");
		jCB_MU_10.setEnabled(false);
		jCB_MU_11.setText("11");
		jCB_MU_11.setEnabled(false);
		jCB_MU_12.setText("12");
		jCB_MU_12.setEnabled(false);
		jCB_MU_13.setText("13");
		jCB_MU_13.setEnabled(false);
		jCB_MU_14.setText("14");
		jCB_MU_14.setEnabled(false);
		jCB_MU_15.setText("15");
		jCB_MU_15.setEnabled(false);
		jCB_MU_16.setText("16");
		jCB_MU_16.setEnabled(false);
		jCB_MU_17.setText("17");
		jCB_MU_17.setEnabled(false);
		jCB_MU_18.setText("18");
		jCB_MU_18.setEnabled(false);
		jCB_MU_19.setText("19");
		jCB_MU_19.setEnabled(false);
		jCB_MU_20.setText("20");
		jCB_MU_20.setEnabled(false);
		jCB_MU_21.setText("21");
		jCB_MU_21.setEnabled(false);
		jCB_MU_22.setText("22");
		jCB_MU_22.setEnabled(false);
		jCB_MU_23.setText("23");
		jCB_MU_23.setEnabled(false);
		jCB_MU_24.setText("24");
		jCB_MU_24.setEnabled(false);
		jCB_MU_25.setText("25");
		jCB_MU_25.setEnabled(false);
		jCB_MU_26.setText("26");
		jCB_MU_26.setEnabled(false);
		jCB_MU_27.setText("27");
		jCB_MU_27.setEnabled(false);
		jCB_MU_28.setText("28");
		jCB_MU_28.setEnabled(false);
		jCB_MU_29.setText("29");
		jCB_MU_29.setEnabled(false);
		jCB_MU_30.setText("30");
		jCB_MU_30.setEnabled(false);
		jCB_MU_31.setText("31");
		jCB_MU_31.setEnabled(false);
		jCB_MU_32.setText("32");
		jCB_MU_32.setEnabled(false);
		jCB_MU_33.setText("33");
		jCB_MU_33.setEnabled(false);
		jCB_MU_34.setText("34");
		jCB_MU_34.setEnabled(false);
		jCB_MU_35.setText("35");
		jCB_MU_35.setEnabled(false);
		jCB_MU_36.setText("36");
		jCB_MU_36.setEnabled(false);
		jCB_MU_37.setText("37");
		jCB_MU_37.setEnabled(false);
		jCB_MU_38.setText("38");
		jCB_MU_38.setEnabled(false);
		jCB_MU_39.setText("39");
		jCB_MU_39.setEnabled(false);
		jCB_MU_40.setText("40");
		jCB_MU_40.setEnabled(false);
		jCB_MU_41.setText("41");
		jCB_MU_41.setEnabled(false);
		jCB_MU_42.setText("42");
		jCB_MU_42.setEnabled(false);
		jCB_MU_43.setText("43");
		jCB_MU_43.setEnabled(false);
		jCB_MU_44.setText("44");
		jCB_MU_44.setEnabled(false);
		jCB_MU_45.setText("45");
		jCB_MU_45.setEnabled(false);
		jCB_MU_46.setText("46");
		jCB_MU_46.setEnabled(false);
		jCB_MU_47.setText("47");
		jCB_MU_47.setEnabled(false);
		jCB_MU_48.setText("48");
		jCB_MU_48.setEnabled(false);
		jCB_MU_49.setText("49");
		jCB_MU_49.setEnabled(false);
		jCB_MU_50.setText("50");
		jCB_MU_50.setEnabled(false);
		jCB_MU_51.setText("51");
		jCB_MU_51.setEnabled(false);
		jCB_MU_52.setText("52");
		jCB_MU_52.setEnabled(false);
		jCB_MU_53.setText("53");
		jCB_MU_53.setEnabled(false);
		jCB_MU_54.setText("54");
		jCB_MU_54.setEnabled(false);
		jCB_MU_55.setText("55");
		jCB_MU_55.setEnabled(false);
		jCB_MU_56.setText("56");
		jCB_MU_56.setEnabled(false);
		jCB_MU_57.setText("57");
		jCB_MU_57.setEnabled(false);
		jCB_MU_58.setText("58");
		jCB_MU_58.setEnabled(false);
		jCB_MU_59.setText("59");
		jCB_MU_59.setEnabled(false);

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_0).addComponent(jCB_MU_15)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_16).addComponent(jCB_MU_1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_17).addComponent(jCB_MU_2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_18).addComponent(jCB_MU_3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_4).addComponent(jCB_MU_19)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_20).addComponent(jCB_MU_5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_6).addComponent(jCB_MU_21)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_22).addComponent(jCB_MU_7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_8).addComponent(jCB_MU_23)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_24).addComponent(jCB_MU_9)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_25).addComponent(jCB_MU_10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_26).addComponent(jCB_MU_11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MU_27).addComponent(jCB_MU_12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addComponent(jCB_MU_13).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_14)).addGroup(jPanel12Layout.createSequentialGroup().addComponent(jCB_MU_28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_29)))).addGroup(jPanel12Layout.createSequentialGroup().addComponent(jCB_MU_45).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_46).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_47).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_48).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_49).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_50).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_51).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_52).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_53).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_54).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_55).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_56).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_57).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_58).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_59)).addGroup(jPanel12Layout.createSequentialGroup().addComponent(jCB_MU_30).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_31).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_33).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_36).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_37).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_39).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_MU_42).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_43).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_MU_44))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MU_0).addComponent(jCB_MU_1).addComponent(jCB_MU_2).addComponent(jCB_MU_3).addComponent(jCB_MU_4).addComponent(jCB_MU_5).addComponent(jCB_MU_6).addComponent(jCB_MU_7).addComponent(jCB_MU_8).addComponent(jCB_MU_9).addComponent(jCB_MU_10).addComponent(jCB_MU_11).addComponent(jCB_MU_12).addComponent(jCB_MU_13).addComponent(jCB_MU_14)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MU_15).addComponent(jCB_MU_16).addComponent(jCB_MU_17).addComponent(jCB_MU_18).addComponent(jCB_MU_19).addComponent(jCB_MU_20).addComponent(jCB_MU_21).addComponent(jCB_MU_22).addComponent(jCB_MU_23).addComponent(jCB_MU_24).addComponent(jCB_MU_25).addComponent(jCB_MU_26).addComponent(jCB_MU_27).addComponent(jCB_MU_28).addComponent(jCB_MU_29)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MU_30).addComponent(jCB_MU_31).addComponent(jCB_MU_32).addComponent(jCB_MU_33).addComponent(jCB_MU_34).addComponent(jCB_MU_35).addComponent(jCB_MU_36).addComponent(jCB_MU_37).addComponent(jCB_MU_38).addComponent(jCB_MU_39).addComponent(jCB_MU_40).addComponent(jCB_MU_41).addComponent(jCB_MU_42).addComponent(jCB_MU_43).addComponent(jCB_MU_44)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MU_45).addComponent(jCB_MU_46).addComponent(jCB_MU_47).addComponent(jCB_MU_48).addComponent(jCB_MU_49).addComponent(jCB_MU_50).addComponent(jCB_MU_51).addComponent(jCB_MU_52).addComponent(jCB_MU_53).addComponent(jCB_MU_54).addComponent(jCB_MU_55).addComponent(jCB_MU_56).addComponent(jCB_MU_57).addComponent(jCB_MU_58).addComponent(jCB_MU_59)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRB_MU_Assign).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRB_MU_Loop).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel9).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jSP_MU_From, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jSP_MU_Every, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(3, 3, 3).addComponent(jLabel12)).addGroup(jPanel4Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(67, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addComponent(jRB_MU_Loop).addComponent(jLabel9).addComponent(jSP_MU_From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel10).addComponent(jSP_MU_Every, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRB_MU_Assign).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(19, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Minute", jPanel4);

		buttonGroup2.add(jRB_HH_Every);
		jRB_HH_Every.setSelected(true);
		jRB_HH_Every.setText("Per Hour");

		buttonGroup2.add(jRB_HH_Assign);
		jRB_HH_Assign.setText("Assign:");

		jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jCB_HH_0.setText("0  ");
		jCB_HH_0.setEnabled(false);

		jCB_HH_1.setText("1  ");
		jCB_HH_1.setEnabled(false);

		jCB_HH_2.setText("2  ");
		jCB_HH_2.setEnabled(false);

		jCB_HH_3.setText("3  ");
		jCB_HH_3.setEnabled(false);

		jCB_HH_4.setText("4  ");
		jCB_HH_4.setEnabled(false);

		jCB_HH_5.setText("5  ");
		jCB_HH_5.setEnabled(false);

		jCB_HH_6.setText("6  ");
		jCB_HH_6.setEnabled(false);

		jCB_HH_7.setText("7  ");
		jCB_HH_7.setEnabled(false);

		jCB_HH_8.setText("8  ");
		jCB_HH_8.setEnabled(false);

		jCB_HH_9.setText("9  ");
		jCB_HH_9.setEnabled(false);

		jCB_HH_10.setText("10  ");
		jCB_HH_10.setEnabled(false);

		jCB_HH_11.setText("11  ");
		jCB_HH_11.setEnabled(false);

		jCB_HH_12.setText("12  ");
		jCB_HH_12.setEnabled(false);

		jCB_HH_13.setText("13  ");
		jCB_HH_13.setEnabled(false);

		jCB_HH_14.setText("14  ");
		jCB_HH_14.setEnabled(false);

		jCB_HH_15.setText("15  ");
		jCB_HH_15.setEnabled(false);

		jCB_HH_16.setText("16  ");
		jCB_HH_16.setEnabled(false);

		jCB_HH_17.setText("17  ");
		jCB_HH_17.setEnabled(false);

		jCB_HH_18.setText("18  ");
		jCB_HH_18.setEnabled(false);

		jCB_HH_19.setText("19  ");
		jCB_HH_19.setEnabled(false);

		jCB_HH_20.setText("20  ");
		jCB_HH_20.setEnabled(false);

		jCB_HH_21.setText("21  ");
		jCB_HH_21.setEnabled(false);

		jCB_HH_22.setText("22  ");
		jCB_HH_22.setEnabled(false);

		jCB_HH_23.setText("23  ");
		jCB_HH_23.setEnabled(false);

		jLabel16.setText("AM:");

		jLabel17.setText("PM:");

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGap(2, 2, 2).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel16).addComponent(jLabel17)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_12).addComponent(jCB_HH_0)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_1).addComponent(jCB_HH_13)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCB_HH_14).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_HH_15)).addGroup(jPanel9Layout.createSequentialGroup().addComponent(jCB_HH_2).addGap(8, 8, 8).addComponent(jCB_HH_3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_4).addComponent(jCB_HH_16)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_5).addComponent(jCB_HH_17)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_6).addComponent(jCB_HH_18)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_7).addComponent(jCB_HH_19)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_8).addComponent(jCB_HH_20)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_9).addComponent(jCB_HH_21)).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_HH_10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)).addGroup(jPanel9Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_HH_22).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_HH_11).addComponent(jCB_HH_23)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_HH_11).addComponent(jCB_HH_10).addComponent(jCB_HH_9)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_HH_21).addComponent(jCB_HH_22).addComponent(jCB_HH_23))).addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_HH_0).addComponent(jCB_HH_8).addComponent(jCB_HH_7).addComponent(jCB_HH_6).addComponent(jCB_HH_5).addComponent(jCB_HH_4).addComponent(jCB_HH_3).addComponent(jCB_HH_2).addComponent(jCB_HH_1).addComponent(jLabel16)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_HH_12).addComponent(jCB_HH_13).addComponent(jCB_HH_14).addComponent(jCB_HH_15).addComponent(jCB_HH_16).addComponent(jCB_HH_17).addComponent(jCB_HH_18).addComponent(jCB_HH_19).addComponent(jCB_HH_20).addComponent(jLabel17)))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jRB_HH_Assign).addComponent(jRB_HH_Every)).addContainerGap(101, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jRB_HH_Every).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRB_HH_Assign).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(71, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Hour", jPanel5);

		buttonGroup3.add(jRB_DD_Every);
		jRB_DD_Every.setSelected(true);
		jRB_DD_Every.setText("Per Day");

		buttonGroup3.add(jRB_DD_Assign);
		jRB_DD_Assign.setText("Assign:");

		jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jCB_DD_1.setText("1");
		jCB_DD_1.setEnabled(false);

		jCB_DD_2.setText("2");
		jCB_DD_2.setEnabled(false);

		jCB_DD_3.setText("3");
		jCB_DD_3.setEnabled(false);

		jCB_DD_4.setText("4");
		jCB_DD_4.setEnabled(false);

		jCB_DD_5.setText("5");
		jCB_DD_5.setEnabled(false);

		jCB_DD_6.setText("6");
		jCB_DD_6.setEnabled(false);

		jCB_DD_7.setText("7");
		jCB_DD_7.setEnabled(false);

		jCB_DD_8.setText("8");
		jCB_DD_8.setEnabled(false);

		jCB_DD_9.setText("9");
		jCB_DD_9.setEnabled(false);

		jCB_DD_10.setText("10");
		jCB_DD_10.setEnabled(false);

		jCB_DD_11.setText("11");
		jCB_DD_11.setEnabled(false);

		jCB_DD_12.setText("12");
		jCB_DD_12.setEnabled(false);

		jCB_DD_13.setText("13");
		jCB_DD_13.setEnabled(false);

		jCB_DD_14.setText("14");
		jCB_DD_14.setEnabled(false);

		jCB_DD_15.setText("15");
		jCB_DD_15.setEnabled(false);

		jCB_DD_16.setText("16");
		jCB_DD_16.setEnabled(false);

		jCB_DD_17.setText("17");
		jCB_DD_17.setEnabled(false);

		jCB_DD_18.setText("18");
		jCB_DD_18.setEnabled(false);

		jCB_DD_19.setText("19");
		jCB_DD_19.setEnabled(false);

		jCB_DD_20.setText("20");
		jCB_DD_20.setEnabled(false);

		jCB_DD_21.setText("21");
		jCB_DD_21.setEnabled(false);

		jCB_DD_22.setText("22");
		jCB_DD_22.setEnabled(false);

		jCB_DD_23.setText("23");
		jCB_DD_23.setEnabled(false);

		jCB_DD_24.setText("24");
		jCB_DD_24.setEnabled(false);

		jCB_DD_25.setText("25");
		jCB_DD_25.setEnabled(false);

		jCB_DD_26.setText("26");
		jCB_DD_26.setEnabled(false);

		jCB_DD_27.setText("27");
		jCB_DD_27.setEnabled(false);

		jCB_DD_28.setText("28");
		jCB_DD_28.setEnabled(false);

		jCB_DD_29.setText("29");
		jCB_DD_29.setEnabled(false);

		jCB_DD_30.setText("30");
		jCB_DD_30.setEnabled(false);

		jCB_DD_31.setText("31");
		jCB_DD_31.setEnabled(false);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_1).addGap(7, 7, 7).addComponent(jCB_DD_2)).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_16).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_DD_17))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_3).addComponent(jCB_DD_18)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_19).addComponent(jCB_DD_4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_5).addGap(7, 7, 7).addComponent(jCB_DD_6).addGap(7, 7, 7).addComponent(jCB_DD_7)).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_DD_21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jCB_DD_22))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_23).addComponent(jCB_DD_8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_9).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_24).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_DD_25))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_26).addComponent(jCB_DD_11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_12).addComponent(jCB_DD_27)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_28).addComponent(jCB_DD_13)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_14).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_DD_15)).addGroup(jPanel10Layout.createSequentialGroup().addComponent(jCB_DD_29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_DD_30)))).addGroup(jPanel10Layout.createSequentialGroup().addGap(367, 367, 367).addComponent(jCB_DD_10)).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(jCB_DD_31))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_DD_1).addComponent(jCB_DD_2).addComponent(jCB_DD_3).addComponent(jCB_DD_4).addComponent(jCB_DD_5).addComponent(jCB_DD_6).addComponent(jCB_DD_7).addComponent(jCB_DD_8).addComponent(jCB_DD_9).addComponent(jCB_DD_10).addComponent(jCB_DD_11).addComponent(jCB_DD_12).addComponent(jCB_DD_13).addComponent(jCB_DD_14).addComponent(jCB_DD_15)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jCB_DD_20).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_DD_16).addComponent(jCB_DD_17).addComponent(jCB_DD_18).addComponent(jCB_DD_19)).addComponent(jCB_DD_30).addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_DD_21).addComponent(jCB_DD_22).addComponent(jCB_DD_23).addComponent(jCB_DD_24).addComponent(jCB_DD_25).addComponent(jCB_DD_26).addComponent(jCB_DD_27).addComponent(jCB_DD_28).addComponent(jCB_DD_29))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_DD_31).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRB_DD_Assign).addComponent(jRB_DD_Every))).addGroup(jPanel6Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(83, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jRB_DD_Every).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRB_DD_Assign).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(45, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Day", jPanel6);

		buttonGroup4.add(jRB_MM_Every);
		jRB_MM_Every.setSelected(true);
		jRB_MM_Every.setText("Per Month");

		buttonGroup4.add(jRB_MM_Assign);
		jRB_MM_Assign.setText("Assign:");

		jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jCB_MM_1.setText("1  ");
		jCB_MM_1.setEnabled(false);

		jCB_MM_2.setText("2  ");
		jCB_MM_2.setEnabled(false);

		jCB_MM_3.setText("3  ");
		jCB_MM_3.setEnabled(false);

		jCB_MM_4.setText("4  ");
		jCB_MM_4.setEnabled(false);

		jCB_MM_5.setText("5  ");
		jCB_MM_5.setEnabled(false);

		jCB_MM_6.setText("6  ");
		jCB_MM_6.setEnabled(false);

		jCB_MM_7.setText("7  ");
		jCB_MM_7.setEnabled(false);

		jCB_MM_8.setText("8  ");
		jCB_MM_8.setEnabled(false);

		jCB_MM_9.setText("9  ");
		jCB_MM_9.setEnabled(false);

		jCB_MM_10.setText("10  ");
		jCB_MM_10.setEnabled(false);

		jCB_MM_11.setText("11  ");
		jCB_MM_11.setEnabled(false);

		jCB_MM_12.setText("12  ");
		jCB_MM_12.setEnabled(false);

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addComponent(jCB_MM_1).addGap(7, 7, 7).addComponent(jCB_MM_2)).addGroup(jPanel11Layout.createSequentialGroup().addComponent(jCB_MM_7).addGap(7, 7, 7).addComponent(jCB_MM_8))).addGap(11, 11, 11).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MM_3, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jCB_MM_9, javax.swing.GroupLayout.Alignment.TRAILING)).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jCB_MM_4)).addGroup(jPanel11Layout.createSequentialGroup().addGap(7, 7, 7).addComponent(jCB_MM_10))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MM_5).addComponent(jCB_MM_11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jCB_MM_12).addComponent(jCB_MM_6)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MM_1).addComponent(jCB_MM_6).addComponent(jCB_MM_5).addComponent(jCB_MM_4).addComponent(jCB_MM_3).addComponent(jCB_MM_2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MM_12).addComponent(jCB_MM_11).addComponent(jCB_MM_10)).addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_MM_8).addComponent(jCB_MM_7).addComponent(jCB_MM_9))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(jRB_MM_Assign).addComponent(jRB_MM_Every)).addContainerGap(398, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jRB_MM_Every).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRB_MM_Assign).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(75, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Month", jPanel7);

		jCB_WK_Use.setText("Use Week");
		jCB_WK_Use.addItemListener(new java.awt.event.ItemListener()
		{
			public void itemStateChanged(java.awt.event.ItemEvent evt)
			{
				jCB_WK_UseItemStateChanged(evt);
			}
		});

		jPanel1_WK.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jCB_WK_1.setText("Sunday");
		jCB_WK_1.setEnabled(false);

		jCB_WK_2.setText("Monday");
		jCB_WK_2.setEnabled(false);

		jCB_WK_3.setText("Tuesday");
		jCB_WK_3.setEnabled(false);

		jCB_WK_4.setText("Wednesday");
		jCB_WK_4.setEnabled(false);

		jCB_WK_5.setText("Thursday");
		jCB_WK_5.setEnabled(false);

		jCB_WK_6.setText("Friday");
		jCB_WK_6.setEnabled(false);

		jCB_WK_7.setText("Saturday");
		jCB_WK_7.setEnabled(false);

		buttonGroup5.add(jRB_WK_Every);
		jRB_WK_Every.setSelected(true);
		jRB_WK_Every.setText("Per Week");
		jRB_WK_Every.setEnabled(false);

		buttonGroup5.add(jRB_WK_Assign);
		jRB_WK_Assign.setText("Assign:");
		jRB_WK_Assign.setEnabled(false);

		javax.swing.GroupLayout jPanel1_WKLayout = new javax.swing.GroupLayout(jPanel1_WK);
		jPanel1_WK.setLayout(jPanel1_WKLayout);
		jPanel1_WKLayout.setHorizontalGroup(jPanel1_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1_WKLayout.createSequentialGroup().addContainerGap().addGroup(jPanel1_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1_WKLayout.createSequentialGroup().addGap(21, 21, 21).addComponent(jCB_WK_1).addGap(11, 11, 11).addComponent(jCB_WK_2).addGap(8, 8, 8).addComponent(jCB_WK_3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jCB_WK_4).addGap(7, 7, 7).addComponent(jCB_WK_5).addGap(7, 7, 7).addComponent(jCB_WK_6).addGap(7, 7, 7).addComponent(jCB_WK_7)).addComponent(jRB_WK_Every).addComponent(jRB_WK_Assign)).addContainerGap(35, Short.MAX_VALUE)));
		jPanel1_WKLayout.setVerticalGroup(jPanel1_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1_WKLayout.createSequentialGroup().addContainerGap().addComponent(jRB_WK_Every).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRB_WK_Assign).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1_WKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jCB_WK_7).addComponent(jCB_WK_6).addComponent(jCB_WK_5).addComponent(jCB_WK_4).addComponent(jCB_WK_3).addComponent(jCB_WK_2).addComponent(jCB_WK_1)).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jCB_WK_Use).addContainerGap(638, Short.MAX_VALUE)).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jPanel1_WK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(90, Short.MAX_VALUE))));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jCB_WK_Use).addContainerGap(179, Short.MAX_VALUE)).addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jPanel1_WK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(68, Short.MAX_VALUE))));

		jTabbedPane1.addTab("Week", jPanel8);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Expression"));
		jPanel2.setPreferredSize(new java.awt.Dimension(661, 100));
		
		
		
		

		jLabel1.setText("Field:");

		jLabel2.setText("Second");

		jLabel3.setText("Minute");

		jLabel4.setText("Hour");

		jLabel5.setText("Day");

		jLabel6.setText("Month");

		jLabel7.setText("Week");

		jLabel8.setText("Cron Expression:");

		jTF_Cron_Second.setBackground(java.awt.Color.orange);

		jTF_Cron_Minute.setBackground(java.awt.Color.orange);

		jTF_Cron_Hour.setBackground(java.awt.Color.orange);

		jTF_Cron_Day.setBackground(java.awt.Color.orange);

		jTF_Cron_Month.setBackground(java.awt.Color.orange);

		jTF_Cron_Week.setBackground(java.awt.Color.orange);

		jButton_Parse.setText("Resolve To UI");
		jButton_Parse.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton_ParseActionPerformed(evt);
			}
		});

		jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Plan Execute Time"));

		jLabel13.setText("Start time:");

		jTF_Schedule_Start.setEditable(false);

		jLabel14.setText("Execute Time:");

		jTA_Schedule_Next.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
		jTA_Schedule_Next.setColumns(20);
		jTA_Schedule_Next.setEditable(false);
		jTA_Schedule_Next.setRows(5);
		jScrollPane1.setViewportView(jTA_Schedule_Next);

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel14).addComponent(jLabel13)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTF_Schedule_Start, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)).addContainerGap()));
		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jTF_Schedule_Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addComponent(jLabel14).addContainerGap(146, Short.MAX_VALUE)).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(jTF_Cron_Second, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTF_Cron_Minute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTF_Cron_Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTF_Cron_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTF_Cron_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6))).addComponent(jTF_Cron_Exp)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jTF_Cron_Week, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_Parse)))).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTF_Cron_Second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTF_Cron_Minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTF_Cron_Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTF_Cron_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTF_Cron_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTF_Cron_Week, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel1)).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel8)).addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTF_Cron_Exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_Parse)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel3.setAlignmentX(0.0F);
		jPanel3.setAlignmentY(0.0F);

		jButton_Copy.setText("Copy Cron Expression");
		jButton_Copy.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton_CopyActionPerformed(evt);
			}
		});

		jButton_Exit.setText("Quit");
		jButton_Exit.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton_ExitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jButton_Copy).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE).addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(261, 261, 261)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton_Copy).addComponent(jButton_Exit)));

		jButton_Make.setText("Generate Cron Expression");
		jButton_Make.setAlignmentY(0.0F);
		jButton_Make.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton_MakeActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addComponent(jButton_Make).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_Make)).addContainerGap()));

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 778) / 2, (screenSize.height - 696) / 2, 778, 696);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton_ExitActionPerformed
		// ????????
		this.dispose();
		System.exit(0);
	}// GEN-LAST:event_jButton_ExitActionPerformed

	private void jButton_ParseActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton_ParseActionPerformed
		try
		{
			if (jTF_Cron_Exp.getText().trim().length() == 0)
			{
				return;
			}

			jTA_Schedule_Next.setText("");
			CronExpressionEx exp = new CronExpressionEx(jTF_Cron_Exp.getText().trim());
			java.util.Date dd = new java.util.Date();
			jTF_Schedule_Start.setText(DateFormatUtil.format("yyyy-MM-dd HH:mm", dd));
			for (int i = 1; i <= 8; i++)
			{
				dd = exp.getNextValidTimeAfter(dd);
				jTA_Schedule_Next.append(i + ": " + DateFormatUtil.format("yyyy-MM-dd HH:mm", dd) + "\n");
				dd = new java.util.Date(dd.getTime() + 1000);
			}

			jTF_Cron_Second.setText(exp.getSecondsExp());
			jTF_Cron_Minute.setText(exp.getMinutesExp());
			jTF_Cron_Hour.setText(exp.getHoursExp());
			jTF_Cron_Day.setText(exp.getDaysOfMonthExp());
			jTF_Cron_Month.setText(exp.getMonthsExp());
			jTF_Cron_Week.setText(exp.getDaysOfWeekExp());

			// ????
			for (JCheckBox cb : jCB_MU_Map.values())
			{
				cb.setSelected(false);
			}
			Set set = exp.getMinutesSet();
			Iterator itr = set.iterator();
			if (set.contains(CronExpressionEx.ALL_SPEC))
			{ // ??'*'
				jRB_MU_Loop.setSelected(true);
				sp_MU_From_Model.setValue(0);
				sp_MU_Every_Model.setValue(1);
			}
			else
			{
				if (jTF_Cron_Minute.getText().contains("/"))
				{
					jRB_MU_Loop.setSelected(true);

					Integer iFrom = (Integer) itr.next();
					Integer iTo = (Integer) itr.next();
					int interval = iTo - iFrom;
					sp_MU_From_Model.setValue(iFrom);
					sp_MU_Every_Model.setValue(interval);
				}
				else
				{
					jRB_MU_Assign.setSelected(true);
					while (itr.hasNext())
					{
						Integer iVal = (Integer) itr.next();
						jCB_MU_Map.get(iVal).setSelected(true);
					}
				}
			}

			// ????
			for (JCheckBox cb : jCB_HH_Map.values())
			{
				cb.setSelected(false);
			}
			set = exp.getHoursSet();
			itr = set.iterator();
			if (set.contains(CronExpressionEx.ALL_SPEC))
			{ // ??'*'
				jRB_HH_Every.setSelected(true);
			}
			else
			{
				jRB_HH_Assign.setSelected(true);

				while (itr.hasNext())
				{
					Integer iVal = (Integer) itr.next();
					jCB_HH_Map.get(iVal).setSelected(true);
				}
			}

			// ??
			for (JCheckBox cb : jCB_DD_Map.values())
			{
				cb.setSelected(false);
			}
			set = exp.getDaysOfMonthSet();
			itr = set.iterator();
			if (set.contains(CronExpressionEx.NO_SPEC_INT))
			{ // ??'?'
				//
			}
			else if (set.contains(CronExpressionEx.ALL_SPEC))
			{ // ??'*'
				jRB_DD_Every.setSelected(true);
			}
			else
			{
				jRB_DD_Assign.setSelected(true);

				while (itr.hasNext())
				{
					Integer iVal = (Integer) itr.next();
					jCB_DD_Map.get(iVal).setSelected(true);
				}
			}

			// ??
			for (JCheckBox cb : jCB_MM_Map.values())
			{
				cb.setSelected(false);
			}
			set = exp.getMonthsSet();
			itr = set.iterator();
			if (set.contains(CronExpressionEx.ALL_SPEC))
			{ // ??'*'
				jRB_MM_Every.setSelected(true);
			}
			else
			{
				jRB_MM_Assign.setSelected(true);

				while (itr.hasNext())
				{
					Integer iVal = (Integer) itr.next();
					jCB_MM_Map.get(iVal).setSelected(true);
				}
			}

			// ????
			for (JCheckBox cb : jCB_WK_Map.values())
			{
				cb.setSelected(false);
			}
			jCB_WK_Use.setSelected(true);
			set = exp.getDaysOfWeekSet();
			itr = set.iterator();
			if (set.contains(CronExpressionEx.NO_SPEC_INT))
			{ // ??'?'
				jCB_WK_Use.setSelected(false);
			}
			else if (set.contains(CronExpressionEx.ALL_SPEC))
			{ // ??'*'
				jCB_WK_Use.setSelected(true);
				jRB_WK_Every.setSelected(true);
			}
			else
			{
				jCB_WK_Use.setSelected(true);
				jRB_WK_Assign.setSelected(true);

				while (itr.hasNext())
				{
					Integer iVal = (Integer) itr.next();
					jCB_WK_Map.get(iVal).setSelected(true);
				}
			}

		} catch (Throwable ex)
		{
			// ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "????Cron??????????????:" + ex);
		}
	}// GEN-LAST:event_jButton_ParseActionPerformed

	private void jButton_CopyActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton_CopyActionPerformed
		// ????Cron??????????????
		jTF_Cron_Exp.selectAll();
		jTF_Cron_Exp.copy();
	}
	

	private void jCB_WK_UseItemStateChanged(java.awt.event.ItemEvent evt)
	{// GEN-FIRST:event_jCB_WK_UseItemStateChanged
		jRB_WK_Every.setEnabled(jCB_WK_Use.isSelected());
		jRB_WK_Assign.setEnabled(jCB_WK_Use.isSelected());

		for (JCheckBox cb : jCB_WK_Map.values())
		{
			cb.setEnabled(jCB_WK_Use.isSelected() && jRB_WK_Assign.isSelected());
		}
	}// GEN-LAST:event_jCB_WK_UseItemStateChanged

	private void jButton_MakeActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton_MakeActionPerformed
		// ????Cron??????
		try
		{
			jTF_Cron_Second.setText("0");

			if (jRB_MU_Loop.isSelected())
			{
				jTF_Cron_Minute.setText(jSP_MU_From.getValue().toString() + "/" + jSP_MU_Every.getValue().toString());
			}
			else
			{
				StringBuilder buf = new StringBuilder();
				boolean first = true;
				for (int key : jCB_MU_Map.keySet())
				{
					JCheckBox cb = jCB_MU_Map.get(key);
					if (cb.isSelected())
					{
						if (!first)
						{
							buf.append(",");
						}
						buf.append(key);
						first = false;
					}
				}
				jTF_Cron_Minute.setText(buf.toString());
				if (jTF_Cron_Minute.getText().length() == 0)
				{
					throw new VerifyError("????????????!");
				}
			}

			if (jRB_HH_Every.isSelected())
			{
				jTF_Cron_Hour.setText("*");
			}
			else
			{
				StringBuilder buf = new StringBuilder();
				boolean first = true;
				for (int key : jCB_HH_Map.keySet())
				{
					JCheckBox cb = jCB_HH_Map.get(key);
					if (cb.isSelected())
					{
						if (!first)
						{
							buf.append(",");
						}
						buf.append(key);
						first = false;
					}
				}
				jTF_Cron_Hour.setText(buf.toString());
				if (jTF_Cron_Hour.getText().length() == 0)
				{
					throw new VerifyError("????????????!");
				}
			}

			if (jCB_WK_Use.isSelected())
			{
				jTF_Cron_Day.setText("?");
				if (jRB_WK_Every.isSelected())
				{
					jTF_Cron_Week.setText("*");
				}
				else
				{
					StringBuilder buf = new StringBuilder();
					boolean first = true;
					for (int key : jCB_WK_Map.keySet())
					{
						JCheckBox cb = jCB_WK_Map.get(key);
						if (cb.isSelected())
						{
							if (!first)
							{
								buf.append(",");
							}
							buf.append(key);
							first = false;
						}
					}
					jTF_Cron_Week.setText(buf.toString());
					if (jTF_Cron_Week.getText().length() == 0)
					{
						throw new VerifyError("????????????!");
					}

				}
			}
			else
			{
				jTF_Cron_Week.setText("?");
				if (jRB_DD_Every.isSelected())
				{
					jTF_Cron_Day.setText("*");
				}
				else
				{
					StringBuilder buf = new StringBuilder();
					boolean first = true;
					for (int key : jCB_DD_Map.keySet())
					{
						JCheckBox cb = jCB_DD_Map.get(key);
						if (cb.isSelected())
						{
							if (!first)
							{
								buf.append(",");
							}
							buf.append(key);
							first = false;
						}
					}
					jTF_Cron_Day.setText(buf.toString());
					if (jTF_Cron_Day.getText().length() == 0)
					{
						throw new VerifyError("??????????!");
					}
				}
			}

			if (jRB_MM_Every.isSelected())
			{
				jTF_Cron_Month.setText("*");
			}
			else
			{
				StringBuilder buf = new StringBuilder();
				boolean first = true;
				for (int key : jCB_MM_Map.keySet())
				{
					JCheckBox cb = jCB_MM_Map.get(key);
					if (cb.isSelected())
					{
						if (!first)
						{
							buf.append(",");
						}
						buf.append(key);
						first = false;
					}
				}
				jTF_Cron_Month.setText(buf.toString());
				if (jTF_Cron_Month.getText().length() == 0)
				{
					throw new VerifyError("????????????!");
				}
			}

			String cronStr = jTF_Cron_Second.getText() + " " + jTF_Cron_Minute.getText() + " " + jTF_Cron_Hour.getText() + " " + jTF_Cron_Day.getText() + " " + jTF_Cron_Month.getText() + " " + jTF_Cron_Week.getText();

			CronExpressionEx exp = new CronExpressionEx(cronStr);
			jTF_Cron_Exp.setText(exp.toString());

			jTA_Schedule_Next.setText("");
			java.util.Date dd = new java.util.Date();
			jTF_Schedule_Start.setText(DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd));
			for (int i = 1; i <= 8; i++)
			{
				dd = exp.getNextValidTimeAfter(dd);
				jTA_Schedule_Next.append(i + ": " + DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd) + "\n");
				dd = new java.util.Date(dd.getTime() + 1000);
			}
		} catch (Throwable ex)
		{
			JOptionPane.showMessageDialog(this, "????Cron??????????????:" + ex);
		}

	}// GEN-LAST:event_jButton_MakeActionPerformed

	public void postInitUI()
	{
		jRB_MU_Loop.addItemListener(_MUItemListener);
		jRB_MU_Assign.addItemListener(_MUItemListener);

		jRB_HH_Every.addItemListener(_HHItemListener);
		jRB_HH_Assign.addItemListener(_HHItemListener);

		jRB_DD_Every.addItemListener(_DDItemListener);
		jRB_DD_Assign.addItemListener(_DDItemListener);

		jRB_MM_Every.addItemListener(_MMItemListener);
		jRB_MM_Assign.addItemListener(_MMItemListener);

		jRB_WK_Every.addItemListener(_WKItemListener);
		jRB_WK_Assign.addItemListener(_WKItemListener);

		jCB_MU_Map.put(0, jCB_MU_0);
		jCB_MU_Map.put(1, jCB_MU_1);
		jCB_MU_Map.put(2, jCB_MU_2);
		jCB_MU_Map.put(3, jCB_MU_3);
		jCB_MU_Map.put(4, jCB_MU_4);
		jCB_MU_Map.put(5, jCB_MU_5);
		jCB_MU_Map.put(6, jCB_MU_6);
		jCB_MU_Map.put(7, jCB_MU_7);
		jCB_MU_Map.put(8, jCB_MU_8);
		jCB_MU_Map.put(9, jCB_MU_9);
		jCB_MU_Map.put(10, jCB_MU_10);
		jCB_MU_Map.put(11, jCB_MU_11);
		jCB_MU_Map.put(12, jCB_MU_12);
		jCB_MU_Map.put(13, jCB_MU_13);
		jCB_MU_Map.put(14, jCB_MU_14);
		jCB_MU_Map.put(15, jCB_MU_15);
		jCB_MU_Map.put(16, jCB_MU_16);
		jCB_MU_Map.put(17, jCB_MU_17);
		jCB_MU_Map.put(18, jCB_MU_18);
		jCB_MU_Map.put(19, jCB_MU_19);
		jCB_MU_Map.put(20, jCB_MU_20);
		jCB_MU_Map.put(21, jCB_MU_21);
		jCB_MU_Map.put(22, jCB_MU_22);
		jCB_MU_Map.put(23, jCB_MU_23);
		jCB_MU_Map.put(24, jCB_MU_24);
		jCB_MU_Map.put(25, jCB_MU_25);
		jCB_MU_Map.put(26, jCB_MU_26);
		jCB_MU_Map.put(27, jCB_MU_27);
		jCB_MU_Map.put(28, jCB_MU_28);
		jCB_MU_Map.put(29, jCB_MU_29);
		jCB_MU_Map.put(30, jCB_MU_30);
		jCB_MU_Map.put(31, jCB_MU_31);
		jCB_MU_Map.put(32, jCB_MU_32);
		jCB_MU_Map.put(33, jCB_MU_33);
		jCB_MU_Map.put(34, jCB_MU_34);
		jCB_MU_Map.put(35, jCB_MU_35);
		jCB_MU_Map.put(36, jCB_MU_36);
		jCB_MU_Map.put(37, jCB_MU_37);
		jCB_MU_Map.put(38, jCB_MU_38);
		jCB_MU_Map.put(39, jCB_MU_39);
		jCB_MU_Map.put(40, jCB_MU_40);
		jCB_MU_Map.put(41, jCB_MU_41);
		jCB_MU_Map.put(42, jCB_MU_42);
		jCB_MU_Map.put(43, jCB_MU_43);
		jCB_MU_Map.put(44, jCB_MU_44);
		jCB_MU_Map.put(45, jCB_MU_45);
		jCB_MU_Map.put(46, jCB_MU_46);
		jCB_MU_Map.put(47, jCB_MU_47);
		jCB_MU_Map.put(48, jCB_MU_48);
		jCB_MU_Map.put(49, jCB_MU_49);
		jCB_MU_Map.put(50, jCB_MU_50);
		jCB_MU_Map.put(51, jCB_MU_51);
		jCB_MU_Map.put(52, jCB_MU_52);
		jCB_MU_Map.put(53, jCB_MU_53);
		jCB_MU_Map.put(54, jCB_MU_54);
		jCB_MU_Map.put(55, jCB_MU_55);
		jCB_MU_Map.put(56, jCB_MU_56);
		jCB_MU_Map.put(57, jCB_MU_57);
		jCB_MU_Map.put(58, jCB_MU_58);
		jCB_MU_Map.put(59, jCB_MU_59);
		for (JCheckBox cb : jCB_MU_Map.values())
		{
			cb.addItemListener(this._checkBoxItemListener);
		}

		jCB_HH_Map.put(0, jCB_HH_0);
		jCB_HH_Map.put(1, jCB_HH_1);
		jCB_HH_Map.put(2, jCB_HH_2);
		jCB_HH_Map.put(3, jCB_HH_3);
		jCB_HH_Map.put(4, jCB_HH_4);
		jCB_HH_Map.put(5, jCB_HH_5);
		jCB_HH_Map.put(6, jCB_HH_6);
		jCB_HH_Map.put(7, jCB_HH_7);
		jCB_HH_Map.put(8, jCB_HH_8);
		jCB_HH_Map.put(9, jCB_HH_9);
		jCB_HH_Map.put(10, jCB_HH_10);
		jCB_HH_Map.put(11, jCB_HH_11);
		jCB_HH_Map.put(12, jCB_HH_12);
		jCB_HH_Map.put(13, jCB_HH_13);
		jCB_HH_Map.put(14, jCB_HH_14);
		jCB_HH_Map.put(15, jCB_HH_15);
		jCB_HH_Map.put(16, jCB_HH_16);
		jCB_HH_Map.put(17, jCB_HH_17);
		jCB_HH_Map.put(18, jCB_HH_18);
		jCB_HH_Map.put(19, jCB_HH_19);
		jCB_HH_Map.put(20, jCB_HH_20);
		jCB_HH_Map.put(21, jCB_HH_21);
		jCB_HH_Map.put(22, jCB_HH_22);
		jCB_HH_Map.put(23, jCB_HH_23);
		for (JCheckBox cb : jCB_HH_Map.values())
		{
			cb.addItemListener(this._checkBoxItemListener);
		}

		jCB_DD_Map.put(1, jCB_DD_1);
		jCB_DD_Map.put(2, jCB_DD_2);
		jCB_DD_Map.put(3, jCB_DD_3);
		jCB_DD_Map.put(4, jCB_DD_4);
		jCB_DD_Map.put(5, jCB_DD_5);
		jCB_DD_Map.put(6, jCB_DD_6);
		jCB_DD_Map.put(7, jCB_DD_7);
		jCB_DD_Map.put(8, jCB_DD_8);
		jCB_DD_Map.put(9, jCB_DD_9);
		jCB_DD_Map.put(10, jCB_DD_10);
		jCB_DD_Map.put(11, jCB_DD_11);
		jCB_DD_Map.put(12, jCB_DD_12);
		jCB_DD_Map.put(13, jCB_DD_13);
		jCB_DD_Map.put(14, jCB_DD_14);
		jCB_DD_Map.put(15, jCB_DD_15);
		jCB_DD_Map.put(16, jCB_DD_16);
		jCB_DD_Map.put(17, jCB_DD_17);
		jCB_DD_Map.put(18, jCB_DD_18);
		jCB_DD_Map.put(19, jCB_DD_19);
		jCB_DD_Map.put(20, jCB_DD_20);
		jCB_DD_Map.put(21, jCB_DD_21);
		jCB_DD_Map.put(22, jCB_DD_22);
		jCB_DD_Map.put(23, jCB_DD_23);
		jCB_DD_Map.put(24, jCB_DD_24);
		jCB_DD_Map.put(25, jCB_DD_25);
		jCB_DD_Map.put(26, jCB_DD_26);
		jCB_DD_Map.put(27, jCB_DD_27);
		jCB_DD_Map.put(28, jCB_DD_28);
		jCB_DD_Map.put(29, jCB_DD_29);
		jCB_DD_Map.put(30, jCB_DD_30);
		jCB_DD_Map.put(31, jCB_DD_31);
		for (JCheckBox cb : jCB_DD_Map.values())
		{
			cb.addItemListener(this._checkBoxItemListener);
		}

		jCB_MM_Map.put(1, jCB_MM_1);
		jCB_MM_Map.put(2, jCB_MM_2);
		jCB_MM_Map.put(3, jCB_MM_3);
		jCB_MM_Map.put(4, jCB_MM_4);
		jCB_MM_Map.put(5, jCB_MM_5);
		jCB_MM_Map.put(6, jCB_MM_6);
		jCB_MM_Map.put(7, jCB_MM_7);
		jCB_MM_Map.put(8, jCB_MM_8);
		jCB_MM_Map.put(9, jCB_MM_9);
		jCB_MM_Map.put(10, jCB_MM_10);
		jCB_MM_Map.put(11, jCB_MM_11);
		jCB_MM_Map.put(12, jCB_MM_12);
		for (JCheckBox cb : jCB_MM_Map.values())
		{
			cb.addItemListener(this._checkBoxItemListener);
		}

		jCB_WK_Map.put(1, jCB_WK_1);
		jCB_WK_Map.put(2, jCB_WK_2);
		jCB_WK_Map.put(3, jCB_WK_3);
		jCB_WK_Map.put(4, jCB_WK_4);
		jCB_WK_Map.put(5, jCB_WK_5);
		jCB_WK_Map.put(6, jCB_WK_6);
		jCB_WK_Map.put(7, jCB_WK_7);
		for (JCheckBox cb : jCB_WK_Map.values())
		{
			cb.addItemListener(this._checkBoxItemListener);
		}

	}

	class MUItemListener implements ItemListener
	{

		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			boolean selected = jRB_MU_Loop.isSelected();
			jSP_MU_From.setEnabled(selected);
			jSP_MU_Every.setEnabled(selected);
			for (JCheckBox cb : jCB_MU_Map.values())
			{
				cb.setEnabled(!selected);
			}
		}
	}

	class HHItemListener implements ItemListener
	{

		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			for (JCheckBox cb : jCB_HH_Map.values())
			{
				cb.setEnabled(!jRB_HH_Every.isSelected());
			}
		}
	}

	class DDItemListener implements ItemListener
	{

		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			for (JCheckBox cb : jCB_DD_Map.values())
			{
				cb.setEnabled(!jRB_DD_Every.isSelected());
			}
		}
	}

	class MMItemListener implements ItemListener
	{

		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			for (JCheckBox cb : jCB_MM_Map.values())
			{
				cb.setEnabled(!jRB_MM_Every.isSelected());
			}
		}
	}

	class WKItemListener implements ItemListener
	{

		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			for (JCheckBox cb : jCB_WK_Map.values())
			{
				cb.setEnabled(!jRB_WK_Every.isSelected());
			}
		}
	}

	class CheckBoxItemListener implements ItemListener
	{
		public void itemStateChanged(java.awt.event.ItemEvent evt)
		{
			JCheckBox checkBox = (JCheckBox) evt.getSource();
			if (checkBox.isSelected())
			{
				checkBox.setForeground(Color.red);
				checkBox.setFont(fontBOLD);
			}
			else
			{
				checkBox.setForeground(Color.black);
				checkBox.setFont(fontPLAIN);
			}
		}
	}

	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.ButtonGroup buttonGroup3;
	private javax.swing.ButtonGroup buttonGroup4;
	private javax.swing.ButtonGroup buttonGroup5;
	private javax.swing.JButton jButton_Copy;
	private javax.swing.JButton jButton_Exit;
	private javax.swing.JButton jButton_Make;
	private javax.swing.JButton jButton_Parse;
	javax.swing.JCheckBox jCB_DD_1;
	javax.swing.JCheckBox jCB_DD_10;
	javax.swing.JCheckBox jCB_DD_11;
	javax.swing.JCheckBox jCB_DD_12;
	javax.swing.JCheckBox jCB_DD_13;
	javax.swing.JCheckBox jCB_DD_14;
	javax.swing.JCheckBox jCB_DD_15;
	javax.swing.JCheckBox jCB_DD_16;
	javax.swing.JCheckBox jCB_DD_17;
	javax.swing.JCheckBox jCB_DD_18;
	javax.swing.JCheckBox jCB_DD_19;
	javax.swing.JCheckBox jCB_DD_2;
	javax.swing.JCheckBox jCB_DD_20;
	javax.swing.JCheckBox jCB_DD_21;
	javax.swing.JCheckBox jCB_DD_22;
	javax.swing.JCheckBox jCB_DD_23;
	javax.swing.JCheckBox jCB_DD_24;
	javax.swing.JCheckBox jCB_DD_25;
	javax.swing.JCheckBox jCB_DD_26;
	javax.swing.JCheckBox jCB_DD_27;
	javax.swing.JCheckBox jCB_DD_28;
	javax.swing.JCheckBox jCB_DD_29;
	javax.swing.JCheckBox jCB_DD_3;
	javax.swing.JCheckBox jCB_DD_30;
	javax.swing.JCheckBox jCB_DD_31;
	javax.swing.JCheckBox jCB_DD_4;
	javax.swing.JCheckBox jCB_DD_5;
	javax.swing.JCheckBox jCB_DD_6;
	javax.swing.JCheckBox jCB_DD_7;
	javax.swing.JCheckBox jCB_DD_8;
	javax.swing.JCheckBox jCB_DD_9;
	javax.swing.JCheckBox jCB_HH_0;
	javax.swing.JCheckBox jCB_HH_1;
	javax.swing.JCheckBox jCB_HH_10;
	javax.swing.JCheckBox jCB_HH_11;
	javax.swing.JCheckBox jCB_HH_12;
	javax.swing.JCheckBox jCB_HH_13;
	javax.swing.JCheckBox jCB_HH_14;
	javax.swing.JCheckBox jCB_HH_15;
	javax.swing.JCheckBox jCB_HH_16;
	javax.swing.JCheckBox jCB_HH_17;
	javax.swing.JCheckBox jCB_HH_18;
	javax.swing.JCheckBox jCB_HH_19;
	javax.swing.JCheckBox jCB_HH_2;
	javax.swing.JCheckBox jCB_HH_20;
	javax.swing.JCheckBox jCB_HH_21;
	javax.swing.JCheckBox jCB_HH_22;
	javax.swing.JCheckBox jCB_HH_23;
	javax.swing.JCheckBox jCB_HH_3;
	javax.swing.JCheckBox jCB_HH_4;
	javax.swing.JCheckBox jCB_HH_5;
	javax.swing.JCheckBox jCB_HH_6;
	javax.swing.JCheckBox jCB_HH_7;
	javax.swing.JCheckBox jCB_HH_8;
	javax.swing.JCheckBox jCB_HH_9;
	javax.swing.JCheckBox jCB_MM_1;
	javax.swing.JCheckBox jCB_MM_10;
	javax.swing.JCheckBox jCB_MM_11;
	javax.swing.JCheckBox jCB_MM_12;
	javax.swing.JCheckBox jCB_MM_2;
	javax.swing.JCheckBox jCB_MM_3;
	javax.swing.JCheckBox jCB_MM_4;
	javax.swing.JCheckBox jCB_MM_5;
	javax.swing.JCheckBox jCB_MM_6;
	javax.swing.JCheckBox jCB_MM_7;
	javax.swing.JCheckBox jCB_MM_8;
	javax.swing.JCheckBox jCB_MM_9;
	private javax.swing.JCheckBox jCB_MU_0;
	private javax.swing.JCheckBox jCB_MU_1;
	private javax.swing.JCheckBox jCB_MU_10;
	private javax.swing.JCheckBox jCB_MU_11;
	private javax.swing.JCheckBox jCB_MU_12;
	private javax.swing.JCheckBox jCB_MU_13;
	private javax.swing.JCheckBox jCB_MU_14;
	private javax.swing.JCheckBox jCB_MU_15;
	private javax.swing.JCheckBox jCB_MU_16;
	private javax.swing.JCheckBox jCB_MU_17;
	private javax.swing.JCheckBox jCB_MU_18;
	private javax.swing.JCheckBox jCB_MU_19;
	private javax.swing.JCheckBox jCB_MU_2;
	private javax.swing.JCheckBox jCB_MU_20;
	private javax.swing.JCheckBox jCB_MU_21;
	private javax.swing.JCheckBox jCB_MU_22;
	private javax.swing.JCheckBox jCB_MU_23;
	private javax.swing.JCheckBox jCB_MU_24;
	private javax.swing.JCheckBox jCB_MU_25;
	private javax.swing.JCheckBox jCB_MU_26;
	private javax.swing.JCheckBox jCB_MU_27;
	private javax.swing.JCheckBox jCB_MU_28;
	private javax.swing.JCheckBox jCB_MU_29;
	private javax.swing.JCheckBox jCB_MU_3;
	private javax.swing.JCheckBox jCB_MU_30;
	private javax.swing.JCheckBox jCB_MU_31;
	private javax.swing.JCheckBox jCB_MU_32;
	private javax.swing.JCheckBox jCB_MU_33;
	private javax.swing.JCheckBox jCB_MU_34;
	private javax.swing.JCheckBox jCB_MU_35;
	private javax.swing.JCheckBox jCB_MU_36;
	private javax.swing.JCheckBox jCB_MU_37;
	private javax.swing.JCheckBox jCB_MU_38;
	private javax.swing.JCheckBox jCB_MU_39;
	private javax.swing.JCheckBox jCB_MU_4;
	private javax.swing.JCheckBox jCB_MU_40;
	private javax.swing.JCheckBox jCB_MU_41;
	private javax.swing.JCheckBox jCB_MU_42;
	private javax.swing.JCheckBox jCB_MU_43;
	private javax.swing.JCheckBox jCB_MU_44;
	private javax.swing.JCheckBox jCB_MU_45;
	private javax.swing.JCheckBox jCB_MU_46;
	private javax.swing.JCheckBox jCB_MU_47;
	private javax.swing.JCheckBox jCB_MU_48;
	private javax.swing.JCheckBox jCB_MU_49;
	private javax.swing.JCheckBox jCB_MU_5;
	private javax.swing.JCheckBox jCB_MU_50;
	private javax.swing.JCheckBox jCB_MU_51;
	private javax.swing.JCheckBox jCB_MU_52;
	private javax.swing.JCheckBox jCB_MU_53;
	private javax.swing.JCheckBox jCB_MU_54;
	private javax.swing.JCheckBox jCB_MU_55;
	private javax.swing.JCheckBox jCB_MU_56;
	private javax.swing.JCheckBox jCB_MU_57;
	private javax.swing.JCheckBox jCB_MU_58;
	private javax.swing.JCheckBox jCB_MU_59;
	private javax.swing.JCheckBox jCB_MU_6;
	private javax.swing.JCheckBox jCB_MU_7;
	private javax.swing.JCheckBox jCB_MU_8;
	private javax.swing.JCheckBox jCB_MU_9;
	javax.swing.JCheckBox jCB_WK_1;
	javax.swing.JCheckBox jCB_WK_2;
	javax.swing.JCheckBox jCB_WK_3;
	javax.swing.JCheckBox jCB_WK_4;
	javax.swing.JCheckBox jCB_WK_5;
	javax.swing.JCheckBox jCB_WK_6;
	javax.swing.JCheckBox jCB_WK_7;
	javax.swing.JCheckBox jCB_WK_Use;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel1_WK;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	javax.swing.JRadioButton jRB_DD_Assign;
	javax.swing.JRadioButton jRB_DD_Every;
	javax.swing.JRadioButton jRB_HH_Assign;
	javax.swing.JRadioButton jRB_HH_Every;
	javax.swing.JRadioButton jRB_MM_Assign;
	javax.swing.JRadioButton jRB_MM_Every;
	private javax.swing.JRadioButton jRB_MU_Assign;
	private javax.swing.JRadioButton jRB_MU_Loop;
	private javax.swing.JRadioButton jRB_WK_Assign;
	private javax.swing.JRadioButton jRB_WK_Every;
	javax.swing.JSpinner jSP_MU_Every;
	javax.swing.JSpinner jSP_MU_From;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTA_Schedule_Next;
	javax.swing.JTextField jTF_Cron_Day;
	private javax.swing.JTextField jTF_Cron_Exp;
	javax.swing.JTextField jTF_Cron_Hour;
	javax.swing.JTextField jTF_Cron_Minute;
	javax.swing.JTextField jTF_Cron_Month;
	javax.swing.JTextField jTF_Cron_Second;
	javax.swing.JTextField jTF_Cron_Week;
	private javax.swing.JTextField jTF_Schedule_Start;
	private javax.swing.JTabbedPane jTabbedPane1;
}
