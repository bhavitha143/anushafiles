
public class Anusha {
public static void main(String[] args) {
	
	
	String str="ANusha is #456 @$%% good";
	String regex="[^a-z0-9A-z]";
	String z=str.replaceAll(regex, "");
	System.out.println("after removing special symbols : " +z);
}
}
