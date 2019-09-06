public class Database {
public static final String DATABASE_URL="jdbc:derby://localhost:1527/workers";
public static final String USERNAME="ezgi";
public static final String PASSWORD="12345";
}
public class Workers {
private int id;
private String firstName;
private String lastName;
private String department;
private double salary;
public Workers(int id, String firstName, String lastName, String department, double salary) {
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.department = department;
this.salary = salary;
}

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}

public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
}

public class LoginScreen extends javax.swing.JFrame {
WorkersOptions options= new WorkersOptions ();
/**
* Creates new form LoginScreen
*/
public LoginScreen() {
initComponents();
}
/**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
usernameTextField = new javax.swing.JTextField();
passwordField = new javax.swing.JPasswordField();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
Message = new javax.swing.JLabel();
loginButton = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); setBounds(new java.awt.Rectangle(400, 200, 0, 0));
jLabel1.setText("User Name:");

jLabel2.setText("Password:");
Message.setForeground(new java.awt.Color(255, 51, 51));
loginButton.setText("Login");
loginButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
loginButtonActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(69, 69, 69)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(76, Short.MAX_VALUE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel2))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(usernameTextField)

.addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
.addGap(132, 132, 132))))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(149, 149, 149))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(90, 90, 90)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel1))
.addGap(31, 31, 31)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel2))
.addGap(49, 49, 49)
.addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(loginButton)
.addContainerGap(48, Short.MAX_VALUE))
);
pack();
}// </editor-fold>

private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
Message.setText("");
String username= usernameTextField.getText();
String password= new String (passwordField.getPassword()); boolean login= options.login(username, password);
if(login) {
WorkersScreen workerscreen= new WorkersScreen (this, true);
setVisible(false);
workerscreen.setVisible(true);
System.exit(0);
}
else {
Message.setText("login is not successfull, try again");
}
}
/**
* @param args the command line arguments
*/
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
java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new LoginScreen().setVisible(true);
}
});
}

