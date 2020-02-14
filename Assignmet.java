package assignment;

public class Assignmet {
	import java.util.*; public class Main{ public static void main(String []args){ Scanner sc=new Scanner(System.in); String str=sc.nextLine(); int b=UserMainCode.ValidateTime(str); if(b==1){        System.out.println("Valid time"); } else{        System.out.println("Invalid time"); } sc.close(); }} UserMainCode:   import java.text.*; import java.util.*; public class UserMainCode{ public static int ValidateTime(String str){ StringTokenizer st=new StringTokenizer(str,":"); if(st.countTokens()==3) { SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a"); sdf1.setLenient(false); try { Date d2=sdf1.parse(str); return 1; } catch(Exception e) {        return -1; }} else { SimpleDateFormat sdf = new SimpleDateFormat("h:mm a"); sdf.setLenient(false); try { Date d1=sdf.parse(str); return 1; } 
	catch(Exception 
}
