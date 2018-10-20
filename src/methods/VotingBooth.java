package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String Age = JOptionPane.showInputDialog("how old are you in years?");
int a=Integer.parseInt(Age);
if(a>=18) {
	
JOptionPane.showInputDialog("who is the next president?");	
	
}
else {
JOptionPane.showMessageDialog(null, "nobody cares what YOU think!!!!!!");
}
}

}
