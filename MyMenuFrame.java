//getting the required libraries that is going to be used in the notepad
import java.io.*;
import java.net.URL;
import javax.swing.*;
import java.util.*;
import java.awt.Font.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;


//MyMenuFrame will use Jframe with actionlistener
public class MyMenuFrame extends JFrame implements ActionListener{

//creating menu items
JMenu menuEdit = new JMenu("Edit");
JMenu menuPrint = new JMenu("Print");
JMenu menuFile = new JMenu("File");
JMenu menuHelp = new JMenu("Help");


//creating the submenu items
JRadioButton subMenuItem1 = new JRadioButton("Times New Roman");
JRadioButton subMenuItem2 = new JRadioButton("Arial");
JRadioButton subMenuItem3 = new JRadioButton("Serif");
JCheckBox subMenuItem4 = new JCheckBox("Bold");
JCheckBox subMenuItem5 = new JCheckBox("Italic");

//provide scrollable view of a component
JScrollPane scrollPane;

//creating notePadArea for notepad to input the text
JTextArea notePadArea;

public MyMenuFrame() {
	super("MyNotepad");//title of the application
	this.setVisible(true);

//setting the border layout for JFrame
this.setSize(600, 400);//setting the width=500 and height=500
this.setLayout(new BorderLayout());
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//it will exit the program when user clicks the close icon in the window of notepad


// create menu bar
JMenuBar menuBar = new JMenuBar();
this.setJMenuBar(menuBar);//adding the menubar to JFrame

// create File menu
menuFile.setMnemonic(KeyEvent.VK_F);//Alt+F
menuBar.add(menuFile);//adding the menufile

// create Open menu
JMenuItem mntmOpen = new JMenuItem("Open");//creating the Open menu
mntmOpen.setMnemonic(KeyEvent.VK_O);//Alt+O command
mntmOpen.setActionCommand("open");//when the command equals to 'open' then the corresponding action will be performed
mntmOpen.setAccelerator(KeyStroke.getKeyStroke('O', KeyEvent.CTRL_DOWN_MASK));//respond when user clicks Ctrl+O
mntmOpen.addActionListener(this);//adding actionLister to the Menu Option Open


// create Save menu
JMenuItem mntmSave = new JMenuItem("Save");//creating the Save menu
mntmSave.setMnemonic(KeyEvent.VK_S);//Alt+S command
mntmSave.setActionCommand("save");//when the command equals to 'save' then the corresponding action will be performed
mntmSave.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.CTRL_DOWN_MASK));//respond when user clicks Ctrl+S
mntmSave.addActionListener(this);//adding actionLister to the Menu Option Save

// create Exit menu
JMenuItem mntmExit = new JMenuItem("Exit");//creating the Exit menu
mntmExit.setMnemonic(KeyEvent.VK_X);//Alt+X command
mntmExit.setActionCommand("exit");//when the command equals to 'exit' then the corresponding action will be performed
mntmExit.setAccelerator(KeyStroke.getKeyStroke('X', KeyEvent.CTRL_DOWN_MASK));//respond when user clicks Ctrl+X
mntmExit.addActionListener(this);//adding actionLister to the Menu Option Exit

// add open, save and exit menu to menu-bar
menuFile.add(mntmOpen);
menuFile.addSeparator();//adding separator between open and save
menuFile.add(mntmSave);
menuFile.addSeparator();//adding separator between save and exit
menuFile.add(mntmExit);

// create Edit menu
menuEdit.setMnemonic(KeyEvent.VK_E);//creating shortcut menu when user press Alt+E
menuBar.add(menuEdit);//adding the Edit to the menubar
JMenu submenu1 = new JMenu("Color");//creating the new menu which comes under Edit
submenu1.setMnemonic(KeyEvent.VK_C);//creating shortcut menu when user press Alt+C
JMenuItem menuItem0 = new JMenuItem("Change Color");//creating submenu item called change color
menuItem0.setAccelerator(KeyStroke.getKeyStroke('C', KeyEvent.CTRL_DOWN_MASK));//it responds when user click Ctrl+C
menuItem0.setActionCommand("color");//setting the command used to call the correcponding action when user click this
menuItem0.addActionListener(this);//adding actionlistener
submenu1.add(menuItem0);//adding this menu item to submenu
menuEdit.add(submenu1);//adding this submenu to editmenu
menuEdit.addSeparator();//creating separator between Color and Font

JMenu submenu = new JMenu("Font");//creating the new menu which comes under Edit
submenu.setMnemonic(KeyEvent.VK_F);//creating shortcut menu when user press Alt+F
subMenuItem1.setMnemonic(KeyEvent.VK_T);//creating shortcut menu when user press Alt+T for Times New Roman
subMenuItem1.setActionCommand("times_new_roman");//setting the command used to call the correcponding action when user click this
subMenuItem1.addActionListener(this);//adding actionlistener
submenu.add(subMenuItem1);//adding to the submenu


subMenuItem2.setMnemonic(KeyEvent.VK_A);//creating shortcut key Alt+A
subMenuItem2.setActionCommand("arial");//respond when the command equals to arial
subMenuItem2.addActionListener(this);//adding action listener
submenu.add(subMenuItem2);//adding it to the submenu

subMenuItem3.setMnemonic(KeyEvent.VK_S);
subMenuItem3.setActionCommand("serif");
subMenuItem3.addActionListener(this);
submenu.add(subMenuItem3);

submenu.addSeparator();

subMenuItem4.setMnemonic(KeyEvent.VK_B);
subMenuItem4.setActionCommand("bold");
subMenuItem4.addActionListener(this);
submenu.add(subMenuItem4);

subMenuItem5.setMnemonic(KeyEvent.VK_I);
subMenuItem5.setActionCommand("italic");
subMenuItem5.addActionListener(this);
submenu.add(subMenuItem5);

