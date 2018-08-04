import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validations {
		public static boolean Firstname(String Fname){
			if(Pattern.matches("[a-zA-Z]{1,32}",Fname)){
				return true;
			}
			else{
				System.out.println("The first name should be between 1 to 32 characters");
				return false;
			}
			
		}
		
		public static boolean Lastname(String Lname){
			if(Pattern.matches("[a-zA-Z]{1,32}",Lname)){
				return true;
			}
			else{
				System.out.println("The Last name should be between 1 to 32 characters");
				return false;
			}
		}
		 public static boolean Email(String email)
		    {
			 Pattern emailNamePtrn = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			 Matcher mtch = emailNamePtrn.matcher(email);

			 if(mtch.matches()){
		            return true;
		        }
		        else
		        {
		        	System.out.println("Enter a valid email");
		        	System.out.println(email);
		        	return false;
		        }
		    }
		
		public static boolean Telephone(String phoneno){
			if(Pattern.matches("[7-9]{1}[0-9]{9}",phoneno)){
			return true;
			}
			else{
				System.out.println("The Phone number should be between 10 digits");
				return false;
			}
		}
		
		public static boolean ValidateDesc(String desc){
			if(Pattern.matches("[a-zA-Z0-9]{0,40}",desc)){
				return true;
			}
			else{
				System.out.println("Description can be maximum 40 characters");
				return false;
			}
		}

		public static boolean Password(String pass){
			if(Pattern.matches("[a-zA-Z0-9@#$%]{4,20}",pass)){
				return true;
			}
			else{
				System.out.println("The password should be between 4 to 20 characters");
				return false;
			}
		}
		
		public static boolean Confirmation(String pass ,String ConfPass){
			if(pass.equals(ConfPass))
			{
			return true;
			}
			else
			{
			System.out.println("Password confirmation does not match password!");	
			return false;
			}
			
		}
		
	}