// Variables declaration - do not modify
private javax.swing.JLabel Message;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JButton loginButton;
private javax.swing.JPasswordField passwordField;
private javax.swing.JTextField usernameTextField;
// End of variables declaration
}

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class WorkersOptions {
private Connection connection=null;
private Statement statement= null;
private PreparedStatement preparedstatement= null;
public void deleteWorker (int id) {
try {
String query= "delete from worker where WORKERID=?";
preparedstatement= connection.prepareStatement(query);
preparedstatement.setInt(1, id);
preparedstatement.executeUpdate();
} catch (SQLException ex) {
Logger.getLogger(WorkersOptions.class.getName()).log(Level.SEVERE, null, ex);

}
}
public void updateWorker(int id, String myfirstname, String mylastname, String mydepartment, double mysalary) {
String query;
query = "update worker set FIRSTNAME=?, LASTNAME=?, DEPARTMENT= ?, SALARY= ? where WORKERID= ?";
try {
preparedstatement= connection.prepareStatement(query);
preparedstatement.setString(1, myfirstname);
preparedstatement.setString(2, mylastname);
preparedstatement.setString(3, mydepartment);
preparedstatement.setDouble(4, mysalary);
preparedstatement.setInt(5, id);
preparedstatement.executeUpdate();
} catch (SQLException ex) {
Logger.getLogger(WorkersOptions.class.getName()).log(Level.SEVERE, null, ex);
}
}

public boolean login (String username, String password) {
String query= "select * from admin where USERNAME= ? AND PASSWORD= ?";
try {
preparedstatement= connection.prepareStatement(query);
preparedstatement.setString(1, username);
preparedstatement.setString(2, password);
ResultSet rs= preparedstatement.executeQuery();
return rs.next();
} catch (SQLException ex) {
Logger.getLogger(WorkersOptions.class.getName()).log(Level.SEVERE, null, ex);
return false; //exception
}
}
public ArrayList<Workers> viewWorkers () {
try {
ArrayList<Workers> worker= new ArrayList<Workers>();
statement= connection.createStatement();
String query= "select * from worker";
ResultSet rs= statement.executeQuery(query);
while(rs.next()) {

int id= rs.getInt("WORKERID");
String firstname= rs.getString("FIRSTNAME");
String lastname= rs.getString("LASTNAME");
String department= rs.getString("DEPARTMENT");
double salary = rs.getDouble("SALARY");
worker.add(new Workers(id, firstname, lastname, department, salary));
}
return worker;
} catch (SQLException ex) {
Logger.getLogger(WorkersOptions.class.getName()).log(Level.SEVERE, null, ex);
return null; //array list dönme
}
}

public void addWorker (String firstname, String lastname, String department, double salary) {
String query= "insert into WORKER (FIRSTNAME,LASTNAME, DEPARTMENT, SALARY) values (?, ?, ?, ?)";
try {
preparedstatement= connection.prepareStatement(query);
preparedstatement.setString(1, firstname);
preparedstatement.setString(2, lastname);
preparedstatement.setString(3, department);
preparedstatement.setDouble(4, salary);
preparedstatement.executeUpdate();
} catch (SQLException ex) {
Logger.getLogger(WorkersOptions.class.getName()).log(Level.SEVERE, null, ex);
}
}
public WorkersOptions () {
try {
connection= DriverManager.getConnection(Database.DATABASE_URL, Database.USERNAME, Database.PASSWORD);
System.out.println("Connection is successfull");
} catch (SQLException ex) {

System.out.println(ex);
}
}
public static void main(String[] args) {
WorkersOptions deneme= new WorkersOptions ();
}
}
public class WorkersScreen extends javax.swing.JDialog {
DefaultTableModel model;
WorkersOptions options= new WorkersOptions ();
/**
* Creates new form WorkersScreen
*/
public WorkersScreen(java.awt.Frame parent, boolean modal) {
super(parent, modal);
initComponents(); model= (DefaultTableModel)workersTable.getModel(); viewWorkers();
}
/**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
jScrollPane1 = new javax.swing.JScrollPane();
workersTable = new javax.swing.JTable();
searchBar = new javax.swing.JTextField();
jSeparator1 = new javax.swing.JSeparator();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
firstName = new javax.swing.JTextField();
lastName = new javax.swing.JTextField();
department = new javax.swing.JTextField();
salary = new javax.swing.JTextField();
message = new javax.swing.JLabel();
addButton = new javax.swing.JButton();
updateButton = new javax.swing.JButton();
deleteButton = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
workersTable.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {
},
new String [] {
"ID", "First Name", "Last Name", "Department", "Salary"
}
) {

boolean[] canEdit = new boolean [] {
false, false, false, false, true
};
public boolean isCellEditable(int rowIndex, int columnIndex) {
return canEdit [columnIndex];
}
});
workersTable.addMouseListener(new java.awt.event.MouseAdapter() {
public void mouseClicked(java.awt.event.MouseEvent evt) {
workersTableMouseClicked(evt);
}
});
jScrollPane1.setViewportView(workersTable);
if (workersTable.getColumnModel().getColumnCount() > 0) {
workersTable.getColumnModel().getColumn(0).setResizable(false);
workersTable.getColumnModel().getColumn(1).setResizable(false);
workersTable.getColumnModel().getColumn(2).setResizable(false);
workersTable.getColumnModel().getColumn(3).setResizable(false);
workersTable.getColumnModel().getColumn(4).setResizable(false);
}
searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
public void keyReleased(java.awt.event.KeyEvent evt) {
searchBarKeyReleased(evt);
}
});
jLabel1.setText("First Name:");
jLabel2.setText("Last Name:");

jLabel3.setText("Department:");
jLabel4.setText("Salary:");
message.setForeground(new java.awt.Color(255, 0, 51));
addButton.setText("Add Worker");
addButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
addButtonActionPerformed(evt);
}
});
updateButton.setText("Update Worker");
updateButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
updateButtonActionPerformed(evt);
}
});
deleteButton.setText("Delete Worker");
deleteButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
deleteButtonActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(

layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(54, 54, 54)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jSeparator1)
.addComponent(searchBar)
.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
.addGap(44, 44, 44))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addComponent(message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel4)
.addComponent(jLabel3)
.addComponent(jLabel2))
.addGap(42, 42, 42)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
.addComponent(lastName)
.addComponent(department)
.addComponent(salary))))
.addGap(141, 141, 141)

.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGap(23, 23, 23)
.addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(addButton))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(updateButton))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)

.addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(deleteButton))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(message)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(42, 42, 42))
);
pack();
}// </editor-fold>
public void dynamicSearch (String search) {
TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
workersTable.setRowSorter(tr);
tr.setRowFilter(RowFilter.regexFilter(search));
}
private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {
String search= searchBar.getText();
dynamicSearch(search);

}
private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
message.setText("");
String firstname= firstName.getText();
String lastname= lastName.getText();
String mydepartment= department.getText();
double mysalary= Double.parseDouble(salary.getText());
options.addWorker(firstname, lastname, mydepartment, mysalary);
viewWorkers();
message.setText("new worker is successfully added");
}
private void workersTableMouseClicked(java.awt.event.MouseEvent evt) {
int selectedRow= workersTable.getSelectedRow();
firstName.setText(model.getValueAt(selectedRow, 1).toString());
lastName.setText(model.getValueAt(selectedRow, 2).toString());
department.setText(model.getValueAt(selectedRow, 3).toString());
salary.setText(model.getValueAt(selectedRow, 4).toString());
}

private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
String myfirstname= firstName.getText();
String mylastname= lastName.getText();
String mydepartment= department.getText();
double mysalary= Double.parseDouble(salary.getText());
int selectedrow= workersTable.getSelectedRow();
if (selectedrow==-1) {
if (model.getRowCount() ==0) {
message.setText("table is blank");
}
else {
message.setText("please select a row to update");
}
}
else {
int id= (int) model.getValueAt(selectedrow, 0);
options.updateWorker(id, myfirstname, mylastname, mydepartment, mysalary);
viewWorkers();
message.setText("worker is updated");
}
}

private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
message.setText("");
int selectedRow= workersTable.getSelectedRow();
if (selectedRow == -1) {
if (model.getRowCount() ==0) {
message.setText("table is blank");
}
else {
message.setText("select a worker to delete");
}
}
else {
int id= (int) model.getValueAt(selectedRow, 0);
options.deleteWorker(id);
viewWorkers();
message.setText("worker is deleted");
}
}

public void viewWorkers () {
model.setRowCount(0); //tablo boşalacak
ArrayList<Workers> workers= new ArrayList <Workers> ();
workers= options.viewWorkers();
if(workers!= null) {
for(Workers worker: workers) {
Object [] addworker= {worker.getId(), worker.getFirstName(),
worker.getLastName(), worker.getDepartment(), worker.getSalary()};
model.addRow(addworker);
}
}
}

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
java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
/* Create and display the dialog */
java.awt.EventQueue.invokeLater(new Runnable() {

public void run() {
WorkersScreen dialog = new WorkersScreen(new javax.swing.JFrame(), true);
dialog.addWindowListener(new java.awt.event.WindowAdapter() {
@Override
public void windowClosing(java.awt.event.WindowEvent e) {
System.exit(0);
}
});
dialog.setVisible(true);
}
});
}
// Variables declaration - do not modify
private javax.swing.JButton addButton;
private javax.swing.JButton deleteButton;
private javax.swing.JTextField department;
private javax.swing.JTextField firstName;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JSeparator jSeparator1;
private javax.swing.JTextField lastName;
private javax.swing.JLabel message;
private javax.swing.JTextField salary;
private javax.swing.JTextField searchBar;
private javax.swing.JButton updateButton;
private javax.swing.JTable workersTable;
// End of variables declaration
}