menuEdit.add(submenu);


// create Print menu
menuPrint.setMnemonic(KeyEvent.VK_P);
menuBar.add(menuPrint);
JMenuItem menuItemPrint = new JMenuItem("Send To Printer");
menuItemPrint.setAccelerator(KeyStroke.getKeyStroke('P', KeyEvent.CTRL_DOWN_MASK));
menuItemPrint.setActionCommand("print");
menuItemPrint.addActionListener(this);
menuPrint.add(menuItemPrint);


// create Help menu
menuHelp.setMnemonic(KeyEvent.VK_H);
menuBar.add(menuHelp);
JMenuItem menuItemHelp = new JMenuItem("About");
menuItemHelp.setAccelerator(KeyStroke.getKeyStroke('A', KeyEvent.CTRL_DOWN_MASK));
menuItemHelp.setActionCommand("about");
menuItemHelp.addActionListener(this);

JMenuItem menuItemVisitHomePage = new JMenuItem("Visit Home Page");
menuItemVisitHomePage.setAccelerator(KeyStroke.getKeyStroke('V', KeyEvent.CTRL_DOWN_MASK));
menuItemVisitHomePage.setActionCommand("visithomepage");
menuItemVisitHomePage.addActionListener(this);
menuHelp.add(menuItemHelp);

menuHelp.addSeparator();

menuHelp.add(menuItemVisitHomePage);
notePadArea = new JTextArea();


// set no word wrap
notePadArea.setWrapStyleWord(false);


// create scrollable pane
scrollPane = new JScrollPane(notePadArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

this.add(scrollPane,BorderLayout.CENTER);

}


@Override

public void actionPerformed(ActionEvent e) {

if(e.getActionCommand().equals("exit")) {

System.exit(0);

}else if (e.getActionCommand().equals("open")) {

JFileChooser file = new JFileChooser();

String fileName = "";//initial filename was empty

// show open file dialog

if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

fileName = file.getSelectedFile().getAbsolutePath();

} else {

return;

}

try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {

// load file content into text area

StringBuffer stringBuffer = new StringBuffer();//creating a string buffer for reading data from file

String lines = "";//for reading the lines from the selecting file

while((lines = bufferedReader.readLine() ) != null) {//it'll read untill the file ends

stringBuffer.append(lines).append("\n");//for every line read insert new line in stringBuffer

}

bufferedReader.close();//after reading of file done, the bufferedReader will be close

notePadArea.setText(stringBuffer.toString());//converting the read text to string and inserting this text into textArea

} catch (Exception error1) {//if any exception occures

System.out.println(error1.toString());//convert the expection into string and print it

}

} else if (e.getActionCommand().equals("save")) {//if the user click the save command then the file will gonna saved


JFileChooser file = new JFileChooser();//creating the file chooser

String fileName = "";//initial file name is empty

// show open file dialog

if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {//if the user select file and clicks OK button

fileName = file.getSelectedFile().getAbsolutePath();

} else {//other wise will be closed
return;
}

try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));) {


// write editor's content to selected file.
bufferedWriter.write(notePadArea.getText());//get the text entered in textarea
bufferedWriter.flush();//clear the writer
} catch(Exception ex1) {}

} else if (e.getActionCommand().equals("color")) {

	Color select_color = JColorChooser.showDialog(this, "Select a color", Color.RED);
	notePadArea.setForeground(select_color);

} else if (e.getActionCommand().equals("times_new_roman")) {
	if(subMenuItem1.isSelected())
		notePadArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));

} else if (e.getActionCommand().equals("arial")) {
	if(subMenuItem2.isSelected())
		notePadArea.setFont(new Font("Arial", Font.PLAIN, 12));

} else if (e.getActionCommand().equals("serif")) {
	if(subMenuItem3.isSelected())
		notePadArea.setFont(new Font("Serif", Font.PLAIN, 12));

} else if (e.getActionCommand().equals("bold")) {
	if(subMenuItem4.isSelected()){
		if(subMenuItem5.isSelected()){
			notePadArea.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 12));
		}else{
			notePadArea.setFont(new Font("Serif", Font.BOLD, 12));
		}
	}else{
		if(!subMenuItem5.isSelected())
			notePadArea.setFont(new Font("Serif", Font.PLAIN, 12));
	}

} else if (e.getActionCommand().equals("italic")) {

	if(subMenuItem5.isSelected()){
		if(subMenuItem4.isSelected()){
			notePadArea.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 12));
		}else{
			notePadArea.setFont(new Font("Serif", Font.ITALIC, 12));
		}
	}else{
		if(!subMenuItem4.isSelected())
			notePadArea.setFont(new Font("Serif", Font.PLAIN, 12));
	}

} else if (e.getActionCommand().equals("print")) {

int output = JOptionPane.showConfirmDialog(this, "Do you want to print the File","Confirmation", JOptionPane.YES_NO_OPTION);
if(output==0){
	JOptionPane.showMessageDialog(this, "The file is successfully printed","Confirmation", JOptionPane.INFORMATION_MESSAGE);
}
} else if (e.getActionCommand().equals("changecolor")){
	System.out.println("Color clicked");
}
else if (e.getActionCommand().equals("about")) {

	JOptionPane.showMessageDialog(this, "This software is developed in 2019\nVersion is 1.0","About", JOptionPane.INFORMATION_MESSAGE);

} else if (e.getActionCommand().equals("visithomepage")) {

openWebpage("http://www.microsoft.com");

}

}

public static void openWebpage (String urlString) {

try {

	Desktop.getDesktop().browse(new URL(urlString).toURI());

	}

	catch (Exception e) {

	e.printStackTrace();
	}


}
}
