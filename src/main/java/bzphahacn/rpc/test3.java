package bzphahacn.rpc;

public class test3 {
	public static void main(String[] args){
		int hang = 5;
		for(int n = 0;n<hang/2;n++){
			for(int i = 0;i<(4-2*n);i++){
				System.out.print(" ");
			}
			for(int j = 0;j<(4*n+2);j++){
				System.out.print("*");
			}
			for(int i = 0;i<(4-2*n);i++){
				System.out.print(" ");
			}
			System.out.println();
		}
		//2
		for(int n1 = hang/2;n1>=0;n1--){
			for(int i = 0;i<(4-2*n1);i++){
				System.out.print(" ");
			}
			for(int j = 0;j<(4*n1+2);j++){
				System.out.print("*");
			}
			for(int i = 0;i<(4-2*n1);i++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		/*for(int n = 0;n<hang;n++){
			
		}*/
	}
}
