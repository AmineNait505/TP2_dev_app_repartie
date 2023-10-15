package New;

import java.io.Serializable;


public class Operation implements Serializable{
	private int op1;
	private int op2;
	private int result;
	private char operande;
	public Operation(int op1, int op2, char operande) {
		
		this.op1 = op1;
		this.op2 = op2;
		this.operande = operande; //
	}
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public char getOperande() {
		return operande;
	}
	public void setOperande(char operande) {
		this.operande = operande;
	}
	

}
